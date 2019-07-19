package com.andylai.mvcdemo

interface IUserModel {
    fun setID(ID: Int)

    fun setFirstName(firstName: String)

    fun setLastName(lastName: String)

    fun addUserBean(userBean: DataClass.UserBean)

    fun getUserBean(ID: Int): DataClass.UserBean
}