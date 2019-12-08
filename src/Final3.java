/** Итоговая задача №3
 * Напишите программу конвертер валют. Программа должна переводить рубли в доллары по текущему курсу.
 * Пользователь вводит текущий курс и количество рублей.
 * Итоговое значение должно быть округлено до двух знаков после запятой.
 * (Пример для теста работы программы: Курс доллара = 67,55, Количество рублей: 1000, Итого: 14,80 долларов)
 */
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Scanner;
import static java.math.BigDecimal.ROUND_HALF_EVEN;

public class Final3 {
    public static void main (String [] args) throws IOException{
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите курс валюты: ");
        double rate = scanner.nextDouble();

        System.out.print("Введите сумму в руб: ");
        double rubles = scanner.nextDouble();
        BigDecimal a = new BigDecimal(rubles / rate);
        BigDecimal roundOff = a.setScale(2, ROUND_HALF_EVEN);
        System.out.println("Итого: " + roundOff);
    }
}
