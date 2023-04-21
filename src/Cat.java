
public class Cat {
    public String name;
    private int appetite;

    public boolean satiety = false;
    public Cat(String name, int appetite) {

        this.name = name;
        this.appetite = appetite;
    }

    public void eat() {

        if (!satiety) {

            System.out.printf("Кот %s кушает \n", this.name);
            this.satiety = true;

        }
        else{

            System.out.printf("Кот %s не хочет кушать \n", this.name);

        }
    }

    public int getAppetite() {
        return this.appetite;
    }

}
