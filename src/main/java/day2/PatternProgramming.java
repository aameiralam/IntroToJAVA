package day2;

public class PatternProgramming {
    public static void main(String[] args) {

        // Pattern Programming
//   0 1 2 3 4
// 0 * * * * *
// 1 * * * * *
// 2 * * * * *
// 3 * * * * *
// 4 * * * * *

//for(int i = 0; i<5; i++){
//    for( int k=0; k<5; k++){
//        System.out.print("*");
//
//    }
//    System.out.println();
//}

//   0 1 2 3 4
// 0 * * * * *
// 1 * * * *
// 2 * * *
// 3 * *
// 4 *




for(int s = 0; s<5; s++){
    for( int d=5-s; d>0; d--){
        System.out.print("*");

    }
    System.out.println();
}




//   0 1 2 3 4
// 0 *
// 1 * *
// 2 * * *
// 3 * * * *
// 4 * * * * *



for(int i = 0; i<5; i++){
    for( int k=0; k<i+1; k++){
        System.out.print("*");

    }
    System.out.println();
}



























        }

    }
