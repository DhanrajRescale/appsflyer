package rq;

import bq.d;
import bq.p;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;
import m.a4;
import qu.f1;
import wp.c;

/* loaded from: classes2.dex */
public final class b implements d {

    /* renamed from: b, reason: collision with root package name */
    public static final b f33974b = new b(0);

    /* renamed from: c, reason: collision with root package name */
    public static final b f33975c = new b(1);

    /* renamed from: d, reason: collision with root package name */
    public static final b f33976d = new b(2);

    /* renamed from: e, reason: collision with root package name */
    public static final b f33977e = new b(3);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33978a;

    public /* synthetic */ b(int i10) {
        this.f33978a = i10;
    }

    public final f1 a(a4 a4Var) {
        switch (this.f33978a) {
            case 0:
                Object e10 = a4Var.e(new p(wp.a.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(e10, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new f1((Executor) e10);
            case 1:
                Object e11 = a4Var.e(new p(c.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(e11, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new f1((Executor) e11);
            case 2:
                Object e12 = a4Var.e(new p(wp.b.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(e12, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new f1((Executor) e12);
            default:
                Object e13 = a4Var.e(new p(wp.d.class, Executor.class));
                Intrinsics.checkNotNullExpressionValue(e13, "c.get(Qualified.qualifie…a, Executor::class.java))");
                return new f1((Executor) e13);
        }
    }

    @Override // bq.d
    public final /* bridge */ /* synthetic */ Object h(a4 a4Var) {
        switch (this.f33978a) {
            case 0:
                return a(a4Var);
            case 1:
                return a(a4Var);
            case 2:
                return a(a4Var);
            default:
                return a(a4Var);
        }
    }
}
