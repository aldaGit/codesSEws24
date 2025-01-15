package org.hbrs.se1.ws24.demo.invoice;

public class Invoice {
    private int sum;
    private String currency;

    public Invoice( int sum, String currency ){
        this.sum = sum;
        this.currency = currency;
    }


    public boolean equals( Object object ) {
        if (object == null) return false;
        if (! ( object instanceof Invoice) ) return false;

        Invoice invoice = (Invoice) object;

        if ( ( this.getSum() == invoice.getSum() )
                && ( this.getCurrency().equals ( invoice.getCurrency() ) ) ) {
            return true;
        } else {
            return false;
        }
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "sum=" + sum +
                ", currency='" + currency + '\'' +
                '}';
    }
}


