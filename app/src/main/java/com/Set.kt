package com

fun main(){
    //Contain only unique element not any duplicate
    //Sets are not ordered unlike array and list
    //By default the set is of type Immutable
    val mySet = setOf<Int>(1,2,3,4,5,5)
    val myMutableSet = mutableSetOf<Int>(1,2,4,4,9,7,2)
    for (number in mySet){
        println(number)
    }
    myMutableSet.remove(1)
    myMutableSet.clear()

}