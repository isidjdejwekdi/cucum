Feature: some feature
  Scenario: book
    When open ozon page
    Then click on city to choose
    And type in appears row text "Ижевск" and press enter
    And click on button katalog
    Then a submenu appears
    Then move cursor on 'Книги'
    And click on 'Компьютерные технологии'
    Then choose parametres 'Бестселлеры' and 'Языки программирования'
    Then a window appears in which the selected categories
    Then choose on a any book from the suggested list and click on 'В корзину'
    And a button 'В корзину' disappears
    When open a tab 'Корзина'
    Then appears choosen book


