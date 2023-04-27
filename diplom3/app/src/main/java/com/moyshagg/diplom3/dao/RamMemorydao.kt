package com.moyshagg.diplom3.dao

import androidx.room.*
import com.moyshagg.diplom3.model.RamMemory

@Dao
interface RamMemorydao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(ramMemory: RamMemory)

    @Delete
    suspend fun delete(ramMemory: RamMemory)

    @Update
    suspend fun  update(ramMemory: RamMemory)
}