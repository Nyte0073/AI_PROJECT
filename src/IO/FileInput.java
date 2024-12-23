package IO;

import GUI.Main_Window;

import java.util.*;
import java.io.*;

public class FileInput {

    private String fileInput = "";
    private final ArrayList <File> files = FileConstants.files;

    public String getInput() {
        return new Main_Window().area.getText();
    }

    public boolean sendInput() {
        return false;
    }

    public void run() {
       fileInput = getInput();
        System.out.println("It worked.");
    }
}
