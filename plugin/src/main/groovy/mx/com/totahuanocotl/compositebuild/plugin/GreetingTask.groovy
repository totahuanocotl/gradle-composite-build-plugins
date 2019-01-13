package mx.com.totahuanocotl.compositebuild.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.provider.Property
import org.gradle.api.tasks.TaskAction


class Greeting extends DefaultTask {
    final Property<String> greeting = project.objects.property(String)
    final Property<String> recipient = project.objects.property(String)

    @TaskAction
    void greet() {
        logger.quiet "${greeting.get()} ${recipient.get()}"
    }
}