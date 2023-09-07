public class Triangle{
    private int length,width,height;

    Triangle(){
        length=18;
        width=26;
        height=32;
    }
    Triangle(int length,int width,int height){
        this.height=height;
        this.width=width;
        this.length=length;

    }
    int calculateArea(){
        return length*width*height;
    }
    int calculateParametr() {
        return length+width+height;
    }


    void setLength(int lenght){
        this.length=lenght;
    }
    void setWidth(int width){
        this.width=width;
    }
    void setHeight(int height){
        this.height=height;
    }
    void getLength(){
        System.out.println(length);
    }
    void getWidth(){
        System.out.println(width);
    }
    void getHeight(){
        System.out.println(height);
    }
    public static void main(String[] args) {
        Triangle t1=new Triangle(3,5,6);
        Triangle t2=new Triangle();
        System.out.println("hello result triange one");
        System.out.println(t1.calculateArea());
        System.out.println(t1.calculateParametr());

        System.out.println("results of triangle two");
        System.out.println(t2.calculateParametr());
        System.out.println(t2.calculateArea());;


    }


}