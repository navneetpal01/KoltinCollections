package com

fun main(){
    //ArrayList has the both features of the Array and the List
    //We have the faster access time like we have in the array
    //And it's mutable like List
    val namesList = arrayListOf<Int>(1,2,3,4,5,6)
    for (numbers in namesList){
        println(numbers)
    }
    val newNumberList = arrayListOf<Int>(7,8,9,10)
    namesList.addAll(newNumberList)
    namesList.add(7)
    namesList.removeAt(2)
    namesList.remove(2)
}