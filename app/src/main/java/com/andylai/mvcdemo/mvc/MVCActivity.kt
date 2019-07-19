package com.andylai.mvcdemo.mvc

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.andylai.mvcdemo.DataClass.UserBean
import com.andylai.mvcdemo.DataModel
import com.andylai.mvcdemo.R

class MVCActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var mDataModel: DataModel
    lateinit var mETId: EditText
    lateinit var mETFirstName: EditText
    lateinit var mETLastName: EditText
    lateinit var mBtnSave: Button
    lateinit var mBtnLoad: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvc)
        mDataModel = DataModel()
        mETId = findViewById(R.id.editText_id)
        mETFirstName = findViewById(R.id.editText_firstName)
        mETLastName = findViewById(R.id.editTest_lastName)
        mBtnSave = findViewById(R.id.button_save)
        mBtnLoad = findViewById(R.id.button_load)
        mBtnSave.setOnClickListener(this)
        mBtnLoad.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.button_save) {
            val id = mETId.text.toString().toInt()
            val firstName = mETFirstName.text.toString()
            val lastName = mETLastName.text.toString()
            mDataModel.addUserBean(UserBean(id, firstName, lastName))
            mETId.setText("")
            mETFirstName.setText("")
            mETLastName.setText("")
        } else if (v?.id == R.id.button_load) {
            val id = mETId.text.toString().toInt()
            val userBean = mDataModel.loadUser(id)
            if (userBean != null) {
                mETFirstName.setText(userBean.firstName)
                mETLastName.setText(userBean.lastName)
            }
        }
    }
}