<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ include file="../navbar.jsp" %>
<html>
 <body onload="makeActive('out')">
 <form action='save'>
  <div class='dv'>
   <label class='hdu'>Record employee out time</label>
  </div>
  <div class='dv'>
   <select name="eid" id="eid" class='la'>
   <option value="-1">Select Employee</option>
   <c:forEach var='emp' items="${elist}">
    <option value='${emp.eid}'>${emp.name}(${emp.eid})</option>
   </c:forEach>
   </select>
  </div>
  <div class='dv'>
   <button class='btn btn-primary' id='bt1'>Submit</button>
  </div>
  <div class='dvv' id='msg'>
  </div> 
 </form> 
 </body>
</html>