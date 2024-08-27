package vt;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class h extends o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ g f38318b;

    public h(g gVar) {
        this.f38318b = gVar;
    }

    @Override // vt.b
    public final int b() {
        return this.f38318b.size();
    }

    @Override // vt.b, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f38318b.containsKey(obj);
    }

    @Override // vt.o, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new r1.f0(this.f38318b.entrySet().iterator(), 1);
    }
}
