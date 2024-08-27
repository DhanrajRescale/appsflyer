package dp;

import a2.y0;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.semantics.ClearAndSetSemanticsElement;
import androidx.fragment.app.d1;
import androidx.fragment.app.j0;
import b0.i1;
import b0.l1;
import b0.o1;
import b0.y;
import c0.m0;
import c0.p0;
import com.assetgro.stockgro.data.AnalyticEvent;
import com.assetgro.stockgro.data.model.homedata.Analytics;
import com.assetgro.stockgro.data.model.homedata.ListItem;
import com.assetgro.stockgro.data.model.homedata.Widget;
import com.assetgro.stockgro.feature_market.data.remote.OptionValue;
import com.assetgro.stockgro.feature_market.data.remote.PeriodicPnl;
import com.assetgro.stockgro.missions.presentation.home.MissionsHomeViewModel;
import com.assetgro.stockgro.prod.R;
import com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailViewModel;
import com.assetgro.stockgro.ui.portfolio.holdings.PortfolioFnoHoldingsViewModel;
import com.assetgro.stockgro.ui.portfolio.orders.PortfolioFnoOrdersViewModel;
import com.assetgro.stockgro.ui.portfolio.orders.model.FnoOrderResponseData;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import d0.c0;
import d0.l0;
import d0.n0;
import d1.s;
import d2.s1;
import d2.w0;
import d4.b1;
import in.juspay.hypersdk.core.PaymentConstants;
import iu.w;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.UUID;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import ka.b0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import l0.v0;
import lb.u;
import lf.a0;
import lf.q;
import lf.v;
import m.a4;
import m0.o4;
import m0.p4;
import m0.z;
import okhttp3.HttpUrl;
import okhttp3.internal.http2.Http2;
import p0.o;
import p0.p;
import qu.f0;
import qu.i0;
import r0.a2;
import r0.a3;
import r0.b2;
import r0.d2;
import r0.h1;
import r0.j1;
import r0.k3;
import r0.o0;
import r0.x2;
import r0.y2;
import r0.z1;
import r0.z2;
import t.g0;
import t0.a1;
import t0.d0;
import t0.g1;
import t0.k1;
import t0.l3;
import t0.m2;
import t0.n;
import t0.n1;
import t0.o3;
import t0.p3;
import t0.r;
import t0.r1;
import t0.t;
import t0.u1;
import t0.x1;
import tu.s0;
import v.x;
import w.e0;
import w.t1;
import x.o2;
import x1.h0;
import y.q0;
import y.r0;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static a4 f14435a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f14436b = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0058  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void A(g1.o r13, float r14, long r15, t0.n r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.b.A(g1.o, float, long, t0.n, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003e -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A0(x1.m0 r7, yt.a r8) {
        /*
            boolean r0 = r8 instanceof l0.w
            if (r0 == 0) goto L13
            r0 = r8
            l0.w r0 = (l0.w) r0
            int r1 = r0.f23858c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23858c = r1
            goto L18
        L13:
            l0.w r0 = new l0.w
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f23857b
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f23858c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            x1.m0 r7 = r0.f23856a
            ut.n.b(r8)
            goto L41
        L29:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L31:
            ut.n.b(r8)
        L34:
            x1.l r8 = x1.l.f39878b
            r0.f23856a = r7
            r0.f23858c = r3
            java.lang.Object r8 = r7.a(r8, r0)
            if (r8 != r1) goto L41
            goto L5d
        L41:
            x1.k r8 = (x1.k) r8
            java.util.List r2 = r8.f39870a
            int r4 = r2.size()
            r5 = 0
        L4a:
            if (r5 >= r4) goto L5c
            java.lang.Object r6 = r2.get(r5)
            x1.t r6 = (x1.t) r6
            boolean r6 = t0.t.y(r6)
            if (r6 != 0) goto L59
            goto L34
        L59:
            int r5 = r5 + 1
            goto L4a
        L5c:
            r1 = r8
        L5d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.b.A0(x1.m0, yt.a):java.lang.Object");
    }

    public static void A1(j0 j0Var) {
        if (j0Var.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") != 0 || j0Var.checkSelfPermission("android.permission.CAMERA") != 0 || j0Var.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
            int checkSelfPermission = j0Var.checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE");
            int checkSelfPermission2 = j0Var.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE");
            int checkSelfPermission3 = j0Var.checkSelfPermission("android.permission.CAMERA");
            ArrayList arrayList = new ArrayList();
            if (checkSelfPermission != 0) {
                arrayList.add("android.permission.WRITE_EXTERNAL_STORAGE");
            }
            if (checkSelfPermission2 != 0) {
                arrayList.add("android.permission.READ_EXTERNAL_STORAGE");
            }
            if (checkSelfPermission3 != 0) {
                arrayList.add("android.permission.CAMERA");
            }
            if (!arrayList.isEmpty()) {
                j0Var.requestPermissions((String[]) arrayList.toArray(new String[arrayList.size()]), 1003);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:113:0x02ba, code lost:
    
        if (r8 == t0.m.f35080a) goto L212;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0301  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0239  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void B(e0.j0 r35, g1.o r36, b0.h1 r37, e0.n r38, int r39, float r40, g1.c r41, y.j3 r42, boolean r43, boolean r44, kotlin.jvm.functions.Function1 r45, w1.a r46, z.n r47, hu.d r48, t0.n r49, int r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.b.B(e0.j0, g1.o, b0.h1, e0.n, int, float, g1.c, y.j3, boolean, boolean, kotlin.jvm.functions.Function1, w1.a, z.n, hu.d, t0.n, int, int, int):void");
    }

    public static final boolean B0(int[] iArr, int i10) {
        if ((iArr[(i10 * 5) + 1] & 67108864) != 0) {
            return true;
        }
        return false;
    }

    public static void B1(AnimatorSet animatorSet, ArrayList arrayList) {
        int size = arrayList.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Animator animator = (Animator) arrayList.get(i10);
            j10 = Math.max(j10, animator.getDuration() + animator.getStartDelay());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j10);
        arrayList.add(0, ofInt);
        animatorSet.playTogether(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0073  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void C(int r22, int r23, g1.o r24, t0.n r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.b.C(int, int, g1.o, t0.n, int, int):void");
    }

    public static final int C0(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 4];
    }

    public static final z2 C1(boolean z10, n nVar, int i10, int i11) {
        boolean z11;
        d2 d2Var;
        boolean z12;
        boolean z13;
        boolean z14;
        r rVar = (r) nVar;
        rVar.b0(-1261794383);
        if ((i11 & 1) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        if ((i11 & 2) != 0) {
            d2Var = d2.f32375a;
        } else {
            d2Var = null;
        }
        d2 d2Var2 = d2Var;
        a3 a3Var = a3.f32324a;
        int i12 = (i10 & 14) | 384 | (i10 & 112);
        float f10 = y2.f32820a;
        rVar.b0(1032784200);
        w2.b bVar = (w2.b) rVar.m(s1.f13620e);
        Object[] objArr = {Boolean.valueOf(z11), d2Var2};
        o0 o0Var = o0.f32631j;
        r0 r0Var = new r0(bVar, d2Var2, z11);
        d1.r rVar2 = s.f13291a;
        d1.r rVar3 = new d1.r(o0Var, r0Var);
        rVar.b0(1097108455);
        boolean z15 = true;
        if ((((i12 & 14) ^ 6) > 4 && rVar.i(z11)) || (i12 & 6) == 4) {
            z12 = true;
        } else {
            z12 = false;
        }
        boolean h10 = z12 | rVar.h(bVar);
        if ((((i12 & 896) ^ 384) > 256 && rVar.h(a3Var)) || (i12 & 384) == 256) {
            z13 = true;
        } else {
            z13 = false;
        }
        boolean z16 = h10 | z13;
        if ((((i12 & 112) ^ 48) > 32 && rVar.h(d2Var2)) || (i12 & 48) == 32) {
            z14 = true;
        } else {
            z14 = false;
        }
        boolean z17 = z16 | z14;
        if ((((i12 & 7168) ^ 3072) <= 2048 || !rVar.i(false)) && (i12 & 3072) != 2048) {
            z15 = false;
        }
        boolean z18 = z17 | z15;
        Object Q = rVar.Q();
        if (z18 || Q == t0.m.f35080a) {
            Q = new x2(z11, bVar, a3Var, d2Var2, false);
            rVar.k0(Q);
        }
        rVar.s(false);
        z2 z2Var = (z2) el.l.y0(objArr, rVar3, (Function0) Q, rVar, 0, 4);
        rVar.s(false);
        rVar.s(false);
        return z2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void D(g1.o r26, com.assetgro.stockgro.data.model.homedata.ListItem r27, int r28, kotlin.jvm.functions.Function2 r29, com.assetgro.stockgro.data.model.homedata.Widget r30, int r31, t0.n r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.b.D(g1.o, com.assetgro.stockgro.data.model.homedata.ListItem, int, kotlin.jvm.functions.Function2, com.assetgro.stockgro.data.model.homedata.Widget, int, t0.n, int, int):void");
    }

    public static final int D0(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 3];
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [iu.w, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v0, types: [iu.w, java.lang.Object] */
    public static final o D1(boolean z10, Function0 function0, n nVar, int i10) {
        boolean z11;
        r rVar = (r) nVar;
        rVar.b0(-174977512);
        float f10 = p0.b.f30436a;
        float f11 = p0.b.f30437b;
        if (Float.compare(f10, 0) > 0) {
            Object g10 = v.e.g(rVar, 773894976, -723523240);
            Object obj = t0.m.f35080a;
            if (g10 == obj) {
                g10 = v.e.o(t.I(kotlin.coroutines.k.f23369a, rVar), rVar);
            }
            rVar.s(false);
            f0 f0Var = ((d0) g10).f34970a;
            rVar.s(false);
            g1 r02 = t.r0(function0, rVar);
            ?? obj2 = new Object();
            ?? obj3 = new Object();
            w2.b bVar = (w2.b) rVar.m(s1.f13620e);
            obj2.f20557a = bVar.c0(f10);
            obj3.f20557a = bVar.c0(f11);
            rVar.b0(170026865);
            boolean h10 = rVar.h(f0Var);
            Object Q = rVar.Q();
            if (h10 || Q == obj) {
                Q = new o(f0Var, r02, obj3.f20557a, obj2.f20557a);
                rVar.k0(Q);
            }
            o oVar = (o) Q;
            rVar.s(false);
            rVar.b0(170026986);
            boolean j10 = rVar.j(oVar);
            if ((((i10 & 14) ^ 6) > 4 && rVar.i(z10)) || (i10 & 6) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean e10 = j10 | z11 | rVar.e(obj2.f20557a) | rVar.e(obj3.f20557a);
            Object Q2 = rVar.Q();
            if (e10 || Q2 == obj) {
                Q2 = new p(oVar, z10, (w) obj2, (w) obj3);
                rVar.k0(Q2);
            }
            rVar.s(false);
            t.i((Function0) Q2, rVar);
            rVar.s(false);
            return oVar;
        }
        throw new IllegalArgumentException("The refresh trigger must be greater than zero!".toString());
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x013c, code lost:
    
        if (r1 == null) goto L76;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void E(g1.o r25, com.assetgro.stockgro.data.model.homedata.ListItem r26, kotlin.jvm.functions.Function2 r27, com.assetgro.stockgro.data.model.homedata.Widget r28, int r29, t0.n r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.b.E(g1.o, com.assetgro.stockgro.data.model.homedata.ListItem, kotlin.jvm.functions.Function2, com.assetgro.stockgro.data.model.homedata.Widget, int, t0.n, int, int):void");
    }

    public static final boolean E0(int[] iArr, int i10) {
        if ((iArr[(i10 * 5) + 1] & 268435456) != 0) {
            return true;
        }
        return false;
    }

    public static int E1(Context context, int i10, int i11) {
        TypedValue u10 = pn.e.u(i10, context);
        if (u10 != null && u10.type == 16) {
            return u10.data;
        }
        return i11;
    }

    public static final void F(g1.o oVar, Widget widget, Function2 onDeeplinkActionClicked, n nVar, int i10, int i11) {
        g1.o oVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        g1.o oVar3;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i16;
        r rVar;
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(onDeeplinkActionClicked, "onDeeplinkActionClicked");
        r rVar2 = (r) nVar;
        rVar2.c0(2130279879);
        int i17 = i11 & 1;
        if (i17 != 0) {
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
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar2.h(widget)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar2.j(onDeeplinkActionClicked)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 731) == 146 && rVar2.G()) {
            rVar2.V();
            rVar = rVar2;
        } else {
            g1.l lVar = g1.l.f16404b;
            if (i17 != 0) {
                oVar3 = lVar;
            } else {
                oVar3 = oVar2;
            }
            m0 a10 = p0.a(rVar2);
            g1.o a11 = h2.l.a(lVar, false, a0.f24629o);
            rVar2.b0(-483455358);
            l1 a12 = y.a(b0.n.f2937c, g1.a.f16391m, rVar2, 0);
            rVar2.b0(-1323940314);
            int i18 = rVar2.P;
            r1 o10 = rVar2.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(a11);
            if (rVar2.f35166a instanceof t0.f) {
                rVar2.e0();
                if (rVar2.O) {
                    rVar2.n(jVar);
                } else {
                    rVar2.n0();
                }
                t.v0(rVar2, a12, c2.k.f7749e);
                t.v0(rVar2, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i18))) {
                    nn.d.s(i18, rVar2, i18, iVar);
                }
                nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
                int i19 = i12 & 896;
                z(widget, h2.l.a(oVar3, false, a0.f24630p), onDeeplinkActionClicked, rVar2, ((i12 >> 3) & 14) | i19);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(oVar3, 20), rVar2);
                if (widget.getListItems().size() == 1) {
                    rVar2.b0(-1603344967);
                    E(h2.l.a(oVar3, false, a0.f24631q), widget.getListItems().get(0), onDeeplinkActionClicked, widget, 0, rVar2, i19 | 24576 | ((i12 << 6) & 7168), 0);
                    rVar2.s(false);
                    z13 = false;
                    oVar2 = oVar3;
                    i16 = 32;
                    rVar = rVar2;
                } else {
                    rVar2.b0(-1602995566);
                    g1.o a13 = h2.l.a(androidx.compose.foundation.layout.d.e(oVar3, 1.0f), false, a0.f24632r);
                    rVar2.b0(-1714272291);
                    if ((i12 & 112) == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((i12 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean z14 = z11 | z10;
                    if (i19 == 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z15 = z14 | z12;
                    Object Q = rVar2.Q();
                    if (z15 || Q == t0.m.f35080a) {
                        Q = new v(widget, oVar3, onDeeplinkActionClicked, 2);
                        rVar2.k0(Q);
                    }
                    Function1 function1 = (Function1) Q;
                    rVar2.s(false);
                    z13 = false;
                    oVar2 = oVar3;
                    i16 = 32;
                    rVar = rVar2;
                    i0.d(a13, a10, null, false, null, null, null, false, function1, rVar, 0, 252);
                    rVar.s(false);
                }
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(oVar2, i16), rVar);
                rVar.s(z13);
                rVar.s(true);
                rVar.s(z13);
                rVar.s(z13);
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new q(oVar2, widget, onDeeplinkActionClicked, i10, i11, 2);
        }
    }

    public static final boolean F0(int[] iArr, int i10) {
        if ((iArr[(i10 * 5) + 1] & 536870912) != 0) {
            return true;
        }
        return false;
    }

    public static TimeInterpolator F1(Context context, int i10, Interpolator interpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return interpolator;
        }
        if (typedValue.type == 3) {
            String valueOf = String.valueOf(typedValue.string);
            if (!u1(valueOf, "cubic-bezier") && !u1(valueOf, "path")) {
                return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
            }
            if (u1(valueOf, "cubic-bezier")) {
                String[] split = valueOf.substring(13, valueOf.length() - 1).split(",");
                if (split.length == 4) {
                    return f4.a.b(p1(split, 0), p1(split, 1), p1(split, 2), p1(split, 3));
                }
                throw new IllegalArgumentException("Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: " + split.length);
            }
            if (u1(valueOf, "path")) {
                return f4.a.c(yk.j.P0(valueOf.substring(5, valueOf.length() - 1)));
            }
            throw new IllegalArgumentException("Invalid motion easing type: ".concat(valueOf));
        }
        throw new IllegalArgumentException("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
    }

    public static final void G(Object obj, int i10, d0.d0 d0Var, Function2 function2, n nVar, int i11) {
        int i12;
        Function1 function1;
        int i13;
        int i14;
        int i15;
        int i16;
        r rVar = (r) nVar;
        rVar.c0(-2079116560);
        if ((i11 & 6) == 0) {
            if (rVar.j(obj)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i12 = i16 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            if (rVar.f(i10)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i12 |= i15;
        }
        if ((i11 & 384) == 0) {
            if (rVar.j(d0Var)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i11 & 3072) == 0) {
            if (rVar.j(function2)) {
                i13 = 2048;
            } else {
                i13 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i13;
        }
        if ((i12 & 1171) == 1170 && rVar.G()) {
            rVar.V();
        } else {
            rVar.b0(-2102496129);
            boolean h10 = rVar.h(obj) | rVar.h(d0Var);
            Object Q = rVar.Q();
            to.e eVar = t0.m.f35080a;
            if (h10 || Q == eVar) {
                Q = new c0(obj, d0Var);
                rVar.k0(Q);
            }
            c0 c0Var = (c0) Q;
            rVar.s(false);
            t0.l1 l1Var = c0Var.f13149c;
            n1 n1Var = c0Var.f13151e;
            n1 n1Var2 = c0Var.f13152f;
            l1Var.j(i10);
            t0.p0 p0Var = y0.f132a;
            c0 c0Var2 = (c0) rVar.m(p0Var);
            e1.i h11 = yq.b.h();
            if (h11 != null) {
                function1 = h11.f();
            } else {
                function1 = null;
            }
            e1.i i17 = yq.b.i(h11);
            try {
                if (c0Var2 != ((c0) n1Var2.getValue())) {
                    n1Var2.setValue(c0Var2);
                    if (c0Var.f13150d.i() > 0) {
                        c0 c0Var3 = (c0) n1Var.getValue();
                        if (c0Var3 != null) {
                            c0Var3.b();
                        }
                        if (c0Var2 != null) {
                            c0Var2.a();
                        } else {
                            c0Var2 = null;
                        }
                        n1Var.setValue(c0Var2);
                    }
                }
                Unit unit = Unit.f23355a;
                yq.b.l(h11, i17, function1);
                rVar.b0(-2102495911);
                boolean h12 = rVar.h(c0Var);
                Object Q2 = rVar.Q();
                if (h12 || Q2 == eVar) {
                    Q2 = new g0(c0Var, 12);
                    rVar.k0(Q2);
                }
                rVar.s(false);
                t.c(c0Var, (Function1) Q2, rVar);
                p(p0Var.b(c0Var), function2, rVar, (i12 >> 6) & 112);
            } catch (Throwable th2) {
                yq.b.l(h11, i17, function1);
                throw th2;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new d0.t(obj, i10, d0Var, function2, i11);
        }
    }

    public static final boolean G0(int[] iArr, int i10) {
        if ((iArr[(i10 * 5) + 1] & 1073741824) != 0) {
            return true;
        }
        return false;
    }

    public static void G1(File file, String str) {
        File createTempFile = File.createTempFile("temp-sg", "temp");
        FileOutputStream fileOutputStream = new FileOutputStream(createTempFile);
        fileOutputStream.write(str.getBytes());
        fileOutputStream.close();
        if (createTempFile.renameTo(file)) {
            return;
        }
        throw new IOException("Error to rename file to " + file.getAbsolutePath());
    }

    public static final void H(hu.c cVar, n nVar, int i10) {
        int i11;
        int i12;
        r rVar = (r) nVar;
        rVar.c0(674185128);
        if ((i10 & 6) == 0) {
            if (rVar.j(cVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        int i13 = 3;
        if ((i11 & 3) == 2 && rVar.G()) {
            rVar.V();
        } else {
            u1 u1Var = d1.q.f13288a;
            d1.n nVar2 = (d1.n) rVar.m(u1Var);
            Object[] objArr = {nVar2};
            d0.m0 m0Var = d0.m0.f13183a;
            l0 l0Var = new l0(nVar2, 1);
            d1.r rVar2 = s.f13291a;
            d1.r rVar3 = new d1.r(m0Var, l0Var);
            rVar.b0(1246403883);
            boolean j10 = rVar.j(nVar2);
            Object Q = rVar.Q();
            if (j10 || Q == t0.m.f35080a) {
                Q = new x.a(nVar2, 7);
                rVar.k0(Q);
            }
            rVar.s(false);
            Object obj = (d0.o0) el.l.y0(objArr, rVar3, (Function0) Q, rVar, 0, 4);
            p(u1Var.b(obj), b1.d.b(rVar, 1863926504, new q0(5, obj, cVar)), rVar, 48);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new w.p0(i10, i13, cVar);
        }
    }

    public static final int H0(ArrayList arrayList, int i10, int i11) {
        int H1 = H1(arrayList, i10, i11);
        if (H1 < 0) {
            return -(H1 + 1);
        }
        return H1;
    }

    public static final int H1(ArrayList arrayList, int i10, int i11) {
        int size = arrayList.size() - 1;
        int i12 = 0;
        while (i12 <= size) {
            int i13 = (i12 + size) >>> 1;
            int i14 = ((t0.d) arrayList.get(i13)).f34969a;
            if (i14 < 0) {
                i14 += i11;
            }
            int f10 = Intrinsics.f(i14, i10);
            if (f10 < 0) {
                i12 = i13 + 1;
            } else if (f10 > 0) {
                size = i13 - 1;
            } else {
                return i13;
            }
        }
        return -(i12 + 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:128:0x034f, code lost:
    
        if (r15 == t0.m.f35080a) goto L233;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03b6  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03c0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0400 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0433  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x043d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x049e  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x03b8  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void I(kotlin.jvm.functions.Function0 r44, g1.o r45, r0.z2 r46, float r47, n1.x0 r48, long r49, long r51, float r53, long r54, kotlin.jvm.functions.Function2 r56, b0.x1 r57, r0.h1 r58, hu.c r59, t0.n r60, int r61, int r62, int r63) {
        /*
            Method dump skipped, instructions count: 1287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.b.I(kotlin.jvm.functions.Function0, g1.o, r0.z2, float, n1.x0, long, long, float, long, kotlin.jvm.functions.Function2, b0.x1, r0.h1, hu.c, t0.n, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object I0(x1.m0 r10, l0.m r11, l0.j r12, x1.k r13, yt.a r14) {
        /*
            Method dump skipped, instructions count: 265
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.b.I0(x1.m0, l0.m, l0.j, x1.k, yt.a):java.lang.Object");
    }

    public static void I1(View view, float f10) {
        Drawable background = view.getBackground();
        if (background instanceof to.h) {
            ((to.h) background).m(f10);
        }
    }

    public static final void J(h1 h1Var, Function0 function0, b0.x1 x1Var, Function2 function2, n nVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        r rVar = (r) nVar;
        rVar.c0(738805080);
        int i16 = 2;
        if ((i10 & 6) == 0) {
            if (rVar.h(h1Var)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar.j(function0)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 384) == 0) {
            if (rVar.h(x1Var)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        if ((i10 & 3072) == 0) {
            if (rVar.j(function2)) {
                i12 = 2048;
            } else {
                i12 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i11 |= i12;
        }
        if ((i11 & 1171) == 1170 && rVar.G()) {
            rVar.V();
        } else {
            View view = (View) rVar.m(AndroidCompositionLocals_androidKt.f1433g);
            int i17 = 0;
            UUID uuid = (UUID) el.l.y0(new Object[0], null, r0.m0.f32577f, rVar, 3072, 6);
            t0.p M0 = al.d.M0(rVar);
            g1 r02 = t.r0(function2, rVar);
            w2.k kVar = (w2.k) rVar.m(s1.f13626k);
            rVar.b0(173201889);
            Object Q = rVar.Q();
            to.e eVar = t0.m.f35080a;
            Object obj = Q;
            if (Q == eVar) {
                j1 j1Var = new j1(h1Var, function0, view, uuid);
                r0.c cVar = new r0.c(i16, x1Var, r02);
                Object obj2 = b1.d.f3079a;
                b1.c cVar2 = new b1.c(cVar, true, -114385661);
                j1Var.setParentCompositionContext(M0);
                j1Var.f32480o.setValue(cVar2);
                j1Var.f32481p = true;
                rVar.k0(j1Var);
                obj = j1Var;
            }
            j1 j1Var2 = (j1) obj;
            rVar.s(false);
            rVar.b0(173202877);
            boolean j10 = rVar.j(j1Var2) | rVar.h(kVar);
            Object Q2 = rVar.Q();
            if (j10 || Q2 == eVar) {
                Q2 = new z1(i17, j1Var2, kVar);
                rVar.k0(Q2);
            }
            rVar.s(false);
            t.c(j1Var2, (Function1) Q2, rVar);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new a2(h1Var, function0, x1Var, function2, i10, 0);
        }
    }

    public static final int J0(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 1] & 67108863;
    }

    public static void J1(Outline outline, Path path) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            outline.setPath(path);
            return;
        }
        if (i10 >= 29) {
            try {
                outline.setConvexPath(path);
            } catch (IllegalArgumentException unused) {
            }
        } else if (path.isConvex()) {
            outline.setConvexPath(path);
        }
    }

    public static final void K(n nVar, int i10) {
        r rVar = (r) nVar;
        rVar.c0(1658870753);
        if (i10 == 0 && rVar.G()) {
            rVar.V();
        } else {
            al.d.z(R.drawable.ic_no_scratch_card, null, h2.l.a(g1.l.f16404b, false, vh.b.f38054h), 0L, rVar, 6, 10);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new u(i10, 18);
        }
    }

    public static final int K0(int[] iArr, int i10) {
        return iArr[(i10 * 5) + 2];
    }

    public static void K1(View view) {
        Drawable background = view.getBackground();
        if (background instanceof to.h) {
            L1(view, (to.h) background);
        }
    }

    public static final void L(PeriodicPnl pnlItem, n nVar, int i10) {
        int i11;
        r rVar;
        boolean z10;
        q1.b u10;
        int i12;
        Intrinsics.checkNotNullParameter(pnlItem, "pnlItem");
        r rVar2 = (r) nVar;
        rVar2.c0(1056576717);
        if ((i10 & 14) == 0) {
            if (rVar2.h(pnlItem)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && rVar2.G()) {
            rVar2.V();
            rVar = rVar2;
        } else {
            g1.l lVar = g1.l.f16404b;
            float f10 = 16;
            g1.o x10 = androidx.compose.foundation.layout.a.x(androidx.compose.foundation.layout.a.m(androidx.compose.foundation.layout.d.e(lVar, 1.0f)), f10, s0.g.f34069a, f10, s0.g.f34069a, 10);
            rVar2.b0(693286680);
            l1 a10 = o1.a(b0.n.f2935a, g1.a.f16388j, rVar2, 0);
            rVar2.b0(-1323940314);
            int i13 = rVar2.P;
            r1 o10 = rVar2.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(x10);
            if (rVar2.f35166a instanceof t0.f) {
                rVar2.e0();
                if (rVar2.O) {
                    rVar2.n(jVar);
                } else {
                    rVar2.n0();
                }
                t.v0(rVar2, a10, c2.k.f7749e);
                t.v0(rVar2, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i13))) {
                    nn.d.s(i13, rVar2, i13, iVar);
                }
                nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
                String periodicity = pnlItem.getPeriodicity();
                long e10 = w0.e(R.color.black_1A1A1A_40, rVar2);
                o2.v vVar = jh.c.f21373b;
                al.d.C(periodicity, null, e10, yk.j.e1(12), null, null, vVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1575936, 0, 130994);
                double d10 = 0.0d;
                if (1.0f > 0.0d) {
                    androidx.compose.foundation.layout.a.c(new LayoutWeightElement(kotlin.ranges.d.c(1.0f, Float.MAX_VALUE), true), rVar2);
                    Double e11 = kotlin.text.q.e(pnlItem.getPnl().getNetPnl());
                    if (e11 != null) {
                        d10 = e11.doubleValue();
                    }
                    al.d.l(d10, null, w0.e(R.color.black_1A1A1A, rVar2), yk.j.e1(11), null, null, vVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, true, rVar2, 1575936, 12582912, 130994);
                    float f11 = 4;
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f11), rVar2);
                    pp.b.c(androidx.compose.foundation.layout.d.q(androidx.compose.foundation.layout.d.c(lVar, 1.0f), 1), w0.e(R.color.lightColorSeparator, rVar2), s0.g.f34069a, s0.g.f34069a, rVar2, 6, 12);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f11), rVar2);
                    ij.h hVar = ij.h.f20067a;
                    al.d.C(ij.h.t(pnlItem.getPnl().getPercentage()), null, w0.e(R.color.black_1A1A1A, rVar2), yk.j.e1(11), null, null, vVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1575936, 0, 130994);
                    rVar = rVar2;
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f11), rVar);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.q(lVar, f11), rVar);
                    if (Intrinsics.a(pnlItem.getPnl().getType(), "POSITIVE")) {
                        rVar.b0(934014279);
                        u10 = w0.u(R.drawable.ic_stock_up_arrow, rVar, 6);
                        z10 = false;
                    } else {
                        z10 = false;
                        rVar.b0(934015943);
                        u10 = w0.u(R.drawable.ic_stock_down_arrow, rVar, 6);
                    }
                    rVar.s(z10);
                    androidx.compose.foundation.a.c(u10, null, androidx.compose.foundation.layout.d.m(lVar, f10), null, null, s0.g.f34069a, null, rVar, 440, 120);
                    v.e.y(rVar, z10, true, z10, z10);
                } else {
                    throw new IllegalArgumentException(jr.h.m("invalid weight ", 1.0f, "; must be greater than zero").toString());
                }
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new w.p0(i10, 16, pnlItem);
        }
    }

    public static final int L0(int[] iArr, int i10) {
        int i11 = i10 * 5;
        return X0(iArr[i11 + 1] >> 28) + iArr[i11 + 4];
    }

    public static void L1(View view, to.h hVar) {
        io.a aVar = hVar.f36253a.f36232b;
        if (aVar != null && aVar.f20454a) {
            float f10 = s0.g.f34069a;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap weakHashMap = d4.n1.f13788a;
                f10 += b1.i((View) parent);
            }
            to.g gVar = hVar.f36253a;
            if (gVar.f36243m != f10) {
                gVar.f36243m = f10;
                hVar.u();
            }
        }
    }

    public static final void M(FnoOrderResponseData itemData, Function1 onModifyClicked, Function1 onCancelClicked, n nVar, int i10) {
        int i11;
        String str;
        ug.l kVar;
        String t10;
        Double entryPrice;
        String s7;
        String str2;
        r rVar;
        int i12;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(itemData, "itemData");
        Intrinsics.checkNotNullParameter(onModifyClicked, "onModifyClicked");
        Intrinsics.checkNotNullParameter(onCancelClicked, "onCancelClicked");
        r rVar2 = (r) nVar;
        rVar2.c0(1111789714);
        if ((i10 & 14) == 0) {
            if (rVar2.h(itemData)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (rVar2.j(onModifyClicked)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 896) == 0) {
            if (rVar2.j(onCancelClicked)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 731) == 146 && rVar2.G()) {
            rVar2.V();
            rVar = rVar2;
        } else {
            Intrinsics.checkNotNullParameter(itemData, "itemData");
            String status = itemData.getStatus();
            if (status != null) {
                str = status.toLowerCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            Locale locale = Locale.ROOT;
            String lowerCase = "Pending".toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            boolean a10 = Intrinsics.a(str, lowerCase);
            ug.l lVar = ug.j.f37186c;
            ug.l lVar2 = ug.j.f37187d;
            ug.l lVar3 = ug.j.f37188e;
            if (a10) {
                kVar = lVar3;
            } else {
                String lowerCase2 = "Executed".toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                if (Intrinsics.a(str, lowerCase2)) {
                    kVar = lVar2;
                } else {
                    String lowerCase3 = "Cancelled".toLowerCase(locale);
                    Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
                    if (Intrinsics.a(str, lowerCase3)) {
                        kVar = lVar;
                    } else {
                        String status2 = itemData.getStatus();
                        if (status2 == null) {
                            status2 = HttpUrl.FRAGMENT_ENCODE_SET;
                        }
                        kVar = new ug.k(status2);
                    }
                }
            }
            if (Intrinsics.a(kVar, lVar)) {
                t10 = jr.h.t(rVar2, 1017209371, R.string.cancelled_at, rVar2, false);
            } else if (Intrinsics.a(kVar, lVar2)) {
                t10 = jr.h.t(rVar2, 1017311516, R.string.executed_at, rVar2, false);
            } else if (Intrinsics.a(kVar, lVar3)) {
                t10 = jr.h.t(rVar2, 1017411708, R.string.executed_at, rVar2, false);
            } else if (kVar instanceof ug.k) {
                t10 = jr.h.t(rVar2, 1017514876, R.string.executed_at, rVar2, false);
            } else {
                rVar2.b0(1695138954);
                rVar2.s(false);
                throw new NoWhenBranchMatchedException();
            }
            String str3 = t10;
            if (Intrinsics.a(kVar, lVar)) {
                entryPrice = itemData.getEntryPrice();
            } else if (Intrinsics.a(kVar, lVar2)) {
                entryPrice = itemData.getExecutionPrice();
            } else if (Intrinsics.a(kVar, lVar3)) {
                entryPrice = itemData.getEntryPrice();
            } else if (kVar instanceof ug.k) {
                entryPrice = itemData.getEntryPrice();
            } else {
                throw new NoWhenBranchMatchedException();
            }
            Double d10 = entryPrice;
            if (Intrinsics.a(kVar, lVar)) {
                Long entryDate = itemData.getEntryDate();
                if (entryDate != null) {
                    s7 = kj.f.s(entryDate.longValue());
                    str2 = s7;
                }
                str2 = null;
            } else if (Intrinsics.a(kVar, lVar2)) {
                Long executionDate = itemData.getExecutionDate();
                if (executionDate != null) {
                    s7 = kj.f.s(executionDate.longValue());
                    str2 = s7;
                }
                str2 = null;
            } else if (Intrinsics.a(kVar, lVar3)) {
                Long entryDate2 = itemData.getEntryDate();
                if (entryDate2 != null) {
                    s7 = kj.f.s(entryDate2.longValue());
                    str2 = s7;
                }
                str2 = null;
            } else if (kVar instanceof ug.k) {
                Long entryDate3 = itemData.getEntryDate();
                if (entryDate3 != null) {
                    s7 = kj.f.s(entryDate3.longValue());
                    str2 = s7;
                }
                str2 = null;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            float f10 = 16;
            rVar = rVar2;
            pp.b.b(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.a.x(g1.l.f16404b, f10, s0.g.f34069a, f10, s0.g.f34069a, 10), 1.0f), h0.h.b(12), n1.t.f28173e, null, hl.f.S(R.dimen.default_card_elevation, rVar2), b1.d.c(-1952839921, new ld.m(kVar, itemData, d10, onModifyClicked, onCancelClicked, str3, str2), rVar2), rVar, 1573254, 24);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new n0(itemData, onModifyClicked, onCancelClicked, i10, 17);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a0 A[Catch: CancellationException -> 0x002e, TryCatch #0 {CancellationException -> 0x002e, blocks: (B:12:0x002a, B:13:0x0098, B:15:0x00a0, B:17:0x00ad, B:19:0x00b9, B:21:0x00bc, B:24:0x00bf, B:28:0x00c3, B:32:0x003f, B:34:0x0062, B:37:0x0068, B:39:0x007e, B:44:0x0049), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3 A[Catch: CancellationException -> 0x002e, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x002e, blocks: (B:12:0x002a, B:13:0x0098, B:15:0x00a0, B:17:0x00ad, B:19:0x00b9, B:21:0x00bc, B:24:0x00bf, B:28:0x00c3, B:32:0x003f, B:34:0x0062, B:37:0x0068, B:39:0x007e, B:44:0x0049), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object M0(x1.m0 r10, i0.a2 r11, x1.k r12, yt.a r13) {
        /*
            boolean r0 = r13 instanceof l0.a0
            if (r0 == 0) goto L13
            r0 = r13
            l0.a0 r0 = (l0.a0) r0
            int r1 = r0.f23708e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f23708e = r1
            goto L18
        L13:
            l0.a0 r0 = new l0.a0
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f23707d
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f23708e
            r3 = 1
            r4 = 2
            if (r2 == 0) goto L46
            if (r2 == r3) goto L39
            if (r2 != r4) goto L31
            i0.a2 r11 = r0.f23705b
            x1.m0 r10 = r0.f23704a
            ut.n.b(r13)     // Catch: java.util.concurrent.CancellationException -> L2e
            goto L98
        L2e:
            r10 = move-exception
            goto Lc9
        L31:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L39:
            x1.t r10 = r0.f23706c
            i0.a2 r11 = r0.f23705b
            x1.m0 r12 = r0.f23704a
            ut.n.b(r13)     // Catch: java.util.concurrent.CancellationException -> L2e
            r9 = r12
            r12 = r10
            r10 = r9
            goto L62
        L46:
            ut.n.b(r13)
            java.util.List r12 = r12.f39870a     // Catch: java.util.concurrent.CancellationException -> L2e
            java.lang.Object r12 = vt.g0.u(r12)     // Catch: java.util.concurrent.CancellationException -> L2e
            x1.t r12 = (x1.t) r12     // Catch: java.util.concurrent.CancellationException -> L2e
            long r5 = r12.f39909a     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.f23704a = r10     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.f23705b = r11     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.f23706c = r12     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.f23708e = r3     // Catch: java.util.concurrent.CancellationException -> L2e
            java.lang.Object r13 = y.m0.b(r5, r10, r0)     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r13 != r1) goto L62
            goto Lc8
        L62:
            x1.t r13 = (x1.t) r13     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r13 == 0) goto Lc6
            long r5 = r13.f39911c
            long r7 = r12.f39911c     // Catch: java.util.concurrent.CancellationException -> L2e
            long r7 = m1.c.g(r7, r5)     // Catch: java.util.concurrent.CancellationException -> L2e
            float r12 = m1.c.c(r7)     // Catch: java.util.concurrent.CancellationException -> L2e
            d2.j3 r2 = r10.f()     // Catch: java.util.concurrent.CancellationException -> L2e
            float r2 = r2.f()     // Catch: java.util.concurrent.CancellationException -> L2e
            int r12 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r12 >= 0) goto Lc6
            r11.b(r5)     // Catch: java.util.concurrent.CancellationException -> L2e
            long r12 = r13.f39909a     // Catch: java.util.concurrent.CancellationException -> L2e
            i0.v1 r2 = new i0.v1     // Catch: java.util.concurrent.CancellationException -> L2e
            r2.<init>(r11, r3)     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.f23704a = r10     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.f23705b = r11     // Catch: java.util.concurrent.CancellationException -> L2e
            r3 = 0
            r0.f23706c = r3     // Catch: java.util.concurrent.CancellationException -> L2e
            r0.f23708e = r4     // Catch: java.util.concurrent.CancellationException -> L2e
            java.lang.Object r13 = y.m0.c(r10, r12, r2, r0)     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r13 != r1) goto L98
            goto Lc8
        L98:
            java.lang.Boolean r13 = (java.lang.Boolean) r13     // Catch: java.util.concurrent.CancellationException -> L2e
            boolean r12 = r13.booleanValue()     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r12 == 0) goto Lc3
            x1.o0 r10 = r10.f39891f     // Catch: java.util.concurrent.CancellationException -> L2e
            x1.k r10 = r10.f39900p     // Catch: java.util.concurrent.CancellationException -> L2e
            java.util.List r10 = r10.f39870a     // Catch: java.util.concurrent.CancellationException -> L2e
            int r12 = r10.size()     // Catch: java.util.concurrent.CancellationException -> L2e
            r13 = 0
        Lab:
            if (r13 >= r12) goto Lbf
            java.lang.Object r0 = r10.get(r13)     // Catch: java.util.concurrent.CancellationException -> L2e
            x1.t r0 = (x1.t) r0     // Catch: java.util.concurrent.CancellationException -> L2e
            boolean r1 = t0.t.z(r0)     // Catch: java.util.concurrent.CancellationException -> L2e
            if (r1 == 0) goto Lbc
            r0.a()     // Catch: java.util.concurrent.CancellationException -> L2e
        Lbc:
            int r13 = r13 + 1
            goto Lab
        Lbf:
            r11.onStop()     // Catch: java.util.concurrent.CancellationException -> L2e
            goto Lc6
        Lc3:
            r11.a()     // Catch: java.util.concurrent.CancellationException -> L2e
        Lc6:
            kotlin.Unit r1 = kotlin.Unit.f23355a
        Lc8:
            return r1
        Lc9:
            r11.a()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.b.M0(x1.m0, i0.a2, x1.k, yt.a):java.lang.Object");
    }

    public static void M1(final Context context, String str) {
        String string;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i10 = applicationInfo.labelRes;
        if (i10 == 0) {
            string = applicationInfo.nonLocalizedLabel.toString();
        } else {
            string = context.getString(i10);
        }
        final h.j create = new h.i(context, R.style.StockgroDialogTheme).setTitle(string).b(a3.a.g(string, " ", str)).setPositiveButton(android.R.string.ok, null).setNegativeButton(android.R.string.cancel, null).create();
        create.setOnShowListener(new DialogInterface.OnShowListener() { // from class: ue.r
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                h.j jVar = h.j.this;
                jVar.f17699f.f17677k.setOnClickListener(new bb.a(9, context, jVar));
            }
        });
        create.show();
    }

    public static final void N(PortfolioFnoOrdersViewModel viewModel, Function1 onModifyClicked, Function2 onCancelClicked, n nVar, int i10) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onModifyClicked, "onModifyClicked");
        Intrinsics.checkNotNullParameter(onCancelClicked, "onCancelClicked");
        r rVar = (r) nVar;
        rVar.c0(-2037105006);
        Context context = (Context) rVar.m(AndroidCompositionLocals_androidKt.f1428b);
        g1 o02 = t.o0(viewModel.f9911q, rVar);
        List g10 = vt.y.g(hl.f.c1(R.string.text_all, rVar), hl.f.c1(R.string.bought_, rVar), hl.f.c1(R.string.sold_, rVar));
        rVar.b0(-350410491);
        Object Q = rVar.Q();
        to.e eVar = t0.m.f35080a;
        o3 o3Var = o3.f35116a;
        if (Q == eVar) {
            Q = t.n0(Boolean.FALSE, o3Var);
            rVar.k0(Q);
        }
        g1 g1Var = (g1) Q;
        Object h10 = v.e.h(rVar, false, -350408575);
        if (h10 == eVar) {
            h10 = t.n0(0, o3Var);
            rVar.k0(h10);
        }
        g1 g1Var2 = (g1) h10;
        rVar.s(false);
        g1 K0 = yk.j.K0(new s0(viewModel.f9912r), rVar);
        o D1 = D1(((Boolean) K0.getValue()).booleanValue(), new c0.s(22, viewModel, g10, g1Var2), rVar, 0);
        t.e(Integer.valueOf(((Number) g1Var2.getValue()).intValue()), new ug.h(viewModel, g10, g1Var2, null), rVar);
        g1.l lVar = g1.l.f16404b;
        FillElement fillElement = androidx.compose.foundation.layout.d.f1286c;
        g1.o K02 = al.d.K0(fillElement, D1);
        rVar.b0(733328855);
        b0.v c10 = b0.s.c(g1.a.f16379a, false, rVar, 0);
        rVar.b0(-1323940314);
        int i11 = rVar.P;
        r1 o10 = rVar.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(K02);
        if (rVar.f35166a instanceof t0.f) {
            rVar.e0();
            if (rVar.O) {
                rVar.n(jVar);
            } else {
                rVar.n0();
            }
            t.v0(rVar, c10, c2.k.f7749e);
            t.v0(rVar, o10, c2.k.f7748d);
            c2.i iVar = c2.k.f7750f;
            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i11))) {
                nn.d.s(i11, rVar, i11, iVar);
            }
            nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
            androidx.compose.foundation.layout.b bVar = androidx.compose.foundation.layout.b.f1281a;
            i0.c(fillElement, null, null, false, null, null, null, false, new lb.l(g10, g1Var, g1Var2, o02, context, onModifyClicked, onCancelClicked), rVar, 6, 254);
            p0.h.a(((Boolean) K0.getValue()).booleanValue(), D1, bVar.a(lVar, g1.a.f16380b), 0L, 0L, false, rVar, 64, 56);
            x1 t10 = da.e.t(rVar, false, true, false, false);
            if (t10 != null) {
                t10.f35245d = new n0(viewModel, onModifyClicked, onCancelClicked, i10, 18);
                return;
            }
            return;
        }
        al.d.v0();
        throw null;
    }

    public static final void N0(int i10, int i11, int[] iArr) {
        boolean z10;
        if (i11 >= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        t.u0(z10);
        iArr[(i10 * 5) + 3] = i11;
    }

    public static final g1.o N1(v0 v0Var) {
        g1.l lVar = g1.l.f16404b;
        if (!x.r1.a()) {
            return lVar;
        }
        return t.H(lVar, d2.s.f13613k, new v.g(v0Var, 6));
    }

    public static final void O(PortfolioFnoHoldingsViewModel viewModel, PortfolioDetailViewModel sharedViewModel, pg.c selectedFilterOption, Function2 buySellClicked, Function1 onHeaderClick, Function0 openBottomSheet, n nVar, int i10) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(sharedViewModel, "sharedViewModel");
        Intrinsics.checkNotNullParameter(selectedFilterOption, "selectedFilterOption");
        Intrinsics.checkNotNullParameter(buySellClicked, "buySellClicked");
        Intrinsics.checkNotNullParameter(onHeaderClick, "onHeaderClick");
        Intrinsics.checkNotNullParameter(openBottomSheet, "openBottomSheet");
        r rVar = (r) nVar;
        rVar.c0(-2085602450);
        Context context = (Context) rVar.m(AndroidCompositionLocals_androidKt.f1428b);
        g1 o02 = t.o0(viewModel.f9831t, rVar);
        rVar.b0(-126351213);
        Object Q = rVar.Q();
        to.e eVar = t0.m.f35080a;
        o3 o3Var = o3.f35116a;
        if (Q == eVar) {
            Q = t.n0(null, o3Var);
            rVar.k0(Q);
        }
        g1 g1Var = (g1) Q;
        Object h10 = v.e.h(rVar, false, -126347983);
        if (h10 == eVar) {
            h10 = t.n0(null, o3Var);
            rVar.k0(h10);
        }
        g1 g1Var2 = (g1) h10;
        Object h11 = v.e.h(rVar, false, -126344782);
        if (h11 == eVar) {
            h11 = t.n0(null, o3Var);
            rVar.k0(h11);
        }
        g1 g1Var3 = (g1) h11;
        Object h12 = v.e.h(rVar, false, -126341225);
        if (h12 == eVar) {
            h12 = t.n0(null, o3Var);
            rVar.k0(h12);
        }
        g1 g1Var4 = (g1) h12;
        rVar.s(false);
        g1 o03 = t.o0(sharedViewModel.C, rVar);
        rVar.b0(-126334253);
        Object Q2 = rVar.Q();
        if (Q2 == eVar) {
            Q2 = t.n0(Boolean.FALSE, o3Var);
            rVar.k0(Q2);
        }
        g1 g1Var5 = (g1) Q2;
        rVar.s(false);
        float f10 = 16;
        i0.c(androidx.compose.foundation.layout.a.x(g1.l.f16404b, f10, s0.g.f34069a, f10, s0.g.f34069a, 10), null, null, false, null, null, null, false, new pg.n(selectedFilterOption, o02, g1Var3, o03, g1Var4, context, g1Var, g1Var2, openBottomSheet, g1Var5, viewModel, buySellClicked, onHeaderClick), rVar, 6, 254);
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new v.q(viewModel, sharedViewModel, selectedFilterOption, buySellClicked, onHeaderClick, openBottomSheet, i10);
        }
    }

    public static final void O0(int i10, int i11, int[] iArr) {
        boolean z10;
        if (i11 >= 0 && i11 < 67108863) {
            z10 = true;
        } else {
            z10 = false;
        }
        t.u0(z10);
        int i12 = (i10 * 5) + 1;
        iArr[i12] = i11 | (iArr[i12] & (-67108864));
    }

    public static int O1(int i10, Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(android.R.style.Animation.Activity, new int[]{i10});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static final void P(OptionValue itemData, n nVar, int i10) {
        int i11;
        int i12;
        Intrinsics.checkNotNullParameter(itemData, "itemData");
        r rVar = (r) nVar;
        rVar.c0(1509680713);
        if ((i10 & 14) == 0) {
            if (rVar.h(itemData)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        int i13 = 11;
        if ((i11 & 11) == 2 && rVar.G()) {
            rVar.V();
        } else {
            float f10 = 16;
            pp.b.b(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.a.x(g1.l.f16404b, s0.g.f34069a, f10, s0.g.f34069a, f10, 5), 1.0f), h0.h.b(12), n1.t.f28173e, null, 4, b1.d.c(-1047146836, new be.b(itemData, i13), rVar), rVar, 1769862, 24);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new w.p0(i10, 17, itemData);
        }
    }

    public static AnalyticEvent P0(String groupId, String groupName, String str, String source) {
        Intrinsics.checkNotNullParameter(groupId, "groupId");
        Intrinsics.checkNotNullParameter(groupName, "groupName");
        Intrinsics.checkNotNullParameter(source, "source");
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("group_id", groupId);
        pairArr[1] = new Pair("group_name", groupName);
        if (str == null) {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        pairArr[2] = new Pair("exit_reason", str);
        pairArr[3] = new Pair("exit_source", source);
        return new AnalyticEvent("app_group_exited", vt.p0.f(pairArr));
    }

    public static String P1(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt >= 'A' && charAt <= 'Z') {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (c10 >= 'A' && c10 <= 'Z') {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0107, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r15.Q(), java.lang.Integer.valueOf(r4)) == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Q(com.assetgro.stockgro.ui.portfolio.holdings.PortfolioFnoHoldingsViewModel r26, com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailViewModel r27, kotlin.jvm.functions.Function0 r28, kotlin.jvm.functions.Function2 r29, kotlin.jvm.functions.Function1 r30, t0.n r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 608
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.b.Q(com.assetgro.stockgro.ui.portfolio.holdings.PortfolioFnoHoldingsViewModel, com.assetgro.stockgro.ui.portfolio.detail.PortfolioDetailViewModel, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1, t0.n, int, int):void");
    }

    public static String Q0(int i10, int i11, String str) {
        if (i10 < 0) {
            return pn.e.q("%s (%s) must not be negative", str, Integer.valueOf(i10));
        }
        if (i11 >= 0) {
            return pn.e.q("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i10), Integer.valueOf(i11));
        }
        throw new IllegalArgumentException(nn.d.h(26, "negative size: ", i11));
    }

    public static String Q1(String str) {
        int length = str.length();
        int i10 = 0;
        while (i10 < length) {
            char charAt = str.charAt(i10);
            if (charAt >= 'a' && charAt <= 'z') {
                char[] charArray = str.toCharArray();
                while (i10 < length) {
                    char c10 = charArray[i10];
                    if (c10 >= 'a' && c10 <= 'z') {
                        charArray[i10] = (char) (c10 ^ ' ');
                    }
                    i10++;
                }
                return String.valueOf(charArray);
            }
            i10++;
        }
        return str;
    }

    public static final void R(kh.m mVar, List list, Function1 function1, Function0 dismiss, n nVar, int i10, int i11) {
        Function1 function12;
        Intrinsics.checkNotNullParameter(dismiss, "dismiss");
        r rVar = (r) nVar;
        rVar.c0(-1938415781);
        if ((i11 & 4) != 0) {
            function12 = lh.a.f24846a;
        } else {
            function12 = function1;
        }
        pp.b.b(androidx.compose.foundation.layout.d.e(g1.l.f16404b, 1.0f), h0.h.a(10, 10), 0L, null, s0.g.f34069a, b1.d.c(1497678424, new z((Context) rVar.m(AndroidCompositionLocals_androidKt.f1428b), list, mVar, function12, dismiss, 6), rVar), rVar, 1572870, 60);
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new d0.y((Object) mVar, (Object) list, (ut.d) function12, dismiss, i10, i11, 16);
        }
    }

    public static void R0(long j10, boolean z10, String str) {
        if (z10) {
        } else {
            throw new IllegalArgumentException(pn.e.q(str, Long.valueOf(j10)));
        }
    }

    public static final g1.o R1(Function1 function1) {
        return h0.a(g1.l.f16404b, 8675309, new l0.c0(function1, null));
    }

    public static final void S(g1.o oVar, Widget widget, Function2 onDeeplinkActionClicked, n nVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        g1.o oVar2;
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(onDeeplinkActionClicked, "onDeeplinkActionClicked");
        r rVar = (r) nVar;
        rVar.c0(-1559525157);
        if ((i11 & 2) != 0) {
            i12 = i10 | 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.h(widget)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar.j(onDeeplinkActionClicked)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i12 & 721) == 144 && rVar.G()) {
            rVar.V();
            oVar2 = oVar;
        } else {
            int i15 = i11 & 1;
            g1.l lVar = g1.l.f16404b;
            if (i15 != 0) {
                oVar2 = lVar;
            } else {
                oVar2 = oVar;
            }
            AnalyticEvent analyticEvent = new AnalyticEvent("app_home_referral_cta_tapped", null, 2, 0 == true ? 1 : 0);
            g1.o a10 = h2.l.a(androidx.compose.ui.draw.a.g(v.e.f(lVar, 16, rVar, lVar, 1.0f), w0.u(R.drawable.refer_png, rVar, 6), null, a2.k.f98c, s0.g.f34069a, null, 54), false, a0.f24633s);
            g1.e eVar = g1.a.f16391m;
            rVar.b0(-483455358);
            l1 a11 = y.a(b0.n.f2937c, eVar, rVar, 48);
            rVar.b0(-1323940314);
            int i16 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(a10);
            if (rVar.f35166a instanceof t0.f) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t.v0(rVar, a11, c2.k.f7749e);
                t.v0(rVar, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i16))) {
                    nn.d.s(i16, rVar, i16, iVar);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                String title = widget.getTitle();
                if (title == null) {
                    title = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                float f10 = 32;
                al.d.C(title, h2.l.a(androidx.compose.foundation.layout.a.x(lVar, f10, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 14), false, a0.f24634t), w0.e(R.color.black_1A1A1A, rVar), yk.j.e1(22), null, null, jh.c.f21375d, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 1575936, 0, 130992);
                String subtitle = widget.getSubtitle();
                if (subtitle == null) {
                    subtitle = HttpUrl.FRAGMENT_ENCODE_SET;
                }
                al.d.C(subtitle, h2.l.a(androidx.compose.foundation.layout.a.x(lVar, f10, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 14), false, a0.f24635u), w0.e(R.color.grey_696969, rVar), yk.j.e1(12), null, null, jh.c.f21373b, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 1575936, 0, 130992);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 20), rVar);
                g1.o g10 = androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.a.x(lVar, f10, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 14), f10);
                float f11 = 8;
                g1.o a12 = h2.l.a(androidx.compose.ui.draw.a.b(g10, h0.h.b(f11)), false, a0.f24636v);
                float f12 = 4;
                pp.b.a(new lf.n(widget, onDeeplinkActionClicked, analyticEvent, 1), a12, false, null, null, h0.h.b(f11), null, null, new i1(f12, f12, f12, f12), b1.d.c(-700544203, new v.g(widget, 13), rVar), rVar, 905969664, 220);
                v.e.u(lVar, 48, rVar, false, true);
                rVar.s(false);
                rVar.s(false);
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new q(oVar2, widget, onDeeplinkActionClicked, i10, i11, 3);
        }
    }

    public static void S0(int i10, int i11) {
        String q10;
        if (i10 >= 0 && i10 < i11) {
            return;
        }
        if (i10 >= 0) {
            if (i11 >= 0) {
                q10 = pn.e.q("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i10), Integer.valueOf(i11));
            } else {
                throw new IllegalArgumentException(nn.d.h(26, "negative size: ", i11));
            }
        } else {
            q10 = pn.e.q("%s (%s) must not be negative", "index", Integer.valueOf(i10));
        }
        throw new IndexOutOfBoundsException(q10);
    }

    public static final void T(n nVar, int i10) {
        r rVar = (r) nVar;
        rVar.c0(-225127928);
        if (i10 == 0 && rVar.G()) {
            rVar.V();
        } else {
            w.l0 g10 = w.e.g(w.e.t(HttpUrl.FRAGMENT_ENCODE_SET, rVar, 0), 360.0f, w.e.r(w.e.x(6000, 0, e0.f38472c, 2), 0, 6), HttpUrl.FRAGMENT_ENCODE_SET, rVar, 29112, 0);
            rVar.b0(733328855);
            g1.l lVar = g1.l.f16404b;
            b0.v c10 = b0.s.c(g1.a.f16379a, false, rVar, 0);
            rVar.b0(-1323940314);
            int i11 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(lVar);
            if (rVar.f35166a instanceof t0.f) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t.v0(rVar, c10, c2.k.f7749e);
                t.v0(rVar, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i11))) {
                    nn.d.s(i11, rVar, i11, iVar);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                q1.b u10 = w0.u(R.drawable.ic_scratch_card_halo_effect, rVar, 6);
                FillElement fillElement = androidx.compose.foundation.layout.d.f1286c;
                rVar.b0(1407417503);
                boolean h10 = rVar.h(g10);
                Object Q = rVar.Q();
                if (h10 || Q == t0.m.f35080a) {
                    Q = new x(g10, 3);
                    rVar.k0(Q);
                }
                rVar.s(false);
                androidx.compose.foundation.a.c(u10, null, androidx.compose.ui.graphics.a.q(fillElement, (Function1) Q), null, null, s0.g.f34069a, null, rVar, 56, 120);
                v.e.y(rVar, false, true, false, false);
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new u(i10, 17);
        }
    }

    public static void T0(int i10, int i11) {
        if (i10 >= 0 && i10 <= i11) {
        } else {
            throw new IndexOutOfBoundsException(Q0(i10, i11, "index"));
        }
    }

    public static final void U(int i10, n nVar, List carouselItems, Function1 claimReward) {
        Intrinsics.checkNotNullParameter(carouselItems, "carouselItems");
        Intrinsics.checkNotNullParameter(claimReward, "claimReward");
        r rVar = (r) nVar;
        rVar.c0(-1729270003);
        e0.e a10 = e0.m0.a(new e0.c(2, carouselItems), rVar, 0);
        float f10 = ((((Configuration) rVar.m(AndroidCompositionLocals_androidKt.f1427a)).screenWidthDp - 200) / 2) - 0;
        float f11 = 20;
        B(a10, androidx.compose.foundation.layout.d.u(g1.l.f16404b, null, 3), new i1(f10, f11, f10, f11), null, 0, s0.g.f34069a, null, null, false, false, null, null, null, b1.d.c(-1128066129, new ob.j(carouselItems, a10, claimReward, 6), rVar), rVar, 48, 3072, 8184);
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new ac.i(i10, 1, carouselItems, claimReward);
        }
    }

    public static void U0(int i10, int i11, int i12) {
        String Q0;
        if (i10 >= 0 && i11 >= i10 && i11 <= i12) {
            return;
        }
        if (i10 >= 0 && i10 <= i12) {
            if (i11 >= 0 && i11 <= i12) {
                Q0 = pn.e.q("end index (%s) must not be less than start index (%s)", Integer.valueOf(i11), Integer.valueOf(i10));
            } else {
                Q0 = Q0(i11, i12, "end index");
            }
        } else {
            Q0 = Q0(i10, i12, "start index");
        }
        throw new IndexOutOfBoundsException(Q0);
    }

    public static final void V(int i10, n nVar, List scratchCards, Function1 onScratchCardClicked) {
        b0.i iVar;
        Intrinsics.checkNotNullParameter(scratchCards, "scratchCards");
        Intrinsics.checkNotNullParameter(onScratchCardClicked, "onScratchCardClicked");
        r rVar = (r) nVar;
        rVar.c0(-511350864);
        float f10 = 8;
        int i11 = 0;
        g1.o a10 = h2.l.a(androidx.compose.foundation.layout.a.x(androidx.compose.foundation.layout.d.e(g1.l.f16404b, 1.0f), s0.g.f34069a, f10, s0.g.f34069a, s0.g.f34069a, 13), false, vh.b.f38055i);
        if (scratchCards.size() < 4) {
            b0.d dVar = b0.n.f2935a;
            iVar = new b0.i(f10, true, new b0.l(g1.a.f16392n, i11));
        } else {
            b0.d dVar2 = b0.n.f2935a;
            iVar = new b0.i(f10, true, new b0.l(g1.a.f16391m, i11));
        }
        i0.d(a10, null, null, false, iVar, null, null, false, new lb.j(scratchCards, onScratchCardClicked, 19), rVar, 0, 238);
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new ac.i(i10, 2, scratchCards, onScratchCardClicked);
        }
    }

    public static void V0(String str, le.d dVar) {
        if (le.g.f24613a.c()) {
            Log.d("hedwig", "already connected");
            dVar.b();
            return;
        }
        byte[] bArr = kj.a.f23206a;
        fv.m mVar = new fv.m(a3.a.m(new Object[]{str}, 1, "wss://prod.stockgro.com/hedwig/socket/websocket?user_id=%s", "format(...)"));
        le.g.f24613a = mVar;
        le.e eVar = new le.e(dVar, 0);
        com.google.firebase.messaging.t tVar = mVar.f16325j;
        tVar.getClass();
        tVar.f11782b = vt.g0.J(eVar, (List) tVar.f11782b);
        fv.m mVar2 = le.g.f24613a;
        le.e eVar2 = new le.e(dVar, 1);
        mVar2.getClass();
        com.google.firebase.messaging.t tVar2 = mVar2.f16325j;
        tVar2.getClass();
        tVar2.f11783c = vt.g0.J(eVar2, (List) tVar2.f11783c);
        fv.m mVar3 = le.g.f24613a;
        le.f fVar = le.f.f24612a;
        com.google.firebase.messaging.t tVar3 = mVar3.f16325j;
        tVar3.getClass();
        tVar3.f11784d = vt.g0.J(fVar, (List) tVar3.f11784d);
        fv.m mVar4 = le.g.f24613a;
        mVar4.f16322g = le.a.f24603q;
        mVar4.b();
    }

    public static final void W(int i10, n nVar, String text) {
        int i11;
        String str;
        r rVar;
        int i12;
        Intrinsics.checkNotNullParameter(text, "text");
        r rVar2 = (r) nVar;
        rVar2.c0(-1982500605);
        if ((i10 & 14) == 0) {
            if (rVar2.h(text)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && rVar2.G()) {
            rVar2.V();
            rVar = rVar2;
        } else {
            rVar2.b0(-190071618);
            if (text.length() == 0) {
                str = hl.f.c1(R.string.no_scratch_card_sub_label, rVar2);
            } else {
                str = text;
            }
            rVar2.s(false);
            o2.v vVar = jh.c.f21373b;
            long e10 = w0.e(R.color.black_1A1A1A_40, rVar2);
            long e12 = yk.j.e1(10);
            g1.l lVar = g1.l.f16404b;
            al.d.C(str, h2.l.a(lVar, false, vh.b.f38056j), e10, e12, null, null, vVar, 0L, null, new u2.i(3), 0L, 0, false, 0, 0, null, null, rVar2, 1575936, 0, 130480);
            rVar = rVar2;
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 8), rVar);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new yb.j(text, i10, 2);
        }
    }

    public static File W0(Context context, Uri uri) {
        Cursor query;
        if (Build.VERSION.SDK_INT >= 26) {
            query = context.getContentResolver().query(uri, new String[]{"_display_name", "_size"}, null, null);
            query.moveToFirst();
            String string = query.getString(query.getColumnIndex("_display_name"));
            query.getLong(query.getColumnIndex("_size"));
            File file = new File(context.getFilesDir() + "/" + string);
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                InputStream openInputStream = context.getContentResolver().openInputStream(uri);
                byte[] bArr = new byte[UserMetadata.MAX_ATTRIBUTE_SIZE];
                while (true) {
                    int read = openInputStream.read(bArr);
                    if (read != -1) {
                        fileOutputStream.write(bArr, 0, read);
                    } else {
                        openInputStream.close();
                        fileOutputStream.close();
                        return file;
                    }
                }
            } catch (IOException e10) {
                e10.printStackTrace();
                return null;
            }
        } else {
            return null;
        }
    }

    public static final void X(int i10, n nVar, String text) {
        int i11;
        String str;
        r rVar;
        int i12;
        Intrinsics.checkNotNullParameter(text, "text");
        r rVar2 = (r) nVar;
        rVar2.c0(1894821646);
        if ((i10 & 14) == 0) {
            if (rVar2.h(text)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i11 = i12 | i10;
        } else {
            i11 = i10;
        }
        if ((i11 & 11) == 2 && rVar2.G()) {
            rVar2.V();
            rVar = rVar2;
        } else {
            rVar2.b0(279619586);
            if (text.length() == 0) {
                str = hl.f.c1(R.string.your_scratch_cards, rVar2);
            } else {
                str = text;
            }
            rVar2.s(false);
            o2.v vVar = jh.c.f21376e;
            long e10 = w0.e(R.color.black_1A1A1A, rVar2);
            long e12 = yk.j.e1(18);
            g1.l lVar = g1.l.f16404b;
            al.d.C(str, h2.l.a(lVar, false, vh.b.f38057k), e10, e12, null, null, vVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, 1575936, 0, 130992);
            rVar = rVar2;
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 4), rVar);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new yb.j(text, i10, 3);
        }
    }

    public static final int X0(int i10) {
        switch (i10) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static final void Y(g1.o oVar, uh.i uiState, th.b scratchCard, Function0 hidePopup, Function1 claimReward, n nVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        g1.o oVar2;
        boolean z10;
        g1.o oVar3;
        boolean z11;
        boolean z12;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Intrinsics.checkNotNullParameter(scratchCard, "scratchCard");
        Intrinsics.checkNotNullParameter(hidePopup, "hidePopup");
        Intrinsics.checkNotNullParameter(claimReward, "claimReward");
        r rVar = (r) nVar;
        rVar.c0(-1401437548);
        if ((i11 & 2) != 0) {
            i12 = i10 | 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.h(uiState)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar.h(scratchCard)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 7168) == 0) {
            if (rVar.j(hidePopup)) {
                i15 = 2048;
            } else {
                i15 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i12 |= i15;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 57344) == 0) {
            if (rVar.j(claimReward)) {
                i16 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i16 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i12 |= i16;
        }
        if ((46801 & i12) == 9360 && rVar.G()) {
            rVar.V();
            oVar3 = oVar;
        } else {
            int i17 = i11 & 1;
            g1.l lVar = g1.l.f16404b;
            if (i17 != 0) {
                oVar2 = lVar;
            } else {
                oVar2 = oVar;
            }
            rVar.b0(628195908);
            Object Q = rVar.Q();
            to.e eVar = t0.m.f35080a;
            if (Q == eVar) {
                Q = t.n0(Boolean.FALSE, o3.f35116a);
                rVar.k0(Q);
            }
            g1 g1Var = (g1) Q;
            rVar.s(false);
            Boolean valueOf = Boolean.valueOf(((Boolean) g1Var.getValue()).booleanValue());
            rVar.b0(628199593);
            int i18 = i12 & 7168;
            if (i18 == 2048) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object Q2 = rVar.Q();
            if (z10 || Q2 == eVar) {
                Q2 = new uh.d(hidePopup, g1Var, null);
                rVar.k0(Q2);
            }
            rVar.s(false);
            t.e(valueOf, (Function2) Q2, rVar);
            if (uiState.f37205c) {
                rVar.b0(628208592);
                if (i18 == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                Object Q3 = rVar.Q();
                if (z11 || Q3 == eVar) {
                    Q3 = v.e.n(hidePopup, 12, rVar);
                }
                rVar.s(false);
                g1.o g10 = androidx.compose.foundation.a.k(lVar, (Function0) Q3, 7).g(new uh.a());
                g1.g gVar = g1.a.f16383e;
                rVar.b0(733328855);
                b0.v c10 = b0.s.c(gVar, false, rVar, 6);
                rVar.b0(-1323940314);
                int i19 = rVar.P;
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
                    t.v0(rVar, c10, c2.k.f7749e);
                    t.v0(rVar, o10, c2.k.f7748d);
                    c2.i iVar = c2.k.f7750f;
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i19))) {
                        nn.d.s(i19, rVar, i19, iVar);
                    }
                    nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                    rVar.b0(17092570);
                    if (((Boolean) g1Var.getValue()).booleanValue()) {
                        T(rVar, 0);
                    }
                    rVar.s(false);
                    rVar.b0(17098248);
                    if ((57344 & i12) == 16384) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    Object Q4 = rVar.Q();
                    if (z12 || Q4 == eVar) {
                        Q4 = new i0.t(claimReward, g1Var, 5);
                        rVar.k0(Q4);
                    }
                    rVar.s(false);
                    zq.f.o(scratchCard, false, (Function1) Q4, rVar, (i12 >> 6) & 14, 2);
                    v.e.y(rVar, false, true, false, false);
                } else {
                    al.d.v0();
                    throw null;
                }
            }
            oVar3 = oVar2;
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new v.u(oVar3, (Object) uiState, (Object) scratchCard, (Object) hidePopup, (ut.d) claimReward, i10, i11, 8);
        }
    }

    public static e Y0(Context context) {
        a4 a4Var;
        synchronized (b.class) {
            try {
                if (f14435a == null) {
                    ek.h0 h0Var = new ek.h0((Object) null);
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    ek.q qVar = new ek.q(context, 2);
                    h0Var.f15593b = qVar;
                    f14435a = new a4(qVar);
                }
                a4Var = f14435a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return (e) ((ep.c) a4Var.f25487h).zza();
    }

    public static final void Z(g1.o oVar, MissionsHomeViewModel viewModel, Function0 onBackPress, n nVar, int i10, int i11) {
        th.b bVar;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onBackPress, "onBackPress");
        r rVar = (r) nVar;
        rVar.c0(32811881);
        if ((i11 & 1) != 0) {
            oVar = g1.l.f16404b;
        }
        g1.o oVar2 = oVar;
        g1 K0 = yk.j.K0(viewModel.A, rVar);
        iu.j.f(false, new c0.s(viewModel, onBackPress, K0, 26), rVar, 0, 1);
        if (((uh.i) K0.getValue()).f37205c && (bVar = ((uh.i) K0.getValue()).f37208f) != null) {
            u0((uh.i) K0.getValue(), bVar, viewModel, rVar, 512);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new d0.t(i10, i11, 26, oVar2, viewModel, onBackPress);
        }
    }

    public static final HashMap Z0(Widget widget, int i10) {
        Intrinsics.checkNotNullParameter(widget, "widget");
        HashMap hashMap = new HashMap();
        String title = widget.getTitle();
        if (title != null) {
            hashMap.put("section_name", title);
        }
        ListItem listItem = (ListItem) vt.g0.x(i10, widget.getListItems());
        if (listItem != null) {
            Analytics analytics = listItem.getAnalytics();
            if (analytics != null) {
                String cardType = analytics.getCardType();
                if (cardType != null) {
                    hashMap.put("card_type", cardType);
                }
                String cardSubType = analytics.getCardSubType();
                if (cardSubType != null) {
                    hashMap.put("card_sub_type", cardSubType);
                }
                String groupName = analytics.getGroupName();
                if (groupName != null) {
                    hashMap.put("group_name", groupName);
                }
            }
            String redirectionUrl = listItem.getRedirectionUrl();
            if (redirectionUrl != null) {
                hashMap.put("redirection_uri", redirectionUrl);
            }
        }
        hashMap.put("index", Integer.valueOf(i10));
        return hashMap;
    }

    public static final void a(g1.o oVar, String assetString, rj.o stockState, n nVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        g1.o oVar2;
        g1.o oVar3;
        r rVar;
        Intrinsics.checkNotNullParameter(assetString, "assetString");
        Intrinsics.checkNotNullParameter(stockState, "stockState");
        r rVar2 = (r) nVar;
        rVar2.c0(819607571);
        if ((i11 & 2) != 0) {
            i12 = i10 | 48;
        } else if ((i10 & 112) == 0) {
            if (rVar2.h(assetString)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar2.h(stockState)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        int i15 = i12;
        if ((i15 & 721) == 144 && rVar2.G()) {
            rVar2.V();
            oVar3 = oVar;
        } else {
            int i16 = i11 & 1;
            g1.l lVar = g1.l.f16404b;
            if (i16 != 0) {
                oVar2 = lVar;
            } else {
                oVar2 = oVar;
            }
            int ordinal = stockState.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        rVar2.b0(2035875707);
                        rVar2.s(false);
                    } else {
                        rVar2.b0(2035607402);
                        long e12 = yk.j.e1(36);
                        o2.v vVar = jh.c.f21384m;
                        al.d.C(assetString, androidx.compose.ui.draw.a.a(lVar, 0.1f), w0.e(R.color.black_1A1A1A, rVar2), e12, null, null, vVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, ((i15 >> 3) & 14) | 1575984, 0, 130992);
                        rVar = rVar2;
                        rVar.s(false);
                    }
                } else {
                    rVar2.b0(2035306764);
                    long e13 = yk.j.e1(36);
                    o2.v vVar2 = jh.c.f21384m;
                    al.d.C(assetString, androidx.compose.ui.draw.a.a(lVar, 0.1f), w0.e(R.color.red_FF1F11, rVar2), e13, null, null, vVar2, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, ((i15 >> 3) & 14) | 1575984, 0, 130992);
                    rVar = rVar2;
                    rVar.s(false);
                }
                rVar2 = rVar;
            } else {
                rVar2.b0(2035003274);
                long e14 = yk.j.e1(36);
                o2.v vVar3 = jh.c.f21384m;
                al.d.C(assetString, androidx.compose.ui.draw.a.a(lVar, 0.1f), w0.e(R.color.green_007B50, rVar2), e14, null, null, vVar3, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar2, ((i15 >> 3) & 14) | 1575984, 0, 130992);
                rVar2 = rVar2;
                rVar2.s(false);
            }
            oVar3 = oVar2;
        }
        x1 w10 = rVar2.w();
        if (w10 != null) {
            w10.f35245d = new d0.t(i10, i11, 23, oVar3, assetString, stockState);
        }
    }

    public static final void a0(uh.i uiState, List scratchCards, Function1 onScratchCardClicked, n nVar, int i10) {
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Intrinsics.checkNotNullParameter(scratchCards, "scratchCards");
        Intrinsics.checkNotNullParameter(onScratchCardClicked, "onScratchCardClicked");
        r rVar = (r) nVar;
        rVar.c0(-631392701);
        rVar.b0(1095249353);
        int i11 = (i10 & 14) ^ 6;
        if ((i11 > 4 && rVar.h(uiState)) || (i10 & 6) == 4) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object Q = rVar.Q();
        to.e eVar = t0.m.f35080a;
        if (z10 || Q == eVar) {
            Q = uiState.f37203a;
            rVar.k0(Q);
        }
        String str = (String) Q;
        rVar.s(false);
        rVar.b0(1095252011);
        if ((i11 > 4 && rVar.h(uiState)) || (i10 & 6) == 4) {
            z11 = true;
        } else {
            z11 = false;
        }
        Object Q2 = rVar.Q();
        if (z11 || Q2 == eVar) {
            Q2 = uiState.f37204b;
            rVar.k0(Q2);
        }
        String str2 = (String) Q2;
        rVar.s(false);
        g1.e eVar2 = g1.a.f16392n;
        rVar.b0(-483455358);
        g1.l lVar = g1.l.f16404b;
        l1 a10 = y.a(b0.n.f2937c, eVar2, rVar, 48);
        rVar.b0(-1323940314);
        int i12 = rVar.P;
        r1 o10 = rVar.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(lVar);
        if (rVar.f35166a instanceof t0.f) {
            rVar.e0();
            if (rVar.O) {
                rVar.n(jVar);
            } else {
                rVar.n0();
            }
            t.v0(rVar, a10, c2.k.f7749e);
            t.v0(rVar, o10, c2.k.f7748d);
            c2.i iVar = c2.k.f7750f;
            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i12))) {
                nn.d.s(i12, rVar, i12, iVar);
            }
            nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 16), rVar);
            X(0, rVar, str);
            W(0, rVar, str2);
            if (scratchCards.isEmpty()) {
                rVar.b0(175549062);
                K(rVar, 0);
                rVar.s(false);
            } else {
                rVar.b0(175598662);
                V(((i10 >> 3) & 112) | 8, rVar, scratchCards, onScratchCardClicked);
                rVar.s(false);
            }
            x1 t10 = da.e.t(rVar, false, true, false, false);
            if (t10 != null) {
                t10.f35245d = new n0(uiState, scratchCards, onScratchCardClicked, i10, 21);
                return;
            }
            return;
        }
        al.d.v0();
        throw null;
    }

    public static final HashMap a1(Analytics analytics, Integer num, String str, String str2, String str3) {
        String cardSubType;
        String cardType;
        HashMap hashMap = new HashMap();
        if (analytics != null && (cardType = analytics.getCardType()) != null) {
            hashMap.put("card_type", cardType);
        }
        if (analytics != null && (cardSubType = analytics.getCardSubType()) != null) {
            hashMap.put("card_sub_type", cardSubType);
        }
        if (num != null) {
            hashMap.put("index", Integer.valueOf(num.intValue()));
        }
        if (str2 != null) {
            int i10 = kj.f.f23221a;
            Intrinsics.checkNotNullParameter(str2, "<this>");
            String lowerCase = new Regex("[^\\p{L}\\p{Nd}]+").replace(str2, HttpUrl.FRAGMENT_ENCODE_SET).toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            hashMap.put("sub_section_name", lowerCase);
        }
        if (str != null) {
            hashMap.put("redirection_uri", str);
        }
        if (str3 != null) {
            hashMap.put("cta_text", str3);
        }
        return hashMap;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(g1.o r23, com.assetgro.stockgro.data.model.homedata.Widget r24, boolean r25, kotlin.jvm.functions.Function2 r26, t0.n r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.b.b(g1.o, com.assetgro.stockgro.data.model.homedata.Widget, boolean, kotlin.jvm.functions.Function2, t0.n, int, int):void");
    }

    public static final void b0(MissionsHomeViewModel viewModel, Function1 onScratchCardClicked, n nVar, int i10) {
        boolean z10;
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        Intrinsics.checkNotNullParameter(onScratchCardClicked, "onScratchCardClicked");
        r rVar = (r) nVar;
        rVar.c0(-1009484977);
        uh.i iVar = (uh.i) yk.j.K0(viewModel.A, rVar).getValue();
        rVar.b0(382883208);
        if ((((i10 & 112) ^ 48) > 32 && rVar.h(onScratchCardClicked)) || (i10 & 48) == 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        Object Q = rVar.Q();
        if (z10 || Q == t0.m.f35080a) {
            Q = new v.c0(25, onScratchCardClicked);
            rVar.k0(Q);
        }
        rVar.s(false);
        a0(iVar, viewModel.C, (Function1) Q, rVar, 0);
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new t1(viewModel, onScratchCardClicked, i10, 20);
        }
    }

    public static /* synthetic */ HashMap b1(Analytics analytics, Integer num, String str, String str2, int i10) {
        if ((i10 & 2) != 0) {
            num = null;
        }
        if ((i10 & 4) != 0) {
            str = null;
        }
        if ((i10 & 8) != 0) {
            str2 = null;
        }
        return a1(analytics, num, str, str2, null);
    }

    public static final void c(n nVar, int i10) {
        r rVar;
        r rVar2 = (r) nVar;
        rVar2.c0(194763859);
        if (i10 == 0 && rVar2.G()) {
            rVar2.V();
            rVar = rVar2;
        } else {
            e0.e a10 = e0.m0.a(hg.a.f18443a, rVar2, 384);
            g1.l lVar = g1.l.f16404b;
            g1.o e10 = androidx.compose.foundation.layout.d.e(lVar, 1.0f);
            g1.e eVar = g1.a.f16392n;
            b0.f fVar = b0.n.f2937c;
            rVar2.b0(-483455358);
            l1 a11 = y.a(fVar, eVar, rVar2, 54);
            rVar2.b0(-1323940314);
            int i11 = rVar2.P;
            r1 o10 = rVar2.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(e10);
            if (rVar2.f35166a instanceof t0.f) {
                rVar2.e0();
                if (rVar2.O) {
                    rVar2.n(jVar);
                } else {
                    rVar2.n0();
                }
                t.v0(rVar2, a11, c2.k.f7749e);
                t.v0(rVar2, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i11))) {
                    nn.d.s(i11, rVar2, i11, iVar);
                }
                nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
                float f10 = 24;
                B(a10, lVar, androidx.compose.foundation.layout.a.b(f10, s0.g.f34069a, f10, s0.g.f34069a, 10), null, 0, 12, g1.a.f16388j, null, false, false, null, null, null, hg.h.f18455a, rVar2, 1769904, 3072, 8088);
                rVar = rVar2;
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 16), rVar);
                C(3, a10.f14718d.f14650b.i(), null, rVar, 6, 4);
                v.e.y(rVar, false, true, false, false);
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new u(i10, 12);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00da, code lost:
    
        if ((r25 & 16) != 0) goto L79;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c0(l0.n r16, boolean r17, u2.h r18, boolean r19, long r20, g1.o r22, t0.n r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.b.c0(l0.n, boolean, u2.h, boolean, long, g1.o, t0.n, int, int):void");
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, vl.b] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, vl.b] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, vl.b] */
    public static vl.b c1(int i10) {
        if (i10 != 0) {
            if (i10 != 1) {
                return new Object();
            }
            return new Object();
        }
        return new Object();
    }

    public static final void d(List items, n nVar, int i10) {
        Intrinsics.checkNotNullParameter(items, "items");
        r rVar = (r) nVar;
        rVar.c0(746742451);
        i0.c(null, null, null, false, null, null, null, false, new hg.d(items), rVar, 0, 255);
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new zb.f(i10, 1, items);
        }
    }

    public static final void d0(g1.o oVar, Function0 function0, boolean z10, n nVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        r rVar = (r) nVar;
        rVar.c0(2111672474);
        if ((i10 & 6) == 0) {
            if (rVar.h(oVar)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar.j(function0)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (rVar.i(z10)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) == 146 && rVar.G()) {
            rVar.V();
        } else {
            androidx.compose.foundation.layout.a.c(t.H(androidx.compose.foundation.layout.d.n(oVar, l0.e0.f23744a, l0.e0.f23745b), d2.s.f13613k, new l0.h(0, function0, z10)), rVar);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new l0.f(oVar, function0, z10, i10);
        }
    }

    public static to.e d1() {
        return new to.e(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x024a  */
    /* JADX WARN: Type inference failed for: r3v37 */
    /* JADX WARN: Type inference failed for: r3v39, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r3v46 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(kotlin.jvm.functions.Function0 r31, g1.o r32, boolean r33, n1.x0 r34, r0.y r35, r0.c0 r36, x.d0 r37, b0.h1 r38, a0.l r39, hu.c r40, t0.n r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.b.e(kotlin.jvm.functions.Function0, g1.o, boolean, n1.x0, r0.y, r0.c0, x.d0, b0.h1, a0.l, hu.c, t0.n, int, int):void");
    }

    public static final void e0(n nVar, int i10) {
        r rVar = (r) nVar;
        rVar.c0(-168941601);
        if (i10 == 0 && rVar.G()) {
            rVar.V();
        } else {
            pp.b.b(h2.l.a(androidx.compose.foundation.layout.a.f(androidx.compose.foundation.layout.d.q(androidx.compose.foundation.layout.a.t(g1.l.f16404b, 6), 280), 1.28f), false, a0.f24639y), h0.h.b(12), n1.t.f28173e, null, 4, b1.d.c(237115650, new lf.e0(al.d.s(true, rVar, 6, 6), 0), rVar), rVar, 1769856, 24);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new u(i10, 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0026, code lost:
    
        if (r1 > r6.getHeight()) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final n1.h0 e1(k1.d r25, float r26) {
        /*
            Method dump skipped, instructions count: 217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.b.e1(k1.d, float):n1.h0");
    }

    public static final void f(g1.o oVar, Widget widget, Function2 onDeeplinkActionClicked, n nVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        g1.o oVar2;
        boolean z10;
        boolean z11;
        g1.o oVar3;
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(onDeeplinkActionClicked, "onDeeplinkActionClicked");
        r rVar = (r) nVar;
        rVar.c0(244855599);
        if ((i11 & 2) != 0) {
            i12 = i10 | 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.h(widget)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar.j(onDeeplinkActionClicked)) {
                i14 = 256;
            } else {
                i14 = 128;
            }
            i12 |= i14;
        }
        if ((i12 & 721) == 144 && rVar.G()) {
            rVar.V();
            oVar3 = oVar;
        } else {
            int i15 = i11 & 1;
            g1.l lVar = g1.l.f16404b;
            if (i15 != 0) {
                oVar2 = lVar;
            } else {
                oVar2 = oVar;
            }
            g1.e eVar = g1.a.f16392n;
            rVar.b0(-483455358);
            l1 a10 = y.a(b0.n.f2937c, eVar, rVar, 48);
            rVar.b0(-1323940314);
            int i16 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(lVar);
            if (rVar.f35166a instanceof t0.f) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t.v0(rVar, a10, c2.k.f7749e);
                t.v0(rVar, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i16))) {
                    nn.d.s(i16, rVar, i16, iVar);
                }
                int i17 = 0;
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                g1.o e10 = androidx.compose.foundation.layout.d.e(lVar, 1.0f);
                rVar.b0(1192936127);
                if ((i12 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i12 & 896) == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z12 = z11 | z10;
                Object Q = rVar.Q();
                if (z12 || Q == t0.m.f35080a) {
                    Q = new lf.p(widget, onDeeplinkActionClicked, i17);
                    rVar.k0(Q);
                }
                rVar.s(false);
                y2.m.b((Function1) Q, e10, null, rVar, 48, 4);
                v.e.u(lVar, 32, rVar, false, true);
                rVar.s(false);
                rVar.s(false);
                oVar3 = oVar2;
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new q(oVar3, widget, onDeeplinkActionClicked, i10, i11, 0);
        }
    }

    public static final void f0(n nVar, int i10) {
        r rVar = (r) nVar;
        rVar.c0(-904232989);
        if (i10 == 0 && rVar.G()) {
            rVar.V();
        } else {
            n1.j0 s7 = al.d.s(false, rVar, 0, 7);
            g1.l lVar = g1.l.f16404b;
            g1.o a10 = h2.l.a(androidx.compose.foundation.layout.d.e(lVar, 1.0f), false, a0.A);
            g1.f fVar = g1.a.f16389k;
            rVar.b0(693286680);
            l1 a11 = o1.a(b0.n.f2935a, fVar, rVar, 48);
            rVar.b0(-1323940314);
            int i11 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(a10);
            boolean z10 = rVar.f35166a instanceof t0.f;
            if (z10) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                c2.i iVar = c2.k.f7749e;
                t.v0(rVar, a11, iVar);
                c2.i iVar2 = c2.k.f7748d;
                t.v0(rVar, o10, iVar2);
                c2.i iVar3 = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i11))) {
                    nn.d.s(i11, rVar, i11, iVar3);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                g1.o a12 = h2.l.a(lVar, false, a0.B);
                rVar.b0(-483455358);
                l1 a13 = y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
                rVar.b0(-1323940314);
                int i12 = rVar.P;
                r1 o11 = rVar.o();
                b1.c j11 = androidx.compose.ui.layout.a.j(a12);
                if (z10) {
                    rVar.e0();
                    if (rVar.O) {
                        rVar.n(jVar);
                    } else {
                        rVar.n0();
                    }
                    t.v0(rVar, a13, iVar);
                    t.v0(rVar, o11, iVar2);
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i12))) {
                        nn.d.s(i12, rVar, i12, iVar3);
                    }
                    nn.d.q(0, j11, new m2(rVar), rVar, 2058660585);
                    b0.s.a(h2.l.a(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.g(lVar, 14), 0.5f), s7, null, 6), false, a0.C), rVar, 0);
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 2), rVar);
                    float f10 = 12;
                    da.e.w(h2.l.a(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.d.g(lVar, f10), 0.75f), s7, null, 6), false, a0.D), rVar, 0, false, true);
                    rVar.s(false);
                    rVar.s(false);
                    if (1.0f > 0.0d) {
                        androidx.compose.foundation.layout.a.c(new LayoutWeightElement(kotlin.ranges.d.c(1.0f, Float.MAX_VALUE), true), rVar);
                        da.e.w(h2.l.a(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.q(androidx.compose.foundation.layout.d.g(lVar, f10), 75), s7, null, 6), false, a0.E), rVar, 0, false, true);
                        rVar.s(false);
                        rVar.s(false);
                    } else {
                        throw new IllegalArgumentException(jr.h.m("invalid weight ", 1.0f, "; must be greater than zero").toString());
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
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new u(i10, 9);
        }
    }

    public static final long f1() {
        return Thread.currentThread().getId();
    }

    public static final void g(PortfolioFnoHoldingsViewModel viewModel, n nVar, int i10) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        r rVar = (r) nVar;
        rVar.c0(-732618979);
        ArrayList arrayList = viewModel.f9828q;
        androidx.compose.ui.graphics.a.d(4283048166L);
        androidx.compose.ui.graphics.a.d(4291547647L);
        e0.e a10 = e0.m0.a(new e0.c(1, arrayList), rVar, 0);
        rVar.b0(773894976);
        rVar.b0(-723523240);
        Object Q = rVar.Q();
        if (Q == t0.m.f35080a) {
            Q = v.e.o(t.I(kotlin.coroutines.k.f23369a, rVar), rVar);
        }
        rVar.s(false);
        f0 f0Var = ((d0) Q).f34970a;
        rVar.s(false);
        rVar.b0(-483455358);
        g1.l lVar = g1.l.f16404b;
        l1 a11 = y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
        rVar.b0(-1323940314);
        int i11 = rVar.P;
        r1 o10 = rVar.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(lVar);
        if (rVar.f35166a instanceof t0.f) {
            rVar.e0();
            if (rVar.O) {
                rVar.n(jVar);
            } else {
                rVar.n0();
            }
            t.v0(rVar, a11, c2.k.f7749e);
            t.v0(rVar, o10, c2.k.f7748d);
            c2.i iVar = c2.k.f7750f;
            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i11))) {
                nn.d.s(i11, rVar, i11, iVar);
            }
            nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
            float f10 = 8;
            k3.a(a10.f14718d.f14650b.i(), androidx.compose.foundation.layout.d.g(androidx.compose.foundation.a.g(androidx.compose.ui.draw.a.b(lVar, h0.h.b(f10)), 1, n1.t.f28172d, h0.h.b(f10)), 48), 0L, 0L, 0, pg.b.f31019d, null, b1.d.c(-1993019917, new m0.o0(15, arrayList, a10, f0Var), rVar), rVar, 12804096, 76);
            B(a10, null, null, null, 0, s0.g.f34069a, null, null, false, false, null, null, null, b1.d.c(-1155615179, new ob.j(3, viewModel, a10, arrayList), rVar), rVar, 0, 3072, 8190);
            int i12 = 0;
            v.e.u(lVar, 60, rVar, false, true);
            rVar.s(false);
            rVar.s(false);
            x1 w10 = rVar.w();
            if (w10 != null) {
                w10.f35245d = new pg.e(viewModel, i10, i12);
                return;
            }
            return;
        }
        al.d.v0();
        throw null;
    }

    public static final void g0(n nVar, int i10) {
        r rVar = (r) nVar;
        rVar.c0(238431194);
        if (i10 == 0 && rVar.G()) {
            rVar.V();
        } else {
            n1.j0 s7 = al.d.s(true, rVar, 6, 6);
            float f10 = 8;
            g1.o e10 = androidx.compose.foundation.a.e(androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.q(androidx.compose.foundation.layout.a.x(g1.l.f16404b, s0.g.f34069a, s0.g.f34069a, 6, s0.g.f34069a, 11), 92), 128), h0.h.b(f10)), n1.t.f28173e, h0.h.b(f10));
            rVar.b0(-483455358);
            l1 a10 = y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
            rVar.b0(-1323940314);
            int i11 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(e10);
            if (rVar.f35166a instanceof t0.f) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t.v0(rVar, a10, c2.k.f7749e);
                t.v0(rVar, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i11))) {
                    nn.d.s(i11, rVar, i11, iVar);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                da.e.w(androidx.compose.foundation.a.d(androidx.compose.foundation.layout.d.f1286c, s7, null, 6), rVar, 0, false, true);
                rVar.s(false);
                rVar.s(false);
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new u(i10, 10);
        }
    }

    public static final boolean g1(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0183, code lost:
    
        if (r1 == null) goto L99;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0078  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void h(g1.o r26, com.assetgro.stockgro.data.model.homedata.ListItem r27, int r28, kotlin.jvm.functions.Function2 r29, com.assetgro.stockgro.data.model.homedata.Widget r30, int r31, t0.n r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.b.h(g1.o, com.assetgro.stockgro.data.model.homedata.ListItem, int, kotlin.jvm.functions.Function2, com.assetgro.stockgro.data.model.homedata.Widget, int, t0.n, int, int):void");
    }

    public static final void h0(n nVar, int i10) {
        r rVar = (r) nVar;
        rVar.c0(1356524899);
        if (i10 == 0 && rVar.G()) {
            rVar.V();
        } else {
            n1.j0 s7 = al.d.s(true, rVar, 6, 6);
            g1.l lVar = g1.l.f16404b;
            g1.o a10 = h2.l.a(androidx.compose.foundation.layout.a.x(lVar, s0.g.f34069a, s0.g.f34069a, 6, s0.g.f34069a, 11), false, lf.f0.f24693b);
            rVar.b0(-483455358);
            l1 a11 = y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
            rVar.b0(-1323940314);
            int i11 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(a10);
            boolean z10 = rVar.f35166a instanceof t0.f;
            if (z10) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                c2.i iVar = c2.k.f7749e;
                t.v0(rVar, a11, iVar);
                c2.i iVar2 = c2.k.f7748d;
                t.v0(rVar, o10, iVar2);
                c2.i iVar3 = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i11))) {
                    nn.d.s(i11, rVar, i11, iVar3);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                g1.o d10 = androidx.compose.foundation.a.d(androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.q(lVar, 143), 80), h0.h.b(12)), s7, null, 6);
                rVar.b0(733328855);
                b0.v c10 = b0.s.c(g1.a.f16379a, false, rVar, 0);
                rVar.b0(-1323940314);
                int i12 = rVar.P;
                r1 o11 = rVar.o();
                b1.c j11 = androidx.compose.ui.layout.a.j(d10);
                if (z10) {
                    rVar.e0();
                    if (rVar.O) {
                        rVar.n(jVar);
                    } else {
                        rVar.n0();
                    }
                    t.v0(rVar, c10, iVar);
                    t.v0(rVar, o11, iVar2);
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i12))) {
                        nn.d.s(i12, rVar, i12, iVar3);
                    }
                    nn.d.q(0, j11, new m2(rVar), rVar, 2058660585);
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
            w10.f35245d = new u(i10, 11);
        }
    }

    public static final boolean h1(int i10, int i11) {
        return i10 == i11;
    }

    public static final void i(g1.o oVar, Widget widget, Function2 onDeeplinkActionClicked, n nVar, int i10, int i11) {
        g1.o oVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        g1.o oVar3;
        boolean z10;
        boolean z11;
        boolean z12;
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(onDeeplinkActionClicked, "onDeeplinkActionClicked");
        r rVar = (r) nVar;
        rVar.c0(-108946741);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
            oVar2 = oVar;
        } else if ((i10 & 14) == 0) {
            oVar2 = oVar;
            if (rVar.h(oVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            oVar2 = oVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.h(widget)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar.j(onDeeplinkActionClicked)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 731) == 146 && rVar.G()) {
            rVar.V();
            oVar3 = oVar2;
        } else {
            g1.l lVar = g1.l.f16404b;
            if (i16 != 0) {
                oVar3 = lVar;
            } else {
                oVar3 = oVar2;
            }
            m0 a10 = p0.a(rVar);
            rVar.b0(-483455358);
            int i17 = 0;
            l1 a11 = y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
            rVar.b0(-1323940314);
            int i18 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(lVar);
            if (rVar.f35166a instanceof t0.f) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t.v0(rVar, a11, c2.k.f7749e);
                t.v0(rVar, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i18))) {
                    nn.d.s(i18, rVar, i18, iVar);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                int i19 = i12 & 896;
                z(widget, h2.l.a(oVar3, false, lf.d.f24675u), onDeeplinkActionClicked, rVar, ((i12 >> 3) & 14) | i19);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(oVar3, 20), rVar);
                g1.o a12 = h2.l.a(androidx.compose.foundation.layout.d.e(lVar, 1.0f), false, lf.d.f24676v);
                rVar.b0(994994487);
                if ((i12 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i12 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z13 = z11 | z10;
                if (i19 == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z14 = z13 | z12;
                Object Q = rVar.Q();
                if (z14 || Q == t0.m.f35080a) {
                    Q = new v(widget, oVar3, onDeeplinkActionClicked, i17);
                    rVar.k0(Q);
                }
                rVar.s(false);
                i0.d(a12, a10, null, false, null, null, null, false, (Function1) Q, rVar, 0, 252);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(oVar3, 32), rVar);
                rVar.s(false);
                rVar.s(true);
                rVar.s(false);
                rVar.s(false);
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new q(oVar3, widget, onDeeplinkActionClicked, i10, i11, 1);
        }
    }

    public static final void i0(g1.o oVar, Function2 function2, n nVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        r rVar = (r) nVar;
        rVar.c0(-2105228848);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (rVar.h(oVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (rVar.j(function2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 19) == 18 && rVar.G()) {
            rVar.V();
        } else {
            if (i15 != 0) {
                oVar = g1.l.f16404b;
            }
            l0.o0 o0Var = l0.o0.f23799a;
            int i16 = ((i12 << 3) & 112) | ((i12 >> 3) & 14) | 384;
            rVar.b0(-1323940314);
            int i17 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(oVar);
            int i18 = ((i16 << 9) & 7168) | 6;
            if (rVar.f35166a instanceof t0.f) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t.v0(rVar, o0Var, c2.k.f7749e);
                t.v0(rVar, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i17))) {
                    nn.d.s(i17, rVar, i17, iVar);
                }
                nn.d.q((i18 >> 3) & 112, j10, new m2(rVar), rVar, 2058660585);
                com.google.android.gms.internal.p002firebaseauthapi.a.p((i18 >> 9) & 14, function2, rVar, false, true);
                rVar.s(false);
            } else {
                al.d.v0();
                throw null;
            }
        }
        g1.o oVar2 = oVar;
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new l0.p0(oVar2, function2, i10, i11, 0);
        }
    }

    public static boolean i1(String str, String str2) {
        char c10;
        int length = str.length();
        if (str == str2) {
            return true;
        }
        if (length != str2.length()) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (str.charAt(i10) != str2.charAt(i10) && ((c10 = (char) ((r4 | ' ') - 97)) >= 26 || c10 != ((char) ((r5 | ' ') - 97)))) {
                return false;
            }
        }
        return true;
    }

    public static final void j(g1.o oVar, ListItem listItem, Function2 onDeeplinkActionClicked, Widget widget, int i10, n nVar, int i11, int i12) {
        g1.o oVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        g1.o oVar3;
        r rVar;
        g1.o oVar4;
        Intrinsics.checkNotNullParameter(listItem, "listItem");
        Intrinsics.checkNotNullParameter(onDeeplinkActionClicked, "onDeeplinkActionClicked");
        Intrinsics.checkNotNullParameter(widget, "widget");
        r rVar2 = (r) nVar;
        rVar2.c0(-1075459996);
        int i19 = i12 & 1;
        if (i19 != 0) {
            i13 = i11 | 6;
            oVar2 = oVar;
        } else if ((i11 & 14) == 0) {
            oVar2 = oVar;
            if (rVar2.h(oVar2)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            oVar2 = oVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (rVar2.h(listItem)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 896) == 0) {
            if (rVar2.j(onDeeplinkActionClicked)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i13 |= i16;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            if (rVar2.h(widget)) {
                i17 = 2048;
            } else {
                i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i13 |= i17;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((57344 & i11) == 0) {
            if (rVar2.f(i10)) {
                i18 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i18 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i13 |= i18;
        }
        if ((i13 & 46811) == 9362 && rVar2.G()) {
            rVar2.V();
            oVar4 = oVar2;
            rVar = rVar2;
        } else {
            g1.l lVar = g1.l.f16404b;
            if (i19 != 0) {
                oVar3 = lVar;
            } else {
                oVar3 = oVar2;
            }
            rVar = rVar2;
            pp.b.b(h2.l.a(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.q(lVar, 250), 120), false, lf.d.f24677w), h0.h.b(12), n1.t.f28173e, null, 4, b1.d.c(966948615, new v.y(onDeeplinkActionClicked, listItem, new AnalyticEvent("app_home_card_tapped", Z0(widget, i10)), oVar3, 3), rVar2), rVar, 1769856, 24);
            oVar4 = oVar3;
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new lf.w(oVar4, listItem, onDeeplinkActionClicked, widget, i10, i11, i12, 0);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void j0(kh.m r31, kh.m r32, kotlin.jvm.functions.Function1 r33, kotlin.jvm.functions.Function0 r34, t0.n r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 701
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.b.j0(kh.m, kh.m, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function0, t0.n, int, int):void");
    }

    public static final androidx.fragment.app.g0 j1(View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        androidx.fragment.app.g0 D = d1.D(view);
        if (D != null) {
            Intrinsics.checkNotNullExpressionValue(D, "findFragment(this)");
            return D;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void k(g1.o r22, com.assetgro.stockgro.data.model.homedata.Widget r23, boolean r24, kotlin.jvm.functions.Function2 r25, t0.n r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.b.k(g1.o, com.assetgro.stockgro.data.model.homedata.Widget, boolean, kotlin.jvm.functions.Function2, t0.n, int, int):void");
    }

    public static final void k0(Boolean bool, n nVar, int i10, int i11) {
        int i12;
        int i13;
        r rVar = (r) nVar;
        rVar.c0(453104873);
        int i14 = i11 & 1;
        if (i14 != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            if (rVar.h(bool)) {
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
                bool = Boolean.FALSE;
            }
            pp.b.b(androidx.compose.foundation.layout.d.e(g1.l.f16404b, 1.0f), h0.h.a(10, 10), 0L, null, s0.g.f34069a, b1.d.c(-1336946612, new ga.i(bool, 1), rVar), rVar, 1572870, 60);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new b0(bool, i10, i11, 3);
        }
    }

    public static String k1(String str) {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(str.getBytes());
        byte[] digest = messageDigest.digest();
        StringBuffer stringBuffer = new StringBuffer();
        for (byte b10 : digest) {
            stringBuffer.append(Integer.toHexString(b10 & 255));
        }
        return stringBuffer.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void l(g1.o r24, boolean r25, kotlin.jvm.functions.Function0 r26, kotlin.jvm.functions.Function2 r27, long r28, long r30, t0.n r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.b.l(g1.o, boolean, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function2, long, long, t0.n, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void l0(g1.o r26, com.assetgro.stockgro.data.model.homedata.ListItem r27, int r28, kotlin.jvm.functions.Function2 r29, com.assetgro.stockgro.data.model.homedata.Widget r30, int r31, t0.n r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 413
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.b.l0(g1.o, com.assetgro.stockgro.data.model.homedata.ListItem, int, kotlin.jvm.functions.Function2, com.assetgro.stockgro.data.model.homedata.Widget, int, t0.n, int, int):void");
    }

    public static ColorStateList l1(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        ColorStateList colorStateList;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (colorStateList = r3.k.getColorStateList(context, resourceId)) != null) {
            return colorStateList;
        }
        return typedArray.getColorStateList(i10);
    }

    public static final void m(g1.o oVar, rj.o stockState, n nVar, int i10, int i11) {
        g1.o oVar2;
        int i12;
        int i13;
        int i14;
        g1.o oVar3;
        Intrinsics.checkNotNullParameter(stockState, "stockState");
        r rVar = (r) nVar;
        rVar.c0(921562880);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
            oVar2 = oVar;
        } else if ((i10 & 14) == 0) {
            oVar2 = oVar;
            if (rVar.h(oVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            oVar2 = oVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.h(stockState)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 91) == 18 && rVar.G()) {
            rVar.V();
            oVar3 = oVar2;
        } else {
            if (i15 != 0) {
                oVar3 = g1.l.f16404b;
            } else {
                oVar3 = oVar2;
            }
            int ordinal = stockState.ordinal();
            androidx.work.u uVar = a2.k.f98c;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        rVar.b0(1085452859);
                        rVar.s(false);
                    } else {
                        rVar.b0(1085444985);
                        rVar.s(false);
                    }
                } else {
                    rVar.b0(1085129684);
                    al.d.z(R.drawable.ic_surface_negative, uVar, androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.e(oVar3, 1.0f), 60), 0L, rVar, 54, 8);
                    rVar.s(false);
                }
            } else {
                rVar.b0(1084804308);
                al.d.z(R.drawable.ic_surface_positive, uVar, androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.e(oVar3, 1.0f), 60), 0L, rVar, 54, 8);
                rVar.s(false);
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new hf.b0(oVar3, stockState, i10, i11, 0);
        }
    }

    public static final void m0(g1.o oVar, Widget widget, Function2 onDeeplinkActionClicked, n nVar, int i10, int i11) {
        g1.o oVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        g1.o oVar3;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        g1.o oVar4;
        g1.l lVar;
        int i16;
        r rVar;
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(onDeeplinkActionClicked, "onDeeplinkActionClicked");
        r rVar2 = (r) nVar;
        rVar2.c0(-308198582);
        int i17 = i11 & 1;
        if (i17 != 0) {
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
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar2.h(widget)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar2.j(onDeeplinkActionClicked)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 731) == 146 && rVar2.G()) {
            rVar2.V();
            oVar4 = oVar2;
            rVar = rVar2;
        } else {
            g1.l lVar2 = g1.l.f16404b;
            if (i17 != 0) {
                oVar3 = lVar2;
            } else {
                oVar3 = oVar2;
            }
            m0 a10 = p0.a(rVar2);
            g1.o a11 = h2.l.a(lVar2, false, lf.f0.f24701j);
            rVar2.b0(-483455358);
            l1 a12 = y.a(b0.n.f2937c, g1.a.f16391m, rVar2, 0);
            rVar2.b0(-1323940314);
            int i18 = rVar2.P;
            r1 o10 = rVar2.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(a11);
            if (rVar2.f35166a instanceof t0.f) {
                rVar2.e0();
                if (rVar2.O) {
                    rVar2.n(jVar);
                } else {
                    rVar2.n0();
                }
                t.v0(rVar2, a12, c2.k.f7749e);
                t.v0(rVar2, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i18))) {
                    nn.d.s(i18, rVar2, i18, iVar);
                }
                nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
                int i19 = i12 & 896;
                z(widget, h2.l.a(oVar3, false, lf.f0.f24702k), onDeeplinkActionClicked, rVar2, ((i12 >> 3) & 14) | i19);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar2, 20), rVar2);
                if (widget.getListItems().size() == 1) {
                    rVar2.b0(844505718);
                    E(h2.l.a(oVar3, false, lf.f0.f24703l), widget.getListItems().get(0), onDeeplinkActionClicked, widget, 0, rVar2, i19 | 24576 | ((i12 << 6) & 7168), 0);
                    rVar2.s(false);
                    z13 = false;
                    oVar4 = oVar3;
                    lVar = lVar2;
                    i16 = 32;
                    rVar = rVar2;
                } else {
                    rVar2.b0(844855150);
                    g1.o a13 = h2.l.a(androidx.compose.foundation.layout.d.e(lVar2, 1.0f), false, lf.f0.f24704m);
                    rVar2.b0(165806108);
                    if ((i12 & 112) == 32) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if ((i12 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean z14 = z11 | z10;
                    if (i19 == 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z15 = z14 | z12;
                    Object Q = rVar2.Q();
                    if (z15 || Q == t0.m.f35080a) {
                        Q = new v(widget, oVar3, onDeeplinkActionClicked, 3);
                        rVar2.k0(Q);
                    }
                    Function1 function1 = (Function1) Q;
                    rVar2.s(false);
                    z13 = false;
                    oVar4 = oVar3;
                    lVar = lVar2;
                    i16 = 32;
                    rVar = rVar2;
                    i0.d(a13, a10, null, false, null, null, null, false, function1, rVar, 0, 252);
                    rVar.s(false);
                }
                v.e.u(lVar, i16, rVar, z13, true);
                rVar.s(z13);
                rVar.s(z13);
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new q(oVar4, widget, onDeeplinkActionClicked, i10, i11, 4);
        }
    }

    public static ColorStateList m1(Context context, h.c cVar, int i10) {
        int C;
        ColorStateList colorStateList;
        if (cVar.H(i10) && (C = cVar.C(i10, 0)) != 0 && (colorStateList = r3.k.getColorStateList(context, C)) != null) {
            return colorStateList;
        }
        return cVar.r(i10);
    }

    public static final void n(g1.o oVar, rj.o stockState, n nVar, int i10, int i11) {
        g1.o oVar2;
        int i12;
        int i13;
        int i14;
        g1.o oVar3;
        Intrinsics.checkNotNullParameter(stockState, "stockState");
        r rVar = (r) nVar;
        rVar.c0(-2014303803);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
            oVar2 = oVar;
        } else if ((i10 & 14) == 0) {
            oVar2 = oVar;
            if (rVar.h(oVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            oVar2 = oVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.h(stockState)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 91) == 18 && rVar.G()) {
            rVar.V();
            oVar3 = oVar2;
        } else {
            if (i15 != 0) {
                oVar3 = g1.l.f16404b;
            } else {
                oVar3 = oVar2;
            }
            int ordinal = stockState.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        rVar.b0(-641507142);
                        rVar.s(false);
                    } else {
                        rVar.b0(-641515016);
                        rVar.s(false);
                    }
                } else {
                    rVar.b0(-641705387);
                    al.d.z(R.drawable.ic_stock_trade_down, null, androidx.compose.foundation.layout.d.m(oVar3, 10), 0L, rVar, 6, 10);
                    rVar.s(false);
                }
            } else {
                rVar.b0(-641899881);
                al.d.z(R.drawable.ic_stock_trade_up, null, androidx.compose.foundation.layout.d.m(oVar3, 10), 0L, rVar, 6, 10);
                rVar.s(false);
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new hf.b0(oVar3, stockState, i10, i11, 1);
        }
    }

    public static final void n0(g1.o oVar, ListItem listItem, Function2 onDeeplinkActionClicked, Widget widget, int i10, n nVar, int i11, int i12) {
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        g1.o oVar2;
        Intrinsics.checkNotNullParameter(listItem, "listItem");
        Intrinsics.checkNotNullParameter(onDeeplinkActionClicked, "onDeeplinkActionClicked");
        Intrinsics.checkNotNullParameter(widget, "widget");
        r rVar = (r) nVar;
        rVar.c0(1670512308);
        if ((i12 & 2) != 0) {
            i13 = i11 | 48;
        } else if ((i11 & 112) == 0) {
            if (rVar.h(listItem)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i13 = i14 | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 896) == 0) {
            if (rVar.j(onDeeplinkActionClicked)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i13 |= i15;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            if (rVar.h(widget)) {
                i16 = 2048;
            } else {
                i16 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i13 |= i16;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((57344 & i11) == 0) {
            if (rVar.f(i10)) {
                i17 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i17 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i13 |= i17;
        }
        if ((i13 & 46801) == 9360 && rVar.G()) {
            rVar.V();
            oVar2 = oVar;
        } else {
            int i18 = i12 & 1;
            g1.l lVar = g1.l.f16404b;
            if (i18 != 0) {
                oVar2 = lVar;
            } else {
                oVar2 = oVar;
            }
            pp.b.b(h2.l.a(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.q(androidx.compose.foundation.layout.a.x(lVar, s0.g.f34069a, s0.g.f34069a, 6, s0.g.f34069a, 11), 92), 128), false, lf.f0.f24705n), h0.h.b(8), n1.t.f28173e, null, 4, b1.d.c(560669809, new n0(i10, new AnalyticEvent("app_home_card_tapped", Z0(widget, i10)), listItem, onDeeplinkActionClicked), rVar), rVar, 1769856, 24);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new lf.w(oVar2, listItem, onDeeplinkActionClicked, widget, i10, i11, i12, 2);
        }
    }

    public static int n1(Context context, TypedArray typedArray, int i10, int i11) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i10, typedValue) && typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i11);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i10, i11);
    }

    public static final void o(g1.o oVar, rj.o stockState, n nVar, int i10, int i11) {
        g1.o oVar2;
        int i12;
        int i13;
        int i14;
        g1.o oVar3;
        Intrinsics.checkNotNullParameter(stockState, "stockState");
        r rVar = (r) nVar;
        rVar.c0(-431234539);
        int i15 = i11 & 1;
        if (i15 != 0) {
            i12 = i10 | 6;
            oVar2 = oVar;
        } else if ((i10 & 14) == 0) {
            oVar2 = oVar;
            if (rVar.h(oVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            oVar2 = oVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.h(stockState)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i12 & 91) == 18 && rVar.G()) {
            rVar.V();
            oVar3 = oVar2;
        } else {
            if (i15 != 0) {
                oVar3 = g1.l.f16404b;
            } else {
                oVar3 = oVar2;
            }
            int ordinal = stockState.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        rVar.b0(803040070);
                        rVar.s(false);
                    } else {
                        rVar.b0(803032196);
                        rVar.s(false);
                    }
                } else {
                    rVar.b0(802834137);
                    al.d.z(R.drawable.ic_portfolio_arrow_downward, null, androidx.compose.foundation.layout.d.m(oVar3, 13), 0L, rVar, 6, 10);
                    rVar.s(false);
                }
            } else {
                rVar.b0(802631707);
                al.d.z(R.drawable.ic_portfolio_arrow_upward, null, androidx.compose.foundation.layout.d.m(oVar3, 13), 0L, rVar, 6, 10);
                rVar.s(false);
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new hf.b0(oVar3, stockState, i10, i11, 2);
        }
    }

    public static final void o0(g1.o oVar, Widget widget, Function2 onDeeplinkActionClicked, n nVar, int i10, int i11) {
        g1.o oVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        g1.o oVar3;
        boolean z10;
        boolean z11;
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(onDeeplinkActionClicked, "onDeeplinkActionClicked");
        r rVar = (r) nVar;
        rVar.c0(-601293020);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
            oVar2 = oVar;
        } else if ((i10 & 14) == 0) {
            oVar2 = oVar;
            if (rVar.h(oVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            oVar2 = oVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.h(widget)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar.j(onDeeplinkActionClicked)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 731) == 146 && rVar.G()) {
            rVar.V();
            oVar3 = oVar2;
        } else {
            g1.l lVar = g1.l.f16404b;
            if (i16 != 0) {
                oVar3 = lVar;
            } else {
                oVar3 = oVar2;
            }
            m0 a10 = p0.a(rVar);
            g1.o a11 = h2.l.a(lVar, false, lf.f0.f24706o);
            rVar.b0(-483455358);
            l1 a12 = y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
            rVar.b0(-1323940314);
            int i17 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(a11);
            if (rVar.f35166a instanceof t0.f) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t.v0(rVar, a12, c2.k.f7749e);
                t.v0(rVar, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i17))) {
                    nn.d.s(i17, rVar, i17, iVar);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                int i18 = i12 & 896;
                z(widget, h2.l.a(oVar3, false, lf.f0.f24707p), onDeeplinkActionClicked, rVar, ((i12 >> 3) & 14) | i18);
                g1.o a13 = h2.l.a(v.e.f(lVar, 20, rVar, lVar, 1.0f), false, lf.f0.f24708q);
                rVar.b0(-330761416);
                int i19 = 1;
                if ((i12 & 112) == 32) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (i18 == 256) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z12 = z10 | z11;
                Object Q = rVar.Q();
                if (z12 || Q == t0.m.f35080a) {
                    Q = new lf.p(widget, onDeeplinkActionClicked, i19);
                    rVar.k0(Q);
                }
                rVar.s(false);
                i0.d(a13, a10, null, false, null, null, null, false, (Function1) Q, rVar, 0, 252);
                v.e.u(lVar, 32, rVar, false, true);
                rVar.s(false);
                rVar.s(false);
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new q(oVar3, widget, onDeeplinkActionClicked, i10, i11, 5);
        }
    }

    public static Drawable o1(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        Drawable m10;
        if (typedArray.hasValue(i10) && (resourceId = typedArray.getResourceId(i10, 0)) != 0 && (m10 = iu.j.m(context, resourceId)) != null) {
            return m10;
        }
        return typedArray.getDrawable(i10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v5, types: [y0.d] */
    /* JADX WARN: Type inference failed for: r2v9, types: [y0.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void p(t0.v1 r10, kotlin.jvm.functions.Function2 r11, t0.n r12, int r13) {
        /*
            Method dump skipped, instructions count: 242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.b.p(t0.v1, kotlin.jvm.functions.Function2, t0.n, int):void");
    }

    public static final void p0(g1.o oVar, ListItem listItem, Function2 onDeeplinkActionClicked, Widget widget, int i10, n nVar, int i11, int i12) {
        g1.o oVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        g1.o oVar3;
        r rVar;
        Intrinsics.checkNotNullParameter(listItem, "listItem");
        Intrinsics.checkNotNullParameter(onDeeplinkActionClicked, "onDeeplinkActionClicked");
        Intrinsics.checkNotNullParameter(widget, "widget");
        r rVar2 = (r) nVar;
        rVar2.c0(-685616771);
        int i19 = i12 & 1;
        if (i19 != 0) {
            i13 = i11 | 6;
            oVar2 = oVar;
        } else if ((i11 & 14) == 0) {
            oVar2 = oVar;
            if (rVar2.h(oVar2)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i13 = i14 | i11;
        } else {
            oVar2 = oVar;
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            if (rVar2.h(listItem)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i13 |= i15;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 896) == 0) {
            if (rVar2.j(onDeeplinkActionClicked)) {
                i16 = 256;
            } else {
                i16 = 128;
            }
            i13 |= i16;
        }
        if ((i12 & 8) != 0) {
            i13 |= 3072;
        } else if ((i11 & 7168) == 0) {
            if (rVar2.h(widget)) {
                i17 = 2048;
            } else {
                i17 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i13 |= i17;
        }
        if ((i12 & 16) != 0) {
            i13 |= 24576;
        } else if ((57344 & i11) == 0) {
            if (rVar2.f(i10)) {
                i18 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i18 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i13 |= i18;
        }
        if ((i13 & 46811) == 9362 && rVar2.G()) {
            rVar2.V();
            rVar = rVar2;
        } else {
            g1.l lVar = g1.l.f16404b;
            if (i19 != 0) {
                oVar3 = lVar;
            } else {
                oVar3 = oVar2;
            }
            AnalyticEvent analyticEvent = new AnalyticEvent("app_home_card_tapped", Z0(widget, i10));
            g1.o a10 = h2.l.a(androidx.compose.foundation.layout.a.x(lVar, s0.g.f34069a, s0.g.f34069a, 6, s0.g.f34069a, 11), false, lf.f0.f24709r);
            rVar2.b0(-483455358);
            l1 a11 = y.a(b0.n.f2937c, g1.a.f16391m, rVar2, 0);
            rVar2.b0(-1323940314);
            int i20 = rVar2.P;
            r1 o10 = rVar2.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(a10);
            if (rVar2.f35166a instanceof t0.f) {
                rVar2.e0();
                if (rVar2.O) {
                    rVar2.n(jVar);
                } else {
                    rVar2.n0();
                }
                t.v0(rVar2, a11, c2.k.f7749e);
                t.v0(rVar2, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i20))) {
                    nn.d.s(i20, rVar2, i20, iVar);
                }
                nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
                float f10 = 143;
                float f11 = 4;
                pp.b.b(androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.q(lVar, f10), 80), h0.h.b(12), n1.t.f28173e, null, f11, b1.d.c(-558246524, new a2(i10, onDeeplinkActionClicked, listItem, analyticEvent, oVar3), rVar2), rVar2, 1769862, 24);
                String subtitle = listItem.getSubtitle();
                if (subtitle == null || subtitle.length() == 0) {
                    rVar = rVar2;
                } else {
                    rVar = rVar2;
                    androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 8), rVar);
                    al.d.C(listItem.getSubtitle(), h2.l.a(androidx.compose.foundation.layout.a.x(androidx.compose.foundation.layout.d.q(lVar, f10), f11, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, 14), false, lf.f0.f24711t), w0.e(R.color.black_1A1A1A_60, rVar), yk.j.e1(10), null, null, jh.c.f21373b, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 1575936, 0, 130992);
                }
                v.e.y(rVar, false, true, false, false);
                oVar2 = oVar3;
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new lf.w(oVar2, listItem, onDeeplinkActionClicked, widget, i10, i11, i12, 3);
        }
    }

    public static float p1(String[] strArr, int i10) {
        float parseFloat = Float.parseFloat(strArr[i10]);
        if (parseFloat >= s0.g.f34069a && parseFloat <= 1.0f) {
            return parseFloat;
        }
        throw new IllegalArgumentException("Motion easing control point value must be between 0 and 1; instead got: " + parseFloat);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v4, types: [t0.r1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void q(t0.v1[] r7, kotlin.jvm.functions.Function2 r8, t0.n r9, int r10) {
        /*
            t0.r r9 = (t0.r) r9
            r0 = -1390796515(0xffffffffad1a211d, float:-8.761239E-12)
            r9.c0(r0)
            t0.r1 r0 = r9.o()
            t0.j1 r1 = t0.t.f35202b
            r2 = 201(0xc9, float:2.82E-43)
            r9.Y(r2, r1)
            boolean r1 = r9.O
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L27
            b1.g r1 = b1.g.f3082g
            b1.g r1 = al.d.i1(r7, r0, r1)
            b1.g r0 = r9.j0(r0, r1)
            r9.I = r2
        L25:
            r1 = r3
            goto L74
        L27:
            t0.n2 r1 = r9.F
            int r4 = r1.f35091g
            java.lang.Object r1 = r1.g(r4, r3)
            java.lang.String r4 = "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap"
            kotlin.jvm.internal.Intrinsics.d(r1, r4)
            t0.r1 r1 = (t0.r1) r1
            t0.n2 r5 = r9.F
            int r6 = r5.f35091g
            java.lang.Object r5 = r5.g(r6, r2)
            kotlin.jvm.internal.Intrinsics.d(r5, r4)
            t0.r1 r5 = (t0.r1) r5
            b1.g r4 = al.d.i1(r7, r0, r5)
            boolean r6 = r9.G()
            if (r6 == 0) goto L65
            boolean r6 = r9.f35189x
            if (r6 != 0) goto L65
            boolean r5 = kotlin.jvm.internal.Intrinsics.a(r5, r4)
            if (r5 != 0) goto L58
            goto L65
        L58:
            int r0 = r9.f35176k
            t0.n2 r4 = r9.F
            int r4 = r4.l()
            int r4 = r4 + r0
            r9.f35176k = r4
            r0 = r1
            goto L25
        L65:
            b1.g r0 = r9.j0(r0, r4)
            boolean r4 = r9.f35189x
            if (r4 != 0) goto L73
            boolean r1 = kotlin.jvm.internal.Intrinsics.a(r0, r1)
            if (r1 != 0) goto L25
        L73:
            r1 = r2
        L74:
            if (r1 == 0) goto L7d
            boolean r4 = r9.O
            if (r4 != 0) goto L7d
            r9.O(r0)
        L7d:
            boolean r4 = r9.f35187v
            t0.t0 r5 = r9.f35188w
            r5.b(r4)
            r9.f35187v = r1
            r9.J = r0
            t0.j1 r1 = t0.t.f35203c
            r4 = 202(0xca, float:2.83E-43)
            r9.W(r1, r4, r3, r0)
            int r0 = r10 >> 3
            r0 = r0 & 14
            com.google.android.gms.internal.p002firebaseauthapi.a.p(r0, r8, r9, r3, r3)
            int r0 = r5.a()
            if (r0 == 0) goto L9d
            goto L9e
        L9d:
            r2 = r3
        L9e:
            r9.f35187v = r2
            r0 = 0
            r9.J = r0
            t0.x1 r9 = r9.w()
            if (r9 == 0) goto Lb1
            w.t1 r0 = new w.t1
            r1 = 5
            r0.<init>(r7, r8, r10, r1)
            r9.f35245d = r0
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.b.q(t0.v1[], kotlin.jvm.functions.Function2, t0.n, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void q0(g1.o r21, com.assetgro.stockgro.data.model.homedata.Widget r22, boolean r23, kotlin.jvm.functions.Function2 r24, t0.n r25, int r26, int r27) {
        /*
            Method dump skipped, instructions count: 448
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.b.q0(g1.o, com.assetgro.stockgro.data.model.homedata.Widget, boolean, kotlin.jvm.functions.Function2, t0.n, int, int):void");
    }

    public static final a1 q1(CoroutineContext coroutineContext) {
        a1 a1Var = (a1) coroutineContext.g(t0.m.f35081b);
        if (a1Var != null) {
            return a1Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.".toString());
    }

    public static void r(URI uri, HashMap hashMap) {
        String decode;
        Scanner scanner = new Scanner(uri.getRawQuery());
        scanner.useDelimiter("&");
        while (scanner.hasNext()) {
            try {
                String[] split = scanner.next().split("=");
                if (split.length == 1) {
                    decode = null;
                } else if (split.length == 2) {
                    decode = URLDecoder.decode(split[1], "UTF-8");
                } else {
                    throw new IllegalArgumentException("query parameter invalid");
                }
                hashMap.put(URLDecoder.decode(split[0], "UTF-8"), decode);
            } catch (UnsupportedEncodingException unused) {
                Log.e("URIQueryDecoder", "UTF-8 Not Recognized as a charset.  Device configuration Error.");
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03c3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00a3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void r0(g1.o r43, com.assetgro.stockgro.data.model.homedata.Winner r44, kotlin.jvm.functions.Function2 r45, com.assetgro.stockgro.data.model.homedata.Widget r46, int r47, t0.n r48, int r49, int r50) {
        /*
            Method dump skipped, instructions count: 967
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.b.r0(g1.o, com.assetgro.stockgro.data.model.homedata.Winner, kotlin.jvm.functions.Function2, com.assetgro.stockgro.data.model.homedata.Widget, int, t0.n, int, int):void");
    }

    public static final String r1(int i10, n nVar) {
        r rVar = (r) nVar;
        rVar.m(AndroidCompositionLocals_androidKt.f1427a);
        return ((Context) rVar.m(AndroidCompositionLocals_androidKt.f1428b)).getResources().getString(i10);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void s(g1.o r10, float r11, long r12, t0.n r14, int r15, int r16) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.b.s(g1.o, float, long, t0.n, int, int):void");
    }

    public static final void s0(g1.o oVar, List listItems, Function2 onDeeplinkActionClicked, Widget widget, n nVar, int i10, int i11) {
        Intrinsics.checkNotNullParameter(listItems, "listItems");
        Intrinsics.checkNotNullParameter(onDeeplinkActionClicked, "onDeeplinkActionClicked");
        Intrinsics.checkNotNullParameter(widget, "widget");
        r rVar = (r) nVar;
        rVar.c0(1489746869);
        int i12 = i11 & 1;
        g1.l lVar = g1.l.f16404b;
        if (i12 != 0) {
            oVar = lVar;
        }
        y2.m.b(new rb.f(8, (Object) widget, listItems, (ut.d) onDeeplinkActionClicked), androidx.compose.foundation.layout.d.e(lVar, 1.0f), null, rVar, 48, 4);
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new d0.y(oVar, listItems, onDeeplinkActionClicked, widget, i10, i11);
        }
    }

    public static final void s1(n nVar, Function2 function2) {
        Intrinsics.d(function2, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        zq.f.z(2, function2);
        function2.invoke(nVar, 1);
    }

    public static final void t(boolean z10, Function1 onExpandedChanged, List options, int i10, Function1 onSelectedIndexChanged, n nVar, int i11) {
        boolean z11;
        boolean z12;
        Intrinsics.checkNotNullParameter(onExpandedChanged, "onExpandedChanged");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(onSelectedIndexChanged, "onSelectedIndexChanged");
        r rVar = (r) nVar;
        rVar.c0(-1145606348);
        g1.l lVar = g1.l.f16404b;
        float f10 = 16;
        g1.o x10 = androidx.compose.foundation.layout.a.x(androidx.compose.foundation.layout.d.q(lVar, 200), f10, s0.g.f34069a, f10, s0.g.f34069a, 10);
        g1.g gVar = g1.a.f16379a;
        g1.o u10 = androidx.compose.foundation.layout.d.u(x10, gVar, 2);
        rVar.b0(733328855);
        b0.v c10 = b0.s.c(gVar, false, rVar, 0);
        rVar.b0(-1323940314);
        int i12 = rVar.P;
        r1 o10 = rVar.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(u10);
        if (rVar.f35166a instanceof t0.f) {
            rVar.e0();
            if (rVar.O) {
                rVar.n(jVar);
            } else {
                rVar.n0();
            }
            t.v0(rVar, c10, c2.k.f7749e);
            t.v0(rVar, o10, c2.k.f7748d);
            c2.i iVar = c2.k.f7750f;
            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i12))) {
                nn.d.s(i12, rVar, i12, iVar);
            }
            nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
            rVar.b0(-1867854353);
            int i13 = (i11 & 112) ^ 48;
            if ((i13 > 32 && rVar.h(onExpandedChanged)) || (i11 & 48) == 32) {
                z11 = true;
            } else {
                z11 = false;
            }
            Object Q = rVar.Q();
            to.e eVar = t0.m.f35080a;
            if (z11 || Q == eVar) {
                Q = new c2.h1(9, onExpandedChanged);
                rVar.k0(Q);
            }
            rVar.s(false);
            pp.b.l((Function0) Q, null, b1.d.c(1875297143, new ug.c(i10, options), rVar), rVar, 510);
            rVar.b0(-1867835888);
            if ((i13 > 32 && rVar.h(onExpandedChanged)) || (i11 & 48) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            Object Q2 = rVar.Q();
            if (z12 || Q2 == eVar) {
                Q2 = new c2.h1(10, onExpandedChanged);
                rVar.k0(Q2);
            }
            rVar.s(false);
            pp.b.d(z10, (Function0) Q2, androidx.compose.foundation.a.e(androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.d.q(lVar, 120), h0.h.b(8)), w0.e(R.color.gradientColor2, rVar), n1.s0.f28162a), 0L, null, null, b1.d.c(281040813, new m0.i0(8, options, onSelectedIndexChanged, onExpandedChanged), rVar), rVar, (i11 & 14) | 1572864, 56);
            x1 t10 = da.e.t(rVar, false, true, false, false);
            if (t10 != null) {
                t10.f35245d = new b0.x(z10, onExpandedChanged, options, i10, onSelectedIndexChanged, i11);
                return;
            }
            return;
        }
        al.d.v0();
        throw null;
    }

    public static final void t0(g1.o oVar, Widget widget, Function2 onDeeplinkActionClicked, n nVar, int i10, int i11) {
        g1.o oVar2;
        int i12;
        int i13;
        int i14;
        int i15;
        g1.o oVar3;
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(onDeeplinkActionClicked, "onDeeplinkActionClicked");
        r rVar = (r) nVar;
        rVar.c0(-347812766);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
            oVar2 = oVar;
        } else if ((i10 & 14) == 0) {
            oVar2 = oVar;
            if (rVar.h(oVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            oVar2 = oVar;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            if (rVar.h(widget)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        if ((i11 & 4) != 0) {
            i12 |= 384;
        } else if ((i10 & 896) == 0) {
            if (rVar.j(onDeeplinkActionClicked)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 731) == 146 && rVar.G()) {
            rVar.V();
        } else {
            g1.l lVar = g1.l.f16404b;
            if (i16 != 0) {
                oVar3 = lVar;
            } else {
                oVar3 = oVar2;
            }
            g1.o a10 = h2.l.a(lVar, false, lf.f0.C);
            g1.e eVar = g1.a.f16391m;
            rVar.b0(-483455358);
            l1 a11 = y.a(b0.n.f2937c, eVar, rVar, 48);
            rVar.b0(-1323940314);
            int i17 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(a10);
            if (rVar.f35166a instanceof t0.f) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                t.v0(rVar, a11, c2.k.f7749e);
                t.v0(rVar, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i17))) {
                    nn.d.s(i17, rVar, i17, iVar);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                int i18 = i12 & 896;
                z(widget, h2.l.a(oVar3, false, lf.f0.D), onDeeplinkActionClicked, rVar, ((i12 >> 3) & 14) | i18);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 16), rVar);
                s0(null, widget.getListItems(), onDeeplinkActionClicked, widget, rVar, i18 | 64 | ((i12 << 6) & 7168), 1);
                v.e.u(lVar, 32, rVar, false, true);
                rVar.s(false);
                rVar.s(false);
                oVar2 = oVar3;
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new q(oVar2, widget, onDeeplinkActionClicked, i10, i11, 6);
        }
    }

    public static boolean t1(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0177, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.a(r0.Q(), java.lang.Integer.valueOf(r14)) == false) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void u(g1.o r38, int r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, kotlin.jvm.functions.Function0 r43, t0.n r44, int r45, int r46) {
        /*
            Method dump skipped, instructions count: 820
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: dp.b.u(g1.o, int, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, t0.n, int, int):void");
    }

    public static final void u0(uh.i uiState, th.b scratchCard, MissionsHomeViewModel viewModel, n nVar, int i10) {
        Intrinsics.checkNotNullParameter(uiState, "uiState");
        Intrinsics.checkNotNullParameter(scratchCard, "scratchCard");
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        r rVar = (r) nVar;
        rVar.c0(-988305224);
        int i11 = i10 << 3;
        Y(g1.l.f16404b, uiState, scratchCard, new ag.b(viewModel, 19), new qg.a(viewModel, 12), rVar, (i11 & 112) | 6 | (i11 & 896), 0);
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new n0(uiState, scratchCard, viewModel, i10, 19);
        }
    }

    public static boolean u1(String str, String str2) {
        if (str.startsWith(str2.concat("(")) && str.endsWith(")")) {
            return true;
        }
        return false;
    }

    public static final void v(PortfolioFnoHoldingsViewModel viewModel, n nVar, int i10) {
        Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        r rVar = (r) nVar;
        rVar.c0(480334985);
        rVar.b0(-483455358);
        g1.l lVar = g1.l.f16404b;
        l1 a10 = y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
        rVar.b0(-1323940314);
        int i11 = rVar.P;
        r1 o10 = rVar.o();
        c2.l.M.getClass();
        c2.j jVar = c2.k.f7746b;
        b1.c j10 = androidx.compose.ui.layout.a.j(lVar);
        if (rVar.f35166a instanceof t0.f) {
            rVar.e0();
            if (rVar.O) {
                rVar.n(jVar);
            } else {
                rVar.n0();
            }
            t.v0(rVar, a10, c2.k.f7749e);
            t.v0(rVar, o10, c2.k.f7748d);
            c2.i iVar = c2.k.f7750f;
            if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i11))) {
                nn.d.s(i11, rVar, i11, iVar);
            }
            nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
            pp.b.b(androidx.compose.foundation.layout.d.e(lVar, 1.0f), h0.h.b(12), w0.e(R.color.white, rVar), null, 4, b1.d.c(-2037873456, new be.b(viewModel, 10), rVar), rVar, 1769478, 24);
            int i12 = 1;
            v.e.y(rVar, false, true, false, false);
            androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 16), rVar);
            if (!viewModel.f9826o.isEmpty()) {
                rVar.b0(-1501016650);
                g(viewModel, rVar, 8);
                rVar.s(false);
            } else {
                rVar.b0(-1500965686);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 64), rVar);
                rVar.s(false);
            }
            x1 w10 = rVar.w();
            if (w10 != null) {
                w10.f35245d = new pg.e(viewModel, i10, i12);
                return;
            }
            return;
        }
        al.d.v0();
        throw null;
    }

    public static void v0(String str, HashMap hashMap) {
        if ("af".equals(str)) {
            hashMap.put("error_initializing_player", "Kon nie die YouTube-speler inisialiseer nie.");
            hashMap.put("get_youtube_app_title", "Kry YouTube-program");
            hashMap.put("get_youtube_app_text", "Hierdie program sal nie loop sonder die YouTube-program, wat ontbreek van jou toestel, nie");
            hashMap.put("get_youtube_app_action", "Kry YouTube-program");
            hashMap.put("enable_youtube_app_title", "Aktiveer YouTube-program");
            hashMap.put("enable_youtube_app_text", "Hierdie program sal nie werk tensy jy die YouTube-program aktiveer nie.");
            hashMap.put("enable_youtube_app_action", "Aktiveer YouTube-program");
            hashMap.put("update_youtube_app_title", "Dateer YouTube-program op");
            hashMap.put("update_youtube_app_text", "Hierdie program sal nie werk tensy jy die YouTube-program opdateer nie.");
            hashMap.put("update_youtube_app_action", "Dateer YouTube-program op");
            return;
        }
        if ("am".equals(str)) {
            hashMap.put("error_initializing_player", "የYouTube አጫዋቹን በማስጀመር ላይ ሳለ አንድ ስህተት ተከስቷል።");
            hashMap.put("get_youtube_app_title", "የYouTube መተግበሪያውን ያግኙ");
            hashMap.put("get_youtube_app_text", "ይህ መተግበሪያ ያለ YouTube መተግበሪያው አይሂድም፣ እሱ ደግሞ በመሣሪያዎ ላይ የለም።");
            hashMap.put("get_youtube_app_action", "የYouTube መተግበሪያውን ያግኙ");
            hashMap.put("enable_youtube_app_title", "የYouTube መተግበሪያውን ያንቁ");
            hashMap.put("enable_youtube_app_text", "የYouTube መተግበሪያውን እስካላነቁ ድረስ ይህ መተግበሪያ አይሰራም።");
            hashMap.put("enable_youtube_app_action", "የYouTube መተግበሪያውን ያንቁ");
            hashMap.put("update_youtube_app_title", "የYouTube መተግበሪያውን ያዘምኑ");
            hashMap.put("update_youtube_app_text", "የYouTube መተግበሪያውን እስካላዘመኑት ድረስ ይህ መተግበሪያ አይሰራም።");
            hashMap.put("update_youtube_app_action", "የYouTube መተግበሪያውን ያዘምኑ");
            return;
        }
        if ("ar".equals(str)) {
            hashMap.put("error_initializing_player", "حدث خطأ أثناء تهيئة مشغل YouTube.");
            hashMap.put("get_youtube_app_title", "الحصول على تطبيق YouTube");
            hashMap.put("get_youtube_app_text", "لن يعمل هذا التطبيق بدون تطبيق YouTube الذي لا يتوفر على جهازك");
            hashMap.put("get_youtube_app_action", "الحصول على تطبيق YouTube");
            hashMap.put("enable_youtube_app_title", "تمكين تطبيق YouTube");
            hashMap.put("enable_youtube_app_text", "لن يعمل هذا التطبيق ما لم يتم تمكين تطبيق YouTube.");
            hashMap.put("enable_youtube_app_action", "تمكين تطبيق YouTube");
            hashMap.put("update_youtube_app_title", "تحديث تطبيق YouTube");
            hashMap.put("update_youtube_app_text", "لن يعمل هذا التطبيق ما لم يتم تحديث تطبيق YouTube.");
            hashMap.put("update_youtube_app_action", "تحديث تطبيق YouTube");
            return;
        }
        if ("be".equals(str)) {
            hashMap.put("error_initializing_player", "Памылка падчас ініцыялізацыі прайгравальнiка YouTube.");
            hashMap.put("get_youtube_app_title", "Спампаваць прыкладанне YouTube");
            hashMap.put("get_youtube_app_text", "Гэта прыкладанне не будзе працаваць без прыкладання YouTube, якое адсутнічае на прыладзе");
            hashMap.put("get_youtube_app_action", "Спампаваць прыкладанне YouTube");
            hashMap.put("enable_youtube_app_title", "Уключыць прыкладанне YouTube");
            hashMap.put("enable_youtube_app_text", "Гэта прыкладанне не будзе працаваць, пакуль вы не ўключыце прыкладанне YouTube.");
            hashMap.put("enable_youtube_app_action", "Уключыць прыкладанне YouTube");
            hashMap.put("update_youtube_app_title", "Абнавiць прыкладанне YouTube");
            hashMap.put("update_youtube_app_text", "Гэта прыкладанне не будзе працаваць, пакуль вы не абнавiце прыкладанне YouTube.");
            hashMap.put("update_youtube_app_action", "Абнавiць прыкладанне YouTube");
            return;
        }
        if ("bg".equals(str)) {
            hashMap.put("error_initializing_player", "При подготвянето на плейъра на YouTube за работа възникна грешка.");
            hashMap.put("get_youtube_app_title", "Изтегл. на прил. YouTube");
            hashMap.put("get_youtube_app_text", "Това приложение няма да работи без приложението YouTube, което липсва на устройството ви");
            hashMap.put("get_youtube_app_action", "Изтегл. на прил. YouTube");
            hashMap.put("enable_youtube_app_title", "Акт. на прил. YouTube");
            hashMap.put("enable_youtube_app_text", "Това приложение няма да работи, освен ако не активирате приложението YouTube.");
            hashMap.put("enable_youtube_app_action", "Акт. на прил. YouTube");
            hashMap.put("update_youtube_app_title", "Актул. на прил. YouTube");
            hashMap.put("update_youtube_app_text", "Това приложение няма да работи, освен ако не актуализирате приложението YouTube.");
            hashMap.put("update_youtube_app_action", "Актул. на прил. YouTube");
            return;
        }
        if ("ca".equals(str)) {
            hashMap.put("error_initializing_player", "S'ha produït un error en iniciar el reproductor de YouTube.");
            hashMap.put("get_youtube_app_title", "Obtenció aplicac. YouTube");
            hashMap.put("get_youtube_app_text", "Aquesta aplicació no funcionarà sense l'aplicació de YouTube, que encara no és al dispositiu.");
            hashMap.put("get_youtube_app_action", "Obtén l'aplic. de YouTube");
            hashMap.put("enable_youtube_app_title", "Activació aplic. YouTube");
            hashMap.put("enable_youtube_app_text", "Aquesta aplicació no funcionarà fins que no activis l'aplicació de YouTube.");
            hashMap.put("enable_youtube_app_action", "Activa aplicació YouTube");
            hashMap.put("update_youtube_app_title", "Actualitz. aplic. YouTube");
            hashMap.put("update_youtube_app_text", "Aquesta aplicació no funcionarà fins que no actualitzis l'aplicació de YouTube.");
            hashMap.put("update_youtube_app_action", "Actualitza aplic. YouTube");
            return;
        }
        if ("cs".equals(str)) {
            hashMap.put("error_initializing_player", "Při inicializaci přehrávače YouTube došlo k chybě.");
            hashMap.put("get_youtube_app_title", "Stáhněte aplikaci YouTube");
            hashMap.put("get_youtube_app_text", "Tuto aplikaci nelze spustit bez aplikace YouTube, kterou v zařízení nemáte nainstalovanou");
            hashMap.put("get_youtube_app_action", "Stáhnout aplikaci YouTube");
            hashMap.put("enable_youtube_app_title", "Aktivujte aplik. YouTube");
            hashMap.put("enable_youtube_app_text", "Ke spuštění této aplikace je třeba aktivovat aplikaci YouTube.");
            hashMap.put("enable_youtube_app_action", "Zapnout aplikaci YouTube");
            hashMap.put("update_youtube_app_title", "Aktualizujte apl. YouTube");
            hashMap.put("update_youtube_app_text", "Ke spuštění této aplikace je třeba aktualizovat aplikaci YouTube.");
            hashMap.put("update_youtube_app_action", "Aktualizovat apl. YouTube");
            return;
        }
        if ("da".equals(str)) {
            hashMap.put("error_initializing_player", "Der opstod en fejl under initialisering af YouTube-afspilleren.");
            hashMap.put("get_youtube_app_title", "Få YouTube-appen");
            hashMap.put("get_youtube_app_text", "Denne app kan ikke køre uden YouTube-appen, som ikke findes på din enhed");
            hashMap.put("get_youtube_app_action", "Få YouTube-appen");
            hashMap.put("enable_youtube_app_title", "Aktivér YouTube-appen");
            hashMap.put("enable_youtube_app_text", "Denne app fungerer ikke, medmindre du aktiverer YouTube-appen.");
            hashMap.put("enable_youtube_app_action", "Aktivér YouTube-appen");
            hashMap.put("update_youtube_app_title", "Opdater YouTube-appen");
            hashMap.put("update_youtube_app_text", "Denne app fungerer ikke, hvis du ikke opdaterer YouTube-appen.");
            hashMap.put("update_youtube_app_action", "Opdater YouTube-appen");
            return;
        }
        if ("de".equals(str)) {
            hashMap.put("error_initializing_player", "Bei der Initialisierung des YouTube-Players ist ein Fehler aufgetreten.");
            hashMap.put("get_youtube_app_title", "YouTube App herunterladen");
            hashMap.put("get_youtube_app_text", "Diese App kann nur ausgeführt werden, wenn die YouTube App bereitgestellt ist. Diese ist auf deinem Gerät nicht vorhanden.");
            hashMap.put("get_youtube_app_action", "YouTube App herunterladen");
            hashMap.put("enable_youtube_app_title", "YouTube App aktivieren");
            hashMap.put("enable_youtube_app_text", "Diese App funktioniert nur, wenn die YouTube App aktiviert wird.");
            hashMap.put("enable_youtube_app_action", "YouTube App aktivieren");
            hashMap.put("update_youtube_app_title", "YouTube App aktualisieren");
            hashMap.put("update_youtube_app_text", "Diese App funktioniert nur, wenn die YouTube App aktualisiert wird.");
            hashMap.put("update_youtube_app_action", "YouTube App aktualisieren");
            return;
        }
        if ("el".equals(str)) {
            hashMap.put("error_initializing_player", "Παρουσιάστηκε σφάλμα κατά την προετοιμασία του προγράμματος αναπαραγωγής του YouTube.");
            hashMap.put("get_youtube_app_title", "Λήψη YouTube");
            hashMap.put("get_youtube_app_text", "Δεν είναι δυνατή η εκτέλεση αυτής της εφαρμογής χωρίς την εφαρμογή YouTube, η οποία απουσιάζει από τη συσκευή σας");
            hashMap.put("get_youtube_app_action", "Λήψη YouTube");
            hashMap.put("enable_youtube_app_title", "Ενεργοποίηση YouTube");
            hashMap.put("enable_youtube_app_text", "Δεν είναι δυνατή η λειτουργία αυτής της εφαρμογής εάν δεν ενεργοποιήσετε την εφαρμογή YouTube.");
            hashMap.put("enable_youtube_app_action", "Ενεργοποίηση YouTube");
            hashMap.put("update_youtube_app_title", "Ενημέρωση YouTube");
            hashMap.put("update_youtube_app_text", "Δεν είναι δυνατή η λειτουργία αυτής της εφαρμογής εάν δεν ενημερώσετε την εφαρμογή YouTube.");
            hashMap.put("update_youtube_app_action", "Ενημέρωση YouTube");
            return;
        }
        if ("en_GB".equals(str)) {
            hashMap.put("error_initializing_player", "An error occurred while initialising the YouTube player.");
            hashMap.put("get_youtube_app_title", "Get YouTube App");
            hashMap.put("get_youtube_app_text", "This app won't run without the YouTube App, which is missing from your device");
            hashMap.put("get_youtube_app_action", "Get YouTube App");
            hashMap.put("enable_youtube_app_title", "Enable YouTube App");
            hashMap.put("enable_youtube_app_text", "This app won't work unless you enable the YouTube App.");
            hashMap.put("enable_youtube_app_action", "Enable YouTube App");
            hashMap.put("update_youtube_app_title", "Update YouTube App");
            hashMap.put("update_youtube_app_text", "This app won't work unless you update the YouTube App.");
            hashMap.put("update_youtube_app_action", "Update YouTube App");
            return;
        }
        if ("es_US".equals(str)) {
            hashMap.put("error_initializing_player", "Se produjo un error al iniciar el reproductor de YouTube.");
            hashMap.put("get_youtube_app_title", "Obtener YouTube");
            hashMap.put("get_youtube_app_text", "Esta aplicación no se ejecutará sin la aplicación YouTube, la cual no se instaló en tu dispositivo.");
            hashMap.put("get_youtube_app_action", "Obtener YouTube");
            hashMap.put("enable_youtube_app_title", "Activar YouTube");
            hashMap.put("enable_youtube_app_text", "Esta aplicación no funcionará a menos que actives la aplicación YouTube.");
            hashMap.put("enable_youtube_app_action", "Activar YouTube");
            hashMap.put("update_youtube_app_title", "Actualizar YouTube");
            hashMap.put("update_youtube_app_text", "Esta aplicación no funcionará a menos que actualices la aplicación YouTube.");
            hashMap.put("update_youtube_app_action", "Actualizar YouTube");
            return;
        }
        if ("es".equals(str)) {
            hashMap.put("error_initializing_player", "Se ha producido un error al iniciar el reproductor de YouTube.");
            hashMap.put("get_youtube_app_title", "Descarga YouTube");
            hashMap.put("get_youtube_app_text", "Esta aplicación no funcionará sin la aplicación YouTube, que no está instalada en el dispositivo.");
            hashMap.put("get_youtube_app_action", "Descargar YouTube");
            hashMap.put("enable_youtube_app_title", "Habilita la aplicación YouTube");
            hashMap.put("enable_youtube_app_text", "Esta aplicación no funcionará si no habilitas la aplicación YouTube.");
            hashMap.put("enable_youtube_app_action", "Habilitar YouTube");
            hashMap.put("update_youtube_app_title", "Actualiza YouTube");
            hashMap.put("update_youtube_app_text", "Esta aplicación no funcionará si no actualizas la aplicación YouTube.");
            hashMap.put("update_youtube_app_action", "Actualizar YouTube");
            return;
        }
        if ("et".equals(str)) {
            hashMap.put("error_initializing_player", "YouTube'i mängija lähtestamisel tekkis viga.");
            hashMap.put("get_youtube_app_title", "YouTube'i rak. hankimine");
            hashMap.put("get_youtube_app_text", "Rakendus ei käivitu ilma YouTube'i rakenduseta ja teie seadmes see praegu puudub");
            hashMap.put("get_youtube_app_action", "Hangi YouTube'i rakendus");
            hashMap.put("enable_youtube_app_title", "YouTube'i rakenduse lubamine");
            hashMap.put("enable_youtube_app_text", "Rakendus ei toimi, kui te ei luba kasutada YouTube'i rakendust.");
            hashMap.put("enable_youtube_app_action", "Luba YouTube'i rakendus");
            hashMap.put("update_youtube_app_title", "Värskenda YouTube");
            hashMap.put("update_youtube_app_text", "Rakendus ei toimi enne, kui olete YouTube'i rakendust värskendanud.");
            hashMap.put("update_youtube_app_action", "Värsk. YouTube'i rakend.");
            return;
        }
        if ("fa".equals(str)) {
            hashMap.put("error_initializing_player", "هنگام مقداردهی اولیه پخش\u200cکننده YouTube، خطایی روی داد.");
            hashMap.put("get_youtube_app_title", "دریافت برنامه YouTube");
            hashMap.put("get_youtube_app_text", "این برنامه بدون برنامه YouTube که در دستگاه شما موجود نیست، اجرا نمی\u200cشود");
            hashMap.put("get_youtube_app_action", "دریافت برنامه YouTube");
            hashMap.put("enable_youtube_app_title", "فعال کردن برنامه YouTube");
            hashMap.put("enable_youtube_app_text", "این برنامه تنها در صورتی کار خواهد کرد که برنامه YouTube را فعال کنید.");
            hashMap.put("enable_youtube_app_action", "فعال کردن برنامه YouTube");
            hashMap.put("update_youtube_app_title", "به\u200cروزرسانی برنامه YouTube");
            hashMap.put("update_youtube_app_text", "این برنامه کار نخواهد کرد مگر اینکه برنامه YouTube را به روز کنید.");
            hashMap.put("update_youtube_app_action", "به\u200cروزرسانی برنامه YouTube");
            return;
        }
        if ("fi".equals(str)) {
            hashMap.put("error_initializing_player", "Virhe alustettaessa YouTube-soitinta.");
            hashMap.put("get_youtube_app_title", "Hanki YouTube-sovellus");
            hashMap.put("get_youtube_app_text", "Tämä sovellus ei toimi ilman YouTube-sovellusta, joka puuttuu laitteesta.");
            hashMap.put("get_youtube_app_action", "Hanki YouTube-sovellus");
            hashMap.put("enable_youtube_app_title", "Ota YouTube-sov. käyttöön");
            hashMap.put("enable_youtube_app_text", "Tämä sovellus ei toimi, ellet ota YouTube-sovellusta käyttöön.");
            hashMap.put("enable_youtube_app_action", "Ota YouTube-sov. käyttöön");
            hashMap.put("update_youtube_app_title", "Päivitä YouTube-sovellus");
            hashMap.put("update_youtube_app_text", "Tämä sovellus ei toimi, ellet päivitä YouTube-sovellusta.");
            hashMap.put("update_youtube_app_action", "Päivitä YouTube-sovellus");
            return;
        }
        if ("fr".equals(str)) {
            hashMap.put("error_initializing_player", "Une erreur s'est produite lors de l'initialisation du lecteur YouTube.");
            hashMap.put("get_youtube_app_title", "Télécharger appli YouTube");
            hashMap.put("get_youtube_app_text", "Cette application ne fonctionnera pas sans l'application YouTube, qui n'est pas installée sur votre appareil.");
            hashMap.put("get_youtube_app_action", "Télécharger appli YouTube");
            hashMap.put("enable_youtube_app_title", "Activer l'appli YouTube");
            hashMap.put("enable_youtube_app_text", "Cette application ne fonctionnera que si vous activez l'application YouTube.");
            hashMap.put("enable_youtube_app_action", "Activer l'appli YouTube");
            hashMap.put("update_youtube_app_title", "Mise à jour appli YouTube");
            hashMap.put("update_youtube_app_text", "Cette application ne fonctionnera que si vous mettez à jour l'application YouTube.");
            hashMap.put("update_youtube_app_action", "Mise à jour appli YouTube");
            return;
        }
        if ("hi".equals(str)) {
            hashMap.put("error_initializing_player", "YouTube प्लेयर को प्रारंभ करते समय कोई त्रुटि आई.");
            hashMap.put("get_youtube_app_title", "YouTube एप्लि. प्राप्त करें");
            hashMap.put("get_youtube_app_text", "यह एप्लिकेशन YouTube एप्लिकेशन के बिना नहीं चलेगा, जो आपके उपकरण पर मौजूद नहीं है");
            hashMap.put("get_youtube_app_action", "YouTube एप्लि. प्राप्त करें");
            hashMap.put("enable_youtube_app_title", "YouTube एप्लि. सक्षम करें");
            hashMap.put("enable_youtube_app_text", "जब तक आप YouTube एप्लिकेशन सक्षम नहीं करते, तब तक यह एप्लिकेशन कार्य नहीं करेगा.");
            hashMap.put("enable_youtube_app_action", "YouTube एप्लि. सक्षम करें");
            hashMap.put("update_youtube_app_title", "YouTube एप्लि. अपडेट करें");
            hashMap.put("update_youtube_app_text", "जब तक आप YouTube एप्लिकेशन अपडेट नहीं करते, तब तक यह एप्लिकेशन कार्य नहीं करेगा.");
            hashMap.put("update_youtube_app_action", "YouTube एप्लि. अपडेट करें");
            return;
        }
        if ("hr".equals(str)) {
            hashMap.put("error_initializing_player", "Dogodila se pogreška tijekom pokretanja playera usluge YouTube.");
            hashMap.put("get_youtube_app_title", "Preuzimanje apl. YouTube");
            hashMap.put("get_youtube_app_text", "Ova se aplikacija ne može pokrenuti bez aplikacije YouTube, koja nije instalirana na vaš uređaj");
            hashMap.put("get_youtube_app_action", "Preuzmi apl. YouTube");
            hashMap.put("enable_youtube_app_title", "Omogućavanje apl. YouTube");
            hashMap.put("enable_youtube_app_text", "Ova aplikacija neće funkcionirati ako ne omogućite aplikaciju YouTube.");
            hashMap.put("enable_youtube_app_action", "Omogući apl. YouTube");
            hashMap.put("update_youtube_app_title", "Ažuriranje apl. YouTube");
            hashMap.put("update_youtube_app_text", "Ova aplikacija neće funkcionirati ako ne ažurirate aplikaciju YouTube.");
            hashMap.put("update_youtube_app_action", "Ažuriraj apl. YouTube");
            return;
        }
        if ("hu".equals(str)) {
            hashMap.put("error_initializing_player", "Hiba történt a YouTube lejátszó inicializálása során.");
            hashMap.put("get_youtube_app_title", "YouTube alk. letöltése");
            hashMap.put("get_youtube_app_text", "Ez az alkalmazás nem fut a YouTube alkalmazás nélkül, amely hiányzik az eszközéről.");
            hashMap.put("get_youtube_app_action", "YouTube alk. letöltése");
            hashMap.put("enable_youtube_app_title", "YouTube alkalmazás enged.");
            hashMap.put("enable_youtube_app_text", "Az alkalmazás csak akkor fog működni, ha engedélyezi a YouTube alkalmazást.");
            hashMap.put("enable_youtube_app_action", "YouTube alkalmazás enged.");
            hashMap.put("update_youtube_app_title", "YouTube alk. frissítése");
            hashMap.put("update_youtube_app_text", "Az alkalmazás csak akkor fog működni, ha frissíti a YouTube alkalmazást.");
            hashMap.put("update_youtube_app_action", "YouTube alk. frissítése");
            return;
        }
        if ("in".equals(str)) {
            hashMap.put("error_initializing_player", "Terjadi kesalahan saat memulai pemutar YouTube.");
            hashMap.put("get_youtube_app_title", "Dapatkan Aplikasi YouTube");
            hashMap.put("get_youtube_app_text", "Aplikasi ini tidak akan berjalan tanpa Aplikasi YouTube, yang hilang dari perangkat Anda");
            hashMap.put("get_youtube_app_action", "Dapatkan Aplikasi YouTube");
            hashMap.put("enable_youtube_app_title", "Aktifkan Aplikasi YouTube");
            hashMap.put("enable_youtube_app_text", "Aplikasi ini tidak akan bekerja kecuali Anda mengaktifkan Aplikasi YouTube.");
            hashMap.put("enable_youtube_app_action", "Aktifkan Aplikasi YouTube");
            hashMap.put("update_youtube_app_title", "Perbarui Aplikasi YouTube");
            hashMap.put("update_youtube_app_text", "Aplikasi ini tidak akan bekerja kecuali Anda memperbarui Aplikasi YouTube.");
            hashMap.put("update_youtube_app_action", "Perbarui Aplikasi YouTube");
            return;
        }
        if ("it".equals(str)) {
            hashMap.put("error_initializing_player", "Si è verificato un errore durante l'inizializzazione del player di YouTube.");
            hashMap.put("get_youtube_app_title", "Scarica app YouTube");
            hashMap.put("get_youtube_app_text", "Questa applicazione non funzionerà senza l'applicazione YouTube che non è presente sul tuo dispositivo");
            hashMap.put("get_youtube_app_action", "Scarica app YouTube");
            hashMap.put("enable_youtube_app_title", "Attiva app YouTube");
            hashMap.put("enable_youtube_app_text", "Questa applicazione non funzionerà se non attivi l'applicazione YouTube.");
            hashMap.put("enable_youtube_app_action", "Attiva app YouTube");
            hashMap.put("update_youtube_app_title", "Aggiorna app YouTube");
            hashMap.put("update_youtube_app_text", "Questa applicazione non funzionerà se non aggiorni l'applicazione YouTube.");
            hashMap.put("update_youtube_app_action", "Aggiorna app YouTube");
            return;
        }
        if ("iw".equals(str)) {
            hashMap.put("error_initializing_player", "אירעה שגיאה בעת אתחול נגן YouTube.");
            hashMap.put("get_youtube_app_title", "קבל את יישום YouTube");
            hashMap.put("get_youtube_app_text", "יישום זה לא יפעל ללא יישום YouTube, שאינו מותקן במכשיר שלך");
            hashMap.put("get_youtube_app_action", "קבל את יישום YouTube");
            hashMap.put("enable_youtube_app_title", "הפעל את יישום YouTube");
            hashMap.put("enable_youtube_app_text", "יישום זה לא יעבוד אלא אם תפעיל את יישום YouTube.");
            hashMap.put("enable_youtube_app_action", "הפעל את יישום YouTube");
            hashMap.put("update_youtube_app_title", "עדכן את יישום YouTube");
            hashMap.put("update_youtube_app_text", "יישום זה לא יעבוד אלא אם תעדכן את יישום YouTube.");
            hashMap.put("update_youtube_app_action", "עדכן את יישום YouTube");
            return;
        }
        if ("ja".equals(str)) {
            hashMap.put("error_initializing_player", "YouTubeプレーヤーの初期化中にエラーが発生しました。");
            hashMap.put("get_youtube_app_title", "YouTubeアプリを入手");
            hashMap.put("get_youtube_app_text", "このアプリの実行に必要なYouTubeアプリが端末にありません");
            hashMap.put("get_youtube_app_action", "YouTubeアプリを入手");
            hashMap.put("enable_youtube_app_title", "YouTubeアプリを有効化");
            hashMap.put("enable_youtube_app_text", "このアプリの実行にはYouTubeアプリの有効化が必要です。");
            hashMap.put("enable_youtube_app_action", "YouTubeアプリを有効化");
            hashMap.put("update_youtube_app_title", "YouTubeアプリを更新");
            hashMap.put("update_youtube_app_text", "このアプリの実行にはYouTubeアプリの更新が必要です。");
            hashMap.put("update_youtube_app_action", "YouTubeアプリを更新");
            return;
        }
        if ("ko".equals(str)) {
            hashMap.put("error_initializing_player", "YouTube 플레이어를 초기화하는 중에 오류가 발생했습니다.");
            hashMap.put("get_youtube_app_title", "YouTube 앱 다운로드");
            hashMap.put("get_youtube_app_text", "이 앱은 내 기기에 YouTube 앱이 없어서 실행되지 않습니다.");
            hashMap.put("get_youtube_app_action", "YouTube 앱 다운로드");
            hashMap.put("enable_youtube_app_title", "YouTube 앱 사용 설정");
            hashMap.put("enable_youtube_app_text", "이 앱은 YouTube 앱을 사용하도록 설정하지 않으면 작동하지 않습니다.");
            hashMap.put("enable_youtube_app_action", "YouTube 앱 사용");
            hashMap.put("update_youtube_app_title", "YouTube 앱 업데이트");
            hashMap.put("update_youtube_app_text", "이 앱은 YouTube 앱을 업데이트하지 않으면 작동하지 않습니다.");
            hashMap.put("update_youtube_app_action", "YouTube 앱 업데이트");
            return;
        }
        if ("lt".equals(str)) {
            hashMap.put("error_initializing_player", "Inicijuojant „YouTube“ grotuvą įvyko klaida.");
            hashMap.put("get_youtube_app_title", "Gauti „YouTube“ programą");
            hashMap.put("get_youtube_app_text", "Ši programa neveikia be „YouTube“ programos, o jos įrenginyje nėra.");
            hashMap.put("get_youtube_app_action", "Gauti „YouTube“ programą");
            hashMap.put("enable_youtube_app_title", "Įgalinti „YouTube“ progr.");
            hashMap.put("enable_youtube_app_text", "Ši programa neveiks, jei neįgalinsite „YouTube“ programos.");
            hashMap.put("enable_youtube_app_action", "Įgalinti „YouTube“ progr.");
            hashMap.put("update_youtube_app_title", "Atnauj. „YouTube“ progr.");
            hashMap.put("update_youtube_app_text", "Ši programa neveiks, jei neatnaujinsite „YouTube“ programos.");
            hashMap.put("update_youtube_app_action", "Atnauj. „YouTube“ progr.");
            return;
        }
        if ("lv".equals(str)) {
            hashMap.put("error_initializing_player", "Inicializējot YouTube atskaņotāju, radās kļūda.");
            hashMap.put("get_youtube_app_title", "YouTube liet. iegūšana");
            hashMap.put("get_youtube_app_text", "Šī lietotne nedarbosies bez YouTube lietotnes, kuras nav šajā ierīcē.");
            hashMap.put("get_youtube_app_action", "Iegūt YouTube lietotni");
            hashMap.put("enable_youtube_app_title", "YouTube liet. iespējošana");
            hashMap.put("enable_youtube_app_text", "Lai šī lietotne darbotos, iespējojiet YouTube lietotni.");
            hashMap.put("enable_youtube_app_action", "Iespējot YouTube lietotni");
            hashMap.put("update_youtube_app_title", "YouTube liet. atjaunin.");
            hashMap.put("update_youtube_app_text", "Lai šī lietotne darbotos, atjauniniet YouTube lietotni.");
            hashMap.put("update_youtube_app_action", "Atjaun. YouTube lietotni");
            return;
        }
        if ("ms".equals(str)) {
            hashMap.put("error_initializing_player", "Ralat berlaku semasa memulakan alat main YouTube.");
            hashMap.put("get_youtube_app_title", "Dapatkan Apl YouTube");
            hashMap.put("get_youtube_app_text", "Apl ini tidak akan berjalan tanpa Apl YouTube, yang tidak ada pada peranti anda");
            hashMap.put("get_youtube_app_action", "Dapatkan Apl YouTube");
            hashMap.put("enable_youtube_app_title", "Dayakan Apl YouTube");
            hashMap.put("enable_youtube_app_text", "Apl ini tidak akan berfungsi kecuali anda mendayakan Apl YouTube.");
            hashMap.put("enable_youtube_app_action", "Dayakan Apl YouTube");
            hashMap.put("update_youtube_app_title", "Kemas kini Apl YouTube");
            hashMap.put("update_youtube_app_text", "Apl ini tidak akan berfungsi kecuali anda mengemas kini Apl YouTube.");
            hashMap.put("update_youtube_app_action", "Kemas kini Apl YouTube");
            return;
        }
        if (PaymentConstants.WIDGET_NETBANKING.equals(str)) {
            hashMap.put("error_initializing_player", "Det oppsto en feil da YouTube-avspilleren startet.");
            hashMap.put("get_youtube_app_title", "Skaff deg YouTube-appen");
            hashMap.put("get_youtube_app_text", "Denne appen kan ikke kjøre uten YouTube-appen, som du ikke har på enheten");
            hashMap.put("get_youtube_app_action", "Skaff deg YouTube-appen");
            hashMap.put("enable_youtube_app_title", "Aktiver YouTube-appen");
            hashMap.put("enable_youtube_app_text", "Denne appen fungerer ikke før du aktiverer YouTube-appen.");
            hashMap.put("enable_youtube_app_action", "Aktiver YouTube-appen");
            hashMap.put("update_youtube_app_title", "Oppdater YouTube-appen");
            hashMap.put("update_youtube_app_text", "Denne appen fungerer ikke før du oppdaterer YouTube-appen.");
            hashMap.put("update_youtube_app_action", "Oppdater YouTube-appen");
            return;
        }
        if ("nl".equals(str)) {
            hashMap.put("error_initializing_player", "Er is een fout opgetreden bij het initialiseren van de YouTube-speler.");
            hashMap.put("get_youtube_app_title", "YouTube-app downloaden");
            hashMap.put("get_youtube_app_text", "Deze app wordt niet uitgevoerd zonder de YouTube-app, die op uw apparaat ontbreekt");
            hashMap.put("get_youtube_app_action", "YouTube-app downloaden");
            hashMap.put("enable_youtube_app_title", "YouTube-app inschakelen");
            hashMap.put("enable_youtube_app_text", "Deze app werkt niet, tenzij u de YouTube-app inschakelt.");
            hashMap.put("enable_youtube_app_action", "YouTube-app inschakelen");
            hashMap.put("update_youtube_app_title", "YouTube-app bijwerken");
            hashMap.put("update_youtube_app_text", "Deze app werkt niet, tenzij u de YouTube-app bijwerkt.");
            hashMap.put("update_youtube_app_action", "YouTube-app bijwerken");
            return;
        }
        if ("pl".equals(str)) {
            hashMap.put("error_initializing_player", "Podczas inicjowania odtwarzacza YouTube wystąpił błąd.");
            hashMap.put("get_youtube_app_title", "Pobierz aplikację YouTube");
            hashMap.put("get_youtube_app_text", "Ta aplikacja nie będzie działać bez aplikacji YouTube, której nie ma na tym urządzeniu");
            hashMap.put("get_youtube_app_action", "Pobierz aplikację YouTube");
            hashMap.put("enable_youtube_app_title", "Włącz aplikację YouTube");
            hashMap.put("enable_youtube_app_text", "Ta aplikacja nie będzie działać, jeśli nie włączysz aplikacji YouTube.");
            hashMap.put("enable_youtube_app_action", "Włącz aplikację YouTube");
            hashMap.put("update_youtube_app_title", "Zaktualizuj aplikację YouTube");
            hashMap.put("update_youtube_app_text", "Ta aplikacja nie będzie działać, jeśli nie zaktualizujesz aplikacji YouTube.");
            hashMap.put("update_youtube_app_action", "Zaktualizuj aplikację YouTube");
            return;
        }
        if ("pt_PT".equals(str)) {
            hashMap.put("error_initializing_player", "Ocorreu um erro ao iniciar o leitor do YouTube.");
            hashMap.put("get_youtube_app_title", "Obter a Aplicação YouTube");
            hashMap.put("get_youtube_app_text", "Esta aplicação não será executada sem a Aplicação YouTube, que está em falta no seu dispositivo");
            hashMap.put("get_youtube_app_action", "Obter a Aplicação YouTube");
            hashMap.put("enable_youtube_app_title", "Ativar Aplicação YouTube");
            hashMap.put("enable_youtube_app_text", "Esta aplicação não irá funcionar enquanto não ativar a Aplicação YouTube.");
            hashMap.put("enable_youtube_app_action", "Ativar Aplicação YouTube");
            hashMap.put("update_youtube_app_title", "Atualizar Aplica. YouTube");
            hashMap.put("update_youtube_app_text", "Esta aplicação não irá funcionar enquanto não atualizar a Aplicação YouTube.");
            hashMap.put("update_youtube_app_action", "Atualizar Aplica. YouTube");
            return;
        }
        if ("pt".equals(str)) {
            hashMap.put("error_initializing_player", "Ocorreu um erro ao inicializar o player do YouTube.");
            hashMap.put("get_youtube_app_title", "Obter aplicativo YouTube");
            hashMap.put("get_youtube_app_text", "Este aplicativo só funciona com o aplicativo YouTube, que está ausente no dispositivo.");
            hashMap.put("get_youtube_app_action", "Obter aplicativo YouTube");
            hashMap.put("enable_youtube_app_title", "Ativar aplicativo YouTube");
            hashMap.put("enable_youtube_app_text", "Este aplicativo só funciona com o aplicativo YouTube ativado.");
            hashMap.put("enable_youtube_app_action", "Ativar aplicativo YouTube");
            hashMap.put("update_youtube_app_title", "Atualizar aplic. YouTube");
            hashMap.put("update_youtube_app_text", "Este aplicativo só funciona com o aplicativo YouTube atualizado.");
            hashMap.put("update_youtube_app_action", "Atualizar aplic. YouTube");
            return;
        }
        if ("ro".equals(str)) {
            hashMap.put("error_initializing_player", "A apărut o eroare la iniţializarea playerului YouTube.");
            hashMap.put("get_youtube_app_title", "Descărcaţi YouTube");
            hashMap.put("get_youtube_app_text", "Această aplicaţie nu va rula fără aplicaţia YouTube, care lipseşte de pe gadget");
            hashMap.put("get_youtube_app_action", "Descărcaţi YouTube");
            hashMap.put("enable_youtube_app_title", "Activaţi YouTube");
            hashMap.put("enable_youtube_app_text", "Această aplicaţie nu va funcţiona decât dacă activaţi aplicaţia YouTube.");
            hashMap.put("enable_youtube_app_action", "Activaţi YouTube");
            hashMap.put("update_youtube_app_title", "Actualizaţi YouTube");
            hashMap.put("update_youtube_app_text", "Această aplicaţie nu va funcţiona decât dacă actualizaţi aplicaţia YouTube.");
            hashMap.put("update_youtube_app_action", "Actualizaţi YouTube");
            return;
        }
        if ("ru".equals(str)) {
            hashMap.put("error_initializing_player", "Не удалось запустить проигрыватель YouTube.");
            hashMap.put("get_youtube_app_title", "Загрузите YouTube");
            hashMap.put("get_youtube_app_text", "Чтобы запустить эту программу, установите приложение YouTube.");
            hashMap.put("get_youtube_app_action", "Загрузить YouTube");
            hashMap.put("enable_youtube_app_title", "Активация YouTube");
            hashMap.put("enable_youtube_app_text", "Чтобы запустить эту программу, активируйте приложение YouTube.");
            hashMap.put("enable_youtube_app_action", "Активировать YouTube");
            hashMap.put("update_youtube_app_title", "Обновление YouTube");
            hashMap.put("update_youtube_app_text", "Чтобы запустить эту программу, обновите приложение YouTube.");
            hashMap.put("update_youtube_app_action", "Обновить YouTube");
            return;
        }
        if ("sk".equals(str)) {
            hashMap.put("error_initializing_player", "Pri inicializácii prehrávača YouTube sa vyskytla chyba.");
            hashMap.put("get_youtube_app_title", "Získať aplikáciu YouTube");
            hashMap.put("get_youtube_app_text", "Túto aplikáciu nebude možné spustiť bez aplikácie YouTube, ktorá na zariadení nie je nainštalovaná.");
            hashMap.put("get_youtube_app_action", "Získať aplikáciu YouTube");
            hashMap.put("enable_youtube_app_title", "Povoliť aplikáciu YouTube");
            hashMap.put("enable_youtube_app_text", "Táto aplikácia bude fungovať až po povolení aplikácie YouTube.");
            hashMap.put("enable_youtube_app_action", "Povoliť aplikáciu YouTube");
            hashMap.put("update_youtube_app_title", "Aktualizovať apl. YouTube");
            hashMap.put("update_youtube_app_text", "Táto aplikácia bude fungovať až po aktualizácii aplikácie YouTube.");
            hashMap.put("update_youtube_app_action", "Aktualizovať apl. YouTube");
            return;
        }
        if ("sl".equals(str)) {
            hashMap.put("error_initializing_player", "Napaka med inicializacijo YouTubovega predvajalnika.");
            hashMap.put("get_youtube_app_title", "Prenos aplikacije YouTube");
            hashMap.put("get_youtube_app_text", "Ta aplikacija ne bo delovala brez aplikacije YouTube, ki je ni v vaši napravi");
            hashMap.put("get_youtube_app_action", "Prenos aplikacije YouTube");
            hashMap.put("enable_youtube_app_title", "Omog. aplikacije YouTube");
            hashMap.put("enable_youtube_app_text", "Ta aplikacija ne bo delovala, če ne omogočite aplikacije YouTube.");
            hashMap.put("enable_youtube_app_action", "Omog. aplikacijo YouTube");
            hashMap.put("update_youtube_app_title", "Posodob. aplikacije YouTube");
            hashMap.put("update_youtube_app_text", "Ta aplikacija ne bo delovala, če ne posodobite aplikacije YouTube.");
            hashMap.put("update_youtube_app_action", "Posod. aplikacijo YouTube");
            return;
        }
        if ("sr".equals(str)) {
            hashMap.put("error_initializing_player", "Дошло је до грешке при покретању YouTube плејера.");
            hashMap.put("get_youtube_app_title", "Преузимање аплик. YouTube");
            hashMap.put("get_youtube_app_text", "Ова апликација неће функционисати без апликације YouTube, која недостаје на уређају");
            hashMap.put("get_youtube_app_action", "Преузми апликац. YouTube");
            hashMap.put("enable_youtube_app_title", "Омогућавање апл. YouTube");
            hashMap.put("enable_youtube_app_text", "Ова апликације неће функционисати ако не омогућите апликацију YouTube.");
            hashMap.put("enable_youtube_app_action", "Омогући апликац. YouTube");
            hashMap.put("update_youtube_app_title", "Ажурирање аплик. YouTube");
            hashMap.put("update_youtube_app_text", "Ова апликације неће функционисати ако не ажурирате апликацију YouTube.");
            hashMap.put("update_youtube_app_action", "Ажурирај апликац. YouTube");
            return;
        }
        if ("sv".equals(str)) {
            hashMap.put("error_initializing_player", "Ett fel uppstod när YouTube-spelaren skulle startas.");
            hashMap.put("get_youtube_app_title", "Hämta YouTube-appen");
            hashMap.put("get_youtube_app_text", "YouTube-appen krävs för att den här appen ska kunna köras. Du har inte YouTube-appen på din enhet.");
            hashMap.put("get_youtube_app_action", "Hämta YouTube-appen");
            hashMap.put("enable_youtube_app_title", "Aktivera YouTube-appen");
            hashMap.put("enable_youtube_app_text", "Du måste aktivera YouTube-appen för att den här appen ska fungera.");
            hashMap.put("enable_youtube_app_action", "Aktivera YouTube-appen");
            hashMap.put("update_youtube_app_title", "Uppdatera YouTube-appen");
            hashMap.put("update_youtube_app_text", "Du måste uppdatera YouTube-appen för att den här appen ska fungera.");
            hashMap.put("update_youtube_app_action", "Uppdatera YouTube-appen");
            return;
        }
        if ("sw".equals(str)) {
            hashMap.put("error_initializing_player", "Hitilafu ilitokea wakati wa kuanzisha kichezeshi cha YouTube.");
            hashMap.put("get_youtube_app_title", "Pata Programu ya YouTube");
            hashMap.put("get_youtube_app_text", "Programu hii haitaendeshwa bila Programu ya YouTube, ambayo inakosekana kwenye kifaa chako.");
            hashMap.put("get_youtube_app_action", "Pata Programu ya YouTube");
            hashMap.put("enable_youtube_app_title", "Wezesha Programu ya YouTube");
            hashMap.put("enable_youtube_app_text", "Programu hii haitafanya kazi isipokuwa uwezeshe Programu ya YouTube.");
            hashMap.put("enable_youtube_app_action", "Wezesha Programu ya YouTube");
            hashMap.put("update_youtube_app_title", "Sasisha Programu ya YouTube");
            hashMap.put("update_youtube_app_text", "Programu hii haitafanya kazi mpaka usasishe Programu ya YouTube.");
            hashMap.put("update_youtube_app_action", "Sasisha Programu ya YouTube");
            return;
        }
        if ("th".equals(str)) {
            hashMap.put("error_initializing_player", "เกิดข้อผิดพลาดในขณะเริ่มต้นโปรแกรมเล่น YouTube");
            hashMap.put("get_youtube_app_title", "รับแอปพลิเคชัน YouTube");
            hashMap.put("get_youtube_app_text", "แอปพลิเคชันนี้จะไม่ทำงานหากไม่มีแอปพลิเคชัน YouTube ซึ่งไม่มีในอุปกรณ์ของคุณ");
            hashMap.put("get_youtube_app_action", "รับแอปพลิเคชัน YouTube");
            hashMap.put("enable_youtube_app_title", "เปิดใช้งานแอป YouTube");
            hashMap.put("enable_youtube_app_text", "แอปพลิเคชันนี้จะไม่ทำงานจนกว่าคุณจะเปิดใช้งานแอปพลิเคชัน YouTube");
            hashMap.put("enable_youtube_app_action", "เปิดใช้งานแอป YouTube");
            hashMap.put("update_youtube_app_title", "อัปเดตแอปพลิเคชัน YouTube");
            hashMap.put("update_youtube_app_text", "แอปพลิเคชันนี้จะไม่ทำงานจนกว่าคุณจะอัปเดตแอปพลิเคชัน YouTube");
            hashMap.put("update_youtube_app_action", "อัปเดตแอปพลิเคชัน YouTube");
            return;
        }
        if ("tl".equals(str)) {
            hashMap.put("error_initializing_player", "May naganap na error habang sinisimulan ang player ng YouTube.");
            hashMap.put("get_youtube_app_title", "Kunin ang YouTube App");
            hashMap.put("get_youtube_app_text", "Hindi gagana ang app na ito nang wala ang YouTube App, na nawawala sa iyong device");
            hashMap.put("get_youtube_app_action", "Kunin ang YouTube App");
            hashMap.put("enable_youtube_app_title", "Paganahin ang YouTube App");
            hashMap.put("enable_youtube_app_text", "Hindi gagana ang app na ito maliban kung paganahin mo ang YouTube App.");
            hashMap.put("enable_youtube_app_action", "Paganahin ang YouTube App");
            hashMap.put("update_youtube_app_title", "I-update ang YouTube App");
            hashMap.put("update_youtube_app_text", "Hindi gagana ang app na ito maliban kung i-update mo ang YouTube App.");
            hashMap.put("update_youtube_app_action", "I-update ang YouTube App");
            return;
        }
        if ("tr".equals(str)) {
            hashMap.put("error_initializing_player", "YouTube oynatıcısı başlatılırken bir hata oluştu.");
            hashMap.put("get_youtube_app_title", "YouTube Uygulamasını edinin");
            hashMap.put("get_youtube_app_text", "Cihazınızda bulunmayan YouTube Uygulaması olmadan bu uygulama çalışmaz");
            hashMap.put("get_youtube_app_action", "YouTube Uygulamasını edinin");
            hashMap.put("enable_youtube_app_title", "YouTube Uygulamasını etkinleştirin");
            hashMap.put("enable_youtube_app_text", "YouTube Uygulamasını etkinleştirmediğiniz sürece bu uygulama çalışmaz.");
            hashMap.put("enable_youtube_app_action", "YouTube Uygulamasını etkinleştirin");
            hashMap.put("update_youtube_app_title", "YouTube Uygulamasını güncelleyin");
            hashMap.put("update_youtube_app_text", "YouTube Uygulaması güncellenmedikçe bu uygulama çalışmaz.");
            hashMap.put("update_youtube_app_action", "YouTube Uygulamasını güncelle");
            return;
        }
        if ("uk".equals(str)) {
            hashMap.put("error_initializing_player", "Під час ініціалізації програвача YouTube сталася помилка.");
            hashMap.put("get_youtube_app_title", "Отримати програму YouTube");
            hashMap.put("get_youtube_app_text", "Ця програма не запуститься без програми YouTube, яку не встановлено на вашому пристрої");
            hashMap.put("get_youtube_app_action", "Отримати програму YouTube");
            hashMap.put("enable_youtube_app_title", "Увімк. програму YouTube");
            hashMap.put("enable_youtube_app_text", "Ця програма не працюватиме, поки ви не ввімкнете програму YouTube.");
            hashMap.put("enable_youtube_app_action", "Увімк. програму YouTube");
            hashMap.put("update_youtube_app_title", "Оновити програму YouTube");
            hashMap.put("update_youtube_app_text", "Ця програма не працюватиме, поки ви не оновите програму YouTube.");
            hashMap.put("update_youtube_app_action", "Оновити програму YouTube");
            return;
        }
        if ("vi".equals(str)) {
            hashMap.put("error_initializing_player", "Đã xảy ra lỗi trong khi khởi chạy trình phát YouTube.");
            hashMap.put("get_youtube_app_title", "Tải ứng dụng YouTube");
            hashMap.put("get_youtube_app_text", "Ứng dụng này sẽ không chạy nếu không có ứng dụng YouTube, ứng dụng này bị thiếu trong thiết bị của bạn");
            hashMap.put("get_youtube_app_action", "Tải ứng dụng YouTube");
            hashMap.put("enable_youtube_app_title", "Bật ứng dụng YouTube");
            hashMap.put("enable_youtube_app_text", "Ứng dụng này sẽ không hoạt động trừ khi bạn bật ứng dụng YouTube.");
            hashMap.put("enable_youtube_app_action", "Bật ứng dụng YouTube");
            hashMap.put("update_youtube_app_title", "Cập nhật ứng dụng YouTube");
            hashMap.put("update_youtube_app_text", "Ứng dụng này sẽ không hoạt động trừ khi bạn cập nhật ứng dụng YouTube.");
            hashMap.put("update_youtube_app_action", "Cập nhật ứng dụng YouTube");
            return;
        }
        if ("zh_CN".equals(str)) {
            hashMap.put("error_initializing_player", "初始化 YouTube 播放器时出现错误。");
            hashMap.put("get_youtube_app_title", "获取 YouTube 应用");
            hashMap.put("get_youtube_app_text", "您的设备中没有 YouTube 应用，您必须先安装 YouTube 应用才能运行此应用。");
            hashMap.put("get_youtube_app_action", "获取 YouTube 应用");
            hashMap.put("enable_youtube_app_title", "启用 YouTube 应用");
            hashMap.put("enable_youtube_app_text", "您需要启用 YouTube 应用才能运行该应用。");
            hashMap.put("enable_youtube_app_action", "启用 YouTube 应用");
            hashMap.put("update_youtube_app_title", "更新 YouTube 应用");
            hashMap.put("update_youtube_app_text", "您必须更新 YouTube 应用才能运行此应用。");
            hashMap.put("update_youtube_app_action", "更新 YouTube 应用");
            return;
        }
        if ("zh_TW".equals(str)) {
            hashMap.put("error_initializing_player", "初始化 YouTube 播放器時發生錯誤。");
            hashMap.put("get_youtube_app_title", "取得 YouTube 應用程式");
            hashMap.put("get_youtube_app_text", "您必須啟用 YouTube 應用程式，這個應用程式才能運作，但系統在裝置中找不到 YouTube 應用程式。");
            hashMap.put("get_youtube_app_action", "取得 YouTube 應用程式");
            hashMap.put("enable_youtube_app_title", "啟用 YouTube 應用程式");
            hashMap.put("enable_youtube_app_text", "您必須啟用 YouTube 應用程式，這個應用程式才能運作。");
            hashMap.put("enable_youtube_app_action", "啟用 YouTube 應用程式");
            hashMap.put("update_youtube_app_title", "更新 YouTube 應用程式");
            hashMap.put("update_youtube_app_text", "您必須更新 YouTube 應用程式，這個應用程式才能運作。");
            hashMap.put("update_youtube_app_action", "更新 YouTube 應用程式");
            return;
        }
        if ("zu".equals(str)) {
            hashMap.put("error_initializing_player", "Kuvele iphutha ngenkathi kuqaliswa isidlali se-YouTube");
            hashMap.put("get_youtube_app_title", "Thola uhlelo lokusebenza lwe-YouTube");
            hashMap.put("get_youtube_app_text", "Lolu hlelo kusebenza angeke lusebenze ngaphandle kohlelo lokusebenza lwe-YouTube, olungekho kudivayisi yakho");
            hashMap.put("get_youtube_app_action", "Thola uhelo lokusebenza lwe-YouTube");
            hashMap.put("enable_youtube_app_title", "Nika amandla uhlelo lokusebenza lwe-YouTube");
            hashMap.put("enable_youtube_app_text", "Lolu hlelo lokusebenza angeke lusebenze uma unganikanga amandla uhlelo lokusebenza lwe-YouTube.");
            hashMap.put("enable_youtube_app_action", "Nika amandla uhlelo lokusebenza lwe-YouTube");
            hashMap.put("update_youtube_app_title", "Buyekeza uhlelo lokusebenza lwe-YouTube");
            hashMap.put("update_youtube_app_text", "Lolu hlelo lokusebenza angeke lusebenze uma ungabuyekezanga uhlelo lokusebenza lwe-YouTube.");
            hashMap.put("update_youtube_app_action", "Buyekeza uhlelo lokusebenza lwe-YouTube");
        }
    }

    public static final boolean v1(x1.k kVar) {
        List list = kVar.f39870a;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (!x1.r.b(((x1.t) list.get(i10)).f39917i, 2)) {
                return false;
            }
        }
        return true;
    }

    public static final void w(OptionValue item, Function2 buySellClicked, Function1 onHeaderClick, n nVar, int i10) {
        int i11;
        int i12;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(buySellClicked, "buySellClicked");
        Intrinsics.checkNotNullParameter(onHeaderClick, "onHeaderClick");
        r rVar = (r) nVar;
        rVar.c0(-602053208);
        if ((i10 & 14) == 0) {
            if (rVar.h(item)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        int i15 = 16;
        if ((i10 & 112) == 0) {
            if (rVar.j(buySellClicked)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 896) == 0) {
            if (rVar.j(onHeaderClick)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 731) == 146 && rVar.G()) {
            rVar.V();
        } else {
            pp.b.b(androidx.compose.foundation.layout.d.e(g1.l.f16404b, 1.0f), h0.h.b(12), n1.t.f28173e, null, 4, b1.d.c(-171558133, new m0.o0(i15, item, onHeaderClick, buySellClicked), rVar), rVar, 1769862, 24);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new n0(item, buySellClicked, onHeaderClick, i10);
        }
    }

    public static final void w0(n nVar, int i10) {
        r rVar;
        r rVar2 = (r) nVar;
        rVar2.c0(1884408095);
        if (i10 == 0 && rVar2.G()) {
            rVar2.V();
            rVar = rVar2;
        } else {
            Intrinsics.checkNotNullParameter("breakeven_chart_mobile.json", "assetName");
            n9.o V = yk.o.V(new n9.p("breakeven_chart_mobile.json"), rVar2, 6);
            List g10 = vt.y.g(hl.f.c1(R.string.the_breakeven_curve_helps, rVar2), hl.f.c1(R.string.the_y_axis_represents, rVar2));
            g1.l lVar = g1.l.f16404b;
            float f10 = 16;
            g1.o x10 = androidx.compose.foundation.layout.a.x(androidx.compose.foundation.layout.d.e(lVar, 1.0f), f10, s0.g.f34069a, f10, s0.g.f34069a, 10);
            g1.e eVar = g1.a.f16392n;
            rVar2.b0(-483455358);
            l1 a10 = y.a(b0.n.f2937c, eVar, rVar2, 48);
            rVar2.b0(-1323940314);
            int i11 = rVar2.P;
            r1 o10 = rVar2.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(x10);
            if (rVar2.f35166a instanceof t0.f) {
                rVar2.e0();
                if (rVar2.O) {
                    rVar2.n(jVar);
                } else {
                    rVar2.n0();
                }
                t.v0(rVar2, a10, c2.k.f7749e);
                t.v0(rVar2, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i11))) {
                    nn.d.s(i11, rVar2, i11, iVar);
                }
                nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
                al.d.C(v.e.i(lVar, 20, rVar2, R.string.breakeven_chart, rVar2), androidx.compose.foundation.layout.d.e(lVar, 1.0f), w0.e(R.color.black_1A1A1A, rVar2), 0L, null, null, jh.c.f21375d, 0L, null, new u2.i(5), 0L, 0, false, 0, 0, null, null, rVar2, 1572912, 0, 130488);
                float f11 = 4;
                bl.j.f((j9.i) V.getValue(), androidx.compose.foundation.a.g(androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.d.g(v.e.f(lVar, f10, rVar2, lVar, 1.0f), 220), h0.h.b(f11)), 1, w0.e(R.color.lightColorSeparator, rVar2), h0.h.b(f11)), false, true, s0.g.f34069a, 100, false, false, false, null, false, false, null, null, false, null, rVar2, 1575944, 0, 262068);
                rVar = rVar2;
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 8), rVar);
                d(g10, rVar, 0);
                rVar.s(false);
                rVar.s(true);
                rVar.s(false);
                rVar.s(false);
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new u(i10, 13);
        }
    }

    public static final String w1(String str) {
        Intrinsics.checkNotNullParameter(str, "str");
        if (kotlin.text.s.r(str, "-", false) && str.length() > 1 && str.charAt(1) != '0') {
            int i10 = 0;
            for (int i11 = 0; i11 < str.length(); i11++) {
                if (str.charAt(i11) == '.') {
                    i10++;
                }
            }
            if (i10 < 2) {
                return "Loss";
            }
            return "Profit";
        }
        return "Profit";
    }

    public static final void x(l0.n nVar, l0.l lVar, Function2 function2, n nVar2, int i10) {
        int i11;
        boolean z10;
        int i12;
        int i13;
        boolean j10;
        int i14;
        r rVar = (r) nVar2;
        rVar.c0(345017889);
        if ((i10 & 6) == 0) {
            if ((i10 & 8) == 0) {
                j10 = rVar.h(nVar);
            } else {
                j10 = rVar.j(nVar);
            }
            if (j10) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar.h(lVar)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (rVar.j(function2)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        if ((i11 & 147) == 146 && rVar.G()) {
            rVar.V();
        } else {
            rVar.b0(-1205358919);
            boolean z11 = true;
            if ((i11 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i11 & 14) != 4 && ((i11 & 8) == 0 || !rVar.h(nVar))) {
                z11 = false;
            }
            boolean z12 = z10 | z11;
            Object Q = rVar.Q();
            if (z12 || Q == t0.m.f35080a) {
                Q = new l0.k(lVar, nVar);
                rVar.k0(Q);
            }
            rVar.s(false);
            z2.i.a((l0.k) Q, null, new z2.u(false, true, true, z2.v.f41977a, true, false), function2, rVar, ((i11 << 3) & 7168) | 384, 2);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new n0(nVar, lVar, function2, i10, 2);
        }
    }

    public static final void x0(n nVar, int i10) {
        r rVar;
        r rVar2 = (r) nVar;
        rVar2.c0(399352544);
        if (i10 == 0 && rVar2.G()) {
            rVar2.V();
            rVar = rVar2;
        } else {
            Intrinsics.checkNotNullParameter("buy_sell_toggle_mobile.json", "assetName");
            n9.o V = yk.o.V(new n9.p("buy_sell_toggle_mobile.json"), rVar2, 6);
            List a10 = vt.x.a(hl.f.c1(R.string.switch_between_buy_and_sell, rVar2));
            g1.l lVar = g1.l.f16404b;
            float f10 = 16;
            g1.o x10 = androidx.compose.foundation.layout.a.x(androidx.compose.foundation.layout.d.e(lVar, 1.0f), f10, s0.g.f34069a, f10, s0.g.f34069a, 10);
            g1.e eVar = g1.a.f16392n;
            rVar2.b0(-483455358);
            l1 a11 = y.a(b0.n.f2937c, eVar, rVar2, 48);
            rVar2.b0(-1323940314);
            int i11 = rVar2.P;
            r1 o10 = rVar2.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(x10);
            if (rVar2.f35166a instanceof t0.f) {
                rVar2.e0();
                if (rVar2.O) {
                    rVar2.n(jVar);
                } else {
                    rVar2.n0();
                }
                t.v0(rVar2, a11, c2.k.f7749e);
                t.v0(rVar2, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i11))) {
                    nn.d.s(i11, rVar2, i11, iVar);
                }
                nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
                al.d.C(v.e.i(lVar, 20, rVar2, R.string.buy_sell, rVar2), androidx.compose.foundation.layout.d.e(lVar, 1.0f), w0.e(R.color.black_1A1A1A, rVar2), 0L, null, null, jh.c.f21375d, 0L, null, new u2.i(5), 0L, 0, false, 0, 0, null, null, rVar2, 1572912, 0, 130488);
                float f11 = 4;
                bl.j.f((j9.i) V.getValue(), androidx.compose.foundation.a.g(androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.d.g(v.e.f(lVar, f10, rVar2, lVar, 1.0f), 220), h0.h.b(f11)), 1, w0.e(R.color.lightColorSeparator, rVar2), h0.h.b(f11)), false, true, s0.g.f34069a, 100, false, false, false, null, false, false, null, null, false, null, rVar2, 1575944, 0, 262068);
                rVar = rVar2;
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 8), rVar);
                d(a10, rVar, 0);
                rVar.s(false);
                rVar.s(true);
                rVar.s(false);
                rVar.s(false);
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new u(i10, 14);
        }
    }

    public static String x1(File file) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        StringBuilder sb2 = new StringBuilder();
        char[] cArr = new char[UserMetadata.MAX_INTERNAL_KEY_SIZE];
        while (true) {
            int read = bufferedReader.read(cArr, 0, UserMetadata.MAX_INTERNAL_KEY_SIZE);
            if (read > 0) {
                sb2.append(cArr, 0, read);
            } else {
                return sb2.toString();
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:49:0x01d3. Please report as an issue. */
    public static final void y(Function1 function1, hf.j state, n nVar, int i10, int i11) {
        Function1 function12;
        int i12;
        Function1 function13;
        Function1 function14;
        to.e eVar;
        boolean z10;
        Intrinsics.checkNotNullParameter(state, "state");
        r rVar = (r) nVar;
        rVar.c0(1041808837);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            function12 = function1;
        } else if ((i10 & 14) == 0) {
            function12 = function1;
            i12 = i10 | (rVar.j(function12) ? 4 : 2);
        } else {
            function12 = function1;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= rVar.h(state) ? 32 : 16;
        }
        int i14 = i12;
        if ((i14 & 91) == 18 && rVar.G()) {
            rVar.V();
            function13 = function12;
        } else {
            Function1 function15 = i13 != 0 ? lf.x.f24806a : function12;
            Object g10 = v.e.g(rVar, 773894976, -723523240);
            to.e eVar2 = t0.m.f35080a;
            if (g10 == eVar2) {
                g10 = v.e.o(t.I(kotlin.coroutines.k.f23369a, rVar), rVar);
            }
            rVar.s(false);
            f0 f0Var = ((d0) g10).f34970a;
            rVar.s(false);
            o2 o10 = androidx.compose.foundation.a.o(rVar);
            t.e(Boolean.valueOf(state.f18376b), new lf.z(state, f0Var, o10, null), rVar);
            g1.l lVar = g1.l.f16404b;
            g1.o r10 = androidx.compose.foundation.a.r(androidx.compose.foundation.layout.d.f1286c, o10);
            rVar.b0(733328855);
            b0.v c10 = b0.s.c(g1.a.f16379a, false, rVar, 0);
            rVar.b0(-1323940314);
            int i15 = rVar.P;
            r1 o11 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(r10);
            boolean z11 = rVar.f35166a instanceof t0.f;
            if (z11) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                c2.i iVar = c2.k.f7749e;
                t.v0(rVar, c10, iVar);
                c2.i iVar2 = c2.k.f7748d;
                t.v0(rVar, o11, iVar2);
                c2.i iVar3 = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i15))) {
                    nn.d.s(i15, rVar, i15, iVar3);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                g1.o g11 = androidx.compose.foundation.layout.d.g(androidx.compose.foundation.layout.d.e(lVar, 1.0f), 128);
                float f10 = 0;
                float f11 = 8;
                h0.g gVar = h0.h.f17801a;
                Function1 function16 = function15;
                to.e eVar3 = eVar2;
                b0.s.a(androidx.compose.foundation.a.e(androidx.compose.ui.draw.a.b(g11, new h0.a(new h0.e(f10), new h0.e(f10), new h0.e(f11), new h0.e(f11))), w0.e(R.color.gradientColor2, rVar), n1.s0.f28162a), rVar, 0);
                rVar.b0(44419555);
                if (state.f18375a) {
                    al.d.c(null, rVar, 0, 1);
                }
                rVar.s(false);
                rVar.b0(-483455358);
                l1 a10 = y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
                rVar.b0(-1323940314);
                int i16 = rVar.P;
                r1 o12 = rVar.o();
                b1.c j11 = androidx.compose.ui.layout.a.j(lVar);
                if (z11) {
                    rVar.e0();
                    if (rVar.O) {
                        rVar.n(jVar);
                    } else {
                        rVar.n0();
                    }
                    t.v0(rVar, a10, iVar);
                    t.v0(rVar, o12, iVar2);
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i16))) {
                        nn.d.s(i16, rVar, i16, iVar3);
                    }
                    nn.d.q(0, j11, new m2(rVar), rVar, 2058660585);
                    for (Widget widget : state.f18377c) {
                        String widgetType = widget.getWidgetType();
                        switch (widgetType.hashCode()) {
                            case -1618083904:
                                function14 = function16;
                                eVar = eVar3;
                                z10 = false;
                                if (widgetType.equals("video_long")) {
                                    rVar.b0(-408186065);
                                    rVar.b0(-567353854);
                                    boolean z12 = (i14 & 14) == 4;
                                    Object Q = rVar.Q();
                                    if (z12 || Q == eVar) {
                                        Q = new p3(6, function14);
                                        rVar.k0(Q);
                                    }
                                    rVar.s(false);
                                    o0(null, widget, (Function2) Q, rVar, 0, 1);
                                    rVar.s(false);
                                    Unit unit = Unit.f23355a;
                                    break;
                                }
                                rVar.b0(-404981471);
                                rVar.s(z10);
                                Unit unit2 = Unit.f23355a;
                                break;
                            case -1617762281:
                                function14 = function16;
                                eVar = eVar3;
                                if (widgetType.equals("video_wide")) {
                                    rVar.b0(-407785297);
                                    rVar.b0(-567340926);
                                    boolean z13 = (i14 & 14) == 4;
                                    Object Q2 = rVar.Q();
                                    if (z13 || Q2 == eVar) {
                                        Q2 = new p3(7, function14);
                                        rVar.k0(Q2);
                                    }
                                    rVar.s(false);
                                    q0(null, widget, false, (Function2) Q2, rVar, 0, 5);
                                    rVar.s(false);
                                    Unit unit3 = Unit.f23355a;
                                    break;
                                }
                                z10 = false;
                                rVar.b0(-404981471);
                                rVar.s(z10);
                                Unit unit22 = Unit.f23355a;
                            case -1396342996:
                                function14 = function16;
                                eVar = eVar3;
                                if (widgetType.equals("banner")) {
                                    rVar.b0(-405789486);
                                    rVar.b0(-567276638);
                                    boolean z14 = (i14 & 14) == 4;
                                    Object Q3 = rVar.Q();
                                    if (z14 || Q3 == eVar) {
                                        Q3 = new p3(12, function14);
                                        rVar.k0(Q3);
                                    }
                                    rVar.s(false);
                                    b(null, widget, false, (Function2) Q3, rVar, 0, 5);
                                    rVar.s(false);
                                    Unit unit4 = Unit.f23355a;
                                    break;
                                }
                                z10 = false;
                                rVar.b0(-404981471);
                                rVar.s(z10);
                                Unit unit222 = Unit.f23355a;
                            case -266011147:
                                function14 = function16;
                                eVar = eVar3;
                                if (widgetType.equals("userdata")) {
                                    rVar.b0(-406584016);
                                    rVar.b0(-567302206);
                                    boolean z15 = (i14 & 14) == 4;
                                    Object Q4 = rVar.Q();
                                    if (z15 || Q4 == eVar) {
                                        Q4 = new p3(10, function14);
                                        rVar.k0(Q4);
                                    }
                                    rVar.s(false);
                                    m0(null, widget, (Function2) Q4, rVar, 0, 1);
                                    rVar.s(false);
                                    Unit unit5 = Unit.f23355a;
                                    break;
                                }
                                z10 = false;
                                rVar.b0(-404981471);
                                rVar.s(z10);
                                Unit unit2222 = Unit.f23355a;
                            case 2908512:
                                function14 = function16;
                                eVar = eVar3;
                                if (widgetType.equals("carousel")) {
                                    rVar.b0(-408986578);
                                    rVar.b0(-567379646);
                                    boolean z16 = (i14 & 14) == 4;
                                    Object Q5 = rVar.Q();
                                    if (z16 || Q5 == eVar) {
                                        Q5 = new p3(3, function14);
                                        rVar.k0(Q5);
                                    }
                                    rVar.s(false);
                                    f(null, widget, (Function2) Q5, rVar, 0, 1);
                                    rVar.s(false);
                                    Unit unit6 = Unit.f23355a;
                                    break;
                                }
                                z10 = false;
                                rVar.b0(-404981471);
                                rVar.s(z10);
                                Unit unit22222 = Unit.f23355a;
                            case 108391552:
                                function14 = function16;
                                eVar = eVar3;
                                if (widgetType.equals("refer")) {
                                    rVar.b0(-405396685);
                                    rVar.b0(-567263998);
                                    int i17 = 4;
                                    boolean z17 = (i14 & 14) == 4;
                                    Object Q6 = rVar.Q();
                                    if (z17 || Q6 == eVar) {
                                        Q6 = new p3(i17, function14);
                                        rVar.k0(Q6);
                                    }
                                    rVar.s(false);
                                    S(null, widget, (Function2) Q6, rVar, 0, 1);
                                    rVar.s(false);
                                    Unit unit7 = Unit.f23355a;
                                    break;
                                }
                                z10 = false;
                                rVar.b0(-404981471);
                                rVar.s(z10);
                                Unit unit222222 = Unit.f23355a;
                            case 178408792:
                                function14 = function16;
                                eVar = eVar3;
                                if (widgetType.equals("infodata")) {
                                    rVar.b0(-406185232);
                                    rVar.b0(-567289342);
                                    boolean z18 = (i14 & 14) == 4;
                                    Object Q7 = rVar.Q();
                                    if (z18 || Q7 == eVar) {
                                        Q7 = new p3(11, function14);
                                        rVar.k0(Q7);
                                    }
                                    rVar.s(false);
                                    F(null, widget, (Function2) Q7, rVar, 0, 1);
                                    rVar.s(false);
                                    Unit unit8 = Unit.f23355a;
                                    break;
                                }
                                z10 = false;
                                rVar.b0(-404981471);
                                rVar.s(z10);
                                Unit unit2222222 = Unit.f23355a;
                            case 1619870467:
                                function14 = function16;
                                eVar = eVar3;
                                if (widgetType.equals("chat_long")) {
                                    rVar.b0(-408585872);
                                    rVar.b0(-567366782);
                                    boolean z19 = (i14 & 14) == 4;
                                    Object Q8 = rVar.Q();
                                    if (z19 || Q8 == eVar) {
                                        Q8 = new p3(5, function14);
                                        rVar.k0(Q8);
                                    }
                                    rVar.s(false);
                                    i(null, widget, (Function2) Q8, rVar, 0, 1);
                                    rVar.s(false);
                                    Unit unit9 = Unit.f23355a;
                                    break;
                                }
                                z10 = false;
                                rVar.b0(-404981471);
                                rVar.s(z10);
                                Unit unit22222222 = Unit.f23355a;
                            case 1620192090:
                                function14 = function16;
                                eVar = eVar3;
                                int i18 = 8;
                                if (widgetType.equals("chat_wide")) {
                                    rVar.b0(-407385552);
                                    rVar.b0(-567328062);
                                    boolean z20 = (i14 & 14) == 4;
                                    Object Q9 = rVar.Q();
                                    if (z20 || Q9 == eVar) {
                                        Q9 = new p3(i18, function14);
                                        rVar.k0(Q9);
                                    }
                                    rVar.s(false);
                                    k(null, widget, false, (Function2) Q9, rVar, 0, 5);
                                    rVar.s(false);
                                    Unit unit10 = Unit.f23355a;
                                    break;
                                }
                                z10 = false;
                                rVar.b0(-404981471);
                                rVar.s(z10);
                                Unit unit222222222 = Unit.f23355a;
                            case 1734523038:
                                if (widgetType.equals("winner_list")) {
                                    rVar.b0(-406984722);
                                    rVar.b0(-567315070);
                                    boolean z21 = (i14 & 14) == 4;
                                    Object Q10 = rVar.Q();
                                    eVar = eVar3;
                                    if (z21 || Q10 == eVar) {
                                        function14 = function16;
                                        Q10 = new p3(9, function14);
                                        rVar.k0(Q10);
                                    } else {
                                        function14 = function16;
                                    }
                                    rVar.s(false);
                                    t0(null, widget, (Function2) Q10, rVar, 0, 1);
                                    rVar.s(false);
                                    Unit unit11 = Unit.f23355a;
                                    break;
                                }
                            default:
                                function14 = function16;
                                eVar = eVar3;
                                z10 = false;
                                rVar.b0(-404981471);
                                rVar.s(z10);
                                Unit unit2222222222 = Unit.f23355a;
                                break;
                        }
                        eVar3 = eVar;
                        function16 = function14;
                    }
                    v.e.y(rVar, false, true, false, false);
                    v.e.y(rVar, false, true, false, false);
                    function13 = function16;
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
            w10.f35245d = new hf.q(function13, state, i10, i11, 1);
        }
    }

    public static final void y0(n nVar, int i10) {
        r rVar;
        r rVar2 = (r) nVar;
        rVar2.c0(-1085703007);
        if (i10 == 0 && rVar2.G()) {
            rVar2.V();
            rVar = rVar2;
        } else {
            Intrinsics.checkNotNullParameter("strike_price_android.json", "assetName");
            n9.o V = yk.o.V(new n9.p("strike_price_android.json"), rVar2, 6);
            List a10 = vt.x.a(hl.f.c1(R.string.input_the_expiry_date_by_selecting, rVar2));
            List a11 = vt.x.a(hl.f.c1(R.string.drag_the_strike_price_right_and_left, rVar2));
            g1.l lVar = g1.l.f16404b;
            float f10 = 16;
            g1.o x10 = androidx.compose.foundation.layout.a.x(androidx.compose.foundation.layout.d.e(lVar, 1.0f), f10, s0.g.f34069a, f10, s0.g.f34069a, 10);
            g1.e eVar = g1.a.f16392n;
            rVar2.b0(-483455358);
            l1 a12 = y.a(b0.n.f2937c, eVar, rVar2, 48);
            rVar2.b0(-1323940314);
            int i11 = rVar2.P;
            r1 o10 = rVar2.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(x10);
            if (rVar2.f35166a instanceof t0.f) {
                rVar2.e0();
                if (rVar2.O) {
                    rVar2.n(jVar);
                } else {
                    rVar2.n0();
                }
                t.v0(rVar2, a12, c2.k.f7749e);
                t.v0(rVar2, o10, c2.k.f7748d);
                c2.i iVar = c2.k.f7750f;
                if (rVar2.O || !Intrinsics.a(rVar2.Q(), Integer.valueOf(i11))) {
                    nn.d.s(i11, rVar2, i11, iVar);
                }
                nn.d.q(0, j10, new m2(rVar2), rVar2, 2058660585);
                al.d.C(v.e.i(lVar, 20, rVar2, R.string.expiry_date_strike_price, rVar2), androidx.compose.foundation.layout.d.e(lVar, 1.0f), w0.e(R.color.black_1A1A1A, rVar2), 0L, null, null, jh.c.f21375d, 0L, null, new u2.i(5), 0L, 0, false, 0, 0, null, null, rVar2, 1572912, 0, 130488);
                float f11 = 12;
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f11), rVar2);
                float f12 = 1;
                float f13 = 4;
                androidx.compose.foundation.a.c(w0.u(R.drawable.ic_breakeven_dates, rVar2, 6), null, androidx.compose.foundation.a.g(androidx.compose.foundation.layout.d.e(lVar, 1.0f), f12, w0.e(R.color.lightColorSeparator, rVar2), h0.h.b(f13)), null, null, s0.g.f34069a, null, rVar2, 56, 120);
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, f11), rVar2);
                d(a10, rVar2, 0);
                bl.j.f((j9.i) V.getValue(), androidx.compose.foundation.a.g(androidx.compose.ui.draw.a.b(androidx.compose.foundation.layout.d.g(v.e.f(lVar, f11, rVar2, lVar, 1.0f), 90), h0.h.b(f13)), f12, w0.e(R.color.lightColorSeparator, rVar2), h0.h.b(f13)), false, true, s0.g.f34069a, 100, false, false, false, null, false, false, null, null, false, null, rVar2, 1575944, 0, 262068);
                rVar = rVar2;
                androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 8), rVar);
                d(a11, rVar, 0);
                rVar.s(false);
                rVar.s(true);
                rVar.s(false);
                rVar.s(false);
            } else {
                al.d.v0();
                throw null;
            }
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new u(i10, 15);
        }
    }

    public static final k1 y1(float f10) {
        int i10 = t0.c.f34957b;
        return new k1(f10);
    }

    public static final void z(Widget widget, g1.o modifier, Function2 onDeeplinkActionClicked, n nVar, int i10) {
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        int i13;
        int i14;
        int i15;
        Intrinsics.checkNotNullParameter(widget, "widget");
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(onDeeplinkActionClicked, "onDeeplinkActionClicked");
        r rVar = (r) nVar;
        rVar.c0(-968555849);
        if ((i10 & 14) == 0) {
            if (rVar.h(widget)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i11 = i15 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            if (rVar.h(modifier)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i11 |= i14;
        }
        if ((i10 & 896) == 0) {
            if (rVar.j(onDeeplinkActionClicked)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i11 |= i13;
        }
        int i16 = i11;
        if ((i16 & 731) == 146 && rVar.G()) {
            rVar.V();
        } else {
            g1.l lVar = g1.l.f16404b;
            float f10 = 16;
            g1.o a10 = h2.l.a(androidx.compose.foundation.layout.d.e(androidx.compose.foundation.layout.a.x(lVar, f10, s0.g.f34069a, f10, s0.g.f34069a, 10), 1.0f), false, lf.d.C);
            g1.f fVar = g1.a.f16389k;
            rVar.b0(693286680);
            l1 a11 = o1.a(b0.n.f2935a, fVar, rVar, 48);
            rVar.b0(-1323940314);
            int i17 = rVar.P;
            r1 o10 = rVar.o();
            c2.l.M.getClass();
            c2.j jVar = c2.k.f7746b;
            b1.c j10 = androidx.compose.ui.layout.a.j(a10);
            boolean z14 = rVar.f35166a instanceof t0.f;
            if (z14) {
                rVar.e0();
                if (rVar.O) {
                    rVar.n(jVar);
                } else {
                    rVar.n0();
                }
                c2.i iVar = c2.k.f7749e;
                t.v0(rVar, a11, iVar);
                c2.i iVar2 = c2.k.f7748d;
                t.v0(rVar, o10, iVar2);
                c2.i iVar3 = c2.k.f7750f;
                if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i17))) {
                    nn.d.s(i17, rVar, i17, iVar3);
                }
                nn.d.q(0, j10, new m2(rVar), rVar, 2058660585);
                g1.o a12 = h2.l.a(lVar, false, lf.d.D);
                rVar.b0(-483455358);
                l1 a13 = y.a(b0.n.f2937c, g1.a.f16391m, rVar, 0);
                rVar.b0(-1323940314);
                int i18 = rVar.P;
                r1 o11 = rVar.o();
                b1.c j11 = androidx.compose.ui.layout.a.j(a12);
                if (z14) {
                    rVar.e0();
                    if (rVar.O) {
                        rVar.n(jVar);
                    } else {
                        rVar.n0();
                    }
                    t.v0(rVar, a13, iVar);
                    t.v0(rVar, o11, iVar2);
                    if (rVar.O || !Intrinsics.a(rVar.Q(), Integer.valueOf(i18))) {
                        nn.d.s(i18, rVar, i18, iVar3);
                    }
                    nn.d.q(0, j11, new m2(rVar), rVar, 2058660585);
                    String title = widget.getTitle();
                    if (title == null) {
                        title = HttpUrl.FRAGMENT_ENCODE_SET;
                    }
                    long e10 = w0.e(R.color.black_1A1A1A, rVar);
                    long e12 = yk.j.e1(14);
                    o2.v vVar = jh.c.f21375d;
                    al.d.C(title, h2.l.a(lVar, false, lf.d.E), e10, e12, null, null, vVar, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 1575936, 0, 130992);
                    if (widget.getSubtitle() == null) {
                        i12 = 12;
                    } else {
                        androidx.compose.foundation.layout.a.c(androidx.compose.foundation.layout.d.g(lVar, 2), rVar);
                        i12 = 12;
                        al.d.C(widget.getSubtitle(), h2.l.a(lVar, false, a0.f24616b), w0.e(R.color.grey_696969, rVar), yk.j.e1(12), null, null, jh.c.f21373b, 0L, null, null, 0L, 0, false, 0, 0, null, null, rVar, 1575936, 0, 130992);
                        Unit unit = Unit.f23355a;
                    }
                    v.e.y(rVar, false, true, false, false);
                    if (widget.isExtraActionAvailable()) {
                        if (1.0f > 0.0d) {
                            androidx.compose.foundation.layout.a.c(new LayoutWeightElement(kotlin.ranges.d.c(1.0f, Float.MAX_VALUE), true), rVar);
                            String extraActionCtaTitle = widget.getExtraActionCtaTitle();
                            if (extraActionCtaTitle == null) {
                                extraActionCtaTitle = HttpUrl.FRAGMENT_ENCODE_SET;
                            }
                            long e11 = w0.e(R.color.blue_4A20E6, rVar);
                            long e13 = yk.j.e1(i12);
                            long e14 = yk.j.e1(14);
                            rVar.b0(-18681927);
                            if ((i16 & 14) == 4) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if ((i16 & 896) == 256) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            boolean z15 = z13 | z12;
                            Object Q = rVar.Q();
                            if (z15 || Q == t0.m.f35080a) {
                                Q = new ad.f(i12, widget, onDeeplinkActionClicked);
                                rVar.k0(Q);
                            }
                            rVar.s(false);
                            al.d.C(extraActionCtaTitle, h2.l.a(androidx.compose.foundation.a.k(modifier, (Function0) Q, 7), false, a0.f24617c), e11, e13, null, null, vVar, 0L, null, null, e14, 0, false, 0, 0, null, null, rVar, 1575936, 6, 129968);
                            z10 = false;
                            z11 = true;
                        } else {
                            throw new IllegalArgumentException(jr.h.m("invalid weight ", 1.0f, "; must be greater than zero").toString());
                        }
                    } else {
                        z10 = false;
                        z11 = true;
                    }
                    v.e.y(rVar, z10, z11, z10, z10);
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
            w10.f35245d = new n0(widget, modifier, onDeeplinkActionClicked, i10, 14);
        }
    }

    public static final void z0(long j10, Function0 function0, boolean z10, n nVar, int i10) {
        int i11;
        float f10;
        boolean z11;
        boolean z12;
        int i12;
        int i13;
        int i14;
        r rVar = (r) nVar;
        rVar.c0(1053897700);
        if ((i10 & 6) == 0) {
            if (rVar.g(j10)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i11 = i14 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (rVar.j(function0)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i11 |= i13;
        }
        if ((i10 & 384) == 0) {
            if (rVar.i(z10)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i11 |= i12;
        }
        int i15 = i11;
        if ((i15 & 147) == 146 && rVar.G()) {
            rVar.V();
        } else if (j10 != n1.t.f28177i) {
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = s0.g.f34069a;
            }
            l3 b10 = w.i.b(f10, new w.x1(0, (w.d0) null, 7), null, rVar, 48, 28);
            rVar.b0(-1858718943);
            to.e eVar = t0.m.f35080a;
            g1.o oVar = g1.l.f16404b;
            int i16 = 1;
            if (z10) {
                rVar.b0(-1858718859);
                if ((i15 & 112) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                Object Q = rVar.Q();
                if (z12 || Q == eVar) {
                    Q = new b2(function0, null);
                    rVar.k0(Q);
                }
                rVar.s(false);
                g1.o a10 = h0.a(oVar, function0, (Function2) Q);
                r0.d0 d0Var = r0.d0.f32361d;
                AtomicInteger atomicInteger = h2.l.f17853a;
                oVar = a10.g(new ClearAndSetSemanticsElement(d0Var));
            }
            rVar.s(false);
            g1.o g10 = androidx.compose.foundation.layout.d.f1286c.g(oVar);
            rVar.b0(-1858718531);
            if ((i15 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean h10 = z11 | rVar.h(b10);
            Object Q2 = rVar.Q();
            if (h10 || Q2 == eVar) {
                Q2 = new o4(j10, b10, i16);
                rVar.k0(Q2);
            }
            rVar.s(false);
            androidx.compose.foundation.a.b(g10, (Function1) Q2, rVar, 0);
        }
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new p4(j10, function0, z10, i10, 1);
        }
    }

    public static HashMap z1(Uri uri) {
        HashMap hashMap = new HashMap();
        try {
            for (String str : uri.getQueryParameterNames()) {
                if (!str.equalsIgnoreCase("link") && !str.equalsIgnoreCase("continueUrl")) {
                    String queryParameter = uri.getQueryParameter(str);
                    if (queryParameter != null) {
                        hashMap.put(str, queryParameter);
                    }
                }
                hashMap.putAll(z1(Uri.parse(uri.getQueryParameter(str))));
            }
        } catch (Exception unused) {
        }
        return hashMap;
    }
}
