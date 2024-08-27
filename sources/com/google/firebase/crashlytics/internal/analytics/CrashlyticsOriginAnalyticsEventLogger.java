package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import tp.d;
import tp.e;

/* loaded from: classes2.dex */
public class CrashlyticsOriginAnalyticsEventLogger implements AnalyticsEventLogger {
    static final String FIREBASE_ANALYTICS_ORIGIN_CRASHLYTICS = "clx";

    @NonNull
    private final d analyticsConnector;

    public CrashlyticsOriginAnalyticsEventLogger(@NonNull d dVar) {
        this.analyticsConnector = dVar;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void logEvent(@NonNull String str, Bundle bundle) {
        ((e) this.analyticsConnector).a(FIREBASE_ANALYTICS_ORIGIN_CRASHLYTICS, str, bundle);
    }
}
