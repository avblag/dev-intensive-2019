package ru.skillbranch.devintensive.models

import java.util.*

abstract class BaseMessage (val id: String,
                   val from: User?,
                   val chat: Chat,
                   val isIncoming: Boolean = false,
                   val date: Date = Date()
) {
    abstract fun formatMessage(): String

    companion object AbstractFactory {
        var lastId = -1
        fun makeMessage(
            from: User?,
            chat: Chat,
            date: Date = Date(),
            type: String,
            payload: String,
            isIncoming: Boolean = false
        ): BaseMessage {
            lastId++
            return when (type) {
                "text" -> TextMessage(
                    lastId.toString(),
                    from,
                    chat,
                    date = date,
                    text = payload
                )
                "image" -> ImageMessage(
                    lastId.toString(),
                    from,
                    chat,
                    date = date,
                    image = payload
                )
                else -> TextMessage(
                    lastId.toString(),
                    from,
                    chat,
                    date = date,
                    text = payload
                )
            }
        }
    }


}