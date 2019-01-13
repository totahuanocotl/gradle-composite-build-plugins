package mx.com.totahuanocotl.compositebuild.plugin

import org.gradle.api.Project
import org.gradle.api.provider.Property

class GreetingExtension {
    final Property<String> greeting
    final Property<String> recipient

    GreetingExtension(Project project) {
        greeting = project.objects.property(String)
        recipient = project.objects.property(String)
        greeting.set('Hello')
        recipient.set('Plugin Extension')
    }
}

