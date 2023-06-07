public class NumberArrays {
    public static void main(String[] args) {
        int i = getRandomNumber(0, 2000);
        int n = findMostSignificantBit(i);
        int[] m1 = findMultiplesInRange(i, Short.MAX_VALUE, n);
        int[] m2 = findNonMultiplesInRange(Short.MIN_VALUE, i, n);

        System.out.println("i: " + i);
        System.out.println("n: " + n);
        System.out.println("Multiples:");
        printArray(m1);
        System.out.println("Non-multiples:");
        printArray(m2);
    }
    private static int getRandomNumber(int min, int max) {
        return min + (int) (Math.random() * (max - min + 1));
    }
    private static int findMostSignificantBit(int number) {
        return (int) (Math.log(number) / Math.log(2)) + 1;
    }
    private static int[] findMultiplesInRange(int start, int end, int n) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i % n == 0) {
                count++;
            }
        }

        int[] multiples = new int[count];
        int index = 0;
        for (int i = start; i <= end; i++) {
            if (i % n == 0) {
                multiples[index] = i;
                index++;
            }
        }

        return multiples;
    }
    private static int[] findNonMultiplesInRange(int start, int end, int n) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (i % n != 0) {
                count++;
            }
        }

        int[] nonMultiples = new int[count];
        int index = 0;
        for (int i = start; i <= end; i++) {
            if (i % n != 0) {
                nonMultiples[index] = i;
                index++;
            }
        }

        return nonMultiples;
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
