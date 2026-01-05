package com.example.demo.entity.product

import com.example.demo.entity.SearchResult

interface Product: SearchResult {
    val id: String
    val name: String
    val price: Double
    val productType: ProductType
}