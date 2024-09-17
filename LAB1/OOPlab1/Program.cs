using System;
namespace OOPlab1 {
    class Program {
        static void Main(string[] args) {
            Animal dog = new Animal();
            dog.animalName = "Cziko";
            dog.Feed(1.0);
            dog.PrintWeight();
            
            dog.takeForAWalk();
            dog.PrintWeight();
            
            Human patryk = new Human();
            patryk.FirstName = "Patryk";
            patryk.LastName = "Sobczak";
            patryk.Pet = dog;
            
            Console.Write("Insert your salary: ");
            patryk.Salary = decimal.Parse(Console.ReadLine()!);
            
            Car porsche = new Car();
            porsche.Make = "Porsche";
            porsche.Model = "Panamera";
            porsche.Value = 999900;
            porsche.Color = "Black";
            porsche.HorsePower = 330;
            
            patryk.Phone = new Phone(
                "onePlus",
                "8Pro",
                2.3,
                "Android");
            Console.WriteLine(patryk.Phone.Model);
            
            Console.WriteLine(porsche.ToString());
        }
    }
}
