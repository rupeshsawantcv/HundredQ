package BasicSecond;

import java.util.Scanner;

public class findArmStrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =  new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		int OriginalNum=num;
		int rem = 0;
		int sum=0;
		//for(int i = 0;i<=num;i++) {
			while(num>0) {
				rem = num%10;
				 sum=sum+(rem*rem*rem);
				num/=10;
			}
		//}
		
		
		if(OriginalNum==sum) {
			System.out.println(OriginalNum+" is equles to "+sum+" thats why it is a Armstrong");
		}else {
			System.out.println(OriginalNum+" is not equles to "+sum+" thats why it is not Armstrong");
		}

	}

}
