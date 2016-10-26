package homework5;
import java.util.*;

public class IsoscelesTriangleStars {
Scanner s= new Scanner(System.in);
int num;
String queqe;

	void input(){
		do{
     	   this.queqe=" ";
     	   System.out.println("이등변삼각형 높이 입력(q입력하면 리스트로): ");
     	   if(s.hasNextInt()){
     		   num=s.nextInt();
     		   if(num!=0){
     			   for(int j=0; j<num; j++){
     			   for(int i=0; i<num-j; i++){
     					   System.out.print(" ");
     				   }
     				for(int a=0; a<=j*2; a++){   
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