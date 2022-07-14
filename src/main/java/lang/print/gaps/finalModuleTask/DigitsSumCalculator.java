package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
        int fourth = number/1000;
        int third = (number - fourth * 1000) / 100;
        int second = (number - fourth * 1000 - third * 100) / 10;
        int first =(number - fourth * 1000 - third * 100) - second * 10;

        System.out.println(first + second + third + fourth);
    }
}
//4567

// 4 , 5, 6,