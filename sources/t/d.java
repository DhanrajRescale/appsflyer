package t;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d implements Iterator, Map.Entry {

    /* renamed from: a, reason: collision with root package name */
    public int f34845a;

    /* renamed from: b, reason: collision with root package name */
    public int f34846b = -1;

    /* renamed from: c, reason: collision with root package name */
    public boolean f34847c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ f f34848d;

    public d(f fVar) {
        this.f34848d = fVar;
        this.f34845a = fVar.f34873c - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (this.f34847c) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i10 = this.f34846b;
            f fVar = this.f34848d;
            if (!Intrinsics.a(key, fVar.f(i10)) || !Intrinsics.a(entry.getValue(), fVar.j(this.f34846b))) {
                return false;
            }
            return true;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f34847c) {
            return this.f34848d.f(this.f34846b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f34847c) {
            return this.f34848d.j(this.f34846b);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f34846b < this.f34845a;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        if (this.f34847c) {
            int i10 = this.f34846b;
            f fVar = this.f34848d;
            Object f10 = fVar.f(i10);
            Object j10 = fVar.j(this.f34846b);
            int i11 = 0;
            if (f10 == null) {
                hashCode = 0;
            } else {
                hashCode = f10.hashCode();
            }
            if (j10 != null) {
                i11 = j10.hashCode();
            }
            return hashCode ^ i11;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f34846b++;
            this.f34847c = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.f34847c) {
            this.f34848d.h(this.f34846b);
            this.f34846b--;
            this.f34845a--;
            this.f34847c = false;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f34847c) {
            return this.f34848d.i(this.f34846b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
