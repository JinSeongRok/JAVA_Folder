package java1209;

public class array_2 {

		
	public static void main(String[] args) {
	
		//배열 변수 선언과 배열 생성
		String[] season = {"Spring", "Summer", "Fall", "Winter"};
		
		
		//배열의 항목값 읽기
		System.out.println("season[0]: " + season[0]);
		System.out.println("season[0]: " + season[1]);
		System.out.println("season[0]: " + season[2]);
		System.out.println("season[0]: " + season[3]);
		
		// 인덱스 1인 항목의 값 변경
		season[3] = "겨울";
		System.out.println("season[0]: " + season[3]);
		System.out.println();
		
		
		//배열 변수 선언과 배열 생성
		
		int[] scores = {83, 90, 87};
		
		// 총 합과 평균 구하기
		int sum = 0;
		for (int i=0; i<3; i++) {
			sum += scores[i];
			
		}
		
		System.out.println("총합 : "+ sum);
		double avg = (double)sum /3;
		System.out.println("평균: "+ avg);
	}

}
