public class FoodType {
    public static void main(String[] args) {
        for(String meal : args) {
            if(meal.equals("Pork")) {
                System.out.println("Meat");
            } else if (meal.equals("Apple")) {
                System.out.println("Fruit");
            } else if (meal.equals("Potato")) {
                System.out.println("Vegetable");
            } else if (meal.equals("Salmon")) {
                System.out.println("Fish");
            } else {
                System.out.println("no such type of food");
            }
        }
    }
}