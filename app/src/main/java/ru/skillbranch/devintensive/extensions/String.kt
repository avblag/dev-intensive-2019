package ru.skillbranch.devintensive.extensions

fun String.truncate(length: Int = 16): String {
    if (this.length < length) {
        return this
    } else {
        return this.take(length) + ".."
    }
}