package n5;

import android.os.Handler;

/* loaded from: classes.dex */
public final class f implements o {

    /* renamed from: a, reason: collision with root package name */
    public final l f28278a;

    /* renamed from: b, reason: collision with root package name */
    public i f28279b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f28280c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ g f28281d;

    public f(g gVar, l lVar) {
        this.f28281d = gVar;
        this.f28278a = lVar;
    }

    @Override // n5.o
    public final void release() {
        Handler handler = this.f28281d.f28301u;
        handler.getClass();
        e5.x.J(handler, new androidx.activity.b(this, 16));
    }
}
