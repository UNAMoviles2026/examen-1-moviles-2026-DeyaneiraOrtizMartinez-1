package com.moviles.examenmoviles.data

import com.moviles.examenmoviles.R
import com.moviles.examenmoviles.model.CoworkingSpace

val mockSpaces = listOf(
    CoworkingSpace(
        id = 1,
        name = "Urban Desk",
        description = "Modern coworking space with fast internet.",
        location = "San José",
        capacity = 12,
        pricePerHour = 8.5,
        isAvailable = true,
        imageRes = R.drawable.coworkin1
    ),
    CoworkingSpace(
        id = 2,
        name = "Creative Hub",
        description = "Collaborative workspace.",
        location = "Heredia",
        capacity = 20,
        pricePerHour = 10.0,
        isAvailable = true,
        imageRes = R.drawable.coworkin2
    ),
    CoworkingSpace(
        id = 2,
        name = "Creative Hub",
        description = "Collaborative workspace.",
        location = "Heredia",
        capacity = 20,
        pricePerHour = 10.0,
        isAvailable = false,
        imageRes = R.drawable.coworking3
    )
)