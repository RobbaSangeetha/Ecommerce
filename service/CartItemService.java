package com.example.finalJpa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.finalJpa.repository.CartItemRepository;
import com.example.finalJpa.user.CartItem;

@Service
public class CartItemService {

	@Autowired
	private CartItemRepository cartItemRepository;
	public CartItem addToCart(CartItem cart) {
        return cartItemRepository.save(cart);
    }

	 
 
}