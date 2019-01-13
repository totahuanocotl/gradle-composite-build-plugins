package mx.com.totahuanocotl.compositebuild.plugin

import org.gradle.api.DefaultTask
import org.gradle.api.provider.PropertyState
import org.gradle.api.tasks.TaskAction


class Greeting extends DefaultTask {
    PropertyState<String> greeting = project.property(String)
    PropertyState<String> recipient = project.property(String)

    @TaskAction
    void greet() {
        logger.quiet "${greeting.get()} ${recipient.get()}"
    }
}