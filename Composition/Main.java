package Composition;

public class Main {
    public static void main(String[] args) {
        // Folder initialization
        Folder phpDemo1 = new Folder("php_demo1");
        Folder sourceFiles = new Folder("Source Files");
        Folder phalcon = new Folder(".phalcon");
        Folder app = new Folder("app");
        Folder config = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");
        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");
        Folder includePath = new Folder("Include Path");
        Folder remoteFiles = new Folder("Remote Files");

        // Subfolder initialization
        // App subfolders
        app.addFolder(config);
        app.addFolder(controllers);
        app.addFolder(library);
        app.addFolder(migrations);
        app.addFolder(models);
        app.addFolder(views);

        // demo1 subfolders
        phpDemo1.addFolder(sourceFiles);
        phpDemo1.addFolder(includePath);
        phpDemo1.addFolder(remoteFiles);

        // Source File subfolders
        sourceFiles.addFolder(phalcon);
        sourceFiles.addFolder(app);
        sourceFiles.addFolder(cache);
        sourceFiles.addFolder(publicFolder);

        // File initialization:
        publicFolder.addFile(new File(".htaccess"));
        publicFolder.addFile(new File(".htrouter.php"));
        publicFolder.addFile(new File("index.html"));

        // Print file system
        System.out.println("\nOriginal File System:");
        phpDemo1.print("");

        // Print after app folder removal
        System.out.println("\nDelete app folder:");
        sourceFiles.removeFolder(app);
        phpDemo1.print("");

        // Print after public folder removal
        System.out.println("\nDelete public folder:");
        sourceFiles.removeFolder(publicFolder);
        phpDemo1.print("");

        System.out.println();
    }
}
