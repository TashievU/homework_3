import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        double[] num = new double[15];
        double sum = 0;
        int nums = 0;
        for (int i = 0 ; i < num.length; i++) {
            num[i] = i - 5.5;
        }
        System.out.println(Arrays.toString(num));

        for (  double numbers : num ) {
            if (numbers < 0) {
                continue;
            }
            else if (numbers > 0){
                sum += numbers;
                nums++;
            }
            System.out.println(numbers);

        }
        System.out.println("math " + sum / nums);
    }
}