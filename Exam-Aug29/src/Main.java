import io.ConsoleReader;
import io.ConsoleWriter;
import io.InputReader;
import io.OutputWriter;
import manager.Manager;
import places.Guild;
import places.Province;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        InputReader reader = new ConsoleReader();
        OutputWriter writer = new ConsoleWriter();
        Manager manager = new Manager();

        Engine engine = new Engine(reader, writer, manager);

        engine.run();
    }
}
