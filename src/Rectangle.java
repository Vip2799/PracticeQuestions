public class Rectangle {
    double width ;
    double height ;

    Rectangle(){
        width = 1;
        height = 1;
    }
    Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }

    public double area(){
        return width * height ;
    }

    public double perimeter(){
        return  2 * (width + height);
    }

    public void display(){
        System.out.println("Width = " + width);
        System.out.println("Height = " + height);
        System.out.println("Area = " + area());
        System.out.println("Perimeter = " + perimeter());
    }

}
