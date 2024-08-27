package b3;

import android.os.Handler;
import java.util.ArrayList;
import t0.h2;

/* loaded from: classes.dex */
public final class n implements h2 {

    /* renamed from: a, reason: collision with root package name */
    public final l f3134a;

    /* renamed from: b, reason: collision with root package name */
    public Handler f3135b;

    /* renamed from: c, reason: collision with root package name */
    public final e1.v f3136c = new e1.v(new m(this, 0));

    /* renamed from: d, reason: collision with root package name */
    public boolean f3137d = true;

    /* renamed from: e, reason: collision with root package name */
    public final m f3138e = new m(this, 1);

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f3139f = new ArrayList();

    public n(l lVar) {
        this.f3134a = lVar;
    }

    @Override // t0.h2
    public final void a() {
    }

    @Override // t0.h2
    public final void b() {
        e1.v vVar = this.f3136c;
        e1.h hVar = vVar.f14938g;
        if (hVar != null) {
            hVar.a();
        }
        vVar.b();
    }

    @Override // t0.h2
    public final void d() {
        e1.v vVar = this.f3136c;
        vVar.f14938g = yq.b.k(vVar.f14935d);
    }
}
