@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.rowcolumnbox

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

//Implement All the Row Column Box Functionality of row, col, and box
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
        }

    }
}


@Preview(showBackground = true)
@Composable
fun Screen() {
    CallingAllFunction()
}

@Composable
private fun CallingAllFunction() {

    LazyColumn(Modifier.fillMaxSize()) {

        item {
            Header(text = "Row")
            SubTitleTxt(text = "1-) **Row** is a layout composable that places its children in a horizontal sequence.")
            RowExample()

            Header(text = "Column")
            SubTitleTxt(text = "2-) **Column** is a layout composable that places its children in a vertical sequence.")
            ColumnExample()

            SubTitleTxt(
                text = "3-) Padding order determines whether it's padding or margin for that component."
                        + "In example below check out paddings."
            )
            ColumnsAndRowPaddingsExample()

            SubTitleTxt(text = "4-) Shadow can be applied to Column or Row.")
            ShadowExample()

            Header(text = "Box")
            SubTitleTxt(
                text = "5-) **Box** aligns children on top of each other like a Stack. " +
                        "The one declared last is on top"
            )
            BoxExample()

            SubTitleTxt(
                text = "6-) Elements in Box can be aligned with different alignments."
            )
            BoxShadowAndAlignmentExample()

            Header(text = "Spacer")

            SubTitleTxt(
                text = "7-) Spacer can be used to align elements to end or bottom of screen"
            )
            WeightExample()

            Header(text = "Weight and Spacer")
            SubTitleTxt(
                text = "8-) **Weight** determines, based on total weight, how much of the parent's " +
                        "dimensions should be occupied by each child. **Spacer** is used to " +
                        "create horizontal or vertical space between components."
            )
            WeightAndSpacerExample()
        }
    }
}

@Composable
fun RowExample() {

    Text(text = "Arrangement.Start")
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Start) {
        RowTexts()
    }

    Text(text = "Arrangement.End")
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.End) {
        RowTexts()
    }

    Text(text = "Arrangement.Center")
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center) {
        RowTexts()
    }

    Text(text = "Arrangement.SpaceEvenly")
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly,
    ) {
        RowTexts()
    }

    Text(text = "Arrangement.SpaceAround")
    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
        RowTexts()
    }

    Text(text = "Arrangement.SpaceBetween")

    Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
        RowTexts()
    }
}

@Composable
fun ColumnExample() {
    val modifier = Modifier
        .padding(8.dp)
        .fillMaxWidth()
        .height(200.dp)
        .background(Color.LightGray)

    Text(text = "Arrangement.Top")
    Column(modifier = modifier, verticalArrangement = Arrangement.Top) {
        ColumnTexts()
    }

    Text(text = "Arrangement.Bottom")
    Column(modifier = modifier, verticalArrangement = Arrangement.Bottom) {
        ColumnTexts()
    }

    Text(text = "Arrangement.Center")
    Column(modifier = modifier, verticalArrangement = Arrangement.Center) {
        ColumnTexts()
    }

    Text(text = "Arrangement.SpaceEvenly")
    Column(modifier = modifier, verticalArrangement = Arrangement.SpaceEvenly) {
        ColumnTexts()
    }

    Text(text = "Arrangement.SpaceAround")
    Column(modifier = modifier, verticalArrangement = Arrangement.SpaceAround) {
        ColumnTexts()
    }

    Text(text = "Arrangement.SpaceBetween")
    Column(modifier = modifier, verticalArrangement = Arrangement.SpaceBetween) {
        ColumnTexts()
    }
}


@Composable
fun RowTexts() {
    Text(
        text = "Row1", modifier = Modifier
            .background(Color(0xFFFF9800))
            .padding(4.dp)
    )
    Text(
        text = "Row2", modifier = Modifier
            .background(Color(0xFFFFA726))
            .padding(4.dp)
    )
    Text(
        text = "Row3", modifier = Modifier
            .background(Color(0xFFFFB74D))
            .padding(4.dp)
    )
}

@Composable
fun ColumnTexts() {
    Text(
        text = "Column1", modifier = Modifier
            .background(Color(0xFF8BC34A))
            .padding(4.dp)
    )
    Text(
        text = "Column2", modifier = Modifier
            .background(Color(0xFF9CCC65))
            .padding(4.dp)
    )
    Text(
        text = "Column3", modifier = Modifier
            .background(Color(0xFFAED581))
            .padding(4.dp)
    )
}


/**
 * Column and Row example with padding, background, and fill and wrap content
 * to determine dimensions of contents.
 */
@Composable
fun ColumnsAndRowPaddingsExample() {

    val rowModifier = Modifier
        .background(Color(0xFFF06292))
        .fillMaxWidth()
        .wrapContentHeight()

    // 🔥 Padding after Yellow background leaves space inside container
    val modifierA = Modifier
        .background(Color(0xFFFFEB3B))
        .padding(15.dp)

    // 🔥 Padding(10dp) before cyan color acts as margin while padding end leaves
    // space(padding) for the content inside the container
    val modifierB = Modifier
        .padding(10.dp)
        .background(Color(0xFF80DEEA))
        .padding(end = 15.dp)


    val modifierC = Modifier
        .background(Color(0xFF607D8B))
        .padding(15.dp)

    Row(modifier = rowModifier, horizontalArrangement = Arrangement.SpaceEvenly) {

        Column(
            modifier = modifierA
                .background(Color(0xFFFFFFFF))
                .padding(8.dp)
        ) {
            Text(text = "Text A1")
            Text(text = "Text A2")
            Text(text = "Text A3")
        }

        Column(
            modifier = modifierB
                .background(Color(0xFF9575CD))
                .padding(top = 12.dp, bottom = 22.dp)
        ) {
            Text(text = "Text B1")
            Text(text = "Text B2")
            Text(text = "Text B3")
        }

        Column(modifier = modifierC.background(Color(0xFFB2FF59))) {
            Text(text = "Text C1")
            Text(text = "Text C2")
            Text(text = "Text C3")
        }
    }
}

