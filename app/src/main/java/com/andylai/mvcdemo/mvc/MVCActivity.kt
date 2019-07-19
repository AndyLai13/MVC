package com.andylai.mvcdemo.mvc

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.andylai.mvcdemo.DataClass
import com.andylai.mvcdemo.DataClass.UserBean
import com.andylai.mvcdemo.R

class MVCActivity : AppCompatActivity(),View.OnClickListener {


    lateinit var mMVCModel: MVCModel

    lateinit var mETId: EditText
    lateinit var mETFirstName: EditText
    lateinit var mETLastName: EditText

    lateinit var mInputId: TextView
    lateinit var mTVFirstName: TextView
    lateinit var mTVLastName: TextView

    lateinit var mBtnSave: Button
    lateinit var mBtnLoad: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvc)
        mMVCModel = MVCModel()
        mETId = findViewById(R.id.editText_id)
        mETFirstName = findViewById(R.id.editText_firstName)
        mETLastName = findViewById(R.id.editTest_lastName)
        mInputId = findViewById(R.id.input_id)
        mTVFirstName = findViewById(R.id.text_firstName)
        mTVLastName = findViewById(R.id.text_lastName)
        mBtnSave = findViewById(R.id.button_save)
        mBtnLoad = findViewById(R.id.button_load)
        mBtnSave.setOnClickListener(this)
        mBtnLoad.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.button_save) {
            if (mETId.text.isNotEmpty() ||
                mETFirstName.text.isNotEmpty() ||
                mETLastName.text.isNotEmpty()) {
                val id = mETId.text.toString().toInt()
                val firstName = mETFirstName.text.toString()
                val lastName = mETLastName.text.toString()
                saveUser(id, firstName, lastName)
            }
        } else if (v?.id == R.id.button_load) {
            if (mInputId.text.isNotEmpty()) {
                val id = mInputId.text.toString().toInt()
                val userBean = loadUser(id)
                val firstName  = userBean.firstName
                val lastName = userBean.lastName
                mTVFirstName.text = firstName
                mTVLastName.text = lastName
            }
        }
    }

    private fun saveUser(id: Int, firstName: String, lastName: String) {
        mMVCModel.addUserBean(UserBean(id, firstName, lastName))
    }

    private fun loadUser(id: Int): UserBean {
        return mMVCModel.getUserBean(id)
    }
}
