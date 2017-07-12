@objects
	closeicon xpath .//a[contains(@class,'uk-modal-close')]/i
	searchinput xpath .//input[@id='yas-search-input']
	searchicon xpath .//input[@id='yas-search-input']/following-sibling::i
	
= Main Section =
	closeicon:
			visible
			
	searchinput:
			visible
			
	searchicon:
			visible
			inside searchinput
	
			