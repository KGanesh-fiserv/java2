import java.util.ArrayList;

public class Calculator implements Calculatable {
    private ArrayList <String> arr = new ArrayList<String>();
    @Override
    public Integer add(Integer number1, Integer number2) {
        arr.add(number1 + " + " + number2 + " = " + (number1+number2));
        return number1 + number2;
    }

    @Override
    public Integer subtract(Integer number1, Integer number2) {
        arr.add(number1 + " - " + number2 + " = " + (number1-number2));
        return number1 - number2;
    }

    @Override
    public Integer multiply(Integer number1, Integer number2) {
        arr.add(number1 + " * " + number2 + " = " + (number1*number2));
        return number1 * number2;
    }

    @Override
    public Integer divide(Integer number1, Integer number2) {
        arr.add(number1 + " / " + number2 + " = " + (number1/number2));
        return number1 / number2;
    }

    @Override
    public String getHistory() {
        String history= "[";
        for(String a : arr){
            history += a + ", ";
        }
        history += "]";
        return history;
    }
    
}
