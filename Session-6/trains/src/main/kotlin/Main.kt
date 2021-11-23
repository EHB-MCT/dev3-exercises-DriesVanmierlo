// Tell compiler we want to use specific code, like Java classes from a library
// IntelliJ will add this automatically for you when using classes that need it

import java.sql.*
import java.util.*

fun main() {

    // Create a driver: the library/class that will create the connection
    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()

    //"new" class
    val credentials = Credentials()

    // Prepare credentials
    val connectionProps = Properties()
    connectionProps["user"] = credentials.databaseUser
    connectionProps["password"] = credentials.databasePassword

    // Create the connection: this will allow us to run queries on it later
    val connection =  DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" +
                "dt5.ehb.be" +
                ":" + "3306" + "/" +
                credentials.databaseName,
        connectionProps)

}