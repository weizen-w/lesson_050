import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Task2 {

  public static void main(String[] args) {
//    Задача 2.
//    Прочитать с клавиатуры сначала количество целых чисел, а затем сами числа.
//    Сохранить эти числа в множестве.
//    Удалить из множества все нечётные числа.
//    Вывести получившееся множество.
    Scanner scanner = new Scanner(System.in);
    Set<Integer> numbers = new HashSet<>();
    System.out.print("Введите кол-во чисел для записи: ");
    int n = scanner.nextInt();
    for (int i = 0; i < n; ++i) {
      System.out.print("Введите " + (i + 1) + "-ое число: ");
      int x = scanner.nextInt();
      numbers.add(x);
    }
    System.out.println("Записанные числа в множестве: " + numbers);
    Set<Integer> numbersToRemove = new HashSet<>();
    for (int x : numbers) {
      if (x % 2 != 0) {
        numbersToRemove.add(x);
      }
    }
    numbers.removeAll(numbersToRemove);
    System.out.println("После удаления нечетных чисел: " + numbers);
  }
}
