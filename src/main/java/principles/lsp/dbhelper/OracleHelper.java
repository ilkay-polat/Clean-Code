package principles.lsp.dbhelper;

public class OracleHelper extends DBHelper {

    @Override
    public void connect() {
        System.out.println("OracleHelper.connect() method!");
    }

    @Override
    public void query() {
        System.out.println("OracleHelper.query() method!");
    }
}