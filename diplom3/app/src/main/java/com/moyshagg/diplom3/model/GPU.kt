package com.moyshagg.diplom3.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "gpu")
data class GPU(
    @PrimaryKey
    val id: Int,

    @ColumnInfo(name = "gpu_name")
    val gpuName: String,

    @ColumnInfo(name = "gpu_brand")
    val gpuBrand: String,

    @ColumnInfo(name = "gpu_clock_speed")
    val gpu_clock_speed: Int,

    @ColumnInfo(name = "gpu_ram_memory")
    val gpuRamMemory: String,

    @ColumnInfo(name = "gpu_ram_type")
    val gpuRamType: String,

    @ColumnInfo(name = "gpu_memory_bus")
    val gpuMemoryBus: String,

    @ColumnInfo(name = "gpu_memory_interface")
    val gpuMemorySize: String,

    @ColumnInfo(name = "gpu_price")
    val gpuPrice: Int,

    @ColumnInfo(name = "gpu_image")
    val gpuImage:String
)
