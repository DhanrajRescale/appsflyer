package lf;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.l1;
import b0.o1;
import com.assetgro.stockgro.data.model.homedata.ListItem;
import com.assetgro.stockgro.data.model.homedata.Widget;
import com.assetgro.stockgro.prod.R;
import d2.w0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.n5;
import m0.o5;
import okhttp3.HttpUrl;
import t0.m2;
import t0.r1;

/* loaded from: classes.dex */
public final class c0 extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24649a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Widget f24650b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f24651c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Function2 f24652d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ListItem f24653e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f24654f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f24655g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c0(Widget widget, int i10, Function2 function2, ListItem listItem, int i11, long j10, int i12) {
        super(2);
        this.f24649a = i12;
        this.f24650b = widget;
        this.f24651c = i10;
        this.f24652d = function2;
        this.f24653e = listItem;
        this.f24654f = i11;
        this.f24655g = j10;
    }

    public final void a(t0.n nVar, int i10) {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        g1.e eVar = g1.a.f16391m;
        g1.g gVar = g1.a.f16379a;
        to.e eVar2 = t0.m.f35080a;
        androidx.work.u uVar = a2.k.f101f;
        g1.l lVar = g1.l.f16404b;
        int i11 = this.f24649a;
        ListItem listItem = this.f24653e;
        Function2 function2 = this.f24652d;
        int i12 = this.f24651c;
        Widget widget = this.f24650b;
        switch (i11) {
            case 0:
                if ((i10 & 11) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                t0.r rVar2 = (t0.r) nVar;
                rVar2.b0(-42198917);
                Object Q = rVar2.Q();
                if (Q == eVar2) {
                    Q = v.e.e(rVar2);
                }
                a0.l lVar2 = (a0.l) Q;
                rVar2.s(false);
                o5 b10 = n5.b(w0.e(R.color.purple_663549E3, rVar2));
                rVar2.b0(-42192494);
                boolean h10 = rVar2.h(widget) | rVar2.f(i12) | rVar2.h(function2) | rVar2.h(listItem);
                Widget widget2 = this.f24650b;
                int i13 = this.f24651c;
                Function2 function22 = this.f24652d;
                ListItem listItem2 = this.f24653e;
                Object Q2 = rVar2.Q();
                if (h10 || Q2 == eVar2) {
                    Q2 = new b0(widget2, i13, function22, listItem2, 0);
                    rVar2.k0(Q2);
                }
                rVar2.s(false);
                g1.o j10 = androidx.compose.foundation.a.j(lVar, lVar2, b10, false, null, (Function0) Q2, 28);
                rVar2.b0(-42183221);
                boolean f10 = rVar2.f(i12);
                Object Q3 = rVar2.Q();
                if (f10 || Q3 == eVar2) {
                    Q3 = new l1.i(i12, 6);
                    rVar2.k0(Q3);
                }
                rVar2.s(false);
                g1.o a10 = h2.l.a(j10, false, (Function1) Q3);
                int i14 = this.f24654f;
                long j11 = this.f24655g;
                rVar2.b0(733328855);
                b0.v c10 = b0.s.c(gVar, false, rVar2, 0);
                rVar2.b0(-1323940314);
                int i15 = rVar2.P;
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
                    if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i15))) {
                        nn.d.s(i15, rVar2, i15, iVar3);
                    }
                    v.e.w(rVar2, j12, rVar2, 0, 2058660585);
                    g1.o t10 = androidx.compose.foundation.layout.a.t(lVar, 12);
                    rVar2.b0(-483455358);
                    l1 a11 = b0.y.a(b0.n.f2937c, eVar, rVar2, 48);
                    rVar2.b0(-1323940314);
                    int i16 = rVar2.P;
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
                        if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i16))) {
                            nn.d.s(i16, rVar2, i16, iVar3);
                        }
                        j13.b(new m2(rVar2), rVar2, 0);
                        rVar2.b0(2058660585);
                        y8.h hVar = new y8.h((Context) rVar2.m(AndroidCompositionLocals_androidKt.f1428b));
                        hVar.f41338c = listItem.getImageUrl();
                        hVar.b();
                        y8.j a12 = hVar.a();
                        q1.b u10 = w0.u(R.drawable.ic_placeholder_user, rVar2, 6);
                        g1.o m10 = androidx.compose.foundation.layout.d.m(lVar, 48);
                        h0.g gVar2 = h0.h.f17801a;
                        q6.l.c(a12, "User photo", h2.l.a(androidx.compose.foundation.a.g(androidx.compose.ui.draw.a.b(m10, gVar2), 1, w0.e(R.color.lightColorSeparator, rVar2), gVar2), false, a0.f24619e), u10, null, uVar, null, rVar2, 4152, 6, 64496);
                        float f11 = 8;
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f11), rVar2);
                        String title = listItem.getTitle();
                        if (title == null) {
                            str = HttpUrl.FRAGMENT_ENCODE_SET;
                        } else {
                            str = title;
                        }
                        al.d.C(str, h2.l.a(lVar, false, a0.f24620f), w0.e(R.color.black_1A1A1A, rVar2), 0L, null, null, jh.c.f21373b, 0L, null, null, 0L, 2, false, i14, 0, null, null, rVar2, 1572864, 48, 120760);
                        androidx.compose.foundation.layout.a.c(b0.z.a(lVar), rVar2);
                        String subtitle = listItem.getSubtitle();
                        if (subtitle == null) {
                            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                        } else {
                            str2 = subtitle;
                        }
                        long e10 = w0.e(R.color.black_1A1A1A, rVar2);
                        o2.v vVar = jh.c.f21375d;
                        al.d.C(str2, h2.l.a(lVar, false, a0.f24621g), e10, 0L, null, null, vVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1572864, 0, 131000);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f11), rVar2);
                        String subtitleExtra = listItem.getSubtitleExtra();
                        if (subtitleExtra == null) {
                            subtitleExtra = "0 (0%)";
                        }
                        al.d.C(subtitleExtra, h2.l.a(lVar, false, a0.f24622h), j11, yk.j.e1(12), null, null, vVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1575936, 0, 130992);
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
                if ((i10 & 11) == 2) {
                    t0.r rVar3 = (t0.r) nVar;
                    if (rVar3.G()) {
                        rVar3.V();
                        return;
                    }
                }
                t0.r rVar4 = (t0.r) nVar;
                rVar4.b0(-1959867432);
                Object Q4 = rVar4.Q();
                if (Q4 == eVar2) {
                    Q4 = v.e.e(rVar4);
                }
                a0.l lVar3 = (a0.l) Q4;
                rVar4.s(false);
                o5 b11 = n5.b(w0.e(R.color.purple_663549E3, rVar4));
                rVar4.b0(-1959861009);
                boolean h11 = rVar4.h(widget) | rVar4.f(i12) | rVar4.h(function2) | rVar4.h(listItem);
                Widget widget3 = this.f24650b;
                int i17 = this.f24651c;
                Function2 function23 = this.f24652d;
                ListItem listItem3 = this.f24653e;
                Object Q5 = rVar4.Q();
                if (h11 || Q5 == eVar2) {
                    Q5 = new b0(widget3, i17, function23, listItem3, 1);
                    rVar4.k0(Q5);
                }
                rVar4.s(false);
                g1.o j14 = androidx.compose.foundation.a.j(lVar, lVar3, b11, false, null, (Function0) Q5, 28);
                int i18 = this.f24654f;
                long j15 = this.f24655g;
                rVar4.b0(733328855);
                b0.v c11 = b0.s.c(gVar, false, rVar4, 0);
                rVar4.b0(-1323940314);
                int i19 = rVar4.P;
                r1 o12 = rVar4.o();
                c2.l.M.getClass();
                c2.j jVar2 = c2.k.f7746b;
                b1.c j16 = androidx.compose.ui.layout.a.j(j14);
                boolean z11 = rVar4.f35166a instanceof t0.f;
                if (z11) {
                    rVar4.e0();
                    if (rVar4.O) {
                        rVar4.n(jVar2);
                    } else {
                        rVar4.n0();
                    }
                    c2.i iVar4 = c2.k.f7749e;
                    t0.t.v0(rVar4, c11, iVar4);
                    c2.i iVar5 = c2.k.f7748d;
                    t0.t.v0(rVar4, o12, iVar5);
                    c2.i iVar6 = c2.k.f7750f;
                    if (rVar4.O || !Intrinsics.a(rVar4.Q(), Integer.valueOf(i19))) {
                        nn.d.s(i19, rVar4, i19, iVar6);
                    }
                    v.e.w(rVar4, j16, rVar4, 0, 2058660585);
                    g1.o a13 = h2.l.a(androidx.compose.foundation.layout.a.t(lVar, 12), false, f0.f24695d);
                    rVar4.b0(-483455358);
                    l1 a14 = b0.y.a(b0.n.f2937c, eVar, rVar4, 48);
                    rVar4.b0(-1323940314);
                    int i20 = rVar4.P;
                    r1 o13 = rVar4.o();
                    b1.c j17 = androidx.compose.ui.layout.a.j(a13);
                    if (z11) {
                        rVar4.e0();
                        if (rVar4.O) {
                            rVar4.n(jVar2);
                        } else {
                            rVar4.n0();
                        }
                        t0.t.v0(rVar4, a14, iVar4);
                        t0.t.v0(rVar4, o13, iVar5);
                        if (rVar4.O || !Intrinsics.a(rVar4.Q(), Integer.valueOf(i20))) {
                            nn.d.s(i20, rVar4, i20, iVar6);
                        }
                        j17.b(new m2(rVar4), rVar4, 0);
                        rVar4.b0(2058660585);
                        y8.h hVar2 = new y8.h((Context) rVar4.m(AndroidCompositionLocals_androidKt.f1428b));
                        hVar2.f41338c = listItem.getImageUrl();
                        hVar2.b();
                        y8.j a15 = hVar2.a();
                        q1.b u11 = w0.u(R.drawable.ic_placeholder_user, rVar4, 6);
                        g1.o m11 = androidx.compose.foundation.layout.d.m(lVar, 48);
                        h0.g gVar3 = h0.h.f17801a;
                        q6.l.c(a15, "User photo", h2.l.a(androidx.compose.foundation.a.g(androidx.compose.ui.draw.a.b(m11, gVar3), 1, w0.e(R.color.lightColorSeparator, rVar4), gVar3), false, f0.f24696e), u11, null, uVar, null, rVar4, 4152, 6, 64496);
                        float f12 = 8;
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f12), rVar4);
                        String title2 = listItem.getTitle();
                        if (title2 == null) {
                            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                        } else {
                            str3 = title2;
                        }
                        long e11 = w0.e(R.color.black_1A1A1A, rVar4);
                        o2.v vVar2 = jh.c.f21375d;
                        al.d.C(str3, h2.l.a(lVar, false, f0.f24697f), e11, 0L, null, null, vVar2, 0L, null, null, 0L, 2, false, i18, 0, null, null, rVar4, 1572864, 48, 120760);
                        androidx.compose.foundation.layout.a.c(b0.z.a(lVar), rVar4);
                        String subtitle2 = listItem.getSubtitle();
                        if (subtitle2 == null) {
                            str4 = HttpUrl.FRAGMENT_ENCODE_SET;
                        } else {
                            str4 = subtitle2;
                        }
                        al.d.C(str4, h2.l.a(lVar, false, f0.f24698g), w0.e(R.color.black_1A1A1A, rVar4), 0L, null, null, vVar2, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar4, 1572864, 0, 131000);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f12), rVar4);
                        g1.o a16 = h2.l.a(lVar, false, f0.f24699h);
                        b0.d dVar = b0.n.f2935a;
                        g1.f fVar = g1.a.f16389k;
                        rVar4.b0(693286680);
                        l1 a17 = o1.a(dVar, fVar, rVar4, 54);
                        rVar4.b0(-1323940314);
                        int i21 = rVar4.P;
                        r1 o14 = rVar4.o();
                        b1.c j18 = androidx.compose.ui.layout.a.j(a16);
                        if (z11) {
                            rVar4.e0();
                            if (rVar4.O) {
                                rVar4.n(jVar2);
                            } else {
                                rVar4.n0();
                            }
                            t0.t.v0(rVar4, a17, iVar4);
                            t0.t.v0(rVar4, o14, iVar5);
                            if (rVar4.O || !Intrinsics.a(rVar4.Q(), Integer.valueOf(i21))) {
                                nn.d.s(i21, rVar4, i21, iVar6);
                            }
                            v.e.w(rVar4, j18, rVar4, 0, 2058660585);
                            String subtitleExtra2 = listItem.getSubtitleExtra();
                            if (subtitleExtra2 == null) {
                                str5 = HttpUrl.FRAGMENT_ENCODE_SET;
                            } else {
                                str5 = subtitleExtra2;
                            }
                            al.d.C(str5, h2.l.a(lVar, false, f0.f24700i), j15, yk.j.e1(12), null, null, vVar2, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar4, 1575936, 0, 130992);
                            v.e.y(rVar4, false, true, false, false);
                            v.e.y(rVar4, false, true, false, false);
                            v.e.y(rVar4, false, true, false, false);
                            return;
                        }
                        al.d.v0();
                        throw null;
                    }
                    al.d.v0();
                    throw null;
                }
                al.d.v0();
                throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f24649a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }
}
