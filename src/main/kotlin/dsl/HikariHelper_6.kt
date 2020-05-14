package dsl

class HikariHelper_6(block: (Param) -> Unit) {

     class Param{
        val src = HikariDataSource.DataSource()

        var driverClassName
            get() = src.driverClass
            set(value) {src.driverClass = value}

        var jdbcUrl
            get() = src.jdbcUrl
            set(value) {src.jdbcUrl = value}

        var username
            get() = src.username
            set(value) {src.username = value}

        var password
            get() = src.password
            set(value) {src.password = value}

        var connectionTimeOut
            get() = src.connectionTimeOut
            set(value) {src.connectionTimeOut = value}

        var isReadOnly
            get() = src.isReadOnly
            set(value) {src.isReadOnly = value}

        var connectionTestQuery
            get() = src.connectionTestQuery
            set(value) {src.connectionTestQuery = value}

        var minimumIdle
            get() = src.miniumIdle
            set(value) {src.miniumIdle = value}

        var maximumPoolSize
            get() = src.maxinumPoolSize
            set(value) {src.maxinumPoolSize = value}
    }

    val src = Param().let {
        block(it)
        it.src
    }


}