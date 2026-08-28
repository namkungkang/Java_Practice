import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
     int [] array1 = new int[10];
     array1[1] = 10;
     array1[9] =20;
     System.out.println(array1.length);

     int[] array3 = {1,2,3,4};

     System.out.println(array3[3]);

     System.out.println(array1[9]);

     int[] array4 = new int[100];
     array4[0] = 1;
     array4[1] = 2;

     int[] array5 = new int[10];

     for (int i =0;i<10; i++){
         array5[i] = i;
     }

     int[] iarray = new int[10];
     int sum = 0;

     for(int i=0; i<iarray.length; i++) {
         iarray[i] = i;
        sum = sum + iarray[i];

     }
        System.out.println(sum);


        //2차원 배열
        int [] [] array9 = new int[3][4];
        array9[0][0] = 10;
        array9[1][2] = 101;

        System.out.println(array9[1][2]);

    }
;


}