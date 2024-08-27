package r0;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes.dex */
public final class i2 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32442a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b0.x1 f32443b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ a2.k1 f32444c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ List f32445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f32446e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ List f32447f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Integer f32448g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ hu.c f32449h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2(b0.x1 x1Var, a2.k1 k1Var, ArrayList arrayList, int i10, ArrayList arrayList2, Integer num, hu.c cVar, int i11) {
        super(2);
        this.f32442a = i11;
        this.f32443b = x1Var;
        this.f32444c = k1Var;
        this.f32445d = arrayList;
        this.f32446e = i10;
        this.f32447f = arrayList2;
        this.f32448g = num;
        this.f32449h = cVar;
    }

    public final void a(t0.n nVar, int i10) {
        float N;
        float a10;
        float N2;
        float a11;
        int i11 = this.f32442a;
        hu.c cVar = this.f32449h;
        Integer num = this.f32448g;
        List list = this.f32447f;
        int i12 = this.f32446e;
        List list2 = this.f32445d;
        a2.k1 k1Var = this.f32444c;
        b0.x1 x1Var = this.f32443b;
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
                    N = u0Var.c();
                } else {
                    N = k1Var.N(i12);
                }
                if (!list.isEmpty() && num != null) {
                    a10 = k1Var.N(num.intValue());
                } else {
                    a10 = u0Var.a();
                }
                cVar.b(new b0.i1(androidx.compose.foundation.layout.a.h(u0Var, k1Var.getLayoutDirection()), N, androidx.compose.foundation.layout.a.g(u0Var, k1Var.getLayoutDirection()), a10), nVar, 0);
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
                    N2 = u0Var2.c();
                } else {
                    N2 = k1Var.N(i12);
                }
                if (!list.isEmpty() && num != null) {
                    a11 = k1Var.N(num.intValue());
                } else {
                    a11 = u0Var2.a();
                }
                cVar.b(new b0.i1(androidx.compose.foundation.layout.a.h(u0Var2, k1Var.getLayoutDirection()), N2, androidx.compose.foundation.layout.a.g(u0Var2, k1Var.getLayoutDirection()), a11), nVar, 0);
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f32442a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
