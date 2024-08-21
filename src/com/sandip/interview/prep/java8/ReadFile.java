package com.sandip.interview.prep.java8;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Read the data from the file where there is id, name, address and salary
//Group the data by id
public class ReadFile {
	public static void main(String[] args) {
		Path path = Path.of("Test.txt");
		try {

			List<FileDto> fileList = Files.lines(path).skip(1).map(p -> {
				String[] data = p.split(",");
				return new FileDto(Integer.parseInt(data[0]), data[1], data[2], Integer.parseInt(data[3]));
			}).collect(Collectors.toList());
			System.out.println(fileList);

			Map<Integer, List<FileDto>> map = fileList.stream()
					.collect(Collectors.groupingBy(e -> e.getId(), Collectors.toList()));
			System.out.println(map);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
