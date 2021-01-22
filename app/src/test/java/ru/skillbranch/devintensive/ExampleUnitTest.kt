package ru.skillbranch.devintensive

import org.junit.Test

import org.junit.Assert.*
import ru.skillbranch.devintensive.extensions.TimeUnits
import ru.skillbranch.devintensive.extensions.stripHtml
import ru.skillbranch.devintensive.extensions.truncate
import ru.skillbranch.devintensive.models.BaseMessage
import ru.skillbranch.devintensive.models.Chat
import ru.skillbranch.devintensive.models.TextMessage
import ru.skillbranch.devintensive.models.User
import ru.skillbranch.devintensive.utils.Utils
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
        val user2 = User.makeUser("")
        print("$user2 \n")
        val user3 = User.makeUser("John")
        print("$user3 \n")
    }


    @Test
    fun test_task2 () {

        val user = User.makeUser("John Dow")
        val chat = Chat("1")

        val tMessage = BaseMessage.makeMessage(user, chat, Date(), "text", "Test text message", false)
        print(tMessage.formatMessage())

    }

    @Test
    fun test_task6 () {
        print(Utils.toInitials("John", "Dow"))
        print("\n")
        print(Utils.toInitials("John", null))
        print("\n")
        print(Utils.toInitials(null, null))
    }

    @Test
    fun test_task9 () {
        val user = User.Builder().id("99").firstName("John").lastName("Silver").avatar(null).
rating(0).respect(0).lastVisit(Date()).isOnline(false)
        print ("${user.id} ${user.firstName} ${user.lastName}")
    }

    @Test
    fun test_task10 () {
        print(TimeUnits.SECOND.plural(1))
        print(TimeUnits.HOUR.plural(23))
    }

    @Test
    fun test_task11() {
        val str1 = "Bender Bending Rodriguez"
        println(str1.truncate())
        val str2 = "A"
        println(str2.truncate())

    }

    @Test
    fun test_task12 () {
        println("<p class=\\\"title\\\">Образовательное IT-сообщество Skill Branch</p>".stripHtml())
        println("<p>Образовательное       IT-сообщество Skill Branch</p>".stripHtml())
    }

}