package idv.alvin.item9;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryFinally {

  public static void main(String[] args) {

  }

  static String firstLineOfFile(String path) throws IOException {
    BufferedReader br = null;
    try {
      br = new BufferedReader(new FileReader(path));
      return br.readLine();
    }  finally {
      br.close();
    }
  }

}
