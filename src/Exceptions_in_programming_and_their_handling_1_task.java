class Exceptions_in_programming_and_their_handling {
    public static void divisionByZero() {
        // Напишите свое решение ниже
        int value1 = 10;
        int value2 = 5;
        try {
            int result = value1 / value2;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль");
        }
    }


    public static void numberFormatException() {
        // Напишите свое решение ниже
        String numberString = "abc";
        try {
            int number = Integer.parseInt(numberString);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка преобразования строки в число");
        }
    }
}