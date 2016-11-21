package org.thoughtworks.application;

import org.thoughtworks.configuration.CodechampConfiguration;
import org.thoughtworks.resources.CodechampResource;
import org.thoughtworks.services.CodechampService;
import io.dropwizard.Application;
import io.dropwizard.setup.Environment;

public class CodechampApplication extends Application<CodechampConfiguration> {
  public static void main(String[] args) throws Exception {
    new CodechampApplication().run(args);
  }

  @Override public void run(CodechampConfiguration configuration, Environment environment) throws Exception {
    environment.jersey().register(new CodechampResource(new CodechampService()));
  }
}
