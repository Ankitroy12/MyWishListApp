package ankit.app.mywishlistapp

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun AppBarView(
    title: String,
    onBackNavClicked: () -> Unit = {},
    modifier: Modifier
){
    val navigationIcon : (@Composable ()-> Unit)?={
        if(!title.contains("WishList")){
            IconButton(onClick = {onBackNavClicked()}) {
                Icon(
                    imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                    tint = Color.Black,
                    contentDescription = null
                )
            }
        }else{
            null
        }
    }
     TopAppBar(title={ Text(text = title, color = Color(0xFF000000),
        fontFamily = FontFamily.Cursive,
        fontSize = 30.sp,
        fontWeight = FontWeight.ExtraBold,
         modifier = Modifier.padding(start = 90.dp))},
        elevation = 3.dp,
        backgroundColor = Color(0xFFDA1253),
        navigationIcon = navigationIcon,
         modifier = modifier
    )
}
