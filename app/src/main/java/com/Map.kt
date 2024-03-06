package com

fun main(){
    //Mapping these values to it's corresponding map Element
    //Eg - key is the Alice which is used for storing the value 35
    //By default maps are also immutable
    val ages = mapOf("Alice" to 35,"Bob" to 25,"Charlie" to 56)
    val mutableMapAges = mutableMapOf("Alice" to 35,"Bob" to 25,"Charlie" to 56)
    println(mutableMapAges["Alice"])
    for ((name , age) in mutableMapAges){
        println("$name is of $age")
    }
    mutableMapAges["Alice"] = 36
    println(mutableMapAges["Alice"])
    mutableMapAges.put("Navneet Pal" ,17)
    mutableMapAges.remove("Alice")
    mutableMapAges.clear()
}