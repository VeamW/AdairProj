package com.adair.work.kotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView


/**
 * created by Adair Wong
 */
class KotlinActivity : AppCompatActivity() {
    var mTvText: TextView? = null
    var mImg: ImageView? = null
    var mBtnSure: Button? = null
    var mEdtContent: EditText? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        mTvText = findViewById(R.id.tv_msg) as TextView
        mImg = findViewById(R.id.img) as ImageView
        mEdtContent = findViewById(R.id.edt_content) as EditText
        mBtnSure = findViewById(R.id.btn_sure) as Button

        //设置textview信息
        mTvText?.setText("This is Kotlin in Android practice")
        //设置图片显示
        mImg?.visibility = View.VISIBLE
        //设置提示
        mEdtContent?.setHint("请输入内容")
        mEdtContent?.setHintTextColor(R.color.primary_dark_material_dark)
        //为sure button 设置事件 ， 在MSG textview上显示输入的信息
        mBtnSure?.setOnClickListener {
            mTvText?.setText(mEdtContent?.text.toString())
            //跳转至FileActivity
            startActivity(Intent(KotlinActivity@ this, FileActivity::class.java))
        }

        Log.e("KotlinActivity", mTvText?.text.toString())
    }

}
