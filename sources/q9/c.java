package q9;

import java.util.List;
import m9.i;
import m9.q;

/* loaded from: classes.dex */
public final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public final a f31868a;

    /* renamed from: b, reason: collision with root package name */
    public final a f31869b;

    public c(a aVar, a aVar2) {
        this.f31868a = aVar;
        this.f31869b = aVar2;
    }

    @Override // q9.e
    public final m9.e a() {
        return new q((i) this.f31868a.a(), (i) this.f31869b.a());
    }

    @Override // q9.e
    public final List b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // q9.e
    public final boolean c() {
        if (this.f31868a.c() && this.f31869b.c()) {
            return true;
        }
        return false;
    }
}
