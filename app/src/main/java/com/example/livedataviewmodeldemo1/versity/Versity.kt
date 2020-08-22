package com.example.livedataviewmodeldemo1.versity

class Versity {
    var versityName: String = ""
    var versityEmail: String = ""
    var versityDepartment: String = ""
    var versityEmployee: String = ""
    var versityPhone: String = ""

    constructor(
        versityName: String,
        versityEmail: String,
        versityDepartment: String,
        versityEmployee: String,
        versityPhone: String
    ) {
        this.versityName = versityName
        this.versityEmail = versityEmail
        this.versityDepartment = versityDepartment
        this.versityEmployee = versityEmployee
        this.versityPhone = versityPhone
    }
}