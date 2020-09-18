package huanchongliu;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Huanchongliu {
	public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new FileReader("C:\\myfile.txt"));
    BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\myfile_cp2.txt"));
    String line ;
    while((line=br.readLine())!=null){
        System.out.println("文本内容为: "+line);
        bw.write(line);
        bw.newLine();
    }
    bw.flush();
    bw.close();
    br.close();
	}
}
