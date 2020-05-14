package dsl

enum class HikariParam{
    DRIVER_CLASS_NAME,
    JDBC_URL,
    USERNAME,
    PASSWORD,
    CONNECTION_TIME_OUT,
    IS_READ_ONLY,
    CONNECTION_TEST_QUERY,
    MINUM_IDLE,
    MAXIUM_POOL_SIZE
}

class HikariHelper_3(vararg args: Pair<HikariParam, Any>) {

    val src = HikariDataSource.getDataSource().also {src ->
        args.forEach {it ->
            val k = it.first
            val v = it.second

            when(k){
                HikariParam.DRIVER_CLASS_NAME -> src.driverClass =
                    if (v is String) v
                    else  throw Throwable("DriverClassName should be String")
                HikariParam.JDBC_URL -> src.jdbcUrl =
                    if (v is String) v
                    else  throw Throwable("JDBCUrl should be String")
                HikariParam.USERNAME -> src.username =
                    if (v is String) v
                    else  throw Throwable("username should be String")
                HikariParam.PASSWORD -> src.password =
                    if (v is String) v
                    else  throw Throwable("password should be String")
                HikariParam.CONNECTION_TIME_OUT -> src.connectionTimeOut =
                    if (v is Long) v
                    else  throw Throwable("connectionTimeOut should be String")
                HikariParam.IS_READ_ONLY -> src.isReadOnly =
                    if (v is Boolean) v
                    else  throw Throwable("isReadOnly should be String")
                HikariParam.CONNECTION_TEST_QUERY -> src.connectionTestQuery =
                    if (v is String) v
                    else  throw Throwable("connectionTestQuery should be String")
                HikariParam.MINUM_IDLE -> src.miniumIdle =
                    if (v is Int) v
                    else  throw Throwable("miniumIdle should be String")
                HikariParam.MAXIUM_POOL_SIZE -> src.maxinumPoolSize =
                    if (v is Int) v
                    else  throw Throwable("maxinumPoolSize should be String")
            }

        }

    }
}