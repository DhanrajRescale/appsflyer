package el;

import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final d f15647a = new Object();

    /* JADX WARN: Removed duplicated region for block: B:18:0x0038 A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #2 {, blocks: (B:12:0x001a, B:16:0x0032, B:18:0x0038, B:31:0x0040, B:39:0x0050, B:33:0x0053, B:44:0x002e, B:41:0x002a, B:36:0x004c), top: B:11:0x001a, outer: #0, inners: #1, #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0040 A[Catch: all -> 0x003e, TRY_ENTER, TRY_LEAVE, TryCatch #2 {, blocks: (B:12:0x001a, B:16:0x0032, B:18:0x0038, B:31:0x0040, B:39:0x0050, B:33:0x0053, B:44:0x002e, B:41:0x002a, B:36:0x004c), top: B:11:0x001a, outer: #0, inners: #1, #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(android.content.Context r4) {
        /*
            java.lang.Class<el.d> r0 = el.d.class
            boolean r0 = sl.a.b(r0)
            if (r0 == 0) goto L9
            return
        L9:
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r0 = "com.android.billingclient.api.Purchase"
            java.lang.Class r0 = el.l.c0(r0)     // Catch: java.lang.Throwable -> L7a
            if (r0 != 0) goto L17
            return
        L17:
            ek.h r0 = el.g.f15652s     // Catch: java.lang.Throwable -> L7a
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L7a
            java.lang.String r1 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r1)     // Catch: java.lang.Throwable -> L3e
            java.lang.Class<el.g> r1 = el.g.class
            boolean r2 = sl.a.b(r1)     // Catch: java.lang.Throwable -> L3e
            r3 = 0
            if (r2 == 0) goto L2a
        L28:
            r1 = r3
            goto L32
        L2a:
            java.util.concurrent.atomic.AtomicBoolean r1 = el.g.f15653t     // Catch: java.lang.Throwable -> L2d
            goto L32
        L2d:
            r2 = move-exception
            sl.a.a(r1, r2)     // Catch: java.lang.Throwable -> L3e
            goto L28
        L32:
            boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L40
            el.g r4 = el.g.a()     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7a
            goto L5c
        L3e:
            r4 = move-exception
            goto L87
        L40:
            ek.h.i(r4)     // Catch: java.lang.Throwable -> L3e
            java.lang.Class<el.g> r4 = el.g.class
            boolean r1 = sl.a.b(r4)     // Catch: java.lang.Throwable -> L3e
            if (r1 == 0) goto L4c
            goto L53
        L4c:
            java.util.concurrent.atomic.AtomicBoolean r3 = el.g.f15653t     // Catch: java.lang.Throwable -> L4f
            goto L53
        L4f:
            r1 = move-exception
            sl.a.a(r4, r1)     // Catch: java.lang.Throwable -> L3e
        L53:
            r4 = 1
            r3.set(r4)     // Catch: java.lang.Throwable -> L3e
            el.g r4 = el.g.a()     // Catch: java.lang.Throwable -> L3e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7a
        L5c:
            if (r4 != 0) goto L5f
            return
        L5f:
            java.util.concurrent.atomic.AtomicBoolean r0 = ek.h.y()     // Catch: java.lang.Throwable -> L7a
            boolean r0 = r0.get()     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L86
            boolean r0 = el.i.d()     // Catch: java.lang.Throwable -> L7a
            if (r0 == 0) goto L7c
            com.appsflyer.internal.l r0 = new com.appsflyer.internal.l     // Catch: java.lang.Throwable -> L7a
            r1 = 8
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L7a
            r4.c(r0)     // Catch: java.lang.Throwable -> L7a
            goto L86
        L7a:
            r4 = move-exception
            goto L89
        L7c:
            com.appsflyer.internal.l r0 = new com.appsflyer.internal.l     // Catch: java.lang.Throwable -> L7a
            r1 = 9
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L7a
            r4.b(r0)     // Catch: java.lang.Throwable -> L7a
        L86:
            return
        L87:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7a
            throw r4     // Catch: java.lang.Throwable -> L7a
        L89:
            java.lang.Class<el.d> r0 = el.d.class
            sl.a.a(r0, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: el.d.b(android.content.Context):void");
    }

    public final void a() {
        if (sl.a.b(this)) {
            return;
        }
        try {
            i iVar = i.f15682a;
            ek.h hVar = g.f15652s;
            ConcurrentHashMap w10 = ek.h.w();
            ConcurrentHashMap concurrentHashMap = null;
            if (!sl.a.b(g.class)) {
                try {
                    concurrentHashMap = g.f15657x;
                } catch (Throwable th2) {
                    sl.a.a(g.class, th2);
                }
            }
            i.e(w10, concurrentHashMap);
            ek.h.w().clear();
        } catch (Throwable th3) {
            sl.a.a(this, th3);
        }
    }
}
