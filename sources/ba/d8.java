package ba;

import com.assetgro.stockgro.prod.R;

/* loaded from: classes.dex */
public final class d8 extends c8 {

    /* renamed from: x, reason: collision with root package name */
    public static final h.c f4458x;

    /* renamed from: w, reason: collision with root package name */
    public long f4459w;

    static {
        h.c cVar = new h.c(4);
        f4458x = cVar;
        cVar.W(0, new int[]{1, 2, 3}, new int[]{R.layout.list_item_message_image_layout, R.layout.list_item_message_document_layout, R.layout.list_item_message_text_layout}, new String[]{"list_item_message_image_layout", "list_item_message_document_layout", "list_item_message_text_layout"});
    }

    @Override // m4.m
    public final void b() {
        synchronized (this) {
            this.f4459w = 0L;
        }
        this.f4343u.c();
        this.f4342t.c();
        this.f4344v.c();
    }

    @Override // m4.m
    public final boolean f() {
        synchronized (this) {
            try {
                if (this.f4459w != 0) {
                    return true;
                }
                if (this.f4343u.f() || this.f4342t.f() || this.f4344v.f()) {
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
            this.f4459w = 8L;
        }
        this.f4343u.h();
        this.f4342t.h();
        this.f4344v.h();
        m();
    }

    @Override // m4.m
    public final boolean k(int i10, int i11, Object obj) {
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return false;
                }
                if (i11 != 0) {
                    return false;
                }
                synchronized (this) {
                    this.f4459w |= 4;
                }
                return true;
            }
            if (i11 != 0) {
                return false;
            }
            synchronized (this) {
                this.f4459w |= 2;
            }
            return true;
        }
        if (i11 != 0) {
            return false;
        }
        synchronized (this) {
            this.f4459w |= 1;
        }
        return true;
    }
}
