public class Main {
    public static void main(String[] args) {
        int[] integers;
        integers = new int[3];
        integers [0] = 1;
        integers [1] = 2;
        integers [2] = 3;

        for (int i=0; i<2; i++) {
            System.out.print(integers[i]+"; ");
        }
        System.out.println(integers[2]);

        double [] fractionalNumbers = {1.57, 7.654, 9.986};

        for (int i=0; i<2; i++) {
            System.out.print(fractionalNumbers[i]+"; ");
        }
        System.out.println(fractionalNumbers[2]);

        int [] arbitraryArray = {2, 4, 5, 7, 88, 105};

        for (int i=0; i<arbitraryArray.length-1; i++) {
            System.out.print(arbitraryArray[i]+"; ");
        }
        System.out.println(arbitraryArray[arbitraryArray.length-1]);
    }
}