package com.appsflyer.internal;

import com.appsflyer.internal.AFd1jSDK;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements AFf1eSDK, AFd1jSDK.AFa1zSDK {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AFb1vSDK f8528a;

    public /* synthetic */ c(AFb1vSDK aFb1vSDK) {
        this.f8528a = aFb1vSDK;
    }

    @Override // com.appsflyer.internal.AFd1jSDK.AFa1zSDK
    public final void onConfigurationChanged(boolean z10) {
        AFb1vSDK.e(this.f8528a, z10);
    }

    @Override // com.appsflyer.internal.AFf1eSDK
    public final void onRemoteConfigUpdateFinished(AFf1gSDK aFf1gSDK) {
        AFb1vSDK.c(this.f8528a, aFf1gSDK);
    }
}
