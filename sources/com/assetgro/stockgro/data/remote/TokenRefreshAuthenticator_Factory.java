package com.assetgro.stockgro.data.remote;

import com.assetgro.stockgro.data.LogoutSubject;
import com.assetgro.stockgro.data.local.preference.UserPreferences;
import javax.inject.Provider;
import xs.b;

/* loaded from: classes.dex */
public final class TokenRefreshAuthenticator_Factory implements b {
    private final Provider<LogoutSubject> logoutSubjectProvider;
    private final Provider<NetworkService> networkServiceProvider;
    private final Provider<String> sessionIdProvider;
    private final Provider<UserPreferences> userPreferencesProvider;

    public TokenRefreshAuthenticator_Factory(Provider<String> provider, Provider<LogoutSubject> provider2, Provider<UserPreferences> provider3, Provider<NetworkService> provider4) {
        this.sessionIdProvider = provider;
        this.logoutSubjectProvider = provider2;
        this.userPreferencesProvider = provider3;
        this.networkServiceProvider = provider4;
    }

    public static TokenRefreshAuthenticator_Factory create(Provider<String> provider, Provider<LogoutSubject> provider2, Provider<UserPreferences> provider3, Provider<NetworkService> provider4) {
        return new TokenRefreshAuthenticator_Factory(provider, provider2, provider3, provider4);
    }

    public static TokenRefreshAuthenticator newInstance(String str, LogoutSubject logoutSubject, UserPreferences userPreferences, NetworkService networkService) {
        return new TokenRefreshAuthenticator(str, logoutSubject, userPreferences, networkService);
    }

    @Override // javax.inject.Provider
    public TokenRefreshAuthenticator get() {
        return newInstance(this.sessionIdProvider.get(), this.logoutSubjectProvider.get(), this.userPreferencesProvider.get(), this.networkServiceProvider.get());
    }
}
