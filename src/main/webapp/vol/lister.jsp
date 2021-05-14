
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="b"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste Vol</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
	<div class="container mt-3">
		<div class="card">
		<div class="card-header bg-info">Liste Vol</div>
		<div class="card-body">
			<table class="table table-striped">
				<tr>
					<td>Idv</td>
					<td>Id Avion</td>
					<td>Date Depart</td>
					<td>Date D'arrivé</td>
					<td>Durée</td>
					<td>Aeroport Depart</td>
					<td>Aeroport Arrivé</td>
					<td>Distance</td>
					<td>Ville Depart</td>
					<td>Ville Arrivée</td>
				</tr>
				<b:forEach items="${vol}" var="a">
				
				<tr>
						<td>${a.idVol}</td>
						<td>${a.idAvion.idAvion}</td>
						<td>${a.heurDepart}</td>
						<td>${a.heurArrivee}</td>
						<td>${a.duree}</td>
						<td>${a.aeroportDepart}</td>
						<td>${a.aeroportArrivee}</td>
						<td>${a.villeDepart}</td>
						<td>${a.villeArrive}</td>
						<td>${a.distance}</td>
						<td>
						<a href="supprimer.vol?idVol=${a.idVol}" onclick="return confirm('OUpps!!')" class="btn btn-danger">Supprimer</a>
						</td>
						<td>
						<a href="modifiier.vol?idVol=${a.idVol}" onclick="return confirm('OUpps!!')" class="btn btn-danger">Modifier</a>
						</td>
						</td>
				</tr>
					
					</b:forEach>
			</table>
			<a href="add.vol" class="btn btn-success">Ajouter vol</a>
		</div>
	</div>
	</div>
</body>
</html>