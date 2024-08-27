package yk;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.StaticLayout;
import android.text.method.LinkMovementMethod;
import android.text.style.AbsoluteSizeSpan;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.FragmentContainerView;
import androidx.lifecycle.j1;
import b0.l1;
import b0.o1;
import b0.y;
import c0.m0;
import c0.p0;
import c2.e1;
import c2.h1;
import com.assetgro.stockgro.data.model.ChatMessage;
import com.assetgro.stockgro.data.model.Media;
import com.assetgro.stockgro.data.model.ReportReason;
import com.assetgro.stockgro.data.model.Sticker;
import com.assetgro.stockgro.data.model.arenaV2.ArenaGame;
import com.assetgro.stockgro.feature_market.data.remote.FnoOrderInfoResponseDto;
import com.assetgro.stockgro.feature_social.presentation.feed.comments.CommentsViewModel;
import com.assetgro.stockgro.feature_social.presentation.feed.streams.FeedStreamViewModel;
import com.assetgro.stockgro.missions.domain.model.MissionStatus;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.chat.create.GroupCreateViewModel;
import com.assetgro.stockgro.ui.chat.detail.members.AddMembersViewModel;
import com.assetgro.stockgro.ui.social.domain.model.CommentMetaData;
import com.assetgro.stockgro.ui.social.presentation.video.YoutubeVideoFullScreenActivity;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import d0.n0;
import d2.s1;
import d2.w0;
import g7.x0;
import g7.y0;
import hb.d0;
import j2.g0;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import ka.e0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import m0.b9;
import m0.c9;
import m0.d9;
import m0.g8;
import m0.l5;
import m0.p3;
import m0.s3;
import m0.z5;
import m0.z7;
import n1.j0;
import n1.s0;
import n1.z0;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;
import pd.a0;
import pd.b0;
import pd.c0;
import pd.z;
import r0.a1;
import r0.a2;
import r0.n3;
import r0.p2;
import r0.z2;
import t0.d3;
import t0.g1;
import t0.l3;
import t0.m2;
import t0.n1;
import t0.o3;
import t0.r1;
import t0.x1;
import tb.x;
import tu.i1;
import vt.i0;
import w.l0;
import w.t1;
import y.q0;

