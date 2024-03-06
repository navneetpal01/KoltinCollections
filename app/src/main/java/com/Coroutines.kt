package com

import android.provider.Settings.Global
import kotlinx.coroutines.Deferred
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.concurrent.thread

//How Thread works ??
//TODO ->[ Main Thread ] supports Small Operations , Ui Interaction , Button Click , Mathematical Operations , Small Logical Operations
//TODO ->[ Background Thread or Worker Thread ] supports Network Operations , File Download , Image Loading , Database Queries
//But there is a limit on number of background thread that could be created at a time because creating thread is very very expensive
//So creating many main threads is a bad idea So what is the Solution ?
//Here comes the Coroutines
//when you create Coroutines you don't need so many threads instead you need -
//TODO -> Background Thread 1
//Coroutines are the light weight threads
//Like threads,coroutines can run in parallel, wait for each other, and communicate with each other
// Coroutine != Thread
//Coroutines are very very cheap - almost free.Create thousands of them without any memory issue "Best for modern applications".



//  fun main(){ //Executes in the main Thread
    //TODO -> Thread
//    println("Main program starts: ${Thread.currentThread().name}")
//
//    thread { // creates a background thread (worker thread)
//        println("Fake work starts: ${Thread.currentThread().name}")
//        Thread.sleep(1000)
//        println("Fake work finished: ${Thread.currentThread().name}")
//    }
//
//    println("Main program ends: ${Thread.currentThread().name}")

    //TODO -> Coroutine: GlobalScope Launch
//    println("Main program starts: ${Thread.currentThread().name}")
//
//    //Unlike threads, for coroutines the application by default does not wait for it to finish its execution
//    GlobalScope.launch { // creates a background coroutine that runs on a background thread
//        println("Fake work starts: ${Thread.currentThread().name}")
//        delay(1000) //Coroutine is suspended but Thread: T1 is free (not blocked)
//        println("Fake work finished: ${Thread.currentThread().name}")
//    }
//
//    runBlocking {//Creates a coroutine that blocks the current main thread
//        mySuspendFun(1000) //wait for coroutine to finish (practically not a right way to wait)
//    }
//
//    println("Main program ends: ${Thread.currentThread().name}")
//
//
//
//}
//
//suspend fun mySuspendFun(time : Long){
//    //Code..
//    delay(time)
//}

//TODO -> Coroutine Builders launch , async , runBlocking
//TODO -> GlobalScope.launch{ } //Creates coroutines at global (app) level
//Global Coroutines are top-level coroutines and can survive the entire life of the application
fun main(){
    //Creates coroutines at global (app) level
    GlobalScope.launch {
        //File Download
        //Play Music
    }
    //Creates a Coroutine at local scope
//    launch{
//        //Some data Computation
          //Login operation
//    }
//    runBlocking{
//        //Also known as Fire and Forget
//        val job : Job = launch {
//            println("Fake work starts: ${Thread.currentThread().name}")
//            delay(100)
//            println("Fake work finished: ${Thread.currentThread().name}")
//        }
//        job.join()
//        println("Main program ends: ${Thread.currentThread().name}")
//    }
    runBlocking {
        println("Main program starts: ${Thread.currentThread().name}")
        val jobDeferred : Deferred<String> = async {
            println("Fake work starts: ${Thread.currentThread().name}")
            delay(100)
            println("Fake work finished: ${Thread.currentThread().name}")
            "Navneet Pal"
        }
        val name : String = jobDeferred.await()
        println("Main program ends : ${Thread.currentThread().name}")

    }

}

