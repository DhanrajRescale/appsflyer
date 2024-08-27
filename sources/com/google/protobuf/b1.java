package com.google.protobuf;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* loaded from: classes2.dex */
public final class b1 extends AbstractMap {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f11890g = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f11891a;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11894d;

    /* renamed from: e, reason: collision with root package name */
    public volatile t.a f11895e;

    /* renamed from: b, reason: collision with root package name */
    public List f11892b = Collections.emptyList();

    /* renamed from: c, reason: collision with root package name */
    public Map f11893c = Collections.emptyMap();

    /* renamed from: f, reason: collision with root package name */
    public Map f11896f = Collections.emptyMap();

    public b1(int i10) {
        this.f11891a = i10;
    }

    public final int a(Comparable comparable) {
        int i10;
        int size = this.f11892b.size();
        int i11 = size - 1;
        if (i11 >= 0) {
            int compareTo = comparable.compareTo(((f1) this.f11892b.get(i11)).f11908a);
            if (compareTo > 0) {
                i10 = size + 1;
                return -i10;
            }
            if (compareTo == 0) {
                return i11;
            }
        }
        int i12 = 0;
        while (i12 <= i11) {
            int i13 = (i12 + i11) / 2;
            int compareTo2 = comparable.compareTo(((f1) this.f11892b.get(i13)).f11908a);
            if (compareTo2 < 0) {
                i11 = i13 - 1;
            } else if (compareTo2 > 0) {
                i12 = i13 + 1;
            } else {
                return i13;
            }
        }
        i10 = i12 + 1;
        return -i10;
    }

    public final void b() {
        if (!this.f11894d) {
        } else {
            throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void clear() {
        b();
        if (!this.f11892b.isEmpty()) {
            this.f11892b.clear();
        }
        if (!this.f11893c.isEmpty()) {
            this.f11893c.clear();
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (a(comparable) < 0 && !this.f11893c.containsKey(comparable)) {
            return false;
        }
        return true;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final Set entrySet() {
        if (this.f11895e == null) {
            this.f11895e = new t.a(this);
        }
        return this.f11895e;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return super.equals(obj);
        }
        b1 b1Var = (b1) obj;
        int size = size();
        if (size != b1Var.size()) {
            return false;
        }
        int size2 = this.f11892b.size();
        if (size2 != b1Var.f11892b.size()) {
            return entrySet().equals(b1Var.entrySet());
        }
        for (int i10 = 0; i10 < size2; i10++) {
            if (!h(i10).equals(b1Var.h(i10))) {
                return false;
            }
        }
        if (size2 == size) {
            return true;
        }
        return this.f11893c.equals(b1Var.f11893c);
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        if (a10 >= 0) {
            return ((f1) this.f11892b.get(a10)).f11909b;
        }
        return this.f11893c.get(comparable);
    }

    public final Map.Entry h(int i10) {
        return (Map.Entry) this.f11892b.get(i10);
    }

    public final Iterable i() {
        if (this.f11893c.isEmpty()) {
            return e1.f11905b;
        }
        return this.f11893c.entrySet();
    }

    public final SortedMap j() {
        b();
        if (this.f11893c.isEmpty() && !(this.f11893c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f11893c = treeMap;
            this.f11896f = treeMap.descendingMap();
        }
        return (SortedMap) this.f11893c;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        int size = this.f11892b.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            i10 += ((f1) this.f11892b.get(i11)).hashCode();
        }
        if (this.f11893c.size() > 0) {
            return i10 + this.f11893c.hashCode();
        }
        return i10;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public final Object put(Comparable comparable, Object obj) {
        b();
        int a10 = a(comparable);
        if (a10 >= 0) {
            return ((f1) this.f11892b.get(a10)).setValue(obj);
        }
        b();
        boolean isEmpty = this.f11892b.isEmpty();
        int i10 = this.f11891a;
        if (isEmpty && !(this.f11892b instanceof ArrayList)) {
            this.f11892b = new ArrayList(i10);
        }
        int i11 = -(a10 + 1);
        if (i11 >= i10) {
            return j().put(comparable, obj);
        }
        if (this.f11892b.size() == i10) {
            f1 f1Var = (f1) this.f11892b.remove(i10 - 1);
            j().put(f1Var.f11908a, f1Var.f11909b);
        }
        this.f11892b.add(i11, new f1(this, comparable, obj));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public final Object remove(Object obj) {
        b();
        Comparable comparable = (Comparable) obj;
        int a10 = a(comparable);
        if (a10 >= 0) {
            return n(a10);
        }
        if (this.f11893c.isEmpty()) {
            return null;
        }
        return this.f11893c.remove(comparable);
    }

    public final Object n(int i10) {
        b();
        Object obj = ((f1) this.f11892b.remove(i10)).f11909b;
        if (!this.f11893c.isEmpty()) {
            Iterator it = j().entrySet().iterator();
            List list = this.f11892b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new f1(this, (Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public final int size() {
        return this.f11893c.size() + this.f11892b.size();
    }
}
