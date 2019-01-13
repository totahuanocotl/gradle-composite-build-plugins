package mx.com.totahuanocotl.compositebuild.plugin

import org.gradle.api.Plugin
import org.gradle.api.Project

class GreetingPlugin implements Plugin<Project> {
    void apply(Project project) {
        def extension = project.extensions.create('greeting', GreetingExtension, project)
        project.tasks.create('greet', Greeting) { task ->
                task.greeting = extension.greeting
                task.recipient = extension.recipient
        }
    }
}
