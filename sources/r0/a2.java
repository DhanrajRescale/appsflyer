package r0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.homedata.ListItem;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.detail.members.AddMembersViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.n5;

/* loaded from: classes.dex */
public final class a2 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32318a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f32319b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f32320c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f32321d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f32322e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ut.d f32323f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(int i10, Function2 function2, ListItem listItem, AnalyticEvent analyticEvent, g1.o oVar) {
        super(2);
        this.f32318a = 2;
        this.f32319b = i10;
        this.f32323f = function2;
        this.f32320c = listItem;
        this.f32321d = analyticEvent;
        this.f32322e = oVar;
    }

    public final void a(t0.n nVar, int i10) {
        int i11 = this.f32318a;
        int i12 = this.f32319b;
        ut.d dVar = this.f32323f;
        Object obj = this.f32321d;
        Object obj2 = this.f32322e;
        Object obj3 = this.f32320c;
        switch (i11) {
            case 0:
                dp.b.J((h1) obj3, (Function0) obj, (b0.x1) obj2, (Function2) dVar, nVar, t0.t.H0(i12 | 1));
                return;
            case 1:
                yk.j.b((g1.o) obj3, (AddMembersViewModel) obj, (Function1) obj2, (Function1) dVar, nVar, t0.t.H0(i12 | 1));
                return;
            case 2:
                if ((i10 & 11) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                g1.l lVar = g1.l.f16404b;
                t0.r rVar2 = (t0.r) nVar;
                rVar2.b0(-459826916);
                Object Q = rVar2.Q();
                to.e eVar = t0.m.f35080a;
                if (Q == eVar) {
                    Q = v.e.e(rVar2);
                }
                rVar2.s(false);
                ListItem listItem = (ListItem) obj3;
                g1.o j10 = androidx.compose.foundation.a.j(lVar, (a0.l) Q, n5.b(d2.w0.e(R.color.purple_663549E3, rVar2)), false, null, new lf.r(5, (AnalyticEvent) obj, listItem, (Function2) dVar), 28);
                rVar2.b0(-459816659);
                boolean f10 = rVar2.f(i12);
                Object Q2 = rVar2.Q();
                if (f10 || Q2 == eVar) {
                    Q2 = new l1.i(i12, 11);
                    rVar2.k0(Q2);
                }
                rVar2.s(false);
                g1.o a10 = h2.l.a(j10, false, (Function1) Q2);
                g1.o oVar = (g1.o) obj2;
                rVar2.b0(733328855);
                b0.v c10 = b0.s.c(g1.a.f16379a, false, rVar2, 0);
                rVar2.b0(-1323940314);
                int i13 = rVar2.P;
                t0.r1 o10 = rVar2.o();
                c2.l.M.getClass();
                c2.j jVar = c2.k.f7746b;
                b1.c j11 = androidx.compose.ui.layout.a.j(a10);
                boolean z10 = rVar2.f35166a instanceof t0.f;
                if (z10) {
                    rVar2.e0();
                    if (rVar2.O) {
                        rVar2.n(jVar);
                    } else {
                        rVar2.n0();
                    }
                    c2.i iVar = c2.k.f7749e;
                    t0.t.v0(rVar2, c10, iVar);
                    c2.i iVar2 = c2.k.f7748d;
                    t0.t.v0(rVar2, o10, iVar2);
                    c2.i iVar3 = c2.k.f7750f;
                    if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i13))) {
                        nn.d.s(i13, rVar2, i13, iVar3);
                    }
                    nn.d.q(0, j11, new t0.m2(rVar2), rVar2, 2058660585);
                    g1.e eVar2 = g1.a.f16391m;
                    rVar2.b0(-483455358);
                    b0.l1 a11 = b0.y.a(b0.n.f2937c, eVar2, rVar2, 48);
                    rVar2.b0(-1323940314);
                    int i14 = rVar2.P;
                    t0.r1 o11 = rVar2.o();
                    b1.c j12 = androidx.compose.ui.layout.a.j(lVar);
                    if (z10) {
                        rVar2.e0();
                        if (rVar2.O) {
                            rVar2.n(jVar);
                        } else {
                            rVar2.n0();
                        }
                        t0.t.v0(rVar2, a11, iVar);
                        t0.t.v0(rVar2, o11, iVar2);
                        if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i14))) {
                            nn.d.s(i14, rVar2, i14, iVar3);
                        }
                        j12.b(new t0.m2(rVar2), rVar2, 0);
                        rVar2.b0(2058660585);
                        y8.h hVar = new y8.h((Context) rVar2.m(AndroidCompositionLocals_androidKt.f1428b));
                        hVar.f41338c = listItem.getImageUrl();
                        hVar.b();
                        q6.l.d(hVar.a(), "User photo", h2.l.a(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.q(oVar, 143), 80), false, lf.f0.f24710s), a2.k.f101f, rVar2, 1572920, 4024);
                        v.e.y(rVar2, false, true, false, false);
                        v.e.y(rVar2, false, true, false, false);
                        return;
                    }
                    al.d.v0();
                    throw null;
                }
                al.d.v0();
                throw null;
            default:
                zq.f.k((uh.i) obj3, (List) obj2, (Function0) obj, (Function1) dVar, nVar, t0.t.H0(1 | i12));
                return;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f32318a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 1:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            case 2:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a2(Object obj, Object obj2, Object obj3, ut.d dVar, int i10, int i11) {
        super(2);
        this.f32318a = i11;
        this.f32320c = obj;
        this.f32321d = obj2;
        this.f32322e = obj3;
        this.f32323f = dVar;
        this.f32319b = i10;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a2(uh.i iVar, List list, Function0 function0, Function1 function1, int i10) {
        super(2);
        this.f32318a = 3;
        this.f32320c = iVar;
        this.f32322e = list;
        this.f32321d = function0;
        this.f32323f = function1;
        this.f32319b = i10;
    }
}
