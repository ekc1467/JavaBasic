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
//		//rnd.nextInt(n); ---> 0~n-1���� ���ڰ� ����
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
//			System.out.println(num + "������ ���� : " + sum);
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
//		case 10: // break; ->>> �Ϻη� break�����ϰ� 100���϶� A�� �������� �ϴ°�
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
//		// 1. switch �ȿ� ������ ����� �� �ִ�.
//		// 2. case �ڿ� ������ ����� �� ����.
//		// 3. break�� �����ϸ� switch�� ���������� �ʴ´�.
//		// 4. �����ϴ� �б⹮�� �������� default�� ���´�.
//		// 5. ����, ����, ���ڿ� ��� �бⰡ �����ϴ�.
//		// 6. �ǵ������� break�� �����ϱ⵵ �Ѵ�.
//		
//		int num = 99;
//		int nn = 10;
//		char ch = '��';
//		switch ("ȣ����") {
//		//case nn:(X)
//		case "ȣ����":
//			System.out.println(1);
//			break;
//		case "�ڳ���":
//			System.out.println(2);
//			break;
//		case "��Ÿ":
//			System.out.println(3);
//			break;
//			
//		default:
//			System.out.println("ȣ����");
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
////ex19) while( ����ϰ� ��� : for) -> while�� �ݺ�Ƚ���� �𸦶� ����ϴ°�
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
//				System.out.println("Ż����");
//				break;
//				//System.out.println("unreach code");
//			}
//			System.out.println(num);
//			num++;
//		}
//		
//		//System.out.println("ȣ����");
//	}
//}
//*/
////--------------------------------------------------------------------------
//
///*
////ex18-2
//public class Hello {
//	public static void main(String[] args) {
//		for (int i = 0; i < 3; i++) { // ����
//			
//			for (int j = 0; j < 4; j++) { // ����
//				System.out.print("* ");
//			}
//			System.out.println(); //�ٹٲ�
//		}
//		System.out.println();
//		
//		for (int i = 0; i < 3; i++) { // ����
//
//			for (int j = 0; j < 4; j++) { // ����
//				System.out.print("["+i+" "+j+"]");
//			}
//			System.out.println(); //�ٹٲ�
//		}
//		System.out.println();
//		
//		for (int i = 0; i < 5; i++) { // ����
//			for (int j = 0; j < 6; j++) { // ����
//				if((i+j)%2 == 0) {
//					System.out.print("O ");
//				}else {
//					System.out.print("X ");
//				}
//				
//			}
//			System.out.println(); //�ٹٲ�
//		}
//		System.out.println();
//		
//		for (int i = 0; i < 5; i++) { // ����
//			for (int j = 0; j < 6; j++) { // ����
//				System.out.print((i+j)%2 == 0 ? "O " : "X ");
//			}
//			System.out.println(); //�ٹٲ�
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
//		// ������ �ڵ�� ������ ���׿������� �����Ѵ�.
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
//		//a�� b��
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
//		// ����1 n
//		for (int i = 0; i < 4; i++) {
//			System.out.println(i);
//		}
//		// ����2 n
//		for (int i = 1; i <= 4; i++) {
//			System.out.println(i);
//		}
//		// ����3 2n+1�� �ݺ�
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
//			System.out.println("¦��");
//		} else {
//			System.out.println("Ȧ��");
//		}
//		System.out.println("----------------");
//		
//		int password = 1234;
//		if(password != 1234) {
//			System.out.println("Ʋ��");
//			//break;
//			//return;
//			
//		}
//		
//		System.out.println("����");
//		System.out.println("������ �α��� �Ͽ���");
//		System.out.println("���� ���� Ȯ��");
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
////ex11) if, for, while, switch : >> do while(X, ������)
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
//		n = n+10;		//������ ����
//		System.out.println(n);
//		n += 10;  		//������ ����, ���� �ӵ��� ����.
//		System.out.println(n);//40
//		n = n + 1;
//		n += 1;
//		n++; //�̰� ���� ������.
//		System.out.println(n);
//		++n;
//		System.out.println(n);
//		
//		n = 10;
//		int a, b;
//		a = n++;	//���� -> ����
//		System.out.println(a+" "+n);	//a = 10, n = 11
//		n = 10;
//		b = ++n;	//���� -> ����
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
//		//��ü �ּ�ó�� ����Ű -> ctrl + shift + /
//		//1. �����̸��� �ߺ��ɼ� ����.
//		int apple;
//		//int apple(X)
//		
//		//2. ��� ���еȴ�.
//		int Apple;
//		
//		//3. ù���ڰ� ���ڰ� �ƴ϶�� ���� ��� ����
//		int Apple123;
//		//int 9apple(X)
//		
//		//4. _, $ �ΰ� ��밡��
//		int apple_num;
//		int _34;
//		
//		//5. �ѱۻ�밡�� ���������� ���ؾ���.
//		int ��� = 10;
//		System.out.println(���);
//		
//		//6. �Ѵܾ��̻� �ռ��� �ɶ��� ī��ǥ��� ���
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
//		//byte 1-�Ⱦ� , short 2-�Ⱦ�, int 4, long 8 ---->����
//		byte apple; //���� <-> ���(�� ��ȭ �Ұ�)
//		apple = 10;
//		System.out.println(apple);
//		apple = 20; // apple�� �ִ� 10 ������� 20�̵�
//		System.out.println(apple);
//		apple = 127; // 127������ ���� �� ����
//		System.out.println(apple);
//		
//		
//		//short  ->type
//		//banana ->����(variable)
//		//= 	 ->���Կ�����
//		//20; 	 ->���ͷ�
//		short banana = 20;
//		System.out.println(banana);
//		int orange = 222222222;		
//		long kiwi = 22292999;
//		
//		//boolean(1����Ʈ), char(2����Ʈ), float(4����Ʈ �Ҽ���), double(8����Ʈ, �Ҽ���)
//		boolean t1 = true;
//		char t2 = 'A';
//		char t3 = '��';
//		char t4 = 65; // �̷��� ������ ������ ���Ѵ�.(�ƽ�Ű�ڵ带 �˸� ��)
//		System.out.println(t2);
//		System.out.println(t3);
//		System.out.println((int)t2);
//		System.out.println((int)t3);
//		System.out.println((char)(t3+1));//'��'�� ������ ���� ������ �Ͼ�Ե�
//		System.out.println((int)Character.MAX_VALUE);
//		
//		char a = 'A', b = 20;
//		System.out.println((char)(a+b));//A���� 20��° ������ ����
//		
//		float t5 = 3.14f; //4byte
//		double t6 = 3.14; //8byte ->�� �� ����
//		
//		float sum = 0.0f;
//		
//		for(int i = 0; i < 100; i++) {
//			sum = sum +0.1f;
//		}
//		System.out.println(sum);
//		
//		if(sum != 10.0f) {
//			System.out.println("����");
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
//	System.out.println(3+2>7&&2+6<8);//���� ���� : ������� > ���迬�� > ������
//	System.out.println(!true);//����������
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
//	System.out.println(17%3);//�� ���ڰ� ���� ?%n�� �ϸ� 0~n-1�� ���´�.
//	System.out.println(3+4*5);//���ϱ� ������ ���� ����
//	System.out.println((3+4)*5);//()������ �켱
//	System.out.println(2+3*4+5);//()������ �켱
//	System.out.println((2+3)*(4+5));//()������ �켱
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
//	System.out.println(100);//����
//	System.out.println('��');//����
//	System.out.println("ȣ����");//���ڿ�
//	System.out.println(100+100);//����
//	System.out.println(100+"ȣ����");//���ڿ� + ����
//	System.out.println("����"+"ȣ����");//���ڿ� + ���ڿ�
//	System.out.println("100"+"100");
//	System.out.println(10+20+"ȣ����");//���ʿ��� ���������� �ǹǷ� 30ȣ����
//	System.out.println("ȣ����"+10+20);
//	System.out.println(10+" "+20);
//	System.out.println(10+" "+20+" "+30);
//	System.out.println(10+'A');//���ڴ� �����ϸ� �ƽ�Ű�ڵ� �����ڵ�� ��ȯ�Ǿ� ����ȴ�.
//	System.out.println((char)(1+'A'));//Ÿ��ĳ����
//	System.out.println((char)66);//66�� �ƽ�Ű�ڵ� ���ڷ� ��ȯ
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
//		//syso -> ctrl + space ����Ű
//		System.out.println(1000);
//		System.out.println(2000);
//	}
//
//}
// */
