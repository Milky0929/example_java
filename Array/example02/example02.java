public class example02 {
	public static void main (String[] args) {
		int[] grade = new int[3];
		grade[0] = 85;
		grade[1] = 65;
		grade[2] = 90;

		System.out.print(grade[4]); //ArrayIndexOutOfBounds 예외 발생
		}
}	
