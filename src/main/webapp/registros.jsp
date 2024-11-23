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
    </head>
    <body>
        
        <h3>Register for a prize by completing this form.</h3>

        <s:form action="registros">
            <s:textfield name="usuarioBean.Nombre" label="name" />
            <s:textfield name="usuarioBean.apePaterno" label="Paternal Last name" />
            <s:textfield name="usuarioBean.apeMaterno"  label ="Maternal Last Name"/>  
            <s:textfield name="usuarioBean.fecNac"  label="Date of Birth"  />
            <s:textfield name="usuarioBean.lugarRes"  label="Place of Residence"  />
            <s:textfield name="usuarioBean.edad"  label="Age"  />
            <s:textfield name="usuarioBean.telefono"  label="Phone Number"  />
            <s:textfield name="usuarioBean.correo"  label="correo"  />
            <s:submit/>
        </s:form>	
    </body>
</html>