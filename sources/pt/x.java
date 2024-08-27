package pt;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public abstract class x {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f31404a;

    /* renamed from: b, reason: collision with root package name */
    public static final int f31405b;

    /* renamed from: c, reason: collision with root package name */
    public static final AtomicReference f31406c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public static final ConcurrentHashMap f31407d = new ConcurrentHashMap();

    /* JADX WARN: Removed duplicated region for block: B:11:0x003f A[LOOP:0: B:11:0x003f->B:19:0x0070, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0074 A[ORIG_RETURN, RETURN] */
    static {
        /*
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            pt.x.f31406c = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            pt.x.f31407d = r0
            java.util.Properties r0 = java.lang.System.getProperties()
            java.lang.String r1 = "rx2.purge-enabled"
            boolean r2 = r0.containsKey(r1)
            r3 = 1
            if (r2 == 0) goto L24
            java.lang.String r1 = r0.getProperty(r1)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            goto L25
        L24:
            r1 = r3
        L25:
            if (r1 == 0) goto L38
            java.lang.String r2 = "rx2.purge-period-seconds"
            boolean r4 = r0.containsKey(r2)
            if (r4 == 0) goto L38
            java.lang.String r0 = r0.getProperty(r2)     // Catch: java.lang.NumberFormatException -> L38
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L38
            goto L39
        L38:
            r0 = r3
        L39:
            pt.x.f31404a = r1
            pt.x.f31405b = r0
            if (r1 == 0) goto L74
        L3f:
            java.util.concurrent.atomic.AtomicReference r0 = pt.x.f31406c
            java.lang.Object r1 = r0.get()
            java.util.concurrent.ScheduledExecutorService r1 = (java.util.concurrent.ScheduledExecutorService) r1
            if (r1 == 0) goto L4a
            goto L74
        L4a:
            pt.t r2 = new pt.t
            java.lang.String r4 = "RxSchedulerPurge"
            r2.<init>(r4)
            java.util.concurrent.ScheduledExecutorService r5 = java.util.concurrent.Executors.newScheduledThreadPool(r3, r2)
        L55:
            boolean r2 = r0.compareAndSet(r1, r5)
            if (r2 == 0) goto L6a
            gt.b r6 = new gt.b
            r6.<init>(r3)
            int r0 = pt.x.f31405b
            long r9 = (long) r0
            java.util.concurrent.TimeUnit r11 = java.util.concurrent.TimeUnit.SECONDS
            r7 = r9
            r5.scheduleAtFixedRate(r6, r7, r9, r11)
            goto L74
        L6a:
            java.lang.Object r2 = r0.get()
            if (r2 == r1) goto L55
            r5.shutdownNow()
            goto L3f
        L74:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: pt.x.<clinit>():void");
    }
}
