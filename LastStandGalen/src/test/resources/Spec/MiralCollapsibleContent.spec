@objects
   Collapsible_content xpath .//div[contains(@class,'component c-collapsible-content')]
   Collapsible_content_container xpath .//dl[contains(@class,'collapsible-content-container')]
   Collapsible_content_short_title xpath .//dl[contains(@class,'collapsible-content-container')]/descendant::dt[contains(@class,'c-collapsible-content--title short-title-large')]
   Collapsible_content_bodycopy xpath .//dl[contains(@class,'collapsible-content-container')]/descendant::dd[contains(@class,'c-collapsible-content--bodycopy body-copy-large')]
   
= collapsible content =
  viewport:
    width 100% of screen/width
    width 100% of Collapsible_content/width
    inside partly screen  2905px bottom
    inside partly Collapsible_content  1871px bottom
    aligned horizontally top screen
    aligned vertically all screen
    aligned vertically all Collapsible_content
    centered horizontally on Collapsible_content_container 1px

  screen:
    width 100% of viewport/width
    width 100% of Collapsible_content/width
    inside partly viewport 
    aligned horizontally top viewport
    aligned vertically all viewport
    aligned vertically all Collapsible_content
    centered horizontally on Collapsible_content_container 1px

  Collapsible_content_short_title:
    height 100% of Collapsible_content_bodycopy/height
    inside screen  571px top, 141px left, 893px right, 2749px bottom
    inside Collapsible_content_container  119px left, 870px right, 1715px bottom
    inside Collapsible_content  141px left, 893px right, 1715px bottom
    inside partly viewport  571px top, 141px left, 893px right
    aligned horizontally top Collapsible_content_container
    aligned horizontally all Collapsible_content_bodycopy
    aligned horizontally top Collapsible_content
    left-of Collapsible_content_bodycopy 23px

  Collapsible_content_container:
    height 100% of Collapsible_content/height
    inside screen  571px top, 22px left, 23px right, 1034px bottom
    inside partly viewport  571px top, 22px left, 23px right
    inside partly Collapsible_content  22px left, 23px right
    aligned horizontally top Collapsible_content_short_title
    aligned horizontally top Collapsible_content_bodycopy
    aligned horizontally all Collapsible_content
    centered horizontally inside viewport 1px
    centered horizontally inside screen 1px
    centered horizontally inside Collapsible_content 1px

  Collapsible_content_bodycopy:
    height 100% of Collapsible_content_short_title/height
    inside screen  571px top, 463px left, 142px right, 2749px bottom
    inside Collapsible_content_container  441px left, 119px right, 1715px bottom
    inside Collapsible_content  463px left, 142px right, 1715px bottom
    inside partly viewport  571px top, 463px left, 142px right
    aligned horizontally all Collapsible_content_short_title
    aligned horizontally top Collapsible_content_container
    aligned horizontally top Collapsible_content
    right-of Collapsible_content_short_title 23px

  Collapsible_content:
    width 100% of viewport/width
    width 100% of screen/width
    height 100% of Collapsible_content_container/height
    inside partly viewport  571px top
    inside partly screen  571px top, 1034px bottom
    aligned horizontally top Collapsible_content_short_title
    aligned horizontally all Collapsible_content_container
    aligned horizontally top Collapsible_content_bodycopy
    aligned vertically all viewport
    aligned vertically all screen
    centered horizontally on Collapsible_content_container 1px   
   