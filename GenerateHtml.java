import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GenerateHtml {

    public static void main(String[] args) {
        String htmlContent = "<html>\n<head>\n<title>Hello World</title>\n</head>\n<body>\n<h1>Hello World!2</h1>\n</body>\n</html>";

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("index.html"))) {
            writer.write(htmlContent);
            System.out.println("Successfully created index.html");
        } catch (IOException e) {
            System.err.println("An error occurred while writing the HTML file.");
            e.printStackTrace();
        }
    }

}
