package com.moyshagg.diplom3.dao

import androidx.room.*
import com.moyshagg.diplom3.model.Motherboard


@Dao
interface MotherboardDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(motherboard: Motherboard)

    @Delete
    suspend fun delete(motherboard: Motherboard)

    @Update
    suspend fun  update(motherboard: Motherboard)

}