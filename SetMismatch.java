public class SetMismatch {
    public class mismatch {
        public static void main(String[] args) {
            int[] arr={4,3,2,7,8,2,3,1,1};
            System.out.println(findduplicate(arr));

        }
        static int[] findduplicate(int[] arr) {
            int i = 0;
            while (i < arr.length) {
                int correct = arr[i] - 1;
                if (arr[i] != arr[correct]) {
                    swap(arr, i, correct);
                } else {
                    i++;
                }
            }
            for (int index = 0; index < arr.length; index++) {
                if (arr[index] != index + 1) {
                 return new int[] { arr[index] ,index + 1};
                }

            }
            return new int[] { -1, -1};
        }
        static void swap ( int[] arr, int first, int second){
            int temp = arr[first];
            arr[first] = arr[second];
            arr[second] = temp;
        }
    }

}
