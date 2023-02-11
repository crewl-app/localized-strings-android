package com.crewl.localized_strings_android

import android.annotation.SuppressLint
import android.content.Context

class CrewlLocalization private constructor(var context: Context, var supportedLanguages: List<String>) {
    companion object {
        @SuppressLint("StaticFieldLeak")
        private lateinit var instance: CrewlLocalization

        fun init(context: Context, supportedLanguages: List<String>) {
            instance = CrewlLocalization(context = context, supportedLanguages = supportedLanguages)
        }

        fun getLocalizedString(id: Int): String = instance.context.resources.getString(id)
    }
}