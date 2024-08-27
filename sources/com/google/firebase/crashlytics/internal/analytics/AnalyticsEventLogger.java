package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* loaded from: classes2.dex */
public interface AnalyticsEventLogger {
    void logEvent(@NonNull String str, Bundle bundle);
}
