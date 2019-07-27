package 数组;

public class FindNumberAppearanceOnceInArray {
    //异或
    public void FindNumberAppearanceOnceInArray(int[] arr) {
        int[] a = new int[2];
        int xorresult = 0;
        for (int i = 0; i < arr.length; i++) {
            xorresult = arr[i] ^ xorresult;
        }
        int index = FindIndexOf1(xorresult);
        for (int i = 0; i < arr.length; i++) {
            if (((arr[i] >> index) & 1) == 1) {
                a[0] = a[0] ^ arr[i];
            } else {
                a[1] = a[1] ^ arr[i];
            }
        }
        System.out.print(a[0]+" "+a[1]);
    }

    public int FindIndexOf1(int n) {
        int index = 0;
        while ((n & 1) == 0) {
            index++;
            n = n >> 1;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr={2,2,3,4,5,5};
        FindNumberAppearanceOnceInArray f=new FindNumberAppearanceOnceInArray();
        f.FindNumberAppearanceOnceInArray(arr);
    }
}



