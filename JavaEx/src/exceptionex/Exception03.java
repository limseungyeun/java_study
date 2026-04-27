package exceptionex;

public class Exception03 {
	public static void main(String[] args) {
		try {
			int[] a= {1,2};
			System.out.println(a[5]);//에러
			String str = null;
			System.out.println(str.length());
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스 범위를 벗어남");
		} catch (NullPointerException e) {
			System.out.println("Null 레퍼런스 참조 에러");
		} catch (Exception e) { // Exception : 모든 예외일 때, 항상 마지막
			System.out.println("기타 에러");
		}
		//catch 여러개가 나오면 첫 번째로 해당하는 catch만 수행한다 나머지는 수행하지 않는다. 즉 첫 번째 이외에는 작동하디 않는다.
	}
}
