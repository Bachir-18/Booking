<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <title>Login</title>

    <style>
        body {
            background-color: #F0F2F5;
        }
        
        .formSide {
            margin-top: 100px;
            background-color: white;
            padding: 25px;
            padding-left: 45px;
            padding-bottom: 100px;
        }
        
        .form-group {
            width: 400px;
        }
        
        .textO {
            margin-top: 80px;
        }
    </style>
</head>

<body>

    <div class="row container">
        <div class="col-md-6 textO">
            <span><img src="images/plane.png" width="60" height="60" srcset=""> </span>
            <h3 class="mt-5" style="color:#F55515 ;">SENE FIGHT BOOKING</h3>
        </div>
        <div class="col-md-6 formSide shadow-sm mb-5 bg-body rounded">
            <div class="container-fluid">
                <form action="" id="login-frm">
                    <div class="form-group">
                        <input type="email" name="email" required="" class="form-control">
                    </div>
                    <div class="form-group mt-3">
                        <input type="password" name="password" required="" class="form-control">
                    </div>
                    <div class="d-grid gap-2">
                        <button class="button btn btn-success btn-lg mt-3 btn-block">Login</button>
                    </div>
                </form>
            </div>
        </div>
    </div>

</body>

</html>