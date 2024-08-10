package org.example.modelos;

import java.util.List;

public class Cocktail {
    private String name;
    private double price;
    private List<String> ingredients;
    private double alcoholContent;
    private String glassType;
    private boolean isAlcoholic;
    private String garnish;
    private String preparationMethod;
    private int servingSize;


    public Cocktail() {
    }

    public Cocktail(String name, double price, List<String> ingredients, double alcoholContent, String glassType, boolean isAlcoholic, String garnish, String preparationMethod, int servingSize) {
        this.name = name;
        this.price = price;
        this.ingredients = ingredients;
        this.alcoholContent = alcoholContent;
        this.glassType = glassType;
        this.isAlcoholic = isAlcoholic;
        this.garnish = garnish;
        this.preparationMethod = preparationMethod;
        this.servingSize = servingSize;
    }

    public String getName() {
        return name;
    }

    public void setName(String nombre) {
        this.name = nombre;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double precio) {
        this.price = precio;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public double getAlcoholContent() {
        return alcoholContent;
    }

    public void setAlcoholContent(double alcoholContent) {
        this.alcoholContent = alcoholContent;
    }

    public String getGlassType() {
        return glassType;
    }

    public void setGlassType(String glassType) {
        this.glassType = glassType;
    }

    public boolean isAlcoholic() {
        return isAlcoholic;
    }

    public void setAlcoholic(boolean alcoholic) {
        isAlcoholic = alcoholic;
    }

    public String getGarnish() {
        return garnish;
    }

    public void setGarnish(String garnish) {
        this.garnish = garnish;
    }

    public String getPreparationMethod() {
        return preparationMethod;
    }

    public void setPreparationMethod(String preparationMethod) {
        this.preparationMethod = preparationMethod;
    }

    public int getServingSize() {
        return servingSize;
    }

    public void setServingSize(int servingSize) {
        this.servingSize = servingSize;
    }
}
