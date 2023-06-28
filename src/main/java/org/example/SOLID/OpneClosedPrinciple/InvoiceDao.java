package org.example.SOLID.OpneClosedPrinciple;

//Open for extension but closed for modification

public interface InvoiceDao {
    void save(String invoice);
}

class DBInvoiceDao implements InvoiceDao{

    @Override
    public void save(String invoice) {
        //Save to DB
    }
}

class FileInvoiceDao implements InvoiceDao{

    @Override
    public void save(String invoice) {
        //Save to File
    }
}
