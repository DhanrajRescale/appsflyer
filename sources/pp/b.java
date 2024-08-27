package pp;

import a0.k;
import a2.a1;
import a2.l0;
import a2.u;
import a2.z0;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.i1;
import c2.e1;
import com.assetgro.stockgro.prod.R;
import com.github.mikephil.charting.charts.BarChart;
import com.google.android.gms.auth.api.credentials.CredentialsApi;
import d2.i;
import d2.s1;
import g1.o;
import g3.l;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.TimeoutCancellationException;
import kp.j;
import m0.a3;
import m0.b1;
import m0.e6;
import m0.f1;
import m0.f6;
import m0.i6;
import m0.l1;
import m0.l6;
import m0.m0;
import m0.t2;
import m0.v0;
import m0.x0;
import m0.y;
import mt.p;
import okhttp3.HttpUrl;
import qu.i0;
import qu.n2;
import qu.t;
import qu.u0;
import qu.y1;
import t0.g1;
import t0.l3;
import t0.m;
import t0.m3;
import t0.n;
import t0.r;
import t0.x1;
import v.n0;
import x.d0;
import y.t0;

/* loaded from: classes2.dex */
public abstract class b {
    public static void B(z0 z0Var, a1 a1Var, l lVar) {
        long j10 = w2.h.f38791b;
        if (lVar.f16528o != 8) {
            boolean isNaN = Float.isNaN(lVar.f16519f);
            float f10 = s0.g.f34069a;
            if (isNaN && Float.isNaN(lVar.f16520g) && Float.isNaN(lVar.f16521h) && Float.isNaN(lVar.f16522i) && Float.isNaN(lVar.f16523j) && Float.isNaN(lVar.f16524k) && Float.isNaN(lVar.f16525l) && Float.isNaN(lVar.f16526m) && Float.isNaN(lVar.f16527n)) {
                long j11 = hl.f.j(lVar.f16515b - ((int) (j10 >> 32)), lVar.f16516c - ((int) (j10 & 4294967295L)));
                z0Var.getClass();
                z0.e(a1Var, j11, s0.g.f34069a);
                return;
            }
            e1 e1Var = new e1(lVar, 10);
            int i10 = lVar.f16515b - ((int) (j10 >> 32));
            int i11 = lVar.f16516c - ((int) (j10 & 4294967295L));
            if (!Float.isNaN(lVar.f16524k)) {
                f10 = lVar.f16524k;
            }
            z0Var.getClass();
            z0.j(a1Var, i10, i11, f10, e1Var);
        }
    }

    public static final Object C(n2 n2Var, Function2 function2) {
        Object tVar;
        Object a02;
        hl.f.s0(n2Var, false, new u0(j.Q(n2Var.f38410d.getContext()).H(n2Var.f32245e, n2Var, n2Var.f32177c), 0), 3);
        try {
            if (!(function2 instanceof au.a)) {
                tVar = zt.f.c(n2Var, n2Var, function2);
            } else {
                zq.f.z(2, function2);
                tVar = function2.invoke(n2Var, n2Var);
            }
        } catch (Throwable th2) {
            tVar = new t(th2, false);
        }
        zt.a aVar = zt.a.f42823a;
        if (tVar != aVar && (a02 = n2Var.a0(tVar)) != y1.f32302b) {
            if (a02 instanceof t) {
                Throwable th3 = ((t) a02).f32267a;
                if (th3 instanceof TimeoutCancellationException) {
                    if (((TimeoutCancellationException) th3).f23425a == n2Var) {
                        if (tVar instanceof t) {
                            throw ((t) tVar).f32267a;
                        }
                    } else {
                        throw th3;
                    }
                } else {
                    throw th3;
                }
            } else {
                tVar = y1.a(a02);
            }
            return tVar;
        }
        return aVar;
    }

    public static String D(int i10) {
        if (v(i10, 0)) {
            return "None";
        }
        if (v(i10, 1)) {
            return "Characters";
        }
        if (v(i10, 2)) {
            return "Words";
        }
        if (v(i10, 3)) {
            return "Sentences";
        }
        return "Invalid";
    }

