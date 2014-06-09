import com.test.Test;


public class Main {

	public static void main(String [] args){
		System.out.println("started");
		Test test = new Test();
		System.out.println(test.getData().size());
		System.out.println("stopped");
	}
}
