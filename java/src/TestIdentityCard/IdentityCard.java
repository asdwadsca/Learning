package TestIdentityCard;

class IdentityCard {
    private String identityNumber;

    public IdentityCard(){}

    public IdentityCard(String identityNumber){
        this.identityNumber=identityNumber;
    }
    public void setIdentityNumber(String identityNumber){
        this.identityNumber=identityNumber;
    }
    public String getIdentityNumber(){
        return identityNumber;
    }

    public String getBirthday(){
        return identityNumber.substring(6,10)+"年"+
                identityNumber.substring(10,12)+"月"+
                identityNumber.substring(12,14)+"日";
    }
    public char getSex(){
        int temp=identityNumber.codePointAt(identityNumber.length()-1)-0x0030;
        if ((temp%2)==0)
            return '男';
        else
            return '女';
    }
}


class TestIdentityCard{
    public static void main(String[]args){
        IdentityCard MyID=new IdentityCard("620104198008280510");
        System.out.println("身份证号码为："+MyID.getIdentityNumber());
        System.out.println("生日:"+MyID.getBirthday());
        System.out.println("性别:"+MyID.getSex());
    }
}


