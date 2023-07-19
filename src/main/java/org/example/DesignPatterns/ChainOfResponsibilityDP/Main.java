package org.example.DesignPatterns.ChainOfResponsibilityDP;

public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.log(LogProcessor.INFO,"Information captured");
        logProcessor.log(LogProcessor.DEBUG, "Debugging issue");
        logProcessor.log(LogProcessor.ERROR, "Found error");
    }
}
