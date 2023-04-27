package com.moyshagg.diplom3.dao

import androidx.room.*
import com.moyshagg.diplom3.model.PC
@Dao
interface PCdao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(pc: PC)

    @Delete
    suspend fun delete(pc: PC)

    @Update
    suspend fun  update(pc: PC)

}