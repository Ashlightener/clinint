<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<link href="css/font-awesome.min.css" rel="stylesheet" type="text/css">
<link href="css\style_login.cs.css" rel="stylesheet" type="text/css">
</head>
<body>

	<div class="navbar navbar-default navbar-inverse navbar-static-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#navbar-ex-collapse">
					<span class="sr-only">Toggle navigation</span><span
						class="icon-bar"></span><span class="icon-bar"></span><span
						class="icon-bar"></span>
				</button>
			</div>
			<div class="collapse navbar-collapse" id="navbar-ex-collapse">
				<ul class="nav navbar-nav navbar-right">
					<li class="active"><a href="#">Home</a></li>
					<li><a href="#">Contacts</a></li>
				</ul>
			</div>
		</div>
	</div>
	<div class="section">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="well" style="">
						<div class="section">
							<div class="container">
								<div class="row">
									<div class="col-lg-5">
										<form class="form-horizontal" id="loginform">
											<div class="form-group">
												<div class="col-sm-2">
													<label for="inputEmail3" class="control-label">Username</label>
												</div>
												<div class="col-sm-8">
													<input type="text" class="form-control" id="input_user"
														placeholder="Username" name="usname" required>
												</div>
											</div>
											<div class="form-group">
												<div class="col-sm-2">
													<label for="inputPassword3" class="control-label">Password</label>
												</div>
												<div class="col-sm-8">
													<input type="password" class="form-control"
														id="input_Password" placeholder="Password" name="pasword"
														required>
												</div>
											</div>
											<div class="form-group">
												<div class="col-sm-offset-2 col-sm-10">
													<div class="checkbox">
														<label><input type="checkbox"> Remember me
														</label>
													</div>
												</div>
											</div>
											<div class="form-group">
												<div class="col-sm-offset-2 col-sm-10">
													<button type="submit" class="btn btn-default" id="sign">Sign
														in</button>


												</div>
											</div>
										</form>
										<div>
											<p hidden="" id="log_in" class="alert error">Login
												failed, please try again.</p>
										</div>
									</div>
									<div class="col-lg-6"
										style="margin-right: auto; margin-left: auto; display: table;">
										<img src="images\login.jpg" class="img-responsive">
									</div>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<footer class="section section-primary">
		<div class="container">
			<div class="row">
				<div class="col-sm-6">
					<h1>Footer header</h1>
					<p>
						Lorem ipsum dolor sit amet, consectetur adipisici elit, <br>sed
						eiusmod tempor incidunt ut labore et dolore magna aliqua. <br>Ut
						enim ad minim veniam, quis nostrud
					</p>
				</div>
				<div class="col-sm-6">
					<p class="text-info text-right">
						<br> <br>
					</p>
					<div class="row">
						<div class="col-md-12 hidden-lg hidden-md hidden-sm text-left">
							<a href="#"><i
								class="fa fa-3x fa-fw fa-instagram text-inverse"></i></a> <a
								href="#"><i class="fa fa-3x fa-fw fa-twitter text-inverse"></i></a>
							<a href="#"><i
								class="fa fa-3x fa-fw fa-facebook text-inverse"></i></a> <a href="#"><i
								class="fa fa-3x fa-fw fa-github text-inverse"></i></a>
						</div>
					</div>
					<div class="row">
						<div class="col-md-12 hidden-xs text-right">
							<a href="#"><i
								class="fa fa-3x fa-fw fa-instagram text-inverse"></i></a> <a
								href="#"><i class="fa fa-3x fa-fw fa-twitter text-inverse"></i></a>
							<a href="#"><i
								class="fa fa-3x fa-fw fa-facebook text-inverse"></i></a> <a href="#"><i
								class="fa fa-3x fa-fw fa-github text-inverse"></i></a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</footer>

	<script type="text/javascript">
		$('#sign').click(function(e) {
			e.preventDefault();
			var user_name = $("#input_user").val();
			var passw = $("#input_Password").val();
			$.post('User_servlet', {
				user_name : user_name,
				passw : passw
			}, function(eror) {
				if (eror != "200") {					
					alert(eror);
					$("#log_in").show();
				} else {
					alert(eror);
					window.location.href = "/clinint/access/index.jsp";
				}
			});
		});
	</script>
</body>
</html>