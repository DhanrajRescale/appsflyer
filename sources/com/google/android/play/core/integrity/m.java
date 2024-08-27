package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.Task;

/* loaded from: classes2.dex */
final class m implements IntegrityManager {

    /* renamed from: a, reason: collision with root package name */
    private final t f11594a;

    public m(t tVar) {
        this.f11594a = tVar;
    }

    @Override // com.google.android.play.core.integrity.IntegrityManager
    public final Task<IntegrityTokenResponse> requestIntegrityToken(IntegrityTokenRequest integrityTokenRequest) {
        return this.f11594a.b(integrityTokenRequest);
    }
}
