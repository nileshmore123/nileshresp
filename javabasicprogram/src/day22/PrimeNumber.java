package day22;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
for(int i=1;i<=50;i++) {
	int counter=0;
	for(int num=i;num>=1;num--) {
		
		if(i%num==0) {
			counter=++counter;
			
		}
		
	}
	if(counter==2) {
		System.out.println("number is prime:"+i);
	}
}
	}

}
