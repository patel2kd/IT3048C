package com.example.springprojectstationbuild.dao

import com.example.springprojectstationbuild.dto.ComputerComponent
import retrofit2.Call
import retrofit2.http.GET
interface IComponentDAO {

    @GET("")
    fun getAllComponents() : Call<ArrayList<ComputerComponent>>

}