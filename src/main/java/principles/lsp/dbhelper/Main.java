package principles.lsp.dbhelper;

public class Main {
    private static void connect(DBHelper dbHelper) {
        dbHelper.connect();
    }

    private static void query(DBHelper dbHelper) {
        dbHelper.query();
    }

    public static void main(String[] args) {
        var sqlHelper = new SQLHelper();
        connect(sqlHelper);
        query(sqlHelper);

        var oracleHelper = new OracleHelper();
        connect(oracleHelper);
        query(oracleHelper);
    }
}