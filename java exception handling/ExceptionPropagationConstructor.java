import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

class FileHandler {
    private File file;

    public FileHandler(String filePath) throws IOException {
        file = new File(filePath);

        if (!file.exists()) {
            throw new FileNotFoundException("File not found at path: " + filePath);
        } else {
            System.out.println("✅ File found successfully: " + filePath);
        }
    }

    public void readFile() {
        System.out.println("📖 Reading file contents...");
    }
}

public class ExceptionPropagationConstructor {
    public static void main(String[] args) {
        try {
            FileHandler fh = new FileHandler("non_existing_file.txt");
            fh.readFile();
        } catch (IOException e) {
            System.out.println("❌ Exception caught while creating FileHandler: " + e.getMessage());
        } finally {
            System.out.println("📁 File handling process completed.");
        }
    }
}
