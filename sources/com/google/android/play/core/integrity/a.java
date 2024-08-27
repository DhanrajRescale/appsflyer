package com.google.android.play.core.integrity;

import com.google.android.play.core.integrity.IntegrityTokenRequest;

/* loaded from: classes2.dex */
final class a extends IntegrityTokenRequest.Builder {

    /* renamed from: a, reason: collision with root package name */
    private String f11581a;

    /* renamed from: b, reason: collision with root package name */
    private Long f11582b;

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest build() {
        String str = this.f11581a;
        if (str != null) {
            return new c(str, this.f11582b, null);
        }
        throw new IllegalStateException("Missing required properties: nonce");
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setCloudProjectNumber(long j10) {
        this.f11582b = Long.valueOf(j10);
        return this;
    }

    @Override // com.google.android.play.core.integrity.IntegrityTokenRequest.Builder
    public final IntegrityTokenRequest.Builder setNonce(String str) {
        if (str != null) {
            this.f11581a = str;
            return this;
        }
        throw new NullPointerException("Null nonce");
    }
}
