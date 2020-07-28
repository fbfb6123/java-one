// 第６章 オーバーロッドとthis(コンストラクタ内の同名のコンストラクタを呼び出す処理)

public class Item {
  public Item() {
    this("B");
    System.out.println("A");
    
  }
  public Item(String str) {
    System.out.println(str);
  }
}





// 第3章 同一性と同値性

// public class Item {
//   private int num;
//   public Item(int num) {
//     this.num = num;
//   }
//   public boolean equals(Item obj) {
//     if (obj == null) {
//       return false;
//     }
//     return this.num == obj.num;
//   }
//   // public boolean equals(Object obj){
//   //   Item s = (Item) obj;
//   //   return s.num == this.num;
//   // }
// }

// equalsメソッドはオーバーライドして使うことが前提
// 






// public class Item {
//   private int num;
//   private String name;
//   public Item(int num, String name) {
//     this.num = num;
//     this.name = name;
//   }
//   public boolean equals(Object obj) {
//     if (obj == null) {
//       return false;
//     }
//     if (obj instanceof Item) {
//       Item s = (Item) obj;
//       return s.num == this.num;
//     }
//     return false;
//   }
// }

// public class Item {
//   public static void main(String[] args) {
//     int a = 11;
//     int b = 0;
//     while( b < 5) {
//       if(5 < 0) {
//         System.out.println(b);
//       }
//       a--;
//       b++;
//     }
//   }
// }


// package calcapp.logics;
// public class CalcLogic {
//   public static int tasu(int a, int b) {
//     return (a + b);
//   }
//   public static int hiku(int a, int b) {
//     return (a - b);
//   }
// }


// package ex6;
// public class Item {
//   public static int num = 0;
//   public static void print() {
//     System.out.println(num);
//   }
// }





// public class Sub {
//   String content = "Subクラスのフィールド値です。";
 
// }