    public static final Object E(long j10, Function2 function2, au.c frame) {
        if (j10 > 0) {
            Object C = C(new n2(j10, frame), function2);
            if (C == zt.a.f42823a) {
                Intrinsics.checkNotNullParameter(frame, "frame");
            }
            return C;
        }
        throw new TimeoutCancellationException("Timed out immediately", null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object F(long r7, o2.h r9, yt.a r10) {
        /*
            boolean r0 = r10 instanceof qu.o2
            if (r0 == 0) goto L13
            r0 = r10
            qu.o2 r0 = (qu.o2) r0
            int r1 = r0.f32250d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32250d = r1
            goto L18
        L13:
            qu.o2 r0 = new qu.o2
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f32249c
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f32250d
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            iu.z r7 = r0.f32248b
            ut.n.b(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L2a
            goto L66
        L2a:
            r8 = move-exception
            goto L69
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            ut.n.b(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L3e
            return r3
        L3e:
            iu.z r10 = new iu.z
            r10.<init>()
            r0.f32247a = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L67
            r0.f32248b = r10     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L67
            r0.f32250d = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L67
            qu.n2 r2 = new qu.n2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L67
            r2.<init>(r7, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L67
            r10.f20560a = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L67
            java.lang.Object r7 = C(r2, r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L67
            if (r7 != r1) goto L62
            java.lang.String r8 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r8)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L5e
            goto L62
        L5c:
            r8 = r7
            goto L60
        L5e:
            r7 = move-exception
            goto L5c
        L60:
            r7 = r10
            goto L69
        L62:
            if (r7 != r1) goto L65
            return r1
        L65:
            r10 = r7
        L66:
            return r10
        L67:
            r8 = move-exception
            goto L60
        L69:
            qu.o1 r9 = r8.f23425a
            java.lang.Object r7 = r7.f20560a
            if (r9 != r7) goto L70
            return r3
        L70:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: pp.b.F(long, o2.h, yt.a):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0458  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x040a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02d8  */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(kotlin.jvm.functions.Function0 r32, g1.o r33, boolean r34, a0.l r35, m0.j1 r36, n1.x0 r37, x.d0 r38, m0.f1 r39, b0.h1 r40, hu.c r41, t0.n r42, int r43, int r44) {
        /*
            Method dump skipped, instructions count: 1129
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pp.b.a(kotlin.jvm.functions.Function0, g1.o, boolean, a0.l, m0.j1, n1.x0, x.d0, m0.f1, b0.h1, hu.c, t0.n, int, int):void");
    }

    public static final void b(o oVar, h0.g gVar, long j10, d0 d0Var, float f10, b1.c cVar, n nVar, int i10, int i11) {
        o oVar2;
        h0.a aVar;
        long j11;
        long j12;
        d0 d0Var2;
        float f11;
        r rVar = (r) nVar;
        rVar.b0(1956755640);
        if ((i11 & 1) != 0) {
            oVar2 = g1.l.f16404b;
        } else {
            oVar2 = oVar;
        }
        if ((i11 & 2) != 0) {
            aVar = ((e6) rVar.m(f6.f26169a)).f26104b;
        } else {
            aVar = gVar;
        }
        if ((i11 & 4) != 0) {
            j11 = ((v0) rVar.m(x0.f27075a)).d();
        } else {
            j11 = j10;
        }
        if ((i11 & 8) != 0) {
            j12 = x0.a(j11, rVar);
        } else {
            j12 = 0;
        }
        if ((i11 & 16) != 0) {
            d0Var2 = null;
        } else {
            d0Var2 = d0Var;
        }
        if ((i11 & 32) != 0) {
            f11 = 1;
        } else {
            f11 = f10;
        }
        j(oVar2, aVar, j11, j12, d0Var2, f11, cVar, rVar, (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (i10 & 3670016), 0);
        rVar.s(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void c(g1.o r14, long r15, float r17, float r18, t0.n r19, int r20, int r21) {
        /*
            Method dump skipped, instructions count: 303
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pp.b.c(g1.o, long, float, float, t0.n, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0066  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void d(boolean r22, kotlin.jvm.functions.Function0 r23, g1.o r24, long r25, x.o2 r27, z2.u r28, hu.c r29, t0.n r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pp.b.d(boolean, kotlin.jvm.functions.Function0, g1.o, long, x.o2, z2.u, hu.c, t0.n, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void e(kotlin.jvm.functions.Function0 r17, g1.o r18, boolean r19, b0.h1 r20, a0.l r21, hu.c r22, t0.n r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pp.b.e(kotlin.jvm.functions.Function0, g1.o, boolean, b0.h1, a0.l, hu.c, t0.n, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x019d, code lost:
    
        if (r15 == r12) goto L88;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void f(boolean r23, kotlin.jvm.functions.Function1 r24, g1.o r25, hu.c r26, t0.n r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 713
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pp.b.f(boolean, kotlin.jvm.functions.Function1, g1.o, hu.c, t0.n, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0051  */
    /* JADX WARN: Type inference failed for: r7v22, types: [m0.g3, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void g(g1.o r21, hu.c r22, t0.n r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 571
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pp.b.g(g1.o, hu.c, t0.n, int, int):void");
    }

    public static final void h(Function0 function0, o oVar, boolean z10, h0.g gVar, d0 d0Var, f1 f1Var, i1 i1Var, b1.c cVar, n nVar, int i10, int i11) {
        o oVar2;
        boolean z11;
        h0.a aVar;
        d0 d0Var2;
        f1 f1Var2;
        i1 i1Var2;
        r rVar = (r) nVar;
        rVar.b0(-1776134358);
        if ((i11 & 2) != 0) {
            oVar2 = g1.l.f16404b;
        } else {
            oVar2 = oVar;
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        } else {
            z11 = z10;
        }
        if ((i11 & 32) != 0) {
            aVar = ((e6) rVar.m(f6.f26169a)).f26103a;
        } else {
            aVar = gVar;
        }
        if ((i11 & 64) != 0) {
            d0Var2 = m0.b(rVar);
        } else {
            d0Var2 = d0Var;
        }
        if ((i11 & 128) != 0) {
            i1 i1Var3 = m0.f26467a;
            rVar.b0(-2124406093);
            m3 m3Var = x0.f27075a;
            long d10 = ((v0) rVar.m(m3Var)).d();
            f1Var2 = new f1(d10, ((v0) rVar.m(m3Var)).c(), d10, n1.t.c(((v0) rVar.m(m3Var)).b(), vl.b.r(rVar)));
            rVar.s(false);
        } else {
            f1Var2 = f1Var;
        }
        if ((i11 & 256) != 0) {
            i1Var2 = m0.f26467a;
        } else {
            i1Var2 = i1Var;
        }
        a(function0, oVar2, z11, null, null, aVar, d0Var2, f1Var2, i1Var2, cVar, rVar, (i10 & 14) | (i10 & 112) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10) | (29360128 & i10) | (234881024 & i10) | (i10 & 1879048192), 0);
        rVar.s(false);
    }

    public static final void i(l6 l6Var, o oVar, hu.c cVar, n nVar, int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int i15;
        r rVar = (r) nVar;
        rVar.c0(431012348);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            if (rVar.h(l6Var)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i12 = i13 | i10;
        } else {
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            if (rVar.h(oVar)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i12 |= i14;
        }
        int i17 = i11 & 4;
        if (i17 != 0) {
            i12 |= 384;
        } else if ((i10 & 384) == 0) {
            if (rVar.j(cVar)) {
                i15 = 256;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        }
        if ((i12 & 147) == 146 && rVar.G()) {
            rVar.V();
        } else {
            if (i16 != 0) {
                oVar = g1.l.f16404b;
            }
            if (i17 != 0) {
                cVar = b1.f25919a;
            }
            a3.a.u(l6Var.f26453a.getValue());
            i iVar = (i) rVar.m(s1.f13616a);
            rVar.b0(1627731230);
            boolean j10 = rVar.j(null) | rVar.j(iVar);
            Object Q = rVar.Q();
            if (j10 || Q == m.f35080a) {
                Q = new i6(iVar, null);
                rVar.k0(Q);
            }
            rVar.s(false);
            t0.t.e(null, (Function2) Q, rVar);
            a3.a.u(l6Var.f26453a.getValue());
            g(oVar, cVar, rVar, (i12 & 896) | (i12 & 112), 0);
        }
        o oVar2 = oVar;
        hu.c cVar2 = cVar;
        x1 w10 = rVar.w();
        if (w10 != null) {
            w10.f35245d = new d0.t(i10, i11, 3, l6Var, oVar2, cVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void j(g1.o r26, n1.x0 r27, long r28, long r30, x.d0 r32, float r33, kotlin.jvm.functions.Function2 r34, t0.n r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pp.b.j(g1.o, n1.x0, long, long, x.d0, float, kotlin.jvm.functions.Function2, t0.n, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:80:0x01ab, code lost:
    
        if (r4 != 0) goto L147;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00fb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void k(kotlin.jvm.functions.Function0 r28, g1.o r29, boolean r30, n1.x0 r31, long r32, long r34, x.d0 r36, float r37, a0.l r38, kotlin.jvm.functions.Function2 r39, t0.n r40, int r41, int r42) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pp.b.k(kotlin.jvm.functions.Function0, g1.o, boolean, n1.x0, long, long, x.d0, float, a0.l, kotlin.jvm.functions.Function2, t0.n, int, int):void");
    }

    public static final void l(Function0 function0, f1 f1Var, b1.c cVar, n nVar, int i10) {
        g1.l lVar;
        boolean z10;
        h0.a aVar;
        f1 f1Var2;
        i1 i1Var;
        r rVar = (r) nVar;
        rVar.b0(288797557);
        if ((i10 & 2) != 0) {
            lVar = g1.l.f16404b;
        } else {
            lVar = null;
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if ((i10 & 32) != 0) {
            aVar = ((e6) rVar.m(f6.f26169a)).f26103a;
        } else {
            aVar = null;
        }
        if ((i10 & 128) != 0) {
            f1Var2 = m0.c(0L, rVar, 7);
        } else {
            f1Var2 = f1Var;
        }
        if ((i10 & 256) != 0) {
            i1Var = m0.f26471e;
        } else {
            i1Var = null;
        }
        a(function0, lVar, z10, null, null, aVar, null, f1Var2, i1Var, cVar, rVar, 805306368, 0);
        rVar.s(false);
    }

    public static final g1 m(boolean z10, boolean z11, k kVar, m0.s1 s1Var, float f10, float f11, n nVar, int i10) {
        long j10;
        l3 r02;
        l3 r03;
        r rVar = (r) nVar;
        rVar.b0(1097899920);
        g1 m10 = i0.m(kVar, rVar, (i10 >> 6) & 14);
        s1Var.getClass();
        rVar.b0(998675979);
        g1 m11 = i0.m(kVar, rVar, (((i10 & 7168) | (((i10 & 14) | (i10 & 112)) | (i10 & 896))) >> 6) & 14);
        if (!z10) {
            j10 = s1Var.f26764h;
        } else if (z11) {
            j10 = s1Var.f26763g;
        } else if (((Boolean) m11.getValue()).booleanValue()) {
            j10 = s1Var.f26761e;
        } else {
            j10 = s1Var.f26762f;
        }
        long j11 = j10;
        if (z10) {
            rVar.b0(-2054188842);
            r02 = n0.a(j11, w.e.x(150, 0, null, 6), rVar, 48, 12);
            rVar.s(false);
        } else {
            rVar.b0(-2054188737);
            r02 = t0.t.r0(new n1.t(j11), rVar);
            rVar.s(false);
        }
        rVar.s(false);
        if (!((Boolean) m10.getValue()).booleanValue()) {
            f10 = f11;
        }
        if (z10) {
            rVar.b0(1685713621);
            r03 = w.i.a(f10, w.e.x(150, 0, null, 6), rVar, 48);
            rVar.s(false);
        } else {
            rVar.b0(1685713719);
            r03 = t0.t.r0(new w2.e(f11), rVar);
            rVar.s(false);
        }
        g1 r04 = t0.t.r0(new d0(((w2.e) r03.getValue()).f38783a, new n1.z0(((n1.t) r02.getValue()).f28179a)), rVar);
        rVar.s(false);
        return r04;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:1|(2:3|(7:5|6|7|(1:(1:10)(2:16|17))(3:18|19|(1:21))|11|12|13))|23|6|7|(0)(0)|11|12|13) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object n(m0.w r4, kotlin.jvm.functions.Function2 r5, yt.a r6) {
        /*
            boolean r0 = r6 instanceof m0.g
            if (r0 == 0) goto L13
            r0 = r6
            m0.g r0 = (m0.g) r0
            int r1 = r0.f26189b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26189b = r1
            goto L18
        L13:
            m0.g r0 = new m0.g
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f26188a
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f26189b
            r3 = 1
            if (r2 == 0) goto L2f
            if (r2 != r3) goto L27
            ut.n.b(r6)     // Catch: m0.a -> L41
            goto L41
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2f:
            ut.n.b(r6)
            m0.k r6 = new m0.k     // Catch: m0.a -> L41
            r2 = 0
            r6.<init>(r4, r5, r2)     // Catch: m0.a -> L41
            r0.f26189b = r3     // Catch: m0.a -> L41
            java.lang.Object r4 = hl.f.P(r6, r0)     // Catch: m0.a -> L41
            if (r4 != r1) goto L41
            goto L43
        L41:
            kotlin.Unit r1 = kotlin.Unit.f23355a
        L43:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: pp.b.n(m0.w, kotlin.jvm.functions.Function2, yt.a):java.lang.Object");
    }

    public static final o o(o oVar, n1.x0 x0Var, long j10, d0 d0Var, float f10) {
        o i10 = androidx.compose.ui.draw.a.i(oVar, f10, x0Var, false, 24);
        o oVar2 = g1.l.f16404b;
        if (d0Var != null) {
            oVar2 = androidx.compose.foundation.a.h(d0Var.f39525a, oVar2, d0Var.f39526b, x0Var);
        }
        return androidx.compose.ui.draw.a.b(androidx.compose.foundation.a.e(i10.g(oVar2), j10, x0Var), x0Var);
    }

    public static final long p(long j10, t2 t2Var, float f10, n nVar) {
        r rVar = (r) nVar;
        rVar.b0(1561611256);
        if (n1.t.d(j10, ((v0) rVar.m(x0.f27075a)).d()) && t2Var != null) {
            j10 = ((l1) t2Var).a(j10, f10, rVar, 0);
        }
        rVar.s(false);
        return j10;
    }

    public static final void q(View view, u uVar, int i10, a3 a3Var) {
        if (uVar != null) {
            Rect rect = new Rect();
            view.getWindowVisibleDisplayFrame(rect);
            m1.d d10 = androidx.compose.ui.layout.a.d(uVar);
            a3Var.invoke(Integer.valueOf(((int) Math.max(d10.f27240b - rect.top, (rect.bottom - r1) - androidx.compose.ui.layout.a.d(uVar).f27242d)) - i10));
        }
    }

    public static o r(o oVar, y yVar, y.g1 g1Var, boolean z10, boolean z11, int i10) {
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = true;
        if ((i10 & 4) != 0) {
            z12 = true;
        } else {
            z12 = z10;
        }
        if ((i10 & 8) != 0) {
            z13 = false;
        } else {
            z13 = z11;
        }
        if ((i10 & 32) != 0) {
            if (yVar.f27125l.getValue() == null) {
                z15 = false;
            }
            z14 = z15;
        } else {
            z14 = false;
        }
        return t0.c(oVar, yVar.f27119f, g1Var, z12, null, z14, new m0.d(yVar, null), z13, 32);
    }

    public static final Object s(y yVar, Object obj, float f10, yt.a aVar) {
        Object a10 = yVar.a(obj, x.s1.f39717a, new m0.f(yVar, f10, null), aVar);
        if (a10 == zt.a.f42823a) {
            return a10;
        }
        return Unit.f23355a;
    }

    public static void t(BarChart barChart) {
        Intrinsics.checkNotNullParameter(barChart, "barChart");
        barChart.setBackgroundColor(-1);
        barChart.setAutoScaleMinMaxEnabled(true);
        barChart.getAxisRight().f36180a = false;
        tm.i xAxis = barChart.getXAxis();
        xAxis.B = true;
        xAxis.E = 0.5f;
        xAxis.F = Math.abs(xAxis.D - 0.5f);
        xAxis.f36180a = true;
        xAxis.f36172s = false;
        xAxis.I = 2;
        xAxis.f36162i = Color.rgb(255, 255, 255);
        xAxis.f36169p = 1.0f;
        xAxis.f36170q = true;
        tm.e legend = barChart.getLegend();
        legend.f36189h = 3;
        legend.f36188g = 2;
        legend.f36190i = 1;
        legend.f36193l = 4;
        legend.f36191j = false;
        legend.f36182c = cn.h.c(8.0f);
        legend.f36181b = cn.h.c(s0.g.f34069a);
        legend.f36196o = 24.0f;
        legend.a(12.0f);
        legend.f36194m = 12.0f;
        barChart.setDrawGridBackground(false);
        barChart.setDrawBarShadow(false);
        barChart.setExtraLeftOffset(s0.g.f34069a);
        barChart.setExtraTopOffset(s0.g.f34069a);
        barChart.setExtraRightOffset(s0.g.f34069a);
        barChart.setExtraBottomOffset(16.0f);
        barChart.setScaleEnabled(true);
        barChart.setTouchEnabled(false);
        barChart.setDoubleTapToZoomEnabled(true);
    }

    public static final void u(b3.u uVar, List list) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            l0 l0Var = (l0) list.get(i10);
            Object f10 = androidx.compose.ui.layout.a.f(l0Var);
            if (f10 == null) {
                l0Var.a();
                f10 = new p(1);
            }
            g3.b b10 = uVar.b(f10.toString());
            if (b10 != null) {
                b10.f16447f0 = l0Var;
                j3.d dVar = b10.f16449g0;
                if (dVar != null) {
                    dVar.f20863h0 = l0Var;
                }
            }
            l0Var.a();
        }
    }

    public static final boolean v(int i10, int i11) {
        return i10 == i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
    
        r4 = new um.e(r7, ((zi.a) r14.f42468b.get(r3)).f42459a);
        r4.f37240v = 1;
        r4.f37241w = android.graphics.Color.rgb(215, 215, 215);
        r4.f37242x = -16777216;
        r4.f37243y = 120;
        r4.f37244z = new java.lang.String[]{"Stack"};
        r4.f37245u = android.graphics.Color.rgb(0, 0, 0);
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
    
        if (r6 >= r7.size()) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x009f, code lost:
    
        ((um.c) r7.get(r6)).getClass();
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00ab, code lost:
    
        r6 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b0, code lost:
    
        if (r6 >= r7.size()) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b2, code lost:
    
        ((um.c) r7.get(r6)).getClass();
        r6 = r6 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00be, code lost:
    
        r4.f37270n = cn.h.c(s0.g.f34069a);
        r4.k(((java.lang.Number) r15.get(r3)).intValue());
        r0.add(r4);
        r3 = r5;
     */
    /* JADX WARN: Type inference failed for: r14v1, types: [um.d, um.a] */
    /* JADX WARN: Type inference failed for: r4v4, types: [um.h, um.e, um.b, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static um.a w(zi.d r14, java.util.ArrayList r15) {
        /*
            java.lang.String r0 = "marketSectionData"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            java.lang.String r0 = "colorList"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r1 = r14.f42470d
            java.util.Iterator r1 = r1.iterator()
            r2 = 0
            r3 = r2
        L17:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto Ldb
            java.lang.Object r4 = r1.next()
            int r5 = r3 + 1
            r6 = 0
            if (r3 < 0) goto Ld7
            java.util.List r4 = (java.util.List) r4
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r4 = r4.iterator()
            r8 = r2
        L32:
            boolean r9 = r4.hasNext()
            r10 = 0
            if (r9 == 0) goto L68
            java.lang.Object r9 = r4.next()
            int r11 = r8 + 1
            if (r8 < 0) goto L64
            zi.b r9 = (zi.b) r9
            um.c r8 = new um.c
            float r12 = (float) r11
            java.lang.String r13 = r9.f42462a
            int r13 = r13.length()
            if (r13 <= 0) goto L5c
            java.lang.String r9 = r9.f42462a
            java.lang.String r10 = ","
            java.lang.String r13 = ""
            java.lang.String r9 = kotlin.text.s.n(r9, r10, r13, r2)
            float r10 = java.lang.Float.parseFloat(r9)
        L5c:
            r8.<init>(r12, r10)
            r7.add(r8)
            r8 = r11
            goto L32
        L64:
            vt.y.j()
            throw r6
        L68:
            um.b r4 = new um.b
            java.util.List r6 = r14.f42468b
            java.lang.Object r6 = r6.get(r3)
            zi.a r6 = (zi.a) r6
            java.lang.String r6 = r6.f42459a
            r4.<init>(r7, r6)
            r6 = 1
            r4.f37240v = r6
            r6 = 215(0xd7, float:3.01E-43)
            int r6 = android.graphics.Color.rgb(r6, r6, r6)
            r4.f37241w = r6
            r6 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r4.f37242x = r6
            r6 = 120(0x78, float:1.68E-43)
            r4.f37243y = r6
            java.lang.String r6 = "Stack"
            java.lang.String[] r6 = new java.lang.String[]{r6}
            r4.f37244z = r6
            int r6 = android.graphics.Color.rgb(r2, r2, r2)
            r4.f37245u = r6
            r6 = r2
        L99:
            int r8 = r7.size()
            if (r6 >= r8) goto Lab
            java.lang.Object r8 = r7.get(r6)
            um.c r8 = (um.c) r8
            r8.getClass()
            int r6 = r6 + 1
            goto L99
        Lab:
            r6 = r2
        Lac:
            int r8 = r7.size()
            if (r6 >= r8) goto Lbe
            java.lang.Object r8 = r7.get(r6)
            um.c r8 = (um.c) r8
            r8.getClass()
            int r6 = r6 + 1
            goto Lac
        Lbe:
            float r6 = cn.h.c(r10)
            r4.f37270n = r6
            java.lang.Object r3 = r15.get(r3)
            java.lang.Number r3 = (java.lang.Number) r3
            int r3 = r3.intValue()
            r4.k(r3)
            r0.add(r4)
            r3 = r5
            goto L17
        Ld7:
            vt.y.j()
            throw r6
        Ldb:
            um.a r14 = new um.a
            java.util.List r15 = vt.g0.R(r0)
            r14.<init>(r15)
            r15 = 1062836634(0x3f59999a, float:0.85)
            r14.f37239j = r15
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: pp.b.w(zi.d, java.util.ArrayList):um.a");
    }

    public static ArrayList x() {
        return vt.y.c(Integer.valueOf(Color.rgb(87, 16, 160)), Integer.valueOf(Color.rgb(117, 21, 213)), Integer.valueOf(Color.rgb(172, 104, 240)), Integer.valueOf(Color.rgb(200, 154, 245)), Integer.valueOf(Color.rgb(227, 205, 250)));
    }

    public static String y(long j10) {
        long j11 = CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT;
        hv.e n10 = hv.e.n(j10 / j11);
        hv.f fVar = a3.a.a(n10, n10).f18769a.f18726a;
        hv.e l10 = hv.e.l(0, System.currentTimeMillis() / j11);
        hv.f fVar2 = a3.a.a(l10, l10).f18769a.f18726a;
        if (fVar.v(fVar2)) {
            return "Today";
        }
        if (fVar.v(fVar2.y(1L))) {
            return "Yesterday";
        }
        if (fVar.u(fVar2) && fVar.t(fVar2.y(7L))) {
            String a10 = jv.a.b("EEEE").a(fVar);
            Intrinsics.checkNotNullExpressionValue(a10, "format(...)");
            return a10;
        }
        if (fVar.f18721a < fVar2.f18721a) {
            String a11 = jv.a.b("dd MMM YYYY").a(fVar);
            Intrinsics.checkNotNullExpressionValue(a11, "format(...)");
            return a11;
        }
        String a12 = jv.a.b("dd MMM").a(fVar);
        Intrinsics.checkNotNullExpressionValue(a12, "format(...)");
        return a12;
    }

    public static final String z(int i10, n nVar) {
        String str;
        r rVar = (r) nVar;
        rVar.b0(-726638443);
        rVar.m(AndroidCompositionLocals_androidKt.f1427a);
        Resources resources = ((Context) rVar.m(AndroidCompositionLocals_androidKt.f1428b)).getResources();
        if (yk.j.R0(i10, 0)) {
            str = resources.getString(R.string.navigation_menu);
        } else if (yk.j.R0(i10, 1)) {
            str = resources.getString(R.string.close_drawer);
        } else if (yk.j.R0(i10, 2)) {
            str = resources.getString(R.string.close_sheet);
        } else if (yk.j.R0(i10, 3)) {
            str = resources.getString(R.string.default_error_message);
        } else if (yk.j.R0(i10, 4)) {
            str = resources.getString(R.string.dropdown_menu);
        } else if (yk.j.R0(i10, 5)) {
            str = resources.getString(R.string.range_start);
        } else if (yk.j.R0(i10, 6)) {
            str = resources.getString(R.string.range_end);
        } else {
            str = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        rVar.s(false);
        return str;
    }

    public abstract Object A(int i10, Object obj, yt.a aVar);
}
