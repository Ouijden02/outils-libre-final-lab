  double discounted = discountCalculator.applyCustomerDiscount(subtotal, customerType);
        discounted = discountCalculator.applyDiscountCode(discounted, discountCode);
        return taxCalculator.applyTax(discounted);
    }
}
