import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task0();
        task1();
        task2();
        task3();
    }

    private static void task0() {

    }

    private static void printNumberTask(int num) {
        System.out.println("Задание №" + num);
    }

    private static void isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    private static void task1() {
        printNumberTask(1);
        isLeapYear(1322);
    }

    private static void checkDevice(int clientOS, int clientDeviceYear) {
        boolean iOS = clientOS == 0;
        boolean android = clientOS == 1;
        int yearNow = LocalDate.now().getYear();
        if (clientDeviceYear == yearNow && iOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear == yearNow && android) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear < yearNow && iOS) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < yearNow && android) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Неизвестное устройство");
        }
    }

    private static void task2() {
        printNumberTask(2);
        checkDevice(1, 2021);
    }

    private static int calculateDeliveryTime(int deliveryDistance) {
        int deliveryDay;
        if (deliveryDistance <= 20) {
            deliveryDay = 1;
        } else if (deliveryDistance > 20 && deliveryDistance < 60) {
            deliveryDay = 2;
        } else {
            deliveryDay = ((deliveryDistance - 21) / 40) + 1;
        }
        return deliveryDay;
    }

    private static void task3() {
        printNumberTask(3);
        System.out.println("Количество дней для доставки: " + calculateDeliveryTime(441));
    }
}


