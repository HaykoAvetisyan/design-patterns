package solid.liskov_substitution;

public class LiskovTest {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2,3);
        useIt(rectangle);
        Rectangle square = new Square();
        square.setWidth(5);
        useIt(square);
    }

    static void useIt(Rectangle r){
        int width = r.getWidth();
        r.setHeight(10);

        System.out.println("Expected area of" + (width*10) + " got " + r.getArea());
    }
}
