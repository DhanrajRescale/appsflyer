package com.google.firebase.crashlytics;

import android.os.Bundle;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import mq.c;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements BreadcrumbSource, AnalyticsEventLogger, mq.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AnalyticsDeferredProxy f11665a;

    public /* synthetic */ a(AnalyticsDeferredProxy analyticsDeferredProxy) {
        this.f11665a = analyticsDeferredProxy;
    }

    @Override // mq.a
    public final void e(c cVar) {
        AnalyticsDeferredProxy.a(this.f11665a, cVar);
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public final void logEvent(String str, Bundle bundle) {
        AnalyticsDeferredProxy.b(this.f11665a, str, bundle);
    }

    @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
    public final void registerBreadcrumbHandler(BreadcrumbHandler breadcrumbHandler) {
        AnalyticsDeferredProxy.c(this.f11665a, breadcrumbHandler);
    }
}
