package ua.lviv.iot.java.labs.forth.writer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import ua.lviv.iot.java.labs.forth.models.Good;

public class GoodWriter {
	public static void writeCSV(List<Good> goods) throws IOException {
		try (FileWriter writer = new FileWriter("result.csv"); FileReader reader = new FileReader("result.csv")) {
			String previousClassName = "";

			for (Good good : goods) {
				if (!good.getTypeName().equals(previousClassName)) {
					writer.write(good.getHeaders());
					writer.write("\r\n");
					previousClassName = good.getTypeName();
				}
//				if(true) {
//					writer.write(good.toCSV());
//					writer.write("\r\n");
//				}
			}
		}
	}
}