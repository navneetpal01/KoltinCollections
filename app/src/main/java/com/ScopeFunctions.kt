package com

//TODO -> with Function Explanation
//class Person{
//    val name : String = "Navneet"
//    val age : Int = 17
// }
//fun main(){
//    Property 1: Refer to context object by using this
//    Property 2: The return value is the lambda result
//    val person = Person()
//    println(person.name)
//    println(person.age)
//
//    with(person){
//        println(this.name)
//        println(this.age)
//    }
//    val ageAfterFiveYears : Int = with(person){
//        println(this.name)
//        println(this.age)
//        age + 5//This value will be returned by the lambda Function
//
//    }
//    println(ageAfterFiveYears)
//
//}

//TODO -> apply Function Explanation
//class Person {
//    var name: String = ""
//    var age: Int = 0
//}
//
//fun main() {
//    /** Scope Function : 'apply'
//     * Property 1: Refer to context object by using 'this'
//     * Property 2: The return value is the 'context object'
//     */
//    val person = Person()
//    person.name = "Navneet Pal"
//    person.age = 17
//    Instead of using this we can use
//    val person = Person().apply {
//        name = "Navneet Pal"
//        this.age = 17
//    }
//    val returnCheck = with(person){
//        println(name)
//        println(age)
//    }
//    println(returnCheck)
//}

//TODO -> also Function Explanation
//fun main() {
//    /** Scope Function: 'also'
//     * Property 1: Refer to context object by using 'it'
//     * Property 2: The return value is the 'context Object'
//     * Perform some additional operations on an object.
//     */
//
//    val numberList: MutableList<Int> = mutableListOf(1, 2, 3)
//    Operations on the Number List
//    println("The list elements are: $numberList")
//    numberList.add(4)
//    println("The list elements after adding an element: $numberList")
//
//    numberList.remove(2)
//    println("The list elements after removing an element: $numberList")
//    val duplicateNumbers = numberList.also {
//        println("The list elements are: $it")
//        it.add(4)
//        println("The list elements after adding an element: $it")
//
//        it.remove(2)
//        println("The list elements after removing an element: $it")
//    }
//}

//TODO -> let Function Explanation with ?. save call operator
//fun main(){
//    /** Scope Function: 'Let'
//     * Property 1: Refer to context object by using 'it'
//     * Property 2: The return value is the 'Lambda result '
//     */
//    //Use 'let' function to avoid NullPointerException
//    val name : String? = "Hello"
//    name?.let {
//        println(it.reversed())
//        println(it.capitalize())
//    }
//
//    val nameLength = name?.let {
//        it.length
//    }
//    println(nameLength)
//}

//TODO -> run Function Explanation
class Person {
    var name : String = "Navneet Pal"
    var age : Int = 26
}
fun main(){
    /** Scope Function: 'run'...
     * Property 1: Refer to context object by using 'this'
     * Property 2: The return value is the 'lambda result'
     * 'run' is combination of 'with' and 'let'
     * If you want to operate on a nullable object and avoid NullPointerException then use 'run'
     */

    val person : Person? = null
    val bio  = person?.run {
        println(name)
        println(age)
        age + 5
        "He is a freak who loves to teach in his own way"

    }
}


/** TODO Summery
 * with -> if you want to operate on a non null object //Returns Lambda
 * let -> if you want to just execute lambda expression on a nullable object and avoid NullPointerException //Returns Lambda
 * run -> if you want to operate on a nullable object,execute lambda expression and avoid NullPointerException //Returns Lambda
 * apply -> If you want to initialise or configure an object //Returns object
 * also -> if you want to do some additional object configuration or operations //Returns object
 */












