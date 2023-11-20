package day01;

public class Ex03 {
    public static void main(String[] args) {
        //System.out.println("*");
        //System.out.printf("*");
        //System.out.println(); // 다음줄로 넘어가는 코드

        // 1. 다음과 같이 정사각형을 출력하는 코드 작성

        //  다음 코드를 5번 반복
        //      *을 printf로 5번 반복해서 출력
        //      다음줄로 넘어가는 코드
        /*
        ----------
         *****
         *****
         *****
         *****
         *****
        ----------
         */

        for (Integer i = 0; i < 5; i++) {
            {
                for (Integer x = 0; x < 5; x++) {
                    System.out.printf("*");
                }
                System.out.println();
                // 2. 다음과 같이 삼각형을 출력하는 코드 작성
                //  다음 코드를 5번 반복
                //      *을 printf로 반복 횟수만큼 반복해서 출력
                //      다음줄로 넘어가는 코드
        /*
        ----------
         *
         **
         ***
         ****
         *****
        ----------
         */

                for (Integer y = 0; y < 5; y++) {
                    {
                        for (Integer x = 0; x < y; x++) {
                                System.out.printf("*");
                        }
                        System.out.println();
                        // 3. 다음과 같이 삼각형을 출력하는 코드 작성
                        //  다음 코드를 5번 반복
                        //      공백을 printf로  점점 줄어들게(4,3,2,1,0) 출력
                        //      *을 printf로 2씩 커지면서 반복 횟수만큼 반복해서 출력
                        //      다음줄로 넘어가는 코드
        /*
        ----------
             *
            ***
           *****
          *******
         *********
         ----------
         */

                    }
                }
            }
        }
    }
}