package d1;

import t0.g2;
import t0.h1;
import t0.h2;
import t0.o3;

/* loaded from: classes.dex */
public final class d implements h2 {

    /* renamed from: a, reason: collision with root package name */
    public r f13254a;

    /* renamed from: b, reason: collision with root package name */
    public n f13255b;

    /* renamed from: c, reason: collision with root package name */
    public String f13256c;

    /* renamed from: d, reason: collision with root package name */
    public Object f13257d;

    /* renamed from: e, reason: collision with root package name */
    public Object[] f13258e;

    /* renamed from: f, reason: collision with root package name */
    public m f13259f;

    /* renamed from: g, reason: collision with root package name */
    public final c f13260g = new c(this);

    public d(r rVar, n nVar, String str, Object obj, Object[] objArr) {
        this.f13254a = rVar;
        this.f13255b = nVar;
        this.f13256c = str;
        this.f13257d = obj;
        this.f13258e = objArr;
    }

    @Override // t0.h2
    public final void a() {
        m mVar = this.f13259f;
        if (mVar != null) {
            ((o) mVar).a();
        }
    }

    @Override // t0.h2
    public final void b() {
        m mVar = this.f13259f;
        if (mVar != null) {
            ((o) mVar).a();
        }
    }

    public final void c() {
        String str;
        n nVar = this.f13255b;
        if (this.f13259f == null) {
            if (nVar != null) {
                c cVar = this.f13260g;
                Object mo2invoke = cVar.mo2invoke();
                if (mo2invoke != null && !nVar.a(mo2invoke)) {
                    if (mo2invoke instanceof e1.q) {
                        e1.q qVar = (e1.q) mo2invoke;
                        if (qVar.c() != h1.f35033a && qVar.c() != o3.f35116a && qVar.c() != g2.f35024a) {
                            str = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                        } else {
                            str = "MutableState containing " + qVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                        }
                    } else {
                        str = mo2invoke + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
                    }
                    throw new IllegalArgumentException(str);
                }
                this.f13259f = nVar.d(this.f13256c, cVar);
                return;
            }
            return;
        }
        throw new IllegalArgumentException(("entry(" + this.f13259f + ") is not null").toString());
    }

    @Override // t0.h2
    public final void d() {
        c();
    }
}
