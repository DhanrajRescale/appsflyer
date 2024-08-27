package com.google.android.play.core.integrity;

import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes2.dex */
final class c extends IntegrityTokenRequest {

    /* renamed from: a, reason: collision with root package name */
    private final String f11583a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f11584b;

    public /* synthetic */ c(String str, Long l10, b bVar) {
        this.f11583a = str;
        this.f11584b = l10;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final Long cloudProjectNumber() {
        return this.f11584b;
    }

    public final boolean equals(Object obj) {
        Long l10;
        if (obj == this) {
            return true;
        }
        if (obj instanceof IntegrityTokenRequest) {
            IntegrityTokenRequest integrityTokenRequest = (IntegrityTokenRequest) obj;
            if (this.f11583a.equals(integrityTokenRequest.nonce()) && ((l10 = this.f11584b) != null ? l10.equals(integrityTokenRequest.cloudProjectNumber()) : integrityTokenRequest.cloudProjectNumber() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f11583a.hashCode() ^ 1000003;
        Long l10 = this.f11584b;
        if (l10 == null) {
            hashCode = 0;
        } else {
            hashCode = l10.hashCode();
        }
        return (hashCode2 * 1000003) ^ hashCode;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest
    public final String nonce() {
        return this.f11583a;
    }

    public final String toString() {
        return "IntegrityTokenRequest{nonce=" + this.f11583a + ", cloudProjectNumber=" + this.f11584b + UrlTreeKt.componentParamSuffix;
    }
}
