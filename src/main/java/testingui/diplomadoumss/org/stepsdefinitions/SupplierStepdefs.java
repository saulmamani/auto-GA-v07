package testingui.diplomadoumss.org.stepsdefinitions;

import cucumber.api.java.en.And;
import testingui.diplomadoumss.org.managepage.Suppliers.Suppliers;

public class SupplierStepdefs {
    private Suppliers suppliers;

    @And("^open button 'Print' on 'Suppliers'$")
    public void openButtonPrintOnSuppliers() {
        suppliers.clickButtonPrint();
    }
}
