# Grails3 sample plugin application 

Cannot run integration test because of `IllegalStateException` in grails-3.0.1 plugin application
Context: I've created a new grails plugin named "samplePlugin". It has one domain class Person and an integration test PersonSpec. Now, when I run `grails test-app`, the test fails with below exception:

        java.lang.IllegalStateException: Method on class [sampleplugin.Person] was used outside of a Grails application. If running in the context of a test using the mocking API or bootstrap Grails correctly.
          at org.grails.datastore.gorm.GormEntity$Trait$Helper.currentGormInstanceApi(GormEntity.groovy:52)
          at org.grails.datastore.gorm.GormEntity$Trait$Helper.save(GormEntity.groovy:165)
          at sampleplugin.PersonSpec.$tt__$spock_feature_0_1(PersonSpec.groovy:25)
          at sampleplugin.PersonSpec.test save_closure2(PersonSpec.groovy)
          at groovy.lang.Closure.call(Closure.java:423)
          at groovy.lang.Closure.call(Closure.java:439)
          at grails.transaction.GrailsTransactionTemplate$1.doInTransaction(GrailsTransactionTemplate.groovy:67)
          at org.springframework.transaction.support.TransactionTemplate.execute(TransactionTemplate.java:133)
          at grails.transaction.GrailsTransactionTemplate.executeAndRollback(GrailsTransactionTemplate.groovy:64)
          at sampleplugin.PersonSpec.test save(PersonSpec.groovy)

