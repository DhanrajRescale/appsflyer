package com.google.android.play.core.integrity;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class r extends hp.l {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f11600a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Long f11601b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f11602c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ IntegrityTokenRequest f11603d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ t f11604e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l10, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f11604e = tVar;
        this.f11600a = bArr;
        this.f11601b = l10;
        this.f11602c = taskCompletionSource2;
        this.f11603d = integrityTokenRequest;
    }

    @Override // hp.l
    public final void a(Exception exc) {
        if (exc instanceof com.google.android.play.integrity.internal.w) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [hp.h, android.os.IInterface] */
    @Override // hp.l
    public final void b() {
        hp.k kVar;
        try {
            t tVar = this.f11604e;
            tVar.f11608a.f18662m.a(t.a(tVar, this.f11600a, this.f11601b), new s(this.f11604e, this.f11602c));
        } catch (RemoteException e10) {
            kVar = this.f11604e.f11609b;
            Object[] objArr = {this.f11603d};
            kVar.getClass();
            if (Log.isLoggable("PlayCore", 6)) {
                Log.e("PlayCore", hp.k.b(kVar.f18642a, "requestIntegrityToken(%s)", objArr), e10);
            }
            this.f11602c.trySetException(new IntegrityServiceException(-100, e10));
        }
    }
}
