package vt;

import java.util.Iterator;

/* loaded from: classes2.dex */
public final class j extends b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g f38322a;

    public j(g gVar) {
        this.f38322a = gVar;
    }

    @Override // vt.b
    public final int b() {
        return this.f38322a.size();
    }

    @Override // vt.b, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return this.f38322a.containsValue(obj);
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new r1.f0(this.f38322a.entrySet().iterator(), 2);
    }
}
