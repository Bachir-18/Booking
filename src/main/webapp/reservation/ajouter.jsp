<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Ajouter avion</title>
<link rel="stylesheet" href="css/bootstrap.min.css">
</head>
<body>
		<form action="save.avion" method="post">
			<div class="container col-md-6 offset-4 mt-3">
				<div class="form-group">
				<label class="control-label">Nombre Place</label>
				<input type="number" class="form-control" name="nb_place">
				<input type="submit" value="Enregistrer" class="btn btn-success mt-3">
				</div>
			</div>
		</form>
</body>
</html>