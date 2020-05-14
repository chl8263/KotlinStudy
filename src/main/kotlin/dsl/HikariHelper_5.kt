package dsl

class HikariHelper_5(vararg args: Param) {

    sealed class Param{

        abstract fun perform(src: HikariDataSource.DataSource)

        class DriverClassName(val v: String) : Param() {
            override fun perform(src: HikariDataSource.DataSource) {
                src.driverClass = v
            }
        }

        class JdbcUrl(val v: String) : Param() {
            override fun perform(src: HikariDataSource.DataSource) {
                src.jdbcUrl = v
            }
        }

        class Username(val v: String) : Param() {
            override fun perform(src: HikariDataSource.DataSource) {
                src.username = v
            }
        }

        class Password(val v: String) : Param() {
            override fun perform(src: HikariDataSource.DataSource) {
                src.password = v
            }
        }

        class ConnectionTimeOut(val v: Long) : Param() {
            override fun perform(src: HikariDataSource.DataSource) {
                src.connectionTimeOut = v
            }
        }

        class IsReadOnly(val v: Boolean) : Param() {
            override fun perform(src: HikariDataSource.DataSource) {
                src.isReadOnly = v
            }
        }

        class ConnectionTestQuery(val v: String) : Param() {
            override fun perform(src: HikariDataSource.DataSource) {
                src.connectionTestQuery = v
            }
        }

        class MinimumIdle(val v: Int) : Param() {
            override fun perform(src: HikariDataSource.DataSource) {
                src.miniumIdle = v
            }
        }

        class MaximumPoolSize(val v: Int) : Param() {
            override fun perform(src: HikariDataSource.DataSource) {
                src.maxinumPoolSize = v
            }
        }
    }

    val src = HikariDataSource.getDataSource().also {src ->
        args.forEach {it ->
            it.perform(src)
        }
    }
}