package com.assetgro.stockgro.data.repository;

import com.assetgro.stockgro.data.remote.NetworkService;
import javax.inject.Provider;
import xs.b;

/* loaded from: classes.dex */
public final class FnoRepository_Factory implements b {
    private final Provider<NetworkService> networkServiceProvider;

    public FnoRepository_Factory(Provider<NetworkService> provider) {
        this.networkServiceProvider = provider;
    }

    public static FnoRepository_Factory create(Provider<NetworkService> provider) {
        return new FnoRepository_Factory(provider);
    }

    public static FnoRepository newInstance(NetworkService networkService) {
        return new FnoRepository(networkService);
    }

    @Override // javax.inject.Provider
    public FnoRepository get() {
        return newInstance(this.networkServiceProvider.get());
    }
}
