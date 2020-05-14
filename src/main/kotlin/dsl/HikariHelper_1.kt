package dsl

class HikariHelper_1(vararg args: Pair<String, Any>) {
    val src = HikariDataSource.getDataSource().also {src ->
        args.forEach {it ->
            val k = it.first
            val v = it.second

            when(k){
                "DriverClassName" -> src.driverClass =
                    if (v is String) v
                    else  throw Throwable("DriverClassName should be String")
                "JdbcUrl" -> src.jdbcUrl =
                    if (v is String) v
                    else  throw Throwable("JDBCUrl should be String")
                "Username" -> src.username =
                    if (v is String) v
                    else  throw Throwable("username should be String")
                "Password" -> src.password =
                    if (v is String) v
                    else  throw Throwable("password should be String")
                "ConnectionTimeOut" -> src.connectionTimeOut =
                    if (v is Long) v
                    else  throw Throwable("connectionTimeOut should be String")
                "IsReadOnly" -> src.isReadOnly =
                    if (v is Boolean) v
                    else  throw Throwable("isReadOnly should be String")
                "ConnectionTestQuery" -> src.connectionTestQuery =
                    if (v is String) v
                    else  throw Throwable("connectionTestQuery should be String")
                "MiniumIdle" -> src.miniumIdle =
                    if (v is Int) v
                    else  throw Throwable("miniumIdle should be String")
                "MaxinumPoolSize" -> src.maxinumPoolSize =
                    if (v is Int) v
                    else  throw Throwable("maxinumPoolSize should be String")
                else -> throw Throwable("Not allow key $k")
            }

        }

    }
}