package Influx;

import org.influxdb.InfluxDB;
import org.influxdb.InfluxDBFactory;
import org.influxdb.dto.Point;
import org.influxdb.dto.QueryResult;

import org.influxdb.dto.Query;
import java.util.Queue;

/*public class InfluxClient {
    private final static String SHOW_DATABASES = "SHOW DATABASES";
    private final static String CREATE_DATABASE = "CREATE DATABASE ";
    private final InfluxDB db;

    public InfluxClient() {
        db = InfluxDBFactory.connect("", "root", "root");
        boolean good = db.ping().isGood();
        System.out.println(db.ping().isGood() ? "Influx connected" : "Influx connection failed");
    }

    public void createDBIfNeeded(String dbName) {
        Query q = new Query(SHOW_DATABASES);
        QueryResult qResult = db.query(q);
        QueryResult.Result result = qResult.getResults().get(0);
        boolean dbExists = result.getSeries().get(0).getValues().stream().anyMatch(val -> val.contains(dbName));

        if (!dbExists) {
                    System.out.println("Create database " + dbName);
                    db.query(new Query(CREATE_DATABASE + dbName));

                }
                db.setDatabase(dbName);
    }

    public void writePoint(Point point) { db.write(point);}
}
*/