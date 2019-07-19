package com.andylai.mvcdemo.mvp

import android.util.Log
import com.andylai.mvcdemo.DataClass.UserBean
import com.andylai.mvcdemo.DataModel

class MVPPresenter(private val mvpView: IMVPView) {

    private var dataModel: DataModel = DataModel()

    fun saveUser(id: Int, firstName: String, lastName: String) {
        dataModel.addUserBean(UserBean(id, firstName, lastName))
    }

    fun loadUser(id: Int) {
        val user = dataModel.loadUser(id)
        if (user == null) {
            Log.d("Andy", "user data is null")
            return
        }
        mvpView.setFirstName(user.firstName)
        mvpView.setLastName(user.lastName)
    }
}