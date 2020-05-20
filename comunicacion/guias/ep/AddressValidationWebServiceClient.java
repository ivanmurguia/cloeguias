package comunicacion.guias.ep;
import java.util.Calendar;
import org.apache.axis.types.PositiveInteger;
import com.fedex.addressvalidation.stub.*;


/** 
 * Sample code to call the FedEx Address validation Web Service
 * <p>
 * com.fedex.addressvalidation.stub is generated via WSDL2Java, like this:<br>
 * <pre>
 * java org.apache.axis.wsdl.WSDL2Java -w -p com.fedex.addressvalidation.stub http://www.fedex.com/...../AddressValidationService?wsdl
 * </pre>
 * 
 * This sample code has been tested with JDK 5 and Apache Axis 1.4
 */
public class AddressValidationWebServiceClient {
	
	public static void main(String[] args) { 
	    //
		AddressValidationRequest request = new AddressValidationRequest();
        request.setClientDetail(createClientDetail());
        request.setWebAuthenticationDetail(createWebAuthenticationDetail());
        //
        VersionId versionId = new VersionId("aval", 4, 0, 0);
        request.setVersion(versionId);
	    //
	    TransactionDetail transactionDetail = new TransactionDetail();
	    transactionDetail.setCustomerTransactionId("java sample - AddressValidationRequest"); //This is a reference field for the customer.  Any value can be used and will be provided in the return.
	    request.setTransactionDetail(transactionDetail);
        //
	    Calendar c = Calendar.getInstance();
	    request.setInEffectAsOfTimestamp(c);
        //
	    
	    AddressToValidate av1 = new AddressToValidate();
	    Address a1 = new Address();
	    a1.setStreetLines(new String[] {"CIRCUITO MISION DEL BOSQUE"});
	    a1.setCity("ZAPOPAN");
	    a1.setStateOrProvinceCode("JAl");
	    a1.setPostalCode("45133");
	    a1.setCountryCode("MX");
	    av1.setAddress(a1);
	    av1.setClientReferenceId("ClientReferenceId1");
	    
//	    AddressToValidate av2 = new AddressToValidate();
//	    Address a2 = new Address();
//	    a2.setStreetLines(new String[] {"167 PROSPECT HIGHWAY"});
//	    a2.setCity("NEW SOUTH WALES");
//	    a2.setPostalCode("2147");
//	    a2.setCountryCode("AU");
//	    av2.setAddress(a2);
//	    av2.setClientReferenceId("ClientReferenceId2");
//	       
//	    AddressToValidate av3 = new AddressToValidate();
//	    Address a3 = new Address();
//	    a3.setStreetLines(new String[] {"3 WATCHMOOR POINT", "WATCHMOOR ROAD"});
//	    a3.setCity("CAMBERLEY");
//	    a3.setPostalCode("GU153AQ");
//	    a3.setCountryCode("GB");
//	    av3.setAddress(a3);
//	    av3.setClientReferenceId("ClientReferenceId3");
//	    
//	    request.setAddressesToValidate(new AddressToValidate[] {av1, av2, av3});
	    request.setAddressesToValidate(new AddressToValidate[] {av1});
	    //
		try {
			// Initialize the service
			AddressValidationServiceLocator service;
			AddressValidationPortType port;
			//	
			service = new AddressValidationServiceLocator();
			updateEndPoint(service);
			port = service.getAddressValidationServicePort();	
			// This is the call to the web service
			AddressValidationReply reply = port.addressValidation(request);
			System.out.println("Transactions successful");
			System.out.println();
			//
			if (isResponseOk(reply.getHighestSeverity()))
			{
				AddressValidationResult[] avr = reply.getAddressResults();
				for(int i = 0; i < avr.length; i++)
				{
					System.out.println("Address Id - " + avr[i].getClientReferenceId());
					Address address = avr[i].getEffectiveAddress();
					System.out.println("--- Effective Address--- ");
					String[] streetlines = address.getStreetLines();
					for(int j=0; j < streetlines.length; j++)
					{
						System.out.println("  Street: " + streetlines[j]);
					}
					if(address.getCity() != null) System.out.println("    City: " + address.getCity());
					if(address.getStateOrProvinceCode() != null) System.out.println("   ST/PR: " + address.getStateOrProvinceCode());
					if(address.getPostalCode() != null) System.out.println("  Postal: " + address.getPostalCode());
					if(address.getCountryCode() != null) System.out.println(" Country: " + address.getCountryCode());
					System.out.println();
					System.out.println("--- Address Attributes ---");
					AddressAttribute[] attributes = avr[i].getAttributes();
					for(int j = 0; j < attributes.length; j++)
					{
						System.out.println("  " + attributes[j].getName() + ": " + attributes[j].getValue());
					}
					System.out.println();
					System.out.println();
				}
			}

			printNotifications(reply.getNotifications());

		} catch (Exception e) {
            e.printStackTrace();
		}
	}

