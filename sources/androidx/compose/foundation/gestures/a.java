package androidx.compose.foundation.gestures;

import a0.l;
import b2.c;
import b2.i;
import g1.o;
import x.a2;
import y.d2;
import y.g1;
import y.i0;
import y.o0;
import y.u1;
import y.v1;
import y.w1;
import y.x0;

/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final o0 f1238a = new o0(2, null);

    /* renamed from: b, reason: collision with root package name */
    public static final v1 f1239b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public static final i f1240c = new c(i0.f40768f);

    /* renamed from: d, reason: collision with root package name */
    public static final u1 f1241d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final w1 f1242e = new Object();

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003e -> B:10:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(x1.m0 r5, yt.a r6) {
        /*
            boolean r0 = r6 instanceof y.x1
            if (r0 == 0) goto L13
            r0 = r6
            y.x1 r0 = (y.x1) r0
            int r1 = r0.f40990c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f40990c = r1
            goto L18
        L13:
            y.x1 r0 = new y.x1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f40989b
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f40990c
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            x1.m0 r5 = r0.f40988a
            ut.n.b(r6)
            goto L41
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            ut.n.b(r6)
        L34:
            r0.f40988a = r5
            r0.f40990c = r3
            x1.l r6 = x1.l.f39878b
            java.lang.Object r6 = r5.a(r6, r0)
            if (r6 != r1) goto L41
            goto L4d
        L41:
            x1.k r6 = (x1.k) r6
            int r2 = r6.f39873d
            r4 = 6
            boolean r2 = x1.r.a(r2, r4)
            if (r2 == 0) goto L34
            r1 = r6
        L4d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.a.a(x1.m0, yt.a):java.lang.Object");
    }

    public static final o b(o oVar, d2 d2Var, g1 g1Var, a2 a2Var, boolean z10, boolean z11, x0 x0Var, l lVar, y.o oVar2) {
        return oVar.g(new ScrollableElement(d2Var, g1Var, a2Var, z10, z11, x0Var, lVar, oVar2));
    }
}
