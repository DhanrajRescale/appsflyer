package com.assetgro.stockgro.data.repository;

import com.assetgro.stockgro.data.local.preference.UserPreferences;
import com.assetgro.stockgro.data.remote.NetworkService;
import javax.inject.Provider;
import xs.b;

/* loaded from: classes.dex */
public final class ChatRepository_Factory implements b {
    private final Provider<NetworkService> networkServiceProvider;
    private final Provider<UserPreferences> userPreferencesProvider;

    public ChatRepository_Factory(Provider<NetworkService> provider, Provider<UserPreferences> provider2) {
        this.networkServiceProvider = provider;
        this.userPreferencesProvider = provider2;
    }

    public static ChatRepository_Factory create(Provider<NetworkService> provider, Provider<UserPreferences> provider2) {
        return new ChatRepository_Factory(provider, provider2);
    }

    public static ChatRepository newInstance(NetworkService networkService, UserPreferences userPreferences) {
        return new ChatRepository(networkService, userPreferences);
    }

    @Override // javax.inject.Provider
    public ChatRepository get() {
        return newInstance(this.networkServiceProvider.get(), this.userPreferencesProvider.get());
    }
}
