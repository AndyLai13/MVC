package com.andylai.mvcdemo.mvp

interface IMVPView {
    fun getId(): Int

    fun getFirstName():String

    fun getLastName():String

    fun setFirstName(firstName :String)

    fun setLastName(lastName :String)
}