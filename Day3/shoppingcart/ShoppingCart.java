package shoppingcart;

import java.util.LinkedList;

public class ShoppingCart implements Shopping{

    private LinkedList<Product> items;
    private double total;

    public ShoppingCart() {
        items = new LinkedList<>();
        total = 0;
    }

    public void addToCart(Product p) {
    	
    	
        items.add(p);
        total += p.getprice();

        System.out.println("Product added to cart.");
    }

    public void checkout() throws ShoppingCartException {

        if (items.isEmpty()) {
            throw new ShoppingCartException("Shopping Cart is Empty");
        }

        System.out.println("Products in Cart:");

        for (Product p : items) {
            System.out.println(p);
        }

        System.out.println("Cart Total = " + total);
    }
}