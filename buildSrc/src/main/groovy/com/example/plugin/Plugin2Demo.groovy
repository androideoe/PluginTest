package com.example.plugin;

import org.gradle.api.Plugin;
import org.gradle.api.Project;

public class Plugin2Demo implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        System.out.println("第二种方式实现插件");
    }

}
