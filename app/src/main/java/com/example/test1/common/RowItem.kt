package com.example.test1.common

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.test1.model.Person
import com.example.test1.repository.PersonRepository


@Composable
fun Item (person: Person) {
    Row (
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.LightGray)
            .padding(24.dp),
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalAlignment = Alignment.CenterVertically,

    ) {
        Text(
            text = "${person.age}",
            color = Color.Black,
            fontSize = 28.sp
        )
        Text(
            text = "${person.firstName}",
            color = Color.Black,
            fontSize = 26.sp
        )
        Text(
            text = "${person.lastName}",
            color = Color.Black,
            fontSize = 26.sp
        )
    }
}

@Preview
@Composable
fun ItemPreview() {
    Item(person = Person(1, "FirstName", "LastName", 21))
}

@OptIn(ExperimentalFoundationApi::class)
@Preview(showSystemUi = true)
@Composable
fun PersonLazyColumn () {

    val sections = listOf("A", "B", "C", "D", "E", "F", "G")

    val personRepository = PersonRepository()
    val getAllData = personRepository.getAllData()

    LazyColumn (
        contentPadding = PaddingValues(all = 4.dp),
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        sections.forEach{section ->
            stickyHeader {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(Color.LightGray)
                        .padding(12.dp),
                    text = "Section $section"
                )
            }
            items(10) {
                Text(
                    text = "Item $it from the section $section",
                    modifier = Modifier.padding(12.dp)
                )
            }
        }
    }
}