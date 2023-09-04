public class Array04 {
	public static void main(String[] args) {
		int[] grade = new int[]{85, 65, 90};
		//길이가 3인 int형 배열을 선언과 동시에 초기화

		for (int i = 0; i < grade.length; i ++) {
			System.out.print(grade[i] + " ");
			// 인덱스를 통한 배열로의 접근
		}
	}
}
