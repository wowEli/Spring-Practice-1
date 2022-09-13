package test2;

import test.AppleWatch;

public class Iphone implements Phone{

	private Watch watch;
	
	public Iphone() {
		System.out.println("로그: 아이폰 객체생성완료");
	}
	
	public Iphone(Watch watch) {
		System.out.println("로그: 워치를 인자로 받는 아이폰 객체생성완료");
		this.watch=watch;
	}
	
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		System.out.println("아이폰 전원 on");
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		System.out.println("아이폰 전원 off");
	}

	@Override
	public void volumeUp() {
		// TODO Auto-generated method stub
			this.watch.volumeUp();
		
	}

	@Override
	public void volumeDown() {
		// TODO Auto-generated method stub
			this.watch.volumeDown();
	}

}
