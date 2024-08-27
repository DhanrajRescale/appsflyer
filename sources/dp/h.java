package dp;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;
import ll.o;

/* loaded from: classes2.dex */
public abstract class h extends ep.i {

    /* renamed from: a, reason: collision with root package name */
    public final o f14452a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f14453b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ k f14454c;

    public h(k kVar, o oVar, TaskCompletionSource taskCompletionSource) {
        this.f14454c = kVar;
        attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
        this.f14452a = oVar;
        this.f14453b = taskCompletionSource;
    }

    @Override // ep.j
    public void f(Bundle bundle) {
        this.f14454c.f14458a.c(this.f14453b);
        this.f14452a.k("onRequestInfo", new Object[0]);
    }

    @Override // ep.j
    public void g(Bundle bundle) {
        this.f14454c.f14458a.c(this.f14453b);
        this.f14452a.k("onCompleteUpdate", new Object[0]);
    }
}
