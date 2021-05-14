<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
       <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajouter vol</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
		<form action="save.vol" method="post">
			<div class="container col-md-6 offset-4 mt-3">
				<div class="form-group">
				<label class="control-label">Identifiant du vol</label>
				<input type="text" class="form-control" name="idVol">
				<label class="control-label">Identifiant de l'avion</label>
				<select  class="form-control" name="idAvion">
				<option>Choisir l'Avion</option>
					<c:forEach items="${avion}" var="a">
						<option  value="${a.idAvion}" class="form-control" >${a.companie}</option>
					</c:forEach>
				</select>
				<label class="control-label">Date de départ</label>
				<input type="date" class="form-control" name="heurDepart">
				<label class="control-label">Date  d'arrivée</label>
				<input type="date" class="form-control" name="heurArrivee">
				<label class="control-label">Durée</label>
				<input type="number" class="form-control" name="duree">
				<label class="control-label">Aéroport de départ</label>
				<input type="text" class="form-control" name="ad">
				<label class="control-label">Aéroport d'arrivée</label>
				<input type="text" class="form-control" name="ar">
				<label class="control-label">Ville de départ</label>
				<input type="text" class="form-control" name="vd">
				<label class="control-label">Ville d'arrivée</label>
				<input type="text" class="form-control" name="va">
				<label class="control-label">Distance</label>
				<input type="number" class="form-control" name="distance">
				<input type="submit" value="Enregistrer" class="btn btn-success mt-3">
				</div>
			</div>
		</form>
</body>
</html>