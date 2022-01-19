package org.geeksforgeeks.sdkreleaseversion

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mTextView = findViewById<TextView>(R.id.text_view_1)

        val mSdkVersion = Build.VERSION.SDK_INT
        val mReleaseVersion = Build.VERSION.RELEASE

        mTextView.text = "API Version : $mSdkVersion\nRelease : $mReleaseVersion"
    }
}