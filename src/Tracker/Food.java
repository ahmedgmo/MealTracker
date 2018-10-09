package Tracker;

import java.util.ArrayList;

class Food {
    private final String name;
    private final Category Category;
    private final double calories;
    private final double carbs;
    private final double fat;
    private final double protein;

    private final ArrayList<Category> getCategories = new ArrayList<>();


    double calculateCalories(double this.carbs, double this.fat, double this.protein){
        return (9 * fat) + (4 * carbs) + (4 * protein);
    }

    public double getCalories(){
        return this.calories;
    }

    public double getCarbs(){
        return this.carbs;
    }

    Category getCategory(){
        return this.Category;
    }

    public double getFat(){
        return this.fat;
    }

    public double getProtein(){
        return this.protein;
    }

    public String getName(){
        return this.name;
    }