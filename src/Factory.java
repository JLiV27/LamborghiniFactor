public class Factory {

    public static void main(String[] args) {
        Factory myFactory = new Factory();
    }

    public Factory() {
        Lamborghini myLambo = new Lamborghini(); //declaring and construct
        myLambo.model = "Urus";
        myLambo.color = "Red";
        myLambo.nSeats = 4;

        Lamborghini myLambo2 = new Lamborghini(); //declaring and construct
        myLambo2.model = "Hurracain";
        myLambo2.color = "Black";
        myLambo2.nSeats = 2;

        myLambo.PrintInfo();
        System.out.println();
        myLambo2.PrintInfo();
    }
}
