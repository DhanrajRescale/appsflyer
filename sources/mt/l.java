package mt;

/* loaded from: classes2.dex */
public final class l extends jt.b implements at.g, Runnable {
    private static final long serialVersionUID = 6576896619930983584L;

    /* renamed from: a, reason: collision with root package name */
    public final at.g f28026a;

    /* renamed from: b, reason: collision with root package name */
    public final at.k f28027b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f28028c;

    /* renamed from: d, reason: collision with root package name */
    public final int f28029d;

    /* renamed from: e, reason: collision with root package name */
    public ht.c f28030e;

    /* renamed from: f, reason: collision with root package name */
    public ct.b f28031f;

    /* renamed from: g, reason: collision with root package name */
    public Throwable f28032g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f28033h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f28034i;

    /* renamed from: j, reason: collision with root package name */
    public int f28035j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f28036k;

    public l(at.g gVar, at.k kVar, boolean z10, int i10) {
        this.f28026a = gVar;
        this.f28027b = kVar;
        this.f28028c = z10;
        this.f28029d = i10;
    }

    @Override // ct.b
    public final void a() {
        if (!this.f28034i) {
            this.f28034i = true;
            this.f28031f.a();
            this.f28027b.a();
            if (getAndIncrement() == 0) {
                this.f28030e.clear();
            }
        }
    }

    @Override // at.g
    public final void b(Object obj) {
        if (this.f28033h) {
            return;
        }
        if (this.f28035j != 2) {
            this.f28030e.offer(obj);
        }
        if (getAndIncrement() == 0) {
            this.f28027b.b(this);
        }
    }

    @Override // at.g
    public final void c(ct.b bVar) {
        if (ft.b.f(this.f28031f, bVar)) {
            this.f28031f = bVar;
            if (bVar instanceof ht.a) {
                ht.a aVar = (ht.a) bVar;
                int d10 = aVar.d();
                if (d10 == 1) {
                    this.f28035j = d10;
                    this.f28030e = aVar;
                    this.f28033h = true;
                    this.f28026a.c(this);
                    if (getAndIncrement() == 0) {
                        this.f28027b.b(this);
                        return;
                    }
                    return;
                }
                if (d10 == 2) {
                    this.f28035j = d10;
                    this.f28030e = aVar;
                    this.f28026a.c(this);
                    return;
                }
            }
            this.f28030e = new ot.b(this.f28029d);
            this.f28026a.c(this);
        }
    }

    @Override // ht.c
    public final void clear() {
        this.f28030e.clear();
    }

    @Override // ht.b
    public final int d() {
        this.f28036k = true;
        return 2;
    }

    public final boolean e(boolean z10, boolean z11, at.g gVar) {
        if (this.f28034i) {
            this.f28030e.clear();
            return true;
        }
        if (z10) {
            Throwable th2 = this.f28032g;
            if (this.f28028c) {
                if (z11) {
                    this.f28034i = true;
                    if (th2 != null) {
                        gVar.onError(th2);
                    } else {
                        gVar.onComplete();
                    }
                    this.f28027b.a();
                    return true;
                }
                return false;
            }
            if (th2 != null) {
                this.f28034i = true;
                this.f28030e.clear();
                gVar.onError(th2);
                this.f28027b.a();
                return true;
            }
            if (z11) {
                this.f28034i = true;
                gVar.onComplete();
                this.f28027b.a();
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // ht.c
    public final Object i() {
        return this.f28030e.i();
    }

    @Override // ht.c
    public final boolean isEmpty() {
        return this.f28030e.isEmpty();
    }

    @Override // at.g
    public final void onComplete() {
        if (this.f28033h) {
            return;
        }
        this.f28033h = true;
        if (getAndIncrement() == 0) {
            this.f28027b.b(this);
        }
    }

    @Override // at.g
    public final void onError(Throwable th2) {
        if (this.f28033h) {
            yk.g.M(th2);
            return;
        }
        this.f28032g = th2;
        this.f28033h = true;
        if (getAndIncrement() == 0) {
            this.f28027b.b(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x0075, code lost:
    
        r3 = addAndGet(-r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x007a, code lost:
    
        if (r3 != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void run() {
        /*
            r7 = this;
            boolean r0 = r7.f28036k
            r1 = 1
            if (r0 == 0) goto L4f
            r0 = r1
        L6:
            boolean r2 = r7.f28034i
            if (r2 == 0) goto Lc
            goto L97
        Lc:
            boolean r2 = r7.f28033h
            java.lang.Throwable r3 = r7.f28032g
            boolean r4 = r7.f28028c
            if (r4 != 0) goto L28
            if (r2 == 0) goto L28
            if (r3 == 0) goto L28
            r7.f28034i = r1
            at.g r0 = r7.f28026a
            java.lang.Throwable r1 = r7.f28032g
            r0.onError(r1)
            at.k r0 = r7.f28027b
            r0.a()
            goto L97
        L28:
            at.g r3 = r7.f28026a
            r4 = 0
            r3.b(r4)
            if (r2 == 0) goto L47
            r7.f28034i = r1
            java.lang.Throwable r0 = r7.f28032g
            if (r0 == 0) goto L3c
            at.g r1 = r7.f28026a
            r1.onError(r0)
            goto L41
        L3c:
            at.g r0 = r7.f28026a
            r0.onComplete()
        L41:
            at.k r0 = r7.f28027b
            r0.a()
            goto L97
        L47:
            int r0 = -r0
            int r0 = r7.addAndGet(r0)
            if (r0 != 0) goto L6
            goto L97
        L4f:
            ht.c r0 = r7.f28030e
            at.g r2 = r7.f28026a
            r3 = r1
        L54:
            boolean r4 = r7.f28033h
            boolean r5 = r0.isEmpty()
            boolean r4 = r7.e(r4, r5, r2)
            if (r4 == 0) goto L61
            goto L97
        L61:
            boolean r4 = r7.f28033h
            java.lang.Object r5 = r0.i()     // Catch: java.lang.Throwable -> L81
            if (r5 != 0) goto L6b
            r6 = r1
            goto L6c
        L6b:
            r6 = 0
        L6c:
            boolean r4 = r7.e(r4, r6, r2)
            if (r4 == 0) goto L73
            goto L97
        L73:
            if (r6 == 0) goto L7d
            int r3 = -r3
            int r3 = r7.addAndGet(r3)
            if (r3 != 0) goto L54
            goto L97
        L7d:
            r2.b(r5)
            goto L61
        L81:
            r3 = move-exception
            zq.f.l0(r3)
            r7.f28034i = r1
            ct.b r1 = r7.f28031f
            r1.a()
            r0.clear()
            r2.onError(r3)
            at.k r0 = r7.f28027b
            r0.a()
        L97:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mt.l.run():void");
    }
}
