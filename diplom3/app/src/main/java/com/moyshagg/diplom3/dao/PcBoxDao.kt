package com.moyshagg.diplom3.dao

import androidx.room.*
import com.moyshagg.diplom3.model.PcBox


@Dao
interface PcBoxDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(pcbox: PcBox)

    @Delete
    suspend fun delete(pcbox: PcBox)

    @Update
    suspend fun  update(pcbox: PcBox)

}