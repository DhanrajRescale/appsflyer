package pd;

import b0.h1;
import com.assetgro.stockgro.ui.chat.create.GroupCreateViewModel;
import d2.d3;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import t0.g1;
import t0.l3;
import v.r0;
import v.u0;
import w.f1;
import w.x1;

/* loaded from: classes.dex */
public final class x extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1 f30985a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e1.s f30986b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ GroupCreateViewModel f30987c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g1 f30988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ g1 f30989e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p0.o f30990f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ l3 f30991g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ d3 f30992h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ h7.b f30993i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ h7.b f30994j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ h7.b f30995k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ g1 f30996l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(g1 g1Var, e1.s sVar, GroupCreateViewModel groupCreateViewModel, g1 g1Var2, g1 g1Var3, p0.o oVar, g1 g1Var4, d3 d3Var, h7.b bVar, h7.b bVar2, h7.b bVar3, g1 g1Var5) {
        super(3);
        this.f30985a = g1Var;
        this.f30986b = sVar;
        this.f30987c = groupCreateViewModel;
        this.f30988d = g1Var2;
        this.f30989e = g1Var3;
        this.f30990f = oVar;
        this.f30991g = g1Var4;
        this.f30992h = d3Var;
        this.f30993i = bVar;
        this.f30994j = bVar2;
        this.f30995k = bVar3;
        this.f30996l = g1Var5;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        int i10;
        h1 it = (h1) obj;
        t0.n nVar = (t0.n) obj2;
        int intValue = ((Number) obj3).intValue();
        Intrinsics.checkNotNullParameter(it, "it");
        if ((intValue & 14) == 0) {
            if (((t0.r) nVar).h(it)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            intValue |= i10;
        }
        if ((intValue & 91) == 18) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        boolean booleanValue = ((Boolean) this.f30985a.getValue()).booleanValue();
        x1 x10 = w.e.x(400, 0, null, 6);
        h hVar = h.f30890b;
        f1 f1Var = androidx.compose.animation.b.f1168a;
        iu.j.d(booleanValue, null, new v.h0(new u0(null, new r0(x10, new v.c0(4, hVar)), null, false, null, 61)).b(androidx.compose.animation.b.c(w.e.x(400, 0, null, 6), 2)), androidx.compose.animation.b.f(w.e.v(10000.0f, null, 5), h.f30891c).b(androidx.compose.animation.b.d()), null, b1.d.c(-1210698331, new q(this.f30985a, this.f30986b, this.f30987c, this.f30988d, this.f30989e), nVar), nVar, 200064, 18);
        iu.j.d(!((Boolean) r1.getValue()).booleanValue(), null, new v.h0(new u0(null, new r0(w.e.x(400, 0, null, 6), new v.c0(4, h.f30894f)), null, false, null, 61)).b(androidx.compose.animation.b.c(w.e.x(400, 0, null, 6), 2)), androidx.compose.animation.b.f(w.e.v(10000.0f, null, 5), h.f30895g).b(androidx.compose.animation.b.d()), null, b1.d.c(-1426728612, new w(it, this.f30990f, this.f30991g, this.f30992h, this.f30986b, this.f30993i, this.f30994j, this.f30995k, this.f30996l, this.f30985a, 0), nVar), nVar, 200064, 18);
        return Unit.f23355a;
    }
}
