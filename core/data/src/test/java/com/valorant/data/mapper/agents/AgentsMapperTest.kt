package com.valorant.data.mapper.agents

import com.valorant.apiresponse.agents.AgentsApiResponse
import com.valorant.data.mapper.agents.AgentsTestFactory.defaultAgentApiResponse
import com.valorant.data.mapper.utils.DateMapper
import kotlin.test.assertEquals
import kotlin.test.assertTrue
import org.junit.Before
import kotlin.test.Test

class AgentsMapperTest {

    private lateinit var roleMapper: RoleMapper
    private lateinit var recruitmentDataMapper: RecruitmentDataMapper
    private lateinit var abilityMapper: AbilityMapper
    private lateinit var agentMapper: AgentMapper

    private lateinit var agentsMapper: AgentsMapper
    private lateinit var dateMapper: DateMapper

    @Before
    fun setup() {
        dateMapper = DateMapper()
        roleMapper = RoleMapper()
        recruitmentDataMapper = RecruitmentDataMapper(
            dateMapper = dateMapper
        )
        abilityMapper = AbilityMapper()

        agentMapper = AgentMapper(
            roleMapper = roleMapper,
            recruitmentDataMapper = recruitmentDataMapper,
            abilityMapper = abilityMapper,
            dateMapper = dateMapper
        )

        agentsMapper = AgentsMapper(
            agentMapper = agentMapper
        )
    }

    @Test
    fun `should map AgentsApiResponse with empty list to AgentsEntity`() {

        val apiResponse = AgentsApiResponse(
            status = 200,
            data = emptyList()
        )


        // WHEN
        val result = agentsMapper.mapFromApiResponse(apiResponse)

        // THEN
        assertEquals(200, result.status)
        assertTrue(result.data.isEmpty())
    }

    @Test
    fun `should map AgentsApiResponse with agent list to AgentsEntity`() {

        val apiResponse = AgentsApiResponse(
            status = 200,
            data = listOf(defaultAgentApiResponse())
        )

        // WHEN
        val result = agentsMapper.mapFromApiResponse(apiResponse)

        // THEN
        assertEquals(200, result.status)
        assertEquals(1, result.data.size)

        val agent = result.data.first()
        assertEquals("e370fa57-4757-3604-3648-499e1f642d3f", agent.uuid)
        assertEquals("Gekko", agent.displayName)
    }

    @Test
    fun `should map AgentApiResponse null RecruitmentData to AgentEntity`() {

        // WHEN
        val result = agentMapper.mapFromApiResponse(
            defaultAgentApiResponse(recruitmentData = null)
        )

        // THEN
        assertEquals("e370fa57-4757-3604-3648-499e1f642d3f", result.uuid)
        assertEquals("Gekko", result.displayName)
    }

    @Test
    fun `should map AgentApiResponse null Role to AgentEntity`() {

        // WHEN
        val result = agentMapper.mapFromApiResponse(
            defaultAgentApiResponse(role = null)
        )

        // THEN
        assertEquals("e370fa57-4757-3604-3648-499e1f642d3f", result.uuid)
        assertEquals("Gekko", result.displayName)
    }
}