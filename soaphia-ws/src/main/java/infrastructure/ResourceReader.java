package infrastructure;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ResourceReader {

    public static Optional<String> read(String stringPath)
    {
        try
        {

            Path path = Paths.get(ResourceReader.class.getResource(stringPath).getPath());
            List<String> lines = Files.readAllLines(path);
            return Optional.ofNullable(lines.stream().collect(Collectors.joining("\n")));
        }
        catch (IOException | NullPointerException ex)
        {
            return Optional.empty();
        }

    }
}
