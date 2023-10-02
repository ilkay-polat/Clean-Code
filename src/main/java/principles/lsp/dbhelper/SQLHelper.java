package principles.lsp.dbhelper;

public class SQLHelper extends DBHelper {

    @Override
    public void connect() {
        System.out.println("SQLHelper.connect() method!");
    }

    @Override
    public void query() {
        System.out.println("SQLHelper.query() method!");
    }
}