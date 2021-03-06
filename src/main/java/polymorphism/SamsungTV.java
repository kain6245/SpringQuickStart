package polymorphism;

import java.util.List;

public class SamsungTV implements TV {
	
	private Speaker speaker;
	private int price;
	
	// generator
	public SamsungTV() {
		System.out.println("samsung tv generator");
	}
	
	public SamsungTV(Speaker speaker) {
		System.out.println("samsung tv generator with sony speaker");
		this.speaker = speaker;
	}
	
	public SamsungTV(Speaker speaker, int price) {
		System.out.println("samsung tv generator with sony speaker and price");
		this.speaker = speaker;
		this.price = price;
	}
	
	// setter
	public void setSpeaker(Speaker speaker) {
		System.out.println("samsung tv set speaker");
		this.speaker = speaker;
	}
	public void setPrice(int price) {
		System.out.println("samsung tv set price");
		this.price = price;
	}

	
	public void powerOn() {
		System.out.println("smasun tv -- power on, price="+price);
	}
	
	public void powerOff() {
		System.out.println("samsung tv -- power off");
	}
	
	public void volumeUp() {
		speaker.volumeUp();
	}
	
	public void volumeDown() {
		speaker.volumeDown();
	}
	
	public void initMethod() {
		System.out.println("samsung tv init method");
	}
	public void destroyMethod() {
		System.out.println("samsung tv destroy method");
	}
}