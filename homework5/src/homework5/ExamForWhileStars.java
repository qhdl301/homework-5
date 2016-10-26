package homework5;
import java.util.*;
public class ExamForWhileStars {

	public static void main(String[] args) {
		int num;
		Scanner s= new Scanner(System.in);// TODO Auto-generated method stub

	
	do{
		System.out.println("1.정사각형 별찍기");
		System.out.println("2.직삼각형 별찍기");
		System.out.println("3.이등변 삼각형 별찍기");
		System.out.println("4.다이아몬드 별찍기");
		System.out.println("5.종료하기");
		System.out.println("원하는 메뉴는>>");
	
	num=s.nextInt();
	if(num == 1)
	new RectagleStars().input();
	if(num == 2)
	new TriangleStars().input();
	if(num == 3)
	new IsoscelesTriangleStars().input();
	if(num == 4)
	new DiamondStars().input();	
	
	}while(num != 5);{
		System.out.println("종료되었습니다.");
	}
}
}
