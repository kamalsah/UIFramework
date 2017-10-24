@objects
   Text_with_CTA xpath .//div[contains(@class,'component c-text-with-cta text-with-cta-bg')]
   Text_with_CTA_heading xpath .//div[contains(@class,'component c-text-with-cta text-with-cta-bg')]/descendant::h3[contains(@class,'heading-2')]
   Text_with_CTA_bodycopy xpath .//div[contains(@class,'component c-text-with-cta text-with-cta-bg')]/descendant::div[contains(@class,'body-copy')]
   Text_with_CTA_primary_CTA xpath .//div[contains(@class,'component c-text-with-cta text-with-cta-bg')]/descendant::div[contains(@class,'btn btn-primary btn-primary-inverted')]/a
   Text_with_CTA_secondary_CTA xpath .//div[contains(@class,'component c-text-with-cta text-with-cta-bg')]/descendant::div[contains(@class,'btn btn-secondary btn-secondary-inverted')]/a
   
= Text with CTA section =
  Text_with_CTA:
    width 100% of screen/width
    width 100% of viewport/width
    inside partly screen  2557px top, 509px bottom
    aligned vertically all screen
    aligned vertically all viewport
    below viewport 1921px
    centered horizontally on Text_with_CTA_bodycopy 1px
    centered horizontally on Text_with_CTA_heading 1px

  Text_with_CTA_bodycopy:
    width 100% of Text_with_CTA_heading/width
    inside Text_with_CTA  262px top, 135px left, 136px right, 188px bottom
    inside screen  2819px top, 135px left, 136px right, 697px bottom
    aligned vertically all Text_with_CTA_heading
    above Text_with_CTA_primary_CTA 32px
    above Text_with_CTA_secondary_CTA 32px
    below Text_with_CTA_heading 16px
    below viewport 2183px
    centered horizontally inside Text_with_CTA 1px
    centered horizontally inside screen 1px
    centered horizontally inside viewport 1px

  Text_with_CTA_heading:
    width 100% of Text_with_CTA_bodycopy/width
    inside Text_with_CTA  189px top, 135px left, 136px right, 229px bottom
    inside screen  2746px top, 135px left, 136px right, 738px bottom
    aligned vertically all Text_with_CTA_bodycopy
    above Text_with_CTA_bodycopy 16px
    above Text_with_CTA_primary_CTA 73px
    above Text_with_CTA_secondary_CTA 73px
    below viewport 2110px
    centered horizontally inside Text_with_CTA 1px
    centered horizontally inside screen 1px
    centered horizontally inside viewport 1px

  Text_with_CTA_primary_CTA:
    height 100% of Text_with_CTA_secondary_CTA/height
    inside Text_with_CTA  319px top, 548px left, 648px right, 114px bottom
    inside screen  2876px top, 548px left, 648px right, 623px bottom
    aligned horizontally all Text_with_CTA_secondary_CTA
    left-of Text_with_CTA_secondary_CTA 9px
    below Text_with_CTA_bodycopy 32px
    below Text_with_CTA_heading 73px
    below viewport 2240px

  Text_with_CTA_secondary_CTA:
    height 100% of Text_with_CTA_primary_CTA/height
    inside Text_with_CTA  319px top, 694px left, 549px right, 114px bottom
    inside screen  2876px top, 694px left, 549px right, 623px bottom
    aligned horizontally all Text_with_CTA_primary_CTA
    right-of Text_with_CTA_primary_CTA 9px
    below Text_with_CTA_bodycopy 32px
    below Text_with_CTA_heading 73px
    below viewport 2240px

  screen:
    width 100% of Text_with_CTA/width
    width 100% of viewport/width
    inside partly viewport 
    aligned horizontally top viewport
    aligned vertically all Text_with_CTA
    aligned vertically all viewport
    centered horizontally on Text_with_CTA_bodycopy 1px
    centered horizontally on Text_with_CTA_heading 1px

  viewport:
    width 100% of Text_with_CTA/width
    width 100% of screen/width
    inside partly screen  2905px bottom
    aligned horizontally top screen
    aligned vertically all Text_with_CTA
    aligned vertically all screen
    above Text_with_CTA 1921px
    above Text_with_CTA_bodycopy 2183px
    above Text_with_CTA_heading 2110px
    above Text_with_CTA_primary_CTA 2240px
    above Text_with_CTA_secondary_CTA 2240px
    centered horizontally on Text_with_CTA_bodycopy 1px
    centered horizontally on Text_with_CTA_heading 1px
   
   