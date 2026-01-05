package com.example.demo.entity.cart

import com.example.demo.entity.product.Product

data class CartItem(
    val id: String,
    val quantity: Int,
    val product: Product,
    val cart: Cart
){

}
