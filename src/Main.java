import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите значения");
        String user_input = calc.input.nextLine();
        char[] symbol = new char[10];

        for (int i = 0; i < user_input.length(); i++) {
            symbol[i] = user_input.charAt(i);
            if (symbol[i] == '+') {
                calc.delimetr = '+';
            }
            if (symbol[i] == '-') {
                calc.delimetr = '-';
            }
            if (symbol[i] == '/') {
                calc.delimetr = '/';
            }
            if (symbol[i] == '*') {
                calc.delimetr = '*';
            }
        }
        String parser = String.valueOf(symbol);
        String[] split = parser.split("[+-/*]");
        String first_value = split[0];
        String second_value = split[1];
        String thrid_value = second_value.trim();
        calc.value_x = Roman_To_Number.roman_to_number(first_value);
        calc.value_y = Roman_To_Number.roman_to_number(thrid_value);
        if(calc.value_x < 0 && calc.value_y < 0)
            calc.if_zero = 0;
        else
        {
            calc.if_zero = calc.calc(calc.value_x, calc.value_y, calc.delimetr);
            System.out.println("Result of Roman numbers");
            String roman_numbers_result = Convert_To_Roman.converter_to_roman_number(calc.if_zero);
            System.out.println(first_value + " " + calc.delimetr + " " + thrid_value + " = " + roman_numbers_result);
            return;
        }
        calc.value_x = Integer.parseInt(first_value);
        calc.value_y = Integer.parseInt(thrid_value);
        calc.if_zero = calc.calc(calc.value_x, calc.value_y, calc.delimetr);
        System.out.println("Result of Arabian numbers");
        System.out.println(calc.value_x + " " + calc.delimetr + " " + calc.value_y + " = " + calc.if_zero);
    }
}