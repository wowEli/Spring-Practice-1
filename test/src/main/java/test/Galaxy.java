package test;

public class Galaxy implements Phone {

	public void initMethod() {
		System.out.println("객체를 초기화하는 작업을 처리하는 메서드...");
	}
	public void destroyMethod() {
		System.out.println("객체 메모리를 해제할때 호출하는 메서드...");
	}
	
	@Override
	public void powerOn() {
		System.out.println("갤럭시 전원 ON");
	}
	@Override
	public void powerOff() {
		System.out.println("갤럭시 전원 OFF");
	}
	@Override
	public void volumeUp() {
		System.out.println("갤럭시 소리 ++");
	}
	@Override
	public void volumeDown() {
		System.out.println("갤럭시 소리 --");
	}
	
}
