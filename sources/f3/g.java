package f3;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class g extends b implements Iterable {
    @Override // f3.b, f3.c
    /* renamed from: b */
    public final c clone() {
        return (g) super.b();
    }

    @Override // f3.b, f3.c
    public final Object clone() {
        return (g) super.b();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Iterator, java.lang.Object, f3.f] */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ?? obj = new Object();
        obj.f15916b = 0;
        obj.f15915a = this;
        return obj;
    }

    @Override // f3.b
    /* renamed from: m */
    public final b b() {
        return (g) super.b();
    }
}
