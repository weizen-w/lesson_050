import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Task3 {

  public static void main(String[] args) {
//    Задача 3.
//    Прочитать с клавиатуры сначала количество записей в телефонной книге, а затем сами записи (номер телефона и имя).
//    Сохранить эти записи в словаре (телефон (строка) - имя (строка)).
//    Спросить имя для удаления.
//    Удалить из словаря все телефоны, имя для которых совпадает с указанным.
//    Вывести получившийся словарь.
    Scanner scanner = new Scanner(System.in);
    Map<String, String> telBook = new HashMap();
    System.out.print("Введите кол-во записей в телефонной книге: ");
    int n = scanner.nextInt();
    scanner.nextLine();
    for (int i = 0; i < n; ++i) {
      System.out.println("Введите " + (i + 1) + "-ую запись.");
      System.out.print("Введите номер телефона: ");
      String tel = scanner.nextLine();
      System.out.print("Введите имя: ");
      String name = scanner.nextLine();
      telBook.put(tel, name);
    }
    System.out.println("Записи в телефонной книге: " + telBook);
    System.out.print("Введите имя для удаления: ");
    String nameToRemove = scanner.nextLine();
    List<String> keyToRemove = new ArrayList<>();
    for (String str : telBook.keySet()) {
      if (telBook.get(str).equals(nameToRemove)) {
        keyToRemove.add(str);
      }
    }
    for (String str : keyToRemove) {
      telBook.remove(str);
    }
    System.out.println("После удаления: " + telBook);
  }
}
