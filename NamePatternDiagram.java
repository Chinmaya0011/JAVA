public class NamePatternDiagram {
    public static void main(String[] args) {
        printC();
        printH();
        printI();
        printN();
        printM();
        printA();
        printY();
        printA();
    }

    // Function to print 'C'
    public static void printC() {
        for (int i = 0; i < 7; i++) {
            if (i == 0 || i == 6) {
                System.out.print("  * * * * * *  "); // Top and bottom
            } else {
                System.out.print("  *           "); // Middle
            }
            System.out.println();
        }
        System.out.println();
    }

    // Function to print 'H'
    public static void printH() {
        for (int i = 0; i < 7; i++) {
            if (i == 3) {
                System.out.print("  * * * * * *  "); // Middle
            } else {
                System.out.print("  *         *  "); // Sides
            }
            System.out.println();
        }
        System.out.println();
    }

    // Function to print 'I'
    public static void printI() {
        for (int i = 0; i < 7; i++) {
            if (i == 0 || i == 6) {
                System.out.print("  * * * * * *  "); // Top and bottom
            } else {
                System.out.print("      *       "); // Middle
            }
            System.out.println();
        }
        System.out.println();
    }

    // Function to print 'N'
    public static void printN() {
        for (int i = 0; i < 7; i++) {
            if (i == 0) {
                System.out.print("  *         *  "); // Top
            } else if (i == 1) {
                System.out.print("  * *       *  "); // Slanting
            } else if (i == 2) {
                System.out.print("  *   *     *  "); // Middle slant
            } else if (i == 3) {
                System.out.print("  *     *   *  "); // More slant
            } else {
                System.out.print("  *         *  "); // Bottom
            }
            System.out.println();
        }
        System.out.println();
    }

    // Function to print 'M'
    public static void printM() {
        for (int i = 0; i < 7; i++) {
            if (i == 0) {
                System.out.print("  *         *  "); // Top
            } else if (i == 1) {
                System.out.print("  * *     * *  "); // Slant
            } else if (i == 2) {
                System.out.print("  *   * *   *  "); // More slant
            } else {
                System.out.print("  *         *  "); // Bottom
            }
            System.out.println();
        }
        System.out.println();
    }

    // Function to print 'A'
    public static void printA() {
        for (int i = 0; i < 7; i++) {
            if (i == 0) {
                System.out.print("      *       "); // Top
            } else if (i == 1) {
                System.out.print("     * *      "); // Upper slant
            } else if (i == 2) {
                System.out.print("  * * * * *   "); // Middle line
            } else {
                System.out.print("  *         *  "); // Bottom
            }
            System.out.println();
        }
        System.out.println();
    }

    // Function to print 'Y'
    public static void printY() {
        for (int i = 0; i < 7; i++) {
            if (i == 0) {
                System.out.print("  *         *  "); // Top
            } else if (i == 1) {
                System.out.print("   *       *   "); // Upper slant
            } else if (i < 5) {
                System.out.print("      *       "); // Middle
            } else {
                System.out.print("      *       "); // Bottom
            }
            System.out.println();
        }
        System.out.println();
    }
}
