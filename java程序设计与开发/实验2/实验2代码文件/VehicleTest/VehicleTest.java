import java.util.Scanner;

public class VehicleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Vehicle vehicle = new Vehicle();

       
        String kind = scanner.nextLine();
        vehicle.setKind(kind);

        int speed = scanner.nextInt();
        vehicle.setSpeed(speed);

        scanner.nextLine();

        String color = scanner.nextLine();
        vehicle.setColor(color);

    
        System.out.println(vehicle.toString());
    }
}
class Vehicle {
    private int speed;
    private String kind;
    private String color;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getKind() {
        return kind;
    }

    public String getColor() {
        return color;
    }

    public String toString() {
        return "You have a/an " + color + " " + kind +", its speed is "+speed+" km/h.";
    }
}


