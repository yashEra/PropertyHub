<%-- 
    Document   : sellerProfile
    Created on : Aug 10, 2023, 4:29:06 PM
    Author     : Saliha
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="en">
<html>
    <head>
	<meta charset="UTF-8">
	<title>Profile</title>
	<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
	<link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
	
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">

	<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
    <body>
	<section class="py-5 my-5">
		<div class="container">
                   
			<h1 class="mb-5">Profile</h1>
			<div class="bg-white shadow rounded-lg d-block d-sm-flex">
				<div class="profile-tab-nav border-right">
					<div class="p-4">
						<div class="img-circle text-center mb-3">
							<img src="images/user2.jpg" alt="Image" class="shadow">
						</div>
						<h4 class="text-center">Sahan Chamikara</h4>
					</div>
					<div class="nav flex-column nav-pills" id="v-pills-tab" role="tablist" aria-orientation="vertical">
						<a class="nav-link active" id="account-tab" data-toggle="pill" href="#account" role="tab" aria-controls="account" aria-selected="true">
							<i class="fa fa-home text-center mr-1"></i> 
							Account
						</a>
						
						<a class="nav-link" id="password-tab" data-toggle="pill" href="#password" role="tab" aria-controls="password" aria-selected="false">
							<i class="fa fa-key text-center mr-1"></i> 
							Password
						</a>
						
						<a class="nav-link" id="notification-tab" data-toggle="pill" href="#notification" role="tab" aria-controls="notification" aria-selected="false">
							<i class="fa fa-bell text-center mr-1"></i> 
							Notification
						</a>
						<a class="nav-link" id="settings-tab" data-toggle="pill" href="#settings" role="tab" aria-controls="settings" aria-selected="false">
							<i class="fa fa-cog text-center mr-1"></i> 
							Settings
						  </a>
					</div>
				</div>			
				<div class="tab-content p-4 p-md-5" id="v-pills-tabContent">
					<div class="tab-pane fade show active" id="account" role="tabpanel" aria-labelledby="account-tab">
						<h3 class="mb-4">
                                           
                                                    Account Settings</h3>
						<div class="row">
							<div class="col-md-6">
								<div class="form-group">
								  	<label>First Name</label>
								  	<input type="text" class="form-control" value="Sahan">
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
								  	<label>Last Name</label>
								  	<input type="text" class="form-control" value="Chamikara">
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
								  	<label>Email</label>
								  	<input type="text" class="form-control" value="sahanchamikara198@gmail.com">
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
								  	<label>Phone number</label>
								  	<input type="text" class="form-control" value="+94 741234567">
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
								  	<label>Address</label>
								  	<input type="text" class="form-control" value="No:58, Passara Road, Badulla.">
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
								  	<label>Country</label>
								  	<input type="text" class="form-control" value="Sri Lanka">
								</div>
							</div>
							<div class="col-md-12">
								<div class="form-group">
								  	<label>Comment</label>
									<textarea class="form-control" rows="4">Real estate enthusiast with a keen eye for design and architecture. Searching for unique properties with character and history. Let's discover hidden gems together!</textarea>
								</div>
							</div>
						</div>
						<div>
							<button class="btn btn-primary">Save</button>
							<button class="btn btn-light">Cancel</button>
						</div>
					</div>

					<div class="tab-pane fade" id="password" role="tabpanel" aria-labelledby="password-tab">
						<h3 class="mb-4">Password Settings</h3>
						<div class="row">
							<div class="col-md-6">
								<div class="form-group">
								  	<label>Old password</label>
								  	<input type="password" class="form-control">
								</div>
							</div>
						</div>
						<div class="row">
							<div class="col-md-6">
								<div class="form-group">
								  	<label>New password</label>
								  	<input type="password" class="form-control">
								</div>
							</div>
							<div class="col-md-6">
								<div class="form-group">
								  	<label>Confirm new password</label>
								  	<input type="password" class="form-control">
								</div>
							</div>
						</div>
						<div>
							<button class="btn btn-primary">Save</button>
							<button class="btn btn-light">Cancel</button>
						</div>
					</div>
					

					
					<div class="tab-pane fade" id="notification" role="tabpanel" aria-labelledby="notification-tab">
						<h3 class="mb-4">Notification Settings</h3>
						<div class="form-group">
							<div class="form-check">
								<input class="form-check-input" type="checkbox" value="" id="notification1">
								<label class="form-check-label" for="notification1">
									Receive property updates
								</label>
							</div>
						</div>
						<div class="form-group">
							<div class="form-check">
								<input class="form-check-input" type="checkbox" value="" id="notification2" >
								<label class="form-check-label" for="notification2">
									Receive price change notifications
								</label>
							</div>
						</div>
						<div class="form-group">
							<div class="form-check">
								<input class="form-check-input" type="checkbox" value="" id="notification3" >
								<label class="form-check-label" for="notification3">
									Receive promotion notifications
								</label>
							</div>
						</div>
						<div>
							<button class="btn btn-primary">Save</button>
							<button class="btn btn-light">Cancel</button>
						</div>
					</div>
						<div class="tab-pane fade" id="settings" role="tabpanel" aria-labelledby="settings-tab">
							


					<div class="Other Settings">
						<h3 class="mb-4">Other Settings</h3>
						<div class="form-group">
						<label for="languageSelect">Select Language:</label>
						<select class="form-control" id="languageSelect">
							<option value="en">English</option>
							<option value="es">Sinhala</option>
						</select>
					<br>
					<div class="form-group">
						<label for="propertyAlertSelect">Property Alert Settings:</label>
						<select class="form-control" id="propertyAlertSelect">
						<option value="none">Do Not Receive Alerts</option>
						<option value="weekly">Receive Weekly Alerts</option>
						<option value="daily">Receive Daily Alerts</option>
						<!-- Add more alert options as needed -->
						</select>
					</div>
					<br>
					<div class="form-group">
						<label for="communicationSelect">Preferred Communication Method:</label>
						<select class="form-control" id="communicationSelect">
						  <option value="email">Email</option>
						  <option value="phone">Phone</option>
						  <option value="both">Both Email and Phone</option>
						</select>
					  </div>
							<div>
								<button class="btn btn-primary">Save</button>
								<button class="btn btn-light">Cancel</button>
							</div>
					</div>
				</div>
			</div>
		</div>
	</section>


	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
</body>
</html>


