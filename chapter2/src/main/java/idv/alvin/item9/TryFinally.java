package idv.alvin.item9;

import static org.springframework.util.FileCopyUtils.BUFFER_SIZE;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TryFinally {

  public static void main(String[] args) throws IOException {
    tryException(
        "E:\\program-practise\\java\\練習\\effect-java\\chapter2\\target\\classes\\tryfinally.txt");
  }

  static String firstLineOfFile(String path) throws IOException {
    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      return br.readLine();
    }
  }

  static void secondLineOfFile(String src, String dst) throws IOException {
    try (InputStream in = new BufferedInputStream(Files.newInputStream(Paths.get(src)));
        OutputStream out = new BufferedOutputStream(Files.newOutputStream(Paths.get(dst)))) {
      byte[] buf = new byte[BUFFER_SIZE];
      int n;
      while ((n = in.read(buf)) >= 0) {
        out.write(buf, 0, n);
      }
    }
  }

  static void tryException(String path) throws IOException {
    try (BufferedReader inputStream = new BufferedReader(new CloseExceptionInputStream(path))) {
      inputStream.readLine();
      throw new NullPointerException("this is null pointer exception");
    } catch (IOException e) {
      log.error("IOException: exception:{}", e.getLocalizedMessage(), e);
    }
  }
}
