def myList = [1, 2, 3, 4, 5]

println myList.each { it * 2 } //This will print null

println myList.collect { it * 2 } //This will print the correct result [2, 4, 6, 8, 10]