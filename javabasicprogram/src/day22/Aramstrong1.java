package day22;

public class Aramstrong1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(isArmstorng(1630 ));
	}
	static boolean isArmstorng(int num) {
		int temp,rem=0,ct=0;
		double sum=0;
		temp=num;
		while(temp>0) {
			temp=temp/10;
			ct++;
		
		
		}
		temp=num;
		while(temp>0) {
			rem=temp%10;
			sum=sum+Math.pow(rem, ct);
			temp=temp/10;
		}
		if(num==sum) {
			return true;
			
		}return false;
	}
}
