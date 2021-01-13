package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.SampleListActivityBinding
import com.example.myapplication.main.SampleListFragment
import com.example.myapplication.safeargs.SafeArgsActivity
import com.example.myapplication.sample1.MainActivity
import com.example.myapplication.sample2.Sample2Activity

class SampleListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val viewBinding = SampleListActivityBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, SampleListFragment.newInstance())
                .commitNow()
        }

        viewBinding.btnSample1.setOnClickListener {
            MainActivity.go(this)
        }

        viewBinding.btnSample2.setOnClickListener {
            Sample2Activity.go(this)
        }

        viewBinding.btnSample3.setOnClickListener {
            SafeArgsActivity.go(this)
        }
    }
}