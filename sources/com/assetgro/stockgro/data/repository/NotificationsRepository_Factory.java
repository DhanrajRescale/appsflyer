package com.assetgro.stockgro.data.repository;

import com.assetgro.stockgro.data.remote.NetworkService;
import javax.inject.Provider;
import xs.b;

/* loaded from: classes.dex */
public final class NotificationsRepository_Factory implements b {
    private final Provider<NetworkService> networkServiceProvider;

    public NotificationsRepository_Factory(Provider<NetworkService> provider) {
        this.networkServiceProvider = provider;
    }

    public static NotificationsRepository_Factory create(Provider<NetworkService> provider) {
        return new NotificationsRepository_Factory(provider);
    }

    public static NotificationsRepository newInstance(NetworkService networkService) {
        return new NotificationsRepository(networkService);
    }

    @Override // javax.inject.Provider
    public NotificationsRepository get() {
        return newInstance(this.networkServiceProvider.get());
    }
}
