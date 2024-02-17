package Composition;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String name;
    private List<File> files = new ArrayList<>();
    private List<Folder> subFolders = new ArrayList<>();

    // Folder Constructor
    public Folder(String name) {
        this.name = name;
    }

    // Getteres
    public String getName() {
        return name;
    }

    public List<File> getFiles() {
        return files;
    }

    public List<Folder> getSubFolders() {
        return subFolders;
    }

    // Setters
    public void setName(String newName) {
        this.name = newName;
    }

    public void setFiles(List<File> newFiles) {
        this.files = newFiles;
    }

    public void setSubFolders(List<Folder> newSubFolders) {
        this.subFolders = newSubFolders;
    }

    // Functions
    public void addFile(File file) {
        files.add(file);
    }

    public void addFolder(Folder folder) {
        subFolders.add(folder);
    }

    public void removeFolder(Folder folder) {
        subFolders.remove(folder);
    }

    public void print(String indent) {
        System.out.println(indent + name);
        for (Folder folder: subFolders) {
            folder.print(indent + " ");
        }

        for (File file: files) {
            file.print(indent + " ");
        }

    }
}
