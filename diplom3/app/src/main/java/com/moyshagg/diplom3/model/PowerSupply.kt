package com.moyshagg.diplom3.model

import androidx.room.*

@Entity(tableName = "power_supply")
data class PowerSupply(
    @PrimaryKey
    val id:Int,

    @ColumnInfo(name = "power_supply_model_name")
    val modelName:String,

    @ColumnInfo(name = "power_supply_wattage")
    val wattage:String,

    @ColumnInfo(name = "power_supply_brand")
    val PowerSupplyBrand:String,

    @ColumnInfo(name = "power_supply_size")
    val size:String,

    @ColumnInfo(name = "power_supply_connectors")
    val powerConnectors:String,

    @ColumnInfo(name = "power_supply_price")
    val powerPrice:Int,

    @ColumnInfo(name = "power_supply_image")
    val powerImage:String
)
