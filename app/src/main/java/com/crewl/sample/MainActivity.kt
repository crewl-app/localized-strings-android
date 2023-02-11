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

        Log.i("App.tag", "onCreate: " + resString(com.crewl.localized_strings_android.R.string.CONTINUE))
    }

    companion object {
        fun resString(id: Int): String {
            return CrewlLocalization.getLocalizedString(id)
        }
    }
}