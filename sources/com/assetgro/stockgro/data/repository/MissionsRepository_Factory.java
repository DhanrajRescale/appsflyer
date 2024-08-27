package com.assetgro.stockgro.data.repository;

import com.assetgro.stockgro.data.local.preference.UserPreferences;
import com.assetgro.stockgro.data.remote.NetworkService;
import javax.inject.Provider;
import xs.b;

/* loaded from: classes.dex */
public final class MissionsRepository_Factory implements b {
    private final Provider<NetworkService> networkServiceProvider;
    private final Provider<UserPreferences> userPreferencesProvider;

    public MissionsRepository_Factory(Provider<NetworkService> provider, Provider<UserPreferences> provider2) {
        this.networkServiceProvider = provider;
        this.userPreferencesProvider = provider2;
    }

    public static MissionsRepository_Factory create(Provider<NetworkService> provider, Provider<UserPreferences> provider2) {
        return new MissionsRepository_Factory(provider, provider2);
    }

    public static MissionsRepository newInstance(NetworkService networkService, UserPreferences userPreferences) {
        return new MissionsRepository(networkService, userPreferences);
    }

    @Override // javax.inject.Provider
    public MissionsRepository get() {
        return newInstance(this.networkServiceProvider.get(), this.userPreferencesProvider.get());
    }
}
