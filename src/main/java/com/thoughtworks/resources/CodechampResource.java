package com.thoughtworks.resources;

import com.thoughtworks.services.CodechampService;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path(value = "/index")
public class CodechampResource {
  private final CodechampService codechampService;

  public CodechampResource(CodechampService codechampService) {
    this.codechampService = codechampService;
  }

  @GET
  public Response getIndex() {
    return Response.ok(codechampService.getIndex()).build();
  }

}
