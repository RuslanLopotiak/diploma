<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<link href="<c:url value="/resources/css/messege.css" />" rel="stylesheet">
<%@ page isELIgnored="false"%>
<%@ page language="java" contentType="text/html; charset=UTF8"
	pageEncoding="UTF8"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="sec"%>
<%@ page session="false"%>



<div class="container">
    <div class="row">
        <div class="col-md-5">
            <div class="panel panel-primary">
                <div class="panel-heading">
                    <span class="glyphicon glyphicon-comment"></span> Чат
                    <div class="btn-group pull-right">
                        
                    </div>
                </div>
                <div class="panel-body">
                    <ul id="messegeCont" class="chat">
                       
                        
                        
                    </ul>
                </div>
                <div class="panel-footer">
                    <div class="input-group">
                        <input id="btn-input" type="text" class="form-control input-sm" />
                        <span class="input-group-btn">
                            <button class="btn btn-warning btn-sm" id="btn-chat">
                                Надіслати</button>
                        </span>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="resources/js/messege.js"></script>