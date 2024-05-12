package com.example.uicheckpoint1

import android.widget.CheckBox
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposableInferredTarget
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp



@Preview(showBackground = true)
@Composable
fun ListItemPreview(){
    ListItem("Eintrag 1")
}

@Composable
fun ListItem(singleListItemString: String) {
   //val checkedBox = false;
    //var checkedBox by mutableStateOf(false)
    /*var checkedBox: Boolean by remember {
        mutableStateOf(false)
    }*/

    var checkedBox by rememberSaveable {
        mutableStateOf(false)
    }

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                MaterialTheme.colorScheme.background,
                shape = RoundedCornerShape(16.dp)
            )
            .padding(16.dp)
            .clickable {
                /*Todo*/
            }
    ) {
        Text(
            text = singleListItemString,
            modifier = Modifier
                .align(Alignment.CenterVertically)
                .weight(1f)
        )

        Spacer(modifier = Modifier.width(6.dp))

       // CheckBoxState()
        Checkbox(
            checked = checkedBox,
            onCheckedChange = { isChecked -> checkedBox=isChecked }
        )
    }
}

/*@Composable
fun CheckBoxState () {

    var checkedBox by remember {
        mutableStateOf(false)
    }

    Checkbox(
        checked =checkedBox ,
        onCheckedChange ={isChecked -> checkedBox=isChecked}

    )
}*/