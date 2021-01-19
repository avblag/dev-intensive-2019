package ru.skillbranch.devintensive

import org.junit.Test

import org.junit.Assert.*
import ru.skillbranch.devintensive.models.User

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun test_task_1() {
        val user = User.makeUser("John Cena")
        print("$user \n")
        val user2 = User.makeUser("John Wick")
        print("$user2 \n")
        val user3 = User.makeUser("John")
        print("$user3 \n")
    }


}