	private static boolean isResponseOk(NotificationSeverityType notificationSeverityType) {
		if (notificationSeverityType == null) {
			return false;
		}
		if (notificationSeverityType.equals(NotificationSeverityType.WARNING) ||
			notificationSeverityType.equals(NotificationSeverityType.NOTE)    ||
			notificationSeverityType.equals(NotificationSeverityType.SUCCESS)) {
			return true;
		}
 		return false;
	}

	private static ClientDetail createClientDetail() {
        ClientDetail clientDetail = new ClientDetail();
        String accountNumber = System.getProperty("accountNumber");
        String meterNumber = System.getProperty("meterNumber");
        //
        // See if the accountNumber and meterNumber properties are set,
        // if set use those values, otherwise default them to "XXX"
        //
        if (accountNumber == null) {
        	accountNumber = "510087640"; // Replace "XXX" with clients account number
        }
        if (meterNumber == null) {
        	meterNumber = "119039191"; // Replace "XXX" with clients meter number
        }
        clientDetail.setAccountNumber(accountNumber);
        clientDetail.setMeterNumber(meterNumber);
        return clientDetail;
	}
	
	private static WebAuthenticationDetail createWebAuthenticationDetail() {
        WebAuthenticationCredential userCredential = new WebAuthenticationCredential();
        String key = System.getProperty("key");
        String password = System.getProperty("password");       
        //
        // See if the key and password properties are set,
        // if set use those values, otherwise default them to "XXX"
        //
        if (key == null) {
        	key = "tbQWekfWEuln6TOq"; // Replace "XXX" with clients key
        }
        if (password == null) {
        	password = "ptk97Pmk2ihzfAuurMbqqurqk"; // Replace "XXX" with clients password
        }
        userCredential.setKey(key);
        userCredential.setPassword(password);
        
        WebAuthenticationCredential parentCredential = null;
        Boolean useParentCredential=false; //Set this value to true is using a parent credential
        if(useParentCredential){
        
        	String parentKey = System.getProperty("parentkey");
        	String parentPassword = System.getProperty("parentpassword");
        	//
            // See if the parentkey and parentpassword properties are set,
            // if set use those values, otherwise default them to "XXX"
        	//
        	if (parentKey == null) {
        		parentKey = "XXX"; // Replace "XXX" with clients parent key
        	}
        	if (parentPassword == null) {
        		parentPassword = "XXX"; // Replace "XXX" with clients parent password
        	}
        	parentCredential = new WebAuthenticationCredential();
        	parentCredential.setKey(parentKey);
        	parentCredential.setPassword(parentPassword);
        }
		return new WebAuthenticationDetail(parentCredential, userCredential);
	}
	
	private static void printNotifications(Notification[] notifications) {
		System.out.println("Notifications:");
		if (notifications == null || notifications.length == 0) {
			System.out.println("  No notifications returned");
		}
		for (int i=0; i < notifications.length; i++){
			Notification n = notifications[i];
			System.out.print("  Notification no. " + i + ": ");
			if (n == null) {
				System.out.println("null");
				continue;
			} else {
				System.out.println("");
			}
			NotificationSeverityType nst = n.getSeverity();

			System.out.println("    Severity: " + (nst == null ? "null" : nst.getValue()));
			System.out.println("    Code: " + n.getCode());
			System.out.println("    Message: " + n.getMessage());
			System.out.println("    Source: " + n.getSource());
		}
	}
	
	private static void updateEndPoint(AddressValidationServiceLocator serviceLocator) {
		String endPoint = System.getProperty("endPoint");
		if (endPoint != null) {
			serviceLocator.setAddressValidationServicePortEndpointAddress(endPoint);
		}
	}
	
}
