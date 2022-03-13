package assignment;

public class GcdofTwonumbers {
	public static void gcd(int divisor,int divident){
        if(divident%divisor==0){
            System.out.println(divisor);
            return;
        }
        gcd(divident%divisor,divisor);
    
    }
    public static void main(String[] args) {
        int a=4;
        int b=8;
        gcd(a,b);
    }
}
