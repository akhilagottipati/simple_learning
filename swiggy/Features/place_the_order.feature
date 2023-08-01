Feature: Place a order
Scenario: To place a order in swiggy Suceesfully
Given a user in the swiggy homepage
When Type your delivery location as ‘Hyderabad’ and select the first option from the auto-complete box.
And Click on the first restaurant shown under ‘Top restaurant chains in Hyderabad’.
And Click on ‘Add’ button corresponding to first listed dish.
And Hover over ‘Cart’ in the top right corner. 
And Click on ‘Check Out’ in the sub-menu.
Then Verify the text ‘To place your order now, log in to your existing account or sign up.’ Is visible on the next page sucessfully.