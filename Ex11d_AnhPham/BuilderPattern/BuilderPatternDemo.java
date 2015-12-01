package BuilderPattern;

/**
 * Created by DuyAnhPham on 06/10/15.
 */
public class BuilderPatternDemo {

    public static void main(String[] args){
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.printf("Total Cost: %.3f\n", vegMeal.getCost());

        System.out.println();

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("Non-Veg Meal");
        nonVegMeal.showItems();
        System.out.printf("Total Cost: %.3f\n", nonVegMeal.getCost());
    }
}
