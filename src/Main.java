import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.print("請輸入目錄路徑：");
            String directoryPath = reader.readLine();

            System.out.print("請輸入輸出檔案名稱：");
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
            System.out.println("已經將檔案名稱列出並寫入至 " + outputFilePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
