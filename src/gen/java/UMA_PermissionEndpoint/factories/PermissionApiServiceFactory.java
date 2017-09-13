package UMA_PermissionEndpoint.factories;

import UMA_PermissionEndpoint.PermissionApiService;
import UMA_PermissionEndpoint.impl.PermissionApiServiceImpl;

public class PermissionApiServiceFactory {

   private final static PermissionApiService service = new PermissionApiServiceImpl();

   public static PermissionApiService getPermissionApi()
   {
      return service;
   }
}
