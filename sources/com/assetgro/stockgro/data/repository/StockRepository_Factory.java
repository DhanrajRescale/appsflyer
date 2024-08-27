package com.assetgro.stockgro.data.repository;

import com.assetgro.stockgro.data.local.preference.UserPreferences;
import com.assetgro.stockgro.data.remote.NetworkService;
import javax.inject.Provider;
import xs.b;

/* loaded from: classes.dex */
public final class StockRepository_Factory implements b {
    private final Provider<NetworkService> networkServiceProvider;
    private final Provider<UserPreferences> userPreferencesProvider;

    public StockRepository_Factory(Provider<NetworkService> provider, Provider<UserPreferences> provider2) {
        this.networkServiceProvider = provider;
        this.userPreferencesProvider = provider2;
    }

    public static StockRepository_Factory create(Provider<NetworkService> provider, Provider<UserPreferences> provider2) {
        return new StockRepository_Factory(provider, provider2);
    }

    public static StockRepository newInstance(NetworkService networkService, UserPreferences userPreferences) {
        return new StockRepository(networkService, userPreferences);
    }

    @Override // javax.inject.Provider
    public StockRepository get() {
        return newInstance(this.networkServiceProvider.get(), this.userPreferencesProvider.get());
    }
}
