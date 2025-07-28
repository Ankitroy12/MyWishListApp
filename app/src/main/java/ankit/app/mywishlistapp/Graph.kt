package ankit.app.mywishlistapp

import android.content.Context
import androidx.room.Room
import ankit.app.mywishlistapp.data.WishDatabase
import ankit.app.mywishlistapp.data.WishRepository

object Graph {
    lateinit var database: WishDatabase

    val wishRepository by lazy {
        WishRepository(wishDao = database.wishDao())

    }

    fun provide(context: Context){
        database= Room.databaseBuilder(context, WishDatabase::class.java,"wishlist.db").build()
    }
}