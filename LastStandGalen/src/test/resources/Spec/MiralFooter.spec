@objects
	Footer_container xpath .//div[contains(@class,'footer-container component')]
	Footer_column_container xpath .//li[contains(@class,'footer-container-body-links-column')]
	Footer_link_category xpath .//a[contains(@class,'footer-container-body-links-column-desktop')]
	Footer_link_subcat_ferrari xpath .//li/a[contains(text(),'Ferrari World')]
	Footer_prmy_logo xpath .//div[contains(@class,'primary-logo')]/a
	Footer_scnd_logo xpath .//a/img[contains(@alt,'Yas footer logo')]
	Footer_cpyrgt xpath .//div[contains(@class,'footer-container-copyright-text')]/p
	
	
=footer section=
     
  Footer_column_container:
    width 100% of Footer_link_category/width
    width 100% of Footer_link_subcat_ferrari/width
    inside Footer_container  45px top, 53px left, 1092px right, 214px bottom
    inside screen  2303px top, 53px left, 1092px right, 214px bottom
    inside partly Footer_link_category 
    aligned horizontally top Footer_link_category
    aligned vertically all Footer_link_category
    aligned vertically all Footer_link_subcat_ferrari
    aligned vertically left Footer_prmy_logo 1px
    left-of Footer_scnd_logo 879px
    above Footer_cpyrgt 165px
    above Footer_scnd_logo 48px
    above Footer_prmy_logo 67px
    below viewport 1667px

  Footer_container:
    width 100% of screen/width
    width 100% of viewport/width
    inside partly screen  2258px top
    aligned horizontally bottom screen
    aligned vertically all screen
    aligned vertically all viewport
    below viewport 1622px

  Footer_cpyrgt:
    inside Footer_container  460px top, 21px left, 58px right, 32px bottom
    inside screen  2718px top, 21px left, 58px right, 32px bottom
    aligned vertically right Footer_scnd_logo
    below Footer_column_container 165px
    below Footer_link_category 397px
    below Footer_link_subcat_ferrari 359px
    below Footer_scnd_logo 42px
    below Footer_prmy_logo 56px
    below viewport 2082px

  Footer_link_category:
    width 100% of Footer_column_container/width
    width 100% of Footer_link_subcat_ferrari/width
    height 100% of Footer_link_subcat_ferrari/height
    inside Footer_container  45px top, 53px left, 1092px right, 446px bottom
    inside screen  2303px top, 53px left, 1092px right, 446px bottom
    inside partly Footer_column_container  232px bottom
    aligned horizontally top Footer_column_container
    aligned vertically all Footer_column_container
    aligned vertically all Footer_link_subcat_ferrari
    aligned vertically left Footer_prmy_logo 1px
    left-of Footer_scnd_logo 879px
    above Footer_cpyrgt 397px
    above Footer_link_subcat_ferrari 20px
    above Footer_scnd_logo 280px
    above Footer_prmy_logo 299px
    below viewport 1667px

  Footer_link_subcat_ferrari:
    width 100% of Footer_column_container/width
    width 100% of Footer_link_category/width
    inside Footer_container  83px top, 53px left, 1092px right, 408px bottom
    inside screen  2341px top, 53px left, 1092px right, 408px bottom
    inside partly Footer_column_container  38px top, 194px bottom
    aligned vertically all Footer_column_container
    aligned vertically all Footer_link_category
    aligned vertically left Footer_prmy_logo 1px
    left-of Footer_scnd_logo 879px
    above Footer_cpyrgt 359px
    above Footer_scnd_logo 242px
    above Footer_prmy_logo 261px
    below Footer_link_category 20px
    below viewport 1705px

  Footer_scnd_logo:
    inside Footer_container  343px top, 1120px left, 58px right, 91px bottom
    inside screen  2601px top, 1120px left, 58px right, 91px bottom
    aligned vertically right Footer_cpyrgt
    right-of Footer_column_container 879px
    right-of Footer_link_category 879px
    right-of Footer_link_subcat_ferrari 879px
    right-of Footer_prmy_logo 868px
    above Footer_cpyrgt 42px
    below Footer_column_container 48px
    below Footer_link_category 280px
    below Footer_link_subcat_ferrari 242px
    below viewport 1965px

  Footer_prmy_logo:
    inside Footer_container  362px top, 54px left, 1081px right, 105px bottom
    inside screen  2620px top, 54px left, 1081px right, 105px bottom
    aligned vertically left Footer_column_container 1px
    aligned vertically left Footer_link_category 1px
    aligned vertically left Footer_link_subcat_ferrari 1px
    left-of Footer_scnd_logo 868px
    above Footer_cpyrgt 56px
    below Footer_column_container 67px
    below Footer_link_category 299px
    below Footer_link_subcat_ferrari 261px
    below viewport 1984px

  screen:
    width 100% of Footer_container/width
    width 100% of viewport/width
    inside partly viewport 
    aligned horizontally bottom Footer_container
    aligned horizontally top viewport
    aligned vertically all Footer_container
    aligned vertically all viewport

  viewport:
    width 100% of Footer_container/width
    width 100% of screen/width
    inside partly screen  2131px bottom
    aligned horizontally top screen
    aligned vertically all Footer_container
    aligned vertically all screen
    above Footer_column_container 1667px
    above Footer_container 1622px
    above Footer_cpyrgt 2082px
    above Footer_link_category 1667px
    above Footer_link_subcat_ferrari 1705px
    above Footer_scnd_logo 1965px
    above Footer_prmy_logo 1984px