package com.assetgro.stockgro.data.repository;

import com.assetgro.stockgro.data.remote.NetworkService;
import javax.inject.Provider;
import xs.b;

/* loaded from: classes.dex */
public final class TopChartsRepository_Factory implements b {
    private final Provider<NetworkService> networkServiceProvider;

    public TopChartsRepository_Factory(Provider<NetworkService> provider) {
        this.networkServiceProvider = provider;
    }

    public static TopChartsRepository_Factory create(Provider<NetworkService> provider) {
        return new TopChartsRepository_Factory(provider);
    }

    public static TopChartsRepository newInstance(NetworkService networkService) {
        return new TopChartsRepository(networkService);
    }

    @Override // javax.inject.Provider
    public TopChartsRepository get() {
        return newInstance(this.networkServiceProvider.get());
    }
}
