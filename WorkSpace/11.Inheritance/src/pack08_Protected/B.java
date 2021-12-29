package pack08_Protected;

public class B extends A{
	public B() {
		super();
		this.method();
		
	}
	public void init() {
		A a = new A();
		a.method();
		a.field ="";
	}
}
