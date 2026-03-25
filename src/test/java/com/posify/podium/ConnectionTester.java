import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

@Component
public class ConnectionTester {

    @Autowired
    private MongoTemplate mongoTemplate;

    @PostConstruct
    public void testConnection() {
        System.out.println("--- Testing MongoDB Connection ---");
        try {
            String dbName = mongoTemplate.getDb().getName();
            System.out.println("Successfully connected to database: " + dbName);
            // This will print the name of your database, which should be 'podium'
        } catch (Exception e) {
            System.err.println("Failed to connect to MongoDB. Error: " + e.getMessage());
        }
        System.out.println("--- Test Complete ---");
    }
}