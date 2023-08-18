//백준 20206번 문제 - 너의 평점은
import java.util.Scanner;

public class b25206 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //입력 받은 문자열
        String[] strArr = new String[3];
        //등급 배열
        String[] gradeArr = {"A+" , "A0", "B+", "B0", "C+", "C0", "D+", "D0", "P", "F"};
        //학점 배열
        double[] gradeScore = {4.5, 4.0, 3.5, 3.0, 2.5, 2.0, 1.5, 1.0, 0.0, 0.0};
        //전체 점수
        double totalSum = 0;
        //전체 학점
        double gradeTotal = 0;

        for(int i=0; i<20; i++) {
            String input = sc.nextLine();

            strArr = input.split(" ");

            double gradeValue = Double.parseDouble(strArr[1]); //학점
            String grade = strArr[2];   //등급

            for(int j=0; j<gradeArr.length; j++) {
                if(grade.equals(gradeArr[j])) {
                    totalSum += gradeValue * gradeScore[j];
                    if (j != 8) {
                        gradeTotal += gradeValue;
                    }
                }
            }
        }

        double average = totalSum / gradeTotal;
        System.out.printf("%.6f\n", average);
    }
}
