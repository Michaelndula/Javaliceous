package Abstract_method;

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape{
    @Override
    void draw(){System.out.println("Drawing rectangle");}
}

class Circle extends Shape{
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}

class DrawShape{
    public static void main(String[] args){
        Shape s = new Circle();
        Shape r = new Rectangle();
        s.draw();
        r.draw();
    }
}
