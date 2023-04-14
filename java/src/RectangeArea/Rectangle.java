package RectangeArea;

class Rectangle {
    private int length;
    private int width;

    public Rectangle(){
        length=1;
        width=1;
    }
    public Rectangle(int length){
        this.length=length;
        width=1;
    }
    public Rectangle(int a,int b){
        length=a;
        width=b;
    }
    public void setLength(int a){
        length=a;
    }
    public void setWidth(int b){
        width=b;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }
    public int area(){
        return length*width;
    }
}
class TestArea{
    public static void main(String[] args){
        Rectangle r0=new Rectangle();
        System.out.println("长为"+r0.getLength()+"宽为"+r0.getWidth()+"的长方形的面积为"+r0.area());

        Rectangle r1=new Rectangle();
        r1.setLength(5);
        System.out.println("长为"+r1.getLength()+"宽为"+r1.getWidth()+"的长方形的面积为"+r1.area());

        Rectangle r2=new Rectangle();
        r2.setLength(5);
        r2.setWidth(6);
        System.out.println("长为"+r2.getLength()+"宽为"+r2.getWidth()+"的长方形的面积为"+r2.area());

        Rectangle r3=new Rectangle(5);
        System.out.println("长为"+r3.getLength()+"宽为"+r3.getWidth()+"的长方形的面积为"+r3.area());

        Rectangle r4=new Rectangle(5,6);
        System.out.println("长为"+r4.getLength()+"宽为"+r4.getWidth()+"的长方形的面积为"+r4.area());
    }
}
