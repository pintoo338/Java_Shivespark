package Assignment3;
 interface interestRate {
    double SBIInterestRate();
    double ICICIInterestRate();
    double PNBInterestRate();
}


class SBI implements interestRate {
    @Override
    public double SBIInterestRate() {
        return 6.5;
    }

    @Override
    public double ICICIInterestRate() {
        return 0;
    }

    @Override
    public double PNBInterestRate() {
        return 0;
    }
}

class ICICI implements interestRate {
    @Override
    public double SBIInterestRate() {
        return 0;
    }

    @Override
    public double ICICIInterestRate() {
        return 7.0;
    }

    @Override
    public double PNBInterestRate() {
        return 0;
    }
}


class PNB implements interestRate {
    @Override
    public double SBIInterestRate() {
        return 0;
    }

    @Override
    public double ICICIInterestRate() {
        return 0;
    }

    @Override
    public double PNBInterestRate() {
        return 6.8;
    }
}

public class Bank {
    public static void main(String[] args) {
        SBI sbi = new SBI();
        ICICI icici = new ICICI();
        PNB pnb = new PNB();

        System.out.println("SBI Interest Rate: " + sbi.SBIInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + icici.ICICIInterestRate() + "%");
        System.out.println("PNB Interest Rate: " + pnb.PNBInterestRate() + "%");
    }
}
