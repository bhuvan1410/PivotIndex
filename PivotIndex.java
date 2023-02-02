public class PivotIndex {

    public static int pivotIndex(int[] nums) {



        int totalSum = 0;
        int rightSum = 0;
        int leftSum = 0;

        for(int i =0; i<nums.length;i++){
            totalSum += nums[i];
        }


        for(int i = 0; i<nums.length; i++){
            rightSum = totalSum-nums[i] -leftSum;

            if(leftSum == rightSum)
                return i;

            leftSum += nums[i];

        }

        return -1;

    }

    public static void main(String[] args){

        // [1,7,3,6,5,6]
        // [1,2,3]
        // [2,1,-1]

        int[] array1 = new int[6];

        array1[0] = 1;
        array1[1] = 7;
        array1[2] = 3;
        array1[3] = 6;
        array1[4] = 5;
        array1[5] = 6;


        int[] array2 = new int[3];

        array2[0] = 1;
        array2[1] = 2;
        array2[2] = 3;

        int[] array3 = new int[3];
        array3[0]=2;
        array3[1]=1;
        array3[2]=-1;



        System.out.print("The first array: ");
        for(int i =0; i<array1.length; i++){
            System.out.print(array1[i]+",");
        }

        int pIndex1 = pivotIndex(array1);

        System.out.print(" the pivot index for this array is "+pIndex1);

        System.out.print("The second array: ");



    }
}
