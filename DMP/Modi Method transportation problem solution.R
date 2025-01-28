cost_matrix = matrix(c(20,28,32,55,70,48,36,40,44,25,35,55,22,45,48), nrow = 3, ncol = 5, byrow = 1)
supply = c(50,100,150)
demand = c(100,70,50,40,40)
rowSigns = c("=","=","=")
colSigns = c("=","=","=","=","=")

result = lp.transport(
  cost.mat = cost_matrix, 
  direction = "min", 
  row.signs = rowSigns, 
  row.rhs = supply, 
  col.signs = colSigns, 
  col.rhs = demand)

result$objval