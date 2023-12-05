package serie11.esercizio02;
/*
create table contacts (
    id IDENTITY NOT NULL,
    first_name varchar2(20),
    last_name varchar2(20),
    phone_number bigint,
    mobile_phone_number bigint,
    email_address varchar2(50)
);
 */
public class ContactMain {
    static void insertContact(String nome, String cognome, long num_tel, long num_cell, String email){
        System.out.println();
    }
    static void printContacts(){

    }
    public static void main(String[] args) {
        insertContact("Chris", "Ferrari", 123456789, 987654321, "mpcn@abc");
        insertContact("Alessandro", "Formato", 12357373, 982137126, "mpcn@adc");
        insertContact("Felice", "Triste", 1245123612, 712361253, "bluewin@abc");
        printContacts();
    }
}
