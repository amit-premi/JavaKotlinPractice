package com.practice.java.common;

public class LoopTree {

    public static void main(String arg[]) {

		/*int rowCount = 10;
		for(int i=0; i<rowCount; i++) {
			for(int j=i; j<=(rowCount-1)+(1+i*2); j++) {
				if(j<=rowCount-1) {
					System.out.print(" ");
				}
				else {
					System.out.print("*");
				}
			}

			//for(int k=0;k<1+i*2;k++) {
				//System.out.print("*");
			//}

			System.out.println("");
		}*/

        int rowCount = 15;
        int temp = 0;
        for (int i = 1; i <= rowCount; i++) {
            if (i == rowCount) continue;

            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            temp = (rowCount - i) * 2 + 1;
            for (int k = 1; k <= temp; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        temp = 0;
        for (int i = 1; i <= rowCount; i++) {
            for (int j = i; j < rowCount; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i + temp; k++) {
                System.out.print("*");
            }
            temp = i;
            System.out.println("");
        }
		
/*		int rowCount = 15;
		int temp = 0;
		for(int i=1; i<=rowCount; i++){
			if(i==rowCount) continue;
			
			for(int j=1; j<i; j++) {
				System.out.print("*");
			}
			temp = (rowCount-i)*2 + 1;
			for(int k=1; k<=temp; k++) {
				System.out.print(" ");	
			}
			for(int j=1; j<i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		temp = 0;
		for(int i=1;i<=rowCount;i++){
			for(int j=i; j<rowCount; j++) {
				System.out.print("*");	
			}
			for(int k=1; k<=i+temp;k++) {
				System.out.print(" ");
			}
			for(int j=i; j<rowCount; j++) {
				System.out.print("*");	
			}
			temp = i;
			System.out.println("");
		}	*/
    }
}