@Composable
fun ShadowExample() {

    Row(
        modifier = Modifier
            .padding(8.dp)
            .shadow(
                elevation = 4.dp,
                shape = RoundedCornerShape(16.dp)
            )
    ) {
        RowTexts()
    }

    Column(
        modifier = Modifier
            .padding(8.dp)
            .shadow(
                elevation = 4.dp,
                shape = RoundedCornerShape(8.dp)
            )
    ) {
        ColumnTexts()
    }
}

@Composable
fun BoxExample() {

    val modifier = Modifier
        .fillMaxWidth()
        .height(250.dp)
        .background(Color.LightGray)


    Box(
        modifier = modifier

    ) {

        // This is the one at the bottom
        Text(
            text = "First",
            modifier = Modifier
                .background(Color(0xFF1976D2))
                .size(200.dp),
            color = Color.White,
        )

        // This is the one in the middle
        Text(
            text = "Second",
            modifier = Modifier
                .background(Color(0xFF2196F3))
                .size(150.dp),
            color = Color.White
        )

        // This is the one on top
        Text(
            text = "Third ",
            modifier = Modifier
                .background(Color(0xFF64B5F6))
                .size(100.dp),
            color = Color.White
        )
    }
}

@Composable
fun BoxShadowAndAlignmentExample() {

    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
            .background(Color.LightGray)
            .padding(8.dp)
    ) {

        Box(
            modifier = Modifier
                .shadow(
                    elevation = 4.dp,
                    shape = RoundedCornerShape(8.dp)
                )
        ) {
            // This is the one at the bottom
            Text(
                text = "First",
                modifier = Modifier
                    .background(Color(0xFFFFA000))
                    .size(200.dp),
                color = Color.White
            )
        }

        Box(
            modifier = Modifier
                .shadow(
                    elevation = 8.dp,
                    shape = RoundedCornerShape(8.dp)
                )
                .align(Alignment.TopEnd)

        ) {
            // This is the one in the middle
            Text(
                text = "Second",
                modifier = Modifier
                    .background(Color(0xFFFFC107))
                    .size(150.dp),
                color = Color.White
            )
        }


        val modifier = Modifier
            .shadow(
                elevation = 4.dp,
                shape = RoundedCornerShape(8.dp)
            )
            .align(Alignment.BottomStart)

        Box(
            modifier = modifier

        ) {
            // This is the one on top
            Text(
                text = "Third ",
                modifier = Modifier
                    .background(Color(0xFFFFD54F))
                    .size(100.dp),
                color = Color.White
            )
        }
    }
}

@Composable
fun WeightExample() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
    ) {
        Row {
            Text(
                text = "Row1", modifier = Modifier
                    .background(Color(0xFFFF9800))
                    .padding(4.dp)
            )

            // 🔥 This spacer fills space between Row1 and space other than Row2, and Row3
            Spacer(modifier = Modifier.weight(1f))

            Text(
                text = "Row2", modifier = Modifier
                    .background(Color(0xFFFFA726))
                    .padding(4.dp)
            )
            Text(
                text = "Row3", modifier = Modifier
                    .background(Color(0xFFFFB74D))
                    .padding(4.dp)
            )
        }

        Column(modifier = Modifier.height(200.dp)) {
            Text(
                text = "Column1", modifier = Modifier
                    .background(Color(0xFF8BC34A))
                    .padding(4.dp)
            )

            Spacer(modifier = Modifier.weight(1f))
            Text(
                text = "Column2", modifier = Modifier
                    .background(Color(0xFF9CCC65))
                    .padding(4.dp)
            )
            Text(
                text = "Column3", modifier = Modifier
                    .background(Color(0xFFAED581))
                    .padding(4.dp)
            )
        }
    }
}

@Composable
fun WeightAndSpacerExample() {

    // This is parent modifier
    val modifier = Modifier
        .fillMaxWidth()
        .height(100.dp)
        .background(Color.LightGray)

    val rowModifier = Modifier
        .fillMaxHeight()
        .background(Color(0xFFA1887F))
        .padding(4.dp)

    Row(modifier = modifier) {

        Text(
            fontSize = 12.sp,
            text = "Weight 2",
            modifier = rowModifier.weight(2f)
        )

        // Spacer creates a space with given modifier width or height based on which scope(row/column) it exists
        Spacer(modifier = modifier.weight(1f))

        Text(
            fontSize = 12.sp,
            text = "Weight 3",
            modifier = rowModifier.weight(3f)
        )

        Spacer(modifier = modifier.weight(1f))

        Text(
            fontSize = 12.sp,
            text = "Weight 4",
            modifier = rowModifier.weight(4f)
        )
    }

    // This spacer is for column which behaves as padding below this component
    Spacer(modifier = Modifier.height(16.dp))
}

@Composable
fun Text(text: String) {
    Text(text = text, fontSize = 16.sp, modifier = Modifier.padding(8.dp))
}

@Composable
fun SubTitleTxt(text: String) {
    Text(text = text, fontSize = 14.sp, modifier = Modifier.padding(8.dp))
}

@Composable
fun Header(text: String) {
    Text(text = text, fontSize = 20.sp, modifier = Modifier.padding(8.dp))
}

@Preview(showBackground = true)
@Preview("dark", uiMode = Configuration.UI_MODE_NIGHT_YES)
@Preview(device = Devices.PIXEL_C, showBackground = true)
@Composable
private fun Preview() {
    CallingAllFunction()
}





