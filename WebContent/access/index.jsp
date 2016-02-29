<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" import="user.User_details"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>TRIAL-MAX</title>
<meta name="description"
	content="Source code generated using layoutit.com">
<meta name="author" content="LayoutIt!	">
<link href="/clinint/css/style.css" rel="stylesheet">
<!-- Screening Head-->
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

<script type="text/javascript" src="/clinint/js/jquery.min.js"></script>
<script type="text/javascript" src="/clinint/js/bootstrap.min.js"></script>
<link href="/clinint/css/bootstrap.min.css" rel="stylesheet">

<link rel="stylesheet" href="/clinint/css/font-awesome.min.css" />
<link href="/clinint/css/Screen_Style.css" rel="stylesheet"
	type="text/css">

<!-- Screen date  -->
<script type="text/javascript" src="/clinint/js/moment.min.js"></script>
<script src="/clinint/js/bootstrap-datepicker.min.js"></script>
<link rel="stylesheet" href="/clinint/css/bootstrap-datepicker.min.css" />
</head>
<body>

	<%-- <%
		User_details us = (User_details) session.getAttribute("user_info");
	%>
	<%=us.getFull_name()%>

	<%=session.getMaxInactiveInterval()%> --%>
	<div class="container-fluid ">
		<div class="row">
			<div class="col-md-12">
				<div class="page-header">
					<h1>
						ClinIntel <small>A clinical research organisation</small>
					</h1>
					<div class="dropdown">
						<form role="submit"
							action="${pageContext.request.contextPath}/Logout" method="post">
							<button type="submit" class="btn btn-primary"
								style="margin-left: 90%;">Logout</button>
						</form>
					</div>
				</div>
				<blockquote class="pull-right">
					<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit.
						Integer posuere erat a ante.</p>
					<small>Someone famous <cite>Source Title</cite></small>
				</blockquote>
			</div>
		</div>
		<div class="row">
			<div class="col-md-4">
				<div>
					<h4>Patient Management</h4>
					<p>Make all patient transactions by selecting the Patient
						Management Collapsibke</p>
				</div>
				<div class="carousel slide" id="carousel-661725">
					<ol class="carousel-indicators">
						<li class="active" data-slide-to="0"
							data-target="#carousel-661725"></li>
						<li data-slide-to="1" data-target="#carousel-661725"></li>
					</ol>
					<div class="carousel-inner">
						<div class="item active">
							<img alt="Carousel Bootstrap First"
								src="/clinint/images/Scree.jpg">

						</div>
						<div class="item">
							<img alt="Carousel Bootstrap Second"
								src="/clinint/images/sit.jpg">
							<div class="carousel-caption">
								<h4>Second Thumbnail label</h4>
								<p>Cras justo odio, dapibus ac facilisis in, egestas eget
									quam. Donec id elit non mi porta gravida at eget metus. Nullam
									id dolor id nibh ultricies vehicula ut id elit.</p>
							</div>
						</div>
					</div>
					<a class="left carousel-control" href="#carousel-661725"
						data-slide="prev"><span
						class="glyphicon glyphicon-chevron-left"></span></a> <a
						class="right carousel-control" href="#carousel-661725"
						data-slide="next"><span
						class="glyphicon glyphicon-chevron-right"></span></a>
				</div>
				<div class="panel-group" id="panel-986158">
					<div class="panel panel-default">
						<div class="panel-heading">
							<a class="panel-title collapsed" data-toggle="collapse"
								data-parent="#panel-986158" href="#panel-element-404931">Patient
								Management</a>

						</div>
						<div id="panel-element-404931" class="panel-collapse collapse">
							<div class="panel-body">
								<a href="#" class="btn btn-primary btn-default"
									data-toggle="modal" data-target="#screen" type="button">Screen</a>
							</div>
						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<a class="panel-title collapsed" data-toggle="collapse"
								data-parent="#panel-986158" href="#panel-element-23723">Summary
								of patients</a>
						</div>
						<div id="panel-element-23723" class="panel-collapse collapse">
							<div class="panel-body">
								<form role="form"
									action="${pageContext.request.contextPath}/patient_servlet"
									method="post">
									<button type="submit" class="btn btn-primary btn-default"
										type="button">Summary</button>
								</form>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div>
					<h4>Patient Management</h4>
					<p>Make all patient transactions by selecting the Patient
						Management Collapsibke</p>
				</div>

				<div class="carousel slide" id="carousel-642642">
					<ol class="carousel-indicators">
						<li class="active" data-slide-to="0"
							data-target="#carousel-642642"></li>
						<li data-slide-to="1" data-target="#carousel-642642"></li>
					</ol>
					<div class="carousel-inner">
						<div class="item active">
							<img alt="Carousel Bootstrap First"
								src="/clinint/images/Understanding.jpg">
							<div class="carousel-caption">
								<h4>First Thumbnail label</h4>
								<p>Cras justo odio, dapibus ac facilisis in, egestas eget
									quam. Donec id elit non mi porta gravida at eget metus. Nullam
									id dolor id nibh ultricies vehicula ut id elit.</p>
							</div>
						</div>
						<div class="item">
							<img alt="Carousel Bootstrap Second"
								src="/clinint/images/rep.jpg">
							<div class="carousel-caption">
								<h4>Second Thumbnail label</h4>
								<p>Cras justo odio, dapibus ac facilisis in, egestas eget
									quam. Donec id elit non mi porta gravida at eget metus. Nullam
									id dolor id nibh ultricies vehicula ut id elit.</p>
							</div>
						</div>
					</div>
					<a class="left carousel-control" href="#carousel-642642"
						data-slide="prev"><span
						class="glyphicon glyphicon-chevron-left"></span></a> <a
						class="right carousel-control" href="#carousel-642642"
						data-slide="next"><span
						class="glyphicon glyphicon-chevron-right"></span></a>
				</div>
				<div class="panel-group" id="panel-500305">
					<div class="panel panel-default">
						<div class="panel-heading">
							<a class="panel-title collapsed" data-toggle="collapse"
								data-parent="#panel-500305" href="#panel-element-434423">Collapsible
								Group Item #1</a>
						</div>
						<div id="panel-element-434423" class="panel-collapse collapse">
							<div class="panel-body">Anim pariatur cliche...</div>
						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<a class="panel-title collapsed" data-toggle="collapse"
								data-parent="#panel-500305" href="#panel-element-689210">Collapsible
								Group Item #2</a>
						</div>
						<div id="panel-element-689210" class="panel-collapse collapse">
							<div class="panel-body">Anim pariatur cliche...</div>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div>
					<h4>Patient Management</h4>
					<p>Make all patient transactions by selecting the Patient
						Management Collapsibke</p>
				</div>

				<div class="carousel slide" id="carousel-678040">
					<ol class="carousel-indicators">
						<li class="active" data-slide-to="0"
							data-target="#carousel-678040"></li>
						<li data-slide-to="1" data-target="#carousel-678040"></li>
					</ol>
					<div class="carousel-inner">
						<div class="item active">
							<img alt="Carousel Bootstrap First"
								src="/clinint/images/Mole.png">
							<div class="carousel-caption">
								<h4>First Thumbnail label</h4>
								<p>Cras justo odio, dapibus ac facilisis in, egestas eget
									quam. Donec id elit non mi porta gravida at eget metus. Nullam
									id dolor id nibh ultricies vehicula ut id elit.</p>
							</div>
						</div>
						<div class="item">
							<img alt="Carousel Bootstrap Second"
								src="/clinint/images/DNA_back.jpg">
							<div class="carousel-caption">
								<h4>Second Thumbnail label</h4>
								<p>Cras justo odio, dapibus ac facilisis in, egestas eget
									quam. Donec id elit non mi porta gravida at eget metus. Nullam
									id dolor id nibh ultricies vehicula ut id elit.</p>
							</div>
						</div>
					</div>
					<a class="left carousel-control" href="#carousel-678040"
						data-slide="prev"><span
						class="glyphicon glyphicon-chevron-left"></span></a> <a
						class="right carousel-control" href="#carousel-678040"
						data-slide="next"><span
						class="glyphicon glyphicon-chevron-right"></span></a>
				</div>
				<div class="panel-group" id="panel-960592">
					<div class="panel panel-default">
						<div class="panel-heading">
							<a class="panel-title collapsed" data-toggle="collapse"
								data-parent="#panel-960592" href="#panel-element-426437">Collapsible
								Group Item #1</a>
						</div>
						<div id="panel-element-426437" class="panel-collapse collapse">
							<div class="panel-body">Anim pariatur cliche...</div>
						</div>
					</div>
					<div class="panel panel-default">
						<div class="panel-heading">
							<a class="panel-title" data-toggle="collapse"
								data-parent="#panel-960592" href="#panel-element-655087">Collapsible
								Group Item #2</a>
						</div>
						<div id="panel-element-655087" class="panel-collapse collapse in">
							<div class="panel-body">Anim pariatur cliche...</div>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12"></div>
		</div>

	</div>



	<!--Screening Modal Form -->
	<div class="modal fade" id="screen">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h4 class="modal-title text-info">
						<i class="fa fa-star fa-fw"></i>Subject Management
					</h4>
				</div>
				<!-- <form role="form" action="/clinint/Screening_servlet" method="get">-->

				<div>
					<div class="modal-body">
						<ul class="breadcrumb">
							<li><a href="#">Subject Management</a></li>
							<li><a href="#">Screening Form</a></li>
						</ul>
						<div class="well">
							<h2 class="text-info text-left">Screening Form</h2>
							<p></p>
						</div>
						<div>
							<div class="well">
								<h4 class="text-info text-left">
									<b><u>Site Info</u></b><br> <br>COUNTRY &nbsp; &nbsp;
									&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
									&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
									&nbsp; &nbsp;SITE
								</h4>
								<div class="row">
									<a class="btn btn-default btn-select btn-select-light"
										style="width: 40%; float: left"><select
										class="form-control" id="countryid">
											<option>Country</option>
											<option>India</option>
											<option>USA</option>
											<option>Germany</option>
											<option>France</option>
									</select> </a> <a class="btn btn-default btn-select btn-select-light"
										style="width: 40%; float: left; right: -60px"> <select
										class="form-control" id="siteid">
											<option>Site</option>
									</select>
									</a>
								</div>
								<!--  -->
							</div>
							<div class="well">
								<h4 class="text-left text-primary">
									<u><b>Subject Info</b></u><br> <br>DATE OF BIRTH
									&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
									&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
									&nbsp; &nbsp; &nbsp; &nbsp;SEX
								</h4>
								<div class="row">
									<div class="col-sm-6">
										<div class="form-group">
											<div class='input-group date' id='datetimepicker1'>
												<input id="dob" type='text' name="dob" class="form-control" />
												<span class="input-group-addon"> <span
													class="glyphicon glyphicon-calendar"
													onClick="$('#dob').datepicker('show');"></span>
												</span>
											</div>
										</div>
									</div>
									<div class="col-sm-6">
										<a class="btn btn-default btn-select btn-select-light"
											style="width: 40%; float: left;"> <input type="hidden"
											class="btn-select-input" id="sexid" value="sex" /> <span
											class="btn-select-value" name="sex" id="sex">Gender</span> <span
											class='btn-select-arrow glyphicon glyphicon-chevron-down'></span>
											<ul class="scroll_selection">
												<li>Male</li>
												<li>Female</li>
											</ul>
										</a>
									</div>
								</div>
								<div class="row">
									<div class="col-md-12">
										<h4 class="text-info text-left">
											INFORMED CONSENT &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
											&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
											&nbsp; &nbsp; WEIGHT &nbsp;<br>
										</h4>
										<div class="row">
											<div class="col-md-6">
												<div class="form-group">
													<div class='input-group date' id='datetimepicker1'>
														<input id="infconsent" type='text' name="icd"
															class="form-control" /> <span class="input-group-addon">
															<span class="glyphicon glyphicon-calendar"
															onClick="$('#infconsent').datepicker('show');"></span>
														</span>
													</div>
												</div>
											</div>
											<div class="col-md-6">
												<div class="form-group">
													<div class="col-sm-2">
														<label for="inputEmail3" class="control-label"></label>
													</div>
													<div class="col-sm-15 text-left">
														<input type="number" class="form-control" id="weightid"
															name="weight" placeholder="Weight">
													</div>
												</div>
											</div>
										</div>
									</div>
								</div>
								<h4 class="text-info text-left">
									SCREENING DATE &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
									&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;<br>
								</h4>
								<div class="row">
									<div class="col-md-12">
										<div class="form-group">
											<div class='input-group date' id='datetimepicker1'>
												<input id="scrdate" type='text' name="scrn_date"
													class="form-control" /> <span class="input-group-addon">
													<span class="glyphicon glyphicon-calendar"
													onClick="$('#scrdate').datepicker('show');"></span>
												</span>
											</div>
										</div>
									</div>
								</div>
								<div class="row"></div>
							</div>
							<p></p>
						</div>

						<div class="modal-fo2oter">
							<div class="row">
								<div class="col-md-6">
									<ol>
										<div id="country_error"></div>
										<div id="site_error"></div>
										<div id="dob_error"></div>
										<div id="gender_error"></div>
									</ol>
								</div>
								<div class="col-md-6">
									<ol>
										<div id="infc_error"></div>
										<div id="weight_error"></div>
										<div id="scr_error"></div>
									</ol>
								</div>
							</div>
							<div class="row">
								<button class="btn btn-default" data-dismiss="modal"
									style="margin-left: 400px;">Close</button>
								<button type="submit" class="btn btn-primary" id="save"
									style="margin-left: 15px;">Save changes</button>

							</div>
						</div>
					</div>
				</div>
				<!-- </form> -->
			</div>
		</div>
	</div>

	<!--SCreening confirmation -->

	<div class="modal fade" id="scr_confirm">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">×</button>
					<h4 class="modal-title">Screening confirmation</h4>
				</div>
				<div class="modal-body">
					<div class="well">
						<h2>Confirm changes</h2>
						<p>As you are about to screen &nbsp;a subject into the study,
							Please confirm your actions by providing password</p>
							
					</div>
					<div class="row">
						<div class="col-md-12">
							<form class="form-horizontal" role="form">
								<div class="form-group">
									<div class="col-sm-2">
										<label for="inputPassword3" class="control-label">Password</label>
									</div>
									<div class="col-sm-10">
										<input type="password" class="form-control"
											id="inputPassword3" placeholder="Password">
									</div>
								</div>
							</form>
						</div>
					</div>
				</div>
				<div class="modal-footer">
					<a class="btn btn-default" data-dismiss="modal">Close</a> <a
						class="btn btn-primary">Save changes</a>
				</div>
			</div>
		</div>
	</div>

	<script type="text/javascript">
		$(document).ready(function() {
			$(".btn-select").each(function(e) {
				var value = $(this).find("ul li.selected").html();
				if (value != undefined) {
					$(this).find(".btn-select-input").val(value);
					$(this).find(".btn-select-value").html(value);
				}
			});
		});

		$(document).on(
				'click',
				'.btn-select',
				function(e) {
					e.preventDefault();
					var ul = $(this).find("ul");
					if ($(this).hasClass("active")) {
						if (ul.find("li").is(e.target)) {
							var target = $(e.target);
							target.addClass("selected").siblings().removeClass(
									"selected");
							var value = target.html();
							$(this).find(".btn-select-input").val(value);
							$(this).find(".btn-select-value").html(value);
						}
						ul.hide();
						$(this).removeClass("active");
					} else {
						$('.btn-select').not(this).each(function() {
							$(this).removeClass("active").find("ul").hide();
						});
						ul.slideDown(300);
						$(this).addClass("active");
					}
				});

		$(document).on('click', function(e) {
			var target = $(e.target).closest(".btn-select");
			if (!target.length) {
				$(".btn-select").removeClass("active").find("ul").hide();
			}
		});
	</script>

	<script type="text/javascript">
		$(document).ready(function() {
			$('#datetimepicker1 input').datepicker({});
		})
	</script>

	<script>
		$(document).ready(function() {
			$('#save').click(function(e) {
				/* e.preventDefault(); */

				var selsub = "submit";
				var country = $('#countryid').val();
				var weight = $('#weightid').val();
				var dob = $('#dob').val();
				var infc = $('#infconsent').val();
				var sex = $('#sex').text();
				var siteid = $('#siteid').val();
				var scrdate = $('#scrdate').val();
				$.ajax({
					type : "GET",
					url : "/clinint/Screening_servlet",

					data : {
						"country" : country,
						"weight" : weight,
						"dob" : dob,
						"infc" : infc,
						"sex" : sex,
						"siteid" : siteid,
						"scrdate" : scrdate,
						"selsub" : selsub
					},
					success : function(responseJson) {

						if (responseJson.length != 0) {
							$("#country_error").text(" ");
							$("#site_error").text(" ");
							$("#dob_error").text(" ");
							$("#gender_error").text(" ");
							$("#infc_error").text(" ");
							$("#weight_error").text(" ");
							$("#scr_error").text(" ");

							$("#country_error").text(responseJson[0]);
							$("#site_error").text(responseJson[1]);
							$("#dob_error").text(responseJson[2]);
							$("#gender_error").text(responseJson[3]);
							$("#infc_error").text(responseJson[4]);
							$("#weight_error").text(responseJson[5]);
							$("#scr_error").text(responseJson[6]);
							
							
							 
						} else {
							$("#country_error").text(" ");
							$("#site_error").text(" ");
							$("#dob_error").text(" ");
							$("#gender_error").text(" ");
							$("#infc_error").text(" ");
							$("#weight_error").text(" ");
							$("#scr_error").text(" ");
							
							$('#screen').modal('toggle');
							alert("closed");
							$('#scr_confirm').modal('toggle');
													
						}
					}

				});
			});
		});
	</script>

	<script>
		$('#countryid').change(function(event) {
			var country = $("#countryid").val();
			var sub = "not_submit";
			$.get('/clinint/Screening_servlet', {
				selcountry : country,
				selsub : sub
			}, function(sites) {
				var select = $('#siteid');
				select.find('option').remove();
				$.each(sites, function(index, value) {
					$('<option>').val(value).text(value).appendTo(select);
				});
			});
		});
	</script>

	<script src="js/scripts.js"></script>
</body>
</html>