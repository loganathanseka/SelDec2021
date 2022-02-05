Feature: Week6 day2

@createcontract
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
Then Check whether "//*[@id='sectionHeaderTitle_contacts']" is "View Contact"
Then retry

@editlead
Scenario: Edit lead steps

When Click the "//a[contains(text(),'Leads')]" link
When Click the "//a[text()='Find Leads']" link
Then Enter the "(//input[@name='firstName' ])[3]" as "loganathan"
Then Enter the "(//input[@name='lastName'])[3]" as "sekar"
#Then Enter the "(//input[@name='companyName'])[2]" as "test leaf"
When Click the "//button[text()='Find Leads']" link
Then wait
When Click the "//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a" link
When Click the "//div[@class='frameSectionExtra']/a[text()='Edit']" link
When Click the "//input[@id='updateLeadForm_companyName']" link
Then wait
Then Clear "//input[@id='updateLeadForm_companyName']" data
Then Enter the "//input[@id='updateLeadForm_companyName']" as "updated test leaf"
When Click the "//input[@value='Update']" link
Then Check whether "//*[@id='sectionHeaderTitle_leads']" is "View Lead"






