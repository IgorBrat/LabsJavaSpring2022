package ua.lviv.iot.java.labs.forth.manager;

import java.io.IOException;
import java.util.List;

public interface ITextManager {
  List<String> findEthernetConnectorsFromTxt(String filename) throws IOException;
  List<String> findEthernetConnectorsFromString(String text) throws IOException;
}
