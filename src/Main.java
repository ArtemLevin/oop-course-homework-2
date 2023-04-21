import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Cat Barsik = new Cat("Barsik", 5);
        Cat Persik = new Cat("Persik", 3);
        Cat Jorik = new Cat("Jorik", 7);
        Cat Murzik = new Cat("Murzik", 2);
        Cat Tolsty = new Cat("Tolsty", 10);

        Cat[] packOfCats = new Cat[] {

                Barsik,
                Persik,
                Jorik,
                Murzik,
                Tolsty

        };

        Plate plate = new Plate(15);
        plate.info();

        for(Cat cat: packOfCats){


            if (!cat.satiety & plate.getFood() >= cat.getAppetite()) {

                cat.eat();
                plate.setFood(plate.getFood() - cat.getAppetite());
                plate.info();
            }

            if (cat.satiety & plate.getFood() < cat.getAppetite()){

                System.out.print("Сколько еды Вы хотите добавить в миску? ----> ");
                Scanner input = new Scanner(System.in);
                plate.addFood(input.nextInt());
            }


        }


        for (Cat cat: packOfCats){

            if (!cat.satiety){

                System.out.printf("Кот %s голоден! \n", cat.name);
            }

            else{

                System.out.printf("Кот %s сыт! \n", cat.name);
            }
        }


    }
}