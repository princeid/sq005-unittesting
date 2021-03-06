package decagon;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldCreateBankCorrectly()
    {
        Bank b = new Bank();
        assertNotNull(b);
        // assertNotNull(b.getTransactions());
        // assertNotNull(b.getCustomers());
    }

    @Test
    public void shouldAddCustomerCorrectly()
    {
        Bank b = new Bank();
        Customer c = new Customer(1, "Dee");
        b.AddCustomer(c);
        assertNotNull(b.getCustomers());
        assertEquals(1, b.getCustomers().size());
    }

    @Test
    public void shouldNotAddCustomerWithTheSameID()
    {
        Bank b = new Bank();
        Customer c = new Customer(1, "Dee");
        Customer c2 = new Customer(1, "Spankie");
        b.AddCustomer(c);
        b.AddCustomer(c2);
        assertNotNull(b.getCustomers());
        assertEquals(1, b.getCustomers().size());
    }
}
