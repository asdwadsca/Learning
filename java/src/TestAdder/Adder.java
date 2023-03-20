package TestAdder;

class Adder {
    private Adder(){}

    public static float sum(float[]f){
        float temp=0.0f;
        for(int i=0;i<f.length;i++){
            temp=temp+f[i];
        }
        return temp;
    }

    public static int sum(int[]k){
        int temp=0;
        for(int i=0;i<k.length;i++){
            temp=temp+k[i];
        }
        return temp;
    }
}
class TestAdder{
    public static void main(String[]args){
        //Adder a=new Adder();

        int[]x={2,34,12,45,23,41,1};
        for(int i=0;i< x.length;i++){
            if(i== x.length-1)
                System.out.print(x[x.length-1]+"=");
            else
                System.out.print(x[i]+"+");
        }
        System.out.println(Adder.sum(x));

        float[]y={2.34f,23.34f,12.45f,234.45f,10f};
        for(int i=0;i<y.length;i++){
            if(i==y.length-1)
                System.out.print(y[y.length-1]+"=");
            else
                System.out.print(y[i]+"+");
        }
        System.out.println(Adder.sum(y));
    }
}
