package com.example.noteapp.domain.util

/**
 * Created by quangnh
 * Date: 10/7/2022
 * Time: 11:45 AM
 * Project NoteApp
 */
sealed class NoteOrder(val orderType: OrderType) {
    class Title(orderType: OrderType): NoteOrder(orderType)
    class Date(orderType: OrderType): NoteOrder(orderType)
    class Color(orderType: OrderType): NoteOrder(orderType)
}
