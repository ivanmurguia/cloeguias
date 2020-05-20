package comunicacion.guias.ep;

import com.sap.smb.sbo.api.Company;
import com.sap.smb.sbo.api.SBOCOMConstants;
import com.sap.smb.sbo.api.SBOCOMUtil;

public class ConexionSap {
	public Company company;
	public void conectar() {

        company = (Company) SBOCOMUtil.newCompany();
		company.setCompanyDB("OE_MODA2017");
//      company.setCompanyDB("Oe_Moda_RetailPruebas");
		company.setUserName("manager");
		company.setPassword("ALEX");
		company.setServer("OE-SAP01");
        company.setLanguage(SBOCOMConstants.BoSuppLangs_ln_Spanish_La);
        company.setLicenseServer("192.168.1.35:30000");
        company.setDbServerType(SBOCOMConstants.BoDataServerTypes_dst_MSSQL2012);
        while(!company.isConnected()) {
            company.connect();
        }
	}
}