package com.assetgro.stockgro.data.repository;

import android.content.Context;
import com.assetgro.stockgro.data.remote.NetworkService;
import javax.inject.Provider;
import xs.b;

/* loaded from: classes.dex */
public final class ContactsRepository_Factory implements b {
    private final Provider<Context> contextProvider;
    private final Provider<NetworkService> networkServiceProvider;

    public ContactsRepository_Factory(Provider<Context> provider, Provider<NetworkService> provider2) {
        this.contextProvider = provider;
        this.networkServiceProvider = provider2;
    }

    public static ContactsRepository_Factory create(Provider<Context> provider, Provider<NetworkService> provider2) {
        return new ContactsRepository_Factory(provider, provider2);
    }

    public static ContactsRepository newInstance(Context context, NetworkService networkService) {
        return new ContactsRepository(context, networkService);
    }

    @Override // javax.inject.Provider
    public ContactsRepository get() {
        return newInstance(this.contextProvider.get(), this.networkServiceProvider.get());
    }
}
