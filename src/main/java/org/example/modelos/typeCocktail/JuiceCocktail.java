package org.example.modelos.typeCocktail;

import org.example.modelos.Cocktail;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class JuiceCocktail extends Cocktail {
    private String expirationDate;


    public JuiceCocktail() {
    }

    public JuiceCocktail(String name, double unitPrice, int quantity, String expirationDate) {
        super(name, unitPrice, quantity);
        this.setExpirationDate(expirationDate);
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        if (expirationDate == null || expirationDate.isEmpty()) {
            throw new IllegalArgumentException("Expiration date cannot be null or empty");
        }
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            LocalDate.parse(expirationDate, formatter);
            this.expirationDate = expirationDate;
        } catch (DateTimeParseException e) {
            throw new IllegalArgumentException("Invalid date format. Expected format is YYYY-MM-DD");
        }
    }

    @Override
    public void calculatePriceSell() {
        LocalDate currentDay = LocalDate.now();
        Long expirationDays = ChronoUnit.DAYS.between(currentDay, LocalDate.parse(this.getExpirationDate()));
        double subtotalPrice = this.getUnitPrice() * this.getQuantity();
        double discount = 0.0;

        switch (expirationDays.intValue()){
            case 3:
                discount = subtotalPrice * 0.02;
                break;
            case 2:
                discount = subtotalPrice * 0.035;
                break;
            case 1:
                discount = subtotalPrice * 0.05;
                break;
            default:
                discount = 0.0;
                break;
        }
        double totalPrice = subtotalPrice - discount;
        System.out.println("");
        System.out.println("Calculo del valor total de la venta:");
        System.out.println("");
        System.out.println("| Días para el vencimiento -> " + expirationDays);
        System.out.println("| Cantidad -> " + this.getQuantity() +  " | cocktail -> " + this.getName() + " | Descuento -> $" + discount + " | Total precio -> $" + totalPrice + " |");
        System.out.println("-----------------------------------------------------------------------------------------------------------");

    }
}
