package compass;

public class Main {

    public static void main(String[] args) {
        // задание 1
        int clientIos = 0;
        if (clientIos == 0) {
        }
        System.out.println("ustanovite versiy prilozhenia dly ios po ssulke");
        int clientAn = 1;
        if (clientAn == 1) {
        }
        System.out.println("ustanovite versiy prilozhenia dly android po ssulke");

        //задание 2
        int clientDeviceYear = 2014;
        if (clientDeviceYear < 2014) {
        }
        System.out.println("ustanovite oblegchenversiy prilozhenia dly ios po ssulke");
        if (clientDeviceYear > 2015) {
            System.out.println("ustanovite  prilozhenia dly ios po ssulke");
        }


        // задание 3
        int year = 2022;
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("god" + year + "visikosn");
        } else {
            System.out.println("god" + year + "nevisikosn");
        }
        // задание 4
        int deliveryDistance = 50;
        int deliveryDays = 1;
        if (deliveryDistance <=20) {
            System.out.println(" dostavka zaimet dnei " + deliveryDays);
        } else if (deliveryDistance >20 && deliveryDistance <=60) {
            System.out.println(" dostavka zaimet dnei " + (deliveryDays + 1));
        } else if (deliveryDistance >60 && deliveryDistance <=100) {
            System.out.println(" dostavka zaimet dnei " + (deliveryDays + 2));
        } else {
            System.out.println(" daleko ");
        }


        // задание 5
        int monthOfYear = 12;
        switch (monthOfYear) {
            case 12:
                System.out.println("dekabr");
            case 1:
                System.out.println("janvar");
            case 2:
                System.out.println("fevral");
            case 3:
                System.out.println("mart");
            case 4:
            case 5:
                System.out.println("vesna");
            case 6:
            case 7:
            case 8:
                System.out.println("leto");
            case 9:
            case 10:
            case 11:
                System.out.println("osen");
            default:
                System.out.println("nesyshestvyet");

        }
    }
}
