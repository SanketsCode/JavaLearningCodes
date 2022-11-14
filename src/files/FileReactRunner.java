package files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReactRunner {
	public static void main(String[] args) throws IOException {
		
		Path pathFileRead = Paths.get("./resources/data.txt");
		
		List<String> lines = Files.readAllLines(pathFileRead);
		
//		System.out.println(lines);
		
		Files.lines(pathFileRead)
		.map(String::toLowerCase)
		.forEach(System.out::println);
		
	}

}
