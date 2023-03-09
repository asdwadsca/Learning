package TestEquation;

class Equation {
        private float a;
        private float b;

        public Equation(){
        }

        public Equation(float a,float b){
            this.a=a;
            this.b=b;
        }

        public void setA(float a){
            this.a=a;
        }

        public float getA(){
            return a;
        }

        public void setB(float b){
            this.b=b;
        }

        public float getB() {
            return b;
        }
        private boolean hasRoot(){
            return a !=0;
        }
        private float root(){
            return (-b)/a;
        }
        public void showEquation(){
            if (hasRoot()){
                if (b>0)
                    System.out.println("\n 方程式是："+a+"x+"+b+"=0,\t 其解为 x="+root());
                else if (b<0)
                    System.out.println("\n 方程式是："+a+"x-"+Math.abs(b)+"=0,\t 其解为x="+root());
                else
                    System.out.println("\n 方程式是："+a+"x=0,\t\t 其解为x="+0);
            }
            else
                System.out.println("\n因为系数a=0,\t\t方程式无效！");
        }
}

class TestEquation{
    public static void main(String[]args){
        Equation e1=new Equation(1.4f,2.8f);
        e1.showEquation();

        Equation e2=new Equation();
        e2.setB(-4);
        e2.showEquation();

        e2.setA(e1.getB());
        e2.showEquation();

        e2.setB(0);
        e2.showEquation();
    }
}