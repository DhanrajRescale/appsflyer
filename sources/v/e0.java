package v;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f37495a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g0 f37496b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f37497c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(g0 g0Var, long j10, int i10) {
        super(1);
        this.f37495a = i10;
        this.f37496b = g0Var;
        this.f37497c = j10;
    }

    public final long a(z zVar) {
        long j10;
        long j11;
        Function1 function1;
        Function1 function12;
        int i10 = this.f37495a;
        g0 g0Var = this.f37496b;
        switch (i10) {
            case 1:
                long j12 = this.f37497c;
                if (g0Var.f37512v == null) {
                    return w2.h.f38791b;
                }
                if (g0Var.Q0() == null) {
                    return w2.h.f38791b;
                }
                if (Intrinsics.a(g0Var.f37512v, g0Var.Q0())) {
                    return w2.h.f38791b;
                }
                int ordinal = zVar.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            t tVar = g0Var.f37509s.f37532a.f37623c;
                            if (tVar != null) {
                                long j13 = ((w2.j) tVar.f37609b.invoke(new w2.j(j12))).f38798a;
                                g1.d Q0 = g0Var.Q0();
                                Intrinsics.c(Q0);
                                w2.k kVar = w2.k.f38799a;
                                long a10 = ((g1.g) Q0).a(j12, j13, kVar);
                                g1.d dVar = g0Var.f37512v;
                                Intrinsics.c(dVar);
                                long a11 = ((g1.g) dVar).a(j12, j13, kVar);
                                return hl.f.j(((int) (a10 >> 32)) - ((int) (a11 >> 32)), ((int) (a10 & 4294967295L)) - ((int) (a11 & 4294967295L)));
                            }
                            return w2.h.f38791b;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return w2.h.f38791b;
                }
                return w2.h.f38791b;
            default:
                r0 r0Var = g0Var.f37508r.f37527a.f37622b;
                long j14 = this.f37497c;
                if (r0Var != null && (function12 = r0Var.f37604a) != null) {
                    j10 = ((w2.h) function12.invoke(new w2.j(j14))).f38793a;
                } else {
                    j10 = w2.h.f38791b;
                }
                r0 r0Var2 = g0Var.f37509s.f37532a.f37622b;
                if (r0Var2 != null && (function1 = r0Var2.f37604a) != null) {
                    j11 = ((w2.h) function1.invoke(new w2.j(j14))).f38793a;
                } else {
                    j11 = w2.h.f38791b;
                }
                int ordinal2 = zVar.ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 == 2) {
                            return j11;
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return w2.h.f38791b;
                }
                return j10;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function1 function1;
        Function1 function12;
        switch (this.f37495a) {
            case 0:
                g0 g0Var = this.f37496b;
                g0Var.getClass();
                int ordinal = ((z) obj).ordinal();
                long j10 = this.f37497c;
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            t tVar = g0Var.f37509s.f37532a.f37623c;
                            if (tVar != null && (function12 = tVar.f37609b) != null) {
                                j10 = ((w2.j) function12.invoke(new w2.j(j10))).f38798a;
                            }
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                    }
                } else {
                    t tVar2 = g0Var.f37508r.f37527a.f37623c;
                    if (tVar2 != null && (function1 = tVar2.f37609b) != null) {
                        j10 = ((w2.j) function1.invoke(new w2.j(j10))).f38798a;
                    }
                }
                return new w2.j(j10);
            case 1:
                return new w2.h(a((z) obj));
            default:
                return new w2.h(a((z) obj));
        }
    }
}
