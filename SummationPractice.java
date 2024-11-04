import java.util.ArrayList;

public class SummationPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(10);
        numbers.add(15);

        int calcSum = summation(numbers);
        System.out.println(calcSum);


    }
    public static int summation (ArrayList<Integer>list){
        int sum = 0;
        for(int number:list){
            sum+=number;
        }
return sum;
    }

}
