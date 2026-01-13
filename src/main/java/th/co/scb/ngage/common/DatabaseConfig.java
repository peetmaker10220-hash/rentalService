// package th.co.scb.ngage.common;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.jdbc.datasource.DriverManagerDataSource;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Value;

// import java.sql.DriverManager;
// import java.sql.SQLException;

// import javax.sql.DataSource;

// import com.azure.core.credential.TokenRequestContext;
// import com.azure.identity.ClientSecretCredential;
// import com.azure.identity.ClientSecretCredentialBuilder;
// import com.azure.identity.DefaultAzureCredentialBuilder;
// import com.azure.identity.ManagedIdentityCredential;
// import com.azure.identity.ManagedIdentityCredentialBuilder;

// import com.azure.identity.DefaultAzureCredentialBuilder;
// import com.azure.identity.extensions.jdbc.postgresql.AzurePostgresqlAuthenticationPlugin;

// import lombok.extern.slf4j.Slf4j;

// import com.azure.core.credential.TokenRequestContext;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.jdbc.core.JdbcTemplate;
// import org.springframework.jdbc.datasource.DriverManagerDataSource;
// import org.springframework.beans.factory.annotation.Value;
// import javax.sql.DataSource;

// import java.sql.Connection; 
// @Slf4j
// @Configuration
// public class DatabaseConfig {
//     @Value("${spring.profiles.active}")
//     private String active;

//     @Autowired
//     private DataSourceProperties dataSourceProperties;

//     @Bean
//     public DataSource dataSource() {
//         DriverManagerDataSource dataSource = new DriverManagerDataSource();
//         if (active.equalsIgnoreCase("local")) {
//             dataSource.setDriverClassName(dataSourceProperties.getLocal().getDriverClassName());
//             dataSource.setUrl(dataSourceProperties.getLocal().getUrl());
//             dataSource.setUsername(dataSourceProperties.getLocal().getUsername());
//             dataSource.setPassword(dataSourceProperties.getLocal().getPassword());
//         } else {
//             // String token = getAccessToken();
//             // dataSource.setDriverClassName(dataSourceProperties.getDriverClassName());
//             // dataSource.setUrl(dataSourceProperties.getUrl());
//             // dataSource.setUsername(dataSourceProperties.getUsername());
//             // dataSource.setPassword(token);

//             String url = "jdbc:postgresql://";
//             String user = "DEV"; // Replace with your PostgreSQL username
            
//             // Create TokenRequestContext
//             TokenRequestContext tokenRequestContext = new TokenRequestContext()
//                     .addScopes("https://ossrdbms-aad.database.windows.net/.default");
            
//             // Obtain the access token
//             String token = new DefaultAzureCredentialBuilder()
//                     .managedIdentityClientId("60955e34-0df9-43f7-9b26-ce513276ea3e")
//                     .build()
//                     .getToken(tokenRequestContext)
//                     .block()
//                     .getToken();
            
//             // Testing connection (this step is generally not required in a DataSource bean)
//             try (Connection conn = DriverManager.getConnection(url, user, token)) {
//                 if (conn != null) {
//                     log.info("Connected to the database!");
//                 } else {
//                     log.info("Failed to make connection!");
//                 }
//             } catch (SQLException e) {
//                 System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
//             }
//         }
//         return dataSource;
//     }

//     @Bean
//     public JdbcTemplate jdbcTemplate(DataSource dataSource) {
//         return new JdbcTemplate(dataSource);
//     }

//     // public String getAccessToken() {
//     //     ManagedIdentityCredential credential = new ManagedIdentityCredentialBuilder()
//     //     .build();

//     // String token = credential.getToken(new TokenRequestContext().addScopes("https://ossrdbms-aad.database.windows.net")).block().getToken();
//     // return token;
//     // }

// //     public String getAccessToken() {
// //     String clientId = System.getenv("AZURE_CLIENT_ID");
// //     String clientSecret = System.getenv("AZURE_CLIENT_SECRET");
// //     String tenantId = System.getenv("AZURE_TENANT_ID");

// //     ClientSecretCredential credential = new ClientSecretCredentialBuilder()
// //             .clientId(clientId)
// //             .clientSecret(clientSecret)
// //             .tenantId(tenantId)
// //             .build();

// //     String token = credential.getToken(new TokenRequestContext().addScopes("https://ossrdbms-aad.database.windows.net")).block().getToken();
// //     return token;
// // }
// }