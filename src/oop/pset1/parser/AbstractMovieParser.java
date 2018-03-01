package oop.pset1.parser;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public abstract class AbstractMovieParser {
    public List<Object> asList(String filePath) {

        Stream<String> lines = null;
        try {
            lines = Files.lines(Paths.get(filePath));
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines.skip(1)
                .map(line -> line.split(";"))
                .filter(line -> line.length == 24)
                .filter(Objects::nonNull)
                .map(toObject())
                .collect(Collectors.toList());
    }

    protected abstract Function<String[], Object> toObject();

}
