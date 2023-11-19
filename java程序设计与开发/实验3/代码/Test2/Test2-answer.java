import java.util.Scanner;







public class Main {



    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);



        double x = scanner.nextDouble();



        double y = scanner.nextDouble();



        double r = scanner.nextDouble();



        double h = scanner.nextDouble();







        Cylinder cyl = new Cylinder(x,y,r,h);



        System.out.println("圆心坐标为(" + cyl.getX() + "," + cyl.getY() + ")," );



        System.out.println("圆半径为" + cyl.getR() + ", 高度为" + cyl.getH() +"," );



        System.out.println("表面积为" + cyl.area() + ", 体积为" + cyl.volume());



    }



}







class Circle {



    private double x;



    private double y;



    private double r;







    public Circle() {



    }







    public Circle(double x, double y, double r) {



        this.x = x;



        this.y = y;



        this.r = r;



    }







    public void setX(double x) {



        this.x = x;



    }



    public double getX() {



        return (x);



    }







    public void setY(double y) {



        this.y = y;



    }



    public double getY() {



        return (y);



    }







    public void setR(double r) {



        this.r = r;



    }



    public double getR() {



        return (r);



    }







    public double perimeter() {



        return 2 * Math.PI * r;



    }







    public double area() {



        return Math.PI * r * r;



    }



}







class Cylinder extends Circle {



    private double h;







    public Cylinder() {



    }







    public Cylinder(double x, double y, double r, double h) {



        super(x, y, r);



        this.h = h;



    }







    public void setH(double h) {



        this.h = h;



    }



    public double getH() {



        return (h);



    }







    public double area() {



        return perimeter() * h + 2 * super.area();



    }







    public double volume() {



        return super.area() * h;



    }



}

