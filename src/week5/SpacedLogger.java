package week5;

public class SpacedLogger implements Logger {

	@Override
	public void Log(String log) {
		
		String spacedOut = "";
		for (int i = 0; i < log.length(); i++) {
			spacedOut += log.charAt(i) + " ";
		}
		System.out.println(spacedOut.trim());
	}

	@Override
	public void Error(String error) {
		
		String spacedOut = "";
		System.out.print("ERROR: ");
		for (int i = 0; i < error.length(); i++) {
			spacedOut += error.charAt(i) + " ";
		}
		System.out.println(spacedOut.trim());
	}
	
	

}
