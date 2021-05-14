
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Liste Avion</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
	<div class="container mt-3">
		<div class="card">
		<div class="card-header bg-info">Liste Avion</div>
		<div class="card-body">
			<table class="table table-striped">
				<tr>
					<td>MATRICULE</td>
					<td>Nombre de Place</td>
					<td>Action</td>
				</tr>
				<c:forEach items="${avion}" var="a">
				<tr>
						<td>${a.idAvion}</td>
						<td>${a.nb_place}</td>
						<td>${a.companie}</td>
						<td>
						<a href="supprimer.avion?idAvion=${a.idAvion}" onclick="return confirm('OUpps!!')" class="btn btn-danger">Supprimer</a>
						</td>
				</tr>
					</c:forEach>
			</table>
			<a href="add.avion" class="btn btn-success">Ajouter avion</a>
		</div>
	</div>
	</div>
</body>
</html>