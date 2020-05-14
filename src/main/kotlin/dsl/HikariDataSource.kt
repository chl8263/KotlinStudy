package dsl

import javax.management.monitor.StringMonitor

object HikariDataSource {

    fun getDataSource(): DataSource {
        return DataSource()
    }

    data class DataSource(
        var driverClass: String? = null,
        var jdbcUrl: String? = null,
        var username: String? = null,
        var password: String? = null,
        var connectionTimeOut: Long? = null,
        var isReadOnly: Boolean? = null,
        var connectionTestQuery: String? = null,
        var miniumIdle: Int? = null,
        var maxinumPoolSize: Int? = null
    )
}