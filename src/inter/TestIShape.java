package inter;

import java.awt.*;

public class TestIShape {
    public static void main(String[]args){
        IShape i1 = new Circle(20);
        IShape i2 = new Rectangle(20, 15);
        IShape i3 = new Circle(30);
        IShape[] list = {i1, i2, i3};
        for(IShape shape: list){
            System.out.println("Dien tich:" + shape.getArea());
            System.out.println("Chu vi:" + shape.getPerimeter());
        }
    }
}
