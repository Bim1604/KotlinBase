// Covariance vs Contravariance

package com.example.kotlin_basic

fun generic () { // Tính tái sử dụng cao
    val code4Func = Code4FunRepo<X>()
    code4Func.insert(X())
    val code4Func1 = Code4FunRepo<Y>()
    code4Func1.insert(Y())

    val x = createInstance(X())
    val y = createInstance(Y())
    println(x.toString()) // X(name=XXX)
    println(y.toString()) // Y(name=123)

    // Covariance
    var listA: List<A> = listOf()
    var listB: List<B> = listOf() // keyword <out E> gán được cha = con chứ k gán được con = cha

//    listB = listA // con != cha
    listA = listB // cha = con

    // Contravariance Nếu chỉ muốn đọc thông tin thì sử dụng Covariance còn nếu muốn modify thì dùng Contravariance
    var b : Production<B> = object: Production<B> {
        override fun getProduction(type: B): Any {
            return B()
        }
    }

    var a : Production<A> = object: Production<A> {
        override fun getProduction(type: A): Any {
            return A()
        }
    }
//    a = b // k thể gán cha = con, chỉ gán được con = cha ngược với Covariance
}

interface Production<in T> {
    fun getProduction(type : T) : Any
}

open class A() {}
class B : A() {}

// T = Type, E = Element, R = Return
class Code4FunRepo<T> {
    fun insert(rc: T) {
        print("insert ${rc.toString()} ok")
    }
}

fun <T>createInstance(o : T) : T {
    return o
}

data class X (val name: String = "XXXX")
data class Y (val name: String = "123")