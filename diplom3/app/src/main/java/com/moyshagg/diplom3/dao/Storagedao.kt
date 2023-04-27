package com.moyshagg.diplom3.dao

import androidx.room.*
import com.moyshagg.diplom3.model.Storage
@Dao
interface Storagedao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(storage: Storage)

    @Delete
    suspend fun delete(storage: Storage )

    @Update
    suspend fun  update(storage: Storage)
}