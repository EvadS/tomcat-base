package com.se.sample.api;



import com.se.sample.Task;
import com.se.sample.dto.TaskCreateRequest;
import com.se.sample.service.TaskManagementService;
import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.message.BasicNameValuePair;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import static com.se.sample.utils.Validator.validateArgNotNull;
@Path("/tasks")
public class TaskManagementResource {

    @POST
    public Response createTask() {
        return Response.ok().build();
    }

    @GET
    public Response getTasks() {
        return Response.ok().build();
    }

    @PATCH
    @Path("/{taskID}")
    public Response updateTask(@PathParam("taskID") String taskID) {
        return Response.ok().build();
    }

    @GET
    @Path("/{taskID}")
    public Response getTask(@PathParam("taskID") String taskID) {
        return Response.ok().build();
    }

    @DELETE
    @Path("/{taskID}")
    public Response deleteTask(@PathParam("taskID") String taskID) {

        return Response.ok().build();
    }
}

