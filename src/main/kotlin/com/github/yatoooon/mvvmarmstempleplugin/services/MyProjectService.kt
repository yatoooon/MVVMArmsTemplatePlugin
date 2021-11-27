package com.github.yatoooon.mvvmarmstempleplugin.services

import com.github.yatoooon.mvvmarmstempleplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
