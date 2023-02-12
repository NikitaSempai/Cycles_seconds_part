public class Main {

    public static void main(String[] args) {
        tasks();
    }

    public static void tasks() {
//        task1();
//        task2();
//        task3();
//        task4();
//        task5();
//        task6();
//        task7();
//        task8();
    }

    public static void task1(){
        System.out.println("First task:");
        int totalSum = 2459000;
        int ourSum = 0;
        int month = 0;
        while(ourSum < totalSum){
            ourSum += 15000;
            month +=1;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + ourSum + " рублей");
        }
    }

    public static void task2(){
        System.out.println("Second task:");
        int number = 1;
        for(; number < 11; number++){
            System.out.print(number + " ");
        }
        number = 10;
        System.out.println("");
        while(number != 0){
            System.out.print(number + " ");
            number--;
        }
    }

    public static void task3(){
        System.out.println("\nThird task");
        int populationY = 12_000_000;
        int fertilityOnThousand = 17;
        int deathOnThousand = 8;
        int year = 1;
        do {
            populationY = populationY + (((populationY / 1000) * fertilityOnThousand) - ((populationY / 1000) * deathOnThousand));
            System.out.println("Год " + year + ", численность населения составляет " + populationY);
            year++;
        }while(year != 11);
    }

    public static void task4(){
        System.out.println("Fourth task");
        int startBalance = 15_000;
        int expectedBalance = 12_000_000;
        int month = 1;
        do{
            startBalance = startBalance + ((startBalance / 100)*7);
            System.out.println("Месяц " + month + ", сумма накоплений составляет " + startBalance);
            month++;
        }while(startBalance <= expectedBalance);
        System.out.println("Всего потребовалось " + (month - 1) + " месяцев");
    }

    public static void task5(){
        System.out.println("Fifth task");
        int startBalance = 15_000;
        int expectedBalance = 12_000_000;
        int month = 0;
        do{
            month++;
            startBalance = startBalance + ((startBalance / 100)*7);
            if(month % 6 == 0){
                System.out.println("Месяц " + month + ", сумма накоплений составляет " + startBalance);
            }
        }while(startBalance <= expectedBalance);
        System.out.println("Всего потребовалось " + (month) + " месяцев");
    }
    public static void task6(){
        System.out.println("Sixth task");
        int month = 0;
        int startBalance = 15_000;
        for(int i = 0; i < 9 * 12; i++){
            startBalance = startBalance + ((startBalance / 100)*7);
            month++;
            if (month % 6 == 0){
                System.out.println("Месяц " + month + ", сумма накоплений равна " + startBalance);
            }
        }
        System.out.println("Количество месяцев " + month);
    }

    public static void task7(){
        System.out.println("Seventh task");
        int fridayNumber = 7;
        int daysInMonth = 31;
        int currentData = fridayNumber;
        do{
            System.out.println("Сегодня пятница, " + currentData + "-е число. Необходимо подготовить отчет");
            currentData += 7;

        }while(currentData <= daysInMonth);
    }

    public static void task8(){
        System.out.println("Eighth task");
        int year = 2023;
        int cometYear = 79;
        int beforeCurrentYear = year - 200;
        int afterCurrentYear = year + 100;
        int weNeedThreeDates = 0;
        while (weNeedThreeDates != 3){
            switch (weNeedThreeDates){
                case 0 : System.out.println(beforeCurrentYear + cometYear);
                    weNeedThreeDates++;
                    break;
                case 1 :  System.out.println(beforeCurrentYear + (cometYear * 2));
                    weNeedThreeDates++;
                    break;
                case 2: System.out.println(afterCurrentYear - cometYear);
                    weNeedThreeDates++;
                    break;
                default:
                    break;
            }
        }

    }

}