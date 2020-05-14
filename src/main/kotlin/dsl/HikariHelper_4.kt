package dsl

class HikariHelper_4(vararg args: Param) {

    sealed class Param{
        class DriverClassName(val v: String) : Param()
        class JdbcUrl(val v: String) : Param()
        class Username(val v: String) : Param()
        class Password(val v: String) : Param()
        class ConnectionTimeOut(val v: Long) : Param()
        class IsReadOnly(val v: Boolean) : Param()
        class ConnectionTestQuery(val v: String) : Param()
        class MinimumIdle(val v: Int) : Param()
        class MaximumPoolSize(val v: Int) : Param()
    }

    val src = HikariDataSource.getDataSource().also {src ->
        args.forEach {it ->
            when(it){
                is Param.DriverClassName -> src.driverClass = it.v
                is Param.JdbcUrl -> src.jdbcUrl = it.v
                is Param.Username -> src.username = it.v
                is Param.Password -> src.password = it.v
                is Param.ConnectionTimeOut -> src.connectionTimeOut = it.v
                is Param.IsReadOnly -> src.isReadOnly = it.v
                is Param.ConnectionTestQuery -> src.connectionTestQuery = it.v
                is Param.MinimumIdle -> src.miniumIdle = it.v
                is Param.MaximumPoolSize -> src.maxinumPoolSize = it.v
            }
        }
    }
}