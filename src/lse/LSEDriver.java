package lse;
import java.io.IOException;
public class LSEDriver {
	public static void main(String[] args) throws IOException {
	      String docsFile   = "testdocs.txt";
	      String noiseWords = "noisewords.txt";

	      LittleSearchEngine searchEngine = new LittleSearchEngine();

	      searchEngine.makeIndex(docsFile, noiseWords);

	      String kw1 = "deep";
	      String kw2 = "world";

	      System.out.println(searchEngine.top5search("red", "yellow"));
	   }
}
