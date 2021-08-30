package com.lcp.learn.groovy.base

import com.lcp.learn.groovy.base.beans.User

/**
 * desc:    <br/>
 * @since 2021/8/30-12:01
 * @author lichunpeng
 */
class BaseMain {

    static void main(String[] args) {

        def aa = 99
        def bb = "adsasd"

        def user1 = new User()
        user1.name = "lcp"
        user1.age = 997

        println aa + "hello"
        println bb.class.name
        println user1.toString()

    }

}
