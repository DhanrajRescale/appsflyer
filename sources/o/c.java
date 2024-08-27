package o;

import java.util.Map;

/* loaded from: classes.dex */
public final class c implements Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public final Object f29326a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f29327b;

    /* renamed from: c, reason: collision with root package name */
    public c f29328c;

    /* renamed from: d, reason: collision with root package name */
    public c f29329d;

    public c(Object obj, Object obj2) {
        this.f29326a = obj;
        this.f29327b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        if (this.f29326a.equals(cVar.f29326a) && this.f29327b.equals(cVar.f29327b)) {
            return true;
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f29326a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f29327b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.f29326a.hashCode() ^ this.f29327b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f29326a + "=" + this.f29327b;
    }
}
