package ru.skillbranch.devintensive.extensions

fun String.truncate(length: Int = 16): String {
    if (this.length < length) {
        return this
    } else {
        return this.take(length) + ".."
    }
}

fun String.stripHtml(): String {
        val htmlTags = Regex("(<.*?>)|(&[^ а-я]{1,4}?;)")
        val spaces = Regex(" {2,}")
        return this.replace(htmlTags, "").replace(spaces, " ")
}