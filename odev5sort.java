void main() {

    Random rand = new Random();
    int[] array = new int[50];

    for (int i = 0; i < array.length; i++) {
        array[i] = rand.nextInt(0, 100);
        for (int ii = 0; ii < i; ii++) {
            while (array[ii] == array[i]) {
                array[i] = rand.nextInt(0, 100);
            }
        }
    }
    System.out.println("Üretilen Sayılar:");
    for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
    }
}
