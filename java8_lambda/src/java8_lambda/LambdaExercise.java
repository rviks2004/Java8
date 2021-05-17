package java8_lambda;

import java.io.ObjectInputStream.GetField;

public class LambdaExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Vikas Rane");
			LambdaExercise lambdaExercise = new LambdaExercise();	
			//lambdaExercise.getName();
			
			NameOperation nameOperation = new NameOperation();
			nameOperation.setName("Vikassss");
			nameOperation.getName();
			System.out.println(nameOperation.getName());
			
			GetName getName = () -> System.out.println("My name is Vikas");
			
			
			
	}	
	
	
	interface GetName {
		void getMyName();
	}
		
	

}
