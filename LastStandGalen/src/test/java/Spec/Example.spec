@objects

	#header-logo #header-logo
	header xpath .//*[@id='header-logo']
	header-text #header h1
	heading xpath .//*[@id='welcome-page']/h1
	description xpath .//*[@id='welcome-page']/p[1]
	
	
= header =
	header:
		left-of header-text 22 px
		
= main =
	heading
 		above: header 5px to 10px