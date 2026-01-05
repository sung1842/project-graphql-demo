package com.example.demo.entity.user

import com.example.demo.entity.SearchResult
import com.example.demo.entity.cart.Cart
import java.time.OffsetDateTime

data class User(
    val id: String,
    val name: String,
    val email: String,
    val createdAt: OffsetDateTime
): SearchResult{
    var cart: Cart? = null
}
