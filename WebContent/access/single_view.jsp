<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>Patient</title>

<link href="/clinint/css/bootstrap.min.css" rel="stylesheet">
<link href="/clinint/css/style.css" rel="stylesheet">


<script type="text/javascript" src="/clinint/js/jquery.min.js"></script>
<script type="text/javascript" src="/clinint/js/bootstrap.min.js"></script>
<link href="/clinint/css/bootstrap.min.css" rel="stylesheet">

<script type="text/javascript" src="/clinint/js/moment.min.js"></script>
<script src="/clinint/js/bootstrap-datepicker.min.js"></script>
<link rel="stylesheet" href="/clinint/css/bootstrap-datepicker.min.css" />

</head>
<body>

	<div class="container-fluid">
		<div class="row">
			<div class="col-md-12">
				<div class="tabbable" id="tabs-322891">
					<ul class="nav nav-tabs">
						<li class="active"><a href="#panel-338981" data-toggle="tab">Section
								1</a></li>
						<li><a href="#panel-449424" data-toggle="tab">Section 2</a></li>
					</ul>
					<div class="tab-content">
						<div class="tab-pane active" id="panel-338981">
							<p>I'm in Section 1.</p>

							<div class="row">
								<div class="col-md-4">
									<div class="panel panel-primary">
										<div class="panel-heading">
											<h3 class="panel-title">Panel title</h3>
										</div>
										<div class="panel-body">Panel content</div>
										<div class="panel-footer">Panel footer</div>
									</div>
								</div>
								<div class="col-md-4">
									<div class="row">
										<div class="col-sm-2">
										
											<p><b>DOB</b></p>
										</div>
										<div class="col-sm-8">
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
									</div>
								</div>
								<div class="col-md-4"></div>
							</div>
						</div>

						<div class="tab-pane" id="panel-449424">
							<p>Howdy, I'm in Section 2.</p>
						</div>
					</div>
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
	
</body>
</html>