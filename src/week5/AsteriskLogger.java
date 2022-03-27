package week5;

public class AsteriskLogger implements Logger {

	@Override
	public void Log(String log) {
		
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void Error(String error) {
		
		String outsideLine = "";
		String insideLine = "***ERROR: " + error + "***";
		for (int i = 0; i < insideLine.length(); i++) {
			outsideLine += "*";
		}
		
		System.out.println(outsideLine);
		System.out.println(insideLine);
		System.out.println(outsideLine);
		
		/*
		 * Used a For loop to be sure that the first and last lines contain
		 * exactly enough asterisks to match the length of the second line
		 */
	}

}
