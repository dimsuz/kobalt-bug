import com.beust.kobalt.*
import com.beust.kobalt.plugin.packaging.*
import com.beust.kobalt.plugin.application.*
import com.beust.kobalt.plugin.kotlin.*

val p = project {
    name = "kobalt-bug"
    group = "com.example"
    artifactId = name
    version = "0.1"

    directory = "customdir"

    dependencies {
        compile("org.jetbrains.kotlin:kotlin-runtime:1.2.10")
        compile("org.jetbrains.kotlin:kotlin-stdlib:1.2.10")
    }

    dependenciesTest {
        compile("org.testng:testng:6.11")
    }

    assemble {
        jar {
        }
    }

    application {
        mainClass = "com.example.MainKt"
    }
}
