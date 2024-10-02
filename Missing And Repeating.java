
class Solve {

    int[] findTwoElement(int arr[]) {

        int n = arr.length;
        int[] result = new int[2]; 

        for (int i = 0; i < n; i++) {

            int absVal = Math.abs(arr[i]);

            if (arr[absVal - 1] < 0) {

                result[0] = absVal; 
            } else {
                arr[absVal - 1] = -arr[absVal - 1];

            }

        }


        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                result[1] = i + 1;

                break;

            }

        }
        return result;

    }

}
