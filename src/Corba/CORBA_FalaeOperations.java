package Corba;


/**
* Corba/CORBA_FalaeOperations.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from CORBA_module.idl
* S�bado, 28 de Maio de 2016 21h38min00s BRT
*/

public interface CORBA_FalaeOperations 
{
  String getUsers ();
  String getLogs ();
  String postLog (String userName, String token, String dateTime);
  String generateToken (String userName, String userPassword);
  boolean verifyToken (String token);
} // interface CORBA_FalaeOperations
