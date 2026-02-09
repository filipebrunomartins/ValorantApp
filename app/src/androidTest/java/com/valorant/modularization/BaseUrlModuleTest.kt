package com.valorant.modularization

import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import javax.inject.Inject

//@HiltAndroidTest
//class BaseUrlModuleTest {
//
//    @get:Rule
//    val hiltRule = HiltAndroidRule(this)
//
//    @Inject
//    lateinit var baseUrl: String
//
//    @Before
//    fun setup() {
//        hiltRule.inject()
//    }
//
//    @Test
//    fun base_url_should_not_be_empty() {
//        assertTrue(baseUrl.isNotBlank())
//    }
//}