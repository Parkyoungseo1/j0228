package t3_homework;

/*
 2번 : 두개의 숫자를 입력받아서 두개 숫자 사이에 값들을 모두 더하는 프로그램을 작성하되, 
 이때 5개항씩 그 결과를 출력시켜주시오.(마지막에 남은 값이 있으면 그합까지도 마지막에 출력할수 있어야함)
 여기서 두개의 숫자는 임의의 숫자를 입력할수 있기에 첫번째숫자가 더 큰 숫자가 먼저 입력될수도 있다.
 */
import java.util.Scanner;
public class homework2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int s = 0, d = 0 , i = 0, t = 0;
		
		System.out.print("첫번째 숫자를 입력하시오 ");
		s = sc.nextInt();
		System.out.print("두번째 숫자를 입력하시오 ");
		d = sc.nextInt();
		
		while(s < d || d > s) {
		i = i + 1;
		t = t + i;
		}
	}
}
