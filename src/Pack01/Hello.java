//package Pack01;
//
//import java.util.Random;
//
//
///*
////ex
//public class Hello {
//	public static void main(String[] args) {
//
//	}
//}
//
////--------------------------------------------------------------------------
// */
///*
////ex24)
//public class Hello {
//	public static void main(String[] args) {
//		Random rnd = new Random();
//		//rnd.nextInt(n); ---> 0~n-1사이 숫자가 나옴
//		int num = rnd.nextInt(30);
//		switch (num % 2) {
//		case 0:{
//			for (int i = 0; i < 10; i++) {
//				System.out.println(num + " * " + i + " = " + num*i);			
//			}
//		}break;
//		case 1:{
//			int sum = 0;
//			for (int i = 1; i <= num ; i++) {
//				sum += i;
//			}
//			System.out.println(num + "까지의 합은 : " + sum);
//		}break;
//	
//		default: break;
//		}
//	}
//}
//*/
////--------------------------------------------------------------------------
//
///*
////ex23)
//public class Hello {
//	public static void main(String[] args) {
//		int score = 100;
//		switch (score / 10) {
//		case 10: // break; ->>> 일부러 break생략하고 100점일때 A가 나오도록 하는것
//		case 9:
//			System.out.println("A");
//			break;
//		case 8:
//			System.out.println("B");
//			break;
//		case 7:
//			System.out.println("C");
//			break;
//		case 6:
//			System.out.println("D");
//			break;
//		default:
//			System.out.println("F");
//			break;
//		}
//	}
//}
//*/
////--------------------------------------------------------------------------
//
//
//
///*
////ex22)
//public class Hello {
//	public static void main(String[] args) {
//		// 1. switch 안에 변수를 사용할 수 있다.
//		// 2. case 뒤에 변수를 사용할 수 없다.
//		// 3. break를 생략하면 switch를 빠져나오지 않는다.
//		// 4. 만족하는 분기문이 없을때는 default로 나온다.
//		// 5. 정수, 문자, 문자열 모두 분기가 가능하다.
//		// 6. 의도적으로 break를 생략하기도 한다.
//		
//		int num = 99;
//		int nn = 10;
//		char ch = '한';
//		switch ("호랑이") {
//		//case nn:(X)
//		case "호랑이":
//			System.out.println(1);
//			break;
//		case "코끼리":
//			System.out.println(2);
//			break;
//		case "낙타":
//			System.out.println(3);
//			break;
//			
//		default:
//			System.out.println("호랑이");
//			break;
//		}
//	}
//}
//*/
//
//
////ex21)
//public class Hello {
//	public static void main(String[] args) {
//		Random rnd = new Random();
//		
//		int num = rnd.nextInt();
//		if(num < 0) {
//			num = -num;
//		}
//		System.out.println(num);
//		
//		int k = 0;
//		int i = 10;
//		while(true) {
//			
//			if((num/i)<1) {
//				System.out.println(k);
//				break;
//			}else {
//				
//				k = k+(num%i);
//			
//				k = k+(num%(i*10))/(i);
//	
//				i = i*10;
//				System.out.println(i);
//				}
//			}
//	}
//}
//
//
//
///*
////ex20)
//public class Hello {
//	public static void main(String[] args) {
//		int num = 29292;
//		
//		while(true) {
//			System.out.println(num);
////			if(num%2==0) {
////				num = num /2;
////			}else {
////				num = num*3 + 1;
////			}
//			num = (num%2 == 0) ? num/2 : num*3+1;
//			if(num == 1) {
//				System.out.println(num);
//				break;
//			}
//		}
//	}
//}
//*/
////--------------------------------------------------------------------------
//
//
///*
////ex19) while( 비슷하게 사용 : for) -> while은 반복횟수를 모를때 사용하는것
//public class Hello {
//	public static void main(String[] args) {
////		int num = 0;
////		while(true) {
////			num++;
////			System.out.println(num);
////		}
//	
//		int num = 0;
//		while(num < 4) {
//			System.out.println(num);
//			num++;
//		}
//		
//		num = 0;
//		while(true) {
//			if(num == 4) {
//				System.out.println("탈출전");
//				break;
//				//System.out.println("unreach code");
//			}
//			System.out.println(num);
//			num++;
//		}
//		
//		//System.out.println("호랑이");
//	}
//}
//*/
////--------------------------------------------------------------------------
//
///*
////ex18-2
//public class Hello {
//	public static void main(String[] args) {
//		for (int i = 0; i < 3; i++) { // 세로
//			
//			for (int j = 0; j < 4; j++) { // 가로
//				System.out.print("* ");
//			}
//			System.out.println(); //줄바꿈
//		}
//		System.out.println();
//		
//		for (int i = 0; i < 3; i++) { // 세로
//
//			for (int j = 0; j < 4; j++) { // 가로
//				System.out.print("["+i+" "+j+"]");
//			}
//			System.out.println(); //줄바꿈
//		}
//		System.out.println();
//		
//		for (int i = 0; i < 5; i++) { // 세로
//			for (int j = 0; j < 6; j++) { // 가로
//				if((i+j)%2 == 0) {
//					System.out.print("O ");
//				}else {
//					System.out.print("X ");
//				}
//				
//			}
//			System.out.println(); //줄바꿈
//		}
//		System.out.println();
//		
//		for (int i = 0; i < 5; i++) { // 세로
//			for (int j = 0; j < 6; j++) { // 가로
//				System.out.print((i+j)%2 == 0 ? "O " : "X ");
//			}
//			System.out.println(); //줄바꿈
//		}
//		System.out.println();
//		
//		
//		int result;
//		if(3 > 2) {
//			result = 10;
//		}else {
//			result = 20;
//		}
//		// 위같은 코드는 무조건 삼항연산으로 수정한다.
//		
//		result = (3 > 2) ? 10 : 20;
//		System.out.println(result);
//		
////		int func() {
////			if( 3>2) {
////				return 100;
////			}else {
////				return 200;
////			}
////			//( 3 > 2 ) ? return 100: return 200;(X)
////			return (3>2) ? 100 : 200;
////			
////		}
//		
//	}
//}
//*/
//
//
///*
////ex18-1
//public class Hello {
//	public static void main(String[] args) {
//		for (int i = 0; i < 3; i++) {
//			System.out.println("-------------");
//			for (int j = 0; j < 4; j++) {
//				System.out.println(1);
//			}
//			System.out.println("*************");
//		}
//	}
//}
//*/
//
//
///*
////ex17)
//public class Hello {
//	public static void main(String[] args) {
//		int num = 100;
//		for (int i = 0; i < 10; i++) {
//			System.out.println(num + " * " + i + " = " + num*i);			
//		}
//		System.out.println("----------------");
//		
//		int sum = 0;
//		int num2 = 1000;
//		for (int i = 1; i <= num2 ; i++) {
//			//sum =sum + i;
//			sum += i;
//		}
//		System.out.println(sum);
//		
//		int sum2 = 1;
//		int a = 3;
//		int b = 4;
//		//a의 b승
//		for (int i = 0; i < b; i++) {
//			sum2 *= a;
//		}
//		System.out.println(sum2);
//	}
//}
//*/
////--------------------------------------------------------------------------
//
///*
////ex16)
//public class Hello {
//	public static void main(String[] args) {
//		// 유형1 n
//		for (int i = 0; i < 4; i++) {
//			System.out.println(i);
//		}
//		// 유형2 n
//		for (int i = 1; i <= 4; i++) {
//			System.out.println(i);
//		}
//		// 유형3 2n+1번 반복
//		for (int i = -3; i <= 3; i++) {
//			System.out.println(i);
//		}
//	}
//}
//*/
////--------------------------------------------------------------------------
//
///*
////ex15)
//public class Hello {
//	public static void main(String[] args) {
//		int score = 87;
//		if(score >= 90) {
//			System.out.println("A");
//		} else if(score >= 80) {
//			System.out.println("B");
//		} else if(score >= 70) {
//			System.out.println("C");
//		} else {
//			System.out.println("F");
//		}
//		
//		System.out.println(5);
//	}
//}
//*/
////--------------------------------------------------------------------------
//
//
///*
////ex14)
//public class Hello {
//	public static void main(String[] args) {
//		//1. if() {}
//		//2. if() {} else{}
//		//3. if() {} else if(){}
//		int num = 10;
//		if(num%2 == 0) {
//			System.out.println("짝수");
//		} else {
//			System.out.println("홀수");
//		}
//		System.out.println("----------------");
//		
//		int password = 1234;
//		if(password != 1234) {
//			System.out.println("틀림");
//			//break;
//			//return;
//			
//		}
//		
//		System.out.println("맞음");
//		System.out.println("유저가 로그인 하였음");
//		System.out.println("다음 정보 확인");
//		
//		int nn = 10;
////		while() {
////			if( nn < 0) {
////				nn = -nn;
////			}else {
////				nn = +nn;
////			}	
////		}
//		
//		
//	}
//}
//*/
//
//
///*
////ex13)
//public class Hello {
//	public static void main(String[] args) {
//		System.out.println(1);
//		if(3>2) {
//			System.out.println(2);
//			if(3 != 4) {
//				System.out.println(3);
//			}
//			System.out.println(4);
//			
//			if(3+4 >= 7) {
//				System.out.println(5);				
//			}
//			System.out.println(6);
//		}
//		System.out.println(7);
//	}
//}
//*/
//
//
///*
////ex11) if, for, while, switch : >> do while(X, 사용안함)
//public class Hello {
//	public static void main(String[] args) {
//		
//		if(true) {
//		System.out.println(1);
//		System.out.println(2);
//		}
//		
//		if(false) {
//			System.out.println(3);
//			System.out.println(4);
//		}
//		
//		System.out.println(5);
//		
//		if(true) {
//			System.out.println(6);
//			if(true) {
//				System.out.println(7);
//			}
//			System.out.println(8);
//		}
//		System.out.println(9);
//			
//		
//	}
//}
//*/
////--------------------------------------------------------------------------
//
//
///*
////ex10)
//public class Hello {
//	public static void main(String[] args) {
//		int a = 10, b = 20;
//		int t; //temp
//		System.out.println(a + " " + b);
//		t = a; //t = 10
//		a = b; //a = 20
//		b = t; //b = 10
//		System.out.println(a + " " + b);
//	}
//}
//*/
////--------------------------------------------------------------------------
//
//
//
///*
////ex9)
//public class Hello {
//	public static void main(String[] args) {
//		int n = 10;
//		n = 20;
//		System.out.println(n);
//		n = n+10;		//컴파일 느림
//		System.out.println(n);
//		n += 10;  		//컴파일 빠름, 실행 속도는 같다.
//		System.out.println(n);//40
//		n = n + 1;
//		n += 1;
//		n++; //이게 제일 빠르다.
//		System.out.println(n);
//		++n;
//		System.out.println(n);
//		
//		n = 10;
//		int a, b;
//		a = n++;	//대입 -> 증가
//		System.out.println(a+" "+n);	//a = 10, n = 11
//		n = 10;
//		b = ++n;	//증가 -> 대입
//		System.out.println(b+" "+n);	//b = 11, n = 11
//		
//	}
//}
//*/
////--------------------------------------------------------------------------
//
///*
////ex8)
//public class Hello {
//	public static void main(String[] args) {
//		//전체 주석처리 단축키 -> ctrl + shift + /
//		//1. 변수이름은 중복될수 없다.
//		int apple;
//		//int apple(X)
//		
//		//2. 대소 구분된다.
//		int Apple;
//		
//		//3. 첫글자가 숫자가 아니라면 숫자 사용 가능
//		int Apple123;
//		//int 9apple(X)
//		
//		//4. _, $ 두개 사용가능
//		int apple_num;
//		int _34;
//		
//		//5. 한글사용가능 가급적으로 피해야함.
//		int 사과 = 10;
//		System.out.println(사과);
//		
//		//6. 한단어이상 합성이 될때는 카멜표기법 사용
//		int BananaNumber = 10;
//		
//		
//		
//	}
//}
//*/
////--------------------------------------------------------------------------
//
//
//
///*
////ex7)
//public class Hello {
//	public static void main(String[] args) {
//		//byte 1-안씀 , short 2-안씀, int 4, long 8 ---->정수
//		byte apple; //변수 <-> 상수(값 변화 불가)
//		apple = 10;
//		System.out.println(apple);
//		apple = 20; // apple에 있던 10 사라지고 20이됨
//		System.out.println(apple);
//		apple = 127; // 127까지만 넣을 수 있음
//		System.out.println(apple);
//		
//		
//		//short  ->type
//		//banana ->변수(variable)
//		//= 	 ->대입연산자
//		//20; 	 ->리터럴
//		short banana = 20;
//		System.out.println(banana);
//		int orange = 222222222;		
//		long kiwi = 22292999;
//		
//		//boolean(1바이트), char(2바이트), float(4바이트 소숫점), double(8바이트, 소숫점)
//		boolean t1 = true;
//		char t2 = 'A';
//		char t3 = '한';
//		char t4 = 65; // 이러한 문장은 가급적 피한다.(아스키코드를 알면 씀)
//		System.out.println(t2);
//		System.out.println(t3);
//		System.out.println((int)t2);
//		System.out.println((int)t3);
//		System.out.println((char)(t3+1));//'한'이 가지는 수와 연산이 일어나게됨
//		System.out.println((int)Character.MAX_VALUE);
//		
//		char a = 'A', b = 20;
//		System.out.println((char)(a+b));//A에서 20번째 떨어진 문자
//		
//		float t5 = 3.14f; //4byte
//		double t6 = 3.14; //8byte ->좀 더 정밀
//		
//		float sum = 0.0f;
//		
//		for(int i = 0; i < 100; i++) {
//			sum = sum +0.1f;
//		}
//		System.out.println(sum);
//		
//		if(sum != 10.0f) {
//			System.out.println("오차");
//		}
//		
//		
//		
//	}
//}
//*/
//
//
////--------------------------------------------------------------------------
//
//
///*
////ex6) 
//public class Hello { 
//	public static void main(String[] args) {
//		System.out.println(Byte.MIN_VALUE); 
//		System.out.println(Byte.MAX_VALUE);
//		System.out.println(Short.MIN_VALUE); 
//		System.out.println(Short.MAX_VALUE);
//		System.out.println(Integer.MIN_VALUE); 
//		System.out.println(Integer.MAX_VALUE);
//		System.out.println(Long.MIN_VALUE); 
//		System.out.println(Long.MAX_VALUE);
//		
//	}
//}
//*/
//
////--------------------------------------------------------------------------
//
///*
////ex5)
//public class Hello {
//	public static void main(String[] args) {
//	System.out.println(true||true);
//	System.out.println(true||false);
//	System.out.println(false||true);
//	System.out.println(false||false);
//
//	System.out.println("-----------");
//
//	System.out.println(true&&true);
//	System.out.println(true&&false);
//	System.out.println(false&&true);
//	System.out.println(false&&false);
//
//	System.out.println(3+2>7&&2+6<8);//연산 순서 : 산술연산 > 관계연산 > 논리연산
//	System.out.println(!true);//부정연산자
//	System.out.println(!(3>2));
//
//
//	}
//}
// */
////--------------------------------------------------------------------------
//
//
///*
////ex4)
//public class Hello {
//	public static void main(String[] args) {
//	System.out.println(10>5);
//	System.out.println(10<5);
//	System.out.println(10>=5);
//	System.out.println(10<=5);
//	System.out.println(10==5);
//	System.out.println(10!=10);
//	}
//}
// */
//
//
//
////--------------------------------------------------------------------------
//
//
///*
////ex3)
//public class Hello {
//	public static void main(String[] args) {
//	System.out.println(17+3);
//	System.out.println(17-3);
//	System.out.println(17*3);
//	System.out.println(17/3);
//	System.out.println(17%3);//앞 숫자가 뭐든 ?%n을 하면 0~n-1이 나온다.
//	System.out.println(3+4*5);//곱하기 나누기 먼저 연산
//	System.out.println((3+4)*5);//()연산이 우선
//	System.out.println(2+3*4+5);//()연산이 우선
//	System.out.println((2+3)*(4+5));//()연산이 우선
//	}
//}
// */
//
//
////---------------------------------------------------------------------------
//
///*
////ex2)
//public class Hello {
//
//	public static void main(String[] args) {
//	System.out.println(100);//정수
//	System.out.println('한');//문자
//	System.out.println("호랑이");//문자열
//	System.out.println(100+100);//연산
//	System.out.println(100+"호랑이");//문자열 + 숫자
//	System.out.println("사자"+"호랑이");//문자열 + 문자열
//	System.out.println("100"+"100");
//	System.out.println(10+20+"호랑이");//왼쪽에서 오른쪽으로 되므로 30호랑이
//	System.out.println("호랑이"+10+20);
//	System.out.println(10+" "+20);
//	System.out.println(10+" "+20+" "+30);
//	System.out.println(10+'A');//문자는 연산하면 아스키코드 유니코드로 변환되어 연산된다.
//	System.out.println((char)(1+'A'));//타입캐스팅
//	System.out.println((char)66);//66을 아스키코드 문자로 변환
//	}
//
//}
// */
//
//
////---------------------------------------------------------------------------
//
//
///*
//// ex1)
//public class Hello {
//
//	public static void main(String[] args) {
//		//syso -> ctrl + space 단축키
//		System.out.println(1000);
//		System.out.println(2000);
//	}
//
//}
// */
