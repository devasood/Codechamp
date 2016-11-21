package com.thoughtworks.application;

import com.thoughtworks.configuration.CodechampConfiguration;
import com.thoughtworks.resources.CodechampResource;
import com.thoughtworks.services.CodechampService;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class CodechampApplication extends Application<CodechampConfiguration> {
  public static void main(String[] args) throws Exception {
    new CodechampApplication().run();
  }

  @Override public void run(CodechampConfiguration configuration, Environment environment) throws Exception {
    environment.jersey().register(new CodechampResource(new CodechampService()));
  }
}
