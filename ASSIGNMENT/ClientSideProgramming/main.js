const form = document.getElementById('form');
const username = document.getElementById('username');
const email = document.getElementById('email');
const password = document.getElementById('password');
const password2 = document.getElementById('password2');
const genders = document.getElementsByName("gender");

form.addEventListener('submit', e => {
	e.preventDefault();
	clearErrors();
	checkInputs();
});

function clearErrors(){

    errors = document.getElementsByClassName('formerror');
    for(let item of errors)
    {
        item.innerHTML = "";
    }


}
function checkInputs() {
	// trim to remove the whitespaces
	const usernameValue = username.value.trim();
	const emailValue = email.value.trim();
	const passwordValue = password.value.trim();
	const password2Value = password2.value.trim();
	
	if(usernameValue === '') {
		setErrorFor("username1", 'Username cannot be blank');
	} 
	
	if(emailValue === '') {
		setErrorFor("email1", 'Email cannot be blank');
	} else if (!isEmail(emailValue)) {
		setErrorFor("email1", 'Not a valid email');
	} 
	
	if ((genders[0].checked == false)&&(genders[1].checked == false)) {
		setErrorFor("gender1", 'Please select gender');
	}

	if(passwordValue === '') {
		setErrorFor("passwordErr1", 'Password cannot be blank');
	} 
	
	if(password2Value === '') {
		setErrorFor("passwordErr2", 'Password2 cannot be blank');
	} else if(passwordValue !== password2Value) {
		setErrorFor("passwordErr2", 'Passwords does not match');
	}
}

function setErrorFor(input, message) {
	element = document.getElementById(input);
	element.getElementsByClassName('formerror')[0].innerHTML = message;
}
	
function isEmail(email) {
	return /^(([^<>()\[\]\\.,;:\s@"]+(\.[^<>()\[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/.test(email);
}






