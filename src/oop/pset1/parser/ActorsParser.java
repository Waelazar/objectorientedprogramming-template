package oop.pset1.parser;

import oop.pset1.module.Actors;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ActorsParser {

    public List<Object> actorsList() {
        String filePath = "src/oop/pset1/data/actors.csv";

        Stream<String> lines = null;
        try {
            lines = Files.lines(Paths.get(filePath));
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }

        assert lines != null;
        return lines.skip(1)
                .map(line -> line.split(";"))
                .filter(line -> line.length == 3)
                .map(toActors())
                .collect(Collectors.toList());
    }

    private Function<String[], Object> toActors() {
        return column -> {
            Actors actors = new Actors();
            actors.setName(toParseCast(column[0]));
            actors.setGender(toParseCrew(column[1]));
            return actors;
        };
    }

    private List<String> toParseCrew(String crew) {

        String object = crew.replaceAll("\\[", "").replaceAll("]", "")
                .replaceAll("\\{", "").replaceAll("}", "").replaceAll("\"", "")
                .replaceAll("'", "");

        String[] genderSplit = object.split(", ");

        return Stream.of(genderSplit)
                .map(line -> line.split(": "))
                .filter(line -> line.length == 2)
                .filter(e -> e[0].equals("gender"))
                .filter(e -> e[1].equals("2") || e[1].equals("1"))
                .map(e -> e[1])
                .collect(Collectors.toList());
    }

    private List<String> toParseCast(String name) {
        String object = name.replaceAll("\\[", "").replaceAll("]", "")
                .replaceAll("\\{", "").replaceAll("}", "")
                .replaceAll("'", "");

        String[] splitName = object.split(", ");

        return Stream.of(splitName)
                .map(line -> line.split(": "))
                .filter(e -> e.length == 2)
                .filter(e -> e[0].equals("name"))
                .map(e -> e[1])
                .collect(Collectors.toList());
    }
}
