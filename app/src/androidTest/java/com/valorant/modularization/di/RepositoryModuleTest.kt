package com.valorant.modularization.di

import com.valorant.domain.repository.agents.AgentsRepository
import dagger.hilt.android.testing.HiltAndroidRule
import dagger.hilt.android.testing.HiltAndroidTest

import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import javax.inject.Inject

//@HiltAndroidTest
//class RepositoryModuleTest {
//
//    @get:Rule
//    val hiltRule = HiltAndroidRule(this)
//
//    @Inject
//    lateinit var repository: AgentsRepository
//
//    @Before
//    fun setup() {
//        hiltRule.inject()
//    }
//
//    @Test
//    fun repository_is_injected() {
//        assertNotNull(repository)
//    }
//}