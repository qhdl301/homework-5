package homework5;
import java.util.*;

public class RectagleStars {
	Scanner s=new Scanner(System.in);	
    int num;
    String queqe;
	void input(){
        
		do{
	    this.queqe="";
		System.out.println("정사각형 크기입력: ");
		if(s.hasNextInt()){
		num=s.nextInt();
		if(num!=0){
	    	
            for(int j=1; j<=5; j++){
			for(int i=1; i<=num; i++)
	    	{
	    		System.out.print("*");
	    	}
			System.out.println();
            }
	    }
		else print();
		}else {
			this.queqe = s.next();
		}
	}while(!queqe.equals("q"));
	}
	void print(){
		System.out.println("잘못입력하셨습니다.");
	}
}