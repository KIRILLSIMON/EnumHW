package enums;

public class TestCar {
    public static void main(String[] args) {
        testGeneric();
    }

    private static void testGeneric() {
        Car audi=new Car("audi",
                "Q8",1000,
                "SEDAN","5","600","N1",
                "M1",BodyType.HETCHBACK);
        System.out.println(audi);

        Truck B901=new Truck("super TRUCK",
                "B-901",901,"PICKUP","One",
                "five hundred th.kg",
                "N3","M1");
        System.out.println(B901);
    }

    private static void testEnums() {
        Bus mersedes=new Bus(
                "Mercedes","Connecto",6.7,"UNIVERSAL","54",
                "7.5tonn","N1","M3"
        );
        System.out.println(mersedes);

    }
}
