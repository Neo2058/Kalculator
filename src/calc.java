import java.util.InputMismatchException;
import java.util.Scanner;

public class calc {

        static Scanner input = new Scanner(System.in);
        static int value_x, value_y;
        static char delimetr;
        static int if_zero;

        public static int calc (int first_arg, int second_arg, char delim)
        {
                int result = 0;
                switch (delim)
                {
                        case '+':
                                result = first_arg + second_arg;
                                break;

                        case '-':
                                result = first_arg - second_arg;
                                break;

                        case '*':
                                result = first_arg * second_arg;
                                break;

                        case '/':
                            try {
                                    result = first_arg / second_arg;
                                }
                            catch (ArithmeticException | InputMismatchException e)
                            {
                                    System.out.println("Exception: " + e);
                                    System.out.println("Only integer non-zero parametrs");
                                    break;
                            }
                            break;

                        default:
                                throw new IllegalArgumentException("Not right operation parametr");
                }
                return result;
        }
}
