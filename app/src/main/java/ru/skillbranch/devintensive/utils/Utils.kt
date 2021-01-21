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

    fun transliteration(payload: String, divider: String = " "): String {
        val dictionary = mapOf(
            "а" to "a",
            "б" to "b",
            "в" to "v",
            "г" to "g",
            "д" to "d",
            "е" to "e",
            "ё" to "e",
            "ж" to "zh",
            "з" to "z",
            "и" to "i",
            "й" to "i",
            "к" to "k",
            "л" to "l",
            "м" to "m",
            "н" to "n",
            "о" to "o",
            "п" to "p",
            "р" to "r",
            "с" to "s",
            "т" to "t",
            "у" to "u",
            "ф" to "f",
            "х" to "h",
            "ц" to "c",
            "ч" to "ch",
            "ш" to "sh",
            "щ" to "sh'",
            "ъ" to "",
            "ы" to "i",
            "ь" to "",
            "э" to "e",
            "ю" to "yu",
            "я" to "ya",
            " " to divider
        )
        var output = payload
        for ((rLetter, lLetter) in dictionary) {
            output = output.replace(rLetter, lLetter)
        }
        return output
    }

}