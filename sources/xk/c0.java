package xk;

import android.os.Handler;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class c0 extends AbstractList {

    /* renamed from: e, reason: collision with root package name */
    public static final AtomicInteger f40334e = new AtomicInteger();

    /* renamed from: a, reason: collision with root package name */
    public Handler f40335a;

    /* renamed from: b, reason: collision with root package name */
    public final String f40336b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f40337c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f40338d;

    public c0(List requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.f40336b = String.valueOf(Integer.valueOf(f40334e.incrementAndGet()));
        this.f40338d = new ArrayList();
        this.f40337c = new ArrayList(requests);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        z element = (z) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        this.f40337c.add(i10, element);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f40337c.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (obj != null && !(obj instanceof z)) {
            return false;
        }
        return super.contains((z) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        return (z) this.f40337c.get(i10);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj != null && !(obj instanceof z)) {
            return -1;
        }
        return super.indexOf((z) obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj != null && !(obj instanceof z)) {
            return -1;
        }
        return super.lastIndexOf((z) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ boolean remove(Object obj) {
        if (obj == null || (obj instanceof z)) {
            return super.remove((z) obj);
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        z element = (z) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return (z) this.f40337c.set(i10, element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f40337c.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        return (z) this.f40337c.remove(i10);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        z element = (z) obj;
        Intrinsics.checkNotNullParameter(element, "element");
        return this.f40337c.add(element);
    }

    public c0(z... requests) {
        Intrinsics.checkNotNullParameter(requests, "requests");
        this.f40336b = String.valueOf(Integer.valueOf(f40334e.incrementAndGet()));
        this.f40338d = new ArrayList();
        this.f40337c = new ArrayList(vt.t.b(requests));
    }
}
