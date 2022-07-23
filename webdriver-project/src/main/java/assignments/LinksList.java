package assignments;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.opencsv.CSVReader;

public class LinksList {

	public List<String[]> linkList(FileReader fileReader) throws Exception {
		List<String[]> list = new ArrayList<>();
		try (CSVReader reader = new CSVReader(fileReader)) {
			list = reader.readAll();
		}
		return list;
	}
}
