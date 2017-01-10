package Builder;

/**
 * Created by Andrue on 10.01.2017.
 */
public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBilder mealBilder = new MealBilder();
        Meal vegMeal = mealBilder.createVegMeal();
        Meal megaMeal = mealBilder.createMegaMeal();
        vegMeal.ShowMeal();
        megaMeal.ShowMeal();
    }
}
