public class Array_1 {
    public static void main(String[] args) {
        int [] arr1= new  int[]{1,2,3,4,5};
        int [] arr2= new int[arr1.length];

        for(int i=0;i<arr1.length;i++){
            arr2[i]=arr1[i];
        }
        System.out.println("this is the orginal array");
        for(int i=0;i<arr1.length;i++){
            System.out.print(arr1[i]+" ");
        }
        System.out.println();

        System.out.println("This is the second array");
        for (int j=0;j<arr2.length;j++){
            System.out.print(arr2[j]+" ");
        }
    }
}
