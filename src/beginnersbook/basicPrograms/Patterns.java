package beginnersbook.basicPrograms;

public class Patterns {
	
	public static void main(String[] args) {
		rightTriangle(6);
		leftTriangle(6);
		pyramidStar(6);
		diamond(6);
		downwardTriangle(6);
		reversedPyramid(7);
		rightDownMirror(6);
		rightPascalTriangle(6);
		hollowSquare(6);
		leftPascalTriangle(6);
		sandglass(6);
		
	}

	private static void sandglass(int i) {
		reversedPyramid(6);
		pyramidStar(6);
	}

	private static void leftPascalTriangle(int row) {
		for(int i=1;i<=2*row-1;i++) {
			for(int j=1;j<=row;j++) {
				System.out.print(" ");
				if((i==6) ||(j==6) || ((i==5 || i==7) && (j!=1))
					|| ((i==4 || i==8) && (j!=1 && j!=2))
					|| ((i==3 || i==9) && (j==4 || j==5) )
					|| ((i==2 || i==10) && (j==5))
						){
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	private static void hollowSquare(int row) {
		for(int i=1;i<=row;i++) {
			for(int j=1;j<=row;j++) {
				System.out.print(" ");
				if( (i==1)|| (j==1) || (i==row) || (j==row)){
					System.out.print("*");
					
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	private static void rightPascalTriangle(int row) {
		for(int i=1;i<=2*row-1;i++) {
			for(int j=1;j<=row;j++) {
				if((i==6) ||(j==1) || ((i==2 || i==10) && (j==2))
						|| ((i==3 || i==9) && (j==2 || j==3))
						|| ((i==4 || i==8) && (j!=6 && j!=5))
						|| ((i==5 || i==7) && (j!=6))
						){
					System.out.print(" *");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

	private static void rightDownMirror(int row) {
		for(int i=1;i<=row;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			for(int j=i;j<=row;j++) {
				
				System.out.print("*");
			}
			System.out.println();
		}
	}

	private static void reversedPyramid(int row) {
		for(int i=1;i<=row;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print(" ");
			}
			for(int j=i;j<=row;j++) {
				
				System.out.print(" *");
			}
			System.out.println();
		}
	}

	private static void downwardTriangle(int row) {
		for(int i=1;i<=row;i++) {
			for(int j=row;j>=i;j--) {
				System.out.print("*");
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

	//Right Triangle Star Pattern
	private static void rightTriangle(int row) {
		for(int i=1;i<= row;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	//Left Triangle Star Pattern
	private static void leftTriangle(int row) {
		for(int i=0;i<row;i++) {
			for(int j=2*(row-i);j>2;j--) {
				System.out.print(" ");
			}
			for(int k=0;k<=i;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	
	//Pyramid Star Pattern
	private static void pyramidStar(int row) {
		for(int i=1;i<=row;i++) {
			for(int j=row;j>=i;j--) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
