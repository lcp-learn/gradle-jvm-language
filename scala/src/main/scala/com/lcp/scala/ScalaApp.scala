package com.lcp.scala

import com.alibaba.fastjson.JSON
import com.lcp.bean.User

/**
 * desc:    <br/>
 *
 * @since 2021/7/26-10:50
 * @author lichunpeng
 */
object ScalaApp {

  def main(args: Array[String]): Unit = {
    println(greeting())

    val aa = 987
    val qw = 45 + aa
    val name = "lcp"

    val user = new User()
    user.setAge(qw)
    user.setName(name)
    val jsonValue = JSON.toJSONString(user)

    println(s"user:$jsonValue")

  }

  def greeting(): String = "Hello, world!"
}
