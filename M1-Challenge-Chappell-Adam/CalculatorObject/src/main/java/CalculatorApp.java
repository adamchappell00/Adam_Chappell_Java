public class CalculatorApp {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        calc.add(1,1);                      //   1 + 1          add(int a, int b)

        calc.subtract(23, 52);              //  23-52           subtract(int a, int b)

        calc.multiply(34,2);                //  34 * 2          multiply(int a, int b)

        calc.divide(12,3);                  //  12 / 3          divide(int a, int b)

        calc.divide(12,7);                  //  12 / 7          divide(int a, int b)  ** With Uneven Result **

        calc.add(3.4,2.3);                  //  3.4 - 2.3       add(double a, double b)

        calc.multiply(6.7, 4.4);            //  6.7 * 4.4       multiply(double a, double b)

        calc.subtract(5.5,0.5);             //  5.5 - 0.5       subtract(double a, double b)

        calc.divide(10.8, 2.2);             //  10.8 / 2.2      divide(double a, double b)
    }
}
