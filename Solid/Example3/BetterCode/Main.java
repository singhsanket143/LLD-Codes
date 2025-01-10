package Solid.Example3.BetterCode;

public class Main {
    public static void main(String[] args) {
        FileProcessor fp = new FileProcessor("../../");
        TextProcessor textProcessor = new TextProcessor(fp);
        textProcessor.convertText();
    }
    
}
