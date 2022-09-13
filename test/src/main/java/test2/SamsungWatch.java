package test2;

public class SamsungWatch implements Watch{
	public SamsungWatch() {
		System.out.println("로그: 삼성워치 객체생성완료");
	}
	public void volumeUp() {
		System.out.println("삼성워치 ++");
	}
	public void volumeDown() {
		System.out.println("삼성워치 --");
	}
}
