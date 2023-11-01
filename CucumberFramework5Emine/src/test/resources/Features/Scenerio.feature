Feature: Scenerio Outline Example

 # @outline
  Scenario Outline: 
    When Login with "<username>" and "<password>"
    And Click on the loggin button
    Then validate that "<username>" is displayed
    And We want to say Bye "<fullname>"

    Examples: 
      | username | password | fullname       | 
      | Emine    | c1234    | Emine Firik    | 
      | Caglar   | m1234    | Caglar akcinar |  
      | Yildirim | y1234    | Yildirim Kaya  |  
