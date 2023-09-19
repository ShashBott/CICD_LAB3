package devops.b3.cicd.lab3;

public class MyClass {
	public void greeting() {
		System.out.println("hello world");
	}

	public void test() {
		System.out.println("Testing github actions");
	}

	public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj.greeting();
		obj.test();
	}

}
