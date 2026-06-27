package com.rum.productservice.mapper.base;

import java.util.List;

public interface BaseRequestResponseMapper<Entity,Request,Response> {

    Entity mapToEntity(Request dto);
    Response mapToResponse(Entity dto);
    List<Response> mapToResponse(List<Entity> dto);

}
