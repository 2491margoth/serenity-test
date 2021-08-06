# Autor: xxxxxxxxx
  @stories
  Feature: Academy Choucair
    as a user, I want to learn how to automate in screenplay at the Choucair Academy with the automation course
    @scenario1
    Scenario: Search for automation course
      Given than brandon wants to learn automation at academy choucair
      | strUser | strPassword  |
      | 2728573 | Choucair2021*|
      When he sear for the course on the choucair academy platform
      | strCourse              |
      | Pruebas AFT Accounting and Financial Testing  |
      Then he finds the course called resources
      | strCourse               |
      | Pruebas AFT Accounting and Financial Testing  |