<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.time.LocalDate"%>
<%@ page import="java.time.temporal.ChronoUnit"%>

<!DOCTYPE html>
<html lang="hu">
<head>
<meta charset="UTF-8">
<title>Vizsga 1. feladat</title>
</head>
<body>

	<%!java.util.Date date = java.util.Calendar.getInstance().getTime();%>
	<h1>Helló!</h1>

	<p><%="Mai dátum: " + date%></p>

	<h3>Add meg a születési dátumod!</h3>


	<form action="/vizsga/vizsga1.jsp" >
		<p>
			<input type="date" name="birthday" placeholder="yyyy-MM-dd" />
			<button type="submit">OK</button>
		</p>
	</form>
	<p>
		<%
			if (request.getParameter("birthday") == null) {
			out.print("Add meg a születési dátumod!");
		} else {

			try {

				LocalDate birthdayDate = LocalDate.parse(request.getParameter("birthday"));
				LocalDate currentDate = LocalDate.now();
				long daysOld = ChronoUnit.DAYS.between(birthdayDate, currentDate);

				if (daysOld < 0) {
			out.print("Az nem lehet. Múltbeli dátumot adj meg!");

				}

				else if (daysOld < 5 * 365) {
			out.print(daysOld + " napos vagy. Még nem is tudsz olvasni.");

				}

				else if (birthdayDate.getMonthValue() == currentDate.getMonthValue()
				&& birthdayDate.getDayOfMonth() == currentDate.getDayOfMonth()) {
			out.print("Boldog születésnapot! 🎂 " + daysOld + " napos vagy!");

				}

				else {
			out.print(daysOld + " napos vagy! Gratulálok!");

				}
			} catch (Exception e) {
				out.print("Kérlek használd a megadott formátumot és érvényes értéket adj meg!");

			}

		}
		%>
	</p>


</body>
</html>