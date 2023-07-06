package com.example.triviagame.ui.composable.answer_details_composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.triviagame.R
import com.example.triviagame.ui.composable.spacing.padding_vertical.SpacerVertical16
import com.example.triviagame.ui.theme.Montserrat
import com.example.triviagame.ui.theme.Primary
import com.example.triviagame.ui.theme.White_FF


@Composable
fun AnswerCard(text: String, image: Int) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .height(320.dp)

    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = com.example.triviagame.ui.theme.Card),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        )
        {
            ImageResult(painter = painterResource(image))
            SpacerVertical16()
            TextResult(text = text, size = 14, modifier = Modifier)
            SpacerVertical16()
            ButtonCheckAnswer(text = "Check Your Answer", {})
            SpacerVertical16()
        }

    }

}

@Composable
fun AlignText(
    text: String,
    textAlign: TextAlign,
    modifier: Modifier = Modifier,
) {
    Text(
        text = text,
        modifier = modifier
            .fillMaxWidth(),
        textAlign = textAlign,
        fontSize = 14.sp,
        fontFamily = Montserrat,
        fontWeight = FontWeight.Medium,
        color = White_FF
    )

}

@Composable
fun TextResult(text: String, size: Int, modifier: Modifier) {
    Text(
        text = text,
        fontSize = size.sp,
        fontFamily = Montserrat,
        fontWeight = FontWeight.Medium,
        color = White_FF
    )

}

@Composable
fun ButtonCheckAnswer(
    text: String,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {

    Button(
        onClick = onClick, modifier = modifier
            .width(202.dp)
            .height(54.dp),
        shape = RoundedCornerShape(16.dp),
        colors = ButtonDefaults.buttonColors(Primary)
    ) {
        Text(
            text = text,
            fontSize = 14.sp,
            color = White_FF
        )

    }
}


@Composable
fun ImageResult(
    painter: Painter,
    size: Int = 200,
) {
    Image(
        painter = painter,
        contentDescription = "Profile picture",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .clip(RoundedCornerShape(24.dp))
            .size(size.dp)
    )
}

@Preview
@Composable
fun PreviewCardWinScreen() {
    AnswerCard(text = "You get +80 Quiz Points", image = R.drawable.winning_cup)

}