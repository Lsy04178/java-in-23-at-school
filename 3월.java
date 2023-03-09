# 1 // 클래스의 예 // 

public class syTel {
    int channel; 
    int volume;
    boolean isOn;
}



# 2 // 객체 생성하기 // 
public class syTel {
	int channel;
	int volume;
	boolean isOn;

	
	public static void main(String[] args) {

		syTel tv = new syTel();
		tv.channel = 52; 
		tv.volume = 16;
		tv.isOn = true;

		System.out.println("현재 상태" + tv.isOn +" 입니다. 채널은" + tv.channel + ", 볼륨은 " + tv.volume + "입니다.");
			    	    }
		}
		
		//실행결과  현재 상태 true 입니다. 채널은52, 볼륨은 16입니다. //



# 3 // 여러개의 객체 생성하기 // p.204
public class syTel2 {
	int channel;
    	int volume;
    	boolean isOn;
	
	public static void main(String[] args) {

		syTel2 mtv = new syTel2();
		
		mtv.channel = 47; 
		mtv.volume = 9;
		mtv.isOn = true;

		
		syTel2 ytv = new syTel2();
		ytv.channel = 77; 
		ytv.volume = 19;
		ytv.isOn = true;
		
	
		
		System.out.println("mtv " + mtv.channel + "채널 이고 볼륨은 " + mtv.volume + "입니다.");
		System.out.println("ytv 채널은 " + ytv.channel + "이고 볼륨은 " + ytv.volume + "입니다.");
		    
	if(mtv.volume > 20) {
		System.out.println("볼륨이 너무 큽니다 줄여주세요.");
}
}
}
        
        
        
        
        
        
        
        
// p.210 //
	package test;

	public class Boxtest {
	public static void main(String[] args) {
	
		int w;
		int len;
		int h;
		
		
			
		box b;
		b = new Box();
			
		b.w = 10;
		b.len = 40;
		b.h = 0;
		System.out.println("상자의 가로 세로 높이는" + b.width + ","+ b.length + "," + b.height+ "입니다.");
	}

}
       
 
 
 
 
 
 
 
 
 
 
 
 //p.212//
package syjava;

public class Television {
	int channel;
	int volume;
	boolean onOff;
	void print() {
		System.out.println("채널은" + channel + ", 볼륨은" + volume + "입니다.");
	}
}


package syjava;

public class TelevisionTest {

	public static void main(String[] args) {
		Television myTv = new Television();
		myTv.channel = 7;
		myTv.volume = 9;
		myTv.onOff = true;
		myTv.print();
	}

}


실행결과 = 채널은7, 볼륨은9입니다.















//p.//
package syjava;

public class Television {
	int channel;
	int volume;
	boolean onOff;
	
	
	void print() {
		System.out.println("채널은" + channel + ", 볼륨은" + volume + "입니다.");
	}
	
	int getChannel() {
		return channel;
	}
	
	
	void setChannel(int ch) {
		channel = ch;
	}
}




package syjava;

public class TelevisionTest {

	public static void main(String[] args) {
		Television myTv = new Television();
		myTv.setChannel(11);
		int ch = myTv.getChannel();
		System.out.println("현재 채널은" + ch + "입니다");
	}

}


~~~실~~행~~결~~과~~~
현재 채널은11입니다












//p.217//
package syjava;

public class Math {
		int add(int x, int y , int k) {
			return x*y/2;
		}
}





package syjava;

public class MathTest {

	public static void main(String[] args) {
		int sum;
		
		Math obj = new Math();
		sum = obj.add(365, 3, 2);
		System.out.println("3년을 반으로 나누면 몇일인가요? " + sum  );
		sum = obj.add(10, 8, 0);
		System.out.println("10과 8의 합은 " + sum);


	}

}


//  실행결과  3년을 반으로 나누면 몇일인가요? 547         //          10과 8의 합은 40          //







// p.221//
package syjava;

public class Car {
	String color;
	int speed;
	int gear;
	
	
	public String toString() {
		return "Car [color= " + color + ", speed=" + speed + ", gear=" + gear + "]";
	}
	
	void changeGear(int g) {
		gear = g;
	}
	
	void speedUp() {
		speed = speed + 10;
	}
	
	void speedDown() {
		speed = speed - 10;
	}
}




package syjava;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.changeGear(1);
		myCar.speedUp();
		System.out.println(myCar);

	}

}


/~~~~ 실행결과 Car [color= null, speed=10, gear=1] ~~~~/
