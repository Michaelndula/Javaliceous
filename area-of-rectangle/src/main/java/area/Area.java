package area;

class Area {
    int width;
    int length;

    void insertDimensions(int w, int l){
        width = w;
        length = l;
    }

    void calculateArea(){
        int area;

        area = width * length;

        System.out.println(area+"cm");
    }

    void displayArea(){calculateArea();}
}

class AreaTriangle{
    public static void main(String[] args){
        Area area = new Area();

        area.insertDimensions(100, 124);

        area.displayArea();
    }
}
