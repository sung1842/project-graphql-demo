package com.example.demo.resolver

import com.example.demo.Service.ProductService
import com.example.demo.Service.UserService
import com.example.demo.entity.SearchResult
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class SearchResolver(
    private val productService: ProductService,
    private val userService: UserService
) {

    @QueryMapping
    fun search(
        @Argument keyword: String
    ): List<SearchResult>{
        return productService.getProducts().filter { it.name.contains(keyword) } +
                userService.getUsers().filter { it.name.contains(keyword) }
    }
}