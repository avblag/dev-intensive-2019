package ru.skillbranch.devintensive.utils

object Utils {

    fun ifEmptyThenNull(data: String?): String? {
        return if (data == "")
            null
        else if (data == " ")
            null
        else
            data
    }

    fun parseFullName(fullName: String?): Pair<String?, String?> {
        val parts: List<String>? = fullName?.split(" ")
        val firstName = ifEmptyThenNull(parts?.getOrNull(0))
        val lastName = ifEmptyThenNull(parts?.getOrNull(1))
        return firstName to lastName
    }

    fun toInitials(firstName: String?, lastName: String?): String? {
        val firstLetter = firstName?.first()
        val lastLetter = lastName?.first()

        return if ((firstLetter == null) && (lastLetter == null)) {
            null
        } else if ((firstLetter != null) && (lastLetter == null)) {
            firstLetter.toString()
        } else
            firstLetter.toString() + lastLetter.toString()
    }
}