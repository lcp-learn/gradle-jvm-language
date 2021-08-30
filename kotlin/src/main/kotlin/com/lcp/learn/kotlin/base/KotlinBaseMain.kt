package com.lcp.learn.kotlin.base;

/**
 * desc:    <br/>
 * @since   2021/8/30-12:14
 * @author  lichunpeng
 */

import com.lcp.learn.kotlin.base.beans.User
import java.util.*

/**
 * desc:    <br/>
 * @since   2021/2/19-13:55
 * @author  lichunpeng
 */

//Main函数
fun main(args: Array<String>) {
    //打印 Hello world
    println("Hello World!")

    val aa = 991
    println(aa)

    val arr1 = arrayOf("122", "244", "553")

    Arrays.stream(arr1).forEach { item: String -> println(item) }

//    val user1 = User(name = "lcp", age = 111)
    val user1 = User("lcp", 222)
    user1.name = "wer"
    println(user1.toString())
    user1.address = "zxzxczxc"
    println(user1.toString())


}