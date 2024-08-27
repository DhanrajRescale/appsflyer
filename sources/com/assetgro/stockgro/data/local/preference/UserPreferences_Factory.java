package com.assetgro.stockgro.data.local.preference;

import android.content.SharedPreferences;
import javax.inject.Provider;
import xs.b;

/* loaded from: classes.dex */
public final class UserPreferences_Factory implements b {
    private final Provider<SharedPreferences> prefsProvider;

    public UserPreferences_Factory(Provider<SharedPreferences> provider) {
        this.prefsProvider = provider;
    }

    public static UserPreferences_Factory create(Provider<SharedPreferences> provider) {
        return new UserPreferences_Factory(provider);
    }

    public static UserPreferences newInstance(SharedPreferences sharedPreferences) {
        return new UserPreferences(sharedPreferences);
    }

    @Override // javax.inject.Provider
    public UserPreferences get() {
        return newInstance(this.prefsProvider.get());
    }
}
