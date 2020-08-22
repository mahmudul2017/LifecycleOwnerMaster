package com.example.livedataviewmodeldemo1.test

class Student {
    var studentName: String = ""
    var studentEmail: String = ""
    var StudentRoll: Int = 0
    var studentVersity: String = ""
    var studentPhone: String = ""

    constructor(
        studentName: String,
        studentEmail: String,
        StudentRoll: Int,
        studentVersity: String,
        studentPhone: String
    ) {
        this.studentName = studentName
        this.studentEmail = studentEmail
        this.StudentRoll = StudentRoll
        this.studentVersity = studentVersity
        this.studentPhone = studentPhone
    }
}