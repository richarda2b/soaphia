import static org.junit.Assert.*;

import java.util.Optional;

import org.junit.Test;

import infrastructure.ResourceReader;

public class ResourceReaderTest {

    @Test
    public void test() {

        Optional<String> content = ResourceReader.read("/json-data/test.json");
        content.ifPresent(System.out::println);
        assertNotNull(content);
    }
}