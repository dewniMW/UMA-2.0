package UMA_PermissionEndpoint.impl;

import UMA_PermissionEndpoint.*;
import UMA_PermissionEndpoint.dto.*;


import UMA_PermissionEndpoint.dto.PTFailDTO;
import UMA_PermissionEndpoint.dto.PTSuccessDTO;
import UMA_PermissionEndpoint.dto.ResourceDetailsDTO;

import java.util.List;

import java.io.InputStream;
import org.apache.cxf.jaxrs.ext.multipart.Attachment;

import javax.ws.rs.core.Response;

public class PermissionApiServiceImpl extends PermissionApiService {
    @Override
    public Response registerPermission(String patToken,ResourceDetailsDTO requestedResource){
        // do some magic!
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
    }
}
