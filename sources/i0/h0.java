package i0;

import d2.d3;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class h0 extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18943a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q1 f18944b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0(q1 q1Var, int i10) {
        super(1);
        this.f18943a = i10;
        this.f18944b = q1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function1 function1;
        Unit unit;
        String str;
        int i10 = this.f18943a;
        boolean z10 = false;
        q1 q1Var = this.f18944b;
        switch (i10) {
            case 0:
                a2.u uVar = (a2.u) obj;
                s2 d10 = q1Var.d();
                if (d10 != null) {
                    d10.f19196c = uVar;
                }
                return Unit.f23355a;
            case 1:
                q1Var.f19150q.setValue(Boolean.valueOf(((Boolean) obj).booleanValue()));
                return Unit.f23355a;
            case 2:
                List list = (List) obj;
                if (q1Var.d() != null) {
                    s2 d11 = q1Var.d();
                    Intrinsics.c(d11);
                    list.add(d11.f19194a);
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 3:
                int i11 = ((p2.n) obj).f30594a;
                m1 m1Var = q1Var.f19151r;
                m1Var.getClass();
                if (p2.n.a(i11, 7)) {
                    function1 = m1Var.a().f19087a;
                } else if (p2.n.a(i11, 2)) {
                    function1 = m1Var.a().f19088b;
                } else if (p2.n.a(i11, 6)) {
                    function1 = m1Var.a().f19089c;
                } else if (p2.n.a(i11, 5)) {
                    function1 = m1Var.a().f19090d;
                } else if (p2.n.a(i11, 3)) {
                    function1 = m1Var.a().f19091e;
                } else if (p2.n.a(i11, 4)) {
                    function1 = m1Var.a().f19092f;
                } else if (p2.n.a(i11, 1) || p2.n.a(i11, 0)) {
                    function1 = null;
                } else {
                    throw new IllegalStateException("invalid ImeAction".toString());
                }
                if (function1 != null) {
                    function1.invoke(m1Var);
                    unit = Unit.f23355a;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    if (p2.n.a(i11, 6)) {
                        l1.f fVar = m1Var.f19056c;
                        if (fVar != null) {
                            ((androidx.compose.ui.focus.b) fVar).c(1);
                        } else {
                            Intrinsics.k("focusManager");
                            throw null;
                        }
                    } else if (p2.n.a(i11, 5)) {
                        l1.f fVar2 = m1Var.f19056c;
                        if (fVar2 != null) {
                            ((androidx.compose.ui.focus.b) fVar2).c(2);
                        } else {
                            Intrinsics.k("focusManager");
                            throw null;
                        }
                    } else if (p2.n.a(i11, 7)) {
                        d3 d3Var = m1Var.f19054a;
                        if (d3Var != null) {
                            ((d2.u1) d3Var).a();
                        }
                    } else if (!p2.n.a(i11, 2) && !p2.n.a(i11, 3)) {
                        p2.n.a(i11, 4);
                    }
                }
                return Unit.f23355a;
            default:
                p2.c0 c0Var = (p2.c0) obj;
                String str2 = c0Var.f30522a.f20699a;
                j2.e eVar = q1Var.f19143j;
                if (eVar != null) {
                    str = eVar.f20699a;
                } else {
                    str = null;
                }
                if (!Intrinsics.a(str2, str)) {
                    q1Var.f19144k.setValue(a1.f18782a);
                }
                q1Var.f19152s.invoke(c0Var);
                t0.x1 x1Var = (t0.x1) q1Var.f19135b;
                t0.y1 y1Var = x1Var.f35243b;
                if (y1Var != null) {
                    y1Var.d(x1Var, null);
                }
                return Unit.f23355a;
        }
    }
}
