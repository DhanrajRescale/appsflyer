package ak;

import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes.dex */
public final class z implements e0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f609a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f610b;

    /* renamed from: c, reason: collision with root package name */
    public final e0 f611c;

    /* renamed from: d, reason: collision with root package name */
    public final y f612d;

    /* renamed from: e, reason: collision with root package name */
    public final xj.g f613e;

    /* renamed from: f, reason: collision with root package name */
    public int f614f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f615g;

    public z(e0 e0Var, boolean z10, boolean z11, xj.g gVar, y yVar) {
        if (e0Var != null) {
            this.f611c = e0Var;
            this.f609a = z10;
            this.f610b = z11;
            this.f613e = gVar;
            if (yVar != null) {
                this.f612d = yVar;
                return;
            }
            throw new NullPointerException("Argument must not be null");
        }
        throw new NullPointerException("Argument must not be null");
    }

    public final synchronized void a() {
        if (!this.f615g) {
            this.f614f++;
        } else {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
    }

    @Override // ak.e0
    public final synchronized void b() {
        if (this.f614f <= 0) {
            if (!this.f615g) {
                this.f615g = true;
                if (this.f610b) {
                    this.f611c.b();
                }
            } else {
                throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
            }
        } else {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
    }

    @Override // ak.e0
    public final int c() {
        return this.f611c.c();
    }

    @Override // ak.e0
    public final Class d() {
        return this.f611c.d();
    }

    public final void e() {
        boolean z10;
        synchronized (this) {
            int i10 = this.f614f;
            if (i10 > 0) {
                z10 = true;
                int i11 = i10 - 1;
                this.f614f = i11;
                if (i11 != 0) {
                    z10 = false;
                }
            } else {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
        }
        if (z10) {
            ((r) this.f612d).e(this.f613e, this);
        }
    }

    @Override // ak.e0
    public final Object get() {
        return this.f611c.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f609a + ", listener=" + this.f612d + ", key=" + this.f613e + ", acquired=" + this.f614f + ", isRecycled=" + this.f615g + ", resource=" + this.f611c + UrlTreeKt.componentParamSuffixChar;
    }
}
