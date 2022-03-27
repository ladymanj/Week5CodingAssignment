package week5;

public class App {

	public static void main(String[] args) {
		
		Logger aLogger = new AsteriskLogger();
		Logger sLogger = new SpacedLogger();
		
		String input = "This town ain't big enough for the two of us...";
		
		aLogger.Log(input);
		System.out.println();
		aLogger.Error(input);
		System.out.println();
		
		sLogger.Log(input);
		System.out.println();
		sLogger.Error(input);
		System.out.println();
		
	}

}
