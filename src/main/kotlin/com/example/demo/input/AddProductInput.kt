package com.example.demo.input

import com.example.demo.entity.product.ProductType

class AddProductInput(
    val name: String,
    val price: Double,
    val productType: ProductType,

    val warrantyPeriod: String?,
    val size: String?
) {
}