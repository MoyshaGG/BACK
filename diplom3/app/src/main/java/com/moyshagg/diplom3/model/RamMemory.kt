package com.moyshagg.diplom3.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey


@Entity(tableName = "ram")
data class RamMemory(
    @PrimaryKey
    val id: Int,

    @ColumnInfo(name = "ram_model_name")
    val modelName: String,

    @ColumnInfo(name = "ram_type_ddr")
    val typeDDR: String,

    @ColumnInfo(name = "ram_size_memory")
    val sizeMemory: Int,

    @ColumnInfo(name = "ram_frequency")
    val frequency: Int,

    @ColumnInfo(name = "ram_timing")
    val timing: String,

    @ColumnInfo(name = "ram_support_overclocking")
    val supportOverclocking: String,

    @ColumnInfo(name = "ram_support_rgb")
    val supportRGB: String,

    @ColumnInfo(name = "ram_memory_bandwidth")
    val memoryBandwidth: Int,

    @ColumnInfo(name = "ram_wattage")
    val memoryWattage: Int,

    @ColumnInfo(name = "ram_price")
    val memoryPrice: String,

    @ColumnInfo(name = "ram_image")
    val memoryImage:String

)


