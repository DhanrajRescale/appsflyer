package tb;

import b0.h1;
import com.assetgro.stockgro.feature_social.presentation.feed.comments.CommentsViewModel;
import com.assetgro.stockgro.feature_social.presentation.feed.streams.FeedStreamViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n1.s0;
import t0.g1;
import t0.l3;
import t0.m2;
import t0.r1;
import vt.i0;

/* loaded from: classes.dex */
public final class s extends iu.k implements hu.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ FeedStreamViewModel f35769a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l3 f35770b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f35771c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sb.c f35772d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f35773e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f35774f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f35775g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Function0 f35776h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Function2 f35777i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ hu.c f35778j;

    /* renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Function1 f35779k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Function1 f35780l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Function0 f35781m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Function0 f35782n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Function1 f35783o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ g1 f35784p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ g1 f35785q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Function0 f35786r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ CommentsViewModel f35787s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Function2 f35788t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(FeedStreamViewModel feedStreamViewModel, l3 l3Var, List list, sb.c cVar, boolean z10, boolean z11, boolean z12, Function0 function0, Function2 function2, hu.c cVar2, Function1 function1, Function1 function12, Function0 function02, Function0 function03, Function1 function13, g1 g1Var, g1 g1Var2, Function0 function04, CommentsViewModel commentsViewModel, Function2 function22) {
        super(3);
        this.f35769a = feedStreamViewModel;
        this.f35770b = l3Var;
        this.f35771c = list;
        this.f35772d = cVar;
        this.f35773e = z10;
        this.f35774f = z11;
        this.f35775g = z12;
        this.f35776h = function0;
        this.f35777i = function2;
        this.f35778j = cVar2;
        this.f35779k = function1;
        this.f35780l = function12;
        this.f35781m = function02;
        this.f35782n = function03;
        this.f35783o = function13;
        this.f35784p = g1Var;
        this.f35785q = g1Var2;
        this.f35786r = function04;
        this.f35787s = commentsViewModel;
        this.f35788t = function22;
    }

    @Override // hu.c
    public final Object b(Object obj, Object obj2, Object obj3) {
        boolean z10;
        int i10;
        h1 paddingValue = (h1) obj;
        t0.n nVar = (t0.n) obj2;
        int intValue = ((Number) obj3).intValue();
        Intrinsics.checkNotNullParameter(paddingValue, "paddingValue");
        if ((intValue & 14) == 0) {
            if (((t0.r) nVar).h(paddingValue)) {
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
        g1.o n10 = androidx.compose.foundation.layout.a.n(androidx.compose.foundation.layout.d.c(androidx.compose.foundation.layout.a.s(g1.l.f16404b, paddingValue), 1.0f));
        List list = this.f35771c;
        sb.c cVar = this.f35772d;
        boolean z11 = this.f35773e;
        boolean z12 = this.f35774f;
        boolean z13 = this.f35775g;
        Function0 function0 = this.f35776h;
        Function2 function2 = this.f35777i;
        hu.c cVar2 = this.f35778j;
        Function1 function1 = this.f35779k;
        Function1 function12 = this.f35780l;
        Function0 function02 = this.f35781m;
        Function0 function03 = this.f35782n;
        Function1 function13 = this.f35783o;
        t0.r rVar2 = (t0.r) nVar;
        rVar2.b0(733328855);
        b0.v c10 = b0.s.c(g1.a.f16379a, false, rVar2, 0);
        rVar2.b0(-1323940314);
        int i11 = rVar2.P;
        r1 o10 = rVar2.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(n10);
        if (rVar2.f35166a instanceof t0.f) {
            rVar2.e0();
            if (rVar2.O) {
                rVar2.n(jVar);
            } else {
                rVar2.n0();
            }
            t0.t.v0(rVar2, c10, c2.k.f7749e);
            t0.t.v0(rVar2, o10, c2.k.f7748d);
            c2.i iVar = c2.k.f7750f;
            if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i11))) {
                nn.d.s(i11, rVar2, i11, iVar);
            }
            nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
            FeedStreamViewModel feedStreamViewModel = this.f35769a;
            yk.j.B(((sb.d) feedStreamViewModel.f8837r.getValue()).f34452j, feedStreamViewModel.f8839t, list, ((Number) this.f35770b.getValue()).intValue(), cVar, z11, z12, z13, function0, function2, cVar2, function1, function12, function02, function03, function13, rVar2, 905970176, 224694, 0);
            rVar2.b0(-1642940167);
            g1 g1Var = this.f35784p;
            Object value = g1Var.getValue();
            g1 g1Var2 = this.f35785q;
            if (value == null && g1Var2.getValue() == null) {
                z10 = false;
            } else {
                z10 = false;
                b0.s.a(androidx.compose.foundation.a.k(androidx.compose.foundation.a.e(androidx.compose.foundation.layout.d.f1286c, n1.t.c(n1.t.f28170b, 0.5f), s0.f28162a), r.f35768a, 6), rVar2, 0);
            }
            rVar2.s(z10);
            if (g1Var.getValue() != null) {
                rVar2.b0(608800060);
                ut.p pVar = (ut.p) g1Var.getValue();
                if (pVar == null) {
                    pVar = new ut.p(null, null, i0.f38321a);
                }
                yk.o.r(pVar, this.f35786r, rVar2, 56);
                rVar2.s(z10);
            } else if (g1Var2.getValue() != null) {
                rVar2.b0(609088329);
                hb.u uVar = (hb.u) g1Var2.getValue();
                if (uVar != null) {
                    yk.j.i(uVar.f18230a, this.f35787s, this.f35788t, rVar2, 448);
                }
                rVar2.s(z10);
            } else {
                rVar2.b0(609457353);
                rVar2.s(z10);
            }
            v.e.y(rVar2, z10, true, z10, z10);
            return Unit.f23355a;
        }
        al.d.v0();
        throw null;
    }
}
