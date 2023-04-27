package com.moyshagg.diplom3.dao

import androidx.room.*
import com.moyshagg.diplom3.model.CPU
import com.moyshagg.diplom3.model.GPU
import kotlin.coroutines.Continuation

@Dao
interface GPUdao {
    @Query("SELECT * FROM gpu")
     fun getAllGpu(): List<GPU>

    @Insert
     fun insert(gpu: GPU)

    @Delete
     fun delete(gpu: GPU)

    @Update
     fun update(gpu: GPU)

}
