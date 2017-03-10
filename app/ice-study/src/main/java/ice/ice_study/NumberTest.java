package ice.ice_study;

import java.math.BigDecimal;

public class NumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doPlus();
	}
	
	static void doPlus(){
		BigDecimal sum=null;
		Double a=34.0,b=56.0;
		sum=  BigDecimal.valueOf(a+b);
		System.out.println(sum);
	}

}
