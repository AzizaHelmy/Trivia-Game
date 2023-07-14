package com.example.triviagame.ui.screens.play.composable

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.example.triviagame.R
import com.example.triviagame.ui.composable.ButtonBack
import com.example.triviagame.ui.theme.White_FF

@Composable
fun PlayHeader(
    modifier: Modifier = Modifier,
    onClickBack: () -> Unit,
    onClickSkip: () -> Unit,
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        ButtonBack(onBack = onClickBack)
        Text(
            modifier = modifier.clickable { onClickSkip() },
            text = stringResource(id = R.string.skip),
            color = White_FF,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}
