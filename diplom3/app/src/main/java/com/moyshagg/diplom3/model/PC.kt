package com.moyshagg.diplom3.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "pc")
data class PC(
    @PrimaryKey
    val id:Int,

    @ColumnInfo(name = "pc_cpu")
    val pcCPU:String,

    @ColumnInfo(name = "pc_gpu")
    val pcGPU:String,

    @ColumnInfo(name = "pc_motherboard")
    val pcMotherboard:String,

    @ColumnInfo(name = "pc_power_supply")
    val pcPowerSupply:String,

    @ColumnInfo(name = "pc_box")
    val pcBox:String,

    @ColumnInfo(name = "pc_ram_memory")
    val pc_RamMemory:String,

    @ColumnInfo(name = "pc_storage")
    val pc_storage:String,

    )
