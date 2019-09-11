package com.trainingdeveloperpro.local

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.trainingdeveloperpro.local.converter.Converters
import com.trainingdeveloperpro.local.dao.UserDao
import com.trainingdeveloperpro.model.User

@Database(entities = [User::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class ArchAppDatabase: RoomDatabase() {

    // DAO
    abstract fun userDao(): UserDao

    companion object {

        fun buildDatabase(context: Context) =
            Room.databaseBuilder(context.applicationContext, ArchAppDatabase::class.java, "ArchApp.db")
                .build()
    }
}