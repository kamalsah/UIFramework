@objects
    Editorialgrid_container xpath .//div[contains(@class,'component c-editorial-grid')]
    Editorialgrid_shorttitle xpath .//div[contains(@class,'component c-editorial-grid')]/descendant::p[contains(@class,'short-title')]
    Editorialgrid_bodycopy xpath .//div[contains(@class,'component c-editorial-grid')]/descendant::p[contains(@class,'body-copy-medium')]
    Editorialgrid_list_item xpath .//div[contains(@class,'component c-editorial-grid')]/descendant::ul[contains(@class,'c-editorial-grid--items')]/li
    Editorialgrid_list_item_svg xpath .//div[contains(@class,'editorial-item--svg')]
    Editorialgrid_list_item_bodycopy xpath .//div[contains(@class,'editorial-item--bodycopy')]
    Editorialgrid_list_cta xpath .//div[contains(@class,'component c-editorial-grid')]/descendant::div[contains(@class,'c-editorial-grid--cta btn btn-hero-cta')]/a
    
= Editorial Grid =    
  screen:
    width 100% of viewport/width
    width 100% of Editorialgrid_container/width
    inside partly viewport 
    aligned horizontally top viewport
    aligned vertically all viewport
    aligned vertically all Editorialgrid_container
    centered horizontally on Editorialgrid_shorttitle 1px
    centered horizontally on Editorialgrid_list_cta
    centered horizontally on Editorialgrid_bodycopy 1px

  viewport:
    width 100% of screen/width
    width 100% of Editorialgrid_container/width
    inside partly screen  2131px bottom
    aligned horizontally top screen
    aligned vertically all screen
    aligned vertically all Editorialgrid_container
    above Editorialgrid_shorttitle 925px
    above Editorialgrid_list_item_svg 1246px
    above Editorialgrid_list_item_bodycopy 1376px
    above Editorialgrid_list_item 1246px
    above Editorialgrid_list_cta 1514px
    above Editorialgrid_container 835px
    above Editorialgrid_bodycopy 1102px
    centered horizontally on Editorialgrid_shorttitle 1px
    centered horizontally on Editorialgrid_list_cta
    centered horizontally on Editorialgrid_bodycopy 1px

  Editorialgrid_shorttitle:
    inside screen  1561px top, 22px left, 23px right, 1181px bottom
    inside Editorialgrid_container  90px top, 22px left, 23px right, 622px bottom
    above Editorialgrid_list_item_svg 296px
    above Editorialgrid_list_item_bodycopy 426px
    above Editorialgrid_list_item 296px
    above Editorialgrid_list_cta 564px
    above Editorialgrid_bodycopy 152px
    below viewport 925px
    centered horizontally inside screen 1px
    centered horizontally inside viewport 1px
    centered horizontally on Editorialgrid_list_cta 1px
    centered horizontally inside Editorialgrid_container 1px
    centered horizontally on Editorialgrid_bodycopy

  Editorialgrid_list_item_svg:
    inside screen  1882px top, 187px left, 1046px right, 785px bottom
    inside Editorialgrid_list_item  46px left, 45px right, 120px bottom
    inside Editorialgrid_container  411px top, 187px left, 1046px right, 226px bottom
    aligned horizontally top Editorialgrid_list_item
    left-of Editorialgrid_list_cta 250px
    above Editorialgrid_list_item_bodycopy 30px
    above Editorialgrid_list_cta 168px
    below viewport 1246px
    below Editorialgrid_shorttitle 296px
    below Editorialgrid_bodycopy 60px
    centered horizontally inside Editorialgrid_list_item_bodycopy 1px
    centered horizontally inside Editorialgrid_list_item 1px

  Editorialgrid_list_item_bodycopy:
    inside screen  2012px top, 141px left, 1001px right, 695px bottom
    inside Editorialgrid_container  541px top, 141px left, 1001px right, 136px bottom
    inside partly Editorialgrid_list_item  130px top, 30px bottom
    aligned vertically all Editorialgrid_list_item
    aligned vertically left Editorialgrid_bodycopy
    left-of Editorialgrid_list_cta 205px
    above Editorialgrid_list_cta 78px
    below viewport 1376px
    below Editorialgrid_shorttitle 426px
    below Editorialgrid_list_item_svg 30px
    below Editorialgrid_bodycopy 190px
    centered horizontally on Editorialgrid_list_item_svg 1px

  Editorialgrid_list_item:
    width 100% of Editorialgrid_list_item_bodycopy/width
    inside screen  1882px top, 141px left, 1001px right, 665px bottom
    inside Editorialgrid_container  411px top, 141px left, 1001px right, 106px bottom
    aligned horizontally top Editorialgrid_list_item_svg
    aligned vertically all Editorialgrid_list_item_bodycopy
    aligned vertically left Editorialgrid_bodycopy
    left-of Editorialgrid_list_cta 205px
    above Editorialgrid_list_cta 48px
    below viewport 1246px
    below Editorialgrid_shorttitle 296px
    below Editorialgrid_bodycopy 60px
    centered horizontally on Editorialgrid_list_item_svg 1px

  Editorialgrid_list_cta:
    inside screen  2150px top, 537px left, 537px right, 559px bottom
    inside partly Editorialgrid_container  679px top, 537px left, 537px right
    aligned horizontally bottom Editorialgrid_container
    right-of Editorialgrid_list_item_svg 250px
    right-of Editorialgrid_list_item_bodycopy 205px
    right-of Editorialgrid_list_item 205px
    below viewport 1514px
    below Editorialgrid_shorttitle 564px
    below Editorialgrid_list_item_svg 168px
    below Editorialgrid_list_item_bodycopy 78px
    below Editorialgrid_list_item 48px
    below Editorialgrid_bodycopy 328px
    centered horizontally inside screen
    centered horizontally inside viewport
    centered horizontally inside Editorialgrid_shorttitle 1px
    centered horizontally inside Editorialgrid_container
    centered horizontally inside Editorialgrid_bodycopy 1px

  Editorialgrid_container:
    width 100% of screen/width
    width 100% of viewport/width
    inside partly screen  1471px top, 559px bottom
    aligned horizontally bottom Editorialgrid_list_cta
    aligned vertically all screen
    aligned vertically all viewport
    below viewport 835px
    centered horizontally on Editorialgrid_shorttitle 1px
    centered horizontally on Editorialgrid_list_cta
    centered horizontally on Editorialgrid_bodycopy 1px

  Editorialgrid_bodycopy:
    inside screen  1738px top, 141px left, 142px right, 945px bottom
    inside Editorialgrid_container  267px top, 141px left, 142px right, 386px bottom
    aligned vertically left Editorialgrid_list_item_bodycopy
    aligned vertically left Editorialgrid_list_item
    above Editorialgrid_list_item_svg 60px
    above Editorialgrid_list_item_bodycopy 190px
    above Editorialgrid_list_item 60px
    above Editorialgrid_list_cta 328px
    below viewport 1102px
    below Editorialgrid_shorttitle 152px
    centered horizontally inside screen 1px
    centered horizontally inside viewport 1px
    centered horizontally inside Editorialgrid_shorttitle
    centered horizontally on Editorialgrid_list_cta 1px
    centered horizontally inside Editorialgrid_container 1px