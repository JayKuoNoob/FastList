import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            // Prompt for directory path
            System.out.print("Please enter the directory path: ");
            String directoryPath = reader.readLine();

            // Prompt for output file name
            System.out.print("Please enter the output file name: ");
            String outputFileName = reader.readLine();
            String outputFilePath = directoryPath + "\\" + outputFileName + ".txt";  // Add the .txt extension

            File directory = new File(directoryPath);
            File[] files = directory.listFiles();

            FileWriter fileWriter = new FileWriter(outputFilePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            // Write file names to the output file
            for (File file : files) {
                bufferedWriter.write(file.getName());
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            System.out.println("File names have been listed and written to " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
