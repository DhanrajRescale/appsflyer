package z3;

import com.google.android.gms.search.SearchAuth;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import t.j0;
import t.q;

/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final q f41994a = new q(16);

    /* renamed from: b, reason: collision with root package name */
    public static final ThreadPoolExecutor f41995b;

    /* renamed from: c, reason: collision with root package name */
    public static final Object f41996c;

    /* renamed from: d, reason: collision with root package name */
    public static final j0 f41997d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, SearchAuth.StatusCodes.AUTH_DISABLED, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new j());
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f41995b = threadPoolExecutor;
        f41996c = new Object();
        f41997d = new j0(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static z3.f a(java.lang.String r7, android.content.Context r8, m.s r9, int r10) {
        /*
            t.q r0 = z3.g.f41994a
            java.lang.Object r1 = r0.get(r7)
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1
            if (r1 == 0) goto L10
            z3.f r7 = new z3.f
            r7.<init>(r1)
            return r7
        L10:
            eb.f r9 = z3.c.a(r8, r9)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L61
            int r1 = r9.f15308a
            r2 = 1
            r3 = -3
            if (r1 == 0) goto L20
            if (r1 == r2) goto L1e
        L1c:
            r2 = r3
            goto L3e
        L1e:
            r2 = -2
            goto L3e
        L20:
            java.lang.Object r1 = r9.f15309b
            z3.h[] r1 = (z3.h[]) r1
            if (r1 == 0) goto L3e
            int r4 = r1.length
            if (r4 != 0) goto L2a
            goto L3e
        L2a:
            int r2 = r1.length
            r4 = 0
            r5 = r4
        L2d:
            if (r5 >= r2) goto L3d
            r6 = r1[r5]
            int r6 = r6.f42002e
            if (r6 == 0) goto L3a
            if (r6 >= 0) goto L38
            goto L1c
        L38:
            r2 = r6
            goto L3e
        L3a:
            int r5 = r5 + 1
            goto L2d
        L3d:
            r2 = r4
        L3e:
            if (r2 == 0) goto L46
            z3.f r7 = new z3.f
            r7.<init>(r2)
            return r7
        L46:
            java.lang.Object r9 = r9.f15309b
            z3.h[] r9 = (z3.h[]) r9
            hr.c r1 = u3.e.f36710a
            android.graphics.Typeface r8 = r1.k(r8, r9, r10)
            if (r8 == 0) goto L5b
            r0.put(r7, r8)
            z3.f r7 = new z3.f
            r7.<init>(r8)
            return r7
        L5b:
            z3.f r7 = new z3.f
            r7.<init>(r3)
            return r7
        L61:
            z3.f r7 = new z3.f
            r8 = -1
            r7.<init>(r8)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: z3.g.a(java.lang.String, android.content.Context, m.s, int):z3.f");
    }
}
