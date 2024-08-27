package ba;

import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class xh extends wh {

    /* renamed from: v, reason: collision with root package name */
    public static final h.c f6656v;

    /* renamed from: u, reason: collision with root package name */
    public long f6657u;

    static {
        h.c cVar = new h.c(2);
        f6656v = cVar;
        cVar.W(0, new int[]{1}, new int[]{R.layout.layout_group_chat_messages}, new String[]{"layout_group_chat_messages"});
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f6657u = 0L;
        }
        this.f6533t.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f6657u != 0) {
                    return true;
                }
                if (this.f6533t.f()) {
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
            this.f6657u = 2L;
        }
        this.f6533t.h();
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        if (i10 != 0) {
            return false;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.f6657u |= 1;
        }
        return true;
    }
}
