package com.github.xubo5200.mvparmstemplate.services

import com.github.xubo5200.mvparmstemplate.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
