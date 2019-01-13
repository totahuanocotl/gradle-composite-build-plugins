package mx.com.totahuanocotl.compositebuild.plugin

import org.gradle.api.Project
import org.gradle.api.provider.PropertyState

class GreetingExtension {
    final PropertyState<String> greeting
    final PropertyState<String> recipient

    GreetingExtension(Project project) {
        greeting = project.property(String)
        recipient = project.property(String)
        greeting.set('Hello')
        recipient.set('Plugin Extension')
    }
}

