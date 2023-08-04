import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("Please enter the directory path: ");
            String directoryPath = reader.readLine();

            System.out.print("Please enter the output file name: ");
            String outputFileName = reader.readLine();
            String outputFilePath = directoryPath + "\\" + outputFileName + ".txt";

            File directory = new File(directoryPath);
            File[] files = directory.listFiles();

            FileWriter fileWriter = new FileWriter(outputFilePath);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

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
