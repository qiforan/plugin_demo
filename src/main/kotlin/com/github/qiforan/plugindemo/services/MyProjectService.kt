package com.github.qiforan.plugindemo.services

import com.intellij.openapi.project.Project
import com.github.qiforan.plugindemo.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
