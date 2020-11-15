package upgrade;

import java.io.FileInputStream;
import java.io.IOException;

public class Chapter15_FileInputStreamTest2 {
	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream("input2.txt")) {
			byte[] bs = new byte[10];
			int i;
			while ((i = fis.read(bs)) != -1) {
				for (byte b : bs) {
					System.out.print((char) b);
				}
				System.out.println(": " + i + "����Ʈ ����");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
	}
}