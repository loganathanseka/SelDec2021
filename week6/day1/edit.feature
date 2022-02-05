Feature: edit lead

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

