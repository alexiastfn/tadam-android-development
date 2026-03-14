package org.example

// Extension:
// Extensions are get-only because they can't store data
val Quiz.StudentProgress2.progressText: String
    get() = "${answered} of ${total} answered"