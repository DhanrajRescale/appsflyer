package f3;

import java.util.Iterator;

/* loaded from: classes.dex */
public final class f implements Iterator {

    /* renamed from: a, reason: collision with root package name */
    public g f15915a;

    /* renamed from: b, reason: collision with root package name */
    public int f15916b;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f15916b < this.f15915a.f15909e.size()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        d dVar = (d) this.f15915a.f15909e.get(this.f15916b);
        this.f15916b++;
        return dVar;
    }
}
