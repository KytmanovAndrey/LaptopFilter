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

import java.util.Objects;

public class Laptop {
    int memory;
    int sizeHdd;
    String os;
    String color;
    int screenSize;
    String manufacturer;
    int price;

    public Laptop(int memory, int sizeHdd, String os, String color, int screenSize, String manufacturer, int price) {
        this.memory = memory;
        this.sizeHdd = sizeHdd;
        this.os = os;
        this.color = color;
        this.screenSize = screenSize;
        this.manufacturer = manufacturer;
        this.price = price;
    }

    public int getMemory() {
        return memory;
    }

    public int getHdd() {
        return sizeHdd;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public int getScreenSize() {
        return screenSize;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int price() {
        return price;
    }

    @Override
    public String toString() {
        return "Оперативная память: " + memory + "\n"
                + "Объем HDD: " + sizeHdd + "\n"
                + "Операционная система: " + os + "\n"
                + "Цвет: " + color + "\n"
                + "Диагональ экрана: " + screenSize + "\n"
                + "Произодитель: " + manufacturer + "\n"
                + "Цена: " + price;
    }

    @Override
    public boolean equals(Object obj) {
        Laptop laptop = (Laptop) obj;
        return memory == (laptop.memory) &&
                sizeHdd == (laptop.sizeHdd) &&
                os.equals(laptop.os) &&
                color.equals(laptop.color) &&
                screenSize == (laptop.screenSize) &&
                manufacturer.equals(laptop.manufacturer) &&
                price == (laptop.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(memory, sizeHdd, os, color, screenSize, manufacturer, price);
    }
}
