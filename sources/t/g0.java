package t;

import android.view.Choreographer;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import qu.o1;
import t0.f2;
import t0.z1;
import x.b1;
import x.d1;
import y.c2;

/* loaded from: classes.dex */
public final class g0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34859a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f34860b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g0(Object obj, int i10) {
        super(1);
        this.f34859a = i10;
        this.f34860b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:53:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Float a(float r22) {
        /*
            Method dump skipped, instructions count: 720
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.g0.a(float):java.lang.Float");
    }

    public final void d(a2.u uVar) {
        Function1 function1;
        int i10 = this.f34859a;
        Object obj = this.f34860b;
        switch (i10) {
            case 4:
                d1 d1Var = (d1) obj;
                if (d1Var.f16417m) {
                    d1Var.f39527n.invoke(uVar);
                    if (d1Var.f16417m) {
                        function1 = (Function1) d1Var.c(b1.f39509a);
                    } else {
                        function1 = null;
                    }
                    if (function1 != null) {
                        function1.invoke(uVar);
                        return;
                    }
                    return;
                }
                return;
            default:
                ((c2) obj).A.f40928t = uVar;
                return;
        }
    }

    public final void e(Object obj) {
        switch (this.f34859a) {
            case 19:
                ((t0.y) ((t0.e0) this.f34860b)).c(obj);
                return;
            case 20:
                if (obj instanceof e1.z) {
                    ((e1.z) obj).f(4);
                }
                ((d0) this.f34860b).d(obj);
                return;
            default:
                e1.v vVar = (e1.v) this.f34860b;
                if (!vVar.f14939h) {
                    synchronized (vVar.f14937f) {
                        e1.u uVar = vVar.f14940i;
                        Intrinsics.c(uVar);
                        Object obj2 = uVar.f14921b;
                        Intrinsics.c(obj2);
                        int i10 = uVar.f14923d;
                        y yVar = uVar.f14922c;
                        if (yVar == null) {
                            yVar = new y();
                            uVar.f14922c = yVar;
                            uVar.f14925f.l(obj2, yVar);
                            Unit unit = Unit.f23355a;
                        }
                        uVar.c(obj, i10, obj2, yVar);
                        Unit unit2 = Unit.f23355a;
                    }
                    return;
                }
                return;
        }
    }

    public final void invoke(Throwable th2) {
        switch (this.f34859a) {
            case 17:
                t0.h0.f35032b.removeFrameCallback((Choreographer.FrameCallback) this.f34860b);
                return;
            case 18:
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th2);
                f2 f2Var = (f2) this.f34860b;
                synchronized (f2Var.f34999b) {
                    try {
                        o1 o1Var = f2Var.f35000c;
                        if (o1Var != null) {
                            f2Var.f35015r.m(z1.f35279b);
                            o1Var.a(cancellationException);
                            f2Var.f35012o = null;
                            o1Var.I(new x.z(22, f2Var, th2));
                        } else {
                            f2Var.f35001d = cancellationException;
                            f2Var.f35015r.m(z1.f35278a);
                            Unit unit = Unit.f23355a;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                return;
            default:
                x1.m0 m0Var = (x1.m0) this.f34860b;
                qu.h hVar = m0Var.f39888c;
                if (hVar != null) {
                    hVar.r(th2);
                }
                m0Var.f39888c = null;
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:142:0x03a6, code lost:
    
        if (r7 != 0) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0373, code lost:
    
        if (r3 != r8.f28144a) goto L147;
     */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03ca  */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(java.lang.Object r46) {
        /*
            Method dump skipped, instructions count: 1644
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: t.g0.invoke(java.lang.Object):java.lang.Object");
    }
}
