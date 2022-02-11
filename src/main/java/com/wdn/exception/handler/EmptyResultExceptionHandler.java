package com.wdn.exception.handler;


import com.wdn.exception.EmptyResultDataAcceptException;

import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

@Provider
public class EmptyResultExceptionHandler implements ExceptionMapper<EmptyResultDataAcceptException> {
    @Override
    public Response toResponse(EmptyResultDataAcceptException ex) {
        ErrorResponse response = new ErrorResponse(ex.getMessage(), "404");
        return Response.ok().entity(response).build();
    }
}
