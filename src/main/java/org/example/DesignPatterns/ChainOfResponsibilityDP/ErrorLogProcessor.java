package org.example.DesignPatterns.ChainOfResponsibilityDP;

public class ErrorLogProcessor extends LogProcessor{
    public ErrorLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }
    public void log(int logValue, String message) {
        if(logValue == ERROR)
            System.out.println("Error:" + message);
        else
            super.log(logValue, message);
    }
}
