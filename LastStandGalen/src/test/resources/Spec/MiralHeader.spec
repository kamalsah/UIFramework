@objects
	Header_logo xpath .//div[@class='c-header-top-logo']/div/img
	Header_nav  xpath .//ul[@class='nav--wrapper']
	Header_title xpath .//a[contains(text(),'Book Ticket')]
	Header_search xpath .//a[@class='c-header-top-icon search']/img
	Header_cart xpath .//a[@class='c-header-top-icon cart']/img
	Header_profile xpath .//a[@class='c-header-top-icon profile']
	Header_langselector xpath .//div[@class='selected-option collapse']
	Header_prmlink xpath .//a[@class='link' and text()='THEME PARKS']
	Header_container xpath .//div[@class='c-header component']
	Header_menu-* xpath .//ul[@class='nav--wrapper']/li
	Hamburger_menu_mobile xpath .//div[contains(@class,'c-header component')]/descendant::div[contains(@class,'c-header-top-icon hamburger')]
	Header_profile_mobile xpath.//div[contains(@class,'c-header component')]/div[contains(@class,'c-header-top')]/div[1]
	Header_bookTicket_mobile xpath .//div[contains(@class,'header-bottom')]/div[contains(@class,'btn btn-secondary')]
	Header_cart_mobile xpath .//div[contains(@class,'header-bottom')]/a[contains(@class,'c-header-top-icon cart')]
	Header_langselector_mobile xpath .//div[contains(@class,'header-bottom-lang-switcher')]/descendant::div[contains(@class,'selected-option collapse')]
	
=header section=   
    
  Header_container:
    width 100% of screen/width
    width 100% of viewport/width
	aligned horizontally bottom Header_menu-1
    aligned horizontally bottom Header_nav
    centered vertically on Header_langselector
    centered vertically on Header_prmlink 
    centered vertically on Header_profile 

  Header_langselector:
    inside Header_container  
    inside screen 
    inside viewport 
    right-of Header_logo 
    right-of Header_menu-1 
    right-of Header_nav 
    right-of Header_prmlink 
    right-of Header_profile 
    centered vertically inside Header_container
    centered vertically inside Header_prmlink 
    centered vertically inside Header_profile 

  Header_logo:
    inside Header_container  
    inside screen  
    inside viewport  
    inside partly Header_menu-1  
    inside partly Header_nav  
    left-of Header_langselector 
    left-of Header_menu-1 
    left-of Header_nav 
    left-of Header_prmlink 
    left-of Header_profile 
     
  Header_nav:
    height 100% of Header_menu-1/height
    inside screen  
    inside viewport 
    inside partly Header_container 
    inside partly Header_menu-1 
    aligned horizontally bottom Header_container
    left-of Header_langselector 
    left-of Header_profile 
    right-of Header_logo 

  Header_prmlink:
    inside Header_container
    inside Header_menu-1
    inside Header_nav 
    inside screen
    inside viewport
    left-of Header_langselector 
    left-of Header_profile 
    right-of Header_logo 
   

  Header_profile:
    inside Header_container
    inside screen
    inside viewport
    aligned horizontally top Header_menu-1 2px
    aligned horizontally top Header_nav 2px
    aligned horizontally top Header_prmlink 2px
    left-of Header_langselector 
    right-of Header_logo 
    right-of Header_menu-1 
    right-of Header_nav 
    right-of Header_prmlink 
  
  screen:
    width 100% of Header_container/width
    width 100% of viewport/width
    inside partly viewport 
    aligned horizontally top viewport
    aligned vertically all Header_container
    aligned vertically all viewport

  viewport:
    width 100% of Header_container/width
    width 100% of screen/width
    inside partly screen  
    aligned horizontally top screen
    aligned vertically all Header_container
    aligned vertically all screen
        
    
       
       
       