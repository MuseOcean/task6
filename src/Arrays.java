public class Arrays {
    public void task1_2() {
        int[] arr = {27, 75, 250, 5, 8, 4, 150};
        int max = arr[0];
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Минимальный элемент массива" + " " + min);
        System.out.println("Максимальный элемент массива" + " " + max);
    }

    public void task3_4() {
        int[] arr = {87, 75, 2, 94, 54, 120, 3, 888};
        int max = arr[0];
        int min = arr[0];
        int indexForMax = 0;
        int indexForMin = 0;
        for (int i = 0; i < arr.length; i++) {

            if (max < arr[i]) {
                max = arr[i];
                indexForMax = i;
            }
            if (min > arr[i]) {
                min = arr[i];
                indexForMin = i;
            }
        }

        System.out.println("Индекс максимального элемента массива" + " " + indexForMax);
        System.out.println("Индекс минимального элемента массива" + " " + indexForMin);
    }

    public void task5() {
        int[] arr = {45, 8, 14, 7, 24, 9};
        int oddSum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                oddSum += arr[i];
            }
        }
        System.out.println("Сумма элементов массива с нечетными индексами" + " " + oddSum);
    }

    public void task6() {
        int[] arr = {15, 7, 4, 2, 8, 9};
        int oddNumbersCount = 0;

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) {
                oddNumbersCount++;
            }
        }
        System.out.println("Количество нечетных чисел в массиве: " + oddNumbersCount);
    }

    public void task7() {
        int[] arr = {15, 7, 4, 2, 8, 9};

        int count1 = 0;
        int count2 = arr.length / 2;

        while (count1 < arr.length / 2) {
            int temp = arr[count1];
            arr[count1] = arr[count2];
            arr[count2] = temp;
            count1++;
            count2++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }

    public void task8() {
        insertSort();
        System.out.println();
        selectionSort();
        System.out.println();
        bubbleSort();


    }

    private void insertSort() {
        int[] arr = {15, 7, 4, 2, 8, 9};
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    private void selectionSort(){
        int[] arr = {15, 7, 24, 2, 38, 9};
        for (int i = 0; i < arr.length; i++) {

            int min = arr[i];
            int min_i = i;

            for (int j = i+1; j < arr.length; j++) {

                if (arr[j] < min) {
                    min = arr[j];
                    min_i = j;
                }
            }

            if (i != min_i) {
                int tmp = arr[i];
                arr[i] = arr[min_i];
                arr[min_i] = tmp;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    private void bubbleSort(){
        int[] arr = {11, 78, 24, 2, 38, 97};
        for(int i = arr.length-1 ; i > 0 ; i--){
            for(int j = 0 ; j < i ; j++){

            if( arr[j] > arr[j+1] ){
                int tmp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = tmp;
            }
         }
       }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}



