package com.kgisl.parseexbeen;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.HeaderColumnNameMappingStrategy;

public class App {

    public static void main(String[] args) throws IOException {

        String fileName = "src/main/resources/Employe.csv";
        Path myPath = Paths.get(fileName);

        try (BufferedReader br = Files.newBufferedReader(myPath,
                StandardCharsets.UTF_8)) {

            HeaderColumnNameMappingStrategy<GiveUpFile> strategy
                    = new HeaderColumnNameMappingStrategy<>();
            strategy.setType(GiveUpFile.class);
            List <GiveUpFile> persons = new ArrayList <GiveUpFile> ();
            persons.add(new GiveUpFile("1", "Yashwant","new","ACept", "Yashwant","new","ACept", "Yashwant","new",7,3,"sdd","sdsd","sddsd",1,"wewe","sdds"));
            persons.add(new GiveUpFile("2", "Yashwant","new","ACept", "Yashwant","new","ACept", "Yashwant","new",7,3,"sdd","sdsd","sddsd",1,"wewe","sdds"));      persons.add(new GiveUpFile("1", "Yashwant","new","ACept", "Yashwant","new","ACept", "Yashwant","new",7,3,"sdd","sdsd","sddsd",1,"wewe","sdds"));      persons.add(new GiveUpFile("1", "Yashwant","new","ACept", "Yashwant","new","ACept", "Yashwant","new",7,3,"sdd","sdsd","sddsd",1,"wewe","sdds"));      persons.add(new GiveUpFile("1", "Yashwant","new","ACept", "Yashwant","new","ACept", "Yashwant","new",7,3,"sdd","sdsd","sddsd",1,"wewe","sdds"));      persons.add(new GiveUpFile("1", "Yashwant","new","ACept", "Yashwant","new","ACept", "Yashwant","new",7,3,"sdd","sdsd","sddsd",1,"wewe","sdds"));      persons.add(new GiveUpFile("1", "Yashwant","new","ACept", "Yashwant","new","ACept", "Yashwant","new",7,3,"sdd","sdsd","sddsd",1,"wewe","sdds"));      persons.add(new GiveUpFile("1", "Yashwant","new","ACept", "Yashwant","new","ACept", "Yashwant","new",7,3,"sdd","sdsd","sddsd",1,"wewe","sdds"));
            persons.add(new GiveUpFile("3", "Yashwant","new","ACept", "Yashwant","new","ACept", "Yashwant","new",7,3,"sdd","sdsd","sddsd",1,"wewe","sdds"));
            persons.add(new GiveUpFile("4", "Yashwant","new","ACept", "Yashwant","new","ACept", "Yashwant","new",7,3,"sdd","sdsd","sddsd",1,"wewe","sdds"));
            persons.add(new GiveUpFile("5", "Yashwant","new","ACept", "Yashwant","new","ACept", "Yashwant","new",7,3,"sdd","sdsd","sddsd",1,"wewe","sdds"));
            persons.add(new GiveUpFile("6", "Yashwant","new","ACept", "Yashwant","new","ACept", "Yashwant","new",7,3,"sdd","sdsd","sddsd",1,"wewe","sdds"));
            persons.add(new GiveUpFile("7", "Yashwant","new","ACept", "Yashwant","new","ACept", "Yashwant","new",7,3,"sdd","sdsd","sddsd",1,"wewe","sdds"));
            persons.add(new GiveUpFile("8", "Yashwant","new","ACept", "Yashwant","new","ACept", "Yashwant","new",7,3,"sdd","sdsd","sddsd",1,"wewe","sdds"));

            CsvToBean csvToBean = new CsvToBeanBuilder(br)
                    .withType(GiveUpFile.class)
                    .withMappingStrategy(strategy)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            List<GiveUpFile> emp = csvToBean.parse();
           
            emp.forEach(System.out::println);
            
    Map<Object, List<GiveUpFile>> l= persons.stream().collect(Collectors.groupingBy(b-> b.getTRADENUM()));   
    System.out.println("l value--------:"+l);     
        }
    }
}
