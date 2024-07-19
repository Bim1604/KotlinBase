package com.example.kotlin_basic

import kotlin.reflect.KProperty

fun demoDelegates () {
    // ủy quyền function cho đối tượng khác sử dụng
    var hung = Hung(Hoa(), Tri())

    hung.sbd = "huhu2"

    println(hung.sbd)

    hung.myTask()
}

interface ITStudent {
    fun learnProgramming()
}

interface marketingStudent {
    fun learnMarketing()
}

class Hoa : ITStudent {

    var sbd = ""

    override fun learnProgramming() {
        println("learnProgramming")
    }

    operator fun getValue(thisRef: Any?, property: KProperty<*>): String {
//        return "$thisRef, thank u for delegating '${property.name}' to me"
        return sbd
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, s: String) {
        println("$thisRef, thank u for delegating '${property.name}' to me")
        sbd = s
    }


}

class Tri : marketingStudent {
    override fun learnMarketing() {
        println("learnMarketing")
    }
}

class Hung(itFriendHoa: Hoa, marketingFriend: Tri) : ITStudent by itFriendHoa, marketingStudent by marketingFriend {

     var sbd: String by Hoa()

    fun myTask(){
        learnProgramming()
        learnMarketing()
    }
}