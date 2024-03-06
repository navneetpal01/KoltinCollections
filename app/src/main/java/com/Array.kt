package com

fun main() {
//    val students = arrayOf("Eva","Victoria","Tay","Orange")
//    println(students[0])
//    println(students[1])
//    println(students[2])

//    val numbers = arrayOf(1,2,3,4,5)
//    val emptyIntArray = Array<Int>(10){0}
//    println(emptyIntArray.joinToString())
//    println(numbers.joinToString())
//    println(numbers.contentToString())
//    for (i in numbers){
//        println("$i")
//    }
//    numbers[0] = 10
//    numbers[1] = 20
//    println(numbers.joinToString())
//    //So we can't increase the Size of a Array which is already bean declared
//    //So how we will insert
//    val index = 2
//    val value = 30
//    val newArray = Array<Int>(numbers.size + 1){i ->
//        if (i < index){
//            numbers[i]
//        }else if (i == index){
//            value
//        }else{
//            numbers[i-1]
//        }
//    }
//    println(newArray.contentToString())
//
//    val myDoubleArray = arrayOf(1.0,2.0,3.0,4.0,5.0)
//    println(myDoubleArray.joinToString())
//

    //Linear Search
//    val myArray = arrayOf(1,2,3,4,5,6)
//    val key = 2
//    var found = false
//    for (i in myArray.indices){
//        if (myArray[i] == key){
//            println("Element Exist at index $i")
//            found = true
//            break
//        }
//        if (!found){
//            println("Element is not found in the array")
//        }
//    }

    //Binary Search
    val myArray = arrayOf(1, 2, 3, 4, 5, 6)
    var s = 0
    var e = (myArray.size) - 1
    var found = false
    val key = 5

    while (s <= e) {
        val mid = (s + e) / 2
        if (key == myArray[mid]) {
            println("Element exist at location $mid")
            found = true
            break
        } else if (key < myArray[mid]) {
            if (key < myArray[mid]) {
                e = mid - 1
            }
        } else {
            s = mid + 1
        }
    }
    if (!found){
        println("Element doesn't exist")
    }
}