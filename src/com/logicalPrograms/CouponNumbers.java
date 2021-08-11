package com.logicalPrograms;

/**
 * This is a program to get 
 * days of the week
 * @author Sheetal
 * @since 2021-08-10
 */
public class CouponNumbers {
	/**
	 * Asks user to enter the number
	 * @param nmb
	 */
	public static void main(String[] args) {
		//Asks user to enter the number
		System.out.println("Enter the no.of distinct values");
		int nmb=Utility.getUserSpecificInteger();
		int distinct[]= new int[nmb];
		for(int i=0;i<nmb;i++) {
			int dist=Utility.getRandomInt(10)+1;
			if(i==0) {
				distinct[i]=dist;
			} else {
				for(int j=0;j<i;j++) {
						if(dist==distinct[j]) {
							i--;
							break;
						} else if (j==i-1) {
						distinct[i]=dist;
						}
					}
				}
		}
		for(int a=0;a<nmb;a++) {
			System.out.print(distinct[a]+" ");
		}
		System.out.println();
		
		int flag=0;
		int ticket[]= new int[10];
		for(int serial=0; serial<10; serial++) {
			int couponNumber=Utility.getRandomInt(10)+1;
			if(serial==0) {
				ticket[serial]=couponNumber;
				flag=1;
			} else {
				for(int a=0;a<serial;a++) {
					if(couponNumber==ticket[a]){
						serial--;
						flag=0;
						break;
					}  else if (a==(serial-1)) {
						ticket[serial]=couponNumber;
						flag=1;
					}
				}
			}
			if(flag==1) {
				for(int j=0;j<nmb;j++) {
					if (ticket[serial]==distinct[j]) {
						System.out.println("Coupon Number "+couponNumber+" is got on Ticket serial "+(serial+1));
						break;
					}
				}
			}
		}
	}
}
