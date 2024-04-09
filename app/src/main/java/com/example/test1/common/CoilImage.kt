package com.example.test1.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.ImagePainter
import coil.compose.rememberImagePainter
import androidx.compose.runtime.State
import androidx.compose.ui.platform.LocalContext
import coil.annotation.ExperimentalCoilApi
import coil.transform.BlurTransformation
import coil.transform.CircleCropTransformation
import coil.transform.GrayscaleTransformation
import com.example.test1.R


@OptIn(ExperimentalCoilApi::class)
@Preview(showSystemUi = true)
@Composable
fun CoilImage () {
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.Center,

    ) {
        val painter = rememberImagePainter(
            data = "https://avatars.githubusercontent.com/u/14994036?ve4",
            builder = {
                placeholder(R.drawable.ic_placeholder)
                error(R.drawable.ic_error)
                crossfade(1000)
                transformations(
//                    GrayscaleTransformation(),
                    CircleCropTransformation(),
//                    BlurTransformation(LocalContext.current)
                )
            }
        )
        val painterState = painter.state
        Image(
            painter = painter,
            contentDescription = "logo image"
        )
//        if (painterState is ImagePainter.State.Loading) {
//            CircularProgressIndicator()
//        }u/14994036?ve4
    }
}