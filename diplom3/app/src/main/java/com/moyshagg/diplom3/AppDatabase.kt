package com.moyshagg.diplom3

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.moyshagg.diplom3.dao.*
import com.moyshagg.diplom3.model.*

@Database( entities = [
    CPU::class,
    GPU::class,
    Motherboard::class,
    PcBox::class,
    PC::class,
    PowerSupply::class,
    RamMemory::class,
    Storage::class
], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {

    // Абстрактные методы для получения DAO-объектов
    abstract fun gpuDao(): GPUdao
    abstract fun motherboardDao(): MotherboardDao
    abstract fun powerSupplyDao() : PowerSupplydao
    abstract fun ramMemoryDao() : RamMemorydao
    abstract fun storageDao() : Storagedao
    abstract fun cpuDao(): CPUdao
    abstract fun PcBoxDao():PcBoxDao
    companion object {
        // Имя базы данных
        private const val DATABASE_NAME = "app_database"

        // Экземпляр базы данных
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            // Если INSTANCE не null, возвращает его
            INSTANCE?.let { return it }

            // Создает базу данных, если INSTANCE null
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    DATABASE_NAME
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }


}
