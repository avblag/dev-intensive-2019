package ru.skillbranch.devintensive

import org.junit.Test

import org.junit.Assert.*
import ru.skillbranch.devintensive.models.BaseMessage
import ru.skillbranch.devintensive.models.Chat
import ru.skillbranch.devintensive.models.TextMessage
import ru.skillbranch.devintensive.models.User
import java.util.*

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


    @Test
    fun test_make_message () {

        val user = User.makeUser("John Dow")
        val chat = Chat("1")

        val tMessage = BaseMessage.makeMessage(user, chat, Date(), "text", "Test text message", false)
        print(tMessage.formatMessage())

    }


}