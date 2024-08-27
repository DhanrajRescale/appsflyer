package m0;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class p5 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f26635a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0.x1 f26636b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2.k1 f26637c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f26638d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f26639e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Integer f26640f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hu.c f26641g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p5(b0.x1 x1Var, a2.k1 k1Var, ArrayList arrayList, ArrayList arrayList2, Integer num, hu.c cVar, int i10) {
        super(2);
        this.f26635a = i10;
        this.f26636b = x1Var;
        this.f26637c = k1Var;
        this.f26638d = arrayList;
        this.f26639e = arrayList2;
        this.f26640f = num;
        this.f26641g = cVar;
    }

    public final void a(t0.n nVar, int i10) {
        float f10;
        float a10;
        float f11;
        float a11;
        int i11 = this.f26635a;
        hu.c cVar = this.f26641g;
        Integer num = this.f26640f;
        List list = this.f26639e;
        List list2 = this.f26638d;
        a2.k1 k1Var = this.f26637c;
        b0.x1 x1Var = this.f26636b;
        switch (i11) {
            case 0:
                if ((i10 & 3) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                b0.u0 u0Var = new b0.u0(x1Var, k1Var);
                if (list2.isEmpty()) {
                    f10 = u0Var.c();
                } else {
                    f10 = 0;
                }
                if (!list.isEmpty() && num != null) {
                    a10 = k1Var.N(num.intValue());
                } else {
                    a10 = u0Var.a();
                }
                cVar.b(new b0.i1(androidx.compose.foundation.layout.a.h(u0Var, k1Var.getLayoutDirection()), f10, androidx.compose.foundation.layout.a.g(u0Var, k1Var.getLayoutDirection()), a10), nVar, 0);
                return;
            default:
                if ((i10 & 3) == 2) {
                    t0.r rVar2 = (t0.r) nVar;
                    if (rVar2.G()) {
                        rVar2.V();
                        return;
                    }
                }
                b0.u0 u0Var2 = new b0.u0(x1Var, k1Var);
                if (list2.isEmpty()) {
                    f11 = u0Var2.c();
                } else {
                    f11 = 0;
                }
                if (!list.isEmpty() && num != null) {
                    a11 = k1Var.N(num.intValue());
                } else {
                    a11 = u0Var2.a();
                }
                cVar.b(new b0.i1(androidx.compose.foundation.layout.a.h(u0Var2, k1Var.getLayoutDirection()), f11, androidx.compose.foundation.layout.a.g(u0Var2, k1Var.getLayoutDirection()), a11), nVar, 0);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f26635a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
