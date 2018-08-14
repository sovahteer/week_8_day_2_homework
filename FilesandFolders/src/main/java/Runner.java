import db.DBHelper;
import models.ExtensionType;
import models.File;
import models.Folder;

import java.util.List;

public class Runner {

    public static void main(String[] args){

        Folder pics = new Folder("Pics" );
        DBHelper.save(pics);

        Folder documents = new Folder ("Documents");
        DBHelper.save(pics);

        File file1 = new File("Birthday_1", ExtensionType.JPG, 12,  pics);
        DBHelper.save(file1);
        File file2 = new File("Letter_of_Resignation", ExtensionType.DOCX, 6, documents);
        DBHelper.save(file2);

        
    }
}
