public class ThirdLesson {
    public static void main(String[] args) {
        // Loop!?

        // for loop
        /*
        for(counter;condition;counter change) {
        }
         */
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello world!");
        }
        for (int i = 1; i <= 5; i++) {

            System.out.println(1);

        }

        String[] arrayOfNames = {"Edgars", "Vika", "Serjoga", "Johhny"};

        for (int i = 0; i < arrayOfNames.length; i++) {
            System.out.println(arrayOfNames[i]);
        }
        for (String name : arrayOfNames) {
            System.out.println(name);
        }

        String[] countries = {
                "United States",
                "Canada",
                "United Kingdom",
                "Germany",
                "France",
                "Australia",
                "Japan",
                "India",
                "China",
                "Brazil"
        };

        // Goal : Find Japan in our array!

        for (int i = 0; i < countries.length; i++) {
            if (countries[i].equals("Japan")) {
                System.out.println("KUDASAI");
                break;

            }
            System.out.println(countries[i]);
        }
        int[] firstArray = {1, 2, 3, 4, 5, 7, 4};
        int[] secondArray = {3, 4, 5, 6, 7, 10, 20};
        int[] thirdArray = {5, 6, 7, 8, 9, 1, 2};


        for (int numberOfFirstArray : firstArray) {
            for (int numberOfSecondArray : secondArray) {
                for (int numberOfThirdArray : thirdArray) {
                    if (numberOfFirstArray == numberOfSecondArray && numberOfSecondArray == numberOfThirdArray) {
                        System.out.println(numberOfThirdArray);
                    }
                }
            }
        }
        int number = 51;
        boolean isEven = number % 2 == 0;
        System.out.println(isEven);

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        int x = 1;
        int summa = 0;
        while (x <= 5) {
            summa = summa + x;
            x++;
        }
        System.out.println("Summa:" + summa);
        int y = 0;
        while (y <= 20) {
            System.out.println(y + " ");
            y = y + 2;


        }
        int z = 1;
        do {
            System.out.println(z);
            z++;
        } while (z <= 5);

    }
}
