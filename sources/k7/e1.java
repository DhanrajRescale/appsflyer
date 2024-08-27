package k7;

import java.util.ArrayList;

/* loaded from: classes.dex */
public abstract class e1 {

    /* renamed from: a, reason: collision with root package name */
    public x0 f22331a;

    /* renamed from: b, reason: collision with root package name */
    public ArrayList f22332b;

    /* renamed from: c, reason: collision with root package name */
    public long f22333c;

    /* renamed from: d, reason: collision with root package name */
    public long f22334d;

    /* renamed from: e, reason: collision with root package name */
    public long f22335e;

    /* renamed from: f, reason: collision with root package name */
    public long f22336f;

    public static int b(y1 y1Var) {
        int i10 = y1Var.f22638j;
        int i11 = i10 & 14;
        if (y1Var.j()) {
            return 4;
        }
        if ((i10 & 4) == 0) {
            int i12 = y1Var.f22632d;
            int c10 = y1Var.c();
            if (i12 != -1 && c10 != -1 && i12 != c10) {
                return i11 | 2048;
            }
            return i11;
        }
        return i11;
    }

    public abstract boolean a(y1 y1Var, y1 y1Var2, v5.i iVar, v5.i iVar2);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void c(k7.y1 r10) {
        /*
            r9 = this;
            k7.x0 r0 = r9.f22331a
            if (r0 == 0) goto Laf
            r1 = 1
            r10.r(r1)
            k7.y1 r2 = r10.f22636h
            r3 = 0
            if (r2 == 0) goto L13
            k7.y1 r2 = r10.f22637i
            if (r2 != 0) goto L13
            r10.f22636h = r3
        L13:
            r10.f22637i = r3
            int r2 = r10.f22638j
            r2 = r2 & 16
            if (r2 == 0) goto L1d
            goto Laf
        L1d:
            androidx.recyclerview.widget.RecyclerView r0 = r0.f22614a
            r0.m0()
            k7.j r2 = r0.f2386f
            l5.j r3 = r2.f22424b
            k7.x0 r4 = r2.f22423a
            int r5 = r2.f22426d
            r6 = 0
            android.view.View r7 = r10.f22629a
            if (r5 != r1) goto L3d
            android.view.View r1 = r2.f22427e
            if (r1 != r7) goto L35
        L33:
            r1 = r6
            goto L66
        L35:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeView(At) for a different view"
            r10.<init>(r0)
            throw r10
        L3d:
            r8 = 2
            if (r5 == r8) goto La7
            r2.f22426d = r8     // Catch: java.lang.Throwable -> L51
            androidx.recyclerview.widget.RecyclerView r5 = r4.f22614a     // Catch: java.lang.Throwable -> L51
            int r5 = r5.indexOfChild(r7)     // Catch: java.lang.Throwable -> L51
            r8 = -1
            if (r5 != r8) goto L53
            r2.m(r7)     // Catch: java.lang.Throwable -> L51
        L4e:
            r2.f22426d = r6
            goto L66
        L51:
            r10 = move-exception
            goto La4
        L53:
            boolean r8 = r3.f(r5)     // Catch: java.lang.Throwable -> L51
            if (r8 == 0) goto L63
            r3.i(r5)     // Catch: java.lang.Throwable -> L51
            r2.m(r7)     // Catch: java.lang.Throwable -> L51
            r4.k(r5)     // Catch: java.lang.Throwable -> L51
            goto L4e
        L63:
            r2.f22426d = r6
            goto L33
        L66:
            if (r1 == 0) goto L93
            k7.y1 r2 = androidx.recyclerview.widget.RecyclerView.N(r7)
            u6.g r3 = r0.f2382c
            r3.n(r2)
            r3.k(r2)
            boolean r2 = androidx.recyclerview.widget.RecyclerView.V0
            if (r2 == 0) goto L93
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "after removing animated view: "
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r3 = ", "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "RecyclerView"
            android.util.Log.d(r3, r2)
        L93:
            r2 = r1 ^ 1
            r0.o0(r2)
            if (r1 != 0) goto Laf
            boolean r10 = r10.n()
            if (r10 == 0) goto Laf
            r0.removeDetachedView(r7, r6)
            goto Laf
        La4:
            r2.f22426d = r6
            throw r10
        La7:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "Cannot call removeViewIfHidden within removeViewIfHidden"
            r10.<init>(r0)
            throw r10
        Laf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: k7.e1.c(k7.y1):void");
    }

    public abstract void d(y1 y1Var);

    public abstract void e();

    public abstract boolean f();
}
