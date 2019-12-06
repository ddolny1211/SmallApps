import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Skrot {
    public static void main(String[] args) throws IOException {
        String[] lines = readFromFile();
        FileWriter fileWriter = new FileWriter("diff.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (int i = 0; i < lines.length-1; i += 2) {
            System.out.println(lines[i]);
            System.out.println(lines[i + 1]);
            String s = checkBitPairs(lines[i], lines[i + 1]);
            System.out.println(s);
            System.out.println();
            bufferedWriter.write(lines[i]);
            bufferedWriter.newLine();
            bufferedWriter.write(lines[i + 1]);
            bufferedWriter.newLine();
            bufferedWriter.write(checkBitPairs(lines[i], lines[i + 1]));
            bufferedWriter.newLine();
            bufferedWriter.write("\n");
        }
        bufferedWriter.close();
    }

    private static String[] readFromFile() throws FileNotFoundException {
        FileReader fileReader = new FileReader("hash.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String[] readerLines = new String[12];
        int index = 0;
        try {
            String line = bufferedReader.readLine();
            while (line != null) {
                line = line.substring(0, line.indexOf(" "));
                readerLines[index] = line;
                index++;
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return readerLines;
    }

    private static String checkBitPairs(String line1, String line2) {
        String firstLine = convertLineToBinary(line1);
        String secondLine = convertLineToBinary(line2);
        int bitsLen = line1.length() * 4;
        int maxNum = firstLine.length();
        int differentBitCounter = 0;
        for (int i = 0; i < maxNum; i++) {
            if (firstLine.charAt(i) != secondLine.charAt(i)) {
                differentBitCounter++;
            }
        }
        int result = (differentBitCounter * 100) / maxNum;
        //System.out.println("Liczba bitow rozniaca wyniki : "+differentBitCounter/2+" tj. "+result+"% z "+bitsLen);
        return "Liczba bitow rozniaca wyniki : " + differentBitCounter / 2 + " tj. " + result + "% z " + bitsLen;

    }

    private static String convertLineToBinary(String line) {
        StringBuilder stringBuilder = new StringBuilder();
        byte[] bytesLine = line.getBytes();
        for (byte b : bytesLine) {
            stringBuilder.append(to8bitBinary(b));
        }
        //System.out.println(stringBuilder.toString());
        return stringBuilder.toString();
    }

    private static String to8bitBinary(byte b) {
        StringBuilder binary = new StringBuilder();
        while (b > 0) {
            if (b % 2 == 0) {
                binary.append("0");
            } else {
                binary.append("1");
            }
            b = (byte) (b / 2);
        }
        if (binary.length() == 6) {
            binary.append("00");
        } else if (binary.length() == 7) {
            binary.append("0");
        }
        //System.out.println(binary.reverse().toString());
        return binary.reverse().toString();
    }
}
