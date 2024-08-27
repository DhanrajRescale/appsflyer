package lf;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.l1;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.homedata.ListItem;
import com.assetgro.stockgro.prod.R;
import d2.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.n5;
import m0.o5;
import okhttp3.HttpUrl;
import t0.m2;
import t0.r1;

/* loaded from: classes.dex */
public final class s extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g1.o f24772a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f24773b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Function2 f24774c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ListItem f24775d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ AnalyticEvent f24776e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f24777f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ String f24778g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f24779h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(g1.o oVar, int i10, Function2 function2, ListItem listItem, AnalyticEvent analyticEvent, int i11, String str, long j10) {
        super(2);
        this.f24772a = oVar;
        this.f24773b = i10;
        this.f24774c = function2;
        this.f24775d = listItem;
        this.f24776e = analyticEvent;
        this.f24777f = i11;
        this.f24778g = str;
        this.f24779h = j10;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        String str;
        String str2;
        t0.n nVar = (t0.n) obj;
        if ((((Number) obj2).intValue() & 11) == 2) {
            t0.r rVar = (t0.r) nVar;
            if (rVar.G()) {
                rVar.V();
                return Unit.f23355a;
            }
        }
        g1.o oVar = this.f24772a;
        t0.r rVar2 = (t0.r) nVar;
        rVar2.b0(-1460288361);
        Object Q = rVar2.Q();
        to.e eVar = t0.m.f35080a;
        if (Q == eVar) {
            Q = v.e.e(rVar2);
        }
        rVar2.s(false);
        o5 b10 = n5.b(w0.e(R.color.purple_663549E3, rVar2));
        Function2 function2 = this.f24774c;
        AnalyticEvent analyticEvent = this.f24776e;
        ListItem listItem = this.f24775d;
        g1.o j10 = androidx.compose.foundation.a.j(oVar, (a0.l) Q, b10, false, null, new r(0, analyticEvent, listItem, function2), 28);
        rVar2.b0(-1460279001);
        int i10 = this.f24773b;
        boolean f10 = rVar2.f(i10);
        Object Q2 = rVar2.Q();
        if (f10 || Q2 == eVar) {
            Q2 = new l1.i(i10, 5);
            rVar2.k0(Q2);
        }
        rVar2.s(false);
        g1.o a10 = h2.l.a(j10, false, (Function1) Q2);
        int i11 = this.f24777f;
        long j11 = this.f24779h;
        rVar2.b0(733328855);
        b0.v c10 = b0.s.c(g1.a.f16379a, false, rVar2, 0);
        rVar2.b0(-1323940314);
        int i12 = rVar2.P;
        r1 o10 = rVar2.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j12 = androidx.compose.ui.layout.a.j(a10);
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
            if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i12))) {
                nn.d.s(i12, rVar2, i12, iVar3);
            }
            nn.d.q(0, j12, new m2(rVar2), rVar2, 2058660585);
            g1.l lVar = g1.l.f16404b;
            g1.o t10 = androidx.compose.foundation.layout.a.t(lVar, 12);
            g1.e eVar2 = g1.a.f16391m;
            rVar2.b0(-483455358);
            l1 a11 = b0.y.a(b0.n.f2937c, eVar2, rVar2, 48);
            rVar2.b0(-1323940314);
            int i13 = rVar2.P;
            r1 o11 = rVar2.o();
            b1.c j13 = androidx.compose.ui.layout.a.j(t10);
            if (z10) {
                rVar2.e0();
                if (rVar2.O) {
                    rVar2.n(jVar);
                } else {
                    rVar2.n0();
                }
                t0.t.v0(rVar2, a11, iVar);
                t0.t.v0(rVar2, o11, iVar2);
                if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i13))) {
                    nn.d.s(i13, rVar2, i13, iVar3);
                }
                j13.b(new m2(rVar2), rVar2, 0);
                rVar2.b0(2058660585);
                y8.h hVar = new y8.h((Context) rVar2.m(AndroidCompositionLocals_androidKt.f1428b));
                hVar.f41338c = listItem.getImageUrl();
                hVar.b();
                y8.j a12 = hVar.a();
                g1.o oVar2 = this.f24772a;
                q6.l.d(a12, "User photo", h2.l.a(androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.d.m(oVar2, 40), h0.h.f17801a), false, d.f24671q), a2.k.f101f, rVar2, 1572920, 4024);
                float f11 = 8;
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f11), rVar2);
                String title = listItem.getTitle();
                if (title == null) {
                    title = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                long c11 = n1.t.c(w0.e(R.color.black_1A1A1A, rVar2), 0.6f);
                o2.v vVar = jh.c.f21373b;
                al.d.C(title, h2.l.a(oVar2, false, d.f24672r), c11, 0L, null, null, vVar, 0L, null, null, 0L, 2, false, i11, 0, null, null, rVar2, 1572864, 48, 120760);
                androidx.compose.foundation.layout.a.c(b0.z.a(lVar), rVar2);
                String subtitle = listItem.getSubtitle();
                if (subtitle == null) {
                    str = HttpUrl.FRAGMENT_ENCODE_SET;
                } else {
                    str = subtitle;
                }
                al.d.C(str, h2.l.a(oVar2, false, d.f24673s), w0.e(R.color.black_1A1A1A, rVar2), yk.j.e1(12), null, null, vVar, 0L, null, null, 0L, 2, false, 1, 0, null, null, rVar2, 1575936, 3120, 120752);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f11), rVar2);
                String str3 = this.f24778g;
                if (str3 == null) {
                    str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                } else {
                    str2 = str3;
                }
                al.d.C(str2, h2.l.a(oVar2, false, d.f24674t), j11, yk.j.e1(10), null, null, jh.c.f21372a, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1575936, 0, 130992);
                v.e.y(rVar2, false, true, false, false);
                v.e.y(rVar2, false, true, false, false);
                return Unit.f23355a;
            }
            al.d.v0();
            throw null;
        }
        al.d.v0();
        throw null;
    }
}
