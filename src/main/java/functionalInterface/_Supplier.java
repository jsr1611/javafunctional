package functionalInterface;

import java.util.List;
import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        // normal function
        System.out.println(getDBConnectionUrl());

        //Supplier Functional interface
        System.out.println(getDBConnectionUrlSupplier.get());

        // returning list of ...
        System.out.println(getDBConnectionUrlSupplierV2.get());

    }

    static String getDBConnectionUrl(){
        return "jdbc://localhost:5432/users";
    }

    static Supplier<String> getDBConnectionUrlSupplier = () -> "jdbc://localhost:5432/users";

    static Supplier<List<String>> getDBConnectionUrlSupplierV2 = ()
            -> List.of(
            "jdbc://localhost:5432/users",
            "jdbc://localhost:5432/customer");
}
