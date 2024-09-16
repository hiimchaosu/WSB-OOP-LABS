package com.company.animals;

public class FarmAnimal extends Animal implements Edible {
    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public Double eat() {
        if (getWeight() > 0){
            double oldWeight = getWeight();
            setWeight(0.0);
            System.out.println("It was delicious ");
            return oldWeight;



        }

        System.out.println("The animal cannot be eaten");

        return getWeight();
    }
}