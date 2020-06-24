# CAP-Java-NG-stake
[CAP Home Page](#cap-home-page) | [Getting Started - First Application](#getting-started---first-application) | [Additional Resources](#additional-resources) | [Local HANA Setup](#local-hana-setup) |


## CAP Home Page
CAP home page: https://github.wdf.sap.corp/pages/cap/about/

## Getting Started - First Application
Create new SAP Cloud Business Application (end-to-end): https://github.wdf.sap.corp/cdx/cds-ls4e/wiki/Create-new-SAP-Cloud-Business-Application

## Additional Resources
- Java Eclipse setup: https://github.wdf.sap.corp/pages/cap/java/getting-started#eclipse </br>
-	Sample application: https://github.com/SAP-samples/cloud-cap-samples-java

## Local HANA Setup
Local command to deploy cds to HANA hdi container (create and config locally)
- You will have to download and configure SAR files, details below </br>
  - https://help.sap.com/viewer/e54136ab6a4a43e6a370265bf0a2d744/4.2.12/en-US/c049e28431ee4e8280cd6f5d1a8937d8.html
  - http://www.easymarketplace.de/SAPCAR.php#:~:text=How%20to%20extract%20(decompressing)%20CAR%20and%20SAR%20Files%20%3F,in%20this%20archive%2C%20become%20decompressed.
- After configuring above run below command on root
  - command: **cds deploy --tool hana**
