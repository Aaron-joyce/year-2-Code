dataSet = iris
testData = dataSet[149:150, 0:4]w
testData
model = naiveBayes(Species~., dataSet)


predict(model, testData)
