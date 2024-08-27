package com.assetgro.stockgro.data;

import xs.b;

/* loaded from: classes.dex */
public final class MultipleSignInLogoutSubject_Factory implements b {

    /* loaded from: classes.dex */
    public static final class InstanceHolder {
        private static final MultipleSignInLogoutSubject_Factory INSTANCE = new MultipleSignInLogoutSubject_Factory();

        private InstanceHolder() {
        }
    }

    public static MultipleSignInLogoutSubject_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static MultipleSignInLogoutSubject newInstance() {
        return new MultipleSignInLogoutSubject();
    }

    @Override // javax.inject.Provider
    public MultipleSignInLogoutSubject get() {
        return newInstance();
    }
}
