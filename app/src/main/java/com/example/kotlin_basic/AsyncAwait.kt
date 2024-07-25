package com.example.kotlin_basic

import kotlinx.coroutines.*

fun demoAsync () {
    // 1. coroutines
    // 2. suspend function
//    demoLaunch2()

    GlobalScope.launch {
        var result = demoAsyncSuspend() // suspend function chỉ được gọi trong coroutines hoặc suspend fun khác
        println(result)
    }
    Thread.sleep(4000L) // nếu k sleep thì sẽ chạy quét qua và sau 2s mới trả kqua nên k kịp
}

fun demoLaunch1 () {
    GlobalScope.launch {
        withContext(Dispatchers.IO) { // Xử lý tác vụ ở thread IO

        }
    }
    GlobalScope.launch(Dispatchers.Main) { // Xử lý tác vụ ở Main THread - Thường là UI
        delay(1000L)
        println("World !")
    }
    println("Hello,")
    Thread.sleep(2000L)
}

fun demoLaunch2 () {
    GlobalScope.launch { // sử dụng khi không quan tâm kqua trả về
        println("start job")
        var res1 =  async { // quan tâm kqua trả về
            callHttp()
        }
        var res2 = async {
            callHttp()
        }

        println("End job")
        println("${res1.await()} | ${res2.await()}")

    }
}

fun callHttp() : Int {
    Thread.sleep(2000)
    return 200
}

suspend fun demoAsyncSuspend () : Int {
    val result = GlobalScope.async {
        callHttp()
    }
    return result.await()
}

val handler = CoroutineExceptionHandler {
    _, exp -> println("ERR: ${exp.toString()}")
}

fun fucWithException() : Nothing {
    throw Exception("Lỗi rồi")
}

fun funcWithExceptionAsync () : Int {
    return 10 / (0..1).random()
}

fun demo3() {
    GlobalScope.launch(handler) {
        fucWithException()
    }
}

fun demo4() {
    GlobalScope.launch() {
        async {
            try {
                funcWithExceptionAsync()
            } catch (e : Exception) {
                print(e.toString())
            }
        }
    }
}