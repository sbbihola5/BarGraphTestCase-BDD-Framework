Feature: Check Barchart Elements of X-Axis and Y-Axis are working correctly or not
Scenario: Search and check elemnts of Xand Y Axis
	Given X-axis elements are shown from Minimum to Maximum
	And Y-axis elements are shown from Minimum to Maximum
	When Barchart shows size of X-axis Elements
	
	
	Then It Compare the Values of X-axis and Y-axis.
	
	