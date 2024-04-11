package com.example.test1.repository

import com.example.test1.model.Person

class PersonRepository {
    fun getAllData() : List<Person> {
        return listOf(
            Person(
                id = 1,
                firstName = "FirstName1",
                lastName = "LastName1",
                age = 21
            ),
            Person(
                id = 2,
                firstName = "FirstName2",
                lastName = "LastName2",
                age = 21
            ),
            Person(
                id = 3,
                firstName = "FirstName3",
                lastName = "LastName3",
                age = 21
            ),
            Person(
                id = 4,
                firstName = "FirstName4",
                lastName = "LastName4",
                age = 21
            ),
            Person(
                id = 5,
                firstName = "FirstName5",
                lastName = "LastName5",
                age = 21
            )
        )
    }
}