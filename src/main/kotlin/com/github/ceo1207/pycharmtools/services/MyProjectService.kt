package com.github.ceo1207.pycharmtools.services

import com.intellij.openapi.project.Project
import com.github.ceo1207.pycharmtools.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
