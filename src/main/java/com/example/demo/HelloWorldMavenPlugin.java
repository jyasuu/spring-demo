package com.example.demo;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugins.annotations.Mojo;

@Mojo(name = "sayhello")
public class HelloWorldMavenPlugin extends AbstractMojo {

    public void execute() throws MojoExecutionException {
        getLog().info("Hello World");
    }
}