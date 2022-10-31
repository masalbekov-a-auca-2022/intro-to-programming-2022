public class Problem01 {
    public static void main(String[] args) {
        double result = 0;

        result += 0.1;
        result += 0.1;
        result += 0.1;
        result += 0.1;
        result += 0.1;
        result += 0.1;
        result += 0.1;
        result += 0.1;
        result += 0.1;
        result += 0.1;

        if (result - 1 <= 0.0000000000000001){
            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }
    }
}
// Компьютер используя двоичный код не способен корректно вычислять дробные чилса из-за чего возможна ошибка
