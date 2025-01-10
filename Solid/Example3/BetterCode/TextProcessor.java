package Solid.Example3.BetterCode;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TextProcessor {

    private FileProcessor fileProcessor;

    public TextProcessor(FileProcessor fileProcessor) {
        this.fileProcessor = fileProcessor;
    }
    
    public void convertText() {
        try {
            System.out.println("Please specify the full file path to convert to HTML.");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String fullFilePath = reader.readLine();
            if (fullFilePath == null || fullFilePath.isEmpty()) {
                return;
            }

            String inputText = this.fileProcessor.readAllText();
            String[] paragraphs = inputText.split("(\\r\\n?|\\n)");

            StringBuilder sb = new StringBuilder();
            for (String paragraph : paragraphs) {
                if (paragraph.trim().isEmpty()) {
                    continue;
                }
                sb.append("<p>").append(paragraph).append("</p>\n");
            }
            sb.append("<br/>\n");

            this.fileProcessor.writeToFile(sb.toString());

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}
