<%-- 
    Document   : resgistro
    Created on : 21 nov. 2024, 10:32:28 a. m.
    Author     : FLHORIAN
--%>

<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <title>Registros</title>
         <s:head /> 
    </head>
    <body>
        
        <h3>Register for a prize by completing this form.</h3>

        <s:form action="registros">
            <s:textfield name="usuarioBean.Nombre" label="Nombre" />
            <s:textfield name="usuarioBean.apePaterno" label="Apellido Paterno" />
            <s:textfield name="usuarioBean.apeMaterno"  label ="Apellido Materno"/>  
            <s:textfield name="usuarioBean.fecNac"  label="Fecha Nacimiento"  />
            <s:textfield name="usuarioBean.lugarRes"  label="Lugar Nacimiento"  />
            <s:textfield name="usuarioBean.edad"  label="Edad"  />
            <s:textfield name="usuarioBean.telefono"  label="Telefono"  />
            <s:textfield name="usuarioBean.correo"  label="correo"  />
            <s:submit/>
        </s:form>	
    </body>
</html>