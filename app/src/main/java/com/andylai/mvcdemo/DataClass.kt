package com.andylai.mvcdemo

class DataClass {
    data class UserBean(var id: Int, var firstName: String, var lastName: String)
    data class MemberInfo(var name: String, var email: String, var isVIP: Boolean)
}