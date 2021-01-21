package ru.skillbranch.devintensive.models

import ru.skillbranch.devintensive.extensions.format
import java.util.*

class ImageMessage(
    id: String,
    from: User?,
    chat: Chat,
    isIncoming: Boolean = false,
    date: Date = Date(),
    var image: String
) : BaseMessage(id, from, chat, isIncoming, date) {
    override fun formatMessage() : String {
        val action = if (isIncoming) "получил" else "отправил"
        return "$from.firstName $action изображение \\\"$image\\\" ${date.format()}"
    }
}