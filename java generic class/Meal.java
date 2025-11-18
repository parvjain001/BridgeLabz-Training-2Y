interface MealPlan {
    String getPlanName();
}
class VegetarianMeal implements MealPlan {
    public String getPlanName() {
        return "Vegetarian Meal Plan";
    }
}
class VeganMeal implements MealPlan {
    public String getPlanName() {
        return "Vegan Meal Plan";
    }
}
class KetoMeal implements MealPlan {
    public String getPlanName() {
        return "Keto Meal Plan";
    }
}
class HighProteinMeal implements MealPlan {
    public String getPlanName() {
        return "High Protein Meal Plan";
    }
}
class Meal<T extends MealPlan> {
    private T mealType;
    Meal(T mealType) {
        this.mealType = mealType;
    }
    T getMealType() {
        return mealType;
    }
    static <T extends MealPlan> void generateMealPlan(T meal) {
        System.out.println("Personalized Meal Plan Generated: " + meal.getPlanName());
    }
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());
        Meal<KetoMeal> ketoMeal = new Meal<>(new KetoMeal());
        Meal<HighProteinMeal> highProteinMeal = new Meal<>(new HighProteinMeal());
        generateMealPlan(vegMeal.getMealType());
        generateMealPlan(veganMeal.getMealType());
        generateMealPlan(ketoMeal.getMealType());
        generateMealPlan(highProteinMeal.getMealType());
    }
}
