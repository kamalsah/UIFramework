@objects
	heading xpath //div/h1
	description xpath //div/p
	navcontainer xpath //div[@class='uk-container mod-container-fluid']
	menu1 xpath //a[@class='uk-parent-heading' and text()='Discover ']
	menu2 xpath //a[@class='uk-parent-heading' and text()='Attractions ']
	logo xpath .//a[@style='display: block;']/child::img[@class='uk-margin uk-margin-remove']
	scroll	 xpath .//a[@class='smooth-down uk-animation-reverse element']
	contactus xpath //a[@title='Contact Us']
	FAQ xpath //a[@title='FAQ']
	Careers xpath //a[@title='Careers']
	FooterContainer xpath //div[@class='uk-container uk-container-center']
	FooterSocialContainer xpath //ul[@class='uk-subnav uk-flex-center uk-margin-large-top uk-margin-bottom-remove']
	SocialEmail xpath //a[@title='email']
	SocialFacebook xpath //a[@title='facebook']
	SocialTwitter xpath //a[@title='twitter']
	SocialInstagram xpath //a[@title='instagram']
	SocialYoutube xpath //a[@title='youtube']
	SubnavContainer xpath //ul[@class='uk-subnav uk-flex-center uk-margin']
	SubnavApple xpath //img[@alt='Apple Appstore']
	SubnavGooglePlay xpath //img[@alt='Google Play']
	FooterYasLogo xpath //img[@alt='Yas Island Logo']
	FooterH3 xpath //h3[@class='uk-h3']
	LogoEthid xpath //img[@title='Etihad Airways']
	LogoAbuDhabi xpath //img[@title='Visit Abu Dhabi']
		
= Main Section =
	heading:
		visible
		#centered vertically inside viewport
		#text is "It's time to dream"
		
	description:
		visible
		below heading
		#text is "Invigorate the senses, live out your dreams and make memories to last a lifetime at a destination like no other. Experience out of this world attractions, pristine beaches and the warmth of Emirati hospitality on an extraordinary island in the sparkling Arabian Gulf. Welcome to the time of your life."
	
	logo:
		visible
		above heading
		#aligned horizontally centered inside viewport
		
	scroll:
		visible
		below description
	
	contactus:
		visible
		

