package com.example.websoc.chat.domain

data class ChatMessage (
    var type: MessageType,
    var content: String?,
    var sender: String
)