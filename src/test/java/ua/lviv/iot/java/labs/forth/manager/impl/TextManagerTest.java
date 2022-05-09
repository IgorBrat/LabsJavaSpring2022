package ua.lviv.iot.java.labs.forth.manager.impl;

import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TextManagerTest {

  TextManager textManager;
  Scanner scanEmptyFile;
  Scanner scanSomeEthernetConnectors;
  Scanner scanNoEthernetConnectors;
  List<String> ethernetConnectors;

  @BeforeAll
  static void setUpBeforeClass() throws Exception {}

  @AfterAll
  static void tearDownAfterClass() throws Exception {}

  @BeforeEach
  void setUp() throws Exception {
    textManager = new TextManager();
    ethernetConnectors = new ArrayList<String>();
    scanEmptyFile =
        new Scanner(new File(Paths.get("").toAbsolutePath().toString() + "\\src\\test\\resources",
            "Empty.txt"));
    scanSomeEthernetConnectors =
        new Scanner(new File(Paths.get("").toAbsolutePath().toString() + "\\src\\test\\resources",
            "SomeEthernetConnectors.txt"));
    scanNoEthernetConnectors =
        new Scanner(new File(Paths.get("").toAbsolutePath().toString() + "\\src\\test\\resources",
            "NoEthernetConnectors.txt"));
  }

  @AfterEach
  void tearDown() throws Exception {}

  @Test
  void testFindSomeEthernetConnectors() throws IOException {
    ethernetConnectors = textManager.findEthernetConnectorsFromTxt("SomeEthernetConnectors.txt");
    assertEquals("RJ11 4P4C", ethernetConnectors.get(0));
    assertEquals("RJ45 8P8C", ethernetConnectors.get(1));
  }

  @Test
  void testFindNoEthernetConnectors() throws IOException {
    ethernetConnectors = textManager.findEthernetConnectorsFromTxt("NoEthernetConnectors.txt");
    assertEquals(new ArrayList<String>(), ethernetConnectors);
  }

  @Test
  void testEmptyFile() throws IOException {
    ethernetConnectors = textManager.findEthernetConnectorsFromTxt("Empty.txt");
    assertEquals(new ArrayList<String>(), ethernetConnectors);
  }

}
