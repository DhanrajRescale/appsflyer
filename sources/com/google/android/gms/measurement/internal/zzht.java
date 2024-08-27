package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.p002firebaseauthapi.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import okhttp3.HttpUrl;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class zzht implements Runnable {
    final /* synthetic */ Bundle zza;
    final /* synthetic */ zzij zzb;

    public zzht(zzij zzijVar, Bundle bundle) {
        this.zzb = zzijVar;
        this.zza = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzij zzijVar = this.zzb;
        Bundle bundle = this.zza;
        zzijVar.zzg();
        zzijVar.zza();
        Preconditions.checkNotNull(bundle);
        String checkNotEmpty = Preconditions.checkNotEmpty(bundle.getString(AppMeasurementSdk.ConditionalUserProperty.NAME));
        if (!zzijVar.zzt.zzJ()) {
            a.y(zzijVar.zzt, "Conditional property not cleared since app measurement is disabled");
            return;
        }
        try {
            zzijVar.zzt.zzt().zzE(new zzac(bundle.getString("app_id"), HttpUrl.FRAGMENT_ENCODE_SET, new zzlj(checkNotEmpty, 0L, null, HttpUrl.FRAGMENT_ENCODE_SET), bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), bundle.getBoolean(AppMeasurementSdk.ConditionalUserProperty.ACTIVE), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_EVENT_NAME), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TRIGGER_TIMEOUT), null, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.TIME_TO_LIVE), zzijVar.zzt.zzv().zzz(bundle.getString("app_id"), bundle.getString(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_NAME), bundle.getBundle(AppMeasurementSdk.ConditionalUserProperty.EXPIRED_EVENT_PARAMS), HttpUrl.FRAGMENT_ENCODE_SET, bundle.getLong(AppMeasurementSdk.ConditionalUserProperty.CREATION_TIMESTAMP), true, true)));
        } catch (IllegalArgumentException unused) {
        }
    }
}
