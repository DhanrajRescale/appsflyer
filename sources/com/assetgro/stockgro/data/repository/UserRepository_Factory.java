package com.assetgro.stockgro.data.repository;

import android.content.Context;
import com.assetgro.stockgro.data.local.preference.UserPreferences;
import com.assetgro.stockgro.data.remote.NetworkService;
import javax.inject.Provider;
import ls.n0;
import xs.b;

/* loaded from: classes.dex */
public final class UserRepository_Factory implements b {
    private final Provider<ChatRepository> chatRepositoryProvider;
    private final Provider<Context> contextProvider;
    private final Provider<n0> mixpanelAPIProvider;
    private final Provider<NetworkService> networkServiceProvider;
    private final Provider<UserPreferences> userPreferencesProvider;

    public UserRepository_Factory(Provider<Context> provider, Provider<NetworkService> provider2, Provider<UserPreferences> provider3, Provider<ChatRepository> provider4, Provider<n0> provider5) {
        this.contextProvider = provider;
        this.networkServiceProvider = provider2;
        this.userPreferencesProvider = provider3;
        this.chatRepositoryProvider = provider4;
        this.mixpanelAPIProvider = provider5;
    }

    public static UserRepository_Factory create(Provider<Context> provider, Provider<NetworkService> provider2, Provider<UserPreferences> provider3, Provider<ChatRepository> provider4, Provider<n0> provider5) {
        return new UserRepository_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static UserRepository newInstance(Context context, NetworkService networkService, UserPreferences userPreferences, ChatRepository chatRepository, n0 n0Var) {
        return new UserRepository(context, networkService, userPreferences, chatRepository, n0Var);
    }

    @Override // javax.inject.Provider
    public UserRepository get() {
        return newInstance(this.contextProvider.get(), this.networkServiceProvider.get(), this.userPreferencesProvider.get(), this.chatRepositoryProvider.get(), this.mixpanelAPIProvider.get());
    }
}
