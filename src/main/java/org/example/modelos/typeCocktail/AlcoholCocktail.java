package org.example.modelos.typeCocktail;

import org.example.modelos.Cocktail;

public class AlcoholCocktail extends Cocktail {
    private String type;

    public AlcoholCocktail() {
    }

    public AlcoholCocktail(String name, double unitPrice, int quantity, String type) {
        super(name, unitPrice, quantity);
        this.setType(type);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        if(!type.equals("Premium") && !type.equals("Base")){
            throw new IllegalArgumentException("Type only can be Premium or Base");
        }
        this.type = type;
    }

    @Override
    public void calculatePriceSell() {
        double totalPrice = this.getUnitPrice() * this.getQuantity();
        System.out.println("");
        System.out.println("Calculo del valor total de la venta:");
        System.out.println("");
        System.out.println("| Cantidad -> " + this.getQuantity() +  " | cocktail -> " + this.getName() + " | Total precio -> $" + totalPrice + " |");
        System.out.println("-----------------------------------------------------------------------------------------------------------");
    }
}
