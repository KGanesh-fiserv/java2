public class AwesomeNumber {
    private int num;

    public AwesomeNumber(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    
    public static int add(AwesomeNumber a, AwesomeNumber b){
        return a.getNum() + b.getNum();
    }
    public static int subtract(AwesomeNumber a, AwesomeNumber b){
        return a.getNum() - b.getNum();
    }
}
