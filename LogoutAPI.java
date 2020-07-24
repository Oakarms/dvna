package com.ibm.security.appscan.altoromutual.api;

@Path("/logout")
public class LogoutAPI extends AltoroAPI{
	@GET
	public Response doLogOut(@Context HttpServletRequest request){
		try{
			request.getSession().removeAttribute(ServletUtil.SESSION_ATTR_USER);
			String response="{\"LoggedOut\" : \"True\"}";
			return Response.status(200).entity(response).build();}
		catch(Exception e){
			String response = "{\"Error \": \"Unknown error encountered\"}";
			return Response.status(404).entity(response).build();
		}
	}
}
