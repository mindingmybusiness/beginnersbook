
package beginnersbook.basicPrograms;

public class Test {
	
	public static void main(String[] args) {
//		leftTriangle(6);
//		diamond1(6);
		square(6);
	}
	private static void square(int row) {
		for(int i=1;i<=2*row-1;i++) {
			for(int j=1;j<=row;j++) {
				
					System.out.print(" *");
				
			}
			System.out.println();
		}
	}
	private static void diamond(int row) {
		for(int i=1;i<=2*row-1;i++) {
			for(int j=1;j<=2*row-1;j++) {
				if(((i==6)|| (j==6)) || ((i==5||i==7) && (j!=1 && j!=11))
				|| ((i==4 || i==8) && (j!=2 && j!=10 && j!=1 && j!=11))
				|| ((i==3 || i==9) && (j==4 || j==5 || j==6 || j==7 || j==8))
				|| ((i==2 || i==10) && (j==5 || j==6 || j==7)))
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	private static void diamond1(int row) {
		for(int i=1;i<=2*row-1;i++) {
			for(int j=1;j<=2*row-1;j++) {
				if(((i==6)|| (j==6)) || ((i==5||i==7) && (j!=1 && j!=11))
						|| ((i==4 || i==8) && (j!=2 && j!=10 && j!=1 && j!=11))
						|| ((i==3 || i==9) && (j==4 || j==5 || j==6 || j==7 || j==8))
						|| ((i==2 || i==10) && (j==5 || j==6 || j==7)))
						System.out.print(i);
						else
							System.out.print(" ");
			}
			System.out.println();
		}
	}

	private static void pyramid(int row) {
		for(int i=1;i<=row;i++) {
			for(int j =row;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void leftTriangle(int row) {
		for(int i=0;i<row;i++) {
			for(int j =2*(row-i);j>2;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
