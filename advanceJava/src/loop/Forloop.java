package loop;

public class Forloop {

	public static void main(String[] args) {
        int num =100;
		int temp = 0;
		boolean isPrime=true;
		for (int i = 2; i <=num/2; i++) {
			temp = num%i;
         if(temp==0) {
        	isPrime =false;
        	break;
         }
      }
		if(isPrime==true) {
			System.out.println("Number is prime");
		}
		else {
			System.out.println("Number is not prime");
		}
	}
}