package com

fun main(){

    val numberList = listOf<Int>(1,2,3,4,5,6)
    var mutableNumberList = mutableListOf<Int>(1,2,3,4,5,6)
    mutableNumberList.add(5)
    for (i in mutableNumberList){
        println(i)
    }

    //How a list differ from array
    //Array has a fixed size but list can be Expended
    val newList = listOf(1,2,3,4,5)
    mutableNumberList.addAll(newList)
    mutableNumberList.remove(1)
    mutableNumberList.removeAt(0)
    mutableNumberList.add(7)
}