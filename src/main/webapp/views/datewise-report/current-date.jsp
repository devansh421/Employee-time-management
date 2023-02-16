<%@ include file='../navbar.jsp' %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
 <body onload='makeActive("date")'>
 <div class='dvv'>
     <label class='hdu'>Report of current date</label>
  </div>
  <div class='container'>
   <div class='card col-md-12 mx-auto'>
    <div class='card-body'>
    <c:choose>
     <c:when test="${tlist=='[]'}">
     	<div class='dvv'> 
      		<label class='la' style='color:red'>No employee is out today</label>
      	</div>
     </c:when>
     <c:otherwise>
     <div class='table scrollit'>
     <table class='table table-hover'>
      <thead>
       <tr>
        <th class='las'>S.No</th><th class='las'>Emp Id</th>
        <th class='las'>Out Time</th><th class='las'>In Time</th>
        <th class='las'>Total Time</th><th class='las'>Date</th>
       </tr>
      </thead>
      <tbody>
       <c:set var="sn" value="0"></c:set>
       <c:forEach var="emp" items="${tlist}">
        <tr>
         <td>${sn=sn+1}</td>
         <td>${emp.eid}</td>
         <td>${emp.outtime}</td>
         <td style="color:${emp.intime=='Not in yet'?'red':'green'}">${emp.intime}</td>
         <td style="color:${emp.totaltime=='Not applicable'?'red':'green'}">${emp.totaltime}</td>
         <td>${date}</td>
        </tr>
       </c:forEach>
      </tbody>
     </table>
     </div>
     </c:otherwise>
     </c:choose>
    </div>
   </div>
  </div>
  <div class='dvv'>
	 <button class='btr' onclick='history.back()'>Back</button>
  </div>
 </body>
</html>