package cq;

import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes2.dex */
public final class i implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13059a = 1;

    /* renamed from: b, reason: collision with root package name */
    public Runnable f13060b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f13061c;

    public i(j jVar, Runnable runnable) {
        this.f13061c = jVar;
        this.f13060b = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004a, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        r10.f13060b.run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        cq.j.f13062f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r10.f13060b, (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0056, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0074, code lost:
    
        r10.f13060b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0076, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0044, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r10 = this;
            r0 = 0
            r1 = r0
        L2:
            cq.j r2 = r10.f13061c     // Catch: java.lang.Throwable -> L54
            java.util.ArrayDeque r2 = r2.f13064b     // Catch: java.lang.Throwable -> L54
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L54
            r3 = 1
            if (r0 != 0) goto L28
            cq.j r0 = r10.f13061c     // Catch: java.lang.Throwable -> L1c
            int r4 = r0.f13065c     // Catch: java.lang.Throwable -> L1c
            r5 = 4
            if (r4 != r5) goto L1e
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1b
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L1b:
            return
        L1c:
            r0 = move-exception
            goto L77
        L1e:
            long r6 = r0.f13066d     // Catch: java.lang.Throwable -> L1c
            r8 = 1
            long r6 = r6 + r8
            r0.f13066d = r6     // Catch: java.lang.Throwable -> L1c
            r0.f13065c = r5     // Catch: java.lang.Throwable -> L1c
            r0 = r3
        L28:
            cq.j r4 = r10.f13061c     // Catch: java.lang.Throwable -> L1c
            java.util.ArrayDeque r4 = r4.f13064b     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r4 = r4.poll()     // Catch: java.lang.Throwable -> L1c
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L1c
            r10.f13060b = r4     // Catch: java.lang.Throwable -> L1c
            if (r4 != 0) goto L45
            cq.j r0 = r10.f13061c     // Catch: java.lang.Throwable -> L1c
            r0.f13065c = r3     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L44
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
        L44:
            return
        L45:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L54
            r1 = r1 | r2
            r2 = 0
            java.lang.Runnable r3 = r10.f13060b     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L58
            r3.run()     // Catch: java.lang.Throwable -> L56 java.lang.RuntimeException -> L58
        L51:
            r10.f13060b = r2     // Catch: java.lang.Throwable -> L54
            goto L2
        L54:
            r0 = move-exception
            goto L79
        L56:
            r0 = move-exception
            goto L74
        L58:
            r3 = move-exception
            java.util.logging.Logger r4 = cq.j.f13062f     // Catch: java.lang.Throwable -> L56
            java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L56
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L56
            r6.<init>()     // Catch: java.lang.Throwable -> L56
            java.lang.String r7 = "Exception while executing runnable "
            r6.append(r7)     // Catch: java.lang.Throwable -> L56
            java.lang.Runnable r7 = r10.f13060b     // Catch: java.lang.Throwable -> L56
            r6.append(r7)     // Catch: java.lang.Throwable -> L56
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L56
            r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L56
            goto L51
        L74:
            r10.f13060b = r2     // Catch: java.lang.Throwable -> L54
            throw r0     // Catch: java.lang.Throwable -> L54
        L77:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L1c
            throw r0     // Catch: java.lang.Throwable -> L54
        L79:
            if (r1 == 0) goto L82
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            r1.interrupt()
        L82:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cq.i.a():void");
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13059a) {
            case 0:
                this.f13060b.run();
                return;
            default:
                try {
                    a();
                    return;
                } catch (Error e10) {
                    synchronized (this.f13061c.f13064b) {
                        this.f13061c.f13065c = 1;
                        throw e10;
                    }
                }
        }
    }

    public final String toString() {
        switch (this.f13059a) {
            case 0:
                return this.f13060b.toString();
            default:
                Runnable runnable = this.f13060b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + UrlTreeKt.componentParamSuffix;
                }
                return "SequentialExecutorWorker{state=" + com.google.android.gms.internal.p002firebaseauthapi.a.C(this.f13061c.f13065c) + UrlTreeKt.componentParamSuffix;
        }
    }

    public i(j jVar) {
        this.f13061c = jVar;
    }

    public /* synthetic */ i(j jVar, int i10) {
        this(jVar);
    }
}
