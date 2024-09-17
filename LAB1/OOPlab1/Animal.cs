using System;
using System.Collections.Generic;
using System.Text;

namespace OOPlab1 {
    public class Animal {
        public readonly string Species = "Canis";
        public string animalName = "Default Name";
        private double animalWeight = 3.0;
        
        public void PrintWeight() {
            Console.WriteLine("Weight of your animal is: " + animalWeight);
        }

        public void Feed(double foodWeight) {
            if(animalWeight == 0) Console.WriteLine("Your animal is dead. You have not taken good care of it.");
            else{
                animalWeight += foodWeight;
                Console.WriteLine("Thx for food, bro");
            }
        }

        public string ReturnSpeciesAndName() {
            return Species + " " + animalName;
        }

        public string ReturnNameAndOwner(string owner) {
            return animalName + " " + owner;
        }

        public void takeForAWalk() {
            if(animalWeight == 0) Console.WriteLine("Your animal is dead. Are you really trying to take a corpse for a walk?");
            else animalWeight -= 1.5;
        }
        public Animal(){
            Console.Write("What is the weight of your animal? Type the weight here: ");
            animalWeight = double.Parse(Console.ReadLine());
        }
    }
}
