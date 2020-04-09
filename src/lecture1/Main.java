package lecture1;

public class Main {
    public static void main(String[] args){
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();

        Counter2 counter21 = new Counter2();

        counter1.showCounter();
        counter2.showCounter();
        counter3.showCounter();
        counter21.showCounter();
    }
}

class Counter {
    private static int counter = 0;
    public Counter(){
        counter ++;
    }

    public void showCounter(){
        System.out.println("Counter: " + counter);
    }
}

class Counter2 {
    private static int counter = 0;
    public Counter2(){
        counter ++;
    }

    public void showCounter(){
        System.out.println("Counter2: " + counter);
    }
}

