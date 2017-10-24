@objects
   Hero_container xpath .//div[contains(@class,'hero-panel--content')]
   Hero_short_title xpath .//div[contains(@class,'hero-panel--content')]/descendant::p[contains(@class,'short-title')]
   Hero_title xpath .//div[contains(@class,'hero-panel--content')]/descendant::h2[contains(@class,'hero-panel--title')]
   Hero_bodycopy xpath .//div[contains(@class,'hero-panel--content')]/descendant::p[contains(@class,'hero-panel--text')]
  
= Hero panel with out image section =   
   viewport:
    width 100% of screen/width
    width 100% of Hero_container/width
    aligned horizontally top screen
    aligned vertically all screen
    aligned vertically all Hero_container
    centered horizontally on Hero_title 1px
    centered horizontally on Hero_short_title 1px
    centered horizontally on Hero_bodycopy 1px

   screen:
    width 100% of viewport/width
    width 100% of Hero_container/width
    inside partly viewport 
    aligned horizontally top viewport
    aligned vertically all viewport
    aligned vertically all Hero_container
    centered horizontally on Hero_title 1px
    centered horizontally on Hero_short_title 1px
    centered horizontally on Hero_bodycopy 1px

   Hero_title:
    width 100% of Hero_bodycopy/width
    inside viewport  190px top, 22px left, 23px right, 346px bottom
    inside screen  190px top, 22px left, 23px right, 3251px bottom
    inside Hero_container  75px top, 22px left, 23px right, 31px bottom
    inside partly Hero_bodycopy  31px bottom
    aligned vertically all Hero_short_title
    aligned vertically all Hero_bodycopy
    above Hero_bodycopy 0px
    below Hero_short_title 20px
    centered horizontally inside viewport 1px
    centered horizontally inside screen 1px
    centered horizontally inside Hero_container 1px

   Hero_short_title:
    width 100% of Hero_bodycopy/width
    inside viewport  115px top, 22px left, 23px right, 466px bottom
    inside screen  115px top, 22px left, 23px right, 3371px bottom
    inside Hero_container  22px left, 23px right, 151px bottom
    aligned horizontally top Hero_container
    aligned vertically all Hero_title
    aligned vertically all Hero_bodycopy
    above Hero_title 20px
    above Hero_bodycopy 120px
    centered horizontally inside viewport 1px
    centered horizontally inside screen 1px
    centered horizontally inside Hero_container 1px

   Hero_container:
    width 100% of viewport/width
    width 100% of screen/width
    inside partly viewport  115px top, 315px bottom
    inside partly screen  115px top, 3220px bottom
    aligned horizontally top Hero_short_title
    aligned horizontally bottom Hero_bodycopy
    aligned vertically all viewport
    aligned vertically all screen
    centered horizontally on Hero_title 1px
    centered horizontally on Hero_short_title 1px
    centered horizontally on Hero_bodycopy 1px

   Hero_bodycopy:
    width 100% of Hero_title/width
    width 100% of Hero_short_title/width
    inside viewport  290px top, 22px left, 23px right, 315px bottom
    inside screen  290px top, 22px left, 23px right, 3220px bottom
    inside partly Hero_container  175px top, 22px left, 23px right
    aligned horizontally bottom Hero_container
    aligned vertically all Hero_title
    aligned vertically all Hero_short_title
    below Hero_title 0px
    below Hero_short_title 120px
    centered horizontally inside viewport 1px
    centered horizontally inside screen 1px
    centered horizontally inside Hero_container 1px