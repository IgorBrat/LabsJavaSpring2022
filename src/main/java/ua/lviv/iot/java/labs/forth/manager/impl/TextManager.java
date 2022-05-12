package ua.lviv.iot.java.labs.forth.manager.impl;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import ua.lviv.iot.java.labs.forth.manager.ITextManager;

public class TextManager implements ITextManager {
  String regexEthernet = "RJ\\d{2} \\d\\p{Upper}\\d\\p{Upper}";
  Pattern pattern = Pattern.compile(regexEthernet);

  @Override
  public List<String> findEthernetConnectorsFromTxt(String filename) throws IOException {
    Scanner sc = new Scanner(
        new File(Paths.get("").toAbsolutePath().toString() + "\\src\\test\\resources", filename),
        Charset.defaultCharset());
    List<String> ethernetConnectors =
        sc.findAll(pattern).map(MatchResult::group).collect(Collectors.toList());
    sc.close();
    return ethernetConnectors;
  }

  @Override
  public List<String> findEthernetConnectorsFromString(String text) throws IOException {
    Scanner sc = new Scanner(text);
    List<String> ethernetConnectors =
        sc.findAll(pattern).map(MatchResult::group).collect(Collectors.toList());
    sc.close();
    return ethernetConnectors;
  }

}
