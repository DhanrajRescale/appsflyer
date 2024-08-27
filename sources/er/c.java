package er;

import com.google.firebase.perf.config.RemoteConfigManager;
import fr.g;
import fr.i;
import java.util.concurrent.TimeUnit;
import vq.h;
import vq.t;
import vq.u;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: k, reason: collision with root package name */
    public static final yq.a f15822k = yq.a.d();

    /* renamed from: l, reason: collision with root package name */
    public static final long f15823l = TimeUnit.SECONDS.toMicros(1);

    /* renamed from: a, reason: collision with root package name */
    public final ll.e f15824a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f15825b;

    /* renamed from: d, reason: collision with root package name */
    public g f15827d;

    /* renamed from: g, reason: collision with root package name */
    public final g f15830g;

    /* renamed from: h, reason: collision with root package name */
    public final g f15831h;

    /* renamed from: i, reason: collision with root package name */
    public final long f15832i;

    /* renamed from: j, reason: collision with root package name */
    public final long f15833j;

    /* renamed from: e, reason: collision with root package name */
    public long f15828e = 500;

    /* renamed from: f, reason: collision with root package name */
    public double f15829f = 500;

    /* renamed from: c, reason: collision with root package name */
    public i f15826c = new i();

    /* JADX WARN: Type inference failed for: r3v29, types: [vq.h, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v33, types: [vq.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v35, types: [vq.u, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8, types: [vq.i, java.lang.Object] */
    public c(g gVar, ll.e eVar, vq.a aVar, String str) {
        long k10;
        vq.i iVar;
        long longValue;
        long k11;
        h hVar;
        long longValue2;
        t tVar;
        u uVar;
        this.f15824a = eVar;
        this.f15827d = gVar;
        if (str == "Trace") {
            k10 = aVar.k();
        } else {
            k10 = aVar.k();
        }
        long j10 = k10;
        if (str == "Trace") {
            synchronized (u.class) {
                try {
                    if (u.f38272b == null) {
                        u.f38272b = new Object();
                    }
                    uVar = u.f38272b;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            RemoteConfigManager remoteConfigManager = aVar.f38250a;
            uVar.getClass();
            fr.d dVar = remoteConfigManager.getLong("fpr_rl_trace_event_count_fg");
            if (dVar.b() && vq.a.l(((Long) dVar.a()).longValue())) {
                aVar.f38252c.d(((Long) dVar.a()).longValue(), "com.google.firebase.perf.TraceEventCountForeground");
                longValue = ((Long) dVar.a()).longValue();
            } else {
                fr.d c10 = aVar.c(uVar);
                if (c10.b() && vq.a.l(((Long) c10.a()).longValue())) {
                    longValue = ((Long) c10.a()).longValue();
                } else {
                    Long l10 = 300L;
                    longValue = l10.longValue();
                }
            }
        } else {
            synchronized (vq.i.class) {
                try {
                    if (vq.i.f38260b == null) {
                        vq.i.f38260b = new Object();
                    }
                    iVar = vq.i.f38260b;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
            RemoteConfigManager remoteConfigManager2 = aVar.f38250a;
            iVar.getClass();
            fr.d dVar2 = remoteConfigManager2.getLong("fpr_rl_network_event_count_fg");
            if (dVar2.b() && vq.a.l(((Long) dVar2.a()).longValue())) {
                aVar.f38252c.d(((Long) dVar2.a()).longValue(), "com.google.firebase.perf.NetworkEventCountForeground");
                longValue = ((Long) dVar2.a()).longValue();
            } else {
                fr.d c11 = aVar.c(iVar);
                if (c11.b() && vq.a.l(((Long) c11.a()).longValue())) {
                    longValue = ((Long) c11.a()).longValue();
                } else {
                    Long l11 = 700L;
                    longValue = l11.longValue();
                }
            }
        }
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f15830g = new g(longValue, j10, timeUnit);
        this.f15832i = longValue;
        if (str == "Trace") {
            k11 = aVar.k();
        } else {
            k11 = aVar.k();
        }
        long j11 = k11;
        if (str == "Trace") {
            synchronized (t.class) {
                try {
                    if (t.f38271b == null) {
                        t.f38271b = new Object();
                    }
                    tVar = t.f38271b;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            RemoteConfigManager remoteConfigManager3 = aVar.f38250a;
            tVar.getClass();
            fr.d dVar3 = remoteConfigManager3.getLong("fpr_rl_trace_event_count_bg");
            if (dVar3.b() && vq.a.l(((Long) dVar3.a()).longValue())) {
                aVar.f38252c.d(((Long) dVar3.a()).longValue(), "com.google.firebase.perf.TraceEventCountBackground");
                longValue2 = ((Long) dVar3.a()).longValue();
            } else {
                fr.d c12 = aVar.c(tVar);
                if (c12.b() && vq.a.l(((Long) c12.a()).longValue())) {
                    longValue2 = ((Long) c12.a()).longValue();
                } else {
                    Long l12 = 30L;
                    longValue2 = l12.longValue();
                }
            }
        } else {
            synchronized (h.class) {
                try {
                    if (h.f38259b == null) {
                        h.f38259b = new Object();
                    }
                    hVar = h.f38259b;
                } catch (Throwable th5) {
                    throw th5;
                }
            }
            RemoteConfigManager remoteConfigManager4 = aVar.f38250a;
            hVar.getClass();
            fr.d dVar4 = remoteConfigManager4.getLong("fpr_rl_network_event_count_bg");
            if (dVar4.b() && vq.a.l(((Long) dVar4.a()).longValue())) {
                aVar.f38252c.d(((Long) dVar4.a()).longValue(), "com.google.firebase.perf.NetworkEventCountBackground");
                longValue2 = ((Long) dVar4.a()).longValue();
            } else {
                fr.d c13 = aVar.c(hVar);
                if (c13.b() && vq.a.l(((Long) c13.a()).longValue())) {
                    longValue2 = ((Long) c13.a()).longValue();
                } else {
                    Long l13 = 70L;
                    longValue2 = l13.longValue();
                }
            }
        }
        this.f15831h = new g(longValue2, j11, timeUnit);
        this.f15833j = longValue2;
        this.f15825b = false;
    }

    public final synchronized void a(boolean z10) {
        g gVar;
        long j10;
        try {
            if (z10) {
                gVar = this.f15830g;
            } else {
                gVar = this.f15831h;
            }
            this.f15827d = gVar;
            if (z10) {
                j10 = this.f15832i;
            } else {
                j10 = this.f15833j;
            }
            this.f15828e = j10;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0068 A[Catch: all -> 0x0077, TryCatch #0 {all -> 0x0077, blocks: (B:3:0x0001, B:9:0x0034, B:10:0x005d, B:12:0x0068, B:13:0x0079, B:15:0x0081, B:19:0x0086, B:21:0x008a, B:24:0x003c, B:25:0x0045, B:26:0x0049, B:27:0x0053), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0081 A[Catch: all -> 0x0077, TRY_LEAVE, TryCatch #0 {all -> 0x0077, blocks: (B:3:0x0001, B:9:0x0034, B:10:0x005d, B:12:0x0068, B:13:0x0079, B:15:0x0081, B:19:0x0086, B:21:0x008a, B:24:0x003c, B:25:0x0045, B:26:0x0049, B:27:0x0053), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0086 A[Catch: all -> 0x0077, TRY_ENTER, TryCatch #0 {all -> 0x0077, blocks: (B:3:0x0001, B:9:0x0034, B:10:0x005d, B:12:0x0068, B:13:0x0079, B:15:0x0081, B:19:0x0086, B:21:0x008a, B:24:0x003c, B:25:0x0045, B:26:0x0049, B:27:0x0053), top: B:2:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized boolean b() {
        /*
            r13 = this;
            monitor-enter(r13)
            ll.e r0 = r13.f15824a     // Catch: java.lang.Throwable -> L77
            r0.getClass()     // Catch: java.lang.Throwable -> L77
            fr.i r0 = new fr.i     // Catch: java.lang.Throwable -> L77
            r0.<init>()     // Catch: java.lang.Throwable -> L77
            fr.i r1 = r13.f15826c     // Catch: java.lang.Throwable -> L77
            r1.getClass()     // Catch: java.lang.Throwable -> L77
            long r2 = r0.f16225b     // Catch: java.lang.Throwable -> L77
            long r4 = r1.f16225b     // Catch: java.lang.Throwable -> L77
            long r2 = r2 - r4
            double r1 = (double) r2     // Catch: java.lang.Throwable -> L77
            fr.g r3 = r13.f15827d     // Catch: java.lang.Throwable -> L77
            r3.getClass()     // Catch: java.lang.Throwable -> L77
            int[] r4 = fr.f.f16219a     // Catch: java.lang.Throwable -> L77
            java.util.concurrent.TimeUnit r5 = r3.f16222c     // Catch: java.lang.Throwable -> L77
            int r6 = r5.ordinal()     // Catch: java.lang.Throwable -> L77
            r4 = r4[r6]     // Catch: java.lang.Throwable -> L77
            long r6 = r3.f16221b     // Catch: java.lang.Throwable -> L77
            long r8 = r3.f16220a     // Catch: java.lang.Throwable -> L77
            r3 = 1
            r10 = 1
            if (r4 == r3) goto L53
            r12 = 2
            if (r4 == r12) goto L49
            r12 = 3
            if (r4 == r12) goto L3c
            double r8 = (double) r8     // Catch: java.lang.Throwable -> L77
            long r4 = r5.toSeconds(r6)     // Catch: java.lang.Throwable -> L77
            double r4 = (double) r4     // Catch: java.lang.Throwable -> L77
            double r8 = r8 / r4
            goto L5d
        L3c:
            double r4 = (double) r8     // Catch: java.lang.Throwable -> L77
            double r6 = (double) r6     // Catch: java.lang.Throwable -> L77
            double r4 = r4 / r6
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L77
            long r6 = r6.toMillis(r10)     // Catch: java.lang.Throwable -> L77
        L45:
            double r6 = (double) r6     // Catch: java.lang.Throwable -> L77
            double r8 = r4 * r6
            goto L5d
        L49:
            double r4 = (double) r8     // Catch: java.lang.Throwable -> L77
            double r6 = (double) r6     // Catch: java.lang.Throwable -> L77
            double r4 = r4 / r6
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L77
            long r6 = r6.toMicros(r10)     // Catch: java.lang.Throwable -> L77
            goto L45
        L53:
            double r4 = (double) r8     // Catch: java.lang.Throwable -> L77
            double r6 = (double) r6     // Catch: java.lang.Throwable -> L77
            double r4 = r4 / r6
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L77
            long r6 = r6.toNanos(r10)     // Catch: java.lang.Throwable -> L77
            goto L45
        L5d:
            double r1 = r1 * r8
            long r4 = er.c.f15823l     // Catch: java.lang.Throwable -> L77
            double r4 = (double) r4     // Catch: java.lang.Throwable -> L77
            double r1 = r1 / r4
            r4 = 0
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 <= 0) goto L79
            double r4 = r13.f15829f     // Catch: java.lang.Throwable -> L77
            double r4 = r4 + r1
            long r1 = r13.f15828e     // Catch: java.lang.Throwable -> L77
            double r1 = (double) r1     // Catch: java.lang.Throwable -> L77
            double r1 = java.lang.Math.min(r4, r1)     // Catch: java.lang.Throwable -> L77
            r13.f15829f = r1     // Catch: java.lang.Throwable -> L77
            r13.f15826c = r0     // Catch: java.lang.Throwable -> L77
            goto L79
        L77:
            r0 = move-exception
            goto L94
        L79:
            double r0 = r13.f15829f     // Catch: java.lang.Throwable -> L77
            r4 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 < 0) goto L86
            double r0 = r0 - r4
            r13.f15829f = r0     // Catch: java.lang.Throwable -> L77
            monitor-exit(r13)
            return r3
        L86:
            boolean r0 = r13.f15825b     // Catch: java.lang.Throwable -> L77
            if (r0 == 0) goto L91
            yq.a r0 = er.c.f15822k     // Catch: java.lang.Throwable -> L77
            java.lang.String r1 = "Exceeded log rate limit, dropping the log."
            r0.f(r1)     // Catch: java.lang.Throwable -> L77
        L91:
            monitor-exit(r13)
            r0 = 0
            return r0
        L94:
            monitor-exit(r13)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: er.c.b():boolean");
    }
}
