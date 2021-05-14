
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/index.css">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="css/all.css">
    <title>Booking</title>

    <style>
        body {
            background-image: url(images/bg1.jpg);
            background-size: cover;
            background-position: center;
            height: 700px;
            margin-top: 0%;
        }
        
        a {
            color: black;
            font-weight: bold;
        }
    </style>
</head>

<body>

    <nav class="navbar navbar-expand-lg navbar-default bg-light shadow-lg p-5 rounded">
        <span><img src="images/plane.png" width="30" height="30" srcset=""></span>
        <a class="navbar-brand container fw-bold" style="color:#F55515 ;" href="#">SENE FLIGHT BOOKING</a>
        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>


        <!-- uses brands style -->
        <div class="collapse navbar-collapse" id="navbarNav">
            <ul class="navbar-nav">
                <li class="nav-item">
                    <a class="nav-link" href=""></a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="">Acceuil</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="">Liste Vols</a>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="">Contact</a>
                </li>
            </ul>
        </div>
    </nav>


    <div class="row header">
        <div class="recherche col-md-6 mt-4 shadow-sm p-3 mb-5 bg-body rounded offset-2">
            <h2 class="text-center pt-4 text-success fw-bold">Trouvez des offres de vol</h2>
            <form class="pt-4">
                <div class="row mb-2">
                    <div class="col">
                        <input type="text" class="form-control">
                    </div>
                    <div class="col">
                        <input type="text" class="form-control">
                    </div>
                </div>

                <div class="row">
                    <div class="col">
                        <input type="text" class="form-control">
                    </div>
                    <div class="col">
                        <input type="text" class="form-control">
                    </div>
                </div>

                <div class="d-grid gap-2">
                    <button type="submit" class="text-center btn mt-5 text-white p-4" style="background-color: #F55515;">RECHERCHER</button>
                </div>
            </form>
        </div>

    </div>

    <script src="js/bootstrap.min.js"></script>

    <body>

</html>