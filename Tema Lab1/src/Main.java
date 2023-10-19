
public class Main {
    public static void main(String[] args) {
        int month_days[] = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        String months[] = {"Ianuarie", "Februarie", "Martie", "Aprilie", "Mai", "Iunie", "Iulie", "August", "Septembrie", "Octombrie", "Noiembrie", "Decembrie"};

        // 1. Afișați una sub cealaltă luna și numărul de zile corespunzător
        System.out.println("1. Luna și numărul de zile:");
        for (int id = 0; id < months.length; id++) {
            System.out.println(months[id] + ": " + month_days[id]);
        }

        // 2. Afișați lunile care au 31 de zile
        System.out.println("\n2. Lunile cu 31 de zile:");
        for (int id = 0; id < months.length; id++) {
            if (month_days[id] == 31) {
                System.out.println(months[id]);
            }
        }

        // 3. Afișați lunile care au sub 31 de zile (și numărul lor)
        System.out.println("\n3. Lunile cu mai puțin de 31 de zile:");
        for (int id = 0; id < months.length; id++) {
            if (month_days[id] < 31) {
                System.out.println(months[id] + ": " + month_days[id]);
            }
        }

        // 4. Afișați numărul total de zile al lunilor care au sub 31 de zile
        int totalzilesub31 = 0;
        for (int id = 0; id < months.length; id++) {
            if (month_days[id] < 31) {
                totalzilesub31 = month_days[id]+totalzilesub31;
            }
        }
        System.out.println("\n4. Numărul total de zile al lunilor cu mai puțin de 31 de zile: " + totalzilesub31);

        // 5. Afișați primele 3 caractere din fiecare lună
        System.out.println("\n5. Primele 3 caractere din fiecare lună:");
        for (int id = 0; id < months.length; id++) {
            String abbreviatedMonth = months[id].substring(0, 3);
            System.out.println(abbreviatedMonth);
        }
    }
}