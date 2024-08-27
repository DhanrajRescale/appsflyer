package d2;

import android.view.ViewGroup;

/* loaded from: classes.dex */
public abstract class k4 {

    /* renamed from: a, reason: collision with root package name */
    public static final ViewGroup.LayoutParams f13490a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00b2  */
    /* JADX WARN: Type inference failed for: r6v1, types: [c2.e2, t0.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final d2.i4 a(d2.a r6, t0.v r7, b1.c r8) {
        /*
            java.util.concurrent.atomic.AtomicBoolean r0 = d2.a2.f13350a
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            r3 = 0
            if (r0 == 0) goto L42
            r0 = 6
            su.c r0 = hl.f.a(r2, r3, r0)
            ut.g r2 = d2.h1.f13427m
            java.lang.Object r2 = r2.getValue()
            kotlin.coroutines.CoroutineContext r2 = (kotlin.coroutines.CoroutineContext) r2
            vu.f r2 = hl.f.d(r2)
            d2.z1 r4 = new d2.z1
            r4.<init>(r0, r3)
            r5 = 3
            yk.g.H(r2, r3, r3, r4, r5)
            c2.e1 r2 = new c2.e1
            r4 = 4
            r2.<init>(r0, r4)
            java.lang.Object r0 = e1.p.f14905b
            monitor-enter(r0)
            java.util.List r4 = e1.p.f14911h     // Catch: java.lang.Throwable -> L3f
            java.util.ArrayList r2 = vt.g0.J(r2, r4)     // Catch: java.lang.Throwable -> L3f
            e1.p.f14911h = r2     // Catch: java.lang.Throwable -> L3f
            kotlin.Unit r2 = kotlin.Unit.f23355a     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r0)
            e1.o r0 = e1.o.f14901b
            e1.p.e(r0)
            goto L42
        L3f:
            r6 = move-exception
            monitor-exit(r0)
            throw r6
        L42:
            int r0 = r6.getChildCount()
            if (r0 <= 0) goto L55
            android.view.View r0 = r6.getChildAt(r1)
            boolean r1 = r0 instanceof d2.a0
            if (r1 == 0) goto L53
            d2.a0 r0 = (d2.a0) r0
            goto L59
        L53:
            r0 = r3
            goto L59
        L55:
            r6.removeAllViews()
            goto L53
        L59:
            if (r0 != 0) goto L71
            d2.a0 r0 = new d2.a0
            android.content.Context r1 = r6.getContext()
            kotlin.coroutines.CoroutineContext r2 = r7.h()
            r0.<init>(r1, r2)
            android.view.View r1 = r0.getView()
            android.view.ViewGroup$LayoutParams r2 = d2.k4.f13490a
            r6.addView(r1, r2)
        L71:
            c2.e2 r6 = new c2.e2
            androidx.compose.ui.node.a r1 = r0.getRoot()
            r6.<init>(r1)
            java.lang.Object r1 = t0.z.f35276a
            t0.y r1 = new t0.y
            r1.<init>(r7, r6)
            android.view.View r6 = r0.getView()
            r2 = 2131364850(0x7f0a0bf2, float:1.8349549E38)
            java.lang.Object r6 = r6.getTag(r2)
            boolean r4 = r6 instanceof d2.i4
            if (r4 == 0) goto L93
            r3 = r6
            d2.i4 r3 = (d2.i4) r3
        L93:
            if (r3 != 0) goto La1
            d2.i4 r3 = new d2.i4
            r3.<init>(r0, r1)
            android.view.View r6 = r0.getView()
            r6.setTag(r2, r3)
        La1:
            r3.e(r8)
            kotlin.coroutines.CoroutineContext r6 = r0.getCoroutineContext()
            kotlin.coroutines.CoroutineContext r8 = r7.h()
            boolean r6 = kotlin.jvm.internal.Intrinsics.a(r6, r8)
            if (r6 != 0) goto Lb9
            kotlin.coroutines.CoroutineContext r6 = r7.h()
            r0.setCoroutineContext(r6)
        Lb9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.k4.a(d2.a, t0.v, b1.c):d2.i4");
    }
}
