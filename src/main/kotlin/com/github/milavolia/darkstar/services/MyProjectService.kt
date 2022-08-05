package com.github.milavolia.darkstar.services

import com.intellij.openapi.project.Project
import com.github.milavolia.darkstar.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