/* loaded from: classes.dex */
public abstract class j implements xs.b {
    public static final void A(t0.n nVar, int i10) {
        t0.r rVar = (t0.r) nVar;
        rVar.c0(1396286236);
        if (i10 == 0 && rVar.G()) {
            rVar.V();
        } else {
            g1.l lVar = g1.l.f16404b;
            g1.o v10 = androidx.compose.foundation.layout.a.v(lVar, kp.j.R(4, rVar), s0.g.f34069a, 2);
            g1.e eVar = g1.a.f16392n;
            rVar.b0(-483455358);
            l1 a10 = y.a(b0.n.f2937c, eVar, rVar, 48);
            rVar.b0(-1323940314);
            int i11 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(v10);
            if (rVar.f35166a instanceof t0.f) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t0.t.v0(rVar, a10, c2.k.f7749e);
                t0.t.v0(rVar, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i11))) {
                    nn.d.s(i11, rVar, i11, iVar);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                androidx.compose.foundation.a.c(w0.u(R.drawable.ic_placeholder_shimmer_user_profile, rVar, 6), null, androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.d.m(lVar, kp.j.R(64, rVar)), h0.h.f17801a), null, null, s0.g.f34069a, null, rVar, 56, 120);
                v.e.s(8, rVar, lVar, rVar);
                da.e.w(androidx.compose.foundation.a.d(da.e.k(8, rVar, androidx.compose.foundation.layout.d.q(androidx.compose.foundation.layout.d.g(lVar, kp.j.R(13, rVar)), kp.j.R(68, rVar))), g0(rVar), null, 6), rVar, 0, false, true);
                rVar.s(false);
                rVar.s(false);
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new lb.u(i10, 4);
        }
    }

    public static final boolean A0(l3 l3Var) {
        return ((Boolean) l3Var.getValue()).booleanValue();
    }

    public static final void A1(String str) {
        throw new IllegalArgumentException(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void B(java.lang.String r35, java.util.List r36, java.util.List r37, int r38, sb.c r39, boolean r40, boolean r41, boolean r42, kotlin.jvm.functions.Function0 r43, kotlin.jvm.functions.Function2 r44, hu.c r45, kotlin.jvm.functions.Function1 r46, kotlin.jvm.functions.Function1 r47, kotlin.jvm.functions.Function0 r48, kotlin.jvm.functions.Function0 r49, kotlin.jvm.functions.Function1 r50, t0.n r51, int r52, int r53, int r54) {
        /*
            Method dump skipped, instructions count: 1123
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.j.B(java.lang.String, java.util.List, java.util.List, int, sb.c, boolean, boolean, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, hu.c, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1, t0.n, int, int, int):void");
    }

    public static final Spannable B0(TextView textView, Spannable spannable, int i10, Spanned spanned, String str, boolean z10, int i11, int i12, Function1 function1) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spanned);
        if (str != null) {
            int i13 = 0;
            if (z10) {
                spannableStringBuilder = new SpannableStringBuilder(spanned.subSequence(0, spanned.length() - str.length()).toString());
            }
            SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
            spannableStringBuilder2.append((CharSequence) str);
            spannableStringBuilder2.setSpan(new ue.u(z10, textView, spannable, i10, i11, i12, function1, textView.getContext()), kotlin.text.w.A(spannableStringBuilder2, str, 0, false, 6), str.length() + kotlin.text.w.A(spannableStringBuilder2, str, 0, false, 6), 0);
            spannableStringBuilder2.setSpan(new ue.v(textView, i13), kotlin.text.w.A(spannableStringBuilder2, str, 0, false, 6), str.length() + kotlin.text.w.A(spannableStringBuilder2, str, 0, false, 6), 0);
            spannableStringBuilder2.setSpan(new AbsoluteSizeSpan((int) (12 * Resources.getSystem().getDisplayMetrics().scaledDensity)), kotlin.text.w.A(spannableStringBuilder2, str, 0, false, 6), str.length() + kotlin.text.w.A(spannableStringBuilder2, str, 0, false, 6), 0);
            spannableStringBuilder = spannableStringBuilder2;
        }
        if (function1 != null) {
            return (Spannable) function1.invoke(spannableStringBuilder);
        }
        return spannableStringBuilder;
    }

    public static final void B1(String str) {
        throw new IllegalStateException(str);
    }

    /* JADX WARN: Type inference failed for: r0v26, types: [f.a, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v27, types: [f.a, java.lang.Object] */
    public static final void C(FeedStreamViewModel viewModel, CommentsViewModel commentViewModel, t0.n nVar, int i10) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(commentViewModel, "commentViewModel");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-2093813017);
        Context context = (Context) rVar.m(AndroidCompositionLocals_androidKt.f1428b);
        n1 n1Var = viewModel.f8837r;
        sb.d dVar = (sb.d) n1Var.getValue();
        rVar.b0(-1179183192);
        boolean h10 = rVar.h(dVar);
        Object Q = rVar.Q();
        to.e eVar = t0.m.f35080a;
        if (h10 || Q == eVar) {
            Q = t0.t.N(new c0.r(n1Var, 9));
            rVar.k0(Q);
        }
        l3 l3Var = (l3) Q;
        int i11 = 0;
        rVar.s(false);
        sb.d dVar2 = (sb.d) n1Var.getValue();
        rVar.b0(-1179177061);
        boolean h11 = rVar.h(dVar2);
        Object Q2 = rVar.Q();
        if (h11 || Q2 == eVar) {
            Object obj = ((sb.d) n1Var.getValue()).f34463u;
            if (obj == null) {
                obj = i0.f38321a;
            }
            Q2 = obj;
            rVar.k0(Q2);
        }
        List list = (List) Q2;
        rVar.s(false);
        sb.d dVar3 = (sb.d) n1Var.getValue();
        rVar.b0(-1179173929);
        boolean h12 = rVar.h(dVar3);
        Object Q3 = rVar.Q();
        if (h12 || Q3 == eVar) {
            String str = ((sb.d) n1Var.getValue()).f34456n;
            if (str == null) {
                str = HttpUrl.FRAGMENT_ENCODE_SET;
            }
            Q3 = str;
            rVar.k0(Q3);
        }
        String str2 = (String) Q3;
        rVar.s(false);
        sb.d dVar4 = (sb.d) n1Var.getValue();
        rVar.b0(-1179170828);
        boolean h13 = rVar.h(dVar4);
        Object Q4 = rVar.Q();
        if (h13 || Q4 == eVar) {
            Q4 = ((sb.d) n1Var.getValue()).f34447e;
            rVar.k0(Q4);
        }
        sb.c cVar = (sb.c) Q4;
        rVar.s(false);
        sb.d dVar5 = (sb.d) n1Var.getValue();
        rVar.b0(-1179167688);
        boolean h14 = rVar.h(dVar5);
        Object Q5 = rVar.Q();
        if (h14 || Q5 == eVar) {
            Q5 = Boolean.valueOf(((sb.d) n1Var.getValue()).f34448f);
            rVar.k0(Q5);
        }
        boolean booleanValue = ((Boolean) Q5).booleanValue();
        rVar.s(false);
        sb.d dVar6 = (sb.d) n1Var.getValue();
        rVar.b0(-1179164391);
        boolean h15 = rVar.h(dVar6);
        Object Q6 = rVar.Q();
        if (h15 || Q6 == eVar) {
            Q6 = Boolean.valueOf(((sb.d) n1Var.getValue()).f34449g);
            rVar.k0(Q6);
        }
        boolean booleanValue2 = ((Boolean) Q6).booleanValue();
        rVar.s(false);
        sb.d dVar7 = (sb.d) n1Var.getValue();
        rVar.b0(-1179161228);
        boolean h16 = rVar.h(dVar7);
        Object Q7 = rVar.Q();
        if (h16 || Q7 == eVar) {
            Q7 = Boolean.valueOf(((sb.d) n1Var.getValue()).f34459q);
            rVar.k0(Q7);
        }
        boolean booleanValue3 = ((Boolean) Q7).booleanValue();
        rVar.s(false);
        sb.d dVar8 = (sb.d) n1Var.getValue();
        rVar.b0(-1179158352);
        boolean h17 = rVar.h(dVar8);
        Object Q8 = rVar.Q();
        if (h17 || Q8 == eVar) {
            Q8 = Boolean.valueOf(((sb.d) n1Var.getValue()).f34458p);
            rVar.k0(Q8);
        }
        boolean booleanValue4 = ((Boolean) Q8).booleanValue();
        rVar.s(false);
        int i12 = 1;
        iu.j.f(false, new f9.a(context, 2), rVar, 0, 1);
        rVar.b0(-1179149269);
        Object Q9 = rVar.Q();
        if (Q9 == eVar) {
            Q9 = new tb.u(viewModel, i11);
            rVar.k0(Q9);
        }
        Function0 function0 = (Function0) Q9;
        Object h18 = v.e.h(rVar, false, -1179143827);
        int i13 = 17;
        if (h18 == eVar) {
            h18 = new androidx.compose.foundation.layout.e(viewModel, i13);
            rVar.k0(h18);
        }
        Function2 function2 = (Function2) h18;
        Object h19 = v.e.h(rVar, false, -1179136087);
        if (h19 == eVar) {
            h19 = new tb.u(viewModel, i12);
            rVar.k0(h19);
        }
        Function0 function02 = (Function0) h19;
        Object h20 = v.e.h(rVar, false, -1179132381);
        if (h20 == eVar) {
            h20 = new tb.u(viewModel, 2);
            rVar.k0(h20);
        }
        Function0 function03 = (Function0) h20;
        Object h21 = v.e.h(rVar, false, -1179128474);
        if (h21 == eVar) {
            h21 = new tb.t(viewModel, 3);
            rVar.k0(h21);
        }
        Function1 function1 = (Function1) h21;
        Object h22 = v.e.h(rVar, false, -1179122187);
        if (h22 == eVar) {
            h22 = new tb.t(viewModel, 2);
            rVar.k0(h22);
        }
        Function1 function12 = (Function1) h22;
        Object h23 = v.e.h(rVar, false, -1179117462);
        if (h23 == eVar) {
            h23 = new tb.t(viewModel, i12);
            rVar.k0(h23);
        }
        Function1 function13 = (Function1) h23;
        Object h24 = v.e.h(rVar, false, -1179111066);
        o3 o3Var = o3.f35116a;
        if (h24 == eVar) {
            h24 = t0.t.n0(null, o3Var);
            rVar.k0(h24);
        }
        g1 g1Var = (g1) h24;
        Object h25 = v.e.h(rVar, false, -1179105947);
        if (h25 == eVar) {
            h25 = new tb.o(g1Var, 1);
            rVar.k0(h25);
        }
        hu.c cVar2 = (hu.c) h25;
        Object h26 = v.e.h(rVar, false, -1179099795);
        if (h26 == eVar) {
            h26 = com.google.android.gms.internal.p002firebaseauthapi.a.j(g1Var, 6, rVar);
        }
        Function0 function04 = (Function0) h26;
        Object h27 = v.e.h(rVar, false, -1179094885);
        if (h27 == eVar) {
            h27 = t0.t.n0(null, o3Var);
            rVar.k0(h27);
        }
        g1 g1Var2 = (g1) h27;
        Object h28 = v.e.h(rVar, false, -1179090162);
        if (h28 == eVar) {
            h28 = com.google.android.gms.internal.p002firebaseauthapi.a.i(g1Var2, 8, rVar);
        }
        Function1 function14 = (Function1) h28;
        int i14 = 0;
        Object h29 = v.e.h(rVar, false, -1179085209);
        if (h29 == eVar) {
            h29 = new q0(17, g1Var2, viewModel);
            rVar.k0(h29);
        }
        rVar.s(false);
        qu.i0.G(new Object(), new tb.t(viewModel, i14), rVar, 8);
        c.n G = qu.i0.G(new Object(), new tb.t(viewModel, 4), rVar, 8);
        t0.t.e((String) t0.t.o0(viewModel.f8841v, rVar).getValue(), new tb.p(t0.t.C(viewModel.f8843x, rVar), viewModel, context, G, n1Var, null), rVar);
        p2.b(androidx.compose.foundation.layout.d.f1286c, b1.d.c(-1896902485, new tb.q(booleanValue4, str2, function12, n1Var), rVar), null, null, null, 0, 0L, 0L, null, b1.d.c(1191330870, new tb.s(viewModel, l3Var, list, cVar, booleanValue, booleanValue2, booleanValue3, function0, function2, cVar2, function14, function13, function02, function03, function1, g1Var, g1Var2, function04, commentViewModel, (Function2) h29), rVar), rVar, 805306422, 508);
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new t1(viewModel, commentViewModel, i10, 11);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0327 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x038a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0395 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0281 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x02d6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02e0 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, e3.b] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void C0(h.c r22, f3.g r23, g3.b r24, g3.k r25, java.lang.String r26) {
        /*
            Method dump skipped, instructions count: 1430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.j.C0(h.c, f3.g, g3.b, g3.k, java.lang.String):void");
    }

    public static boolean C1(int i10, int i11, int i12, int i13) {
        return (i12 == 1 || i12 == 2 || (i12 == 4 && i10 != 2)) || (i13 == 1 || i13 == 2 || (i13 == 4 && i11 != 2));
    }

    public static final void D(g1.o oVar, t0.n nVar, int i10, int i11) {
        int i12;
        int i13;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(95558836);
        int i14 = i11 & 1;
        int i15 = 4;
        if (i14 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.h(oVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 11) == 2 && rVar.G()) {
            rVar.V();
        } else {
            if (i14 != 0) {
                oVar = g1.l.f16404b;
            }
            pp.b.b(oVar, h0.h.b(kp.j.R(8, rVar)), n1.t.f28173e, null, s0.g.f34069a, qb.c.f31887a, rVar, (i12 & 14) | 1573248, 56);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new i0.c(oVar, i10, i11, i15);
        }
    }

    public static boolean D0(u3.d[] dVarArr, u3.d[] dVarArr2) {
        if (dVarArr == null || dVarArr2 == null || dVarArr.length != dVarArr2.length) {
            return false;
        }
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            u3.d dVar = dVarArr[i10];
            char c10 = dVar.f36708a;
            u3.d dVar2 = dVarArr2[i10];
            if (c10 != dVar2.f36708a || dVar.f36709b.length != dVar2.f36709b.length) {
                return false;
            }
        }
        return true;
    }

    public static final void E(g1.o oVar, t0.n nVar, int i10, int i11) {
        int i12;
        int i13;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(101076369);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.h(oVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 11) == 2 && rVar.G()) {
            rVar.V();
        } else {
            if (i14 != 0) {
                oVar = g1.l.f16404b;
            }
            b0.s.a(oVar, rVar, i12 & 14);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new i0.c(oVar, i10, i11, 1);
        }
    }

    public static void E0(boolean z10) {
        if (z10) {
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static final void F(g1.o oVar, String searchString, h7.b lazyPagingItemsFollowers, h7.b lazyPagingItemsSearchFollowers, h7.b lazyPagingItemsSearchUniversal, List list, Function2 onRecyclerItemClicked, t0.n nVar, int i10, int i11) {
        g1.o oVar2;
        boolean z10;
        Intrinsics.checkNotNullParameter(searchString, "searchString");
        Intrinsics.checkNotNullParameter(lazyPagingItemsFollowers, "lazyPagingItemsFollowers");
        Intrinsics.checkNotNullParameter(lazyPagingItemsSearchFollowers, "lazyPagingItemsSearchFollowers");
        Intrinsics.checkNotNullParameter(lazyPagingItemsSearchUniversal, "lazyPagingItemsSearchUniversal");
        Intrinsics.checkNotNullParameter(onRecyclerItemClicked, "onRecyclerItemClicked");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-1841335352);
        if ((i11 & 1) != 0) {
            oVar2 = g1.l.f16404b;
        } else {
            oVar2 = oVar;
        }
        int length = searchString.length();
        to.e eVar = t0.m.f35080a;
        int i12 = 1;
        int i13 = 0;
        if (length == 0) {
            rVar.b0(-1277288619);
            rVar.b0(-318290689);
            if ((((i10 & 3670016) ^ 1572864) <= 1048576 || !rVar.h(onRecyclerItemClicked)) && (i10 & 1572864) != 1048576) {
                i12 = 0;
            }
            Object Q = rVar.Q();
            if (i12 != 0 || Q == eVar) {
                Q = new pd.y(onRecyclerItemClicked, i13);
                rVar.k0(Q);
            }
            rVar.s(false);
            H(oVar2, lazyPagingItemsFollowers, list, (Function2) Q, rVar, (i10 & 14) | 576 | ((i10 >> 3) & 112), 0);
            rVar.s(false);
        } else {
            rVar.b0(-1276958066);
            rVar.b0(-318275841);
            if ((((i10 & 3670016) ^ 1572864) > 1048576 && rVar.h(onRecyclerItemClicked)) || (i10 & 1572864) == 1048576) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object Q2 = rVar.Q();
            if (z10 || Q2 == eVar) {
                Q2 = new pd.y(onRecyclerItemClicked, i12);
                rVar.k0(Q2);
            }
            rVar.s(false);
            int i14 = i10 >> 3;
            o0(oVar2, searchString, lazyPagingItemsSearchFollowers, lazyPagingItemsSearchUniversal, list, (Function2) Q2, rVar, 32768 | (i10 & 14) | (i10 & 112) | 512 | (i14 & 896) | 4096 | (i14 & 7168), 0);
            rVar.s(false);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new z(oVar2, searchString, lazyPagingItemsFollowers, lazyPagingItemsSearchFollowers, lazyPagingItemsSearchUniversal, list, onRecyclerItemClicked, i10, i11);
        }
    }

    public static void F0(boolean z10, String str) {
        if (z10) {
        } else {
            throw new IllegalArgumentException(String.valueOf(str));
        }
    }

    public static final void G(g1.o oVar, t0.n nVar, int i10, int i11) {
        g1.o oVar2;
        int i12;
        int i13;
        g1.o oVar3;
        t0.r rVar;
        t0.r rVar2 = (t0.r) nVar;
        rVar2.c0(2111043445);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            oVar2 = oVar;
        } else if ((i10 & 14) == 0) {
            oVar2 = oVar;
            if (rVar2.h(oVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            oVar2 = oVar;
            i12 = i10;
        }
        if ((i12 & 11) == 2 && rVar2.G()) {
            rVar2.V();
            rVar = rVar2;
        } else {
            g1.l lVar = g1.l.f16404b;
            if (i14 != 0) {
                oVar3 = lVar;
            } else {
                oVar3 = oVar2;
            }
            g1.o g10 = oVar3.g(androidx.compose.foundation.layout.d.f1286c);
            b0.g gVar = b0.n.f2939e;
            g1.e eVar = g1.a.f16392n;
            rVar2.b0(-483455358);
            l1 a10 = y.a(gVar, eVar, rVar2, 54);
            rVar2.b0(-1323940314);
            int i15 = rVar2.P;
            r1 o10 = rVar2.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(g10);
            if (rVar2.f35166a instanceof t0.f) {
                rVar2.e0();
                if (rVar2.O) {
                    rVar2.n(jVar);
                } else {
                    rVar2.n0();
                }
                t0.t.v0(rVar2, a10, c2.k.f7749e);
                t0.t.v0(rVar2, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i15))) {
                    nn.d.s(i15, rVar2, i15, iVar);
                }
                nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
                androidx.compose.foundation.a.c(w0.u(R.drawable.ic_bull_box, rVar2, 6), hl.f.c1(R.string.no_followers_compose, rVar2), null, null, null, s0.g.f34069a, null, rVar2, 8, 124);
                al.d.C(v.e.i(lVar, 16, rVar2, R.string.no_followers_yet_privacy_layer, rVar2), null, w0.e(R.color.black_1A1A1A, rVar2), e1(12), null, null, jh.c.f21375d, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1575936, 0, 130994);
                rVar = rVar2;
                v.e.y(rVar, false, true, false, false);
                oVar2 = oVar3;
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new i0.c(oVar2, i10, i11, 6);
        }
    }

    public static void G0(int i10, int i11) {
        if (i10 >= 0 && i10 < i11) {
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v5 */
    public static final void H(g1.o oVar, h7.b listOfFollowersPagingItems, List list, Function2 onRecyclerItemClicked, t0.n nVar, int i10, int i11) {
        g1.o oVar2;
        Intrinsics.checkNotNullParameter(listOfFollowersPagingItems, "listOfFollowersPagingItems");
        Intrinsics.checkNotNullParameter(onRecyclerItemClicked, "onRecyclerItemClicked");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(1188480465);
        int i12 = i11 & 1;
        g1.l lVar = g1.l.f16404b;
        if (i12 != 0) {
            oVar2 = lVar;
        } else {
            oVar2 = oVar;
        }
        m0 a10 = p0.a(rVar);
        boolean a11 = Intrinsics.a(listOfFollowersPagingItems.c().f16682a, x0.f17118b);
        t0.f fVar = rVar.f35166a;
        if (a11) {
            rVar.b0(-919081224);
            b0.g gVar = b0.n.f2939e;
            g1.e eVar = g1.a.f16392n;
            int i13 = (i10 & 14) | 432;
            rVar.b0(-483455358);
            int i14 = i13 >> 3;
            l1 a12 = y.a(gVar, eVar, rVar, (i14 & 112) | (i14 & 14));
            int i15 = (i13 << 3) & 112;
            rVar.b0(-1323940314);
            int i16 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(oVar2);
            int i17 = ((i15 << 9) & 7168) | 6;
            if (fVar instanceof t0.f) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t0.t.v0(rVar, a12, c2.k.f7749e);
                t0.t.v0(rVar, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i16))) {
                    nn.d.s(i16, rVar, i16, iVar);
                }
                nn.d.q((i17 >> 3) & 112, j10, new m2(rVar), rVar, 2058660585);
                l5.a(null, 0L, s0.g.f34069a, 0L, 0, rVar, 0, 31);
                v.e.y(rVar, false, true, false, false);
                rVar.s(false);
            } else {
                al.d.v0();
                throw null;
            }
        } else {
            ?? r22 = 0;
            rVar.b0(-918784678);
            rVar.b0(-583827656);
            if (listOfFollowersPagingItems.b() > 0) {
                float f10 = 16;
                g1.o x10 = androidx.compose.foundation.layout.a.x(oVar2, f10, s0.g.f34069a, f10, s0.g.f34069a, 10);
                rVar.b0(-483455358);
                l1 a13 = y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
                rVar.b0(-1323940314);
                int i18 = rVar.P;
                r1 o11 = rVar.o();
                c2.l.M.getClass();
                c2.j jVar2 = c2.k.f7746b;
                b1.c j11 = androidx.compose.ui.layout.a.j(x10);
                if (fVar instanceof t0.f) {
                    rVar.e0();
                    if (rVar.O) {
                        rVar.n(jVar2);
                    } else {
                        rVar.n0();
                    }
                    t0.t.v0(rVar, a13, c2.k.f7749e);
                    t0.t.v0(rVar, o11, c2.k.f7748d);
                    c2.i iVar2 = c2.k.f7750f;
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i18))) {
                        nn.d.s(i18, rVar, i18, iVar2);
                    }
                    nn.d.q(0, j11, new m2(rVar), rVar, 2058660585);
                    b9.b(v.e.i(lVar, f10, rVar, R.string.your_followers_compose, rVar), null, w0.e(R.color.black_1A1A1A, rVar), e1(14), null, null, jh.c.f21375d, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 1575936, 0, 130994);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                    qu.i0.c(androidx.compose.animation.a.a(oVar2), a10, null, false, null, null, null, false, new rb.f(3, (Object) listOfFollowersPagingItems, (Object) list, (Object) onRecyclerItemClicked), rVar, 0, 252);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(oVar2, f10), rVar);
                    r22 = 0;
                    rVar.s(false);
                    rVar.s(true);
                    rVar.s(false);
                    rVar.s(false);
                } else {
                    al.d.v0();
                    throw null;
                }
            }
            rVar.s(r22);
            rVar.b0(-583776656);
            if ((listOfFollowersPagingItems.c().f16682a instanceof y0) && listOfFollowersPagingItems.c().f16684c.f17152a && listOfFollowersPagingItems.b() < 1) {
                G(oVar2, rVar, i10 & 14, r22);
            }
            rVar.s(r22);
            if (listOfFollowersPagingItems.c().f16682a instanceof g7.w0) {
                G(oVar2, rVar, i10 & 14, r22);
            }
            rVar.s(r22);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new d0.y((Object) oVar2, (Object) listOfFollowersPagingItems, (Object) list, (ut.d) onRecyclerItemClicked, i10, i11, 9);
        }
    }

    public static void H0(boolean z10) {
        if (z10) {
        } else {
            throw new IllegalStateException();
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [f.a, java.lang.Object] */
    public static final void I(g1.o oVar, GroupCreateViewModel viewModel, t0.n nVar, int i10, int i11) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-1893514181);
        if ((i11 & 1) != 0) {
            oVar = g1.l.f16404b;
        }
        Context context = (Context) rVar.m(AndroidCompositionLocals_androidKt.f1428b);
        rVar.b0(-1942554614);
        Object Q = rVar.Q();
        if (Q == t0.m.f35080a) {
            Q = t0.t.n0(null, o3.f35116a);
            rVar.k0(Q);
        }
        g1 g1Var = (g1) Q;
        rVar.s(false);
        pp.b.b(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.e(oVar, 1.0f), 150), null, w0.e(R.color.purpleCancelBackground, rVar), null, s0.g.f34069a, b1.d.c(-1377821410, new q0(20, qu.i0.G(new Object(), new c0(viewModel, context, g1Var, 0), rVar, 8), g1Var), rVar), rVar, 1572864, 58);
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new b0(oVar, viewModel, i10, i11, 0);
        }
    }

    public static void I0(Object obj) {
        if (obj != null) {
        } else {
            throw new IllegalStateException();
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [f.a, java.lang.Object] */
    public static final void J(g1.o oVar, GroupCreateViewModel viewModel, t0.n nVar, int i10, int i11) {
        g1.o oVar2;
        boolean z10;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-568504809);
        int i12 = i11 & 1;
        g1.l lVar = g1.l.f16404b;
        if (i12 != 0) {
            oVar2 = lVar;
        } else {
            oVar2 = oVar;
        }
        Context context = (Context) rVar.m(AndroidCompositionLocals_androidKt.f1428b);
        rVar.b0(-343090426);
        Object Q = rVar.Q();
        if (Q == t0.m.f35080a) {
            Q = t0.t.n0(null, o3.f35116a);
            rVar.k0(Q);
        }
        g1 g1Var = (g1) Q;
        rVar.s(false);
        int i13 = 1;
        g1.o k10 = androidx.compose.foundation.a.k(androidx.compose.foundation.layout.d.m(oVar2, 92), new a0(qu.i0.G(new Object(), new c0(viewModel, context, g1Var, i13), rVar, 8), i13), 7);
        rVar.b0(733328855);
        b0.v c10 = b0.s.c(g1.a.f16379a, false, rVar, 0);
        rVar.b0(-1323940314);
        int i14 = rVar.P;
        r1 o10 = rVar.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(k10);
        if (rVar.f35166a instanceof t0.f) {
            rVar.e0();
            if (rVar.O) {
                rVar.n(jVar);
            } else {
                rVar.n0();
            }
            t0.t.v0(rVar, c10, c2.k.f7749e);
            t0.t.v0(rVar, o10, c2.k.f7748d);
            c2.i iVar = c2.k.f7750f;
            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i14))) {
                nn.d.s(i14, rVar, i14, iVar);
            }
            nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f1281a;
            if (((Uri) g1Var.getValue()) == null) {
                rVar.b0(1830474437);
                androidx.compose.foundation.a.c(w0.u(R.drawable.ic_camera_create_group, rVar, 6), "Camera Click", androidx.compose.foundation.a.e(androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.d.m(androidx.compose.foundation.layout.a.t(lVar, 4), 88), h0.h.f17801a), w0.e(R.color.white_EFEFEF, rVar), s0.f28162a), null, a2.k.f99d, s0.g.f34069a, null, rVar, 24632, 104);
                androidx.compose.foundation.a.c(w0.u(R.drawable.ic_create_group_camera, rVar, 6), "Cross Symbol", bVar.a(lVar, g1.a.f16387i), null, null, s0.g.f34069a, null, rVar, 56, 120);
                rVar.s(false);
                z10 = false;
            } else {
                rVar.b0(1831177548);
                q6.l.d((Uri) g1Var.getValue(), null, androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.d.e(lVar, 1.0f), h0.h.f17801a), a2.k.f96a, rVar, 1572920, 4024);
                z10 = false;
                rVar.s(false);
            }
            x1 t10 = da.e.t(rVar, z10, true, z10, z10);
            if (t10 != null) {
                t10.f35245d = new b0(oVar2, viewModel, i10, i11, 1);
                return;
            }
            return;
        }
        al.d.v0();
        throw null;
    }

    public static void J0(Object obj, String str) {
        if (obj != null) {
        } else {
            throw new IllegalStateException(String.valueOf(str));
        }
    }

    public static final void K(long j10, int i10, String text, long j11, long j12, o2.s fontFamily, t0.n nVar, int i11) {
        int i12;
        t0.r rVar;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(fontFamily, "fontFamily");
        t0.r rVar2 = (t0.r) nVar;
        rVar2.c0(526048087);
        if ((i11 & 14) == 0) {
            if (rVar2.g(j10)) {
                i18 = 4;
            } else {
                i18 = 2;
            }
            i12 = i18 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (rVar2.f(i10)) {
                i17 = 32;
            } else {
                i17 = 16;
            }
            i12 |= i17;
        }
        if ((i11 & 896) == 0) {
            if (rVar2.h(text)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i12 |= i16;
        }
        if ((i11 & 7168) == 0) {
            if (rVar2.g(j11)) {
                i15 = 2048;
            } else {
                i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i15;
        }
        if ((57344 & i11) == 0) {
            if (rVar2.g(j12)) {
                i14 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i14 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i14;
        }
        if ((458752 & i11) == 0) {
            if (rVar2.h(fontFamily)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i12 |= i13;
        }
        if ((374491 & i12) == 74898 && rVar2.G()) {
            rVar2.V();
            rVar = rVar2;
        } else {
            g1.l lVar = g1.l.f16404b;
            g1.o e10 = androidx.compose.foundation.a.e(androidx.compose.foundation.layout.a.x(androidx.compose.foundation.layout.d.g(lVar, 72), s0.g.f34069a, 8, s0.g.f34069a, s0.g.f34069a, 13), j10, s0.f28162a);
            b0.g gVar = b0.n.f2939e;
            g1.e eVar = g1.a.f16392n;
            rVar2.b0(-483455358);
            l1 a10 = y.a(gVar, eVar, rVar2, 54);
            rVar2.b0(-1323940314);
            int i19 = rVar2.P;
            r1 o10 = rVar2.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j13 = androidx.compose.ui.layout.a.j(e10);
            boolean z10 = rVar2.f35166a instanceof t0.f;
            if (z10) {
                rVar2.e0();
                if (rVar2.O) {
                    rVar2.n(jVar);
                } else {
                    rVar2.n0();
                }
                c2.i iVar = c2.k.f7749e;
                t0.t.v0(rVar2, a10, iVar);
                c2.i iVar2 = c2.k.f7748d;
                t0.t.v0(rVar2, o10, iVar2);
                c2.i iVar3 = c2.k.f7750f;
                if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i19))) {
                    nn.d.s(i19, rVar2, i19, iVar3);
                }
                nn.d.q(0, j13, new m2(rVar2), rVar2, 2058660585);
                g1.f fVar = g1.a.f16389k;
                rVar2.b0(693286680);
                l1 a11 = o1.a(b0.n.f2935a, fVar, rVar2, 48);
                rVar2.b0(-1323940314);
                int i20 = rVar2.P;
                r1 o11 = rVar2.o();
                b1.c j14 = androidx.compose.ui.layout.a.j(lVar);
                if (z10) {
                    rVar2.e0();
                    if (rVar2.O) {
                        rVar2.n(jVar);
                    } else {
                        rVar2.n0();
                    }
                    t0.t.v0(rVar2, a11, iVar);
                    t0.t.v0(rVar2, o11, iVar2);
                    if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i20))) {
                        nn.d.s(i20, rVar2, i20, iVar3);
                    }
                    nn.d.q(0, j14, new m2(rVar2), rVar2, 2058660585);
                    int i21 = i12 >> 3;
                    al.d.z(i10, null, null, 0L, rVar2, i21 & 14, 14);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, 4), rVar2);
                    rVar = rVar2;
                    al.d.C(text, null, j11, j12, null, null, fontFamily, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, ((i12 >> 6) & 14) | (i21 & 896) | (i21 & 7168) | (3670016 & (i12 << 3)), 0, 130994);
                    v.e.y(rVar, false, true, false, false);
                    v.e.y(rVar, false, true, false, false);
                } else {
                    al.d.v0();
                    throw null;
                }
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new dd.a(j10, i10, text, j11, j12, fontFamily, i11);
        }
    }

    public static final g1 K0(i1 i1Var, t0.n nVar) {
        t0.r rVar = (t0.r) nVar;
        rVar.b0(743249048);
        androidx.lifecycle.t tVar = (androidx.lifecycle.t) rVar.m(x4.e.f39964a);
        androidx.lifecycle.n nVar2 = androidx.lifecycle.n.f1950d;
        kotlin.coroutines.k kVar = kotlin.coroutines.k.f23369a;
        Object value = i1Var.getValue();
        androidx.lifecycle.o lifecycle = tVar.getLifecycle();
        rVar.b0(1977777920);
        Object[] objArr = {i1Var, lifecycle, nVar2, kVar};
        rVar.b0(710004817);
        boolean j10 = rVar.j(lifecycle) | rVar.h(nVar2) | rVar.j(kVar) | rVar.j(i1Var);
        Object Q = rVar.Q();
        to.e eVar = t0.m.f35080a;
        if (j10 || Q == eVar) {
            x4.c cVar = new x4.c(lifecycle, nVar2, kVar, i1Var, null);
            rVar.k0(cVar);
            Q = cVar;
        }
        Function2 function2 = (Function2) Q;
        rVar.s(false);
        rVar.b0(490154582);
        rVar.b0(-1870528330);
        Object Q2 = rVar.Q();
        if (Q2 == eVar) {
            Q2 = t0.t.n0(value, o3.f35116a);
            rVar.k0(Q2);
        }
        g1 g1Var = (g1) Q2;
        rVar.s(false);
        Object[] copyOf = Arrays.copyOf(objArr, 4);
        rVar.b0(-1870528186);
        boolean j11 = rVar.j(function2);
        Object Q3 = rVar.Q();
        if (j11 || Q3 == eVar) {
            Q3 = new d3(function2, g1Var, null);
            rVar.k0(Q3);
        }
        rVar.s(false);
        t0.t.f(copyOf, (Function2) Q3, rVar);
        rVar.s(false);
        rVar.s(false);
        rVar.s(false);
        return g1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0119, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r0.Q(), java.lang.Integer.valueOf(r2)) == false) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00eb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void L(g1.o r61, boolean r62, kotlin.jvm.functions.Function1 r63, t0.n r64, int r65, int r66) {
        /*
            Method dump skipped, instructions count: 1240
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.j.L(g1.o, boolean, kotlin.jvm.functions.Function1, t0.n, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static long[] L0(Serializable serializable) {
        if (serializable instanceof int[]) {
            int[] iArr = (int[]) serializable;
            long[] jArr = new long[iArr.length];
            for (int i10 = 0; i10 < iArr.length; i10++) {
                jArr[i10] = iArr[i10];
            }
            return jArr;
        }
        if (serializable instanceof long[]) {
            return (long[]) serializable;
        }
        return null;
    }

    public static final void M(g1.o oVar, List list, Function1 onDeleteItemClicked, t0.n nVar, int i10, int i11) {
        g1.o oVar2;
        boolean z10;
        Intrinsics.checkNotNullParameter(onDeleteItemClicked, "onDeleteItemClicked");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-1399709483);
        int i12 = i11 & 1;
        g1.l lVar = g1.l.f16404b;
        if (i12 != 0) {
            oVar2 = lVar;
        } else {
            oVar2 = oVar;
        }
        m0 a10 = p0.a(rVar);
        g1.o e10 = androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.a.x(oVar2, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 2, 7), 1.0f);
        rVar.b0(-483455358);
        l1 a11 = y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
        rVar.b0(-1323940314);
        int i13 = rVar.P;
        r1 o10 = rVar.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(e10);
        boolean z11 = rVar.f35166a instanceof t0.f;
        if (z11) {
            rVar.e0();
            if (rVar.O) {
                rVar.n(jVar);
            } else {
                rVar.n0();
            }
            c2.i iVar = c2.k.f7749e;
            t0.t.v0(rVar, a11, iVar);
            c2.i iVar2 = c2.k.f7748d;
            t0.t.v0(rVar, o10, iVar2);
            c2.i iVar3 = c2.k.f7750f;
            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i13))) {
                nn.d.s(i13, rVar, i13, iVar3);
            }
            nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
            if (list == null || list.isEmpty()) {
                z10 = false;
            } else {
                float f10 = 16;
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                g1.o e11 = androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.a.x(lVar, f10, s0.g.f34069a, f10, s0.g.f34069a, 10), 1.0f);
                rVar.b0(693286680);
                l1 a12 = o1.a(b0.n.f2935a, g1.a.f16388j, rVar, 0);
                rVar.b0(-1323940314);
                int i14 = rVar.P;
                r1 o11 = rVar.o();
                b1.c j11 = androidx.compose.ui.layout.a.j(e11);
                if (z11) {
                    rVar.e0();
                    if (rVar.O) {
                        rVar.n(jVar);
                    } else {
                        rVar.n0();
                    }
                    t0.t.v0(rVar, a12, iVar);
                    t0.t.v0(rVar, o11, iVar2);
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i14))) {
                        nn.d.s(i14, rVar, i14, iVar3);
                    }
                    nn.d.q(0, j11, new m2(rVar), rVar, 2058660585);
                    z10 = false;
                    b9.b(hl.f.d1(R.string.selected_text_value, new Object[]{Integer.valueOf(list.size())}, rVar), null, w0.e(R.color.black_1A1A1A, rVar), 0L, null, null, jh.c.f21375d, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 1572864, 0, 131002);
                    v.e.y(rVar, false, true, false, false);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
                    qu.i0.d(androidx.compose.animation.a.a(androidx.compose.foundation.layout.d.e(oVar2, 1.0f)), a10, null, false, null, null, null, false, new lb.j(list, onDeleteItemClicked, 8), rVar, 0, 252);
                } else {
                    al.d.v0();
                    throw null;
                }
            }
            x1 t10 = da.e.t(rVar, z10, true, z10, z10);
            if (t10 != null) {
                t10.f35245d = new d0.t(i10, i11, 12, oVar2, list, onDeleteItemClicked);
                return;
            }
            return;
        }
        al.d.v0();
        throw null;
    }

    public static float[] M0(float[] fArr, int i10) {
        if (i10 >= 0) {
            int length = fArr.length;
            if (length >= 0) {
                int min = Math.min(i10, length);
                float[] fArr2 = new float[i10];
                System.arraycopy(fArr, 0, fArr2, 0, min);
                return fArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    /* JADX WARN: Code restructure failed: missing block: B:184:0x03a0, code lost:
    
        r10 = r10 - r26;
     */
    /* JADX WARN: Removed duplicated region for block: B:168:0x03dc  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0450  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void N(float r29, java.lang.String r30, c0.m0 r31, boolean r32, float r33, float r34, float r35, boolean r36, zb.e r37, boolean r38, kotlin.jvm.functions.Function2 r39, kotlin.jvm.functions.Function2 r40, t0.n r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 1109
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.j.N(float, java.lang.String, c0.m0, boolean, float, float, float, boolean, zb.e, boolean, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, t0.n, int, int):void");
    }

    public static Handler N0(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return n.d.b(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException e10) {
            e = e10;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InstantiationException e11) {
            e = e11;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (NoSuchMethodException e12) {
            e = e12;
            Log.w("HandlerCompat", "Unable to invoke Handler(Looper, Callback, boolean) constructor", e);
            return new Handler(looper);
        } catch (InvocationTargetException e13) {
            Throwable cause = e13.getCause();
            if (!(cause instanceof RuntimeException)) {
                if (cause instanceof Error) {
                    throw ((Error) cause);
                }
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
    }

    public static final void O(ArenaGame arenaGame, boolean z10, t0.n nVar, int i10, int i11) {
        Intrinsics.checkNotNullParameter(arenaGame, "arenaGame");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-1647558019);
        int i12 = 0;
        if ((i11 & 2) != 0) {
            z10 = false;
        }
        float f10 = 16;
        pp.b.b(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.a.w(g1.l.f16404b, f10, f10, f10, f10), 1.0f), h0.h.b(12), n1.t.f28173e, null, 4, b1.d.c(90581728, new dd.b(z10, arenaGame, i12), rVar), rVar, 1769856, 24);
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new c.h(arenaGame, z10, i10, i11);
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:31:0x007a. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0096 A[Catch: NumberFormatException -> 0x00aa, LOOP:3: B:25:0x0068->B:35:0x0096, LOOP_END, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x009c A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1 A[Catch: NumberFormatException -> 0x00aa, TryCatch #0 {NumberFormatException -> 0x00aa, blocks: (B:22:0x0054, B:25:0x0068, B:27:0x006e, B:31:0x007a, B:35:0x0096, B:39:0x009c, B:44:0x00b1, B:56:0x00b4), top: B:21:0x0054 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static u3.d[] O0(java.lang.String r17) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.j.O0(java.lang.String):u3.d[]");
    }

    public static final void P(Function0 bottomSheetCancelClicked, Function0 onButtonYesClicked, t0.n nVar, int i10) {
        int i11;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(bottomSheetCancelClicked, "bottomSheetCancelClicked");
        Intrinsics.checkNotNullParameter(onButtonYesClicked, "onButtonYesClicked");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-1314300552);
        if ((i10 & 14) == 0) {
            if (rVar.j(bottomSheetCancelClicked)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (rVar.j(onButtonYesClicked)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        if ((i11 & 91) == 18 && rVar.G()) {
            rVar.V();
        } else {
            pp.b.b(androidx.compose.foundation.layout.d.e(g1.l.f16404b, 1.0f), h0.h.a(4, 4), 0L, null, s0.g.f34069a, b1.d.c(-2104518027, new q0(21, bottomSheetCancelClicked, onButtonYesClicked), rVar), rVar, 1572870, 60);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new t1(bottomSheetCancelClicked, onButtonYesClicked, i10, 15);
        }
    }

    public static Path P0(String str) {
        Path path = new Path();
        try {
            u3.d.b(O0(str), path);
            return path;
        } catch (RuntimeException e10) {
            throw new RuntimeException("Error in parsing ".concat(str), e10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0268  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0093  */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r0v23 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Q(g1.o r24, boolean r25, boolean r26, hu.c r27, t0.n r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.j.Q(g1.o, boolean, boolean, hu.c, t0.n, int, int):void");
    }

    public static u3.d[] Q0(u3.d[] dVarArr) {
        u3.d[] dVarArr2 = new u3.d[dVarArr.length];
        for (int i10 = 0; i10 < dVarArr.length; i10++) {
            dVarArr2[i10] = new u3.d(dVarArr[i10]);
        }
        return dVarArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:119:0x052a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0261  */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void R(com.assetgro.stockgro.data.model.PrivacyLayerUserGroup r46, ne.a r47, kotlin.jvm.functions.Function1 r48, t0.n r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 1330
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.j.R(com.assetgro.stockgro.data.model.PrivacyLayerUserGroup, ne.a, kotlin.jvm.functions.Function1, t0.n, int, int):void");
    }

    public static final boolean R0(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:122:0x036a, code lost:
    
        if (((java.lang.Number) r9.getValue()).doubleValue() != 0.0d) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x033a, code lost:
    
        if (((java.lang.Number) r9.getValue()).doubleValue() != 0.0d) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x033d, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x04d1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x05dd  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x067b  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x03ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x03db  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x044d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0468  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x04ab  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void S(com.assetgro.stockgro.feature_market.presentation.fno.order.ModifyOrderPageBottomSheetViewModel r59, kotlin.jvm.functions.Function2 r60, t0.n r61, int r62, int r63) {
        /*
            Method dump skipped, instructions count: 1677
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.j.S(com.assetgro.stockgro.feature_market.presentation.fno.order.ModifyOrderPageBottomSheetViewModel, kotlin.jvm.functions.Function2, t0.n, int, int):void");
    }

    public static final boolean S0(int i10, int i11) {
        return i10 == i11;
    }

    public static final void T(String str, t0.n nVar, int i10, int i11) {
        String str2;
        int i12;
        int i13;
        String str3;
        t0.r rVar;
        t0.r rVar2 = (t0.r) nVar;
        rVar2.c0(-547128384);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            str2 = str;
        } else if ((i10 & 14) == 0) {
            str2 = str;
            if (rVar2.h(str2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            str2 = str;
            i12 = i10;
        }
        if ((i12 & 11) == 2 && rVar2.G()) {
            rVar2.V();
            rVar = rVar2;
        } else {
            if (i14 != 0) {
                str3 = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                str3 = str2;
            }
            g8 g8Var = g8.f26217a;
            long j10 = n1.t.f28176h;
            rVar = rVar2;
            String str4 = str3;
            al.d.i(str4, ka.a0.f22716c, h2.l.a(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.a.g(g1.l.f16404b, 1, androidx.compose.ui.graphics.a.d(4288256409L), h0.h.b(6)), 1.0f), 40), false, ka.a0.f22715b), false, true, g0.a(5, 16744447, 0L, 0L, 0L, 0L, null, ((c9) rVar2.m(d9.f26076b)).f26021l, null, null, null), null, null, null, null, false, null, null, null, true, 0, null, null, g8.f(0L, j10, 0L, j10, j10, j10, 0L, rVar2, 2096923), null, rVar, (i12 & 14) | 24624, 24576, 769992);
            str2 = str3;
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new ka.b0(str2, i10, i11, 0);
        }
    }

    public static String T0(List list, String str, e1 e1Var, int i10) {
        CharSequence charSequence;
        int i11;
        String str2;
        if ((i10 & 1) != 0) {
            str = ", ";
        }
        int i12 = i10 & 2;
        String str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        if (i12 != 0) {
            charSequence = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            charSequence = null;
        }
        if ((i10 & 4) == 0) {
            str3 = null;
        }
        if ((i10 & 8) != 0) {
            i11 = -1;
        } else {
            i11 = 0;
        }
        if ((i10 & 16) != 0) {
            str2 = "...";
        } else {
            str2 = null;
        }
        if ((i10 & 32) != 0) {
            e1Var = null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(charSequence);
        int size = list.size();
        int i13 = 0;
        for (int i14 = 0; i14 < size; i14++) {
            Object obj = list.get(i14);
            i13++;
            if (i13 > 1) {
                sb2.append((CharSequence) str);
            }
            if (i11 >= 0 && i13 > i11) {
                break;
            }
            if (e1Var != null) {
                sb2.append((CharSequence) e1Var.invoke(obj));
            } else if (obj == null || (obj instanceof CharSequence)) {
                sb2.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb2.append(((Character) obj).charValue());
            } else {
                sb2.append((CharSequence) String.valueOf(obj));
            }
        }
        if (i11 >= 0 && i13 > i11) {
            sb2.append((CharSequence) str2);
        }
        sb2.append((CharSequence) str3);
        return sb2.toString();
    }

    public static final void U(g1 g1Var, t0.n nVar, int i10, int i11) {
        g1 g1Var2;
        int i12;
        int i13;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-927188599);
        if ((i10 & 14) == 0) {
            if ((i11 & 1) == 0) {
                g1Var2 = g1Var;
                if (rVar.h(g1Var2)) {
                    i13 = 4;
                    i12 = i13 | i10;
                }
            } else {
                g1Var2 = g1Var;
            }
            i13 = 2;
            i12 = i13 | i10;
        } else {
            g1Var2 = g1Var;
            i12 = i10;
        }
        if ((i12 & 11) == 2 && rVar.G()) {
            rVar.V();
        } else {
            rVar.X();
            if ((i10 & 1) != 0 && !rVar.E()) {
                rVar.V();
                int i14 = i11 & 1;
            } else if ((i11 & 1) != 0) {
                g1Var2 = t0.t.n0(0, o3.f35116a);
            }
            g1 g1Var3 = g1Var2;
            rVar.t();
            long d10 = androidx.compose.ui.graphics.a.d(4283048166L);
            long d11 = androidx.compose.ui.graphics.a.d(4291547647L);
            float f10 = 8;
            z7.b(((Number) g1Var3.getValue()).intValue(), androidx.compose.foundation.layout.d.g(androidx.compose.foundation.a.g(androidx.compose.ui.draw.a.b(g1.l.f16404b, h0.h.b(f10)), 1, n1.t.f28172d, h0.h.b(f10)), 32), n1.t.f28173e, 0L, ka.d.f22763b, null, b1.d.c(545356017, new e0(vt.y.g(hl.f.c1(R.string.text_market, rVar), hl.f.c1(R.string.text_limit, rVar)), g1Var3, d11, d10), rVar), rVar, 1597824, 40);
            g1Var2 = g1Var3;
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new ka.b0(g1Var2, i10, i11, 1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, k3.p] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r10v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v5, types: [java.lang.Object, k3.p] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    public static k3.p U0(j3.d dVar, int i10, ArrayList arrayList, k3.p pVar) {
        int i11;
        int i12;
        if (i10 == 0) {
            i11 = dVar.f20878p0;
        } else {
            i11 = dVar.f20880q0;
        }
        int i13 = 0;
        if (i11 != -1 && (pVar == 0 || i11 != pVar.f22025b)) {
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    break;
                }
                k3.p pVar2 = (k3.p) arrayList.get(i14);
                if (pVar2.f22025b == i11) {
                    if (pVar != 0) {
                        pVar.c(i10, pVar2);
                        arrayList.remove((Object) pVar);
                    }
                    pVar = pVar2;
                } else {
                    i14++;
                }
            }
        } else if (i11 != -1) {
            return pVar;
        }
        k3.p pVar3 = pVar;
        if (pVar == 0) {
            if (dVar instanceof j3.j) {
                j3.j jVar = (j3.j) dVar;
                int i15 = 0;
                while (true) {
                    if (i15 < jVar.f20927t0) {
                        j3.d dVar2 = jVar.f20926s0[i15];
                        if ((i10 == 0 && (i12 = dVar2.f20878p0) != -1) || (i10 == 1 && (i12 = dVar2.f20880q0) != -1)) {
                            break;
                        }
                        i15++;
                    } else {
                        i12 = -1;
                        break;
                    }
                }
                if (i12 != -1) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= arrayList.size()) {
                            break;
                        }
                        k3.p pVar4 = (k3.p) arrayList.get(i16);
                        if (pVar4.f22025b == i12) {
                            pVar = pVar4;
                            break;
                        }
                        i16++;
                    }
                }
            }
            if (pVar == 0) {
                pVar = new Object();
                pVar.f22024a = new ArrayList();
                pVar.f22027d = null;
                pVar.f22028e = -1;
                int i17 = k3.p.f22023f;
                k3.p.f22023f = i17 + 1;
                pVar.f22025b = i17;
                pVar.f22026c = i10;
            }
            arrayList.add(pVar);
            pVar3 = pVar;
        }
        ArrayList arrayList2 = pVar3.f22024a;
        if (!arrayList2.contains(dVar)) {
            arrayList2.add(dVar);
            if (dVar instanceof j3.h) {
                j3.h hVar = (j3.h) dVar;
                j3.c cVar = hVar.f20923v0;
                if (hVar.f20924w0 == 0) {
                    i13 = 1;
                }
                cVar.c(i13, pVar3, arrayList);
            }
            int i18 = pVar3.f22025b;
            if (i10 == 0) {
                dVar.f20878p0 = i18;
                dVar.K.c(i10, pVar3, arrayList);
                dVar.M.c(i10, pVar3, arrayList);
            } else {
                dVar.f20880q0 = i18;
                dVar.L.c(i10, pVar3, arrayList);
                dVar.O.c(i10, pVar3, arrayList);
                dVar.N.c(i10, pVar3, arrayList);
            }
            dVar.R.c(i10, pVar3, arrayList);
        }
        return pVar3;
    }

    public static final void V(m0 m0Var, Function0 loadMore, t0.n nVar, int i10) {
        int i11;
        int i12;
        int i13;
        Intrinsics.checkNotNullParameter(m0Var, "<this>");
        Intrinsics.checkNotNullParameter(loadMore, "loadMore");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(533996503);
        if ((i10 & 14) == 0) {
            if (rVar.h(m0Var)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i11 = i13 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (rVar.j(loadMore)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i11 |= i12;
        }
        int i14 = 0;
        if ((i11 & 91) == 18 && rVar.G()) {
            rVar.V();
        } else {
            rVar.b0(-182162242);
            Object Q = rVar.Q();
            to.e eVar = t0.m.f35080a;
            int i15 = 1;
            if (Q == eVar) {
                Q = t0.t.N(new tb.f(m0Var, i15));
                rVar.k0(Q);
            }
            l3 l3Var = (l3) Q;
            rVar.s(false);
            rVar.b0(-182153429);
            if ((i11 & 112) != 32) {
                i15 = 0;
            }
            Object Q2 = rVar.Q();
            if (i15 != 0 || Q2 == eVar) {
                Q2 = new tb.w(l3Var, loadMore, null);
                rVar.k0(Q2);
            }
            rVar.s(false);
            t0.t.e(l3Var, (Function2) Q2, rVar);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new x(m0Var, loadMore, i10, i14);
        }
    }

    public static final void V0(ViewGroup viewGroup, e1 e1Var) {
        if (viewGroup instanceof FragmentContainerView) {
            e1Var.invoke(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            Intrinsics.b(childAt, "getChildAt(index)");
            if (childAt instanceof ViewGroup) {
                V0((ViewGroup) childAt, e1Var);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void W(kotlin.jvm.functions.Function1 r16, kotlin.jvm.functions.Function1 r17, boolean r18, t0.n r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 221
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.j.W(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, boolean, t0.n, int, int):void");
    }

    public static final androidx.lifecycle.t W0(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        return (androidx.lifecycle.t) pu.p.f(pu.p.h(pu.m.d(j1.f1921b, view), j1.f1922c));
    }

    public static final void X(int i10, int i11, t0.n nVar, String title, String str) {
        int i12;
        float f10;
        t0.r rVar;
        String str2;
        String str3;
        int i13;
        int i14;
        int i15;
        String subtitleValue = str;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitleValue, "subtitleValue");
        t0.r rVar2 = (t0.r) nVar;
        rVar2.c0(-274544800);
        if ((i11 & 14) == 0) {
            if (rVar2.h(title)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i12 = i15 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            if (rVar2.f(i10)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 896) == 0) {
            if (rVar2.h(subtitleValue)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & 731) == 146 && rVar2.G()) {
            rVar2.V();
            rVar = rVar2;
            str3 = title;
        } else {
            g1.f fVar = g1.a.f16389k;
            rVar2.b0(693286680);
            g1.l lVar = g1.l.f16404b;
            b0.d dVar = b0.n.f2935a;
            l1 a10 = o1.a(dVar, fVar, rVar2, 48);
            rVar2.b0(-1323940314);
            int i16 = rVar2.P;
            r1 o10 = rVar2.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(lVar);
            boolean z10 = rVar2.f35166a instanceof t0.f;
            if (z10) {
                rVar2.e0();
                if (rVar2.O) {
                    rVar2.n(jVar);
                } else {
                    rVar2.n0();
                }
                c2.i iVar = c2.k.f7749e;
                t0.t.v0(rVar2, a10, iVar);
                c2.i iVar2 = c2.k.f7748d;
                t0.t.v0(rVar2, o10, iVar2);
                c2.i iVar3 = c2.k.f7750f;
                if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i16))) {
                    nn.d.s(i16, rVar2, i16, iVar3);
                }
                nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
                al.d.C(title, null, w0.e(R.color.black_1A1A1A, rVar2), e1(10), null, null, jh.c.f21372a, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, (i12 & 14) | 1575936, 0, 130994);
                float f11 = 4;
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f11), rVar2);
                if (title.length() > 0) {
                    f10 = f11;
                    al.d.z(R.drawable.ic_info_field_small, null, androidx.compose.foundation.layout.d.m(lVar, 10), 0L, rVar2, 390, 10);
                } else {
                    f10 = f11;
                }
                v.e.y(rVar2, false, true, false, false);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar2);
                rVar2.b0(693286680);
                l1 a11 = o1.a(dVar, fVar, rVar2, 48);
                rVar2.b0(-1323940314);
                int i17 = rVar2.P;
                r1 o11 = rVar2.o();
                b1.c j11 = androidx.compose.ui.layout.a.j(lVar);
                if (z10) {
                    rVar2.e0();
                    if (rVar2.O) {
                        rVar2.n(jVar);
                    } else {
                        rVar2.n0();
                    }
                    t0.t.v0(rVar2, a11, iVar);
                    t0.t.v0(rVar2, o11, iVar2);
                    if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i17))) {
                        nn.d.s(i17, rVar2, i17, iVar3);
                    }
                    nn.d.q(0, j11, new m2(rVar2), rVar2, 2058660585);
                    al.d.z(i10, null, androidx.compose.foundation.layout.d.m(lVar, 12), 0L, rVar2, ((i12 >> 3) & 14) | 384, 10);
                    rVar = rVar2;
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f10), rVar);
                    int i18 = kj.f.f23221a;
                    Intrinsics.checkNotNullParameter(str, "<this>");
                    Double e10 = kotlin.text.q.e(str);
                    if (e10 != null) {
                        ij.h hVar = ij.h.f20067a;
                        str2 = ij.h.h(e10.doubleValue(), 0, true, 2);
                    } else {
                        str2 = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    subtitleValue = str;
                    str3 = title;
                    al.d.C(str2, null, w0.e(R.color.black_1A1A1A, rVar), e1(14), null, null, jh.c.f21375d, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 1575936, 0, 130994);
                    v.e.y(rVar, false, true, false, false);
                } else {
                    al.d.v0();
                    throw null;
                }
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new dd.c(str3, i10, subtitleValue, i11);
        }
    }

    public static final androidx.lifecycle.q X0(androidx.lifecycle.t tVar) {
        Intrinsics.checkNotNullParameter(tVar, "<this>");
        return qu.i0.t(tVar.getLifecycle());
    }

    public static final void Y(boolean z10, ArenaGame arenaGame, Function0 function0, Function0 onButtonClick, t0.n nVar, int i10, int i11) {
        Function0 function02;
        Intrinsics.checkNotNullParameter(arenaGame, "arenaGame");
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(235493320);
        if ((i11 & 4) != 0) {
            function02 = dd.d.f14311a;
        } else {
            function02 = function0;
        }
        pp.b.b(androidx.compose.foundation.layout.d.e(g1.l.f16404b, 1.0f), h0.h.a(4, 4), 0L, null, s0.g.f34069a, b1.d.c(1045711237, new tb.q(arenaGame, z10, onButtonClick, function02), rVar), rVar, 1572870, 60);
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new b0.x(z10, arenaGame, function02, onButtonClick, i10, i11);
        }
    }

    public static final String Y0(ChatMessage chatMessage) {
        String type;
        Sticker sticker;
        String sticker_id;
        Media media = chatMessage.getMedia();
        if (media != null && (sticker = media.getSticker()) != null && (sticker_id = sticker.getSticker_id()) != null && sticker_id.length() > 0) {
            return "STICKER";
        }
        Media media2 = chatMessage.getMedia();
        if (media2 != null && (type = media2.getType()) != null) {
            if (kotlin.text.w.s(type, "image", false)) {
                return "IMAGE";
            }
            if (kotlin.text.w.s(type, "video", false)) {
                return "VIDEO";
            }
            if (kotlin.text.w.s(type, "document", false)) {
                return "DOCUMENT";
            }
            return "NONE";
        }
        return "NONE";
    }

    /* JADX WARN: Removed duplicated region for block: B:153:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Z(g1.o r49, boolean r50, com.assetgro.stockgro.data.model.arenaV2.ArenaGame r51, boolean r52, kotlin.jvm.functions.Function0 r53, kotlin.jvm.functions.Function0 r54, t0.n r55, int r56, int r57) {
        /*
            Method dump skipped, instructions count: 1278
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.j.Z(g1.o, boolean, com.assetgro.stockgro.data.model.arenaV2.ArenaGame, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, t0.n, int, int):void");
    }

    public static final MissionStatus Z0(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        MissionStatus missionStatus = MissionStatus.NOT_STARTED;
        if (!Intrinsics.a(str, missionStatus.getParamName())) {
            MissionStatus missionStatus2 = MissionStatus.UNDER_REVIEW;
            if (!Intrinsics.a(str, missionStatus2.getParamName())) {
                missionStatus2 = MissionStatus.FAILED;
                if (!Intrinsics.a(str, missionStatus2.getParamName())) {
                    missionStatus2 = MissionStatus.COMPLETED;
                    if (!Intrinsics.a(str, missionStatus2.getParamName())) {
                        return missionStatus;
                    }
                }
            }
            return missionStatus2;
        }
        return missionStatus;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(g1.o r21, boolean r22, kotlin.jvm.functions.Function0 r23, t0.n r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.j.a(g1.o, boolean, kotlin.jvm.functions.Function0, t0.n, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a0(g1.o r18, boolean r19, boolean r20, kotlin.jvm.functions.Function0 r21, t0.n r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.j.a0(g1.o, boolean, boolean, kotlin.jvm.functions.Function0, t0.n, int, int):void");
    }

    public static Intent a1(Activity activity) {
        Intent a10 = q3.u.a(activity);
        if (a10 != null) {
            return a10;
        }
        try {
            String c12 = c1(activity, activity.getComponentName());
            if (c12 == null) {
                return null;
            }
            ComponentName componentName = new ComponentName(activity, c12);
            try {
                if (c1(activity, componentName) == null) {
                    return Intent.makeMainActivity(componentName);
                }
                return new Intent().setComponent(componentName);
            } catch (PackageManager.NameNotFoundException unused) {
                Log.e("NavUtils", "getParentActivityIntent: bad parentActivityName '" + c12 + "' in manifest");
                return null;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static final void b(g1.o modifier, AddMembersViewModel addMembersViewModel, Function1 onBackPressed, Function1 addMembersClick, t0.n nVar, int i10) {
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(addMembersViewModel, "addMembersViewModel");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Intrinsics.checkNotNullParameter(addMembersClick, "addMembersClick");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(1198733410);
        rVar.b0(-817523592);
        Object Q = rVar.Q();
        to.e eVar = t0.m.f35080a;
        o3 o3Var = o3.f35116a;
        if (Q == eVar) {
            Q = t0.t.n0(HttpUrl.FRAGMENT_ENCODE_SET, o3Var);
            rVar.k0(Q);
        }
        g1 g1Var = (g1) Q;
        rVar.s(false);
        d2.d3 d3Var = (d2.d3) rVar.m(s1.f13628m);
        h7.b a10 = h7.g.a(addMembersViewModel.f9271u, rVar);
        t0.t.e((String) g1Var.getValue(), new wd.e(addMembersViewModel, g1Var, null), rVar);
        h7.b a11 = h7.g.a((tu.f) addMembersViewModel.f9270t.getValue(), rVar);
        h7.b a12 = h7.g.a((tu.f) addMembersViewModel.f9269s.getValue(), rVar);
        g1 K0 = K0(new tu.s0(addMembersViewModel.f9268r), rVar);
        boolean booleanValue = ((Boolean) K0.getValue()).booleanValue();
        rVar.b0(-817491445);
        Object Q2 = rVar.Q();
        if (Q2 == eVar) {
            Q2 = com.google.android.gms.internal.p002firebaseauthapi.a.j(g1Var, 15, rVar);
        }
        rVar.s(false);
        p0.o D1 = dp.b.D1(booleanValue, (Function0) Q2, rVar, 48);
        rVar.b0(-817489429);
        Object Q3 = rVar.Q();
        if (Q3 == eVar) {
            Q3 = new e1.s();
            rVar.k0(Q3);
        }
        e1.s sVar = (e1.s) Q3;
        Object h10 = v.e.h(rVar, false, -817486341);
        if (h10 == eVar) {
            h10 = t0.t.n0(Boolean.FALSE, o3Var);
            rVar.k0(h10);
        }
        rVar.s(false);
        z5.b(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.c(g1.l.f16404b, 1.0f), 1.0f), null, b1.d.c(1402880573, new pd.g(onBackPressed, sVar, 1), rVar), null, null, null, 0, false, null, false, null, s0.g.f34069a, 0L, 0L, 0L, 0L, 0L, b1.d.c(-554060956, new pd.w((g1) h10, D1, K0, d3Var, sVar, a10, a11, a12, g1Var, addMembersClick), rVar), rVar, 390, 12582912, 131066);
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new a2(modifier, addMembersViewModel, onBackPressed, addMembersClick, i10, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b0(kotlin.jvm.functions.Function1 r13, kotlin.jvm.functions.Function0 r14, t0.n r15, int r16, int r17) {
        /*
            Method dump skipped, instructions count: 192
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.j.b0(kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, t0.n, int, int):void");
    }

    public static Intent b1(Context context, ComponentName componentName) {
        String c12 = c1(context, componentName);
        if (c12 == null) {
            return null;
        }
        ComponentName componentName2 = new ComponentName(componentName.getPackageName(), c12);
        if (c1(context, componentName2) == null) {
            return Intent.makeMainActivity(componentName2);
        }
        return new Intent().setComponent(componentName2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(46:1|(1:3)(2:111|(3:113|(1:115)(1:117)|116)(1:118))|4|(1:6)(2:104|(44:106|(1:108)(1:110)|109|8|(1:10)(2:97|(41:99|(1:101)(1:103)|102|12|(1:14)(2:90|(38:92|(1:94)(1:96)|95|16|(1:18)(2:83|(7:85|(1:87)(1:89)|88|20|(21:(1:32)(1:82)|(1:34)(1:81)|(1:36)(1:80)|(1:38)|39|(4:74|75|76|77)|42|(1:44)(1:73)|45|(1:72)|48|(1:50)(3:67|(1:71)|70)|51|(1:53)(1:66)|54|(1:65)|57|(1:59)|60|(1:64)|63)(1:24)|25|(2:27|28)(1:30)))|19|20|(1:22)|(0)(0)|(0)(0)|(0)(0)|(0)|39|(0)|74|75|76|77|42|(0)(0)|45|(0)|72|48|(0)(0)|51|(0)(0)|54|(0)|65|57|(0)|60|(0)|64|63|25|(0)(0)))|15|16|(0)(0)|19|20|(0)|(0)(0)|(0)(0)|(0)(0)|(0)|39|(0)|74|75|76|77|42|(0)(0)|45|(0)|72|48|(0)(0)|51|(0)(0)|54|(0)|65|57|(0)|60|(0)|64|63|25|(0)(0)))|11|12|(0)(0)|15|16|(0)(0)|19|20|(0)|(0)(0)|(0)(0)|(0)(0)|(0)|39|(0)|74|75|76|77|42|(0)(0)|45|(0)|72|48|(0)(0)|51|(0)(0)|54|(0)|65|57|(0)|60|(0)|64|63|25|(0)(0)))|7|8|(0)(0)|11|12|(0)(0)|15|16|(0)(0)|19|20|(0)|(0)(0)|(0)(0)|(0)(0)|(0)|39|(0)|74|75|76|77|42|(0)(0)|45|(0)|72|48|(0)(0)|51|(0)(0)|54|(0)|65|57|(0)|60|(0)|64|63|25|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x00e2, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x016d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0195 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(hu.c r17, g1.o r18, kotlin.jvm.functions.Function1 r19, kotlin.jvm.functions.Function1 r20, kotlin.jvm.functions.Function1 r21, t0.n r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.j.c(hu.c, g1.o, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, t0.n, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x00ba, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r0.Q(), java.lang.Integer.valueOf(r15)) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01e2, code lost:
    
        if (r6 == r11) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c0(java.util.List r51, kotlin.jvm.functions.Function1 r52, kotlin.jvm.functions.Function0 r53, t0.n r54, int r55) {
        /*
            Method dump skipped, instructions count: 777
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.j.c0(java.util.List, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, t0.n, int):void");
    }

    public static String c1(Context context, ComponentName componentName) {
        int i10;
        String string;
        PackageManager packageManager = context.getPackageManager();
        if (Build.VERSION.SDK_INT >= 29) {
            i10 = 269222528;
        } else {
            i10 = 787072;
        }
        ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, i10);
        String str = activityInfo.parentActivityName;
        if (str != null) {
            return str;
        }
        Bundle bundle = activityInfo.metaData;
        if (bundle == null || (string = bundle.getString("android.support.PARENT_ACTIVITY")) == null) {
            return null;
        }
        if (string.charAt(0) == '.') {
            return context.getPackageName() + string;
        }
        return string;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(hu.c r13, g1.o r14, kotlin.jvm.functions.Function1 r15, t0.n r16, int r17, int r18) {
        /*
            r1 = r17
            r0 = r16
            t0.r r0 = (t0.r) r0
            r2 = -1985291610(0xffffffff89aadaa6, float:-4.1131627E-33)
            r0.c0(r2)
            r2 = r18 & 1
            if (r2 == 0) goto L14
            r2 = r1 | 6
            r10 = r13
            goto L25
        L14:
            r2 = r1 & 6
            r10 = r13
            if (r2 != 0) goto L24
            boolean r2 = r0.j(r13)
            if (r2 == 0) goto L21
            r2 = 4
            goto L22
        L21:
            r2 = 2
        L22:
            r2 = r2 | r1
            goto L25
        L24:
            r2 = r1
        L25:
            r3 = r18 & 2
            if (r3 == 0) goto L2d
            r2 = r2 | 48
        L2b:
            r4 = r14
            goto L3e
        L2d:
            r4 = r1 & 48
            if (r4 != 0) goto L2b
            r4 = r14
            boolean r5 = r0.h(r14)
            if (r5 == 0) goto L3b
            r5 = 32
            goto L3d
        L3b:
            r5 = 16
        L3d:
            r2 = r2 | r5
        L3e:
            r5 = r18 & 4
            if (r5 == 0) goto L46
            r2 = r2 | 384(0x180, float:5.38E-43)
        L44:
            r6 = r15
            goto L57
        L46:
            r6 = r1 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L44
            r6 = r15
            boolean r7 = r0.j(r15)
            if (r7 == 0) goto L54
            r7 = 256(0x100, float:3.59E-43)
            goto L56
        L54:
            r7 = 128(0x80, float:1.8E-43)
        L56:
            r2 = r2 | r7
        L57:
            r7 = r2 & 147(0x93, float:2.06E-43)
            r8 = 146(0x92, float:2.05E-43)
            if (r7 != r8) goto L69
            boolean r7 = r0.G()
            if (r7 != 0) goto L64
            goto L69
        L64:
            r0.V()
            r5 = r4
            goto L93
        L69:
            if (r3 == 0) goto L6f
            g1.l r3 = g1.l.f16404b
            r11 = r3
            goto L70
        L6f:
            r11 = r4
        L70:
            if (r5 == 0) goto L76
            y2.a r3 = y2.a.f41065a
            r12 = r3
            goto L77
        L76:
            r12 = r6
        L77:
            r4 = 0
            r5 = 0
            r3 = r2 & 14
            r3 = r3 | 384(0x180, float:5.38E-43)
            r6 = r2 & 112(0x70, float:1.57E-43)
            r3 = r3 | r6
            r6 = 57344(0xe000, float:8.0356E-41)
            int r2 = r2 << 6
            r2 = r2 & r6
            r8 = r3 | r2
            r9 = 8
            r2 = r13
            r3 = r11
            r6 = r12
            r7 = r0
            c(r2, r3, r4, r5, r6, r7, r8, r9)
            r5 = r11
            r6 = r12
        L93:
            t0.x1 r7 = r0.w()
            if (r7 == 0) goto La7
            d0.t r8 = new d0.t
            r3 = 7
            r0 = r8
            r1 = r17
            r2 = r18
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f35245d = r8
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.j.d(hu.c, g1.o, kotlin.jvm.functions.Function1, t0.n, int, int):void");
    }

    public static final void d0(ReportReason reportReason, boolean z10, Function0 function0, hu.c onReportClicked, t0.n nVar, int i10, int i11) {
        boolean z11;
        Function0 function02;
        iu.z zVar;
        boolean z12;
        float f10;
        g1.l lVar;
        boolean z13;
        boolean z14;
        String code;
        String code2;
        Intrinsics.checkNotNullParameter(reportReason, "reportReason");
        Intrinsics.checkNotNullParameter(onReportClicked, "onReportClicked");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(157355821);
        if ((i11 & 2) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        if ((i11 & 4) != 0) {
            function02 = ld.q.f24582a;
        } else {
            function02 = function0;
        }
        iu.z zVar2 = new iu.z();
        String code3 = reportReason.getCode();
        if (code3 == null) {
            code3 = "OTHERS";
        }
        zVar2.f20560a = code3;
        iu.z zVar3 = new iu.z();
        rVar.b0(-1378462580);
        Object Q = rVar.Q();
        to.e eVar = t0.m.f35080a;
        if (Q == eVar) {
            Q = t0.t.n0(null, o3.f35116a);
            rVar.k0(Q);
        }
        rVar.s(false);
        zVar3.f20560a = (g1) Q;
        g1.l lVar2 = g1.l.f16404b;
        float f11 = 16;
        g1.o x10 = androidx.compose.foundation.layout.a.x(androidx.compose.foundation.layout.d.c(androidx.compose.foundation.layout.d.e(lVar2, 1.0f), 1.0f), f11, 32, f11, s0.g.f34069a, 8);
        rVar.b0(-483455358);
        l1 a10 = y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
        rVar.b0(-1323940314);
        int i12 = rVar.P;
        r1 o10 = rVar.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(x10);
        if (rVar.f35166a instanceof t0.f) {
            rVar.e0();
            if (rVar.O) {
                rVar.n(jVar);
            } else {
                rVar.n0();
            }
            t0.t.v0(rVar, a10, c2.k.f7749e);
            t0.t.v0(rVar, o10, c2.k.f7748d);
            c2.i iVar = c2.k.f7750f;
            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i12))) {
                nn.d.s(i12, rVar, i12, iVar);
            }
            nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
            String msg = reportReason.getMsg();
            if (msg == null) {
                msg = "Report the User Now";
            }
            iu.z zVar4 = zVar3;
            Function0 function03 = function02;
            b9.b(msg, null, w0.e(R.color.black_1A1A1A, rVar), e1(18), null, null, jh.c.f21375d, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 1575936, 0, 130994);
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar2, 24), rVar);
            rVar.b0(-1667290224);
            List<ReportReason> nested_reasons = reportReason.getNested_reasons();
            if (nested_reasons == null || nested_reasons.isEmpty()) {
                zVar = zVar4;
                ((g1) zVar.f20560a).setValue(reportReason);
            } else {
                for (Iterator it = reportReason.getNested_reasons().iterator(); it.hasNext(); it = it) {
                    iu.z zVar5 = zVar4;
                    el.l.h(null, false, (ReportReason) it.next(), (ReportReason) ((g1) zVar5.f20560a).getValue(), new x1.m(3, zVar5), rVar, 4608, 3);
                    pp.b.c(null, 0L, s0.g.f34069a, s0.g.f34069a, rVar, 0, 15);
                    zVar4 = zVar5;
                }
                zVar = zVar4;
            }
            rVar.s(false);
            androidx.compose.foundation.layout.a.c(b0.z.a(lVar2), rVar);
            ReportReason reportReason2 = (ReportReason) ((g1) zVar.f20560a).getValue();
            int i13 = 1;
            if (reportReason2 != null && (code2 = reportReason2.getCode()) != null && code2.length() > 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            al.d.n(null, z12, null, hl.f.c1(R.string.report, rVar), new ld.r(zVar, onReportClicked, zVar2, 0), rVar, 0, 5);
            float f12 = 12;
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar2, f12), rVar);
            rVar.b0(-1667261753);
            if (!z11) {
                ReportReason reportReason3 = (ReportReason) ((g1) zVar.f20560a).getValue();
                if (reportReason3 != null && (code = reportReason3.getCode()) != null && code.length() > 0) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                f10 = f12;
                lVar = lVar2;
                al.d.q(0, 51, 0L, 0L, null, rVar, null, hl.f.c1(R.string.report_and_block, rVar), new ld.r(zVar, onReportClicked, zVar2, i13), z14);
            } else {
                f10 = f12;
                lVar = lVar2;
            }
            rVar.s(false);
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f10), rVar);
            v.e.y(rVar, false, true, false, false);
            rVar.b0(-1378403199);
            if ((((i10 & 896) ^ 384) > 256 && rVar.h(function03)) || (i10 & 384) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            Object Q2 = rVar.Q();
            if (z13 || Q2 == eVar) {
                Q2 = v.e.p(function03, 26, rVar);
            }
            rVar.s(false);
            iu.j.f(false, (Function0) Q2, rVar, 0, 1);
            x1 w10 = rVar.w();
            if (w10 != null) {
                w10.f35245d = new b0.x(reportReason, z11, function03, onReportClicked, i10, i11, 4);
                return;
            }
            return;
        }
        al.d.v0();
        throw null;
    }

    public static final long d1(double d10) {
        return i1(4294967296L, (float) d10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0056  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(java.lang.String r23, boolean r24, kotlin.jvm.functions.Function0 r25, kotlin.jvm.functions.Function0 r26, t0.n r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.j.e(java.lang.String, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, t0.n, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0572  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e0(g1.o r55, java.lang.String r56, kotlin.jvm.functions.Function1 r57, t0.n r58, int r59, int r60) {
        /*
            Method dump skipped, instructions count: 1398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.j.e0(g1.o, java.lang.String, kotlin.jvm.functions.Function1, t0.n, int, int):void");
    }

    public static final long e1(int i10) {
        return i1(4294967296L, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void f(t0.n nVar, int i10) {
        t0.r rVar = (t0.r) nVar;
        rVar.c0(1749542555);
        if (i10 == 0 && rVar.G()) {
            rVar.V();
        } else {
            int i11 = 0;
            j0 s7 = al.d.s(false, rVar, 0, 7);
            FillElement fillElement = androidx.compose.foundation.layout.d.f1286c;
            rVar.b0(-483455358);
            b0.f fVar = b0.n.f2937c;
            g1.e eVar = g1.a.f16391m;
            l1 a10 = y.a(fVar, eVar, rVar, 0);
            int i12 = -1323940314;
            rVar.b0(-1323940314);
            int i13 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(fillElement);
            boolean z10 = rVar.f35166a instanceof t0.f;
            if (z10) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t0.t.v0(rVar, a10, c2.k.f7749e);
                t0.t.v0(rVar, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i13))) {
                    nn.d.s(i13, rVar, i13, iVar);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                int i14 = 0;
                while (i14 < 8) {
                    g1.l lVar = g1.l.f16404b;
                    float f10 = 10;
                    float f11 = 16;
                    g1.o w10 = androidx.compose.foundation.layout.a.w(lVar, f11, f10, f11, f10);
                    rVar.b0(693286680);
                    l1 a11 = o1.a(b0.n.f2935a, g1.a.f16388j, rVar, i11);
                    rVar.b0(i12);
                    int i15 = rVar.P;
                    r1 o11 = rVar.o();
                    c2.l.M.getClass();
                    c2.j jVar2 = c2.k.f7746b;
                    b1.c j11 = androidx.compose.ui.layout.a.j(w10);
                    if (z10) {
                        rVar.e0();
                        if (rVar.O) {
                            rVar.n(jVar2);
                        } else {
                            rVar.n0();
                        }
                        c2.i iVar2 = c2.k.f7749e;
                        t0.t.v0(rVar, a11, iVar2);
                        c2.i iVar3 = c2.k.f7748d;
                        t0.t.v0(rVar, o11, iVar3);
                        c2.i iVar4 = c2.k.f7750f;
                        if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i15))) {
                            nn.d.s(i15, rVar, i15, iVar4);
                        }
                        nn.d.q(0, j11, new m2(rVar), rVar, 2058660585);
                        g1.o m10 = androidx.compose.foundation.layout.d.m(lVar, 48);
                        h0.g gVar = h0.h.f17801a;
                        b0.s.a(androidx.compose.foundation.a.d(m10, s7, gVar, 4), rVar, 0);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f11), rVar);
                        rVar.b0(-483455358);
                        l1 a12 = y.a(b0.n.f2937c, eVar, rVar, 0);
                        rVar.b0(-1323940314);
                        int i16 = rVar.P;
                        r1 o12 = rVar.o();
                        int i17 = i14;
                        b1.c j12 = androidx.compose.ui.layout.a.j(lVar);
                        if (z10) {
                            rVar.e0();
                            boolean z11 = z10;
                            if (rVar.O) {
                                rVar.n(jVar2);
                            } else {
                                rVar.n0();
                            }
                            t0.t.v0(rVar, a12, iVar2);
                            t0.t.v0(rVar, o12, iVar3);
                            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i16))) {
                                nn.d.s(i16, rVar, i16, iVar4);
                            }
                            nn.d.q(0, j12, new m2(rVar), rVar, 2058660585);
                            b0.s.a(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.g(lVar, f11), 1.0f), s7, gVar, 4), rVar, 0);
                            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 8), rVar);
                            da.e.w(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.q(androidx.compose.foundation.layout.d.g(lVar, f11), 100), s7, gVar, 4), rVar, 0, false, true);
                            v.e.y(rVar, false, false, false, true);
                            rVar.s(false);
                            rVar.s(false);
                            pp.b.c(null, w0.e(R.color.chatSeparatorColor, rVar), s0.g.f34069a, s0.g.f34069a, rVar, 0, 13);
                            i14 = i17 + 1;
                            z10 = z11;
                            i11 = 0;
                            i12 = -1323940314;
                        } else {
                            al.d.v0();
                            throw null;
                        }
                    } else {
                        al.d.v0();
                        throw null;
                    }
                }
                boolean z12 = i11;
                v.e.y(rVar, z12, true, z12, z12);
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w11 = rVar.w();
        if (w11 != null) {
            w11.f35245d = new lb.u(i10, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f0(boolean r16, kotlin.jvm.functions.Function0 r17, t0.n r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.j.f0(boolean, kotlin.jvm.functions.Function0, t0.n, int, int):void");
    }

    public static boolean f1(MotionEvent motionEvent, int i10) {
        if ((motionEvent.getSource() & i10) == i10) {
            return true;
        }
        return false;
    }

    public static final void g(Media media, ArrayList actionsItems, Function0 onBackPressed, Function1 onActionPerformed, Function2 function2, t0.n nVar, int i10) {
        Intrinsics.checkNotNullParameter(media, "media");
        Intrinsics.checkNotNullParameter(actionsItems, "actionsItems");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Intrinsics.checkNotNullParameter(onActionPerformed, "onActionPerformed");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(655942221);
        rVar.b0(385985721);
        Object Q = rVar.Q();
        to.e eVar = t0.m.f35080a;
        o3 o3Var = o3.f35116a;
        if (Q == eVar) {
            Q = t0.t.n0(Boolean.FALSE, o3Var);
            rVar.k0(Q);
        }
        g1 g1Var = (g1) Q;
        Object h10 = v.e.h(rVar, false, 385987777);
        if (h10 == eVar) {
            h10 = t0.t.n0(null, o3Var);
            rVar.k0(h10);
        }
        g1 g1Var2 = (g1) h10;
        rVar.s(false);
        t0.t.e(media, new ld.d(media, g1Var2, null), rVar);
        z5.b(null, null, b1.d.c(351771816, new m0.z(g1Var2, onBackPressed, onActionPerformed, g1Var, actionsItems, 3), rVar), null, null, null, 0, false, null, false, null, s0.g.f34069a, 0L, 0L, 0L, n1.t.f28170b, 0L, b1.d.c(-1135718321, new v.o(12, media, function2), rVar), rVar, 384, 12779520, 98299);
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new b1.b(media, actionsItems, onBackPressed, onActionPerformed, function2, i10, 1);
        }
    }

    public static final j0 g0(t0.n nVar) {
        t0.r rVar = (t0.r) nVar;
        rVar.b0(1719410501);
        long j10 = n1.t.f28172d;
        List g10 = vt.y.g(new n1.t(n1.t.c(j10, 0.6f)), new n1.t(n1.t.c(j10, 0.2f)), new n1.t(n1.t.c(j10, 0.6f)));
        l0 g11 = w.e.g(w.e.t(HttpUrl.FRAGMENT_ENCODE_SET, rVar, 0), 1000.0f, w.e.r(w.e.x(800, 0, null, 6), 2, 4), HttpUrl.FRAGMENT_ENCODE_SET, rVar, 28728, 0);
        j0 K = kq.e.K(g10, m1.c.f27233b, t0.t.g(((Number) g11.f38584d.getValue()).floatValue(), ((Number) g11.f38584d.getValue()).floatValue()));
        rVar.s(false);
        return K;
    }

    public static final boolean g1(long j10) {
        w2.n[] nVarArr = w2.m.f38803b;
        if ((j10 & 1095216660480L) == 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [int, boolean] */
    public static final void h(boolean z10, String userProfileImage, String userName, String comment, String timestamp, boolean z11, boolean z12, int i10, Function0 onLikeComment, Function0 onReportComment, Function0 onDeleteComment, Function0 onViewUserProfile, t0.n nVar, int i11, int i12) {
        int i13;
        int i14;
        float d10;
        c2.j jVar;
        c2.i iVar;
        c2.i iVar2;
        c2.j jVar2;
        c2.i iVar3;
        c2.i iVar4;
        g1.l lVar;
        ?? r22;
        boolean z13;
        t0.r rVar;
        t0.r rVar2;
        boolean z14;
        c2.j jVar3;
        c2.i iVar5;
        g1 g1Var;
        t0.f fVar;
        boolean z15;
        long j10;
        c2.j jVar4;
        c2.i iVar6;
        Intrinsics.checkNotNullParameter(userProfileImage, "userProfileImage");
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(comment, "comment");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        Intrinsics.checkNotNullParameter(onLikeComment, "onLikeComment");
        Intrinsics.checkNotNullParameter(onReportComment, "onReportComment");
        Intrinsics.checkNotNullParameter(onDeleteComment, "onDeleteComment");
        Intrinsics.checkNotNullParameter(onViewUserProfile, "onViewUserProfile");
        t0.r rVar3 = (t0.r) nVar;
        rVar3.c0(-831332312);
        if ((i11 & 14) == 0) {
            i13 = (rVar3.i(z10) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 112) == 0) {
            i13 |= rVar3.h(userProfileImage) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i13 |= rVar3.h(userName) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i13 |= rVar3.h(comment) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((57344 & i11) == 0) {
            i13 |= rVar3.h(timestamp) ? Http2.INITIAL_MAX_FRAME_SIZE : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((458752 & i11) == 0) {
            i13 |= rVar3.i(z11) ? 131072 : 65536;
        }
        if ((3670016 & i11) == 0) {
            i13 |= rVar3.i(z12) ? 1048576 : 524288;
        }
        if ((29360128 & i11) == 0) {
            i13 |= rVar3.f(i10) ? 8388608 : 4194304;
        }
        if ((234881024 & i11) == 0) {
            i13 |= rVar3.j(onLikeComment) ? 67108864 : 33554432;
        }
        if ((i11 & 1879048192) == 0) {
            i13 |= rVar3.j(onReportComment) ? 536870912 : 268435456;
        }
        int i15 = i13;
        if ((i12 & 14) == 0) {
            i14 = i12 | (rVar3.j(onDeleteComment) ? 4 : 2);
        } else {
            i14 = i12;
        }
        if ((i12 & 112) == 0) {
            i14 |= rVar3.j(onViewUserProfile) ? 32 : 16;
        }
        int i16 = i14;
        if ((i15 & 1533916891) == 306783378 && (i16 & 91) == 18 && rVar3.G()) {
            rVar3.V();
            rVar2 = rVar3;
        } else {
            rVar3.b0(-1176362375);
            Object Q = rVar3.Q();
            to.e eVar = t0.m.f35080a;
            if (Q == eVar) {
                Q = t0.t.n0(Boolean.FALSE, o3.f35116a);
                rVar3.k0(Q);
            }
            g1 g1Var2 = (g1) Q;
            rVar3.s(false);
            g1.l lVar2 = g1.l.f16404b;
            g1.o e10 = androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.a.v(lVar2, s0.g.f34069a, kp.j.R(8, rVar3), 1), 1.0f);
            g1.f fVar2 = g1.a.f16388j;
            rVar3.b0(693286680);
            b0.d dVar = b0.n.f2935a;
            l1 a10 = o1.a(dVar, fVar2, rVar3, 48);
            rVar3.b0(-1323940314);
            int i17 = rVar3.P;
            r1 o10 = rVar3.o();
            c2.l.M.getClass();
            c2.j jVar5 = c2.k.f7746b;
            b1.c j11 = androidx.compose.ui.layout.a.j(e10);
            t0.f fVar3 = rVar3.f35166a;
            if (fVar3 instanceof t0.f) {
                rVar3.e0();
                if (rVar3.O) {
                    rVar3.n(jVar5);
                } else {
                    rVar3.n0();
                }
                c2.i iVar7 = c2.k.f7749e;
                t0.t.v0(rVar3, a10, iVar7);
                c2.i iVar8 = c2.k.f7748d;
                t0.t.v0(rVar3, o10, iVar8);
                c2.i iVar9 = c2.k.f7750f;
                if (rVar3.O || !Intrinsics.a(rVar3.Q(), Integer.valueOf(i17))) {
                    nn.d.s(i17, rVar3, i17, iVar9);
                }
                nn.d.q(0, j11, new m2(rVar3), rVar3, 2058660585);
                androidx.compose.foundation.a.c(g.T(userProfileImage, w0.u(R.drawable.ic_placeholder_shimmer_user_profile, rVar3, 6), w0.u(R.drawable.ic_placeholder_shimmer_user_profile, rVar3, 6), rVar3, ((i15 >> 3) & 14) | 576), "Commenter Image", h2.l.a(androidx.compose.foundation.a.k(androidx.compose.foundation.layout.d.m(androidx.compose.ui.draw.a.h(androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.a.t(lVar2, kp.j.R(4, rVar3)), h0.h.f17801a), 1.2f), kp.j.R(30, rVar3)), onViewUserProfile, 7), false, lb.a.f24384b), null, null, s0.g.f34069a, null, rVar3, 48, 120);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar2, kp.j.R(4, rVar3)), rVar3);
                g1.o q10 = androidx.compose.foundation.layout.d.q(lVar2, kp.j.R(288, rVar3));
                rVar3.b0(-483455358);
                b0.f fVar4 = b0.n.f2937c;
                g1.e eVar2 = g1.a.f16391m;
                l1 a11 = y.a(fVar4, eVar2, rVar3, 0);
                rVar3.b0(-1323940314);
                int i18 = rVar3.P;
                r1 o11 = rVar3.o();
                b1.c j12 = androidx.compose.ui.layout.a.j(q10);
                if (fVar3 instanceof t0.f) {
                    rVar3.e0();
                    if (rVar3.O) {
                        rVar3.n(jVar5);
                    } else {
                        rVar3.n0();
                    }
                    t0.t.v0(rVar3, a11, iVar7);
                    t0.t.v0(rVar3, o11, iVar8);
                    if (rVar3.O || !Intrinsics.a(rVar3.Q(), Integer.valueOf(i18))) {
                        nn.d.s(i18, rVar3, i18, iVar9);
                    }
                    nn.d.q(0, j12, new m2(rVar3), rVar3, 2058660585);
                    b0.a0 a0Var = b0.a0.f2818a;
                    g1.o e11 = androidx.compose.foundation.layout.d.e(lVar2, 1.0f);
                    rVar3.b0(733328855);
                    g1.g gVar = g1.a.f16379a;
                    b0.v c10 = b0.s.c(gVar, false, rVar3, 0);
                    rVar3.b0(-1323940314);
                    int i19 = rVar3.P;
                    r1 o12 = rVar3.o();
                    b1.c j13 = androidx.compose.ui.layout.a.j(e11);
                    if (fVar3 instanceof t0.f) {
                        rVar3.e0();
                        if (rVar3.O) {
                            rVar3.n(jVar5);
                        } else {
                            rVar3.n0();
                        }
                        t0.t.v0(rVar3, c10, iVar7);
                        t0.t.v0(rVar3, o12, iVar8);
                        if (rVar3.O || !Intrinsics.a(rVar3.Q(), Integer.valueOf(i19))) {
                            nn.d.s(i19, rVar3, i19, iVar9);
                        }
                        nn.d.q(0, j13, new m2(rVar3), rVar3, 2058660585);
                        g1.o t10 = androidx.compose.foundation.layout.a.t(androidx.compose.foundation.a.e(androidx.compose.foundation.layout.d.e(lVar2, 1.0f), w0.e(R.color.white_F5F5F5, rVar3), h0.h.b(kp.j.R(8, rVar3))), kp.j.R(8, rVar3));
                        rVar3.b0(-483455358);
                        l1 a12 = y.a(fVar4, eVar2, rVar3, 0);
                        rVar3.b0(-1323940314);
                        int i20 = rVar3.P;
                        r1 o13 = rVar3.o();
                        b1.c j14 = androidx.compose.ui.layout.a.j(t10);
                        if (fVar3 instanceof t0.f) {
                            rVar3.e0();
                            if (rVar3.O) {
                                rVar3.n(jVar5);
                            } else {
                                rVar3.n0();
                            }
                            t0.t.v0(rVar3, a12, iVar7);
                            t0.t.v0(rVar3, o13, iVar8);
                            if (rVar3.O || !Intrinsics.a(rVar3.Q(), Integer.valueOf(i20))) {
                                nn.d.s(i20, rVar3, i20, iVar9);
                            }
                            nn.d.q(0, j14, new m2(rVar3), rVar3, 2058660585);
                            b9.b(userName, h2.l.a(androidx.compose.foundation.a.k(androidx.compose.foundation.layout.a.x(lVar2, s0.g.f34069a, s0.g.f34069a, kp.j.R(30, rVar3), s0.g.f34069a, 11), onViewUserProfile, 7), false, lb.a.f24385c), w0.e(R.color.colorPrimarySeparator, rVar3), kp.j.S(14, rVar3, 6), null, null, jh.c.f21379h, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar3, ((i15 >> 6) & 14) | 1572864, 0, 130992);
                            v.e.s(1, rVar3, lVar2, rVar3);
                            o2.v vVar = jh.c.f21377f;
                            b9.b(timestamp, h2.l.a(lVar2, false, lb.a.f24386d), androidx.compose.ui.graphics.a.c(1712986650), kp.j.S(12, rVar3, 6), null, null, vVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar3, ((i15 >> 12) & 14) | 1573248, 0, 130992);
                            v.e.s(4, rVar3, lVar2, rVar3);
                            if (z11) {
                                rVar3.b0(1868260697);
                                g1.o a13 = h2.l.a(androidx.compose.foundation.layout.a.x(androidx.compose.foundation.layout.d.e(lVar2, 1.0f), s0.g.f34069a, kp.j.R(8, rVar3), s0.g.f34069a, s0.g.f34069a, 13), false, lb.a.f24387e);
                                g1.f fVar5 = g1.a.f16389k;
                                rVar3.b0(693286680);
                                l1 a14 = o1.a(dVar, fVar5, rVar3, 48);
                                rVar3.b0(-1323940314);
                                int i21 = rVar3.P;
                                r1 o14 = rVar3.o();
                                b1.c j15 = androidx.compose.ui.layout.a.j(a13);
                                if (fVar3 instanceof t0.f) {
                                    rVar3.e0();
                                    if (rVar3.O) {
                                        jVar4 = jVar5;
                                        rVar3.n(jVar4);
                                    } else {
                                        jVar4 = jVar5;
                                        rVar3.n0();
                                    }
                                    t0.t.v0(rVar3, a14, iVar7);
                                    t0.t.v0(rVar3, o14, iVar8);
                                    if (rVar3.O || !Intrinsics.a(rVar3.Q(), Integer.valueOf(i21))) {
                                        iVar6 = iVar9;
                                        nn.d.s(i21, rVar3, i21, iVar6);
                                    } else {
                                        iVar6 = iVar9;
                                    }
                                    nn.d.q(0, j15, new m2(rVar3), rVar3, 2058660585);
                                    s3.a(w0.u(R.drawable.ic_comment_reported, rVar3, 6), "Reported Comment", androidx.compose.foundation.layout.d.m(lVar2, kp.j.R(18, rVar3)), 0L, rVar3, 56, 8);
                                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar2, kp.j.R(8, rVar3)), rVar3);
                                    b9.b(hl.f.c1(R.string.text_reported_comment, rVar3), null, androidx.compose.ui.graphics.a.d(4288256409L), kp.j.S(12, rVar3, 6), null, null, vVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar3, 1573248, 0, 130994);
                                    t0.r rVar4 = rVar3;
                                    v.e.y(rVar4, false, true, false, false);
                                    rVar4.s(false);
                                    r22 = 0;
                                    z13 = true;
                                    iVar4 = iVar8;
                                    iVar3 = iVar6;
                                    iVar2 = iVar7;
                                    jVar2 = jVar4;
                                    lVar = lVar2;
                                    rVar = rVar4;
                                } else {
                                    al.d.v0();
                                    throw null;
                                }
                            } else {
                                rVar3.b0(1869361507);
                                g1.o e12 = androidx.compose.foundation.layout.d.e(lVar2, 1.0f);
                                if (((Boolean) g1Var2.getValue()).booleanValue()) {
                                    d10 = jr.h.d(rVar3, -1048068330, 30, rVar3, false);
                                } else {
                                    d10 = jr.h.d(rVar3, -1048066826, 0, rVar3, false);
                                }
                                g1.o b10 = androidx.compose.foundation.layout.d.b(e12, s0.g.f34069a, d10, 1);
                                rVar3.b0(733328855);
                                b0.v c11 = b0.s.c(gVar, false, rVar3, 0);
                                rVar3.b0(-1323940314);
                                int i22 = rVar3.P;
                                r1 o15 = rVar3.o();
                                b1.c j16 = androidx.compose.ui.layout.a.j(b10);
                                if (fVar3 instanceof t0.f) {
                                    rVar3.e0();
                                    if (rVar3.O) {
                                        jVar = jVar5;
                                        rVar3.n(jVar);
                                    } else {
                                        jVar = jVar5;
                                        rVar3.n0();
                                    }
                                    t0.t.v0(rVar3, c11, iVar7);
                                    t0.t.v0(rVar3, o15, iVar8);
                                    if (rVar3.O || !Intrinsics.a(rVar3.Q(), Integer.valueOf(i22))) {
                                        iVar = iVar9;
                                        nn.d.s(i22, rVar3, i22, iVar);
                                    } else {
                                        iVar = iVar9;
                                    }
                                    nn.d.q(0, j16, new m2(rVar3), rVar3, 2058660585);
                                    iVar2 = iVar7;
                                    jVar2 = jVar;
                                    iVar3 = iVar;
                                    iVar4 = iVar8;
                                    lVar = lVar2;
                                    r22 = 0;
                                    b9.b(comment, h2.l.a(lVar2, false, lb.a.f24388f), w0.e(R.color.colorPrimarySeparator, rVar3), kp.j.S(14, rVar3, 6), null, null, vVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar3, ((i15 >> 9) & 14) | 1572864, 0, 130992);
                                    t0.r rVar5 = rVar3;
                                    z13 = true;
                                    v.e.y(rVar5, false, true, false, false);
                                    rVar5.s(false);
                                    rVar = rVar5;
                                } else {
                                    al.d.v0();
                                    throw null;
                                }
                            }
                            v.e.y(rVar, r22, z13, r22, r22);
                            if (z11) {
                                rVar2 = rVar;
                                z14 = z13;
                            } else {
                                g1.l lVar3 = lVar;
                                g1.o x10 = androidx.compose.foundation.layout.a.x(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.e(lVar3, 1.0f), kp.j.R(80, rVar)), s0.g.f34069a, kp.j.R(8, rVar), kp.j.R(8, rVar), s0.g.f34069a, 9);
                                g1.e eVar3 = g1.a.f16393o;
                                rVar.b0(-483455358);
                                l1 a15 = y.a(fVar4, eVar3, rVar, 48);
                                rVar.b0(-1323940314);
                                int i23 = rVar.P;
                                r1 o16 = rVar.o();
                                b1.c j17 = androidx.compose.ui.layout.a.j(x10);
                                if (fVar3 instanceof t0.f) {
                                    rVar.e0();
                                    if (rVar.O) {
                                        jVar3 = jVar2;
                                        rVar.n(jVar3);
                                    } else {
                                        jVar3 = jVar2;
                                        rVar.n0();
                                    }
                                    c2.i iVar10 = iVar2;
                                    t0.t.v0(rVar, a15, iVar10);
                                    c2.i iVar11 = iVar4;
                                    t0.t.v0(rVar, o16, iVar11);
                                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i23))) {
                                        iVar5 = iVar3;
                                        nn.d.s(i23, rVar, i23, iVar5);
                                    } else {
                                        iVar5 = iVar3;
                                    }
                                    nn.d.q(r22, j17, new m2(rVar), rVar, 2058660585);
                                    rVar.b0(-1048034336);
                                    Object Q2 = rVar.Q();
                                    if (Q2 == eVar) {
                                        g1Var = g1Var2;
                                        Q2 = com.google.android.gms.internal.p002firebaseauthapi.a.j(g1Var, 5, rVar);
                                    } else {
                                        g1Var = g1Var2;
                                    }
                                    rVar.s(r22);
                                    g1 g1Var3 = g1Var;
                                    c2.i iVar12 = iVar5;
                                    p3.a((Function0) Q2, h2.l.a(androidx.compose.foundation.layout.d.m(lVar3, kp.j.R(24, rVar)), r22, lb.a.f24389g), false, null, lb.o.f24496a, rVar, 24582, 12);
                                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar3, kp.j.R(8, rVar)), rVar);
                                    if (((Boolean) g1Var3.getValue()).booleanValue()) {
                                        g1.o g10 = androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.q(androidx.compose.foundation.a.e(lVar3, n1.t.f28173e, h0.h.b(kp.j.R(8, rVar))), kp.j.R(90, rVar)), kp.j.R(40, rVar));
                                        rVar.b0(-1047999314);
                                        boolean z16 = ((i16 & 14) == 4 ? true : r22) | ((i15 & 14) == 4 ? true : r22) | ((i15 & 1879048192) == 536870912 ? true : r22);
                                        Object Q3 = rVar.Q();
                                        if (z16 || Q3 == eVar) {
                                            fVar = fVar3;
                                            z15 = z10;
                                            Q3 = new p0.p(z15, onDeleteComment, onReportComment, g1Var3);
                                            rVar.k0(Q3);
                                        } else {
                                            fVar = fVar3;
                                            z15 = z10;
                                        }
                                        rVar.s(r22);
                                        g1.o a16 = h2.l.a(androidx.compose.foundation.a.k(g10, (Function0) Q3, 7), r22, lb.a.f24390h);
                                        g1.g gVar2 = g1.a.f16383e;
                                        rVar.b0(733328855);
                                        b0.v c12 = b0.s.c(gVar2, r22, rVar, 6);
                                        rVar.b0(-1323940314);
                                        int i24 = rVar.P;
                                        r1 o17 = rVar.o();
                                        b1.c j18 = androidx.compose.ui.layout.a.j(a16);
                                        if (fVar instanceof t0.f) {
                                            rVar.e0();
                                            if (rVar.O) {
                                                rVar.n(jVar3);
                                            } else {
                                                rVar.n0();
                                            }
                                            t0.t.v0(rVar, c12, iVar10);
                                            t0.t.v0(rVar, o17, iVar11);
                                            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i24))) {
                                                nn.d.s(i24, rVar, i24, iVar12);
                                            }
                                            nn.d.q(r22, j18, new m2(rVar), rVar, 2058660585);
                                            String str = z15 ? "Delete" : "Report";
                                            o2.v vVar2 = jh.c.f21378g;
                                            long S = kp.j.S(14, rVar, 6);
                                            if (z15) {
                                                j10 = n1.t.f28174f;
                                            } else {
                                                j10 = n1.t.f28170b;
                                            }
                                            t0.r rVar6 = rVar;
                                            b9.b(str, h2.l.a(lVar3, r22, lb.a.f24391i), j10, S, null, null, vVar2, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar6, 1572864, 0, 130992);
                                            rVar2 = rVar6;
                                            z14 = true;
                                            v.e.y(rVar2, r22, true, r22, r22);
                                        } else {
                                            al.d.v0();
                                            throw null;
                                        }
                                    } else {
                                        z14 = true;
                                        rVar2 = rVar;
                                    }
                                    v.e.y(rVar2, r22, z14, r22, r22);
                                } else {
                                    al.d.v0();
                                    throw null;
                                }
                            }
                            v.e.y(rVar2, r22, z14, r22, r22);
                            iu.j.b(a0Var, !z11, null, null, null, null, b1.d.c(-641563686, new lb.b(i10, onLikeComment, z12), rVar2), rVar2, 1572870, 30);
                            v.e.y(rVar2, r22, z14, r22, r22);
                            v.e.y(rVar2, r22, z14, r22, r22);
                        } else {
                            al.d.v0();
                            throw null;
                        }
                    } else {
                        al.d.v0();
                        throw null;
                    }
                } else {
                    al.d.v0();
                    throw null;
                }
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar2.w();
        if (w10 != null) {
            w10.f35245d = new lb.c(z10, userProfileImage, userName, comment, timestamp, z11, z12, i10, onLikeComment, onReportComment, onDeleteComment, onViewUserProfile, i11, i12);
        }
    }

    public static final void h0(List categories, List storyGroups, int i10, nb.b bVar, nb.b bVar2, boolean z10, Function0 onSwipeRefresh, Function0 onMyFavoriteFeedClick, Function1 onSubCategoryTap, Function1 onSubCategoryFavoriteTap, Function1 onStoryTap, Function0 onRetryClick, t0.n nVar, int i11, int i12, int i13) {
        boolean z11;
        boolean z12;
        Intrinsics.checkNotNullParameter(categories, "categories");
        Intrinsics.checkNotNullParameter(storyGroups, "storyGroups");
        Intrinsics.checkNotNullParameter(onSwipeRefresh, "onSwipeRefresh");
        Intrinsics.checkNotNullParameter(onMyFavoriteFeedClick, "onMyFavoriteFeedClick");
        Intrinsics.checkNotNullParameter(onSubCategoryTap, "onSubCategoryTap");
        Intrinsics.checkNotNullParameter(onSubCategoryFavoriteTap, "onSubCategoryFavoriteTap");
        Intrinsics.checkNotNullParameter(onStoryTap, "onStoryTap");
        Intrinsics.checkNotNullParameter(onRetryClick, "onRetryClick");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(1119088806);
        nb.b bVar3 = (i13 & 8) != 0 ? null : bVar;
        nb.b bVar4 = (i13 & 16) != 0 ? null : bVar2;
        boolean z13 = (i13 & 32) != 0 ? false : z10;
        m0 a10 = p0.a(rVar);
        g1.l lVar = g1.l.f16404b;
        FillElement fillElement = androidx.compose.foundation.layout.d.f1286c;
        nb.b bVar5 = bVar3;
        g1.o e10 = androidx.compose.foundation.a.e(fillElement, androidx.compose.ui.graphics.a.d(4293585642L), s0.f28162a);
        g1.g gVar = g1.a.f16383e;
        rVar.b0(733328855);
        b0.v c10 = b0.s.c(gVar, false, rVar, 6);
        rVar.b0(-1323940314);
        int i14 = rVar.P;
        r1 o10 = rVar.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(e10);
        boolean z14 = rVar.f35166a instanceof t0.f;
        if (z14) {
            rVar.e0();
            if (rVar.O) {
                rVar.n(jVar);
            } else {
                rVar.n0();
            }
            c2.i iVar = c2.k.f7749e;
            t0.t.v0(rVar, c10, iVar);
            c2.i iVar2 = c2.k.f7748d;
            t0.t.v0(rVar, o10, iVar2);
            c2.i iVar3 = c2.k.f7750f;
            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i14))) {
                nn.d.s(i14, rVar, i14, iVar3);
            }
            nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
            if (z13) {
                rVar.b0(-377680325);
                o.p(androidx.compose.foundation.layout.a.x(lVar, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, kp.j.R(58, rVar), 7), onRetryClick, rVar, i12 & 112, 0);
                rVar.s(false);
                z11 = false;
                z12 = true;
            } else {
                rVar.b0(-377420824);
                nb.b bVar6 = nb.b.f28565b;
                p0.o D1 = dp.b.D1(bVar4 == bVar6, onSwipeRefresh, rVar, (i11 >> 15) & 112);
                g1.o g10 = al.d.K0(lVar, D1).g(fillElement);
                rVar.b0(733328855);
                b0.v c11 = b0.s.c(g1.a.f16379a, false, rVar, 0);
                rVar.b0(-1323940314);
                int i15 = rVar.P;
                r1 o11 = rVar.o();
                b1.c j11 = androidx.compose.ui.layout.a.j(g10);
                if (z14) {
                    rVar.e0();
                    if (rVar.O) {
                        rVar.n(jVar);
                    } else {
                        rVar.n0();
                    }
                    t0.t.v0(rVar, c11, iVar);
                    t0.t.v0(rVar, o11, iVar2);
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i15))) {
                        nn.d.s(i15, rVar, i15, iVar3);
                    }
                    nn.d.q(0, j11, new m2(rVar), rVar, 2058660585);
                    androidx.compose.foundation.layout.b bVar7 = androidx.compose.foundation.layout.b.f1281a;
                    qu.i0.c(fillElement, a10, null, false, null, null, null, false, new ob.k(bVar4, categories, storyGroups, bVar5, onStoryTap, i10, onMyFavoriteFeedClick, onSubCategoryTap, onSubCategoryFavoriteTap), rVar, 6, 252);
                    p0.h.a(bVar4 == bVar6, D1, bVar7.a(lVar, g1.a.f16380b), 0L, 0L, false, rVar, 64, 56);
                    z11 = false;
                    z12 = true;
                    v.e.y(rVar, false, true, false, false);
                    rVar.s(false);
                } else {
                    al.d.v0();
                    throw null;
                }
            }
            x1 t10 = da.e.t(rVar, z11, z12, z11, z11);
            if (t10 != null) {
                t10.f35245d = new ob.l(categories, storyGroups, i10, bVar5, bVar4, z13, onSwipeRefresh, onMyFavoriteFeedClick, onSubCategoryTap, onSubCategoryFavoriteTap, onStoryTap, onRetryClick, i11, i12, i13);
                return;
            }
            return;
        }
        al.d.v0();
        throw null;
    }

    public static final long h1(long j10, float f10) {
        if (!Float.isNaN(f10) && f10 < 1.0f) {
            return n1.t.c(j10, n1.t.e(j10) * f10);
        }
        return j10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v28, types: [f.a, java.lang.Object] */
    public static final void i(hb.s post, CommentsViewModel viewModel, Function2 dismissBottomSheet, t0.n nVar, int i10) {
        byte b10;
        byte b11;
        int i11;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        Intrinsics.checkNotNullParameter(post, "post");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(dismissBottomSheet, "dismissBottomSheet");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-1989811591);
        Context context = (Context) rVar.m(AndroidCompositionLocals_androidKt.f1428b);
        z2 C1 = dp.b.C1(true, rVar, 6, 2);
        rVar.b0(1352648646);
        int i12 = (i10 & 14) ^ 6;
        if ((i12 > 4 && rVar.h(post)) || (i10 & 6) == 4) {
            b10 = true;
        } else {
            b10 = false;
        }
        Object Q = rVar.Q();
        to.e eVar = t0.m.f35080a;
        if (b10 != false || Q == eVar) {
            Q = post.f18224a;
            rVar.k0(Q);
        }
        String str = (String) Q;
        rVar.s(false);
        rVar.b0(1352651061);
        if ((i12 > 4 && rVar.h(post)) || (i10 & 6) == 4) {
            b11 = true;
        } else {
            b11 = false;
        }
        Object Q2 = rVar.Q();
        if (b11 != false || Q2 == eVar) {
            Q2 = Integer.valueOf(post.f18229f.f18211b.f18207b);
            rVar.k0(Q2);
        }
        int intValue = ((Number) Q2).intValue();
        rVar.s(false);
        t0.t.e(Unit.f23355a, new lb.d(viewModel, intValue, str, null), rVar);
        n1 n1Var = viewModel.f8807p;
        kb.b bVar = (kb.b) n1Var.getValue();
        rVar.b0(1352663221);
        boolean h10 = rVar.h(bVar);
        Object Q3 = rVar.Q();
        if (h10 || Q3 == eVar) {
            Q3 = ((kb.b) n1Var.getValue()).f23026c;
            rVar.k0(Q3);
        }
        kb.a aVar = (kb.a) Q3;
        rVar.s(false);
        kb.b bVar2 = (kb.b) n1Var.getValue();
        rVar.b0(1352666434);
        boolean h11 = rVar.h(bVar2);
        Object Q4 = rVar.Q();
        if (h11 || Q4 == eVar) {
            Q4 = Boolean.valueOf(((kb.b) n1Var.getValue()).f23027d);
            rVar.k0(Q4);
        }
        boolean booleanValue = ((Boolean) Q4).booleanValue();
        rVar.s(false);
        kb.b bVar3 = (kb.b) n1Var.getValue();
        rVar.b0(1352669778);
        boolean h12 = rVar.h(bVar3);
        Object Q5 = rVar.Q();
        if (h12 || Q5 == eVar) {
            Q5 = Integer.valueOf(((kb.b) n1Var.getValue()).f23025b);
            rVar.k0(Q5);
        }
        int intValue2 = ((Number) Q5).intValue();
        rVar.s(false);
        rVar.b0(1352673787);
        Object Q6 = rVar.Q();
        o3 o3Var = o3.f35116a;
        if (Q6 == eVar) {
            i11 = intValue;
            n1 n0 = t0.t.n0(null, o3Var);
            rVar.k0(n0);
            Q6 = n0;
        } else {
            i11 = intValue;
        }
        g1 g1Var = (g1) Q6;
        rVar.s(false);
        kb.b bVar4 = (kb.b) n1Var.getValue();
        rVar.b0(1352677385);
        if ((((i10 & 896) ^ 384) > 256 && rVar.h(dismissBottomSheet)) || (i10 & 384) == 256) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean h13 = z10 | rVar.h(bVar4);
        Object Q7 = rVar.Q();
        if (h13 || Q7 == eVar) {
            Q7 = new c0.s(dismissBottomSheet, str, n1Var, 11);
            rVar.k0(Q7);
        }
        Function0 function0 = (Function0) Q7;
        int i13 = 0;
        Object h14 = v.e.h(rVar, false, 1352682860);
        if (h14 == eVar) {
            h14 = new lb.h(viewModel, i13);
            rVar.k0(h14);
        }
        Function0 function02 = (Function0) h14;
        Object h15 = v.e.h(rVar, false, 1352686602);
        if (h15 == eVar) {
            h15 = new lb.h(viewModel, 1);
            rVar.k0(h15);
        }
        Function0 function03 = (Function0) h15;
        Object h16 = v.e.h(rVar, false, 1352690582);
        if (h16 == eVar) {
            h16 = new lb.g(viewModel, 1);
            rVar.k0(h16);
        }
        Function1 function1 = (Function1) h16;
        rVar.s(false);
        rVar.b0(1352694862);
        if ((i12 > 4 && rVar.h(post)) || (i10 & 6) == 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        Object Q8 = rVar.Q();
        if (!z11 && Q8 != eVar) {
            z12 = false;
        } else {
            z12 = false;
            Q8 = new lb.g(viewModel, 0 == true ? 1 : 0);
            rVar.k0(Q8);
        }
        Function1 function12 = (Function1) Q8;
        rVar.s(z12);
        c.n G = qu.i0.G(new Object(), new d2.y0(20, g1Var, viewModel), rVar, 8);
        rVar.b0(1352712805);
        if ((i12 > 4 && rVar.h(post)) || (i10 & 6) == 4) {
            z13 = true;
        } else {
            z13 = false;
        }
        Object Q9 = rVar.Q();
        int i14 = 29;
        if (z13 || Q9 == eVar) {
            Q9 = new c.g(i14, g1Var, G, context);
            rVar.k0(Q9);
        }
        Function1 function13 = (Function1) Q9;
        Object h17 = v.e.h(rVar, false, 1352740751);
        if (h17 == eVar) {
            h17 = t0.t.n0(null, o3Var);
            rVar.k0(h17);
        }
        g1 g1Var2 = (g1) h17;
        rVar.s(false);
        rVar.b0(1352744826);
        if ((i12 > 4 && rVar.h(post)) || (i10 & 6) == 4) {
            z14 = true;
        } else {
            z14 = false;
        }
        Object Q10 = rVar.Q();
        if (z14 || Q10 == eVar) {
            Q10 = com.google.android.gms.internal.p002firebaseauthapi.a.i(g1Var2, 6, rVar);
        }
        Function1 function14 = (Function1) Q10;
        rVar.s(false);
        rVar.b0(1352750180);
        if ((i12 > 4 && rVar.h(post)) || (i10 & 6) == 4) {
            z15 = true;
        } else {
            z15 = false;
        }
        Object Q11 = rVar.Q();
        if (z15 || Q11 == eVar) {
            Q11 = new c.g(28, g1Var2, g1Var, viewModel);
            rVar.k0(Q11);
        }
        Function1 function15 = (Function1) Q11;
        rVar.s(false);
        rVar.b0(1352761515);
        if ((i12 > 4 && rVar.h(post)) || (i10 & 6) == 4) {
            z16 = true;
        } else {
            z16 = false;
        }
        Object Q12 = rVar.Q();
        if (z16 || Q12 == eVar) {
            Q12 = new e1(context, i14);
            rVar.k0(Q12);
        }
        rVar.s(false);
        dp.b.I(function0, androidx.compose.foundation.layout.a.n(androidx.compose.foundation.layout.d.c(g1.l.f16404b, 0.8f)), C1, s0.g.f34069a, null, n1.t.f28173e, 0L, s0.g.f34069a, 0L, null, null, null, b1.d.c(-1364288580, new lb.e(viewModel, intValue2, aVar, booleanValue, function02, function03, function1, function12, function13, function14, (Function1) Q12, function0, g1Var2, function15), rVar), rVar, 805502976, 384, 3544);
        t0.t.e((String) t0.t.o0(viewModel.f8812u, rVar).getValue(), new lb.f(t0.t.C(viewModel.f8814w, rVar), viewModel, dismissBottomSheet, str, i11, n1Var, context, null), rVar);
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new n0(post, viewModel, dismissBottomSheet, i10, 7);
        }
    }

    public static final void i0(int i10, t0.n nVar, List tabs, Function1 onTabSelected) {
        boolean z10;
        Intrinsics.checkNotNullParameter(onTabSelected, "onTabSelected");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-801891794);
        rVar.b0(815515956);
        boolean h10 = rVar.h(tabs);
        Object Q = rVar.Q();
        to.e eVar = t0.m.f35080a;
        if (h10 || Q == eVar) {
            Iterator it = tabs.iterator();
            int i11 = 0;
            while (true) {
                if (it.hasNext()) {
                    if (((hb.v) it.next()).f18233c) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    i11 = -1;
                    break;
                }
            }
            if (i11 == -1) {
                i11 = 0;
            }
            Q = t0.t.n0(Integer.valueOf(i11), o3.f35116a);
            rVar.k0(Q);
        }
        g1 g1Var = (g1) Q;
        rVar.s(false);
        rVar.b0(815521768);
        if ((((i10 & 14) ^ 6) > 4 && rVar.h(onTabSelected)) || (i10 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object Q2 = rVar.Q();
        if (z10 || Q2 == eVar) {
            Q2 = new rb.f(g1Var, onTabSelected, tabs);
            rVar.k0(Q2);
        }
        Function1 function1 = (Function1) Q2;
        rVar.s(false);
        g1.l lVar = g1.l.f16404b;
        g1.o i12 = androidx.compose.ui.draw.a.i(androidx.compose.foundation.layout.d.g(lVar, kp.j.R(50, rVar)), kp.j.R(4, rVar), null, false, 30);
        rVar.b0(733328855);
        b0.v c10 = b0.s.c(g1.a.f16379a, false, rVar, 0);
        rVar.b0(-1323940314);
        int i13 = rVar.P;
        r1 o10 = rVar.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(i12);
        if (rVar.f35166a instanceof t0.f) {
            rVar.e0();
            if (rVar.O) {
                rVar.n(jVar);
            } else {
                rVar.n0();
            }
            t0.t.v0(rVar, c10, c2.k.f7749e);
            t0.t.v0(rVar, o10, c2.k.f7748d);
            c2.i iVar = c2.k.f7750f;
            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i13))) {
                nn.d.s(i13, rVar, i13, iVar);
            }
            nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f1281a;
            int intValue = ((Number) g1Var.getValue()).intValue();
            g1.o e10 = androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.c(lVar, 1.0f), 1.0f);
            long j11 = n1.t.f28173e;
            z7.a(intValue, h2.l.a(bVar.a(androidx.compose.foundation.a.e(e10, j11, s0.f28162a), g1.a.f16383e), false, ac.h.f333b), j11, 0L, kp.j.R(0, rVar), b1.d.c(270643220, new tb.o(g1Var, 2), rVar), ac.f.f331a, b1.d.c(1842471444, new v.y(tabs, g1Var, bVar, function1, 1), rVar), rVar, 14352768, 8);
            x1 t10 = da.e.t(rVar, false, true, false, false);
            if (t10 != null) {
                t10.f35245d = new ac.i(onTabSelected, tabs, i10);
                return;
            }
            return;
        }
        al.d.v0();
        throw null;
    }

    public static final long i1(long j10, float f10) {
        long floatToIntBits = j10 | (Float.floatToIntBits(f10) & 4294967295L);
        w2.n[] nVarArr = w2.m.f38803b;
        return floatToIntBits;
    }

    public static final void j(t0.n nVar, int i10) {
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-1117490348);
        if (i10 == 0 && rVar.G()) {
            rVar.V();
        } else {
            qu.i0.c(h2.l.a(androidx.compose.foundation.layout.d.f1286c, false, mb.a.f27694b), null, null, false, null, null, null, false, mb.a.f27695c, rVar, 100663296, 254);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new lb.u(i10, 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0146 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x020a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void j0(float r41, float r42, float r43, java.lang.String r44, zb.e r45, g1.o r46, kotlin.jvm.functions.Function2 r47, t0.n r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 1042
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.j.j0(float, float, float, java.lang.String, zb.e, g1.o, kotlin.jvm.functions.Function2, t0.n, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00b2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a0 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void j1(int r6, g3.k r7, h.c r8, f3.a r9) {
        /*
            r0 = 2
            r1 = 1
            if (r6 != 0) goto Lb
            g3.g r6 = r7.e(r1)
            h3.h r6 = (h3.h) r6
            goto L11
        Lb:
            g3.g r6 = r7.e(r0)
            h3.i r6 = (h3.i) r6
        L11:
            f3.c r2 = r9.o(r1)
            boolean r3 = r2 instanceof f3.a
            if (r3 == 0) goto Lb7
            f3.a r2 = (f3.a) r2
            java.util.ArrayList r3 = r2.f15909e
            int r3 = r3.size()
            if (r3 >= r1) goto L25
            goto Lb7
        L25:
            r3 = 0
            r4 = r3
        L27:
            java.util.ArrayList r5 = r2.f15909e
            int r5 = r5.size()
            if (r4 >= r5) goto L3d
            java.lang.String r5 = r2.y(r4)
            java.lang.Object[] r5 = new java.lang.Object[]{r5}
            r6.r(r5)
            int r4 = r4 + 1
            goto L27
        L3d:
            java.util.ArrayList r2 = r9.f15909e
            int r2 = r2.size()
            if (r2 <= r0) goto Lb7
            f3.c r9 = r9.o(r0)
            boolean r0 = r9 instanceof f3.g
            if (r0 != 0) goto L4e
            return
        L4e:
            f3.g r9 = (f3.g) r9
            java.util.ArrayList r0 = r9.D()
            java.util.Iterator r0 = r0.iterator()
        L58:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lb7
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            r2.getClass()
            java.lang.String r4 = "style"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto L73
            k1(r8, r9, r6, r7, r2)
            goto L58
        L73:
            f3.c r2 = r9.p(r2)
            boolean r4 = r2 instanceof f3.a
            if (r4 == 0) goto L91
            r4 = r2
            f3.a r4 = (f3.a) r4
            java.util.ArrayList r5 = r4.f15909e
            int r5 = r5.size()
            if (r5 <= r1) goto L91
            java.lang.String r2 = r4.y(r3)
            float r4 = r4.r(r1)
            r6.n0 = r4
            goto L95
        L91:
            java.lang.String r2 = r2.e()
        L95:
            r2.getClass()
            java.lang.String r4 = "packed"
            boolean r4 = r2.equals(r4)
            if (r4 != 0) goto Lb2
            java.lang.String r4 = "spread_inside"
            boolean r2 = r2.equals(r4)
            if (r2 != 0) goto Lad
            g3.i r2 = g3.i.f16496a
            r6.f17920t0 = r2
            goto L58
        Lad:
            g3.i r2 = g3.i.f16497b
            r6.f17920t0 = r2
            goto L58
        Lb2:
            g3.i r2 = g3.i.f16498c
            r6.f17920t0 = r2
            goto L58
        Lb7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.j.j1(int, g3.k, h.c, f3.a):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void k(g1.o r21, boolean r22, kotlin.jvm.functions.Function0 r23, t0.n r24, int r25, int r26) {
        /*
            Method dump skipped, instructions count: 366
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.j.k(g1.o, boolean, kotlin.jvm.functions.Function0, t0.n, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v11 */
    /* JADX WARN: Type inference failed for: r15v2 */
    /* JADX WARN: Type inference failed for: r15v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v30 */
    public static final void k0(List tradeSentiment, t0.n nVar, int i10) {
        Object obj;
        String str;
        String str2;
        g1.g gVar;
        String str3;
        g1.l lVar;
        t0.f fVar;
        int i11;
        ?? r15;
        t0.r rVar;
        Object obj2;
        int i12;
        j2.e i13;
        boolean z10;
        t0.r rVar2;
        ?? r22;
        String str4;
        long j10;
        d0 d0Var;
        int i14;
        long j11;
        long j12;
        long j13;
        Intrinsics.checkNotNullParameter(tradeSentiment, "tradeSentiment");
        t0.r rVar3 = (t0.r) nVar;
        rVar3.c0(-1234360178);
        rVar3.b0(512772032);
        boolean h10 = rVar3.h(tradeSentiment);
        Object Q = rVar3.Q();
        if (h10 || Q == t0.m.f35080a) {
            Iterator it = tradeSentiment.iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (((hb.h) obj).f18175a != hb.c0.f18150a) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            Q = (hb.h) obj;
            rVar3.k0(Q);
        }
        hb.h hVar = (hb.h) Q;
        rVar3.s(false);
        rVar3.b0(-483455358);
        g1.l lVar2 = g1.l.f16404b;
        l1 a10 = y.a(b0.n.f2937c, g1.a.f16391m, rVar3, 0);
        rVar3.b0(-1323940314);
        int i15 = rVar3.P;
        r1 o10 = rVar3.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j14 = androidx.compose.ui.layout.a.j(lVar2);
        t0.f fVar2 = rVar3.f35166a;
        boolean z11 = fVar2 instanceof t0.f;
        if (z11) {
            rVar3.e0();
            if (rVar3.O) {
                rVar3.n(jVar);
            } else {
                rVar3.n0();
            }
            c2.i iVar = c2.k.f7749e;
            t0.t.v0(rVar3, a10, iVar);
            c2.i iVar2 = c2.k.f7748d;
            t0.t.v0(rVar3, o10, iVar2);
            c2.i iVar3 = c2.k.f7750f;
            if (rVar3.O || !Intrinsics.a(rVar3.Q(), Integer.valueOf(i15))) {
                nn.d.s(i15, rVar3, i15, iVar3);
            }
            nn.d.q(0, j14, new m2(rVar3), rVar3, 2058660585);
            rVar3.b0(1943937706);
            g1.g gVar2 = g1.a.f16383e;
            if (hVar == null) {
                str = "(";
                str2 = "%)";
                gVar = gVar2;
                str3 = " ";
                lVar = lVar2;
                fVar = fVar2;
                i11 = 1;
                r15 = 0;
                rVar = rVar3;
            } else {
                g1.o k10 = da.e.k(10, rVar3, androidx.compose.foundation.layout.d.e(lVar2, 1.0f));
                hb.b0 b0Var = hVar.f18180f;
                g1.o a11 = h2.l.a(androidx.compose.foundation.a.h((float) 1.5d, androidx.compose.foundation.a.d(k10, l0(b0Var), h0.h.b(kp.j.R(10, rVar3)), 4), m0(b0Var), h0.h.b(kp.j.R(10, rVar3))), false, zb.a.f42232o);
                rVar3.b0(733328855);
                b0.v c10 = b0.s.c(gVar2, false, rVar3, 6);
                rVar3.b0(-1323940314);
                int i16 = rVar3.P;
                r1 o11 = rVar3.o();
                b1.c j15 = androidx.compose.ui.layout.a.j(a11);
                if (z11) {
                    rVar3.e0();
                    if (rVar3.O) {
                        rVar3.n(jVar);
                    } else {
                        rVar3.n0();
                    }
                    t0.t.v0(rVar3, c10, iVar);
                    t0.t.v0(rVar3, o11, iVar2);
                    if (rVar3.O || !Intrinsics.a(rVar3.Q(), Integer.valueOf(i16))) {
                        nn.d.s(i16, rVar3, i16, iVar3);
                    }
                    nn.d.q(0, j15, new m2(rVar3), rVar3, 2058660585);
                    rVar3.b0(-352659000);
                    j2.c cVar = new j2.c();
                    rVar3.b0(-352660779);
                    String str5 = hVar.f18181g;
                    if (str5.length() <= 0) {
                        str4 = " ";
                    } else {
                        int h11 = cVar.h(new j2.b0(n1.t.f28170b, kp.j.S(14, rVar3, 6), null, null, null, jh.c.f21381j, null, 0L, null, null, null, 0L, null, null, 65500));
                        try {
                            cVar.d(str5);
                            str4 = " ";
                            cVar.d(str4);
                            Unit unit = Unit.f23355a;
                        } finally {
                        }
                    }
                    rVar3.s(false);
                    double d10 = hVar.f18177c;
                    double d11 = hVar.f18178d;
                    hb.c0 c0Var = hVar.f18175a;
                    d0 d0Var2 = hVar.f18179e;
                    long j16 = 4293606203L;
                    if (d10 != 0.0d && c0Var == hb.c0.f18152c) {
                        rVar3.b0(-2116978899);
                        o2.v vVar = jh.c.f21381j;
                        long S = kp.j.S(18, rVar3, 6);
                        d0 d0Var3 = d0.f18163b;
                        if (d0Var2 == d0Var3) {
                            j12 = 4278486873L;
                        } else {
                            j12 = 4293606203L;
                        }
                        int h12 = cVar.h(new j2.b0(androidx.compose.ui.graphics.a.d(j12), S, null, null, null, vVar, null, 0L, null, null, null, 0L, null, null, 65500));
                        try {
                            cVar.d(el.l.S0(Double.valueOf(d10), false));
                            cVar.d(str4);
                            Unit unit2 = Unit.f23355a;
                            cVar.f(h12);
                            o2.v vVar2 = jh.c.f21384m;
                            long S2 = kp.j.S(20, rVar3, 6);
                            if (d0Var2 == d0Var3) {
                                j13 = 4278486873L;
                            } else {
                                j13 = 4293606203L;
                            }
                            int h13 = cVar.h(new j2.b0(androidx.compose.ui.graphics.a.d(j13), S2, null, null, null, vVar2, null, 0L, null, null, null, 0L, null, null, 65500));
                            try {
                                cVar.d("(" + d11 + "%)");
                                cVar.d(HttpUrl.FRAGMENT_ENCODE_SET);
                                cVar.f(h13);
                                rVar3.s(false);
                            } finally {
                            }
                        } finally {
                        }
                    } else {
                        rVar3.b0(-2115435688);
                        o2.v vVar3 = jh.c.f21384m;
                        long S3 = kp.j.S(20, rVar3, 6);
                        if (d0Var2 == d0.f18163b) {
                            j10 = 4278486873L;
                        } else {
                            j10 = 4293606203L;
                        }
                        int h14 = cVar.h(new j2.b0(androidx.compose.ui.graphics.a.d(j10), S3, null, null, null, vVar3, null, 0L, null, null, null, 0L, null, null, 65500));
                        try {
                            cVar.d(d11 + "%");
                            cVar.d(str4);
                            Unit unit3 = Unit.f23355a;
                            cVar.f(h14);
                            rVar3.s(false);
                        } finally {
                        }
                    }
                    rVar3.b0(-352565274);
                    String str6 = hVar.f18182h;
                    if (str6.length() > 0) {
                        o2.v vVar4 = jh.c.f21381j;
                        if (c0Var == hb.c0.f18152c) {
                            rVar3.b0(-1176583051);
                            long S4 = kp.j.S(22, rVar3, 6);
                            rVar3.s(false);
                            j11 = S4;
                        } else {
                            rVar3.b0(-1176582539);
                            long S5 = kp.j.S(14, rVar3, 6);
                            rVar3.s(false);
                            j11 = S5;
                        }
                        int h15 = cVar.h(new j2.b0(n1.t.f28170b, j11, null, null, null, vVar4, null, 0L, null, null, null, 0L, null, null, 65500));
                        try {
                            cVar.d(str6);
                        } finally {
                        }
                    }
                    rVar3.s(false);
                    j2.e i17 = cVar.i();
                    rVar3.s(false);
                    g1.o t10 = androidx.compose.foundation.layout.a.t(lVar2, kp.j.R(14, rVar3));
                    g1.f fVar3 = g1.a.f16389k;
                    rVar3.b0(693286680);
                    l1 a12 = o1.a(b0.n.f2935a, fVar3, rVar3, 48);
                    rVar3.b0(-1323940314);
                    int i18 = rVar3.P;
                    r1 o12 = rVar3.o();
                    b1.c j17 = androidx.compose.ui.layout.a.j(t10);
                    if (z11) {
                        rVar3.e0();
                        if (rVar3.O) {
                            rVar3.n(jVar);
                        } else {
                            rVar3.n0();
                        }
                        t0.t.v0(rVar3, a12, iVar);
                        t0.t.v0(rVar3, o12, iVar2);
                        if (rVar3.O || !Intrinsics.a(rVar3.Q(), Integer.valueOf(i18))) {
                            nn.d.s(i18, rVar3, i18, iVar3);
                        }
                        nn.d.q(0, j17, new m2(rVar3), rVar3, 2058660585);
                        rVar3.b0(-1176567512);
                        if (c0Var == hb.c0.f18152c) {
                            str = "(";
                            d0Var = d0Var2;
                            str2 = "%)";
                        } else {
                            if (d0Var2 == d0.f18163b) {
                                i14 = R.drawable.ic_like_social_feed;
                            } else {
                                i14 = R.drawable.ic_dislike_social_feed;
                            }
                            d0Var = d0Var2;
                            str2 = "%)";
                            str = "(";
                            s3.a(w0.u(i14, rVar3, 0), "Like", h2.l.a(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.q(lVar2, kp.j.R(20, rVar3)), kp.j.R(18, rVar3)), false, zb.a.f42233p), n1.t.f28177i, rVar3, 3128, 0);
                        }
                        rVar3.s(false);
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar2, kp.j.R(4, rVar3)), rVar3);
                        if (d0Var == d0.f18163b) {
                            j16 = 4278486873L;
                        }
                        gVar = gVar2;
                        fVar = fVar2;
                        str3 = str4;
                        lVar = lVar2;
                        b9.c(i17, h2.l.a(lVar2, false, zb.a.f42234q), androidx.compose.ui.graphics.a.d(j16), 0L, null, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, null, null, rVar3, 0, 3120, 251896);
                        t0.r rVar4 = rVar3;
                        i11 = 1;
                        r15 = 0;
                        v.e.y(rVar4, false, true, false, false);
                        v.e.y(rVar4, false, true, false, false);
                        rVar = rVar4;
                    } else {
                        al.d.v0();
                        throw null;
                    }
                } else {
                    al.d.v0();
                    throw null;
                }
            }
            rVar.s(r15);
            Iterator it2 = tradeSentiment.iterator();
            while (true) {
                if (it2.hasNext()) {
                    obj2 = it2.next();
                    if (((hb.h) obj2).f18175a == hb.c0.f18150a) {
                        break;
                    }
                } else {
                    obj2 = null;
                    break;
                }
            }
            hb.h hVar2 = (hb.h) obj2;
            rVar.b0(1944140073);
            if (hVar2 == null) {
                i13 = null;
                i12 = 6;
            } else {
                rVar.b0(1944141237);
                j2.c cVar2 = new j2.c();
                rVar.b0(1944141542);
                String str7 = hVar2.f18181g;
                if (str7.length() > 0) {
                    i12 = 6;
                    int h16 = cVar2.h(new j2.b0(w0.e(R.color.black_747474, rVar), kp.j.S(15, rVar, 6), null, null, null, jh.c.f21385n, null, 0L, null, null, null, 0L, null, null, 65500));
                    try {
                        cVar2.d(str7);
                        cVar2.d("  ");
                        Unit unit4 = Unit.f23355a;
                    } finally {
                    }
                } else {
                    i12 = 6;
                }
                rVar.s(r15);
                o2.v vVar5 = jh.c.f21385n;
                int h17 = cVar2.h(new j2.b0(n1.t.f28170b, kp.j.S(15, rVar, i12), null, null, null, vVar5, null, 0L, null, null, null, 0L, null, null, 65500));
                try {
                    cVar2.d(el.l.S0(Double.valueOf(hVar2.f18177c), r15));
                    cVar2.d(str + hVar2.f18178d + str2);
                    cVar2.d(str3);
                    Unit unit5 = Unit.f23355a;
                    cVar2.f(h17);
                    rVar.b0(1944175133);
                    String str8 = hVar2.f18182h;
                    if (str8.length() > 0) {
                        int h18 = cVar2.h(new j2.b0(w0.e(R.color.black_747474, rVar), kp.j.S(15, rVar, i12), null, null, null, vVar5, null, 0L, null, null, null, 0L, null, null, 65500));
                        try {
                            cVar2.d(str8);
                        } finally {
                        }
                    }
                    rVar.s(r15);
                    i13 = cVar2.i();
                    rVar.s(r15);
                } finally {
                }
            }
            rVar.s(r15);
            rVar.b0(1944192174);
            if (i13 == null || i13.f20699a.length() == 0) {
                z10 = i11;
                rVar2 = rVar;
                r22 = r15;
            } else {
                v.e.s(10, rVar, lVar, rVar);
                g1.o a13 = h2.l.a(androidx.compose.foundation.layout.a.u(androidx.compose.foundation.a.d(androidx.compose.foundation.a.g(lVar, kp.j.R(i11, rVar), androidx.compose.ui.graphics.a.d(4292730333L), h0.h.b(kp.j.R(10, rVar))), kq.e.K(vt.y.g(new n1.t(androidx.compose.ui.graphics.a.d(4294375158L)), new n1.t(androidx.compose.ui.graphics.a.c(1257172718))), t0.t.g(s0.g.f34069a, s0.g.f34069a), t0.t.g(400.0f, 40.0f)), h0.h.b(kp.j.R(10, rVar)), 4), kp.j.R(12, rVar), kp.j.R(i12, rVar)), r15, zb.a.f42235r);
                rVar.b0(733328855);
                b0.v c11 = b0.s.c(gVar, r15, rVar, i12);
                rVar.b0(-1323940314);
                int i19 = rVar.P;
                r1 o13 = rVar.o();
                c2.l.M.getClass();
                c2.j jVar2 = c2.k.f7746b;
                b1.c j18 = androidx.compose.ui.layout.a.j(a13);
                if (fVar instanceof t0.f) {
                    rVar.e0();
                    if (rVar.O) {
                        rVar.n(jVar2);
                    } else {
                        rVar.n0();
                    }
                    t0.t.v0(rVar, c11, c2.k.f7749e);
                    t0.t.v0(rVar, o13, c2.k.f7748d);
                    c2.i iVar4 = c2.k.f7750f;
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i19))) {
                        nn.d.s(i19, rVar, i19, iVar4);
                    }
                    nn.d.q(r15, j18, new m2(rVar), rVar, 2058660585);
                    t0.r rVar5 = rVar;
                    b9.c(i13, h2.l.a(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.a.x(lVar, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, kp.j.R(2, rVar), 7), 1.0f), r15, zb.a.f42236s), 0L, 0L, null, null, null, 0L, null, new u2.i(3), kp.j.S(19, rVar, i12), 0, false, 0, 0, null, null, null, rVar5, 0, 0, 260604);
                    t0.r rVar6 = rVar5;
                    r22 = 0;
                    z10 = 1;
                    v.e.y(rVar6, false, true, false, false);
                    rVar2 = rVar6;
                } else {
                    al.d.v0();
                    throw null;
                }
            }
            rVar2.s(r22);
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, kp.j.R(14, rVar2)), rVar2);
            rVar2.s(r22);
            rVar2.s(z10);
            rVar2.s(r22);
            rVar2.s(r22);
            x1 w10 = rVar2.w();
            if (w10 != null) {
                w10.f35245d = new zb.f(i10, r22, tradeSentiment);
                return;
            }
            return;
        }
        al.d.v0();
        throw null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static void k1(h.c cVar, f3.g gVar, g3.b bVar, g3.k kVar, String str) {
        g3.b b10;
        char c10;
        String str2;
        float f10;
        float f11;
        g3.b b11;
        char c11;
        boolean z10;
        char c12;
        char c13;
        boolean z11;
        char c14;
        char c15;
        boolean z12 = kVar.f16505b;
        f3.a q10 = gVar.q(str);
        if (q10 != null && q10.f15909e.size() > 1) {
            String y10 = q10.y(0);
            f3.c u10 = q10.u(1);
            if (u10 instanceof f3.h) {
                str2 = u10.e();
            } else {
                str2 = null;
            }
            int size = q10.f15909e.size();
            float f12 = s0.g.f34069a;
            if (size > 2) {
                f10 = kVar.f16504a.m(cVar.o(q10.u(2)));
            } else {
                f10 = 0.0f;
            }
            float f13 = f10;
            if (q10.f15909e.size() > 3) {
                f11 = kVar.f16504a.m(cVar.o(q10.u(3)));
            } else {
                f11 = 0.0f;
            }
            if (y10.equals("parent")) {
                b11 = kVar.b(g3.k.f16503k);
            } else {
                b11 = kVar.b(y10);
            }
            str.getClass();
            switch (str.hashCode()) {
                case -1720785339:
                    if (str.equals("baseline")) {
                        c11 = 0;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1498085729:
                    if (str.equals("circular")) {
                        c11 = 1;
                        break;
                    }
                    c11 = 65535;
                    break;
                case -1383228885:
                    if (str.equals("bottom")) {
                        c11 = 2;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 100571:
                    if (str.equals("end")) {
                        c11 = 3;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 115029:
                    if (str.equals("top")) {
                        c11 = 4;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 3317767:
                    if (str.equals("left")) {
                        c11 = 5;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 108511772:
                    if (str.equals("right")) {
                        c11 = 6;
                        break;
                    }
                    c11 = 65535;
                    break;
                case 109757538:
                    if (str.equals("start")) {
                        c11 = 7;
                        break;
                    }
                    c11 = 65535;
                    break;
                default:
                    c11 = 65535;
                    break;
            }
            switch (c11) {
                case 0:
                    str2.getClass();
                    switch (str2.hashCode()) {
                        case -1720785339:
                            if (str2.equals("baseline")) {
                                c12 = 0;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case -1383228885:
                            if (str2.equals("bottom")) {
                                c12 = 1;
                                break;
                            }
                            c12 = 65535;
                            break;
                        case 115029:
                            if (str2.equals("top")) {
                                c12 = 2;
                                break;
                            }
                            c12 = 65535;
                            break;
                        default:
                            c12 = 65535;
                            break;
                    }
                    switch (c12) {
                        case 0:
                            kVar.a(bVar.f16436a);
                            kVar.a(b11.f16436a);
                            bVar.f16455j0 = 15;
                            bVar.X = b11;
                            break;
                        case 1:
                            kVar.a(bVar.f16436a);
                            bVar.f16455j0 = 17;
                            bVar.Z = b11;
                            break;
                        case 2:
                            kVar.a(bVar.f16436a);
                            bVar.f16455j0 = 16;
                            bVar.Y = b11;
                            break;
                    }
                    z10 = false;
                    z11 = true;
                    break;
                case 1:
                    float o10 = cVar.o(q10.o(1));
                    if (q10.f15909e.size() > 2) {
                        f12 = kVar.f16504a.m(cVar.o(q10.u(2)));
                    }
                    bVar.f16437a0 = bVar.k(b11);
                    bVar.f16439b0 = o10;
                    bVar.f16441c0 = f12;
                    bVar.f16455j0 = 20;
                    z10 = false;
                    z11 = true;
                    break;
                case 2:
                    str2.getClass();
                    switch (str2.hashCode()) {
                        case -1720785339:
                            if (str2.equals("baseline")) {
                                c13 = 0;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case -1383228885:
                            if (str2.equals("bottom")) {
                                c13 = 1;
                                break;
                            }
                            c13 = 65535;
                            break;
                        case 115029:
                            if (str2.equals("top")) {
                                c13 = 2;
                                break;
                            }
                            c13 = 65535;
                            break;
                        default:
                            c13 = 65535;
                            break;
                    }
                    switch (c13) {
                        case 0:
                            kVar.a(b11.f16436a);
                            bVar.f16455j0 = 14;
                            bVar.W = b11;
                            break;
                        case 1:
                            bVar.f(b11);
                            break;
                        case 2:
                            bVar.f16455j0 = 12;
                            bVar.U = b11;
                            break;
                    }
                    z10 = false;
                    z11 = true;
                    break;
                case 3:
                    z11 = !z12;
                    z10 = true;
                    break;
                case 4:
                    str2.getClass();
                    switch (str2.hashCode()) {
                        case -1720785339:
                            if (str2.equals("baseline")) {
                                c14 = 0;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case -1383228885:
                            if (str2.equals("bottom")) {
                                c14 = 1;
                                break;
                            }
                            c14 = 65535;
                            break;
                        case 115029:
                            if (str2.equals("top")) {
                                c14 = 2;
                                break;
                            }
                            c14 = 65535;
                            break;
                        default:
                            c14 = 65535;
                            break;
                    }
                    switch (c14) {
                        case 0:
                            kVar.a(b11.f16436a);
                            bVar.f16455j0 = 11;
                            bVar.T = b11;
                            break;
                        case 1:
                            bVar.f16455j0 = 10;
                            bVar.S = b11;
                            break;
                        case 2:
                            bVar.q(b11);
                            break;
                    }
                    z10 = false;
                    z11 = true;
                    break;
                case 5:
                    z10 = true;
                    z11 = true;
                    break;
                case 6:
                    z10 = true;
                    z11 = false;
                    break;
                case 7:
                    z11 = z12;
                    z10 = true;
                    break;
                default:
                    z10 = false;
                    z11 = true;
                    break;
            }
            if (z10) {
                str2.getClass();
                switch (str2.hashCode()) {
                    case 100571:
                        if (str2.equals("end")) {
                            c15 = 0;
                            break;
                        }
                        c15 = 65535;
                        break;
                    case 108511772:
                        if (str2.equals("right")) {
                            c15 = 1;
                            break;
                        }
                        c15 = 65535;
                        break;
                    case 109757538:
                        if (str2.equals("start")) {
                            c15 = 2;
                            break;
                        }
                        c15 = 65535;
                        break;
                    default:
                        c15 = 65535;
                        break;
                }
                switch (c15) {
                    case 0:
                        z12 = !z12;
                        break;
                    case 1:
                        z12 = false;
                        break;
                    case 2:
                        break;
                    default:
                        z12 = true;
                        break;
                }
                if (z11) {
                    if (z12) {
                        bVar.f16455j0 = 1;
                        bVar.J = b11;
                    } else {
                        bVar.f16455j0 = 2;
                        bVar.K = b11;
                    }
                } else if (z12) {
                    bVar.f16455j0 = 3;
                    bVar.L = b11;
                } else {
                    bVar.f16455j0 = 4;
                    bVar.M = b11;
                }
            }
            bVar.m(Float.valueOf(f13)).o(Float.valueOf(f11));
            return;
        }
        String B = gVar.B(str);
        if (B != null) {
            if (B.equals("parent")) {
                b10 = kVar.b(g3.k.f16503k);
            } else {
                b10 = kVar.b(B);
            }
            str.getClass();
            switch (str.hashCode()) {
                case -1720785339:
                    if (str.equals("baseline")) {
                        c10 = 0;
                        break;
                    }
                    c10 = 65535;
                    break;
                case -1383228885:
                    if (str.equals("bottom")) {
                        c10 = 1;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 100571:
                    if (str.equals("end")) {
                        c10 = 2;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 115029:
                    if (str.equals("top")) {
                        c10 = 3;
                        break;
                    }
                    c10 = 65535;
                    break;
                case 109757538:
                    if (str.equals("start")) {
                        c10 = 4;
                        break;
                    }
                    c10 = 65535;
                    break;
                default:
                    c10 = 65535;
                    break;
            }
            switch (c10) {
                case 0:
                    kVar.a(bVar.f16436a);
                    kVar.a(b10.f16436a);
                    bVar.f16455j0 = 15;
                    bVar.X = b10;
                    return;
                case 1:
                    bVar.f(b10);
                    return;
                case 2:
                    if (z12) {
                        bVar.f16455j0 = 4;
                        bVar.M = b10;
                        return;
                    } else {
                        bVar.f16455j0 = 1;
                        bVar.J = b10;
                        return;
                    }
                case 3:
                    bVar.q(b10);
                    return;
                case 4:
                    if (z12) {
                        bVar.f16455j0 = 1;
                        bVar.J = b10;
                        return;
                    } else {
                        bVar.f16455j0 = 4;
                        bVar.M = b10;
                        return;
                    }
                default:
                    return;
            }
        }
    }

    public static final void l(g1.o oVar, GroupCreateViewModel groupCreateViewModel, Function1 onBackPressed, t0.n nVar, int i10, int i11) {
        g1.o oVar2;
        Intrinsics.checkNotNullParameter(groupCreateViewModel, "groupCreateViewModel");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(2070524431);
        int i12 = i11 & 1;
        g1.l lVar = g1.l.f16404b;
        if (i12 != 0) {
            oVar2 = lVar;
        } else {
            oVar2 = oVar;
        }
        rVar.b0(-1305801623);
        Object Q = rVar.Q();
        to.e eVar = t0.m.f35080a;
        o3 o3Var = o3.f35116a;
        if (Q == eVar) {
            Q = t0.t.n0(HttpUrl.FRAGMENT_ENCODE_SET, o3Var);
            rVar.k0(Q);
        }
        g1 g1Var = (g1) Q;
        rVar.s(false);
        d2.d3 d3Var = (d2.d3) rVar.m(s1.f13628m);
        h7.b a10 = h7.g.a(groupCreateViewModel.J, rVar);
        t0.t.e((String) g1Var.getValue(), new pd.e(groupCreateViewModel, g1Var, null), rVar);
        h7.b a11 = h7.g.a((tu.f) groupCreateViewModel.I.getValue(), rVar);
        h7.b a12 = h7.g.a((tu.f) groupCreateViewModel.H.getValue(), rVar);
        rVar.b0(-1305774484);
        Object Q2 = rVar.Q();
        if (Q2 == eVar) {
            Q2 = t0.t.n0(Boolean.FALSE, o3Var);
            rVar.k0(Q2);
        }
        g1 g1Var2 = (g1) Q2;
        rVar.s(false);
        g1 K0 = K0(new tu.s0(groupCreateViewModel.G), rVar);
        boolean booleanValue = ((Boolean) K0.getValue()).booleanValue();
        rVar.b0(-1305766588);
        Object Q3 = rVar.Q();
        if (Q3 == eVar) {
            Q3 = com.google.android.gms.internal.p002firebaseauthapi.a.j(g1Var, 11, rVar);
        }
        rVar.s(false);
        p0.o D1 = dp.b.D1(booleanValue, (Function0) Q3, rVar, 48);
        rVar.b0(-1305764092);
        Object Q4 = rVar.Q();
        if (Q4 == eVar) {
            Q4 = new e1.s();
            rVar.k0(Q4);
        }
        e1.s sVar = (e1.s) Q4;
        int i13 = 0;
        Object h10 = v.e.h(rVar, false, -1305761175);
        if (h10 == eVar) {
            h10 = t0.t.n0(HttpUrl.FRAGMENT_ENCODE_SET, o3Var);
            rVar.k0(h10);
        }
        g1 g1Var3 = (g1) h10;
        Object h11 = v.e.h(rVar, false, -1305758900);
        if (h11 == eVar) {
            h11 = t0.t.n0(Boolean.FALSE, o3Var);
            rVar.k0(h11);
        }
        rVar.s(false);
        z5.b(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.c(lVar, 1.0f), 1.0f), null, b1.d.c(1091824596, new pd.g(onBackPressed, sVar, i13), rVar), null, null, null, 0, false, null, false, null, s0.g.f34069a, 0L, 0L, 0L, 0L, 0L, b1.d.c(-2123026227, new pd.x(g1Var2, sVar, groupCreateViewModel, (g1) h11, g1Var3, D1, K0, d3Var, a10, a11, a12, g1Var), rVar), rVar, 390, 12582912, 131066);
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new d0.t(i10, i11, 11, oVar2, groupCreateViewModel, onBackPressed);
        }
    }

    public static final n1.p l0(hb.b0 b0Var) {
        int ordinal = b0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            return new j0(vt.y.g(new n1.t(androidx.compose.ui.graphics.a.c(1308620791)), new n1.t(androidx.compose.ui.graphics.a.c(1308614366))), t0.t.g(s0.g.f34069a, s0.g.f34069a), t0.t.g(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), 0);
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return new z0(androidx.compose.ui.graphics.a.c(771726115));
                }
                return new j0(vt.y.g(new n1.t(androidx.compose.ui.graphics.a.d(2499149813L)), new n1.t(androidx.compose.ui.graphics.a.c(1423966177))), t0.t.g(s0.g.f34069a, s0.g.f34069a), t0.t.g(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), 0);
            }
            return new j0(vt.y.g(new n1.t(androidx.compose.ui.graphics.a.d(4294901742L)), new n1.t(androidx.compose.ui.graphics.a.d(4294901742L))), t0.t.g(s0.g.f34069a, s0.g.f34069a), t0.t.g(Float.POSITIVE_INFINITY, s0.g.f34069a), 0);
        }
        return new j0(vt.y.g(new n1.t(androidx.compose.ui.graphics.a.d(4294375158L)), new n1.t(androidx.compose.ui.graphics.a.c(1257172718))), t0.t.g(s0.g.f34069a, s0.g.f34069a), t0.t.g(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY), 0);
    }

    public static g3.f l1(f3.g gVar, String str, g3.k kVar, b3.t tVar) {
        f3.c p10 = gVar.p(str);
        g3.f b10 = g3.f.b(0);
        if (p10 instanceof f3.h) {
            return m1(p10.e());
        }
        if (p10 instanceof f3.e) {
            return g3.f.b(kVar.c(Float.valueOf(tVar.m(gVar.s(str)))));
        }
        if (p10 instanceof f3.g) {
            f3.g gVar2 = (f3.g) p10;
            String B = gVar2.B(AppMeasurementSdk.ConditionalUserProperty.VALUE);
            if (B != null) {
                b10 = m1(B);
            }
            f3.c w10 = gVar2.w("min");
            if (w10 != null) {
                if (w10 instanceof f3.e) {
                    int c10 = kVar.c(Float.valueOf(tVar.m(((f3.e) w10).g())));
                    if (c10 >= 0) {
                        b10.f16486a = c10;
                    }
                } else if (w10 instanceof f3.h) {
                    b10.f16486a = -2;
                }
            }
            f3.c w11 = gVar2.w("max");
            if (w11 != null) {
                if (w11 instanceof f3.e) {
                    int c11 = kVar.c(Float.valueOf(tVar.m(((f3.e) w11).g())));
                    if (b10.f16487b >= 0) {
                        b10.f16487b = c11;
                        return b10;
                    }
                    return b10;
                }
                if (w11 instanceof f3.h) {
                    String str2 = g3.f.f16481i;
                    if (b10.f16492g) {
                        b10.f16491f = str2;
                        b10.f16487b = Api.BaseClientBuilder.API_PRIORITY_OTHER;
                        return b10;
                    }
                    return b10;
                }
                return b10;
            }
            return b10;
        }
        return b10;
    }

    public static final void m(CommentMetaData commentMetaData, Function1 onClickCallback, t0.n nVar, int i10) {
        Intrinsics.checkNotNullParameter(commentMetaData, "commentMetaData");
        Intrinsics.checkNotNullParameter(onClickCallback, "onClickCallback");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-1357064912);
        int i11 = 2;
        z2 C1 = dp.b.C1(true, rVar, 6, 2);
        rVar.b0(-1315698465);
        Object Q = rVar.Q();
        if (Q == t0.m.f35080a) {
            Q = new h1(i11, onClickCallback);
            rVar.k0(Q);
        }
        rVar.s(false);
        dp.b.I((Function0) Q, androidx.compose.foundation.layout.a.n(g1.l.f16404b), C1, s0.g.f34069a, null, n1.t.f28173e, 0L, s0.g.f34069a, 0L, null, null, null, b1.d.c(380158349, new v.o(7, onClickCallback, commentMetaData), rVar), rVar, 805502982, 384, 3544);
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new t1(commentMetaData, onClickCallback, i10, 9);
        }
    }

    public static final n1.p m0(hb.b0 b0Var) {
        int ordinal = b0Var.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            return kq.e.I(vt.y.g(new n1.t(androidx.compose.ui.graphics.a.d(4294932600L)), new n1.t(androidx.compose.ui.graphics.a.d(4294901760L)), new n1.t(androidx.compose.ui.graphics.a.d(4293656576L))));
                        }
                        throw new NoWhenBranchMatchedException();
                    }
                    return kq.e.I(vt.y.g(new n1.t(androidx.compose.ui.graphics.a.d(4294952278L)), new n1.t(androidx.compose.ui.graphics.a.d(4294948429L)), new n1.t(androidx.compose.ui.graphics.a.d(2916836107L))));
                }
                return kq.e.I(vt.y.g(new n1.t(androidx.compose.ui.graphics.a.d(4278242436L)), new n1.t(androidx.compose.ui.graphics.a.d(4282045598L)), new n1.t(androidx.compose.ui.graphics.a.d(4278250906L))));
            }
            return kq.e.I(vt.y.g(new n1.t(androidx.compose.ui.graphics.a.d(4292392448L)), new n1.t(androidx.compose.ui.graphics.a.d(4294957853L)), new n1.t(androidx.compose.ui.graphics.a.d(4294956544L))));
        }
        return new z0(androidx.compose.ui.graphics.a.d(4292730333L));
    }

    public static g3.f m1(String str) {
        g3.f b10 = g3.f.b(0);
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1460244870:
                if (str.equals("preferWrap")) {
                    c10 = 0;
                    break;
                }
                break;
            case -995424086:
                if (str.equals("parent")) {
                    c10 = 1;
                    break;
                }
                break;
            case -895684237:
                if (str.equals("spread")) {
                    c10 = 2;
                    break;
                }
                break;
            case 3657802:
                if (str.equals("wrap")) {
                    c10 = 3;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                return g3.f.c(g3.f.f16481i);
            case 1:
                return new g3.f(g3.f.f16483k);
            case 2:
                return g3.f.c(g3.f.f16482j);
            case 3:
                return new g3.f(g3.f.f16481i);
            default:
                if (str.endsWith("%")) {
                    float parseFloat = Float.parseFloat(str.substring(0, str.indexOf(37))) / 100.0f;
                    g3.f fVar = new g3.f(g3.f.f16484l);
                    fVar.f16488c = parseFloat;
                    fVar.f16492g = true;
                    fVar.f16487b = 0;
                    return fVar;
                }
                if (str.contains(":")) {
                    g3.f fVar2 = new g3.f(g3.f.f16485m);
                    fVar2.f16490e = str;
                    fVar2.f16491f = g3.f.f16482j;
                    fVar2.f16492g = true;
                    return fVar2;
                }
                return b10;
        }
    }

    public static final w2.d n(Context context) {
        float f10 = context.getResources().getConfiguration().fontScale;
        float f11 = context.getResources().getDisplayMetrics().density;
        x2.a a10 = x2.b.a(f10);
        if (a10 == null) {
            a10 = new w2.l(f10);
        }
        return new w2.d(f11, f10, a10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x04b9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02c8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void n0(java.lang.String r36, c0.m0 r37, boolean r38, boolean r39, boolean r40, java.lang.String r41, java.lang.String r42, float r43, float r44, float r45, g1.o r46, zb.e r47, kotlin.jvm.functions.Function2 r48, kotlin.jvm.functions.Function2 r49, kotlin.jvm.functions.Function2 r50, kotlin.jvm.functions.Function2 r51, t0.n r52, int r53, int r54, int r55) {
        /*
            Method dump skipped, instructions count: 1214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.j.n0(java.lang.String, c0.m0, boolean, boolean, boolean, java.lang.String, java.lang.String, float, float, float, g1.o, zb.e, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, t0.n, int, int, int):void");
    }

    public static void n1(int i10, g3.k kVar, String str, f3.g gVar) {
        boolean z10;
        char c10;
        char c11;
        ArrayList D = gVar.D();
        g3.b b10 = kVar.b(str);
        if (i10 == 0) {
            kVar.d(0, str);
        } else {
            kVar.d(1, str);
        }
        if ((!kVar.f16505b) && i10 != 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        h3.g gVar2 = (h3.g) b10.f16440c;
        Iterator it = D.iterator();
        boolean z11 = false;
        boolean z12 = true;
        float f10 = s0.g.f34069a;
        while (it.hasNext()) {
            String str2 = (String) it.next();
            str2.getClass();
            switch (str2.hashCode()) {
                case -678927291:
                    if (str2.equals("percent")) {
                        c10 = 0;
                        break;
                    }
                    break;
                case 100571:
                    if (str2.equals("end")) {
                        c10 = 1;
                        break;
                    }
                    break;
                case 3317767:
                    if (str2.equals("left")) {
                        c10 = 2;
                        break;
                    }
                    break;
                case 108511772:
                    if (str2.equals("right")) {
                        c10 = 3;
                        break;
                    }
                    break;
                case 109757538:
                    if (str2.equals("start")) {
                        c10 = 4;
                        break;
                    }
                    break;
            }
            c10 = 65535;
            switch (c10) {
                case 0:
                    f3.a q10 = gVar.q(str2);
                    if (q10 == null) {
                        f10 = gVar.s(str2);
                        z11 = true;
                        z12 = true;
                        break;
                    } else {
                        if (q10.f15909e.size() > 1) {
                            String y10 = q10.y(0);
                            float r10 = q10.r(1);
                            y10.getClass();
                            switch (y10.hashCode()) {
                                case 100571:
                                    if (y10.equals("end")) {
                                        c11 = 0;
                                        break;
                                    }
                                    break;
                                case 3317767:
                                    if (y10.equals("left")) {
                                        c11 = 1;
                                        break;
                                    }
                                    break;
                                case 108511772:
                                    if (y10.equals("right")) {
                                        c11 = 2;
                                        break;
                                    }
                                    break;
                                case 109757538:
                                    if (y10.equals("start")) {
                                        c11 = 3;
                                        break;
                                    }
                                    break;
                            }
                            c11 = 65535;
                            switch (c11) {
                                case 0:
                                    z12 = !z10;
                                    break;
                                case 1:
                                    z12 = true;
                                    f10 = r10;
                                    z11 = true;
                                    continue;
                                case 2:
                                    z12 = false;
                                    break;
                                case 3:
                                    z12 = z10;
                                    break;
                            }
                            f10 = r10;
                        }
                        z11 = true;
                        break;
                    }
                    break;
                case 1:
                    f10 = kVar.f16504a.m(gVar.s(str2));
                    z12 = !z10;
                    break;
                case 2:
                    f10 = kVar.f16504a.m(gVar.s(str2));
                    z12 = true;
                    break;
                case 3:
                    f10 = kVar.f16504a.m(gVar.s(str2));
                    z12 = false;
                    break;
                case 4:
                    f10 = kVar.f16504a.m(gVar.s(str2));
                    z12 = z10;
                    break;
            }
        }
        if (z11) {
            if (z12) {
                gVar2.f17946d = -1;
                gVar2.f17947e = -1;
                gVar2.f17948f = f10;
                return;
            } else {
                gVar2.f17946d = -1;
                gVar2.f17947e = -1;
                gVar2.f17948f = 1.0f - f10;
                return;
            }
        }
        if (z12) {
            gVar2.f17946d = gVar2.f17943a.c(Float.valueOf(f10));
            gVar2.f17947e = -1;
            gVar2.f17948f = s0.g.f34069a;
            return;
        }
        Float valueOf = Float.valueOf(f10);
        gVar2.f17946d = -1;
        gVar2.f17947e = gVar2.f17943a.c(valueOf);
        gVar2.f17948f = s0.g.f34069a;
    }

    public static w2.c o() {
        return new w2.c(1.0f, 1.0f);
    }

    public static final void o0(g1.o oVar, String str, h7.b listOfSearchFollowersPagingItems, h7.b listOfSeachUniversalPagingItems, List list, Function2 onRecyclerItemClicked, t0.n nVar, int i10, int i11) {
        g1.o oVar2;
        String str2;
        int i12;
        Intrinsics.checkNotNullParameter(listOfSearchFollowersPagingItems, "listOfSearchFollowersPagingItems");
        Intrinsics.checkNotNullParameter(listOfSeachUniversalPagingItems, "listOfSeachUniversalPagingItems");
        Intrinsics.checkNotNullParameter(onRecyclerItemClicked, "onRecyclerItemClicked");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(124610250);
        if ((i11 & 1) != 0) {
            oVar2 = g1.l.f16404b;
        } else {
            oVar2 = oVar;
        }
        if ((i11 & 2) != 0) {
            i12 = i10 & (-113);
            str2 = hl.f.c1(R.string.search_term_text, rVar);
        } else {
            str2 = str;
            i12 = i10;
        }
        m0 a10 = p0.a(rVar);
        rVar.b0(19282378);
        Object Q = rVar.Q();
        to.e eVar = t0.m.f35080a;
        o3 o3Var = o3.f35116a;
        if (Q == eVar) {
            Q = t0.t.n0(Boolean.FALSE, o3Var);
            rVar.k0(Q);
        }
        g1 g1Var = (g1) Q;
        Object h10 = v.e.h(rVar, false, 19285258);
        if (h10 == eVar) {
            h10 = t0.t.n0(Boolean.FALSE, o3Var);
            rVar.k0(h10);
        }
        g1 g1Var2 = (g1) h10;
        rVar.s(false);
        iu.v vVar = new iu.v();
        vVar.f20556a = true;
        iu.v vVar2 = new iu.v();
        vVar2.f20556a = true;
        g7.z0 z0Var = listOfSearchFollowersPagingItems.c().f16682a;
        x0 x0Var = x0.f17118b;
        if (!Intrinsics.a(z0Var, x0Var) && !Intrinsics.a(listOfSeachUniversalPagingItems.c().f16682a, x0Var)) {
            rVar.b0(598742217);
            float f10 = 16;
            qu.i0.c(androidx.compose.animation.a.a(androidx.compose.foundation.layout.a.x(oVar2, f10, s0.g.f34069a, f10, s0.g.f34069a, 10)), a10, null, false, null, null, null, false, new pd.i0(listOfSearchFollowersPagingItems, listOfSeachUniversalPagingItems, list, onRecyclerItemClicked, vVar2, g1Var2, vVar, g1Var, oVar2, str2), rVar, 0, 252);
            rVar.s(false);
        } else {
            rVar.b0(598168004);
            b0.g gVar = b0.n.f2939e;
            g1.e eVar2 = g1.a.f16392n;
            int i13 = (i12 & 14) | 432;
            rVar.b0(-483455358);
            int i14 = i13 >> 3;
            l1 a11 = y.a(gVar, eVar2, rVar, (i14 & 112) | (i14 & 14));
            rVar.b0(-1323940314);
            int i15 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(oVar2);
            int i16 = ((((i13 << 3) & 112) << 9) & 7168) | 6;
            if (rVar.f35166a instanceof t0.f) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t0.t.v0(rVar, a11, c2.k.f7749e);
                t0.t.v0(rVar, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i15))) {
                    nn.d.s(i15, rVar, i15, iVar);
                }
                nn.d.q((i16 >> 3) & 112, j10, new m2(rVar), rVar, 2058660585);
                l5.a(null, 0L, s0.g.f34069a, 0L, 0, rVar, 0, 31);
                v.e.y(rVar, false, true, false, false);
                Boolean bool = Boolean.FALSE;
                g1Var.setValue(bool);
                g1Var2.setValue(bool);
                rVar.s(false);
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new r0.j0(oVar2, str2, listOfSearchFollowersPagingItems, listOfSeachUniversalPagingItems, list, onRecyclerItemClicked, i10, i11, 2);
        }
    }

    public static void o1(g3.k kVar, h.c cVar, String str, f3.g gVar) {
        g3.b b10 = kVar.b(str);
        if (b10.f16443d0 == null) {
            b10.f16443d0 = new g3.f(g3.f.f16481i);
        }
        if (b10.f16445e0 == null) {
            b10.f16445e0 = new g3.f(g3.f.f16481i);
        }
        Iterator it = gVar.D().iterator();
        while (it.hasNext()) {
            C0(cVar, gVar, b10, kVar, (String) it.next());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x009c  */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r13v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void p(java.lang.String r42, java.lang.String r43, java.lang.String r44, g1.o r45, t0.n r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 937
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.j.p(java.lang.String, java.lang.String, java.lang.String, g1.o, t0.n, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0168  */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v2, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void p0(java.lang.String r25, java.lang.String r26, t0.l3 r27, kotlin.jvm.functions.Function2 r28, t0.n r29, int r30, int r31) {
        /*
            Method dump skipped, instructions count: 909
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.j.p0(java.lang.String, java.lang.String, t0.l3, kotlin.jvm.functions.Function2, t0.n, int, int):void");
    }

    public static final synchronized void p1(ek.u eventsToPersist) {
        synchronized (j.class) {
            if (sl.a.b(j.class)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(eventsToPersist, "eventsToPersist");
                t Q = g.Q();
                for (b bVar : eventsToPersist.C()) {
                    u m10 = eventsToPersist.m(bVar);
                    if (m10 != null) {
                        Q.a(bVar, m10.c());
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                }
                g.Y(Q);
            } catch (Throwable th2) {
                sl.a.a(j.class, th2);
            }
        }
    }

    public static final void q(boolean z10, boolean z11, float f10, float f11, float f12, t0.n nVar, int i10) {
        int i11;
        boolean z12;
        boolean z13;
        float f13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        g1.o oVar;
        t0.r rVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        t0.r rVar2 = (t0.r) nVar;
        rVar2.c0(-1403531717);
        if ((i10 & 14) == 0) {
            if (rVar2.i(z10)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i11 = i16 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (rVar2.i(z11)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i11 |= i15;
        }
        if ((i10 & 896) == 0) {
            if (rVar2.e(f10)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i11 |= i14;
        }
        if ((i10 & 7168) == 0) {
            if (rVar2.e(f11)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i13;
        }
        if ((i10 & 57344) == 0) {
            if (rVar2.e(f12)) {
                i12 = 16384;
            } else {
                i12 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i11 |= i12;
        }
        if ((46811 & i11) == 9362 && rVar2.G()) {
            rVar2.V();
            rVar = rVar2;
        } else {
            rVar2.b0(1550357554);
            int i17 = i11 & 896;
            boolean z18 = true;
            if (i17 == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            int i18 = 57344 & i11;
            if (i18 == 16384) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z19 = z12 | z13;
            Object Q = rVar2.Q();
            to.e eVar = t0.m.f35080a;
            if (z19 || Q == eVar) {
                if (f10 > f12) {
                    f13 = f10;
                } else {
                    f13 = f12;
                }
                Q = Float.valueOf(f13);
                rVar2.k0(Q);
            }
            float floatValue = ((Number) Q).floatValue();
            rVar2.s(false);
            float f14 = kj.f.f(kp.j.R(4, rVar2), rVar2);
            float f15 = kj.f.f(kp.j.R(4, rVar2), rVar2);
            long e10 = w0.e(R.color.transaction_success, rVar2);
            long e11 = w0.e(R.color.red_EB3B3B, rVar2);
            g1.o a10 = h2.l.a(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.e(g1.l.f16404b, 1.0f), kp.j.R(2, rVar2)), false, zb.a.f42242y);
            rVar2.b0(1550375669);
            boolean e12 = rVar2.e(f14) | rVar2.e(f15);
            if (i17 == 256) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z20 = z14 | e12;
            if ((i11 & 7168) == 2048) {
                z15 = true;
            } else {
                z15 = false;
            }
            boolean z21 = z20 | z15;
            if (i18 == 16384) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean z22 = z16 | z21;
            if ((i11 & 14) == 4) {
                z17 = true;
            } else {
                z17 = false;
            }
            boolean z23 = z22 | z17;
            if ((i11 & 112) != 32) {
                z18 = false;
            }
            boolean e13 = z23 | z18 | rVar2.e(floatValue) | rVar2.g(e10) | rVar2.g(e11);
            Object Q2 = rVar2.Q();
            if (!e13 && Q2 != eVar) {
                oVar = a10;
                rVar = rVar2;
            } else {
                oVar = a10;
                rVar = rVar2;
                zb.l lVar = new zb.l(f14, f15, f10, f11, f12, z10, z11, floatValue, e10, e11);
                rVar.k0(lVar);
                Q2 = lVar;
            }
            rVar.s(false);
            androidx.compose.foundation.a.b(oVar, (Function1) Q2, rVar, 0);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new zb.m(z10, z11, f10, f11, f12, i10);
        }
    }

    public static final void q0(t0.n nVar, int i10) {
        t0.r rVar;
        int i11;
        t0.r rVar2 = (t0.r) nVar;
        rVar2.c0(949155145);
        if (i10 == 0 && rVar2.G()) {
            rVar2.V();
            rVar = rVar2;
            i11 = 0;
        } else {
            g1.l lVar = g1.l.f16404b;
            g1.o t10 = androidx.compose.foundation.layout.a.t(androidx.compose.foundation.layout.d.f1286c, kp.j.R(16, rVar2));
            b0.g gVar = b0.n.f2939e;
            g1.e eVar = g1.a.f16392n;
            rVar2.b0(-483455358);
            l1 a10 = y.a(gVar, eVar, rVar2, 54);
            rVar2.b0(-1323940314);
            int i12 = rVar2.P;
            r1 o10 = rVar2.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(t10);
            if (rVar2.f35166a instanceof t0.f) {
                rVar2.e0();
                if (rVar2.O) {
                    rVar2.n(jVar);
                } else {
                    rVar2.n0();
                }
                t0.t.v0(rVar2, a10, c2.k.f7749e);
                t0.t.v0(rVar2, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i12))) {
                    nn.d.s(i12, rVar2, i12, iVar);
                }
                nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
                androidx.compose.foundation.a.c(w0.u(R.drawable.ic_no_posts_v2, rVar2, 6), null, h2.l.a(androidx.compose.foundation.layout.d.m(lVar, kp.j.R(200, rVar2)), false, lb.a.f24404v), null, null, s0.g.f34069a, null, rVar2, 56, 120);
                n3.a(hl.f.c1(R.string.no_comments_at_moment, rVar2), h2.l.a(androidx.compose.foundation.layout.a.x(lVar, s0.g.f34069a, kp.j.R(16, rVar2), s0.g.f34069a, s0.g.f34069a, 13), false, lb.a.f24405w), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new g0(w0.e(R.color.colorPrimarySeparator, rVar2), kp.j.S(16, rVar2, 6), null, jh.c.f21378g, 3, 0L, null, 16744412), rVar2, 0, 0, 65532);
                n3.a(hl.f.c1(R.string.stay_tuned, rVar2), h2.l.a(androidx.compose.foundation.layout.a.x(lVar, s0.g.f34069a, kp.j.R(6, rVar2), s0.g.f34069a, s0.g.f34069a, 13), false, lb.a.f24406x), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new g0(w0.e(R.color.colorPrimarySeparator, rVar2), kp.j.S(12, rVar2, 6), null, jh.c.f21377f, 3, 0L, null, 16744412), rVar2, 0, 0, 65532);
                rVar = rVar2;
                i11 = 0;
                rVar.s(false);
                v.e.x(rVar, true, false, false);
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new lb.u(i10, i11);
        }
    }

    public static final synchronized void q1(b accessTokenAppIdPair, u appEvents) {
        synchronized (j.class) {
            if (sl.a.b(j.class)) {
                return;
            }
            try {
                Intrinsics.checkNotNullParameter(accessTokenAppIdPair, "accessTokenAppIdPair");
                Intrinsics.checkNotNullParameter(appEvents, "appEvents");
                t Q = g.Q();
                Q.a(accessTokenAppIdPair, appEvents.c());
                g.Y(Q);
            } catch (Throwable th2) {
                sl.a.a(j.class, th2);
            }
        }
    }

    public static final void r(g1.o oVar, String searchTerm, t0.n nVar, int i10, int i11) {
        g1.o oVar2;
        int i12;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(searchTerm, "searchTerm");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-727106038);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
            oVar2 = oVar;
        } else if ((i10 & 14) == 0) {
            oVar2 = oVar;
            if (rVar.h(oVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i10 | i13;
        } else {
            oVar2 = oVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.h(searchTerm)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 91) == 18 && rVar.G()) {
            rVar.V();
        } else {
            g1.l lVar = g1.l.f16404b;
            if (i15 != 0) {
                oVar2 = lVar;
            }
            g1.o g10 = oVar2.g(androidx.compose.foundation.layout.d.f1286c);
            b0.g gVar = b0.n.f2939e;
            g1.e eVar = g1.a.f16392n;
            rVar.b0(-483455358);
            l1 a10 = y.a(gVar, eVar, rVar, 54);
            rVar.b0(-1323940314);
            int i16 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(g10);
            if (rVar.f35166a instanceof t0.f) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t0.t.v0(rVar, a10, c2.k.f7749e);
                t0.t.v0(rVar, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i16))) {
                    nn.d.s(i16, rVar, i16, iVar);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                androidx.compose.foundation.a.c(w0.u(R.drawable.ic_bull_in_chair, rVar, 6), "No followers", null, null, null, s0.g.f34069a, null, rVar, 56, 124);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 16), rVar);
                al.d.C(hl.f.d1(R.string.no_results_for, new Object[]{searchTerm}, rVar), null, w0.e(R.color.black_1A1A1A, rVar), e1(12), null, null, jh.c.f21375d, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 1575936, 0, 130994);
                al.d.C(v.e.i(lVar, 4, rVar, R.string.make_sure_to_type_correct_name, rVar), null, w0.e(R.color.black_1A1A1A, rVar), e1(12), null, null, jh.c.f21372a, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 1575936, 0, 130994);
                v.e.y(rVar, false, true, false, false);
            } else {
                al.d.v0();
                throw null;
            }
        }
        g1.o oVar3 = oVar2;
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new c0.o(i10, i11, 5, oVar3, searchTerm);
        }
    }

    public static final void r0(g1.o oVar, t0.n nVar, int i10, int i11) {
        g1.o oVar2;
        int i12;
        int i13;
        g1.o oVar3;
        t0.r rVar;
        t0.r rVar2 = (t0.r) nVar;
        rVar2.c0(-1675198796);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
            oVar2 = oVar;
        } else if ((i10 & 14) == 0) {
            oVar2 = oVar;
            if (rVar2.h(oVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            oVar2 = oVar;
            i12 = i10;
        }
        if ((i12 & 11) == 2 && rVar2.G()) {
            rVar2.V();
            rVar = rVar2;
        } else {
            g1.l lVar = g1.l.f16404b;
            if (i14 != 0) {
                oVar3 = lVar;
            } else {
                oVar3 = oVar2;
            }
            g1.o t10 = androidx.compose.foundation.layout.a.t(oVar3, kp.j.R(16, rVar2));
            b0.g gVar = b0.n.f2939e;
            g1.e eVar = g1.a.f16392n;
            rVar2.b0(-483455358);
            l1 a10 = y.a(gVar, eVar, rVar2, 54);
            rVar2.b0(-1323940314);
            int i15 = rVar2.P;
            r1 o10 = rVar2.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(t10);
            if (rVar2.f35166a instanceof t0.f) {
                rVar2.e0();
                if (rVar2.O) {
                    rVar2.n(jVar);
                } else {
                    rVar2.n0();
                }
                t0.t.v0(rVar2, a10, c2.k.f7749e);
                t0.t.v0(rVar2, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i15))) {
                    nn.d.s(i15, rVar2, i15, iVar);
                }
                nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
                al.d.z(R.drawable.ic_no_posts_v3, null, h2.l.a(androidx.compose.foundation.layout.d.m(lVar, kp.j.R(200, rVar2)), false, tb.b.f35690l), 0L, rVar2, 6, 10);
                n3.a(hl.f.c1(R.string.no_posts_at_moment_v3, rVar2), h2.l.a(androidx.compose.foundation.layout.a.x(lVar, s0.g.f34069a, kp.j.R(16, rVar2), s0.g.f34069a, s0.g.f34069a, 13), false, tb.b.f35691m), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new g0(n1.t.f28170b, kp.j.S(22, rVar2, 6), null, jh.c.f21377f, 3, 0L, null, 16744412), rVar2, 0, 0, 65532);
                rVar = rVar2;
                v.e.y(rVar, false, true, false, false);
                oVar2 = oVar3;
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new i0.c(oVar2, i10, i11, 5);
        }
    }

    public static final void r1(View view, androidx.lifecycle.t tVar) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.setTag(R.id.view_tree_lifecycle_owner, tVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x026d, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r0.Q(), java.lang.Integer.valueOf(r7)) == false) goto L151;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0241  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void s(float r40, boolean r41, float r42, float r43, java.lang.String r44, zb.e r45, g1.o r46, boolean r47, kotlin.jvm.functions.Function2 r48, t0.n r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 1139
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.j.s(float, boolean, float, float, java.lang.String, zb.e, g1.o, boolean, kotlin.jvm.functions.Function2, t0.n, int, int):void");
    }

    public static final void s0(Context context, String str) {
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        String L = o.L(str);
        if (L != null) {
            Intent intent = new Intent(context, (Class<?>) YoutubeVideoFullScreenActivity.class);
            intent.putExtra("YOUTUBE_VIDEO_URL", L);
            intent.putExtra("YOUTUBE_VIDEO_ELAPSED_TIME", s0.g.f34069a);
            intent.putExtra("YOUTUBE_VIDEO_IS_LANDSCAPE", false);
            context.startActivity(intent);
        }
    }

    public static final void s1(ImageView imageView, ChatMessage chatMessage, ImageView stickerView) {
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        Intrinsics.checkNotNullParameter(stickerView, "stickerView");
        if (chatMessage != null) {
            if (chatMessage.getMedia() == null) {
                imageView.setVisibility(8);
                return;
            }
            String Y0 = Y0(chatMessage);
            if (Intrinsics.a(Y0, "DOCUMENT")) {
                imageView.setVisibility(0);
                imageView.setImageDrawable(r3.k.getDrawable(imageView.getContext(), R.drawable.ic_pdf_file_v2));
                stickerView.setVisibility(8);
            } else if (Intrinsics.a(Y0, "STICKER")) {
                imageView.setVisibility(8);
                stickerView.setVisibility(0);
                qu.i0.p(imageView.getContext(), chatMessage.getMedia().getUrl(), stickerView, null);
            } else {
                stickerView.setVisibility(8);
                imageView.setVisibility(0);
                qu.i0.p(imageView.getContext(), chatMessage.getMedia().getUrl(), imageView, null);
            }
        }
    }

    public static final void t(String id2, j2.e title, String description, q1.b icon, boolean z10, g1.o oVar, t0.n nVar, int i10, int i11) {
        g1.o oVar2;
        boolean z11;
        boolean z12;
        boolean z13;
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(icon, "icon");
        t0.r rVar = (t0.r) nVar;
        rVar.c0(-1256843408);
        int i12 = i11 & 32;
        g1.l lVar = g1.l.f16404b;
        if (i12 != 0) {
            oVar2 = lVar;
        } else {
            oVar2 = oVar;
        }
        g1.o e10 = androidx.compose.foundation.layout.d.e(oVar2, 1.0f);
        g1.f fVar = g1.a.f16388j;
        rVar.b0(693286680);
        l1 a10 = o1.a(b0.n.f2935a, fVar, rVar, 48);
        rVar.b0(-1323940314);
        int i13 = rVar.P;
        r1 o10 = rVar.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(e10);
        boolean z14 = rVar.f35166a instanceof t0.f;
        if (z14) {
            rVar.e0();
            if (rVar.O) {
                rVar.n(jVar);
            } else {
                rVar.n0();
            }
            c2.i iVar = c2.k.f7749e;
            t0.t.v0(rVar, a10, iVar);
            c2.i iVar2 = c2.k.f7748d;
            t0.t.v0(rVar, o10, iVar2);
            c2.i iVar3 = c2.k.f7750f;
            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i13))) {
                nn.d.s(i13, rVar, i13, iVar3);
            }
            nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
            g1.o m10 = androidx.compose.foundation.layout.d.m(androidx.compose.foundation.layout.a.x(lVar, s0.g.f34069a, kp.j.R(3, rVar), s0.g.f34069a, s0.g.f34069a, 13), kp.j.R(18, rVar));
            rVar.b0(1021969698);
            int i14 = (i10 & 14) ^ 6;
            if ((i14 > 4 && rVar.h(id2)) || (i10 & 6) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object Q = rVar.Q();
            to.e eVar = t0.m.f35080a;
            int i15 = 2;
            if (z11 || Q == eVar) {
                Q = new x.i1(id2, i15);
                rVar.k0(Q);
            }
            rVar.s(false);
            g1.o oVar3 = oVar2;
            a1.a(icon, null, h2.l.a(m10, false, (Function1) Q), n1.t.f28177i, rVar, 3128, 0);
            rVar.b0(-483455358);
            l1 a11 = y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
            rVar.b0(-1323940314);
            int i16 = rVar.P;
            r1 o11 = rVar.o();
            b1.c j11 = androidx.compose.ui.layout.a.j(lVar);
            if (z14) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t0.t.v0(rVar, a11, iVar);
                t0.t.v0(rVar, o11, iVar2);
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i16))) {
                    nn.d.s(i16, rVar, i16, iVar3);
                }
                nn.d.q(0, j11, new m2(rVar), rVar, 2058660585);
                g1.o v10 = androidx.compose.foundation.layout.a.v(lVar, kp.j.R(8, rVar), s0.g.f34069a, 2);
                rVar.b0(220658850);
                if ((i14 > 4 && rVar.h(id2)) || (i10 & 6) == 4) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                Object Q2 = rVar.Q();
                if (z12 || Q2 == eVar) {
                    Q2 = new x.i1(id2, 3);
                    rVar.k0(Q2);
                }
                rVar.s(false);
                n3.b(title, h2.l.a(v10, false, (Function1) Q2), 0L, kp.j.S(18, rVar, 6), null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, rVar, (i10 >> 3) & 14, 0, 262132);
                g1.o x10 = androidx.compose.foundation.layout.a.x(lVar, kp.j.R(8, rVar), s0.g.f34069a, kp.j.R(8, rVar), s0.g.f34069a, 10);
                rVar.b0(220669544);
                int i17 = 4;
                if ((i14 > 4 && rVar.h(id2)) || (i10 & 6) == 4) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                Object Q3 = rVar.Q();
                if (z13 || Q3 == eVar) {
                    Q3 = new x.i1(id2, i17);
                    rVar.k0(Q3);
                }
                rVar.s(false);
                n3.a(description, h2.l.a(x10, false, (Function1) Q3), n1.t.f28170b, kp.j.S(14, rVar, 6), null, null, jh.c.f21381j, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, ((i10 >> 6) & 14) | 1573248, 0, 130992);
                if (z10) {
                    dp.b.s(androidx.compose.foundation.layout.a.w(lVar, kp.j.R(8, rVar), kp.j.R(6, rVar), kp.j.R(8, rVar), kp.j.R(6, rVar)), (float) 0.5d, androidx.compose.ui.graphics.a.d(4293059298L), rVar, 432, 0);
                }
                v.e.y(rVar, false, true, false, false);
                x1 t10 = da.e.t(rVar, false, true, false, false);
                if (t10 != null) {
                    t10.f35245d = new v.m(id2, title, description, icon, z10, oVar3, i10, i11);
                    return;
                }
                return;
            }
            al.d.v0();
            throw null;
        }
        al.d.v0();
        throw null;
    }

    public static final FnoOrderInfoResponseDto t0(l3 l3Var) {
        return (FnoOrderInfoResponseDto) l3Var.getValue();
    }

    public static final void t1(TextView textView, ChatMessage chatMessage) {
        String string;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (chatMessage != null) {
            String message = chatMessage.getMessage();
            if (message != null && message.length() != 0) {
                textView.setVisibility(8);
                return;
            }
            String Y0 = Y0(chatMessage);
            switch (Y0.hashCode()) {
                case -1172269795:
                    if (Y0.equals("STICKER")) {
                        textView.setVisibility(8);
                        return;
                    }
                    return;
                case 69775675:
                    if (Y0.equals("IMAGE")) {
                        textView.setVisibility(0);
                        textView.setText(textView.getContext().getString(R.string.photo_text));
                        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(r3.k.getDrawable(textView.getContext(), R.drawable.ic_media_camera_mini), (Drawable) null, (Drawable) null, (Drawable) null);
                        return;
                    }
                    return;
                case 81665115:
                    if (Y0.equals("VIDEO")) {
                        textView.setVisibility(0);
                        textView.setText(textView.getContext().getString(R.string.video_text));
                        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(r3.k.getDrawable(textView.getContext(), R.drawable.ic_media_video_mini), (Drawable) null, (Drawable) null, (Drawable) null);
                        return;
                    }
                    return;
                case 1644347675:
                    if (Y0.equals("DOCUMENT")) {
                        textView.setVisibility(0);
                        Media media = chatMessage.getMedia();
                        if (media == null || (string = media.getFile_name()) == null) {
                            string = textView.getContext().getString(R.string.pdf_label);
                        }
                        textView.setText(string);
                        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(r3.k.getDrawable(textView.getContext(), R.drawable.ic_media_pdf_mini), (Drawable) null, (Drawable) null, (Drawable) null);
                        return;
                    }
                    return;
                default:
                    return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0185, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r1.Q(), java.lang.Integer.valueOf(r6)) == false) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void u(java.util.List r48, java.util.List r49, kotlin.jvm.functions.Function2 r50, t0.n r51, int r52) {
        /*
            Method dump skipped, instructions count: 1382
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.j.u(java.util.List, java.util.List, kotlin.jvm.functions.Function2, t0.n, int):void");
    }

    public static final boolean u0(g1 g1Var) {
        return ((Boolean) g1Var.getValue()).booleanValue();
    }

    public static final void u1(TextView textView, ChatMessage chatMessage) {
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (chatMessage != null) {
            String message = chatMessage.getMessage();
            if (message != null && message.length() > 0) {
                textView.setVisibility(0);
                textView.setText(chatMessage.getMessage());
            } else {
                textView.setVisibility(8);
            }
        }
    }

    public static final void v(g1.o oVar, t0.n nVar, int i10, int i11) {
        int i12;
        int i13;
        t0.r rVar = (t0.r) nVar;
        rVar.c0(1055700418);
        int i14 = i11 & 1;
        int i15 = 2;
        if (i14 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.h(oVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i12 & 11) == 2 && rVar.G()) {
            rVar.V();
        } else {
            if (i14 != 0) {
                oVar = g1.l.f16404b;
            }
            pp.b.b(androidx.compose.foundation.layout.d.e(oVar, 1.0f), h0.h.b(kp.j.R(8, rVar)), n1.t.f28173e, null, s0.g.f34069a, qb.b.f31886a, rVar, 1573248, 56);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new i0.c(oVar, i10, i11, i15);
        }
    }

    public static final boolean v0(g1 g1Var) {
        return ((Boolean) g1Var.getValue()).booleanValue();
    }

    public static final void v1(TextView textView, ChatMessage chatMessage) {
        Unit unit;
        Long serverTime;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        if (chatMessage != null && (serverTime = chatMessage.getServerTime()) != null) {
            long longValue = serverTime.longValue();
            textView.setVisibility(0);
            String o10 = hv.g.v(hv.e.n(longValue / CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT), hv.q.p()).o(jv.a.b("hh:mm a"));
            Intrinsics.checkNotNullExpressionValue(o10, "format(...)");
            textView.setText(o10);
            unit = Unit.f23355a;
        } else {
            unit = null;
        }
        if (unit == null) {
            textView.setVisibility(8);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x051b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void w(gb.b r46, kotlin.jvm.functions.Function1 r47, kotlin.jvm.functions.Function1 r48, g1.o r49, t0.n r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 1311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.j.w(gb.b, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, g1.o, t0.n, int, int):void");
    }

    public static final boolean w0(g1 g1Var) {
        return ((Boolean) g1Var.getValue()).booleanValue();
    }

    public static final void w1(final TextView textView, final Spannable fullText, final int i10, final boolean z10, final int i11, final int i12, final Function1 function1) {
        String string;
        Intrinsics.checkNotNullParameter(textView, "<this>");
        Intrinsics.checkNotNullParameter(fullText, "fullText");
        int width = textView.getWidth();
        if (width <= 0) {
            textView.post(new Runnable() { // from class: ue.t
                @Override // java.lang.Runnable
                public final void run() {
                    TextView this_setResizableTextView = textView;
                    Spannable fullText2 = fullText;
                    int i13 = i10;
                    boolean z11 = z10;
                    int i14 = i11;
                    int i15 = i12;
                    Function1 function12 = function1;
                    Intrinsics.checkNotNullParameter(this_setResizableTextView, "$this_setResizableTextView");
                    Intrinsics.checkNotNullParameter(fullText2, "$fullText");
                    yk.j.w1(this_setResizableTextView, fullText2, i13, z11, i14, i15, function12);
                }
            });
            return;
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        String n10 = kotlin.text.s.n(fullText.toString(), "\r\n", "\n", false);
        StaticLayout staticLayout = new StaticLayout(n10, textView.getPaint(), (width - textView.getPaddingLeft()) - textView.getPaddingRight(), Layout.Alignment.ALIGN_NORMAL, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
        if (staticLayout.getLineCount() > i10 && n10.length() != 0) {
            int i13 = i10 - 1;
            int lineEnd = staticLayout.getLineEnd(i13);
            if (z10) {
                string = textView.getResources().getString(i11);
            } else {
                string = textView.getResources().getString(i12);
            }
            Intrinsics.c(string);
            int length = lineEnd - (string.length() / 2);
            if (length <= 0) {
                Spanned a10 = b4.d.a(kotlin.text.s.n(n10, "\n", "<br/>", false), 63);
                Intrinsics.checkNotNullExpressionValue(a10, "fromHtml(...)");
                textView.setText(B0(textView, fullText, i10, a10, null, z10, i11, i12, function1));
                textView.setText(textView.getText(), TextView.BufferType.SPANNABLE);
                return;
            }
            if (!z10) {
                Spanned a11 = b4.d.a(kotlin.text.s.n(n10, "\n", "<br/>", false), 63);
                Intrinsics.checkNotNullExpressionValue(a11, "fromHtml(...)");
                textView.setText(B0(textView, fullText, i10, a11, string, z10, i11, i12, function1));
                textView.setText(textView.getText(), TextView.BufferType.SPANNABLE);
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            }
            String substring = n10.substring(staticLayout.getLineStart(i13), staticLayout.getLineEnd(i13));
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            kotlin.text.s.n(substring, "\n", HttpUrl.FRAGMENT_ENCODE_SET, false);
            kotlin.text.y.a0(length, n10);
            Spanned a12 = b4.d.a(kotlin.text.s.n(kotlin.text.y.a0(length, n10), "\n", "<br/>", false), 63);
            Intrinsics.checkNotNullExpressionValue(a12, "fromHtml(...)");
            textView.setText(B0(textView, fullText, i10, a12, string, z10, i11, i12, function1));
            textView.setText(textView.getText(), TextView.BufferType.SPANNABLE);
            textView.setMovementMethod(LinkMovementMethod.getInstance());
            return;
        }
        Spanned a13 = b4.d.a(kotlin.text.s.n(n10, "\n", "<br/>", false), 63);
        Intrinsics.checkNotNullExpressionValue(a13, "fromHtml(...)");
        textView.setText(B0(textView, fullText, i10, a13, null, z10, i11, i12, function1));
        textView.setText(textView.getText(), TextView.BufferType.SPANNABLE);
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0183 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01a7 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01ce A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0217  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void x(boolean r55, boolean r56, int r57, int r58, boolean r59, boolean r60, boolean r61, g1.o r62, kotlin.jvm.functions.Function1 r63, kotlin.jvm.functions.Function0 r64, kotlin.jvm.functions.Function0 r65, t0.n r66, int r67, int r68, int r69) {
        /*
            Method dump skipped, instructions count: 1431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.j.x(boolean, boolean, int, int, boolean, boolean, boolean, g1.o, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, t0.n, int, int, int):void");
    }

    public static final boolean x0(g1 g1Var) {
        return ((Boolean) g1Var.getValue()).booleanValue();
    }

    public static void x1(Drawable drawable, int i10) {
        v3.b.g(drawable, i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x030d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0352 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0373 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x038a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0615  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0306  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017a A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01d6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x020e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0231 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x025c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02c2  */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void y(hb.u r40, t0.l3 r41, sb.c r42, kotlin.jvm.functions.Function2 r43, kotlin.jvm.functions.Function2 r44, kotlin.jvm.functions.Function1 r45, kotlin.jvm.functions.Function1 r46, kotlin.jvm.functions.Function2 r47, c0.m0 r48, t0.n r49, int r50, int r51) {
        /*
            Method dump skipped, instructions count: 1561
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.j.y(hb.u, t0.l3, sb.c, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function2, c0.m0, t0.n, int, int):void");
    }

    public static final boolean y0(l3 l3Var) {
        return ((Boolean) l3Var.getValue()).booleanValue();
    }

    public static void y1(Drawable drawable, ColorStateList colorStateList) {
        v3.b.h(drawable, colorStateList);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x03ac, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r7.Q(), java.lang.Integer.valueOf(r8)) == false) goto L227;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0314 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x037c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x05dc  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0130 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0190 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x021c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0246 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0273 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02a4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02c6 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02f4 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void z(java.lang.String r45, c0.m0 r46, java.util.List r47, java.lang.String r48, java.lang.String r49, hb.i r50, kotlin.jvm.functions.Function2 r51, kotlin.jvm.functions.Function0 r52, t0.n r53, int r54, int r55) {
        /*
            Method dump skipped, instructions count: 1504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yk.j.z(java.lang.String, c0.m0, java.util.List, java.lang.String, java.lang.String, hb.i, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function0, t0.n, int, int):void");
    }

    public static final double z0(l3 l3Var) {
        return ((Number) l3Var.getValue()).doubleValue();
    }

    public static void z1(Drawable drawable, PorterDuff.Mode mode) {
        v3.b.i(drawable, mode);
    }
}
