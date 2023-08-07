package com.crewl.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.crewl.localized_strings_android.CrewlLocalization

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        CrewlLocalization.init(context = applicationContext, supportedLanguages = listOf("tr"))
    }

    companion object {
        fun resString(id: Int): String {
            return CrewlLocalization.getLocalizedString(id)
        }
    }
}