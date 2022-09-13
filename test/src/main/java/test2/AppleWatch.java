package test2;

public class AppleWatch implements Watch{
	public AppleWatch() {
		System.out.println("로그: 애플워치 객체생성완료");
	}
	public void volumeUp() {
		System.out.println("애플워치 ++");
	}
	public void volumeDown() {
		System.out.println("애플워치 --");
	}
}
