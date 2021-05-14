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
				<label class="control-label">${vol.idVol}</label>
				<label class="control-label">Identifiant de l'avion</label>
				<select  class="form-control">
				<option>Choisir l'Avion</option>
					<c:forEach items="${avion}" var="a">
						<option name="idAvion" value="${a.idAvion}" class="form-control">${a.nb_place}</option>
					</c:forEach>
				</select>
				<label class="control-label">Date de départ</label>
				<input type="text" class="form-control" name="heurDepart" value="${vol.heurDepart }">
				<label class="control-label">Date  d'arrivée</label>
				<input type="text" class="form-control" name="heurArrivee" value="${vol.heurArrivee}">
				<label class="control-label">Durée</label>
				<input type="number" class="form-control" name="duree" value="${vol.duree}">
				<label class="control-label">Aéroport de départ</label>
				<input type="text" class="form-control" name="ad" value="${vol.aeroportDepart}">
				<label class="control-label">Aéroport d'arrivée</label>
				<input type="text" class="form-control" name="ar" value="${vol.aeroportArrive}">
				<label class="control-label">Ville de départ</label>
				<input type="text" class="form-control" name="vd" value="${vol.villeDepart}">
				<label class="control-label">Ville d'arrivée</label>
				<input type="text" class="form-control" name="va" value="${vol.villeArrive}">
				<label class="control-label">Distance</label>
				<input type="number" class="form-control" name="distance" value="${vol.distance}">
				<input type="submit" value="Enregistrer" class="btn btn-success mt-3">
				</div>
			</div>
		</form>
</body>
</html>