package Builder;

/**
 * Created by Andrue on 09.01.2017.
 */
public class MealBilder {
    public Meal createMegaMeal(){
        Meal meal = new Meal();
        meal.addItem(new MegaBurger());
        meal.addItem(new Coke());
        meal.addItem(new Coke());
        return meal;
    }
    public Meal createVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new SoilBurger());
        meal.addItem(new Sprite());
        return meal;
    }
}
