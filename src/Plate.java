
public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.printf("В миске осталось %d еды \n", this.food);
    }

    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

    public void addFood (int food){

        this.food = food;
        System.out.printf("В миску добавили %d еды \n", food);
    }
}