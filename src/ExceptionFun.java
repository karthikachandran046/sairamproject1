
public class ExceptionFun {
public static void main(String[] args) {
	System.out.println("one");
	System.out.println("two");
	try {
	    System.out.println(5/0);
	}catch(Exception e){
		System.out.println("don't/0");
	}finally {
		System.out.println("i am fine");
	}
	     System.out.println("four");
}
}
