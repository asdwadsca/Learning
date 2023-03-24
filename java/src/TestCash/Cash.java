package TestCash;
class Cash {
    private float lendAmount;
    private int lendYear;

    private final float THREE_YEAR_INTEREST_RATE=0.07F;
    private final float FIVE_YEAR_INTEREST_RATE=0.08F;
    private final float TEN_YEAR_INTEREST_RATE=0.10F;

    public Cash(float lendAmount,int lendYear){
        this.lendAmount=lendAmount;
        this.lendYear=lendYear;
    }

    private float compensateAmount(){
        if(lendYear==3)
            return lendAmount*lendYear*THREE_YEAR_INTEREST_RATE+lendAmount;
        else if (lendYear==5)
            return lendAmount*lendYear*FIVE_YEAR_INTEREST_RATE+lendAmount;
        else if(lendYear==10)
            return lendAmount*lendYear*TEN_YEAR_INTEREST_RATE+lendAmount;
        else{
            System.out.println("贷款年限只能是3年、5年或10年！");
            System.exit(-1);
            return 0.0f;
        }
    }
    public void showCompensateAmount(){
        System.out.println("共贷款"+lendAmount+"元，"+lendYear+"年后的偿还金为"+compensateAmount()+"元");
    }
}
class TestCash{
    public static void main(String[]args){
        Cash c1=new Cash(2000.0f,3);
        c1.showCompensateAmount();

        Cash c2=new Cash(10000.0f,5);
        c2.showCompensateAmount();

        Cash c3=new Cash(10000.0f,10);
        c3.showCompensateAmount();
    }
}
