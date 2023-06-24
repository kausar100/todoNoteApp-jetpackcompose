package com.kausar.noteappcomposecleanarchitecture.domain.util

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}