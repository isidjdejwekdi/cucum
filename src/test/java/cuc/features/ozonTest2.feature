Feature: somet
  Scenario: snowboard
    When open ozon page
    Then click on city to choose
    And type in appears row text "Ижевск" and press enter
    And click on button katalog
    Then a submenu appears
    Then move cursor on 'Спорт товары'
    And click on 'Сноуборды и аксессуары'
    Then click on 'Сноуборды'
    Then set price category
    And set level of training
    Then choose on a any snowboard from the suggested list and click on 'В корзину'
    And this button disappears
    When open a tab 'Корзина'
    Then appears choosen snowboard
