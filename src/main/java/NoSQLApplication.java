import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.config.EnableMongoAuditing;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * Created by wangchen on 2016/11/29.
 */
@SpringBootApplication
@ComponentScan("club.iwalker.nosql")
@EnableMongoRepositories
@EnableMongoAuditing
public class NoSQLApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(NoSQLApplication.class, args);
    }
}
