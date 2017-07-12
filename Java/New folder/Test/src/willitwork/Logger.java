package willitwork;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
	private int totalLogLevel;
	private String logFileName;
	//LogLevel 0 --> no logs
	//Loglevel 1 --> normal logs
	//LogLevel 2 --> detailed logs
	//LogLevel 3 --> Error logs
	
	public Logger(String inputLogFileName, int inputLogLevel) {
		this.totalLogLevel = inputLogLevel;
		this.logFileName = inputLogFileName;
	}
	
	public void Log(String Message, int logLevel) {
		switch(logLevel) {
		case 0: break;
		case 1: if(totalLogLevel > 0) {
					String logMessage = getTimeStamp() + " Message: " + Message;
					sendLog(logMessage);
					break;
				}
				
		case 2: if(totalLogLevel > 1) { 
					String logMessage2 = getTimeStamp() + " DETAIL: " + Message;
					sendLog(logMessage2);
					break;
				}
		case 3: if(totalLogLevel > 2) { 
					String logMessage3 = getTimeStamp() + " ERROR: " + Message;
					sendLog(logMessage3);
					break;	
				}
		}
	}
	
	private void sendLog(String message) {
		writeLog(message);
		debugLog(message);
	}
	
	private void writeLog(String message) {
		Path path = Paths.get("");
		path = path.resolve(logFileName + ".txt");
		
		try (FileWriter fw = new FileWriter(path.toFile(), true);
				BufferedWriter bw = new BufferedWriter(fw)) {
								
			bw.append(message);
			bw.newLine();
			
		} catch(IOException ex) {
			System.out.println("FILE WRITE ERROR");
			System.out.println(ex.getMessage());
		} 
				
	}
	
	private void debugLog(String message) {
		System.out.println(message);
	}
	
	private String getTimeStamp() {
		return LocalDateTime.now()
				.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
	}

}
