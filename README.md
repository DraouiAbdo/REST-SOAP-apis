# REST-SOAP-apis

In this demo app, A **REST API** is developed using 3 ways : 
1. using Jersy implementation of **JaxRS** Spec.
2. using Spring Web **@RestController**.
3. using **Spring Data Rest** (Projections are used to display custom attributes of the requested entity).

We demonstrated how response in XML or JSON format can be given back to the Client according to accept header in the client's request.

A SOAP API is configured using **JaxWS** and **JaxB for Object XML Mapping**, the WSDL of the web service is generated and used to test validity 
of the webservice using SOAPUI.

The CRUD operations are tested using **Postman** and **SAOPUI** tools.
