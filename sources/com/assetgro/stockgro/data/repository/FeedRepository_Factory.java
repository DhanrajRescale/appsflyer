package com.assetgro.stockgro.data.repository;

import com.assetgro.stockgro.data.local.preference.UserPreferences;
import com.assetgro.stockgro.data.remote.NetworkService;
import javax.inject.Provider;
import xs.b;

/* loaded from: classes.dex */
public final class FeedRepository_Factory implements b {
    private final Provider<NetworkService> networkServiceProvider;
    private final Provider<UserPreferences> userPreferencesProvider;

    public FeedRepository_Factory(Provider<NetworkService> provider, Provider<UserPreferences> provider2) {
        this.networkServiceProvider = provider;
        this.userPreferencesProvider = provider2;
    }

    public static FeedRepository_Factory create(Provider<NetworkService> provider, Provider<UserPreferences> provider2) {
        return new FeedRepository_Factory(provider, provider2);
    }

    public static FeedRepository newInstance(NetworkService networkService, UserPreferences userPreferences) {
        return new FeedRepository(networkService, userPreferences);
    }

    @Override // javax.inject.Provider
    public FeedRepository get() {
        return newInstance(this.networkServiceProvider.get(), this.userPreferencesProvider.get());
    }
}
