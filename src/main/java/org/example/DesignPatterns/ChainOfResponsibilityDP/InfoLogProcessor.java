package org.example.DesignPatterns.ChainOfResponsibilityDP;

public class InfoLogProcessor extends LogProcessor{
    public InfoLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }
    public void log(int logValue, String message) {
        if(logValue == INFO)
            System.out.println("INFO:" + message);
        else
            super.log(logValue, message);
    }
}
