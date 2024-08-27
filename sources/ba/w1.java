package ba;

import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class w1 extends v1 {

    /* renamed from: x, reason: collision with root package name */
    public static final h.c f6499x;

    /* renamed from: w, reason: collision with root package name */
    public long f6500w;

    static {
        h.c cVar = new h.c(4);
        f6499x = cVar;
        cVar.W(0, new int[]{2}, new int[]{R.layout.content_main_activity}, new String[]{"content_main_activity"});
        cVar.W(1, new int[]{3}, new int[]{R.layout.layout_navigation_drawer}, new String[]{"layout_navigation_drawer"});
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6500w = 0L;
        }
        this.f6365s.c();
        this.f6366t.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6500w != 0) {
                    return true;
                }
                if (this.f6365s.f() || this.f6366t.f()) {
                    return true;
                }
                return false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // m4.m
    public final void h() {
        synchronized (this) {
            this.f6500w = 4L;
        }
        this.f6365s.h();
        this.f6366t.h();
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.f6500w |= 2;
            }
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.f6500w |= 1;
        }
        return true;
    }
}
