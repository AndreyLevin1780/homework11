import java.time.LocalDate;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        System.out.println("");
        System.out.println("Задание N1");

        printIsYearLeap(2000);

        System.out.println("");
        System.out.println("Задание N2");

        printAppVersion (2, 2024);

        System.out.println("");
        System.out.println("Задание N3");

        int deliveryDays =calculateTimePeriod(800);
        if (deliveryDays != -1) {
            System.out.println("Вашу карту доставят за " + deliveryDays);
        } else {
            System.out.println("Доставка карты на такое расстояние невозможна.");
        }
    }

    public static void printIsYearLeap(int year) {

        if (year < 1584) {
            System.out.println("До 1584 года понятия високосного года не существовало.");
        } else if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год високосный.");
        } else {
            System.out.println(year + " год не високосный.");
        }
    }

    public static void printAppVersion(int oSystem, int deviceYear) {

        int currentYear = LocalDate.now().getYear();
        if (oSystem == 0 || deviceYear == currentYear) {
            System.out.println("Необходимо установить версию для IOS");
        } else if (oSystem == 0 || deviceYear<currentYear) {
            System.out.println("Необходимо установить облегченную версию для IOS");
        } else if (oSystem == 1 || deviceYear == currentYear) {
            System.out.println("Необходимо установить версию для Android");
        } else if (oSystem == 1 || deviceYear<currentYear) {
            System.out.println("Необходимо установить облегченную версию для IOS");
        }

    }

    public static int calculateTimePeriod (int deliveryDistance) {
        if (deliveryDistance < 0 || deliveryDistance > 100) {
            return -1;
        }
        int timePeriod = 1;
        if (deliveryDistance >= 20 && deliveryDistance <= 59) {
        timePeriod++;
        } else if (deliveryDistance >= 60 && deliveryDistance <= 99) {
            timePeriod = timePeriod + 2;
        }
        return timePeriod;
    }
}