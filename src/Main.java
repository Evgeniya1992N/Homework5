public class Main {
    public static void main(String[] args) {
        // Task 1
        String clientOS = "ios";
        if (clientOS != "ios") {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для iOS по ссылк");
    }
        //Task 2
        int clientDeviceYear = 2015;
        int phoneIssued = 2000;

        if (clientOS != "ios")
        {
            if (phoneIssued <= clientDeviceYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            if (phoneIssued <= clientDeviceYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        }
      //Task 3

        int year = 2029;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println( year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }


        // Task 4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20 ) {
            System.out.println( "Потребуется дней: " + 1);
        }
        else if (deliveryDistance > 20 && deliveryDistance <= 60 ) {
            System.out.println("Потребуется дней: " + 2);
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100 ) {
            System.out.println("Потребуется дней: " + 3);
        }
        else {
            System.out.println("доставки нет");
        }


        // Task 5
    short monthNumber = 12;
    switch (monthNumber) {
        case 1:
            System.out.println("Winter");
            break;
        case 2:
            System.out.println("Winter");
            break;
        case 3:
            System.out.println("Spring");
            break;
        case 4:
            System.out.println("Spring");
            break;
        case 5:
            System.out.println("Spring");
            break;
        case 6:
            System.out.println("Summer");
            break;
        case 7:
            System.out.println("Summer");
            break;
        case 8:
            System.out.println("Summer");
            break;
        case 9:
            System.out.println("Fall");
            break;
        case 10:
            System.out.println("Fall");
            break;
        case 11:
            System.out.println("Fall");
            break;
        case 12:
            System.out.println("Winter");
            break;
        default:
            System.out.println("Does not exist");
    }




    }
}
