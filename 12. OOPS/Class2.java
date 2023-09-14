//  ACCESS MODIFIER 

public class Class2 {

    public static void main(String args[]) {

        BankAccount b1 = new BankAccount();
        b1.setAccountName("rahul");
        System.out.println(b1.accountName);

        // b1.setPassword(124); -->> we can change only password but not directly access
        // by making

        b1.setPassword();

        b1.getPassword();

        // System.out.println(b1.passWord);
    }
}

class BankAccount {

    public String accountName;
    private int passWord;

    void setAccountName(String Accountname) {

        accountName = Accountname;
    }

    void setPassword() { // to access password which is private we have to assign value to password within the class and print the value within the function

        passWord = 345;

    }

    void getPassword() {

        System.out.println(passWord);
    }
}
