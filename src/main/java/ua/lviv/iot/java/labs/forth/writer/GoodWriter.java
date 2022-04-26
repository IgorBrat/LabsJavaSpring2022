package ua.lviv.iot.java.labs.forth.writer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;
import ua.lviv.iot.java.labs.forth.models.Good;

public class GoodWriter {
  public static void writeCSV(List<Good> goods, String fileName) throws IOException {
    try (FileWriter writer = new FileWriter(
        new File("E:\\Labs\\java\\LabsJavaSpring2022\\src\\test\\resources", fileName),
        Charset.defaultCharset())) {
      String previousClassName = "";
      for (Good good : goods) {
        if (!good.getTypeName().equals(previousClassName)) {
          writer.write(good.getHeaders());
          writer.write("\r\n");
          previousClassName = good.getTypeName();
        }
        writer.write(good.toCSV());
        writer.write("\r\n");
      }
    }
  }
}
