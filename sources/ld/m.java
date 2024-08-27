package ld;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.l1;
import b0.o1;
import b0.q1;
import b0.v;
import b0.y;
import com.assetgro.stockgro.feature_market.data.remote.Change;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.portfolio.history.model.IdentifierInfo;
import com.assetgro.stockgro.ui.portfolio.orders.model.FnoOrderResponseData;
import d2.w0;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import n1.s0;
import n1.t;
import okhttp3.HttpUrl;
import t0.m2;
import t0.r1;

/* loaded from: classes.dex */
public final class m extends iu.k implements Function2 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f24569a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f24570b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f24571c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f24572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f24573e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f24574f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ut.d f24575g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ut.d f24576h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(String str, String str2, q1.b bVar, String str3, Function0 function0, String str4, Function0 function02) {
        super(2);
        this.f24570b = str;
        this.f24571c = str2;
        this.f24574f = bVar;
        this.f24572d = str3;
        this.f24575g = function0;
        this.f24573e = str4;
        this.f24576h = function02;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0098, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r13.Q(), java.lang.Integer.valueOf(r7)) == false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void d(t0.n r53, int r54) {
        /*
            Method dump skipped, instructions count: 1006
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ld.m.d(t0.n, int):void");
    }

    public final void a(t0.n nVar, int i10) {
        g1.o e10;
        g1.o e11;
        String str;
        double d10;
        double d11;
        g1.o c10;
        Double d12;
        String str2;
        q1.b u10;
        g1.o b10;
        String str3;
        g1.o e12;
        g1.o b11;
        g1.o e13;
        g1.o e14;
        Double d13;
        g1.o c11;
        g1.o b12;
        g1.o e15;
        g1.o e16;
        Double d14;
        ug.l lVar;
        FnoOrderResponseData fnoOrderResponseData;
        g1.f fVar;
        b0.d dVar;
        g1.o b13;
        g1.o e17;
        g1.o e18;
        g1.o b14;
        g1.o b15;
        switch (this.f24569a) {
            case 0:
                d(nVar, i10);
                return;
            default:
                if ((i10 & 11) == 2) {
                    t0.r rVar = (t0.r) nVar;
                    if (rVar.G()) {
                        rVar.V();
                        return;
                    }
                }
                ug.l lVar2 = (ug.l) this.f24572d;
                FnoOrderResponseData fnoOrderResponseData2 = (FnoOrderResponseData) this.f24573e;
                Double d15 = (Double) this.f24574f;
                Function1 function1 = (Function1) this.f24575g;
                Function1 function12 = (Function1) this.f24576h;
                t0.r rVar2 = (t0.r) nVar;
                rVar2.b0(-483455358);
                g1.l lVar3 = g1.l.f16404b;
                b0.f fVar2 = b0.n.f2937c;
                g1.e eVar = g1.a.f16391m;
                l1 a10 = y.a(fVar2, eVar, rVar2, 0);
                rVar2.b0(-1323940314);
                int o02 = al.d.o0(rVar2);
                r1 C = rVar2.C();
                c2.l.M.getClass();
                c2.j a11 = c2.k.a();
                b1.c j10 = androidx.compose.ui.layout.a.j(lVar3);
                if (rVar2.B() instanceof t0.f) {
                    rVar2.e0();
                    if (rVar2.F()) {
                        rVar2.n(a11);
                    } else {
                        rVar2.n0();
                    }
                    c2.i j11 = jr.h.j(rVar2, a10, rVar2, C);
                    if (rVar2.F() || !Intrinsics.a(rVar2.Q(), Integer.valueOf(o02))) {
                        nn.d.s(o02, rVar2, o02, j11);
                    }
                    nn.d.q(0, j10, m2.a(rVar2), rVar2, 2058660585);
                    e10 = androidx.compose.foundation.layout.d.e(lVar3, 1.0f);
                    float f10 = 16;
                    g1.o t10 = androidx.compose.foundation.layout.a.t(e10, f10);
                    rVar2.b0(-483455358);
                    l1 a12 = y.a(fVar2, eVar, rVar2, 0);
                    rVar2.b0(-1323940314);
                    int o03 = al.d.o0(rVar2);
                    r1 C2 = rVar2.C();
                    c2.j a13 = c2.k.a();
                    b1.c j12 = androidx.compose.ui.layout.a.j(t10);
                    if (rVar2.B() instanceof t0.f) {
                        rVar2.e0();
                        if (rVar2.F()) {
                            rVar2.n(a13);
                        } else {
                            rVar2.n0();
                        }
                        c2.i j13 = jr.h.j(rVar2, a12, rVar2, C2);
                        if (rVar2.F() || !Intrinsics.a(rVar2.Q(), Integer.valueOf(o03))) {
                            nn.d.s(o03, rVar2, o03, j13);
                        }
                        nn.d.q(0, j12, m2.a(rVar2), rVar2, 2058660585);
                        e11 = androidx.compose.foundation.layout.d.e(lVar3, 1.0f);
                        rVar2.b0(693286680);
                        b0.d dVar2 = b0.n.f2935a;
                        g1.f fVar3 = g1.a.f16388j;
                        l1 a14 = o1.a(dVar2, fVar3, rVar2, 0);
                        rVar2.b0(-1323940314);
                        int o04 = al.d.o0(rVar2);
                        r1 C3 = rVar2.C();
                        c2.j a15 = c2.k.a();
                        b1.c j14 = androidx.compose.ui.layout.a.j(e11);
                        if (rVar2.B() instanceof t0.f) {
                            rVar2.e0();
                            if (rVar2.F()) {
                                rVar2.n(a15);
                            } else {
                                rVar2.n0();
                            }
                            c2.i j15 = jr.h.j(rVar2, a14, rVar2, C3);
                            if (rVar2.F() || !Intrinsics.a(rVar2.Q(), Integer.valueOf(o04))) {
                                nn.d.s(o04, rVar2, o04, j15);
                            }
                            j14.b(m2.a(rVar2), rVar2, 0);
                            rVar2.b0(2058660585);
                            y8.h hVar = new y8.h((Context) rVar2.m(AndroidCompositionLocals_androidKt.c()));
                            IdentifierInfo identifierInfo = fnoOrderResponseData2.getIdentifierInfo();
                            Object obj = HttpUrl.FRAGMENT_ENCODE_SET;
                            if (identifierInfo == null || (str = identifierInfo.getImageUrl()) == null) {
                                str = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            hVar.c(str);
                            hVar.b();
                            float f11 = 1;
                            q6.l.c(hVar.a(), "User photo", androidx.compose.foundation.a.g(androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.d.m(lVar3, 40), h0.h.d()), f11, w0.e(R.color.lightColorSeparator, rVar2), h0.h.d()), w0.u(R.drawable.ic_placeholder_stock, rVar2, 6), null, null, null, rVar2, 4152, 0, 65520);
                            float f12 = 8;
                            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar3, f12), rVar2);
                            rVar2.b0(-483455358);
                            l1 a16 = y.a(fVar2, eVar, rVar2, 0);
                            rVar2.b0(-1323940314);
                            int o05 = al.d.o0(rVar2);
                            r1 C4 = rVar2.C();
                            c2.j a17 = c2.k.a();
                            b1.c j16 = androidx.compose.ui.layout.a.j(lVar3);
                            if (rVar2.B() instanceof t0.f) {
                                rVar2.e0();
                                if (rVar2.F()) {
                                    rVar2.n(a17);
                                } else {
                                    rVar2.n0();
                                }
                                c2.i j17 = jr.h.j(rVar2, a16, rVar2, C4);
                                if (rVar2.F() || !Intrinsics.a(rVar2.Q(), Integer.valueOf(o05))) {
                                    nn.d.s(o05, rVar2, o05, j17);
                                }
                                nn.d.q(0, j16, m2.a(rVar2), rVar2, 2058660585);
                                String contractName = fnoOrderResponseData2.getContractName();
                                if (contractName == null) {
                                    contractName = HttpUrl.FRAGMENT_ENCODE_SET;
                                }
                                al.d.C(contractName, null, w0.e(R.color.black_1A1A1A, rVar2), yk.j.e1(14), null, null, jh.c.f(), 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1575936, 0, 130994);
                                rVar2.b0(693286680);
                                l1 a18 = o1.a(dVar2, fVar3, rVar2, 0);
                                rVar2.b0(-1323940314);
                                int o06 = al.d.o0(rVar2);
                                r1 C5 = rVar2.C();
                                c2.j a19 = c2.k.a();
                                b1.c j18 = androidx.compose.ui.layout.a.j(lVar3);
                                if (rVar2.B() instanceof t0.f) {
                                    rVar2.e0();
                                    if (rVar2.F()) {
                                        rVar2.n(a19);
                                    } else {
                                        rVar2.n0();
                                    }
                                    c2.i j19 = jr.h.j(rVar2, a18, rVar2, C5);
                                    if (rVar2.F() || !Intrinsics.a(rVar2.Q(), Integer.valueOf(o06))) {
                                        nn.d.s(o06, rVar2, o06, j19);
                                    }
                                    nn.d.q(0, j18, m2.a(rVar2), rVar2, 2058660585);
                                    q1 q1Var = q1.f2981a;
                                    rVar2.b0(-483455358);
                                    l1 a20 = y.a(fVar2, eVar, rVar2, 0);
                                    rVar2.b0(-1323940314);
                                    int o07 = al.d.o0(rVar2);
                                    r1 C6 = rVar2.C();
                                    c2.j a21 = c2.k.a();
                                    b1.c j20 = androidx.compose.ui.layout.a.j(lVar3);
                                    if (rVar2.B() instanceof t0.f) {
                                        rVar2.e0();
                                        if (rVar2.F()) {
                                            rVar2.n(a21);
                                        } else {
                                            rVar2.n0();
                                        }
                                        c2.i j21 = jr.h.j(rVar2, a20, rVar2, C6);
                                        if (rVar2.F() || !Intrinsics.a(rVar2.Q(), Integer.valueOf(o07))) {
                                            nn.d.s(o07, rVar2, o07, j21);
                                        }
                                        nn.d.q(0, j20, m2.a(rVar2), rVar2, 2058660585);
                                        rVar2.b0(693286680);
                                        l1 a22 = o1.a(dVar2, fVar3, rVar2, 0);
                                        rVar2.b0(-1323940314);
                                        int o08 = al.d.o0(rVar2);
                                        r1 C7 = rVar2.C();
                                        c2.j a23 = c2.k.a();
                                        b1.c j22 = androidx.compose.ui.layout.a.j(lVar3);
                                        if (rVar2.B() instanceof t0.f) {
                                            rVar2.e0();
                                            if (rVar2.F()) {
                                                rVar2.n(a23);
                                            } else {
                                                rVar2.n0();
                                            }
                                            c2.i j23 = jr.h.j(rVar2, a22, rVar2, C7);
                                            if (rVar2.F() || !Intrinsics.a(rVar2.Q(), Integer.valueOf(o08))) {
                                                nn.d.s(o08, rVar2, o08, j23);
                                            }
                                            nn.d.q(0, j22, m2.a(rVar2), rVar2, 2058660585);
                                            Double ltp = fnoOrderResponseData2.getLtp();
                                            if (ltp != null) {
                                                d10 = ltp.doubleValue();
                                            } else {
                                                d10 = 0.0d;
                                            }
                                            int i11 = t.f28178j;
                                            al.d.l(d10, null, to.e.c(), yk.j.e1(13), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, false, rVar2, 3456, 0, 262130);
                                            rVar2.v();
                                            rVar2.u();
                                            rVar2.v();
                                            rVar2.v();
                                            g1.f fVar4 = g1.a.f16389k;
                                            g1.o m10 = androidx.compose.foundation.layout.a.m(lVar3);
                                            rVar2.b0(693286680);
                                            l1 a24 = o1.a(dVar2, fVar4, rVar2, 48);
                                            rVar2.b0(-1323940314);
                                            int o09 = al.d.o0(rVar2);
                                            r1 C8 = rVar2.C();
                                            c2.j a25 = c2.k.a();
                                            b1.c j24 = androidx.compose.ui.layout.a.j(m10);
                                            if (rVar2.B() instanceof t0.f) {
                                                rVar2.e0();
                                                if (rVar2.F()) {
                                                    rVar2.n(a25);
                                                } else {
                                                    rVar2.n0();
                                                }
                                                c2.i j25 = jr.h.j(rVar2, a24, rVar2, C8);
                                                if (rVar2.F() || !Intrinsics.a(rVar2.Q(), Integer.valueOf(o09))) {
                                                    nn.d.s(o09, rVar2, o09, j25);
                                                }
                                                nn.d.q(0, j24, m2.a(rVar2), rVar2, 2058660585);
                                                Change change = fnoOrderResponseData2.getChange();
                                                if (change != null) {
                                                    d11 = change.getValue();
                                                } else {
                                                    d11 = 0.0d;
                                                }
                                                al.d.l(d11, null, w0.e(R.color.black_1A1A1A, rVar2), yk.j.e1(11), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, true, rVar2, 3072, 12582912, 131058);
                                                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar3, f12), rVar2);
                                                long e19 = w0.e(R.color.black_1A1A1A, rVar2);
                                                c10 = androidx.compose.foundation.layout.d.c(lVar3, 1.0f);
                                                float f13 = 2;
                                                pp.b.c(androidx.compose.foundation.layout.d.q(androidx.compose.foundation.layout.a.x(c10, s0.g.f34069a, f13, s0.g.f34069a, f13, 5), f11), e19, s0.g.f34069a, s0.g.f34069a, rVar2, 6, 12);
                                                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar3, f12), rVar2);
                                                ij.h hVar2 = ij.h.f20067a;
                                                Change change2 = fnoOrderResponseData2.getChange();
                                                if (change2 != null) {
                                                    d12 = Double.valueOf(kj.f.p(change2.getPercentage()));
                                                } else {
                                                    d12 = null;
                                                }
                                                al.d.C(ij.h.t(String.valueOf(d12)), null, w0.e(R.color.black_1A1A1A, rVar2), yk.j.e1(11), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 3072, 0, 131058);
                                                float f14 = 4;
                                                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar3, f14), rVar2);
                                                Change change3 = fnoOrderResponseData2.getChange();
                                                if (change3 != null) {
                                                    str2 = change3.getType();
                                                } else {
                                                    str2 = null;
                                                }
                                                if (Intrinsics.a(str2, "POSITIVE")) {
                                                    rVar2.b0(-1788092635);
                                                    u10 = w0.u(R.drawable.ic_stock_up_arrow, rVar2, 6);
                                                    rVar2.v();
                                                } else {
                                                    rVar2.b0(-1788088249);
                                                    u10 = w0.u(R.drawable.ic_stock_down_arrow, rVar2, 6);
                                                    rVar2.v();
                                                }
                                                androidx.compose.foundation.a.c(u10, null, androidx.compose.foundation.layout.d.m(lVar3, f10), null, null, s0.g.f34069a, null, rVar2, 440, 120);
                                                rVar2.v();
                                                rVar2.u();
                                                rVar2.v();
                                                rVar2.v();
                                                rVar2.v();
                                                rVar2.u();
                                                rVar2.v();
                                                rVar2.v();
                                                b10 = q1Var.b(lVar3, 1.0f, true);
                                                androidx.compose.foundation.layout.a.c(b10, rVar2);
                                                b0.f fVar5 = b0.n.f2938d;
                                                rVar2.b0(-483455358);
                                                l1 a26 = y.a(fVar5, eVar, rVar2, 6);
                                                rVar2.b0(-1323940314);
                                                int o010 = al.d.o0(rVar2);
                                                r1 C9 = rVar2.C();
                                                c2.j a27 = c2.k.a();
                                                b1.c j26 = androidx.compose.ui.layout.a.j(lVar3);
                                                if (rVar2.B() instanceof t0.f) {
                                                    rVar2.e0();
                                                    if (rVar2.F()) {
                                                        rVar2.n(a27);
                                                    } else {
                                                        rVar2.n0();
                                                    }
                                                    c2.i j27 = jr.h.j(rVar2, a26, rVar2, C9);
                                                    if (rVar2.F() || !Intrinsics.a(rVar2.Q(), Integer.valueOf(o010))) {
                                                        nn.d.s(o010, rVar2, o010, j27);
                                                    }
                                                    nn.d.q(0, j26, m2.a(rVar2), rVar2, 2058660585);
                                                    String orderType = fnoOrderResponseData2.getOrderType();
                                                    if (orderType == null) {
                                                        orderType = HttpUrl.FRAGMENT_ENCODE_SET;
                                                    }
                                                    zq.f.c(null, orderType, 0L, androidx.compose.ui.graphics.a.d(4282655453L), 0, null, rVar2, 3072, 53);
                                                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar3, f14), rVar2);
                                                    String transactionType = fnoOrderResponseData2.getTransactionType();
                                                    if (transactionType == null || (str3 = kj.f.c(transactionType)) == null) {
                                                        str3 = HttpUrl.FRAGMENT_ENCODE_SET;
                                                    }
                                                    zq.f.c(null, str3, 0L, 0L, 0, null, rVar2, 0, 61);
                                                    rVar2.v();
                                                    rVar2.u();
                                                    rVar2.v();
                                                    rVar2.v();
                                                    rVar2.v();
                                                    rVar2.u();
                                                    rVar2.v();
                                                    rVar2.v();
                                                    rVar2.v();
                                                    rVar2.u();
                                                    rVar2.v();
                                                    rVar2.v();
                                                    rVar2.v();
                                                    rVar2.u();
                                                    rVar2.v();
                                                    rVar2.v();
                                                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar3, f10), rVar2);
                                                    e12 = androidx.compose.foundation.layout.d.e(lVar3, 1.0f);
                                                    g1.o m11 = androidx.compose.foundation.layout.a.m(e12);
                                                    b0.g a28 = b0.n.a();
                                                    rVar2.b0(693286680);
                                                    l1 a29 = o1.a(a28, fVar4, rVar2, 54);
                                                    rVar2.b0(-1323940314);
                                                    int o011 = al.d.o0(rVar2);
                                                    r1 C10 = rVar2.C();
                                                    c2.j a30 = c2.k.a();
                                                    b1.c j28 = androidx.compose.ui.layout.a.j(m11);
                                                    if (rVar2.B() instanceof t0.f) {
                                                        rVar2.e0();
                                                        if (rVar2.F()) {
                                                            rVar2.n(a30);
                                                        } else {
                                                            rVar2.n0();
                                                        }
                                                        c2.i j29 = jr.h.j(rVar2, a29, rVar2, C10);
                                                        if (rVar2.F() || !Intrinsics.a(rVar2.Q(), Integer.valueOf(o011))) {
                                                            nn.d.s(o011, rVar2, o011, j29);
                                                        }
                                                        nn.d.q(0, j28, m2.a(rVar2), rVar2, 2058660585);
                                                        b11 = q1Var.b(androidx.compose.foundation.layout.d.t(lVar3), 1.0f, true);
                                                        rVar2.b0(733328855);
                                                        g1.g gVar = g1.a.f16379a;
                                                        v c12 = b0.s.c(gVar, false, rVar2, 0);
                                                        rVar2.b0(-1323940314);
                                                        int o012 = al.d.o0(rVar2);
                                                        r1 C11 = rVar2.C();
                                                        c2.j a31 = c2.k.a();
                                                        b1.c j30 = androidx.compose.ui.layout.a.j(b11);
                                                        if (rVar2.B() instanceof t0.f) {
                                                            rVar2.e0();
                                                            if (rVar2.F()) {
                                                                rVar2.n(a31);
                                                            } else {
                                                                rVar2.n0();
                                                            }
                                                            t0.t.v0(rVar2, c12, c2.k.c());
                                                            t0.t.v0(rVar2, C11, c2.k.d());
                                                            c2.i b16 = c2.k.b();
                                                            if (rVar2.F() || !Intrinsics.a(rVar2.Q(), Integer.valueOf(o012))) {
                                                                nn.d.s(o012, rVar2, o012, b16);
                                                            }
                                                            nn.d.q(0, j30, m2.a(rVar2), rVar2, 2058660585);
                                                            e13 = androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.t(lVar3), 1.0f);
                                                            rVar2.b0(-483455358);
                                                            l1 a32 = y.a(fVar2, eVar, rVar2, 0);
                                                            rVar2.b0(-1323940314);
                                                            int o013 = al.d.o0(rVar2);
                                                            r1 C12 = rVar2.C();
                                                            c2.j a33 = c2.k.a();
                                                            b1.c j31 = androidx.compose.ui.layout.a.j(e13);
                                                            if (rVar2.B() instanceof t0.f) {
                                                                rVar2.e0();
                                                                if (rVar2.F()) {
                                                                    rVar2.n(a33);
                                                                } else {
                                                                    rVar2.n0();
                                                                }
                                                                c2.i j32 = jr.h.j(rVar2, a32, rVar2, C12);
                                                                if (rVar2.F() || !Intrinsics.a(rVar2.Q(), Integer.valueOf(o013))) {
                                                                    nn.d.s(o013, rVar2, o013, j32);
                                                                }
                                                                nn.d.q(0, j31, m2.a(rVar2), rVar2, 2058660585);
                                                                zq.f.a(hl.f.c1(R.string.lots_text, rVar2), String.valueOf(fnoOrderResponseData2.getNoOfLots()), false, false, rVar2, 0, 12);
                                                                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar3, f12), rVar2);
                                                                long e20 = w0.e(R.color.lightColorSeparator, rVar2);
                                                                e14 = androidx.compose.foundation.layout.d.e(lVar3, 1.0f);
                                                                pp.b.c(e14, e20, f11, s0.g.f34069a, rVar2, 390, 8);
                                                                String i12 = v.e.i(lVar3, f12, rVar2, R.string.order_price, rVar2);
                                                                if (d15 != null) {
                                                                    d13 = Double.valueOf(kj.f.p(d15.doubleValue()));
                                                                } else {
                                                                    d13 = null;
                                                                }
                                                                zq.f.a(i12, String.valueOf(d13), true, false, rVar2, 384, 8);
                                                                rVar2.v();
                                                                rVar2.u();
                                                                rVar2.v();
                                                                rVar2.v();
                                                                rVar2.v();
                                                                rVar2.u();
                                                                rVar2.v();
                                                                rVar2.v();
                                                                long e21 = w0.e(R.color.lightColorSeparator, rVar2);
                                                                c11 = androidx.compose.foundation.layout.d.c(lVar3, 1.0f);
                                                                pp.b.c(androidx.compose.foundation.layout.d.q(c11, f11), e21, s0.g.f34069a, s0.g.f34069a, rVar2, 6, 12);
                                                                b12 = q1Var.b(lVar3, 1.0f, true);
                                                                rVar2.b0(733328855);
                                                                v c13 = b0.s.c(gVar, false, rVar2, 0);
                                                                rVar2.b0(-1323940314);
                                                                int o014 = al.d.o0(rVar2);
                                                                r1 C13 = rVar2.C();
                                                                c2.j a34 = c2.k.a();
                                                                b1.c j33 = androidx.compose.ui.layout.a.j(b12);
                                                                if (rVar2.B() instanceof t0.f) {
                                                                    rVar2.e0();
                                                                    if (rVar2.F()) {
                                                                        rVar2.n(a34);
                                                                    } else {
                                                                        rVar2.n0();
                                                                    }
                                                                    t0.t.v0(rVar2, c13, c2.k.c());
                                                                    t0.t.v0(rVar2, C13, c2.k.d());
                                                                    c2.i b17 = c2.k.b();
                                                                    if (rVar2.F() || !Intrinsics.a(rVar2.Q(), Integer.valueOf(o014))) {
                                                                        nn.d.s(o014, rVar2, o014, b17);
                                                                    }
                                                                    nn.d.q(0, j33, m2.a(rVar2), rVar2, 2058660585);
                                                                    e15 = androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.t(lVar3), 1.0f);
                                                                    rVar2.b0(-483455358);
                                                                    l1 a35 = y.a(fVar2, eVar, rVar2, 0);
                                                                    rVar2.b0(-1323940314);
                                                                    int o015 = al.d.o0(rVar2);
                                                                    r1 C14 = rVar2.C();
                                                                    c2.j a36 = c2.k.a();
                                                                    b1.c j34 = androidx.compose.ui.layout.a.j(e15);
                                                                    if (rVar2.B() instanceof t0.f) {
                                                                        rVar2.e0();
                                                                        if (rVar2.F()) {
                                                                            rVar2.n(a36);
                                                                        } else {
                                                                            rVar2.n0();
                                                                        }
                                                                        c2.i j35 = jr.h.j(rVar2, a35, rVar2, C14);
                                                                        if (rVar2.F() || !Intrinsics.a(rVar2.Q(), Integer.valueOf(o015))) {
                                                                            nn.d.s(o015, rVar2, o015, j35);
                                                                        }
                                                                        nn.d.q(0, j34, m2.a(rVar2), rVar2, 2058660585);
                                                                        String c14 = hl.f.c1(R.string.lot_size_text, rVar2);
                                                                        Integer lotSize = fnoOrderResponseData2.getLotSize();
                                                                        if (lotSize != null) {
                                                                            obj = lotSize;
                                                                        }
                                                                        zq.f.a(c14, obj.toString(), false, false, rVar2, 0, 12);
                                                                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar3, f12), rVar2);
                                                                        long e22 = w0.e(R.color.lightColorSeparator, rVar2);
                                                                        e16 = androidx.compose.foundation.layout.d.e(lVar3, 1.0f);
                                                                        pp.b.c(e16, e22, f11, s0.g.f34069a, rVar2, 390, 8);
                                                                        String i13 = v.e.i(lVar3, f12, rVar2, R.string.margin_text, rVar2);
                                                                        Double margin = fnoOrderResponseData2.getMargin();
                                                                        if (margin != null) {
                                                                            d14 = Double.valueOf(kj.f.p(margin.doubleValue()));
                                                                        } else {
                                                                            d14 = null;
                                                                        }
                                                                        zq.f.a(i13, String.valueOf(d14), true, false, rVar2, 384, 8);
                                                                        rVar2.v();
                                                                        rVar2.u();
                                                                        rVar2.v();
                                                                        rVar2.v();
                                                                        rVar2.v();
                                                                        rVar2.u();
                                                                        rVar2.v();
                                                                        rVar2.v();
                                                                        rVar2.v();
                                                                        rVar2.u();
                                                                        rVar2.v();
                                                                        rVar2.v();
                                                                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar3, f10), rVar2);
                                                                        rVar2.b0(1510090439);
                                                                        if (Intrinsics.a(lVar2, ug.j.f37188e)) {
                                                                            rVar2.b0(693286680);
                                                                            dVar = dVar2;
                                                                            l1 a37 = o1.a(dVar, fVar3, rVar2, 0);
                                                                            rVar2.b0(-1323940314);
                                                                            int o016 = al.d.o0(rVar2);
                                                                            r1 C15 = rVar2.C();
                                                                            c2.j a38 = c2.k.a();
                                                                            b1.c j36 = androidx.compose.ui.layout.a.j(lVar3);
                                                                            if (rVar2.B() instanceof t0.f) {
                                                                                rVar2.e0();
                                                                                if (rVar2.F()) {
                                                                                    rVar2.n(a38);
                                                                                } else {
                                                                                    rVar2.n0();
                                                                                }
                                                                                c2.i j37 = jr.h.j(rVar2, a37, rVar2, C15);
                                                                                if (rVar2.F() || !Intrinsics.a(rVar2.Q(), Integer.valueOf(o016))) {
                                                                                    nn.d.s(o016, rVar2, o016, j37);
                                                                                }
                                                                                nn.d.q(0, j36, m2.a(rVar2), rVar2, 2058660585);
                                                                                String c15 = hl.f.c1(R.string.text_modify_order, rVar2);
                                                                                float f15 = 30;
                                                                                b14 = q1Var.b(androidx.compose.foundation.layout.d.g(lVar3, f15), 1.0f, true);
                                                                                float f16 = 0;
                                                                                g1.o t11 = androidx.compose.foundation.layout.a.t(b14, f16);
                                                                                long d16 = androidx.compose.ui.graphics.a.d(4291547647L);
                                                                                long d17 = androidx.compose.ui.graphics.a.d(4283048166L);
                                                                                rVar2.b0(-357389014);
                                                                                boolean h10 = rVar2.h(function1);
                                                                                fnoOrderResponseData = fnoOrderResponseData2;
                                                                                boolean h11 = h10 | rVar2.h(fnoOrderResponseData);
                                                                                Object Q = rVar2.Q();
                                                                                to.e eVar2 = t0.m.f35080a;
                                                                                if (h11 || Q == eVar2) {
                                                                                    Q = new ug.g(function1, fnoOrderResponseData, 0);
                                                                                    rVar2.k0(Q);
                                                                                }
                                                                                rVar2.v();
                                                                                fVar = fVar3;
                                                                                lVar = lVar2;
                                                                                al.d.p(221568, 2, d16, d17, null, rVar2, t11, c15, (Function0) Q, false);
                                                                                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar3, f10), rVar2);
                                                                                String c16 = hl.f.c1(R.string.cancel, rVar2);
                                                                                b15 = q1Var.b(androidx.compose.foundation.layout.d.g(lVar3, f15), 1.0f, true);
                                                                                g1.o t12 = androidx.compose.foundation.layout.a.t(b15, f16);
                                                                                long d18 = androidx.compose.ui.graphics.a.d(4291547647L);
                                                                                long d19 = androidx.compose.ui.graphics.a.d(4283048166L);
                                                                                rVar2.b0(-357366811);
                                                                                boolean h12 = rVar2.h(function12) | rVar2.h(fnoOrderResponseData);
                                                                                Object Q2 = rVar2.Q();
                                                                                if (h12 || Q2 == eVar2) {
                                                                                    Q2 = new ug.g(function12, fnoOrderResponseData, 1);
                                                                                    rVar2.k0(Q2);
                                                                                }
                                                                                rVar2.v();
                                                                                al.d.p(221568, 2, d18, d19, null, rVar2, t12, c16, (Function0) Q2, false);
                                                                                rVar2.v();
                                                                                rVar2.u();
                                                                                rVar2.v();
                                                                                rVar2.v();
                                                                                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar3, f10), rVar2);
                                                                            } else {
                                                                                al.d.v0();
                                                                                throw null;
                                                                            }
                                                                        } else {
                                                                            lVar = lVar2;
                                                                            fnoOrderResponseData = fnoOrderResponseData2;
                                                                            fVar = fVar3;
                                                                            dVar = dVar2;
                                                                        }
                                                                        rVar2.v();
                                                                        rVar2.b0(693286680);
                                                                        l1 a39 = o1.a(dVar, fVar, rVar2, 0);
                                                                        rVar2.b0(-1323940314);
                                                                        int o017 = al.d.o0(rVar2);
                                                                        r1 C16 = rVar2.C();
                                                                        c2.j a40 = c2.k.a();
                                                                        b1.c j38 = androidx.compose.ui.layout.a.j(lVar3);
                                                                        if (rVar2.B() instanceof t0.f) {
                                                                            rVar2.e0();
                                                                            if (rVar2.F()) {
                                                                                rVar2.n(a40);
                                                                            } else {
                                                                                rVar2.n0();
                                                                            }
                                                                            c2.i j39 = jr.h.j(rVar2, a39, rVar2, C16);
                                                                            if (rVar2.F() || !Intrinsics.a(rVar2.Q(), Integer.valueOf(o017))) {
                                                                                nn.d.s(o017, rVar2, o017, j39);
                                                                            }
                                                                            nn.d.q(0, j38, m2.a(rVar2), rVar2, 2058660585);
                                                                            rVar2.b0(-357358693);
                                                                            if (fnoOrderResponseData.getEntryDate() != null) {
                                                                                al.d.C(hl.f.d1(R.string.ordered_at_text, new Object[]{kj.f.s(fnoOrderResponseData.getEntryDate().longValue())}, rVar2), null, androidx.compose.ui.graphics.a.d(4289506476L), yk.j.e1(9), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 3456, 0, 131058);
                                                                            }
                                                                            rVar2.v();
                                                                            b13 = q1Var.b(lVar3, 1.0f, true);
                                                                            androidx.compose.foundation.layout.a.c(b13, rVar2);
                                                                            ug.l lVar4 = lVar;
                                                                            if (Intrinsics.a(lVar4, ug.j.f37187d)) {
                                                                                al.d.C(this.f24570b + ": " + this.f24571c, null, androidx.compose.ui.graphics.a.d(4289506476L), yk.j.e1(9), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 3456, 0, 131058);
                                                                            }
                                                                            rVar2.v();
                                                                            rVar2.u();
                                                                            rVar2.v();
                                                                            rVar2.v();
                                                                            rVar2.v();
                                                                            rVar2.u();
                                                                            rVar2.v();
                                                                            rVar2.v();
                                                                            e17 = androidx.compose.foundation.layout.d.e(lVar3, 1.0f);
                                                                            e18 = androidx.compose.foundation.a.e(androidx.compose.foundation.layout.d.g(e17, 30), w0.e(R.color.card_footer_color_new, rVar2), s0.f28162a);
                                                                            b0.g a41 = b0.n.a();
                                                                            rVar2.b0(693286680);
                                                                            l1 a42 = o1.a(a41, fVar4, rVar2, 54);
                                                                            rVar2.b0(-1323940314);
                                                                            int o018 = al.d.o0(rVar2);
                                                                            r1 C17 = rVar2.C();
                                                                            c2.j a43 = c2.k.a();
                                                                            b1.c j40 = androidx.compose.ui.layout.a.j(e18);
                                                                            if (rVar2.B() instanceof t0.f) {
                                                                                rVar2.e0();
                                                                                if (rVar2.F()) {
                                                                                    rVar2.n(a43);
                                                                                } else {
                                                                                    rVar2.n0();
                                                                                }
                                                                                c2.i j41 = jr.h.j(rVar2, a42, rVar2, C17);
                                                                                if (rVar2.F() || !Intrinsics.a(rVar2.Q(), Integer.valueOf(o018))) {
                                                                                    nn.d.s(o018, rVar2, o018, j41);
                                                                                }
                                                                                nn.d.q(0, j40, m2.a(rVar2), rVar2, 2058660585);
                                                                                String upperCase = lVar4.b().toUpperCase(Locale.ROOT);
                                                                                Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
                                                                                al.d.C(upperCase, null, w0.e(lVar4.a(), rVar2), yk.j.e1(12), null, null, jh.c.e(), 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1575936, 0, 130994);
                                                                                rVar2.v();
                                                                                rVar2.u();
                                                                                rVar2.v();
                                                                                rVar2.v();
                                                                                rVar2.v();
                                                                                rVar2.u();
                                                                                rVar2.v();
                                                                                rVar2.v();
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
                                                                al.d.v0();
                                                                throw null;
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
                                                al.d.v0();
                                                throw null;
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
                                al.d.v0();
                                throw null;
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
                al.d.v0();
                throw null;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        switch (this.f24569a) {
            case 0:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
            default:
                a((t0.n) obj, ((Number) obj2).intValue());
                return Unit.f23355a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ug.l lVar, FnoOrderResponseData fnoOrderResponseData, Double d10, Function1 function1, Function1 function12, String str, String str2) {
        super(2);
        this.f24572d = lVar;
        this.f24573e = fnoOrderResponseData;
        this.f24574f = d10;
        this.f24575g = function1;
        this.f24576h = function12;
        this.f24570b = str;
        this.f24571c = str2;
    }
}
