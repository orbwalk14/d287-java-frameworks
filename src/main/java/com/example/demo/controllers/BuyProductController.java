package com.example.demo.controllers;

import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@Controller
public class BuyProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/buyProduct")
    @Transactional
    public String buyProduct(@RequestParam("productID") Long theId, Model theModel) {
        try {
            // Attempt to find the product in the database
            Optional<Product> productToBuy = productRepository.findById(theId);

            // Check if the product exists
            if (!productToBuy.isPresent()) {
                theModel.addAttribute("errorMessage", "Product not found in catalog");
                return "confirmbuyfailure";  // Return failure view if product not found
            }
            // Get the actual product from the Optional
            Product product = productToBuy.get();
            // Check if the product is in stock
            if (product.getInv() <= 0) {
                theModel.addAttribute("errorMessage", "Product is out of stock");
                return "confirmbuyfailure"; // Return failure view if out of stock
            }
            // Decrement the inventory count
            product.setInv(product.getInv() - 1);
            // Save the updated inventory count to the database
            productRepository.save(product);

            // Add the purchased product to the model for the success view
            theModel.addAttribute("product", product);
            return "confirmbuysuccess"; // Return success view

        } catch (Exception e) {
            // Handle any unexpected errors during the purchase process
            theModel.addAttribute("errorMessage", "An error occurred while processing your purchase");
            return "confirmbuyfailure"; // Return failure view if exception occurs
        }
    }
}

