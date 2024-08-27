package o2;

import android.graphics.Typeface;
import ut.l;

/* loaded from: classes.dex */
public final class c extends t3.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f29455e = 1;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f29456f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f29457g;

    public c(qu.i iVar, l0 l0Var) {
        this.f29456f = iVar;
        this.f29457g = l0Var;
    }

    @Override // t3.b
    public final void e(int i10) {
        int i11 = this.f29455e;
        Object obj = this.f29456f;
        Object obj2 = this.f29457g;
        switch (i11) {
            case 0:
                ((qu.h) obj).r(new IllegalStateException("Unable to load font " + ((l0) obj2) + " (reason=" + i10 + ')'));
                return;
            default:
                ((qo.d) obj2).f32114m = true;
                ((bl.j) obj).N(i10);
                return;
        }
    }

    @Override // t3.b
    public final void f(Typeface typeface) {
        int i10 = this.f29455e;
        Object obj = this.f29456f;
        switch (i10) {
            case 0:
                l.Companion companion = ut.l.INSTANCE;
                ((qu.h) obj).resumeWith(typeface);
                return;
            default:
                qo.d dVar = (qo.d) this.f29457g;
                Typeface create = Typeface.create(typeface, dVar.f32104c);
                dVar.f32115n = create;
                dVar.f32114m = true;
                ((bl.j) obj).O(create, false);
                return;
        }
    }

    public c(qo.d dVar, bl.j jVar) {
        this.f29457g = dVar;
        this.f29456f = jVar;
    }
}
