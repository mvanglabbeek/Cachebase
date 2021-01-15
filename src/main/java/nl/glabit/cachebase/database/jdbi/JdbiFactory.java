package nl.glabit.cachebase.database.jdbi;

import io.micronaut.context.annotation.Factory;
import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.sqlobject.SqlObjectPlugin;

import javax.inject.Singleton;
import javax.sql.DataSource;

@Factory
public class JdbiFactory {
    @Singleton
    Jdbi jdbi(DataSource dataSource) {
        Jdbi jdbi = Jdbi.create(dataSource);
        jdbi.installPlugin(new SqlObjectPlugin());
        return jdbi;
    }
}

