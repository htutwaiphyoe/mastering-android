package com.htutwaiphyo.coffeemasters

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp

@Composable
fun OfferPage(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Text("Title", fontSize = 16.sp)
        Text("Description")
    }
}