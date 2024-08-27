package p4;

import android.view.Choreographer;

/* loaded from: classes.dex */
public final class b extends b4.l {

    /* renamed from: c, reason: collision with root package name */
    public final Choreographer f30626c;

    /* renamed from: d, reason: collision with root package name */
    public final m4.i f30627d;

    public b(t9.c cVar) {
        super(cVar, 1);
        this.f30626c = Choreographer.getInstance();
        this.f30627d = new m4.i(this, 1);
    }

    public final void h() {
        this.f30626c.postFrameCallback(this.f30627d);
    }
}
