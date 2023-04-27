package com.moyshagg.diplom3.dao

import androidx.room.*
import com.moyshagg.diplom3.model.CPU


@Dao
interface CPUdao {

    @Query("SELECT * FROM cpu")
    fun getAllCpu(): List<CPU>

    @Insert
    fun insert(cpu: CPU)

    @Update
    fun update(cpu: CPU)

    @Delete
    fun delete(cpu: CPU)


//    @Query("SELECT * FROM cpu")
//    suspend fun getCPU() : List<CPU>
}