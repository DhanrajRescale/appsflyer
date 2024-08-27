package o2;

import android.content.Context;
import android.graphics.Typeface;
import kotlin.jvm.internal.Intrinsics;
import ut.l;

/* loaded from: classes.dex */
public final class b implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29454a;

    public b(Context context) {
        this.f29454a = context.getApplicationContext();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(o2.q r13, yt.a r14) {
        /*
            r12 = this;
            boolean r0 = r14 instanceof o2.a
            if (r0 == 0) goto L13
            r0 = r14
            o2.a r0 = (o2.a) r0
            int r1 = r0.f29452e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29452e = r1
            goto L18
        L13:
            o2.a r0 = new o2.a
            r0.<init>(r12, r14)
        L18:
            java.lang.Object r14 = r0.f29450c
            zt.a r1 = zt.a.f42823a
            int r2 = r0.f29452e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            o2.q r13 = r0.f29449b
            o2.b r0 = r0.f29448a
            ut.n.b(r14)
            goto L86
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L36:
            ut.n.b(r14)
            return r14
        L3a:
            ut.n.b(r14)
            boolean r14 = r13 instanceof o2.l0
            if (r14 == 0) goto L93
            r14 = r13
            o2.l0 r14 = (o2.l0) r14
            r0.f29448a = r12
            r0.f29449b = r13
            r0.f29452e = r3
            qu.i r2 = new qu.i
            yt.a r3 = zt.f.b(r0)
            r2.<init>(r4, r3)
            r2.s()
            int r6 = r14.f29505a
            o2.c r9 = new o2.c
            r9.<init>(r2, r14)
            java.lang.ThreadLocal r14 = t3.p.f35324a
            android.content.Context r5 = r12.f29454a
            boolean r14 = r5.isRestricted()
            if (r14 == 0) goto L6c
            r14 = -4
            r9.a(r14)
            goto L77
        L6c:
            android.util.TypedValue r7 = new android.util.TypedValue
            r7.<init>()
            r8 = 0
            r10 = 0
            r11 = 0
            t3.p.b(r5, r6, r7, r8, r9, r10, r11)
        L77:
            java.lang.Object r14 = r2.p()
            if (r14 != r1) goto L82
            java.lang.String r2 = "frame"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r0, r2)
        L82:
            if (r14 != r1) goto L85
            return r1
        L85:
            r0 = r12
        L86:
            android.graphics.Typeface r14 = (android.graphics.Typeface) r14
            o2.l0 r13 = (o2.l0) r13
            o2.c0 r13 = r13.f29508d
            android.content.Context r0 = r0.f29454a
            android.graphics.Typeface r13 = hl.f.R0(r14, r13, r0)
            return r13
        L93:
            java.lang.IllegalArgumentException r14 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown font type: "
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r14.<init>(r13)
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: o2.b.a(o2.q, yt.a):java.lang.Object");
    }

    public final Typeface b(q qVar) {
        Object a10;
        Typeface typeface;
        Object obj = null;
        if (!(qVar instanceof l0)) {
            return null;
        }
        l0 l0Var = (l0) qVar;
        int i10 = l0Var.f29509e;
        boolean X = hl.f.X(i10, 0);
        Context context = this.f29454a;
        if (X) {
            typeface = t3.p.a(((l0) qVar).f29505a, context);
            Intrinsics.c(typeface);
        } else if (hl.f.X(i10, 1)) {
            try {
                l.Companion companion = ut.l.INSTANCE;
                a10 = t3.p.a(((l0) qVar).f29505a, context);
                Intrinsics.c(a10);
            } catch (Throwable th2) {
                l.Companion companion2 = ut.l.INSTANCE;
                a10 = ut.n.a(th2);
            }
            if (!(a10 instanceof ut.m)) {
                obj = a10;
            }
            typeface = (Typeface) obj;
        } else {
            if (hl.f.X(i10, 2)) {
                throw new UnsupportedOperationException("Unsupported Async font load path");
            }
            throw new IllegalArgumentException("Unknown loading type " + ((Object) hl.f.j1(l0Var.f29509e)));
        }
        return hl.f.R0(typeface, ((l0) qVar).f29508d, context);
    }
}
