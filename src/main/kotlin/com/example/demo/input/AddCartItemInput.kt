package com.example.demo.input

import com.example.demo.entity.product.Product

class AddCartItemInput(
    val userId: String,
    val productId: String,
    val quantity: Int
) {

}