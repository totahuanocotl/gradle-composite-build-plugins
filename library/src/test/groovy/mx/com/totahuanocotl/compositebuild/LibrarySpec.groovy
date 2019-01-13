package mx.com.totahuanocotl.compositebuild

import spock.lang.Specification

class LibrarySpec extends Specification {

    def "returns greeting"() {
        expect:
        new Library().greet("isaac") == "Hello isaac"

    }
}
