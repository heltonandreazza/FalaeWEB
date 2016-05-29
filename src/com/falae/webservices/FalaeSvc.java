package com.falae.webservices;

/**
 * @author helton.andreazza
 */

import java.rmi.NotBoundException;
import java.rmi.RemoteException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.omg.CORBA.ORBPackage.InvalidName;
import org.omg.CosNaming.NamingContextPackage.CannotProceed;
import org.omg.CosNaming.NamingContextPackage.NotFound;

import com.fasterxml.jackson.core.JsonProcessingException;

import pojos.GetParams;
import pojos.Group;
import pojos.Login;
import pojos.Mapper;
import pojos.Token;
import pojos.User;
import pojos.postUser;
import servers.RMIServerAPI;
import servers.ServerUtils;
import Corba.CORBA_Falae;

@Path("/falaesvc")
public class FalaeSvc {

//	public static void main(String[] args) {
//		try {
//			ServerUtils.getServerStub();
//		} catch (RemoteException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (NotBoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//	}
	
	@Path("login")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_HTML)
	public Response login(final Login login) throws JSONException {
		CORBA_Falae corba = getServerCorba();
				
		String token = corba.generateToken(login.user, login.password);
		
		return Response.status(200).entity(token).build();
	}

	@Path("getUser")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getUsers(final GetParams user) throws JSONException {		
		RMIServerAPI rmi = getServerRMI();
		
		String ret;
		try {
			ret = rmi.getUser(user.name, user.token);
			return Response.status(200).entity(ret).build();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	@Path("postUser")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response postUser(final postUser user) throws JSONException {
		RMIServerAPI rmi = getServerRMI();

		try {
			String postUser = rmi.postUser(user.id, user.name, user.password);
			return Response.status(200).entity(postUser).build();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;		
	}

	@Path("deleteUser")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_HTML)
	public Response deleteUser(final GetParams user) throws JSONException {
		RMIServerAPI rmi = getServerRMI();
		
		try {
			String ret = rmi.deleteUser(user.name, user.token);
			return Response.status(200).entity(ret).build();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	@Path("getGroups")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response getGroups(final Token group) throws JSONException {		
		RMIServerAPI rmi = getServerRMI();
		
		String ret;
		try {
			ret = rmi.getGroups(group.token);
			return Response.status(200).entity(ret).build();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}

	@Path("deleteGroup")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_HTML)
	public Response deleteGroup(final GetParams group) throws JSONException {
		RMIServerAPI rmi = getServerRMI();
		
		try {
			String ret = rmi.deleteGroup(group.name, group.token);
			return Response.status(200).entity(ret).build();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
	
	@Path("postGroup")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response postGroup(final Group group) throws JSONException {
		RMIServerAPI rmi = getServerRMI();

		try {
			
			JSONArray jsonArray = getJsonArray(group.users);
			String users = jsonArray != null ? jsonArray.toString() : "";
			
			String postUser = rmi.postGroup(group.id, group.name, group.description, group.owner, users, group.token);
			return Response.status(200).entity(postUser).build();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;		
	}
	
	private <T> JSONArray getJsonArray(T[] arr) {
		try {
			String writeValueAsString = Mapper.getInstance().writeValueAsString(arr);
			return new JSONArray(writeValueAsString);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private CORBA_Falae getServerCorba() {
		try {
			return ServerUtils.getServerCorba();
		} catch (InvalidName e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotFound e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (CannotProceed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (org.omg.CosNaming.NamingContextPackage.InvalidName e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private RMIServerAPI getServerRMI() {
		try {
			return ServerUtils.getServerStub();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
