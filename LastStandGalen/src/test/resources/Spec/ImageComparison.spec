@objects
@script

	logo xpath .//a[@style='display: block;']/child::img[@class='uk-margin uk-margin-remove']

	
= Main Section =

${window.scrollBy(0, 400);};
	    
	logo:
		visible
		image file en-logo.png, error 13%
		
 