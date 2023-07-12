package operators;

public class allOperators {

	public static void main(String[] args) {
		int i=20;
		int j=5;
		// Arthmetic Operators
		System.out.println(i+j);
		System.out.println(i-j);
		System.out.println(i*j);
		System.out.println(i/j);
		System.out.println(i%j);
		// Unary operators
		System.out.println(++i);
		System.out.println(i++);
		System.out.println(++i);
		System.out.println(--i);
		System.out.println(i--);
		// Relational operators
		System.out.println(i==j);
		System.out.println(i!=j);
		System.out.println(i<j);
		System.out.println(i>j);
		System.out.println(i<=j);
		System.out.println(i>=j);
		//Conditional Operators
		System.out.println(i<j&&i!=j);
		System.out.println(i<j||i!=j);
		 //AND---true=true==true
		// true=false==false
		// false=false==false
		// false=true==false
		//Assignment Operators
		i+=5;
		System.out.println(i);
		i-=5;
		System.out.println(i);
		i*=5;
		System.out.println(i);
		i/=5;
		System.out.println(i);
		i%=5;
		System.out.println(i);

	}

}
