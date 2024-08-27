package l7;

import java.lang.ref.WeakReference;
import java.util.Set;

/* loaded from: classes.dex */
public final class j extends h {

    /* renamed from: b, reason: collision with root package name */
    public final k f24125b;

    /* renamed from: c, reason: collision with root package name */
    public final WeakReference f24126c;

    public j(k kVar, n nVar) {
        super(nVar.f24120a);
        this.f24125b = kVar;
        this.f24126c = new WeakReference(nVar);
    }

    @Override // l7.h
    public final void b(Set set) {
        h hVar = (h) this.f24126c.get();
        if (hVar == null) {
            this.f24125b.c(this);
        } else {
            hVar.b(set);
        }
    }
}
