package willitwork;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Logger {
	private int totalLogLevel;
	//LogLevel 0 --> no logs
	//Loglevel 1 --> normal logs
	//LogLevel 2 --> detailed logs
	//LogLevel 3 --> Error logs
	
	public Logger(int inputLogLevel) {
		this.totalLogLevel = inputLogLevel;
	}
	
	public void Log(String Message, int logLevel) {
		switch(logLevel) {
		case 0: break;
		case 1: if(totalLogLevel > 0) {
					String logMessage = getTimeStamp() + " Message: " + Message;
						WriteLog(logMessage);
							break;
				}
				
		case 2: if(totalLogLevel > 1) { 
					String logMessage2 = getTimeStamp() + " DETAIL: " + Message;
					WriteLog(logMessage2);
					break;
				}
		case 3: if(totalLogLevel > 2) { 
					String logMessage3 = getTimeStamp() + " ERROR: " + Message;
					WriteLog(logMessage3);
					break;	
				}
		}
	}
	/*
	public void Log(String message, int inputLogLevel) {
		
		if(inputLogLevel == 0) {
			
		} else {
			if(inputLogLevel == 1) {
				String logMessage = getTimeStamp() + " Message: " + message;
				WriteLog(logMessage);
			} else {
				if(inputLogLevel == 2) {
					String logMessage = getTimeStamp() + " DETAIL: " + message;
					WriteLog(logMessage);
				} else {
					if(inputLogLevel == 3) {
						String logMessage = getTimeStamp() + " ERROR: " + message;
						WriteLog(logMessage);
					}
				}
			}
		}		
	}
	*/
	
	private void WriteLog(String message) {
		System.out.println(message);
	}
	
	private String getTimeStamp() {
		return LocalDateTime.now()
				.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"));
	}

}
