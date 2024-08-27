package com.assetgro.stockgro.data;

import javax.inject.Provider;
import xs.b;

/* loaded from: classes.dex */
public final class TokenInvalidationInterceptor_Factory implements b {
    private final Provider<LogoutSubject> logoutSubjectProvider;
    private final Provider<MultipleSignInLogoutSubject> multipleSignInLogoutSubjectProvider;

    public TokenInvalidationInterceptor_Factory(Provider<LogoutSubject> provider, Provider<MultipleSignInLogoutSubject> provider2) {
        this.logoutSubjectProvider = provider;
        this.multipleSignInLogoutSubjectProvider = provider2;
    }

    public static TokenInvalidationInterceptor_Factory create(Provider<LogoutSubject> provider, Provider<MultipleSignInLogoutSubject> provider2) {
        return new TokenInvalidationInterceptor_Factory(provider, provider2);
    }

    public static TokenInvalidationInterceptor newInstance(LogoutSubject logoutSubject, MultipleSignInLogoutSubject multipleSignInLogoutSubject) {
        return new TokenInvalidationInterceptor(logoutSubject, multipleSignInLogoutSubject);
    }

    @Override // javax.inject.Provider
    public TokenInvalidationInterceptor get() {
        return newInstance(this.logoutSubjectProvider.get(), this.multipleSignInLogoutSubjectProvider.get());
    }
}
