package com.lcp.learn.kotlin.base.beans

/**
 * desc:    <br/>
 * @since   2021/8/30-12:12
 * @author  lichunpeng
 */
class User(var name: String, var age: Int) {

    var address: String = ""

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is User) return false

        if (name != other.name) return false
        if (age != other.age) return false
        if (address != other.address) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        result = 31 * result + address.hashCode()
        return result
    }

    override fun toString(): String {
        return "User(name='$name', age=$age, address='$address')"
    }


}