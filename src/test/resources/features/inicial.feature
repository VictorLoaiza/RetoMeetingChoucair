@stories
Feature: Serenity demo
  As user, I want to open in the browser the Serenity demo web page, login on the web page, create a business
  unit and create a new meeting

  Background:
    Given The user is on the web page and login
      | userName | passwordKey |
      | admin    | serenity    |

  @Scenario1:
  Scenario: Login and create the business unit
    When The user fill out the form to login and navigate to organization and create a business unit
      | businessName    | parentUnit     |
      | businessVictorL | Administration |

    Then I see the new business unit created
      | validateBusiness          |
      | businessVictorL |

  @Scenario2:
  Scenario:
    When The user perform the process to create the meeting
      | meetingName   | meetingNumber |
      | meetingVictor | 96080209581   |

    Then Verify that the meeting was created successfully
      | validateMeeting |
      | meetingVictor   |

