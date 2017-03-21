package chapter20.FilenameFilter;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by Владислав on 19.03.2017.
 */
public class SomeEndOfFile implements FilenameFilter {
    String end;

    public SomeEndOfFile(String end) {
        this.end = "." + end;
    }

    @Override
    public boolean accept(File dir, String name) {
        return name.endsWith(end);
    }
}
