using System;
public class Car {
    public string Make;
    public string Model;
    public decimal Value;
    public string Color;
    public int HorsePower;
    public override string ToString()
    {
        return "Make: " + Make + " Model: " + Model + " Value: " + Value + " Color: " + " HorsePower: " + HorsePower;
    }
    public override bool Equals(object obj)
    {
        return Make.Equals(obj);
    }
}

