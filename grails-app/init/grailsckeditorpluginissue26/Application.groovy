package grailsckeditorpluginissue26

import grails.boot.GrailsApp
import grails.boot.config.GrailsAutoConfiguration

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.context.annotation.ComponentScan
import org.springframework.boot.autoconfigure.security.SecurityFilterAutoConfiguration

@ComponentScan
@EnableAutoConfiguration(exclude = [SecurityFilterAutoConfiguration])
class Application extends GrailsAutoConfiguration {
    static void main(String[] args) {
        GrailsApp.run(Application, args)
    }
}
