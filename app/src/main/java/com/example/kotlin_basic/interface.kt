package com.example.kotlin_basic

fun InterfaceClass () {
    var user = UserRepoImpl()
    user.saveUser(User())
    user.selectUserById("2")
}

class User{}

interface IUserRepo {
    var ageDefault: Int

    fun saveUser(user: User)
    fun selectUserById(userId: String) {
        println("Call from Interface")
    }
}

class UserRepoImpl : IUserRepo, i1, i2 {
    override var ageDefault: Int = 18

    override fun saveUser(user: User) {
        print("saveUser")
    }

    override fun functionI1() {
        println("FunctionI1 from class")
    }
}

interface i1{
    fun functionI1()
}
interface i2{}