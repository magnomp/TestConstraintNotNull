package testconstraintnotnull

import test.MyDomain

import java.time.LocalDateTime

class BootStrap {

    def init = { servletContext ->
        new MyDomain().save(failOnError: true)
    }
    def destroy = {
    }
}
