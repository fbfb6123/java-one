// 第5章 ２重ループ構造

public class Main {
  public static void main(String[] args) {
    int array[][] = new int[][] {{1,2},{2,3,4}};
                                //0 1   2 3 4
    int total = 0;
    for (int i = 0; i < array.length; i++) {
                  // i < 3

                  
      for (int j = i; j < array[i].length; j++) {
                 //0  0 <  2               0+1=1
                 //0  1 <  2               1+1=2    ここまでが１回目の内側のループ




        total += array[i][j];
        //0 + 0+1=1
        //1 + 1+2=3     １回目

      }
    }
    System.out.println(total);
  }
}





// 第5章 ループ構造while文

// public class Main {
//   public static void main(String[] args) {
//     int a = 11;
//     int b = 0;
//     while ( b < 5 ) {
//       if ( 5 < 0 ) {
//         System.out.println(b);
//       }
//       a--;
//       b++;
//     }
//   }
// }




// 第4章 配列の作成と使用

// public class Main {
//   public static void main(String[] args) {
//     int[] array = new int[0];
//     System.out.println(array);
//   }
// }


// public class Main {
//   public static void main(String[] args) {
//     int a = 10;
//     int b = a++ + a + a-- - a-- + ++a;
//     System.out.println(b);
//   }
// }



// public class Main {
//   public static void main(String[] args) {
//     Item a = new Item();
//     Item b = new Item();
//     b.setNum(20);
//     System.out.println(a.getNum());
//   }
// }












// package calcapp.main;
// public class Calc {
//     public static void main (String[] args) {
//         int a = 10;
//         int b = 2;
//         int total = calcapp.logics.CalcLogic.tasu(a, b);
//         int delta = calcapp.logics.CalcLogic.hiku(a, b);
//         System.out.println("足すと" + total + "、引くと" + delta);
//     }  
// }








// import static ex6.Sample.num;
// import static ex6.Sample.print;


// public class Main {
//   public static void main(String[] args) {
//     num = 10;
//     print();
//   }
// }


// public class Main {
// public static void main(String args[]) {
//     Sub sub = new Sub();
//     System.out.println(sub.content);
//   }
// }