package com.valorant.modularization

import android.app.Application
import androidx.test.core.app.ApplicationProvider
import androidx.test.ext.junit.runners.AndroidJUnit4

import org.junit.Test
import org.junit.runner.RunWith

import org.junit.Assert.*


@RunWith(AndroidJUnit4::class)
class JetpackApplicationTest {

    @Test
    fun app_context_is_jetpack_application() {
        val context = ApplicationProvider.getApplicationContext<Application>()
        assertTrue(context is ValorantApplication)
    }
}