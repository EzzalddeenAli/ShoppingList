package com.example.shoppinglist.auth;

/**
 * Created by eandreevici on 31/07/13.
 */
public final class ShoppingListAccountInfo {

    private ShoppingListAccountInfo() {
    }

    public static final String ACCOUNT_TYPE = "com.example.shoppinglist";
    public static final String ACCOUNT_NAME = "Shopping List";

    public static final String AUTHORITY = "com.example.shoppinglist.sync.provider";

    public static final String AUTHTOKEN_TYPE_STANDARD = "Standard";
    public static final String AUTHTOKEN_TYPE_STANDARD_LABEL = "Shopping List auth";

    public static final IAuthenticationClient authenticationClient = new ShoppingListAuthenticationClient();
}
