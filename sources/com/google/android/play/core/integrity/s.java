package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
final class s extends hp.i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ t f11605a;

    /* renamed from: b, reason: collision with root package name */
    private final hp.k f11606b;

    /* renamed from: c, reason: collision with root package name */
    private final TaskCompletionSource f11607c;

    public s(t tVar, TaskCompletionSource taskCompletionSource) {
        this.f11605a = tVar;
        attachInterface(this, "com.google.android.play.core.integrity.protocol.IIntegrityServiceCallback");
        this.f11606b = new hp.k("OnRequestIntegrityTokenCallback");
        this.f11607c = taskCompletionSource;
    }

    @Override // hp.j
    public final void b(Bundle bundle) {
        hp.o oVar = this.f11605a.f11608a;
        TaskCompletionSource taskCompletionSource = this.f11607c;
        synchronized (oVar.f18655f) {
            oVar.f18654e.remove(taskCompletionSource);
        }
        synchronized (oVar.f18655f) {
            try {
                if (oVar.f18660k.get() > 0 && oVar.f18660k.decrementAndGet() > 0) {
                    oVar.f18651b.a("Leaving the connection open for other ongoing calls.", new Object[0]);
                } else {
                    oVar.a().post(new hp.n(oVar, 0));
                }
            } finally {
            }
        }
        this.f11606b.a("onRequestIntegrityToken", new Object[0]);
        int i10 = bundle.getInt("error");
        if (i10 != 0) {
            this.f11607c.trySetException(new IntegrityServiceException(i10, null));
            return;
        }
        String string = bundle.getString("token");
        if (string == null) {
            this.f11607c.trySetException(new IntegrityServiceException(-100, null));
            return;
        }
        TaskCompletionSource taskCompletionSource2 = this.f11607c;
        d dVar = new d();
        dVar.a(string);
        taskCompletionSource2.trySetResult(dVar.b());
    }
}
