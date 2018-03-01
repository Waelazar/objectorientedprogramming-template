package oop.pset1.parser;

import oop.pset1.module.Movie;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReadFilePath extends AbstractMovieParser {
    @Override
    protected Function<String[], Object> toObject() {
        return column -> {
            Movie movieClass = new Movie();
            movieClass.setGeneres(geners(column[3]));
            movieClass.setTitle(column[20]);
            movieClass.setVote_avarrage(Double.parseDouble(column[22]));
            return movieClass;
        };

    }

    private List<String> geners(String column) {
        String genersColumn = column.replaceAll("\\[", "").replaceAll("]", "")
                .replaceAll("\\{", "").replaceAll("}", "")
                .replaceAll("'", "");
        String[] word = genersColumn.split(", ");

        return Stream.of(word)
                .filter(line -> line != null)
                .map(line -> line.split(": "))
                .filter(e -> e.length == 2)
                .filter(e -> e[0].equals("name"))
                .map(e -> e[1])
                .collect(Collectors.toList());
    };

}
