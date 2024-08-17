package org.example;

import org.example.modelos.typeCocktail.AlcoholCocktail;
import org.example.modelos.typeCocktail.JuiceCocktail;

public class Main {
    public static void main(String[] args) {
        AlcoholCocktail alcoholCocktail = new AlcoholCocktail("CocoLoco",35000,5,"Premium");
        alcoholCocktail.calculatePriceSell();

        JuiceCocktail juiceCocktail = new JuiceCocktail("Limonada de Coco",10000,3,"2024-08-17");
        juiceCocktail.calculatePriceSell();
    }
}