$(function(){
	var $registrationForm = $("#frmStudent");
	if($registrationForm.length){
		$registrationForm.validate({
			rules:{
				name:{
					required: true
				},
				email:{
					required: true
				},
				/*phone:{
					required: true
				},*/
				userName:{
					required: true
				},
				password:{
					required: true
				}
			},
			messages:{
					name:{
						required: 'Name must required!'
					},
					email:{
						required: 'Email must required!'
					},
					/*phone:{
						required: 'Phone must be required www'
					},*/
					userName:{
						required: 'User name must be required'
					},
					password:{
						required: 'Password must required!'
					}
			}	
		})
	}
		
})