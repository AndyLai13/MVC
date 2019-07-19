package com.andylai.mvcdemo.mvc

import com.andylai.mvcdemo.DataClass.UserBean
import com.andylai.mvcdemo.IUserModel

class MVCModel : IUserModel {
    val userBeanList = ArrayList<UserBean>()

    override fun setID(ID: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setFirstName(firstName: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun setLastName(lastName: String) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun addUserBean(userBean: UserBean) {
        userBeanList.add(userBean)
    }

    override fun getUserBean(ID: Int): UserBean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}