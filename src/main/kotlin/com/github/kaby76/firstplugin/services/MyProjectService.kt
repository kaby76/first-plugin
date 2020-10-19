package com.github.kaby76.firstplugin.services

import com.intellij.openapi.project.Project
import com.github.kaby76.firstplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
