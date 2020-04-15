package interface_Animal_Edible;

public class Chicken extends Animal implements Edibale{

    @Override
    public String makeSound(){
        return "Chíp chíp";
    }

    @Override
    public String howToEat(){
        return "Eat fruit and meet";
    }
}
