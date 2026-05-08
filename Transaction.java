package entities;

/**
 * Interface defining the required behaviors for any transaction type.
 * Ensures consistent implementation across different financial records.
 */
public interface Transaction {

    /**
     * Records a new transaction entry in the data store.
     */
    void addTransaction();

    /**
     * Removes an existing transaction entry based on its unique identifier.
     */
    void deleteTransaction();

    /**
     * Retrieves transaction details for display or reporting.
     */
    void getTransaction();
}
