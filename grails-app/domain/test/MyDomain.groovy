package test

import grails.compiler.GrailsCompileStatic
import graphql.schema.DataFetcher
import graphql.schema.DataFetchingEnvironment
import org.grails.gorm.graphql.entity.dsl.GraphQLMapping

@GrailsCompileStatic
class MyDomain {
    String name

    static constraints = {
        name nullable: true
    }

    static graphql = GraphQLMapping.build {
        query("myQuery", Integer) {
            dataFetcher(new DataFetcher() {
                @Override
                Object get(DataFetchingEnvironment environment) throws Exception {
                    return new Integer(0)
                }
            })
        }
    }
}
