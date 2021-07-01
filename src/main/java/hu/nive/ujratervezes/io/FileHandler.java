package hu.nive.ujratervezes.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class FileHandler {

    public int splitForList (String line){
        int resolve = 0;
        if (line.charAt(0) != '/') {
            if (Integer.parseInt(line) < 10000) {
                resolve = Integer.parseInt(line);
            }
        }

       return resolve;
    }

    int sumIgnoreComments(String file){
        Path path = Path.of(file);

        try (BufferedReader br = Files.newBufferedReader(path)) {

            String line;

            List<Integer> numbersInText = new ArrayList<>();

            while ((line = br.readLine()) != null)
            {
                numbersInText.add(splitForList(line));
            }

            int resolve = 0;
            for (int i = 0; i < numbersInText.size(); i++ )
            {
                resolve = resolve + numbersInText.get(i);
            }


            return resolve;
        }
        catch (IOException e) {
            throw new IllegalStateException("Can't read file", e);
        }
    }
}

