package com.example.noteapp.domain.util

/**
 * Created by quangnh
 * Date: 10/7/2022
 * Time: 11:42 AM
 * Project NoteApp
 */
sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}
