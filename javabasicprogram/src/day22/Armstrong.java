package day22;

public class Armstrong {

	public static void main(String[] args) {
	System.out.println(isArmstrong(153));
	}
	static boolean isArmstrong(int num) {
		int temp,rem=0;
		double sum=0;
		temp=num;
		while(temp>0) {
			rem=temp%10;
			sum=sum+Math.pow(rem, 3);
			temp=temp/10;
		}if(sum==num) {
			return true;
			
		}return false;
	}
	}

