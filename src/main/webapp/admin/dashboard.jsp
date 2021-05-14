<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="css/index.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/all.css">

<style>
       
        body{
        
            background-image: url(images/bg1.jpg);
            background-size: cover;
            background-position: center;
            height: 700px;
            margin-top: 0%;
        }
        
        a {
            color: white;
            font-weight: bold;
            text-decoration: none;
        }
        
        .logo {
            color: white;
        }
        
        .add {
            margin-bottom: 10px;
        }
    </style>
</head>

<body>



    <div>
        <nav class="navbar navbar-expand-lg navbar-light bg-light shadow-sm mb-5 bg-white rounded">
            <div class="container-fluid">
                <a class="navbar-brand" href="/"><img src="images/plane.png" class="logo" width="30" height="30" srcset="">SENE FLIGHT BOOKING [ESPACE ADMIN]</a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                    <span class="navbar-toggler-icon"></span>
                </button>
            </div>
        </nav>
    </div>


    <main>
        <h1 class="visually-hidden"></h1>
 <div class="row">
        <div class="d-flex flex-column p-3 text-white bg-dark col-md-4" style="width: 280px; height: 600px; margin-left: 20px;">
            <a href="/" class="d-flex align-items-center mb-3 mb-md-0 me-md-auto text-white text-decoration-none">
                <svg class="bi me-2" width="40" height="32"><use xlink:href="#bootstrap"/></svg>
                <span class="fs-4">Dashboard Booking</span>
            </a>
            <hr>
            <ul class="nav nav-pills flex-column mb-auto">
                <li class="nav-item">
                    <p>

                        <button class="btn text-white" style="background-color: coral;" type="button" data-bs-toggle="collapse" data-bs-target="#collapseExample" aria-expanded="false" aria-controls="collapseExample">
                            Gestion Avion
                        </button>
                    </p>
                    <div class="collapse" id="collapseExample">
                        <div class="add">
                            <a href="addAvion.avion" class="text-white">Ajouter</a>
                        </div>

                        <div>
                            <a href="listeAvion.avion" class="text-white">Liste</a>
                        </div>
                    </div>
                </li>

                <p>

                    <button class="btn text-white" style="background-color: coral;" type="button" data-bs-toggle="collapse" data-bs-target="#collapseExample2" aria-expanded="false" aria-controls="collapseExample">
                            Gestion Vol
                        </button>
                </p>
                <div class="collapse" id="collapseExample2">
                    <div class="add">
                        <a href="http://" class="text-white">Ajouter</a>
                    </div>

                    <div>
                        <a href="http://" class="text-white">Liste</a>
                    </div>
                </div>

                <p>

                    <button class="btn text-white" style="background-color: coral;" type="button" data-bs-toggle="collapse" data-bs-target="#collapseExample3" aria-expanded="false" aria-controls="collapseExample">
                            Gestion Réservation
                        </button>
                </p>
                <div class="collapse" id="collapseExample3">
                    <div class="add">
                        <a href="http://" class="text-white">Ajouter</a>
                    </div>

                    <div>
                        <a href="http://" class="text-white">Liste</a>
                    </div>
                </div>

                <hr>

        </div>
        
        <div class="col-md-8">
               	   		
        	  
			</div>
 </div>

 

        <script src="js/bootstrap.min.js"></script>

        
</body>
</html>