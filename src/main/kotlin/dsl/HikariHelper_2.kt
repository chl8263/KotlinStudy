package dsl

class HikariHelper_2(vararg args: Pair<String, Any>) {

    companion object{
        val DRIVER_CLASS_NAME = "DriverClassName"
        val JDBC_URL = "JdbcUrl"
        val USERNAME = "Username"
        val PASSWORD = "Password"
        val CONNECTION_TIME_OUT = "ConnectionTimeOut"
        val IS_READ_ONLY = "IsReadOnly"
        val CONNECTION_TEST_QUERY = "ConnectionTestQuery"
        val MINUM_IDLE = "MiniumIdle"
        val MAXIUM_POOL_SIZE = "maxinumPoolSize"

    }

    val src = HikariDataSource.getDataSource().also {src ->
        args.forEach {it ->
            val k = it.first
            val v = it.second

            when(k){
                DRIVER_CLASS_NAME -> src.driverClass =
                    if (v is String) v
                    else  throw Throwable("DriverClassName should be String")
                JDBC_URL -> src.jdbcUrl =
                    if (v is String) v
                    else  throw Throwable("JDBCUrl should be String")
                USERNAME -> src.username =
                    if (v is String) v
                    else  throw Throwable("username should be String")
                PASSWORD -> src.password =
                    if (v is String) v
                    else  throw Throwable("password should be String")
                CONNECTION_TIME_OUT -> src.connectionTimeOut =
                    if (v is Long) v
                    else  throw Throwable("connectionTimeOut should be String")
                IS_READ_ONLY -> src.isReadOnly =
                    if (v is Boolean) v
                    else  throw Throwable("isReadOnly should be String")
                CONNECTION_TEST_QUERY -> src.connectionTestQuery =
                    if (v is String) v
                    else  throw Throwable("connectionTestQuery should be String")
                MINUM_IDLE -> src.miniumIdle =
                    if (v is Int) v
                    else  throw Throwable("miniumIdle should be String")
                MAXIUM_POOL_SIZE -> src.maxinumPoolSize =
                    if (v is Int) v
                    else  throw Throwable("maxinumPoolSize should be String")
                else -> throw Throwable("Not allow key $k")
            }

        }

    }
}