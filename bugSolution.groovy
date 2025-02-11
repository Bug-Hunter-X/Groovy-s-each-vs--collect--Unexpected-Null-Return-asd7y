def myList = [1, 2, 3, 4, 5]

// Correctly use collect to get a modified list
def doubledList = myList.collect { it * 2 }
println doubledList // Output: [2, 4, 6, 8, 10]

//Alternative solution using each with a new list
def doubledList2 = []
myList.each { doubledList2 << it * 2 }
println doubledList2 // Output: [2, 4, 6, 8, 10]