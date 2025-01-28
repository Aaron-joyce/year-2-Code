sources = 4
destination = 4
supply = c(200,400,700, 600)
demand = c(300,600, 500,500)

result = matrix(0,destination, sources)

"""if(sum(supply)!=sum(demand)){
  print("demand not equal to supply")
} else{
  print("Calculating north west method")
  
  i=1
  j=1
  iterator = 0
  while(iterator <=6){
    if(supply[i] > demand[j]){
      result[i,j] = demand[j]
      supply[i] = supply[i] - demand[j]
      demand[j] = 0
      j = j+1
    } else if(demand[j] > supply[i]){
      result[i,j] = supply[i]
      demand[j] = demand[j] - supply[i]
      supply[i] = 0
      i = i+1
    } else{
      result[i,j] = demand[j]
      supply[i]= 0
      demand[j]= 0
      i = i+1
      j = j+1
    }
    iterator = iterator+1
  }
  print(result)
}"""
