package com.assetgro.stockgro.data.local.preference;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import in.juspay.hyper.constants.LogCategory;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR(\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0010R(\u0010\u0016\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0018\u0010\u0010¨\u0006\u001a"}, d2 = {"Lcom/assetgro/stockgro/data/local/preference/GlobalUserPreferences;", HttpUrl.FRAGMENT_ENCODE_SET, LogCategory.CONTEXT, "Landroid/content/Context;", "(Landroid/content/Context;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, HttpUrl.FRAGMENT_ENCODE_SET, "isExistingUser", "()Z", "setExistingUser", "(Z)V", HttpUrl.FRAGMENT_ENCODE_SET, "phoneNumber", "getPhoneNumber", "()Ljava/lang/String;", "setPhoneNumber", "(Ljava/lang/String;)V", "preferences", "Landroid/content/SharedPreferences;", "userName", "getUserName", "setUserName", "uuid", "getUuid", "setUuid", "Companion", "app_prodRelease"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class GlobalUserPreferences {

    @NotNull
    public static final String IS_EXISTING_USER = "IS_EXISTING_USER";

    @NotNull
    public static final String KEY_USER_NAME = "PREF_KEY_USER_NAME";

    @NotNull
    public static final String PHONE_NUMBER = "PHONE_NUMBER";

    @NotNull
    public static final String UUID = "UUID";

    @NotNull
    private final SharedPreferences preferences;
    public static final int $stable = 8;

    public GlobalUserPreferences(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("assetgro_stockgro_global_pref", 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        this.preferences = sharedPreferences;
    }

    public final String getPhoneNumber() {
        return this.preferences.getString("PHONE_NUMBER", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public final String getUserName() {
        return this.preferences.getString("PREF_KEY_USER_NAME", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public final String getUuid() {
        return this.preferences.getString("UUID", HttpUrl.FRAGMENT_ENCODE_SET);
    }

    public final boolean isExistingUser() {
        return this.preferences.getBoolean(IS_EXISTING_USER, false);
    }

    public final void setExistingUser(boolean z10) {
        this.preferences.edit().putBoolean(IS_EXISTING_USER, z10).apply();
    }

    public final void setPhoneNumber(String str) {
        this.preferences.edit().putString("PHONE_NUMBER", str).apply();
    }

    public final void setUserName(String str) {
        this.preferences.edit().putString("PREF_KEY_USER_NAME", str).apply();
    }

    public final void setUuid(String str) {
        this.preferences.edit().putString("UUID", str).apply();
    }
}
