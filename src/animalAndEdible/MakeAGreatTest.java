package animalAndEdible;

public class MakeAGreatTest {
    public static void main(String[] args) {
        Animal animal[] = new Animal[2];
        animal[0] = new Chicken();
        animal[1] = new Tiger();
        Fruit fruit[] = new Fruit[2];
        fruit[0] = new Apple();
        fruit[1] = new Orange();

        for( Animal element: animal){
            System.out.println("*************************************");
            System.out.println(element.makeSound());
            if( element instanceof Chicken){
                Chicken chicken = (Chicken) element;
               System.out.println (chicken.howToEat());
            }
        }

        for (Fruit element: fruit){
            System.out.println("*************************************");
            System.out.println(element.howToEat());
        }

    }
}
