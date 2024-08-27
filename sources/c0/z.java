package c0;

import a2.z0;
import g7.a1;
import g7.b1;
import g7.y0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import m0.v4;
import m0.w4;
import m0.x4;
import t0.g1;

/* loaded from: classes.dex */
public final class z extends iu.k implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7622a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f7623b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f7624c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f7625d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f7626e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(b1 b1Var, h.c cVar) {
        super(1);
        y0 y0Var = y0.f17134c;
        this.f7622a = 3;
        this.f7623b = false;
        this.f7624c = b1Var;
        this.f7625d = y0Var;
        this.f7626e = cVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        a1 a1Var;
        a1 a1Var2;
        int i10 = this.f7622a;
        Object obj2 = this.f7626e;
        Object obj3 = this.f7624c;
        Object obj4 = this.f7625d;
        boolean z10 = this.f7623b;
        switch (i10) {
            case 0:
                z0 z0Var = (z0) obj;
                List list = (List) obj3;
                b0 b0Var = (b0) obj4;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    b0 b0Var2 = (b0) list.get(i11);
                    if (b0Var2 != b0Var) {
                        b0Var2.b(z0Var);
                    }
                }
                if (b0Var != null) {
                    b0Var.b(z0Var);
                }
                ((g1) obj2).getValue();
                return Unit.f23355a;
            case 1:
                c2.j0 j0Var = (c2.j0) ((p1.e) obj);
                j0Var.a();
                if (((Boolean) ((Function0) obj3).mo2invoke()).booleanValue()) {
                    if (z10) {
                        p1.c cVar = j0Var.f7740a;
                        long p02 = cVar.p0();
                        p1.b bVar = cVar.f30501b;
                        long b10 = bVar.b();
                        bVar.a().h();
                        bVar.f30498a.c(-1.0f, 1.0f, p02);
                        p1.h.r0(j0Var, (n1.h0) obj4, (n1.u) obj2);
                        bVar.a().s();
                        bVar.c(b10);
                    } else {
                        p1.h.r0(j0Var, (n1.h0) obj4, (n1.u) obj2);
                    }
                }
                return Unit.f23355a;
            case 2:
                float f10 = v4.f26945a;
                w4 w4Var = new w4((x4) obj, (w.n) obj4, z10, (Function1) obj2);
                w4Var.f27021c = (w2.b) obj3;
                return w4Var;
            default:
                g7.c0 c0Var = (g7.c0) obj;
                if (c0Var == null || (a1Var = c0Var.f16685d) == null) {
                    a1Var = a1.f16645f;
                }
                if (c0Var != null) {
                    a1Var2 = c0Var.f16686e;
                } else {
                    a1Var2 = null;
                }
                if (z10) {
                    a1Var2 = a1.f16645f.b((b1) obj3, (g7.z0) obj4);
                } else {
                    a1Var = a1Var.b((b1) obj3, (g7.z0) obj4);
                }
                return h.c.i((h.c) obj2, c0Var, a1Var, a1Var2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ArrayList arrayList, b0 b0Var, boolean z10, g1 g1Var) {
        super(1);
        this.f7622a = 0;
        this.f7624c = arrayList;
        this.f7625d = b0Var;
        this.f7623b = z10;
        this.f7626e = g1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Function0 function0, boolean z10, n1.h0 h0Var, n1.m mVar) {
        super(1);
        this.f7622a = 1;
        this.f7624c = function0;
        this.f7623b = z10;
        this.f7625d = h0Var;
        this.f7626e = mVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(w.n nVar, w2.b bVar, Function1 function1, boolean z10) {
        super(1);
        this.f7622a = 2;
        this.f7624c = bVar;
        this.f7625d = nVar;
        this.f7626e = function1;
        this.f7623b = z10;
    }
}
