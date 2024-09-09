package idv.alvin.item9;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CloseExceptionInputStream extends FileReader {


  public CloseExceptionInputStream(String name) throws FileNotFoundException {
    super(name);
  }


  @Override
  public void close() throws IOException {
    throw new IOException("close exception");
  }
}
