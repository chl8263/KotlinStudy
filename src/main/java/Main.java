public class Main {

    public static void main(String[] args) throws NoSuchMethodException {
        System.out.println("Java Main");

        Car car = new Car();

        byte[] bytes  = new byte[1024];
        bytes.getClass();
        System.out.println(bytes.getClass());
    }
}

class Car {

    public Car(){
        String a = "hello~";
    }

    public String drive(){
        return "Drive ~~";
    }
}