package com.valorant.data.mapper.maps

import com.valorant.apiresponse.maps.MapsApiResponse
import com.valorant.data.mapper.maps.MapsTestFactory.defaultMapApiResponse
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class MapMapperTest {

    private val vector3Mapper = Vector3Mapper()
    private val rotationMapper = RotationMapper()
    private val mapCalloutMapper = MapCalloutMapper(
        vector3Mapper = vector3Mapper,
        rotationMapper = rotationMapper
    )
    private val mapMapper = MapMapper(mapCalloutMapper)

    private val mapsMapper = MapsMapper(mapMapper)

    @Test
    fun `should map MapsApiResponse with empty list to MapsEntity`() {

        val apiResponse = MapsApiResponse(
            status = 200,
            data = emptyList()
        )


        // WHEN
        val result = mapsMapper.mapFromApiResponse(apiResponse)

        // THEN
        assertEquals(200, result.status)
        assertTrue(result.data.isEmpty())
    }

    @Test
    fun `should map MapsApiResponse with map list to MapsEntity`() {

        val apiResponse = MapsApiResponse(
            status = 200,
            data = listOf(defaultMapApiResponse())
        )

        // WHEN
        val result = mapsMapper.mapFromApiResponse(apiResponse)

        // THEN
        assertEquals(200, result.status)
        assertEquals(1, result.data.size)

        val map = result.data.first()
        assertEquals("7eaecc1b-4337-bbf6-6ab9-04b8f06b3319", map.uuid)
        assertEquals("Ascent", map.displayName)
    }

    @Test
    fun `should map MapApiResponse with callouts`() {
        val result = mapMapper.mapFromApiResponse(
            defaultMapApiResponse()
        )

        assertEquals("Ascent", result.displayName)
        assertEquals(1, result.callouts?.size)
        assertEquals("Spawn", result.callouts?.first()?.regionName)
    }

    @Test
    fun `should map MapApiResponse without callouts`() {
        val result = mapMapper.mapFromApiResponse(
            defaultMapApiResponse(callouts = null)
        )

        assertEquals("Ascent", result.displayName)
        assertEquals(null, result.callouts)
    }
}