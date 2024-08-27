package nk;

/* loaded from: classes.dex */
public final class h implements c, b {

    /* renamed from: a, reason: collision with root package name */
    public final c f28819a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f28820b;

    /* renamed from: c, reason: collision with root package name */
    public volatile b f28821c;

    /* renamed from: d, reason: collision with root package name */
    public volatile b f28822d;

    /* renamed from: e, reason: collision with root package name */
    public int f28823e = 3;

    /* renamed from: f, reason: collision with root package name */
    public int f28824f = 3;

    /* renamed from: g, reason: collision with root package name */
    public boolean f28825g;

    public h(Object obj, h hVar) {
        this.f28820b = obj;
        this.f28819a = hVar;
    }

    @Override // nk.c, nk.b
    public final boolean a() {
        boolean z10;
        synchronized (this.f28820b) {
            try {
                if (!this.f28822d.a() && !this.f28821c.a()) {
                    z10 = false;
                }
                z10 = true;
            } finally {
            }
        }
        return z10;
    }

    @Override // nk.b
    public final boolean b(b bVar) {
        if (!(bVar instanceof h)) {
            return false;
        }
        h hVar = (h) bVar;
        if (this.f28821c == null) {
            if (hVar.f28821c != null) {
                return false;
            }
        } else if (!this.f28821c.b(hVar.f28821c)) {
            return false;
        }
        if (this.f28822d == null) {
            if (hVar.f28822d != null) {
                return false;
            }
        } else if (!this.f28822d.b(hVar.f28822d)) {
            return false;
        }
        return true;
    }

    @Override // nk.c
    public final c c() {
        c cVar;
        synchronized (this.f28820b) {
            try {
                c cVar2 = this.f28819a;
                if (cVar2 != null) {
                    cVar = cVar2.c();
                } else {
                    cVar = this;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return cVar;
    }

    @Override // nk.b
    public final void clear() {
        synchronized (this.f28820b) {
            this.f28825g = false;
            this.f28823e = 3;
            this.f28824f = 3;
            this.f28822d.clear();
            this.f28821c.clear();
        }
    }

    @Override // nk.b
    public final void d() {
        synchronized (this.f28820b) {
            try {
                if (!jr.h.a(this.f28824f)) {
                    this.f28824f = 2;
                    this.f28822d.d();
                }
                if (!jr.h.a(this.f28823e)) {
                    this.f28823e = 2;
                    this.f28821c.d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // nk.c
    public final boolean e(b bVar) {
        boolean z10;
        synchronized (this.f28820b) {
            try {
                c cVar = this.f28819a;
                if ((cVar == null || cVar.e(this)) && bVar.equals(this.f28821c) && !a()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } finally {
            }
        }
        return z10;
    }

    @Override // nk.b
    public final boolean f() {
        boolean z10;
        synchronized (this.f28820b) {
            if (this.f28823e == 3) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    @Override // nk.b
    public final void g() {
        synchronized (this.f28820b) {
            try {
                this.f28825g = true;
                try {
                    if (this.f28823e != 4 && this.f28824f != 1) {
                        this.f28824f = 1;
                        this.f28822d.g();
                    }
                    if (this.f28825g && this.f28823e != 1) {
                        this.f28823e = 1;
                        this.f28821c.g();
                    }
                    this.f28825g = false;
                } catch (Throwable th2) {
                    this.f28825g = false;
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // nk.b
    public final boolean h() {
        boolean z10;
        synchronized (this.f28820b) {
            if (this.f28823e == 4) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        return z10;
    }

    public final boolean i(b bVar) {
        boolean z10;
        synchronized (this.f28820b) {
            try {
                c cVar = this.f28819a;
                if ((cVar == null || ((h) cVar).i(this)) && bVar.equals(this.f28821c) && this.f28823e != 2) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            } finally {
            }
        }
        return z10;
    }

    @Override // nk.b
    public final boolean isRunning() {
        boolean z10;
        synchronized (this.f28820b) {
            z10 = true;
            if (this.f28823e != 1) {
                z10 = false;
            }
        }
        return z10;
    }

    public final boolean j(b bVar) {
        boolean z10;
        synchronized (this.f28820b) {
            try {
                c cVar = this.f28819a;
                if ((cVar != null && !((h) cVar).j(this)) || (!bVar.equals(this.f28821c) && this.f28823e == 4)) {
                    z10 = false;
                }
                z10 = true;
            } finally {
            }
        }
        return z10;
    }

    public final void k(b bVar) {
        synchronized (this.f28820b) {
            try {
                if (!bVar.equals(this.f28821c)) {
                    this.f28824f = 5;
                    return;
                }
                this.f28823e = 5;
                c cVar = this.f28819a;
                if (cVar != null) {
                    ((h) cVar).k(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l(b bVar) {
        synchronized (this.f28820b) {
            try {
                if (bVar.equals(this.f28822d)) {
                    this.f28824f = 4;
                    return;
                }
                this.f28823e = 4;
                c cVar = this.f28819a;
                if (cVar != null) {
                    ((h) cVar).l(this);
                }
                if (!jr.h.a(this.f28824f)) {
                    this.f28822d.clear();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
