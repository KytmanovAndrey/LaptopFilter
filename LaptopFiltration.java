//📌 Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
//        методы. Реализовать в java.
//        📌 Создать множество ноутбуков.
//        📌 Написать метод, который будет запрашивать у пользователя критерий (или критерии)
//        фильтрации и выведет ноутбуки, отвечающие фильтру. Критерии фильтрации можно
//        хранить в Map. Например:
//        “Введите цифру, соответствующую необходимому критерию:
//        1 - ОЗУ
//        2 - Объем ЖД
//        3 - Операционная система
//        4 - Цвет …
//        📌 Далее нужно запросить минимальные значения для указанных критериев - сохранить
//        параметры фильтрации можно также в Map.
//        📌 Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
//        условиям.

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;

public class LaptopFiltration {
    public static void main(String[] args) {
        Laptop laptop1 = new Laptop(4, 100, "Win7", "grey", 12, "ASUS", 400);
        Laptop laptop2 = new Laptop(8, 200, "Win10", "grey", 13, "Lenovo", 600);
        Laptop laptop3 = new Laptop(8, 200, "Mac", "white", 14, "Apple", 800);
        Laptop laptop4 = new Laptop(16, 500, "Win10", "grey", 14, "MSI", 900);
        Laptop laptop5 = new Laptop(16, 500, "Win11", "black", 15, "ASUS", 1100);
        Set<Laptop> hashSet = new HashSet<>(Arrays.asList(laptop1, laptop2, laptop3, laptop4, laptop5));
        Laptop cri = new Laptop(0, 0, "-", "-", 0, "-", 0);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    Введите цифру, соответствующую необходимому критерию или выбору:
                    1 - ОЗУ (4, 8, 16)
                    2 - Объем ЖД (100, 200, 500)
                    3 - Операционная система (Win7, Win10, Win11, Mac)
                    4 - Цвет (grey, white, black)
                    5 - Диагональ экрана (12, 13, 14, 15)
                    6 - Производитель (ASUS, Lenovo, MSI, Apple)
                    7 - Цена (400, 600, 800, 900, 1100)

                    8 - Показать ноутбуки с выбранными критериями
                    9 - Выход
                    """);
            int choice = scanner.nextInt();
            if (choice == 9) {
                break;
            }
            if (choice != 8) System.out.println("Введите минимальный критерий фильтрации:");
            if (choice == 1) {
                cri.memory = scanner.nextInt();
            }
            else if (choice == 2) {
                cri.sizeHdd = scanner.nextInt();
            }
            else if (choice == 3) {
                cri.os = scanner.next();
            }
            else if (choice == 4) {
                cri.color = scanner.next();
            }
            else if (choice == 5) {
                cri.screenSize = scanner.nextInt();
            }
            else if (choice == 6) {
                cri.manufacturer = scanner.next();
            }
            else if (choice == 7) {
                cri.price = scanner.nextInt();
            }
            else if (choice == 8) {
                for (Laptop laptop : hashSet) {
                    if ((cri.memory <= laptop.memory || cri.memory == 0) &&
                            (cri.sizeHdd <= laptop.sizeHdd || cri.sizeHdd == 0) &&
                            (cri.os.equals(laptop.os) || cri.os.equals("-")) &&
                            (cri.color.equals(laptop.color) || cri.color.equals("-")) &&
                            (cri.screenSize <= laptop.screenSize || cri.screenSize == 0) &&
                            (cri.manufacturer.equals(laptop.manufacturer) || cri.manufacturer.equals("-")) &&
                            (cri.price <= laptop.price || cri.price == 0)) {

                        System.out.println(laptop);
                        System.out.println();
                    }
                }
                System.out.println("Выполнено для сохраненных критериев. Наберите любой текст для продолжения");
                scanner.next();
            }
        }
        scanner.close();
    }
}
