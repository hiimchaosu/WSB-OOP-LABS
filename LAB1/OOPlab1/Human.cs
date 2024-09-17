using System;

namespace OOPlab1 {
    public class Human {
        private Car _car;
        private decimal _salary;
        DateTime updateDate = DateTime.Now;
        public string FirstName;
        public string LastName;
        public Animal Pet;
        public Phone Phone;
        public int Number;
        
        public decimal Salary {
            get{
                Console.WriteLine($"Time Modification: {updateDate}");
                return _salary;
            } set {
                if (value >= 0) {
                    _salary = value;
                    Console.WriteLine(updateDate);
                    updateDate = DateTime.Now;
                    Console.WriteLine("Your salary has been saved.");
                    Console.WriteLine("Modify time: " + updateDate);
                } else {
                    Console.WriteLine("You cannot put negative numbers here!");
                }
            }
        }
        public Car Car {
            get {
                return _car;
            } set {
                if (Salary >= _car.Value) {
                    Console.WriteLine("Not enough money to afford this car");
                }else if(_car.Equals(_car)) {
                    Console.Write("You are trying to add the same car!");
                }else {
                    _car = value;
                    Console.WriteLine("You can afford this car.");
                }
            }
        }
    }
}

