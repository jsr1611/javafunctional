package functionalInterface;

import java.util.function.Predicate;

public class _Predicate {

    public static void main(String[] args) {
        System.out.println("// Normal Java functions");
        System.out.println(isPhoneNumberValid("01000000000"));
        System.out.println(isPhoneNumberValid("0100000000"));
        System.out.println(isPhoneNumberValid("02000858500"));

        System.out.println("// Predicate Functional interface");
        System.out.println(isPhoneNumberValidPred.test("01000000000"));
        System.out.println(isPhoneNumberValidPred.test("0100000000"));
        System.out.println(isPhoneNumberValidPred.test("02000858500"));


        // just normal function
        System.out.println(
                "Is phone number valid and contains number 3 = " +
        isPhoneNumberValidPred.and(containsNumber3).test("02000858500")
        );


        // predicate with and
        System.out.println(
                "Is phone number valid and contains number 3 = " +
                        isPhoneNumberValidPred.and(containsNumber3).test("01003858500")
        );


        // predicate with or
        System.out.println(
                "Is phone number valid and contains number 3 = " +
                        isPhoneNumberValidPred.or(containsNumber3).test("02000858530")
        );



    }


    static boolean isPhoneNumberValid(String phoneNumber){
        return phoneNumber.startsWith("010") && phoneNumber.length() == 11;
    }

    static Predicate<String> isPhoneNumberValidPred = phoneNumber ->
            phoneNumber.startsWith("010") && phoneNumber.length() == 11;

    static Predicate<String> containsNumber3 = phoneNumber ->
            phoneNumber.contains("3");
}
