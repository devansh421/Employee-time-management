<%@ include file="../navbar.jsp" %>
<html>
  <body onload="makeActive('date')">
  <div class='dvv'>
    <label class='hdu'>View date wise report</label>
  </div>
   <table class='ta'>
    <tr>
     <td class='pd'>
      <form action='datewise-report/current-date' method="post">
       <table class='cdta'>
        <tr>
         <td>Current date</td>
         <td align="right"><button class='cdbt'>GO</button></td>
        </tr>
       </table>
      </form>
     </td>
    </tr>
    <tr>
     <td class='pd'>
      <form action='datewise-report/any-date' method="post">
       <table class='cdta'>
        <tr>
         <td>Any date</td>
         <td><input type='date' class='tb' name='date' max="${dt}" required></td>
         <td align="right"><button class='cdbt'>GO</button></td>
        </tr>
       </table>
      </form>
     </td>
    </tr>
    <tr>
     <td class='pd'>
      <form action="datewise-report/date-between" method="post">
       <table class='cdta'>
        <tr>
         <td>Date between&nbsp;&nbsp;&nbsp;&nbsp;</td>
         <td><input type='date' class='tb' id='date1' max="${dt}" name="date1" required></td>
         <td><input type='date' class='tb' id='date2' max="${dt}" name="date2" required></td>
         <td align="right"><button class='cdbt' onclick='return compareDate()'>GO</button></td>
        </tr>
       </table>
      </form>
     </td>
    </tr>
   </table>
 </body>
</html>