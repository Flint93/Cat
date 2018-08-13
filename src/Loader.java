import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Loader
{
    public static void main(String[] args) throws IOException
    {

        try
        {
            System.out.println(Cat.getCount());
            Cat cat111 = new Cat(2000.0);
            System.out.println(Cat.getCount());
            cat111.meow();
            System.out.println(cat111.getWeight());
            System.out.println(Cat.getCount() + " but the cat is " + cat111.getStatus());
            cat111.feed(15000.0);
            System.out.println(Cat.getCount() + " but the cat is " + cat111.getStatus());

        //создаём котов, для третьего кота значение вема получаем из консоли
        //Cat cat1 = new Cat();
        Cat cat2 = new Cat(1200.0);
        BufferedReader reader = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("Enter the weight of the cat: ");
        Cat cat3 = new Cat(Double.parseDouble(reader.readLine().trim()));
        Cat cat4 = new Cat();
        Cat cat5 = new Cat();
        int howManyMeow=0;

        System.out.println(cat2.getWeight());
        System.out.println(cat3.getWeight());
        System.out.println(cat4.getWeight());
        System.out.println(cat5.getWeight());
        System.out.println(cat2.getStatus());
        System.out.println(cat3.getStatus());
        System.out.println(cat4.getStatus());
        System.out.println(cat5.getStatus());

        //выводим в консоль количество живых котов
        System.out.println("Live cats: " + Cat.getCount());

        //делаем кота cat1 дубликатом кота cat2
        Cat cat1 = new Cat(cat2);
        System.out.println(cat1.getWeight());
        System.out.println(cat2.getWeight());
        System.out.println("Live cats: " + Cat.getCount());
        cat1.meow();
        System.out.println(cat1.getWeight());
        System.out.println(cat2.getWeight());

        //кормим котов и проверяем их вес и вес съеденной ими еду
        cat1.feed(1000.0);
        System.out.println(cat1.getWeight());
        System.out.println(cat1.getHowMuchFood());
        cat1.feed(cat2.getWeight());
        System.out.println(cat1.getWeight());
        System.out.println(cat1.getHowMuchFood());

        //отпровляем кота в туалет и после проверяем его вес
        cat2.goToTheToilet();
        System.out.println(cat2.getWeight());

        //заставляем кота мяукать пока он не умрёт
        while (!cat1.getStatus().equals("Dead"))
        {
         cat1.meow();
         howManyMeow++;
        }
        System.out.println(howManyMeow);

        //убиваем несколько котов и проверяем, то что количество живых котов становится меньше
        System.out.println("Live cats: " + Cat.getCount());
        cat5.feed(-1000000.0);
        System.out.println(cat5.getStatus());
        System.out.println(cat5.getStatus());
        System.out.println(cat5.getStatus());
        System.out.println("Live cats: " + Cat.getCount());
        cat4.feed(-1000000.0);
        System.out.println(cat4.getStatus());
        System.out.println(cat4.getStatus());
        System.out.println(cat4.getStatus());
        System.out.println("Live cats: " + Cat.getCount());

        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }
    }
}