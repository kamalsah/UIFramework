@objects
    Heropanel_container xpath .//div[contains(@class,'hero-panel component')]
    Heropanel_shorttitle xpath .//div[contains(@class,'hero-panel--content')]/*/p[contains(@class,'short-title')]
    Heropanel_title xpath .//h2[contains(@class,'hero-panel--title')]/p
    Heropanel_tile_list xpath .//ul[contains(@class,'list-wrapper')]/li
    Heropanel_copy_container xpath .//div[contains(@class,'copyContainer')]
    Heropanel_cta xpath .//div[contains(@class,'btn btn-hero-cta')]/a
    
= hero panel =
  Heropanel_copy_container:
    width 100% of Heropanel_title/width
    width 100% of Heropanel_shorttitle/width
    inside Heropanel_container  1152px top, 22px left, 23px right, 136px bottom
    aligned vertically all Heropanel_title
    aligned vertically all Heropanel_shorttitle
    above Heropanel_cta 78px
    below Heropanel_title 997px
    below Heropanel_tile_list 503px
    below Heropanel_shorttitle 1097px
    centered horizontally inside viewport 1px
    centered horizontally inside Heropanel_container 1px
    centered horizontally inside screen 1px
    centered horizontally on Heropanel_cta 1px

  viewport:
    width 100% of Heropanel_container/width
    width 100% of screen/width
    inside partly Heropanel_container  815px bottom
    inside partly screen  2131px bottom
    aligned horizontally top screen
    aligned vertically all Heropanel_container
    aligned vertically all screen
    above Heropanel_copy_container 631px
    above Heropanel_cta 757px
    centered horizontally on Heropanel_copy_container 1px
    centered horizontally on Heropanel_title 1px
    centered horizontally on Heropanel_cta
    centered horizontally on Heropanel_shorttitle 1px

  Heropanel_container:
    width 100% of viewport/width
    width 100% of screen/width
    inside partly viewport  115px top
    inside partly screen  115px top, 1316px bottom
    aligned horizontally bottom Heropanel_cta
    aligned horizontally top Heropanel_shorttitle
    aligned vertically all viewport
    aligned vertically all screen
    centered horizontally on Heropanel_copy_container 1px
    centered horizontally on Heropanel_title 1px
    centered horizontally on Heropanel_cta
    centered horizontally on Heropanel_shorttitle 1px

  screen:
    width 100% of viewport/width
    width 100% of Heropanel_container/width
    inside partly viewport 
    aligned horizontally top viewport
    aligned vertically all viewport
    aligned vertically all Heropanel_container
    centered horizontally on Heropanel_copy_container 1px
    centered horizontally on Heropanel_title 1px
    centered horizontally on Heropanel_cta
    centered horizontally on Heropanel_shorttitle 1px

  Heropanel_title:
    width 100% of Heropanel_copy_container/width
    width 100% of Heropanel_shorttitle/width
    inside viewport  190px top, 22px left, 23px right, 366px bottom
    inside Heropanel_container  75px top, 22px left, 23px right, 1181px bottom
    inside screen  190px top, 22px left, 23px right, 2497px bottom
    aligned vertically all Heropanel_copy_container
    aligned vertically all Heropanel_shorttitle
    above Heropanel_copy_container 997px
    above Heropanel_tile_list 128px
    above Heropanel_cta 1123px
    below Heropanel_shorttitle 20px
    centered horizontally inside viewport 1px
    centered horizontally inside Heropanel_container 1px
    centered horizontally inside screen 1px
    centered horizontally on Heropanel_cta 1px

  Heropanel_tile_list:
    inside Heropanel_container  283px top, 150px left, 943px right, 687px bottom
    inside screen  398px top, 150px left, 943px right, 2003px bottom
    inside partly viewport  398px top, 150px left, 943px right
    left-of Heropanel_cta 147px
    above Heropanel_copy_container 503px
    above Heropanel_cta 629px
    below Heropanel_title 128px
    below Heropanel_shorttitle 228px

  Heropanel_cta:
    inside screen  1393px top, 537px left, 537px right, 1316px bottom
    inside partly Heropanel_container  1278px top, 537px left, 537px right
    aligned horizontally bottom Heropanel_container
    right-of Heropanel_tile_list 147px
    below Heropanel_copy_container 78px
    below Heropanel_title 1123px
    below Heropanel_tile_list 629px
    below Heropanel_shorttitle 1223px
    centered horizontally inside Heropanel_copy_container 1px
    centered horizontally inside Heropanel_container
    centered horizontally inside Heropanel_title 1px
    centered horizontally inside Heropanel_shorttitle 1px

  Heropanel_shorttitle:
    width 100% of Heropanel_copy_container/width
    width 100% of Heropanel_title/width
    inside viewport  115px top, 22px left, 23px right, 466px bottom
    inside Heropanel_container  22px left, 23px right, 1281px bottom
    inside screen  115px top, 22px left, 23px right, 2597px bottom
    aligned horizontally top Heropanel_container
    aligned vertically all Heropanel_copy_container
    aligned vertically all Heropanel_title
    above Heropanel_copy_container 1097px
    above Heropanel_title 20px
    above Heropanel_tile_list 228px
    above Heropanel_cta 1223px
    centered horizontally inside viewport 1px
    centered horizontally inside Heropanel_container 1px
    centered horizontally inside screen 1px
    centered horizontally on Heropanel_cta 1px