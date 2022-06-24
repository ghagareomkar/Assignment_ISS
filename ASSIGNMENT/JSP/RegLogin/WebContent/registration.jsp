<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta http-equiv="X-UA-Compatible" content="ie=edge">


<!-- Font Icon -->
<link rel="stylesheet"
	href="fonts/material-icon/css/material-design-iconic-font.min.css">

<!-- Main css -->
<link rel="stylesheet" href="css/style.css">
</head>
<body>
<input type="hidden" id="status" value="<%= request.getAttribute("status") %>">

		<!-- Sign up form -->
		<section class="signup">
			<div class="container" style="padding-right:0px;">
				<div class="signup-content" style="margin-left:150px">
					<div class="signup-form">
						<h2 class="form-title">Sign up</h2>
					
						<form onsubmit="return validate()" method="post" action="register" class="register-form"
							id="register-form">
							<div class="form-group">
								<label for="name"><i
									class="zmdi zmdi-account material-icons-name"></i></label> <input
									type="text" name="name" id="name" placeholder="Your Name" />
									
							</div>
							<div class="form-group">
								<label for="email"><i class="zmdi zmdi-email"></i></label> <input
									type="email" name="email" id="email" placeholder="Your Email" />
							</div>
							<div class="form-group">
								<label for="pass"><i class="zmdi zmdi-lock"></i></label> <input
									type="password" name="pass" id="pass" placeholder="Password" />
							</div>
							<div class="form-group">
								<label for="re-pass"><i class="zmdi zmdi-lock-outline"></i></label>
								<input type="password" name="re_pass" id="re_pass"
									placeholder="Repeat your password" />
							</div>
							<div class="form-group">
								<label for="contact"><i class="zmdi zmdi-lock-outline"></i></label>
								<input type="text" name="contact" id="contact"
									placeholder="Contact no" />
							</div>
							
							<div class="form-group form-button">
								<input type="submit" name="signup" id="signup"
									class="form-submit" value="Register" style="margin-left:80px"/>
							</div>
						</form>
						<div class="signup-image">
						
						<a href="login.jsp" class="signup-image-link">SignIn instead</a>
					</div>
					</div>
					
				</div>
			</div>
		</section>


	</div>
	<!-- JS -->
	<script src="vendor/jquery/jquery.min.js"></script>
	<script src="js/main.js"></script>
	<script src="https://unpkg.com/sweetalert/dist/sweetalert.min.js"></script>
	<link rel="stylesheet" href="alert/dist/sweetalert.css">
<script type="text/javascript">
	var status =  document.getElementById("status").value;
	if(status=="success"){
		swal("Congrats","Account created successfully","success");
	}
	
	function validate(){
		var name =document.getElementById("name").value;
		var email =document.getElementById("email").value;
		var atposition=email.indexOf("@");  
		var dotposition=email.lastIndexOf("."); 
		var pass =document.getElementById("pass").value;
		var repass =document.getElementById("re_pass").value;
		var contact =document.getElementById("contact").value;
		
		if(name==""){
			alert("Name must be filled out");
			return false;
		}
		else if(atposition<1 || dotposition<atposition+2 || (dotposition+2)>=email.length){
			alert("Please enter a valid e-mail address");
			return false;
		}
		else if(pass.length<8){
			alert("Password must be at least 8 characters long.");
			return false;
		}
		else if(pass!=repass){
			alert("password must be same!");  
			return false;
		}
		else if(contact.length<10){
			alert("Invalid contact number");
			return false;
		}
		return true;
	
	}
	
</script>

</body>

</html>