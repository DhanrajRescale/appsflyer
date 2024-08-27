package com.assetgro.stockgro.data;

import xs.b;

/* loaded from: classes.dex */
public final class LogoutSubject_Factory implements b {

    /* loaded from: classes.dex */
    public static final class InstanceHolder {
        private static final LogoutSubject_Factory INSTANCE = new LogoutSubject_Factory();

        private InstanceHolder() {
        }
    }

    public static LogoutSubject_Factory create() {
        return InstanceHolder.INSTANCE;
    }

    public static LogoutSubject newInstance() {
        return new LogoutSubject();
    }

    @Override // javax.inject.Provider
    public LogoutSubject get() {
        return newInstance();
    }
}
