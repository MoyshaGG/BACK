package com.moyshagg.diplom3.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cpu")
data class CPU(
    @PrimaryKey
    val id: Int,

    @ColumnInfo(name = "cpu_name")
    val cpuName: String,

    @ColumnInfo(name = "cpu_brand")
    val cpuBrand: String,

    @ColumnInfo(name = "cpu_socket")
    val cpuSocket: String,

    @ColumnInfo(name = "cpu_cash_memory")
    val cpuCashMemory: Int,

    @ColumnInfo(name = "cpu_thread")
    val cpuThreads: Int,

    @ColumnInfo(name = "cpu_memory_type")
    val cpuMemoryType: String,

    @ColumnInfo(name = "cpu_frequency")
    val cpuFrequency: Int,

    @ColumnInfo(name = "cpu_cores")
    val cpuCores: Int,

    @ColumnInfo(name = "cpu_technical_process")
    val cpuTechnicalProcess: String,

    @ColumnInfo(name = "cpu_price")
    val cpuPrice: Int,

    @ColumnInfo(name = "cpu_image")
    val cpuImage: String,

    @ColumnInfo(name = "cpu_tdp")
    val cpuTDP: Int
)


