package org.example.DesignPatterns.ChainOfResponsibilityDP;

public class DebugLogProcessor extends LogProcessor {
    public DebugLogProcessor(LogProcessor logProcessor) {
        super(logProcessor);
    }
    public void log(int logValue, String message) {
        if(logValue == DEBUG)
            System.out.println("Debug :" + message);
        else
            super.log(logValue, message);
    }
}
