package com.example.demo.resolver

import com.example.demo.entity.cart.Cart
import com.example.demo.Service.CartService
import com.example.demo.input.AddCartItemInput
import com.example.demo.input.AddUserInput
import com.example.demo.input.DeleteCartItemInput
import org.springframework.graphql.data.method.annotation.Argument
import org.springframework.graphql.data.method.annotation.MutationMapping
import org.springframework.graphql.data.method.annotation.QueryMapping
import org.springframework.stereotype.Controller

@Controller
class CartResolver(
    private val cartService: CartService
) {
    @QueryMapping
    fun getUserCart(
        @Argument userId: String
    ): Cart {
        return cartService.getUserCart(userId)
    }

    @MutationMapping
    fun addCartItem(
        @Argument addCartItemInput: AddCartItemInput
    ): Cart{
        return cartService.addCartItem(addCartItemInput)
    }

    @MutationMapping
    fun deleteCartItem(
        @Argument deleteCartItemInput: DeleteCartItemInput
    ): Cart{
        return cartService.deleteCartItem(deleteCartItemInput)
    }
}