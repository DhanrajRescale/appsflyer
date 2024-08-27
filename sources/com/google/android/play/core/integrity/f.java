package com.google.android.play.core.integrity;

import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes2.dex */
final class f extends IntegrityTokenResponse {

    /* renamed from: a, reason: collision with root package name */
    private final String f11586a;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenResponse) {
            return this.f11586a.equals(((IntegrityTokenResponse) obj).token());
        }
        return false;
    }

    public final int hashCode() {
        return this.f11586a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return nn.d.k("IntegrityTokenResponse{token=", this.f11586a, UrlTreeKt.componentParamSuffix);
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenResponse
    public final String token() {
        return this.f11586a;
    }
}
