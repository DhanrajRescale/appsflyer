package com.assetgro.stockgro.data.repository;

import com.assetgro.stockgro.data.remote.NetworkService;
import javax.inject.Provider;
import xs.b;

/* loaded from: classes.dex */
public final class ArenaRepository_Factory implements b {
    private final Provider<NetworkService> networkServiceProvider;

    public ArenaRepository_Factory(Provider<NetworkService> provider) {
        this.networkServiceProvider = provider;
    }

    public static ArenaRepository_Factory create(Provider<NetworkService> provider) {
        return new ArenaRepository_Factory(provider);
    }

    public static ArenaRepository newInstance(NetworkService networkService) {
        return new ArenaRepository(networkService);
    }

    @Override // javax.inject.Provider
    public ArenaRepository get() {
        return newInstance(this.networkServiceProvider.get());
    }
}
