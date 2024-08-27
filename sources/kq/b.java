package kq;

import android.content.Context;
import bq.p;
import com.google.firebase.perf.FirebasePerfRegistrar;
import com.google.firebase.remoteconfig.RemoteConfigRegistrar;
import java.util.concurrent.Executor;
import m.a4;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements bq.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f23457a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p f23458b;

    public /* synthetic */ b(p pVar, int i10) {
        this.f23457a = i10;
        this.f23458b = pVar;
    }

    @Override // bq.d
    public final Object h(a4 a4Var) {
        tq.b lambda$getComponents$0;
        int i10 = this.f23457a;
        p pVar = this.f23458b;
        switch (i10) {
            case 0:
                return new d((Context) a4Var.a(Context.class), ((pp.g) a4Var.a(pp.g.class)).f(), a4Var.f(p.a(e.class)), a4Var.b(hr.b.class), (Executor) a4Var.e(pVar));
            case 1:
                lambda$getComponents$0 = FirebasePerfRegistrar.lambda$getComponents$0(pVar, a4Var);
                return lambda$getComponents$0;
            default:
                return RemoteConfigRegistrar.a(pVar, a4Var);
        }
    }
}
