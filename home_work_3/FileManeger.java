package home_work_3;
import java.io.*;


public class FileManeger {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        write("test.txt", "Hello Word");

        System.out.println(read("test.txt"));
    }
    //Метод для чтения содержимого файла

    public static String read(String filePath) throws FileNotFoundException, IOException {
       //Создаем для чтения файла

       FileReader fileReader = new FileReader(filePath);

       BufferedReader bufferedReader = new BufferedReader(fileReader);

       String content = "";

       try {
        String line;
        while((line = bufferedReader.readLine())!= null){
            content += line;
        }
       } finally {
         bufferedReader.close();
         fileReader.close();
       }

        return content;
    }

    public static void write(String filePath, String content) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath);

        try {
            fileWriter.write(content);
        }finally {
            fileWriter.close();
        }
    }

    public static void copy(String sourceFilePath, String destinationFilePath) throws IOException {
        FileInputStream fileInputStream = new FileInputStream(sourceFilePath);
        FileOutputStream fileOutputStream = new FileOutputStream(destinationFilePath);

        byte[] buffer = new byte[1024];
        int bytesRead;

        try {
            while ((bytesRead = fileInputStream.read(buffer)) != -1) {
                fileOutputStream.write(buffer, 0, bytesRead);
            }
        } finally {
            fileInputStream.close();
            fileOutputStream.close();
        }
    }

}
