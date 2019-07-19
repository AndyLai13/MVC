package com.andylai.mvcdemo

import com.andylai.mvcdemo.DataClass.UserBean

class DataModel {

    private val userBeanList = ArrayList<UserBean>()

    fun addUserBean(userBean: UserBean) {
        userBeanList.add(userBean)
    }

    fun loadUser(id: Int): UserBean? {
        for (userBean in userBeanList) {
            if (userBean.id == id) return userBean
        }
        return null
    }
}