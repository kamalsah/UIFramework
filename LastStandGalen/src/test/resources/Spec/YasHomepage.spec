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

	scroll:
     below logo 386px
     below heading 195px
     below description 83px
     centered horizontally on logo 1px
     centered horizontally on heading
     centered horizontally on description 2px

    logo:
     aligned horizontally top menu1
     aligned horizontally top menu2
     right-of menu1 412px
     right-of menu2 262px
     above scroll 386px
     above heading 119px
     above description 231px
     centered horizontally inside scroll 1px
     centered horizontally inside heading 1px
     centered horizontally inside description 1px

    heading:
     right-of menu1 58px
     above scroll 195px
     above description 40px
     below logo 119px
     below menu1 219px
     below menu2 219px
     centered horizontally inside scroll
     centered horizontally on logo 1px
     centered horizontally inside description 2px

    description:
     aligned vertically left menu2 3px
     right-of menu1 2px
     above scroll 83px
     below logo 231px
     below heading 40px
     below menu1 331px
     below menu2 331px
     centered horizontally inside scroll 2px
     centered horizontally on logo 1px
     centered horizontally on heading 2px

    menu1:
     height 100% of menu2/height
     inside partly menu2  150px right
     aligned horizontally top logo
     aligned horizontally all menu2
     left-of logo 412px
     left-of heading 58px
     left-of description 2px
     above scroll 486px
     above heading 219px
     above description 331px

    menu2:
     inside partly menu1  128px left
     aligned horizontally top logo
     aligned horizontally all menu1
     aligned vertically left description 3px
     left-of logo 262px
     above scroll 486px
     above heading 219px
     above description 331px
     
  