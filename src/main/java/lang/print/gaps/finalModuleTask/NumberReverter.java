package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int third = number/100; //4
        int second = (number - third * 100) / 10; //8
        int first = (number - third * 100) - (second * 10);
// 489 - 4 *100   - 80 = 9

        System.out.println(first * 100 + second * 10 + third);
    }
}
