package org.example.modelos;

import org.example.utils.RegexValidators;
import java.util.List;


public abstract class Cocktail {
    private String name;
    private double unitPrice;
    private int quantity;
    private List<String> ingredients;
    private double alcoholContent;
    private String glassType;
    private boolean isAlcoholic;
    private String garnish;
    private String preparationMethod;
    private int servingSize;

    // Constructors
    public Cocktail() {
    }

    public Cocktail(String name, double unitPrice, int quantity) {
        setName(name); // Use the setter to validate
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    // Getters and Setters
    public String getName() {
        if (!RegexValidators.isValidName(name)) {
            throw new IllegalArgumentException("Invalid name format.");
        }
        return name;
    }

    public void setName(String name) {
        if (!RegexValidators.isValidName(name)) {
            throw new IllegalArgumentException("Invalid name format.");
        }
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        if (unitPrice < 0) {
            throw new IllegalArgumentException("Unit price cannot be negative.");
        }
        this.unitPrice = unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative.");
        }
        this.quantity = quantity;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        if (ingredients == null || ingredients.isEmpty()) {
            throw new IllegalArgumentException("Ingredients list cannot be null or empty.");
        }
        this.ingredients = ingredients;
    }

    public double getAlcoholContent() {
        return alcoholContent;
    }

    public void setAlcoholContent(double alcoholContent) {
        if (alcoholContent < 0) {
            throw new IllegalArgumentException("Alcohol content cannot be negative.");
        }
        this.alcoholContent = alcoholContent;
    }

    public String getGlassType() {
        return glassType;
    }

    public void setGlassType(String glassType) {
        if (!RegexValidators.isValidGlassType(glassType)) {
            throw new IllegalArgumentException("Invalid glass type format.");
        }
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
        if (!RegexValidators.isValidGarnish(garnish)) {
            throw new IllegalArgumentException("Invalid garnish format.");
        }
        this.garnish = garnish;
    }

    public String getPreparationMethod() {
        return preparationMethod;
    }

    public void setPreparationMethod(String preparationMethod) {
        if (!RegexValidators.isValidPreparationMethod(preparationMethod)) {
            throw new IllegalArgumentException("Invalid preparation method format.");
        }
        this.preparationMethod = preparationMethod;
    }

    public int getServingSize() {
        return servingSize;
    }

    public void setServingSize(int servingSize) {
        if (servingSize <= 0) {
            throw new IllegalArgumentException("Serving size must be positive.");
        }
        this.servingSize = servingSize;
    }

    // Abstract method
    public abstract void calculatePriceSell();
}
