package ankit.app.mywishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true)
    val id: Long=0L,
    @ColumnInfo(name = "wish-title")
    val title: String="",
    @ColumnInfo(name = "wish-desc")
    val description: String=""
)


object DummyWish{
    val WishList = listOf(
        Wish(title = "Google Watch 2", description = "An Android Watch"),
        Wish(title = "Disha", description = "She is mine"),
        Wish(title = "Kissing her", description = "I love her so much")
    )
}