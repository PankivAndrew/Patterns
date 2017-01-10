package Builder;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Andrue on 09.01.2017.
 */
public class Meal {
    private List<Item> items = new ArrayList<>();
    public void addItem(Item item){
        items.add(item);
    }
    public float getCost(){
        float price = 0.0f;
        for (Item item : items){
            price += item.price();
        }
        return price;
    }
    public void ShowMeal(){
        for (Item item: items){
            System.out.println("Name: " + item.name());
            System.out.println("Packed: " + item.packing().pack());
            System.out.println("Price: " + item.price());
        }
    }
}
