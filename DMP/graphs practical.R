# making an edges variable
edges = c('A','B','A','C','A','D','B','C','C','D','C','E','D','E');

# using igraph to create a graph
g = make_graph(edges, directed = FALSE)

# assigning weights to each edge (order has to be same as that of edges)
weight = c(3,4,5,6,7,9,8)
E(g)$WEIGHT = weight

# plotting the graph
plot(g, edge.label= E(g)$WEIGHT)

# creating an adjacency matrix
adjacentMartix = matrix(c(0,3,4,5,0,3,0,6,0,0,4,6,0,7,9,5,0,7,0,8,0,0,9,8,0), nrow = 5, byrow = TRUE)

ag = graph_from_adjacency_matrix(adjacentMartix,mode = 'undirected', weighted = TRUE)

E(ag)$label = c(3,4,5,6,7,9,8)
V(ag)$name = c('A','B','C','D','E')
plot(ag)

min_span_tree = mst(ag, algorithm = 'prim')
plot(min_span_tree)


city_adj_matrix = matrix(c(0,150,50,300,50,150,0,130,300,50,50,130,0,500,60,300,300,500,0,305,50,50,60,305,0), nrow = 5, byrow = TRUE)
city_adj_matrix

city_adj_graph = graph_from_adjacency_matrix(city_adj_matrix, mode = 'UNDIRECTED', weighted = TRUE)

plot(city_adj_graph)
V(city_adj_graph)$name = c('mumbai','pune','thane','nagpur','panvel')
E(city_adj_graph)$label =c(150,50,300,50,130,300,50,300,60,305)

city_graph_mst = mst(city_adj_graph, algorithm='prim')

+-*