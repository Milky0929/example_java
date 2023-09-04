public class Array03 {
	public static void main(String[] args) {
		int[] grade1 = {70, 90, 80}; //배열의 선언과 동시에 초기화
		int[] grade2 = new int[]{70, 90, 80}; //배열의 선언과 동시에 초기화
		int[] grade3;
		// grade3 = {70, 80, 90	} 이미 선언된 배열을 이 방법으로 초기화시 오류 발생
		int[] grade4;
		grade4 = new int[]{70, 80 ,90}; // 이미 선언된 배열은 이 방법으로만 초기화
		}
}
