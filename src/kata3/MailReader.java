package kata3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class MailReader {

    private final String filePath;

    public MailReader(String filePath) {
        this.filePath = filePath;
    }

    public String[] readDomains() {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            ArrayList<String> domainList = new ArrayList<>();
            reader.close();
        } catch (IOException ex) {
            try {
                reader.close();
            } catch (IOException ex1) {}
            return new String[0];
        }
        return null;
    }

    public String getFilepath() {
        return filePath;
    }
}
