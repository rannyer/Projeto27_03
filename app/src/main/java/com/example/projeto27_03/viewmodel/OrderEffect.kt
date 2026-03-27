package com.example.projeto27_03.viewmodel


sealed class OrderEffect {
    data class ShowSnackbar(val message:String): OrderEffect()
}