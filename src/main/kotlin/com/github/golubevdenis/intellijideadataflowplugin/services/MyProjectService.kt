package com.github.golubevdenis.intellijideadataflowplugin.services

import com.github.golubevdenis.intellijideadataflowplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
