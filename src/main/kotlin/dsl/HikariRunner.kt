package dsl

class HikariRunner {
    fun run() {
        val h1 = HikariHelper_1(
            "DriverClassName" to "com.mysql.cj.jdbc.Driver",
            "JdbcUrl" to "jdbc:mysql://myexample.com:3306/mydb",
            "Username" to "jidolstar",
            "Password" to "mypassword",
            "ConnectionTimeOut" to 30000L,
            "IsReadOnly" to false,
            "ConnectionTestQuery" to "select 1 from dual",
            "MiniumIdle" to 5,
            "MaxinumPoolSize" to 5
        )

        val h2 = HikariHelper_2(
            HikariHelper_2.DRIVER_CLASS_NAME to "com.mysql.cj.jdbc.Driver",
            HikariHelper_2.JDBC_URL to "jdbc:mysql://myexample.com:3306/mydb",
            HikariHelper_2.USERNAME to "jidolstar",
            HikariHelper_2.PASSWORD to "mypassword",
            HikariHelper_2.CONNECTION_TIME_OUT to 30000L,
            HikariHelper_2.IS_READ_ONLY to false,
            HikariHelper_2.CONNECTION_TEST_QUERY to "select 1 from dual",
            HikariHelper_2.MINUM_IDLE to 5,
            HikariHelper_2.MAXIUM_POOL_SIZE to 5
        )

        val h3 = HikariHelper_3(
            HikariParam.DRIVER_CLASS_NAME to "com.mysql.cj.jdbc.Driver",
            HikariParam.JDBC_URL to "jdbc:mysql://myexample.com:3306/mydb",
            HikariParam.USERNAME to "jidolstar",
            HikariParam.PASSWORD to "mypassword",
            HikariParam.CONNECTION_TIME_OUT to 30000L,
            HikariParam.IS_READ_ONLY to false,
            HikariParam.CONNECTION_TEST_QUERY to "select 1 from dual",
            HikariParam.MINUM_IDLE to 5,
            HikariParam.MAXIUM_POOL_SIZE to 5
        )

        val h4 = HikariHelper_4(
            HikariHelper_4.Param.DriverClassName("com.mysql.cj.jdbc.Driver"),
            HikariHelper_4.Param.JdbcUrl("jdbc:mysql://myexample.com:3306/mydb"),
            HikariHelper_4.Param.Username("jidolstar"),
            HikariHelper_4.Param.Password("mypassword"),
            HikariHelper_4.Param.ConnectionTimeOut(30000L),
            HikariHelper_4.Param.IsReadOnly(false),
            HikariHelper_4.Param.ConnectionTestQuery("select 1 from dual"),
            HikariHelper_4.Param.MinimumIdle(5),
            HikariHelper_4.Param.MaximumPoolSize(5)
        )

        val h5 = HikariHelper_5(
            HikariHelper_5.Param.DriverClassName("com.mysql.cj.jdbc.Driver"),
            HikariHelper_5.Param.JdbcUrl("jdbc:mysql://myexample.com:3306/mydb"),
            HikariHelper_5.Param.Username("jidolstar"),
            HikariHelper_5.Param.Password("mypassword"),
            HikariHelper_5.Param.ConnectionTimeOut(30000L),
            HikariHelper_5.Param.IsReadOnly(false),
            HikariHelper_5.Param.ConnectionTestQuery("select 1 from dual"),
            HikariHelper_5.Param.MinimumIdle(5),
            HikariHelper_5.Param.MaximumPoolSize(5)
        )

        val h6 = HikariHelper_6{
            it.driverClassName = "com.mysql.cj.jdbc.Driver"
            it.jdbcUrl = "jdbc:mysql://myexample.com:3306/mydb"
            it.username = "jidolstar"
            it.password = "mypassword"
            it.connectionTimeOut = 30000L
            it.isReadOnly = false
            it.connectionTestQuery = "select 1 from dual"
            it.minimumIdle = 5
            it.maximumPoolSize = 5
        }

        val h7 = HikariHelper_7{
            driverClassName = "com.mysql.cj.jdbc.Driver"
            jdbcUrl = "jdbc:mysql://myexample.com:3306/mydb"
            username = "jidolstar"
            password = "mypassword"
            connectionTimeOut = 30000L
            isReadOnly = false
            connectionTestQuery = "select 1 from dual"
            minimumIdle = 5
            maximumPoolSize = 5
        }

        //println(h1.src.toString())
        //println(h2.src.toString())
        //println(h3.src.toString())
        //println(h4.src.toString())
        //println(h5.src.toString())
        //println(h6.src.toString())
        println(h7.src.toString())
    }
}