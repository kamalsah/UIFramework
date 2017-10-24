@@import MiralHeader.spec
@@import MiralFooter.spec
@objects
  header xpath c-header component
  editorialgrid xpath .//div[contains(@class,'component c-editorial-grid')]
  heropanel xpath .//div[contains(@class,'hero-panel component')]
  footer xpath .//div[contains(@class,'footer-container component')]
  
= Home page section =   
   header:
    visible
    
   editorialgrid:
    visible
    below header
    above heropanel
    
   heropanel:
    visible
    below editorialgrid
    above footer
  
   footer:
    visible
    below editorialgrid