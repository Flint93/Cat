
public class Cat
{
    private Double originWeight;
    private Double weight;
    private Double minWeight;
    private Double maxWeight;
    private Double howMuchFood;
    private Boolean alive;
    private static Integer count = 0;

    public boolean getStatusAlive()
    {
        return alive;
    }
    //comment_2
    //comment_1
    public Cat()
    {
            weight = 1500.0 + 3000.0 * Math.random();
            originWeight = this.weight;
            minWeight = 1000.0;
            maxWeight = 9000.0;
            howMuchFood = 0.0;
            alive = true;
            count++;
    }

    Cat(Double weight)
    {
        this();
        if (this.weight < 1500 || this.weight > 4500)
        {
            System.out.println("Неверно указан вес кошки, он должен быть от 1500 г до 4500 г");
        }
        else
        {
            this.weight = weight;
        }

    }

    public void meow()
    {
        weight = weight - 1;
        System.out.println("Meow");
        getStatus();
    }

    public void feed(Double amount)
    {
        weight = weight + amount;
        howMuchFood += amount;
        getStatus();
    }

    public void drink(Double amount)
    {
        weight = weight + amount;
        getStatus();
    }

    public Double getWeight()
    {
        return weight;
    }

    public String getStatus()
    {
        if(weight < minWeight)
        {
            if (this.alive)
            {
                count--;
                this.alive = false;
            }
            return "Dead";
        }
        else if(weight > maxWeight)
        {
            if (this.alive)
            {
                count--;
                this.alive = false;
            }
            return "Exploded";
        }
        else if(weight > originWeight)
        {
            return "Sleeping";
        }
        else {
            return "Playing";
        }
    }

    public Double getHowMuchFood()
    {
        return howMuchFood;
    }

    public void goToTheToilet()
    {
        weight = weight - 5;
        System.out.println("pee");
    }

    public static Integer getCount()
    {
        return count;
    }

    public static void tvix(Cat cat1, Cat cat2)
    {
        cat1.weight=cat2.weight;
        cat1.originWeight=cat2.originWeight;
    }
}