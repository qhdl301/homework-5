package homework5;
import java.awt.print.Printable;
import java.util.*;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class TriangleStars {
Scanner s= new Scanner(System.in);
int num;
String queqe;

	void input(){
           do{
        	   this.queqe=" ";
        	   System.out.println("직각삼각형의 왼쪽여백과 높이 입력(q입력하면 리스트로): ");
        	   if(s.hasNextInt()){
        		   num=s.nextInt();
        		   if(num!=0){
        			   for(int j=0; j<=5; j++){
        			   for(int i=j; i<=num; i++){
        					   System.out.print(" ");
        				   }
        				for(int i=0; i<j; i++){   
        				System.out.print("*");   
        			   }
        			   System.out.println();
        			   }
        		   }
        		   else print();
        	   }else{
        		   this.queqe=s.next();
        	   }
           }while(!queqe.equals("q"));
           
	}
	void print(){
		System.out.println("잘못입력하셨습니다.");
	}
}
