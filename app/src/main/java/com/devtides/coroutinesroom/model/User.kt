package com.devtides.coroutinesroom.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey


@Entity
data class User (
    val username:String,

    @ColumnInfo(name="password_hash")
    val passwordHash:Int,

    val info:String
    ){
    @PrimaryKey(autoGenerate = true)
    var id:Long =0

    constructor(username: String, passwordHash: Int, info: String ,id:Long)
            : this(username,passwordHash,info)
//    @Ignore
//    lateinit var overview: String


}
