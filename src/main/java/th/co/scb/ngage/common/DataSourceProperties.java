// package th.co.scb.ngage.common;

// import org.springframework.boot.context.properties.ConfigurationProperties;
// import org.springframework.context.annotation.Configuration;

// // สร้างคลาส DataSourceProperties
// @Configuration
// @ConfigurationProperties(prefix = "datasource")
// public class DataSourceProperties {
//     private String driverClassName;
//     private String url;
//     private String username;
//     private String password;

//     // สำหรับ local
//     private Local local = new Local();

//     public String getDriverClassName() {
//         return driverClassName;
//     }

//     public void setDriverClassName(String driverClassName) {
//         this.driverClassName = driverClassName;
//     }

//     public String getUrl() {
//         return url;
//     }

//     public void setUrl(String url) {
//         this.url = url;
//     }

//     public String getUsername() {
//         return username;
//     }

//     public void setUsername(String username) {
//         this.username = username;
//     }

//     public String getPassword() {
//         return password;
//     }

//     public void setPassword(String password) {
//         this.password = password;
//     }

//     public Local getLocal() {
//         return local;
//     }

//     public void setLocal(Local local) {
//         this.local = local;
//     }

//     public static class Local {
//         private String driverClassName;
//         private String url;
//         private String username;
//         private String password;

//         // Getters and Setters for local properties
//         public String getDriverClassName() {
//             return driverClassName;
//         }

//         public void setDriverClassName(String driverClassName) {
//             this.driverClassName = driverClassName;
//         }

//         public String getUrl() {
//             return url;
//         }

//         public void setUrl(String url) {
//             this.url = url;
//         }

//         public String getUsername() {
//             return username;
//         }

//         public void setUsername(String username) {
//             this.username = username;
//         }

//         public String getPassword() {
//             return password;
//         }

//         public void setPassword(String password) {
//             this.password = password;
//         }
//     }
// }
