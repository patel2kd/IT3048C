package com.example.mobiledevproject.dto

data class Parts( var GPU: String, var processor :String, var fan : String ){
    override fun toString(): String {
        return "$GPU $processor $fan"
    }
}