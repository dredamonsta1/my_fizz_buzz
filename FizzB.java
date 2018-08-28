// public class FizzB {
//   public String fizzBuzz(int number) {
//     for (int i = 1; i <= 100; i++) {
//         if (i % 15 == 0) {
//             System.out.println("FizzBuzz");
//         } else if (i % 3 == 0) {
//             System.out.println("Fizz");
//         } else if (i % 5 == 0) {
//             System.out.println("Buzz");
//         } else {
//             System.out.println(String.valueOf(i));
            // return int.valueOf("number");
    // fizzbuzz logic here
//       }
//     }
//   }
// }

// public class FizzB {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 100; i++) {
//             if (i % 15 == 0) {
//                 System.out.println("FizzBuzz");
//             } else if (i % 3 == 0) {
//                 System.out.println("Fizz");
//             } else if (i % 5 == 0) {
//                 System.out.println("Buzz");
//             } else {
//                 System.out.println(String.valueOf(i));
//             }
//         }
//     }
// }

public class FizzB {

    //a class *variable*, not a class
    public static int counter;

    //checking if a multiple of 3
    public static boolean isFizz(int number) {
        return number % 3 == 0; //no need for if
    }

    //checking if a multiple of 5
    public static boolean isBuzz(int number) {
        return number % 5 == 0; //no need for if
    }

    public static void main(String[] args) {
        for (counter = 1; counter <= 100; ++counter) {
            if (isFizz(counter) && isBuzz(counter)) { //reuse the methods
                System.out.println("FizzBuzz");
            } else if (isFizz(counter)) { //no need for "== true"
                System.out.println("Fizz");
            } else if (isBuzz(counter)) { //no need for "== true"
                System.out.println("Buzz");
            } else {
                System.out.println(counter);
            }
        }
    }
}
