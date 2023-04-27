package com.moyshagg.diplom3.dao

import androidx.room.*
import com.moyshagg.diplom3.model.PowerSupply

@Dao
interface PowerSupplydao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(powerSupply: PowerSupply)

    @Delete
    suspend fun delete(powerSupply: PowerSupply)

    @Update
    suspend fun  update(powerSupply: PowerSupply)

}