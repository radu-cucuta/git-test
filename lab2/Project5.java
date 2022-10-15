import java.io.*;
import java.nio.file.Files;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Project5 {
    public static void Main() throws IOException {
        // String to be scanned to find the pattern.

        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\40765\\Desktop\\An4Sem1\\Ingineria Programarii\\Lab\\Lab2Java\\java\\src\\emails.txt"));
        StringBuilder stringBuilder = new StringBuilder();
        String line = null;
        String ls = System.getProperty("line.separator");
        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
            stringBuilder.append(ls);
        }

        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        reader.close();

        String content = stringBuilder.toString();
        String pattern = "(.+)@(.+)";


        // Create a Pattern object
        Pattern r = Pattern.compile(pattern);

        // Now create matcher object.
        Matcher m = r.matcher(content);
        while (m.find()) {
            System.out.println("Found value: " + m.group(0) );
            //System.out.println("Found value: " + m.group(1) );
        }
    }
}
