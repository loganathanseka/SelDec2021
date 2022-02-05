Feature: create lead login

Scenario: login to application

When Click the 'Contacts' button
When Click the 'Create Contact' button
Then Enter the 'firstNameField' in form as 'Loganathan'
Then Enter the 'lastNameField' in form as 'Sekar'
Then Enter the 'createContactForm_birthDate' in form as '10/07/1996'
Then Enter the 'createContactForm_primaryEmail' in form as 'logansekar008@gmail.com'
Then Enter the 'createContactForm_generalAddress1' in form as '5/114 S.parraipatti'
Then Enter the 'createContactForm_generalCity' in form as 'Dindigul'
Then Enter the 'createContactForm_generalPostalCode' in form as '624802'
Then select the 'createContactForm_generalCountryGeoId' in form as 'India'
Then wait
Then select the 'createContactForm_generalStateProvinceGeoId' in form as 'TAMILNADU'
When Click the 'smallSubmit' login button




