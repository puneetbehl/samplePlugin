package sampleplugin


import grails.test.mixin.integration.Integration
import grails.transaction.*
import spock.lang.*

@Integration
@Rollback
class PersonSpec extends Specification {

    void "canary test"() {
        expect:
            true == true
    }

    void "test save"() {
	    when:
	      new Person( name: "John Doe" ).save flush:true
	    then:
	      1 == Person.count()
    }
}
