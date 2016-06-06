

public class Test {

	
	public void  removingCharacter(){
		// remove all the special characters a part of alpha numeric characters
		String text = "This - word ! has \\ /allot # of % special % characters";
		text = text.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(text);
		  
		// remove all the special characters a part of alpha numeric characters and space
		String text1 = "This - word ! has \\ /allot # of % special % characters";
		text1 = text1.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(text1);
		  
		// remove all the special characters a part of alpha numeric characters, space and hyphen.
		// Note down the blank space and hyphen just before the ]
		String text2 = "This - word ! has \\ /allot # of % special % characters";
		text2 = text2.replaceAll("[^a-zA-Z0-9 -]", "");
		System.out.println(text2);
		  
		  
		// replace two white space in a String with single space.
		String text3 = "This   words with two   spaces";
		text3 = text3.replaceAll("\\s{2,}", " ");
		System.out.println(text3);
		
		//List of match Operation.
		
		String text4 = "petter 2";
		String firstName = "^[a-zA-Z ]{3,40}$";
		if(text4.matches(firstName)) {
		    System.out.println("pass - true");
		}else {
		    System.out.println("fail - false");
		}
		
		
		
		
		
		
		       /*strongPassword = ^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[\\W]).{6,20}$
				goodPassword = ^(?=.*\\W)(?=.*[\\w]).{6,20}$
				poorPassword = ^[\\w\\W]{6,20}$
				firstName = ^[a-zA-Z0-9 ]{3,40}$
				middleName = ^\.{0}|[a-zA-Z]{3,15}$
				middleNameIfAny = ^[a-zA-Z]{3,15}$
				lastName = ^\.{0}|[a-zA-Z]{3,15}$
				designation = ^[a-zA-Z0-9 ]{3,40}$
				designationIfAny = ^[a-zA-Z0-9 ]{3,40}$
				emailId = ^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,4})$
				emailIdIfAny = ^\.{0}|([_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,4}))$
				deptName = ^[a-zA-Z0-9 ]{3,50}$
				deptNameIfAny = ^[a-zA-Z0-9 ]{3,50}$
				deptHeadName = ^[a-zA-Z0-9. ]{3,50}$
				contactPersonName = ^[a-zA-Z ]{5,20}$
				phoneNumber = ^[0-9 ,()+-]{10,40}$
				phoneNumberIfAny = ^\.{0}|([0-9 ,()+-]{10,40})$
				faxNumber = ^[0-9 ()+-]{10,18}$
				faxNumberIfAny = ^\.{0}|([0-9 ()+-]{10,18})$
				mobileNumber = ^[0-9 ()+-]{10,18}$
				mobileNumberIfAny = ^\.{0}|([0-9 ()+-]{10,18})$
				webUrl = ^http[s]?://[-a-zA-Z0-9_.:]+[-a-zA-Z0-9_:@&?=+,.!/~*'%$]*$
				webUrlIfAny = ^\.{0}|(http[s]?://[-a-zA-Z0-9_.:]+[-a-zA-Z0-9_:@&?=+,.!/~*'%$]*)$
				userName = ^\.{0}|[a-zA-Z ]{5,20}$
				userPwd = ^[a-zA-Z ]{5,20}$
				constValue =  ^\.*$
				groupName =  ^[a-zA-Z0-9_:@&?=+,.!/~*'%$ ]{5,20}$
				description =  ^[a-zA-Z0-9_:@&?=+,.!/~*'%$ ]{5,20}$
				groupOwner =  ^[a-zA-Z0-9_:@&?=+,.!/~*'%$ ]{5,20}$
				roleName = ^[a-zA-Z0-9_:@&?=+,.!/~*'%$ ]{5,20}$
				message = ^[a-zA-Z0-9_:@&?=+,.!/~*'%$ ]{5,20}$
				fullName = ^[a-zA-Z0-9_:@&?=+,.!/~*'%$ ]{5,20}$
				orgName = ^\.{0}|\.{3,150}$
				city = ^\.*$
				cityOther = ^\.{0}|\.*$
				address = ^\.{0}|\.*$
				securityImage = ^\.{0}|\.*$
				dbUserName = ^[a-zA-Z0-9_:@&?=+,.!/~*'%$]{3,8}$
				dbPassword = ^\.{0}?[a-zA-Z0-9_:@&?=+,.!/~*'%$ ]{3,8}$
				dbName = ^[a-zA-Z0-9_:@&?=+,.!/~*'%$]{3,8}$=======
				strongPassword = ^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[\\W]).{6,20}$
				goodPassword = ^(?=.*\\W)(?=.*[\\w]).{6,20}$
				poorPassword = ^[\\w\\W]{6,20}$
				firstName = ^[a-zA-Z ]{3,30}$
				middleName = ^\.{0}|[a-zA-Z]{3,15}$
				lastName = ^\.{0}|[a-zA-Z]{3,15}$
				designation = ^[a-zA-Z0-9 ]{3,40}$
				emailId = ^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,4})$
				emailIdIfAny = ^\.{0}|([_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,4}))$
				deptName = ^[a-zA-Z0-9 ]{3,50}$
				deptHeadName = ^[a-zA-Z0-9. ]{3,50}$
				contactPersonName = ^[a-zA-Z ]{3,20}$
				phoneNumber = ^[0-9 ,()+-]{6,14}$
				phoneNumberIfAny = ^\.{0}|[0-9 ,()+-]{6,14}$
				faxNumber = ^\.{0}|[0-9 ()+-]{10,18}$
				mobileNumber = ^\.{0}|[0-9 ,()+-]{6,14}$
				webUrl = ^\.{0}|http[s]?://[-a-zA-Z0-9_.:]+[-a-zA-Z0-9_:@&?=+,.!/~*'%$]*$
				userName = ^[a-zA-Z ]{5,20}$
				userPwd = ^[a-zA-Z ]{5,20}$
				constValue =  ^\.*$
				groupName =  ^[a-zA-Z0-9 ]{3,30}$
				description = ^\.*$
				groupOwner =  ^[a-zA-Z ]{3,30}$
				roleName = ^[a-zA-Z0-9_:@&?=+,.!/~*'%$ ]{3,20}$
				message = ^[a-zA-Z0-9_:@&?=+,.!/~*'%$ ]{4,20}$
				fullName = ^[a-zA-Z0-9_:@&?=+,.!/~*'%$ ]{5,20}$
				orgName = ^\.{0}|\.{3,150}$
				city = ^\.*$
				cityOther = ^\.{0}|\.*$
				address = ^\.{0}|\.*$
				securityImage = ^\.{0}|\.*$
				dbUserName = ^[a-zA-Z0-9_:@&?=+,.!/~*'%$]{3,8}$
				dbPassword = ^\.{0}?[a-zA-Z0-9_:@&?=+,.!/~*'%$ ]{3,8}$
				dbName = ^[a-zA-Z0-9_:@&?=+,.!/~*'%$]{3,8}$
				contactNumber = ^[0-9 ,()+-]{6,14}$
				jobName =^[a-zA-Z.]{3,30}$
				schedule = ^\.{0}|\.*$
				remarks = ^\.{0}|\.*$*/
		
		
		
		
	}
	
	
	public static void main(String[] args) {
		String text = "This - word ! has \\ /allot # of % special % characters";
		String  remove_char = text.replaceAll("[^a-zA-Z0-9 ]", "");
		System.out.println(remove_char);
		}
	
}
