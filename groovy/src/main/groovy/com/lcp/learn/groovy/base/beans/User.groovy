package com.lcp.learn.groovy.base.beans

import com.google.common.base.MoreObjects

/**
 * desc:    <br/>
 * @since 2021/8/30-12:03
 * @author lichunpeng
 */
class User implements Serializable {

    String name
    int age

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    int getAge() {
        return age
    }

    void setAge(int age) {
        this.age = age
    }

    boolean equals(o) {
        if (this.is(o)) return true
        if (!(o instanceof User)) return false

        User user = (User) o

        if (age != user.age) return false
        if (name != user.name) return false

        return true
    }

    int hashCode() {
        int result
        result = (name != null ? name.hashCode() : 0)
        result = 31 * result + age
        return result
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("name", name)
                .add("age", age)
                .toString();
    }
}