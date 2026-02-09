package com.valorant.modularization

import com.valorant.app.modularization.BuildConfig
import org.junit.Test

import org.junit.Assert.*

class BuildConfigTest {

    @Test
    fun application_id_should_be_correct() {
        assertTrue(BuildConfig.APPLICATION_ID.contains("valorant"))
    }
}