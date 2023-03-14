import java.sql.SQLException;

public class DaoFactory {

    public static Ads getAdsDao() {
        Config config = new Config();
        return new MySQLAdsDao(config);
    }

}

