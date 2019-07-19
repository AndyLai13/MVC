package com.andylai.mvcdemo.mvp

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.Button
import android.widget.EditText
import com.andylai.mvcdemo.R

class MVPActivity : AppCompatActivity(), IMVPView, View.OnClickListener {

    lateinit var mETId: EditText
    lateinit var mETFirstName: EditText
    lateinit var mETLastName: EditText

    lateinit var mBtnSave: Button
    lateinit var mBtnLoad: Button

    lateinit var mMVPPresenter: MVPPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvp)

        mETId = findViewById(R.id.editText_id)
        mETFirstName = findViewById(R.id.editText_firstName)
        mETLastName = findViewById(R.id.editTest_lastName)
        mBtnSave = findViewById(R.id.button_save)
        mBtnLoad = findViewById(R.id.button_load)
        mBtnSave.setOnClickListener(this)
        mBtnLoad.setOnClickListener(this)

        mMVPPresenter = MVPPresenter(this)
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.button_save) {
            mMVPPresenter.saveUser(getId(), getFirstName(), getLastName())
            mETId.setText("")
            mETFirstName.setText("")
            mETLastName.setText("")
        } else if (v?.id == R.id.button_load) {
            mMVPPresenter.loadUser(getId())
        }
    }

    override fun getId(): Int {
        return mETId.text.toString().toInt()
    }

    override fun getFirstName(): String {
        return mETFirstName.text.toString()
    }

    override fun getLastName(): String {
        return mETLastName.text.toString()
    }

    override fun setFirstName(firstName: String) {
        mETFirstName.setText(firstName)
    }

    override fun setLastName(lastName: String) {
        mETLastName.setText(lastName)
    }
}
