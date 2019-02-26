package SS2BT5;

import java.util.Scanner;

public class DeleteValueInArray {
    public static void main(String[] args) {
        int arr[] = new int[10];
        arr[0] = 10;
        arr[1] = 4;
        arr[2] = 6 ;
        arr[3] = 7;
        arr[4] = 8;
        Scanner scn = new Scanner(System.in);
        System.out.println("Mời nhập vào giá trị cần xóa : ");
        int index = scn.nextInt();

        if (index < 0 || index >arr.length) {
            System.out.println("Bạn nhập sai nên không thể xóa");
        }else {
            deleteValue(arr, index);
            xuatMang(arr);
        }
    }
    private static void deleteValue(int arr[] , int index) {
        arr[index] =0;
        for (int i = index +1 ; i < arr.length ; i++){
            int temp1 = arr[i-1];
            arr[i-1] = arr[i];
            arr[i] = temp1;
        }

    }
    private static void xuatMang(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }

}
