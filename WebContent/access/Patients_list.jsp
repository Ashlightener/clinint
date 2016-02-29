<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Patients</title>
<meta name="viewport" content="width=device-width, initial-scale=1">

<script type="text/javascript" src="/clinint/js/jquery.min.js"></script>
<script type="text/javascript" src="/clinint/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css" href="/clinint/css/bootstrap.min.css">
  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
</head>
<body>

<div class="container">
  <h2>Filters </h2>
  <button type="button" class="btn btn-info" data-toggle="collapse" data-target="#demo">Apply Filters</button>
  <div id="demo" class="collapse">
   Find the appropriate patients by applying the country filters.
   
   <form role="form" action="/clinint/patient_servlet" method ="get" >
		<a class="btn-select btn-select-light"
										style="width: 40%; float: left"><select
										class="form-control" name="country_filter">
											<option>All Patients</option>
											<option>India</option>
											<option>USA</option>
											<option>Germany</option>
											<option>France</option>
									</select> </a>
		<button type="submit" class="btn btn-primary"
									style="margin-left: 15px;">Submit</button>
																
		</form>
   
   
  </div>
</div>
	<div class="container">
		<h2>Patients in Study</h2>
		<p>A table view of the patients in the current study</p>		
																
		<%-- <c:set var="now" value="<%=new java.util.Date()%>" />

		<p>
			Formatted Date (1):
			<fmt:formatDate type="time" value="${now}" />
		</p>
		<p>
			Formatted Date (2):
			<fmt:formatDate type="date" value="${now}" />
		</p> --%>


		<%-- 
		 <c:forEach var="e" items="${s}">
			${e}
		</c:forEach>  
		--%>

		<table class="table table-striped">
			<thead>
				<tr>
					<th>Patient</th>
					<th>Country</th>
					<th>DOB</th>
					<th>Sex</th>
					<th>Weight</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${Patients}" var="Patients_bean">
					<tr>
						<td><a href="Patient_servlet?action=edit&userId=<c:out value="${Patients_bean.patient}"/>" /><c:out value="${Patients_bean.patient}" /></td>
						<td><c:out value="${Patients_bean.country}" /></td>
						
						<td><fmt:formatDate pattern="yyyy-MMM-dd"  value="${Patients_bean.DOB}" /></td>
						<td><c:out value="${Patients_bean.sex}" /></td>
						<td><c:out value="${Patients_bean.weight}" /></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>	
</body>
</html>