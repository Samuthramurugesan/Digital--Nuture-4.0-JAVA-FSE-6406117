public class ControlStructuresDemo {

    public static void main(String[] args) {

        // 1. if-else structure
        int marks = 75;
        if (marks >= 90) {
            System.out.println("Grade: A");
        } else if (marks >= 75) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Fail");
        }

        // 2. switch case
        int day = 3;
        switch (day) {
            case 1:
                System.out.println("Day: Monday");
                break;
            case 2:
                System.out.println("Day: Tuesday");
                break;
            case 3:
                System.out.println("Day: Wednesday");
                break;
            default:
                System.out.println("Day: Unknown");
        }

        // 3. for loop (print even numbers from 1 to 10)
        System.out.println("Even numbers (for loop):");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0)
                System.out.print(i + " ");
        }
        System.out.println();

        // 4. while loop (print numbers from 1 to 5)
        System.out.println("Numbers (while loop):");
        int i = 1;
        while (i <= 5) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();

        // 5. do-while loop (print numbers from 1 to 3)
        System.out.println("Numbers (do-while loop):");
        int j = 1;
        do {
            System.out.print(j + " ");
            j++;
        } while (j <= 3);
        System.out.println();

        // 6. break and continue
        System.out.println("Numbers (using break and continue):");
        for (int k = 1; k <= 10; k++) {
            if (k == 5)
                continue; // skip 5
            if (k == 8)
                break; // stop loop at 8
            System.out.print(k + " ");
        }
        System.out.println();
    }
}
