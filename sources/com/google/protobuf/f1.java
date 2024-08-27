package com.google.protobuf;

import java.util.Map;

/* loaded from: classes2.dex */
public final class f1 implements Map.Entry, Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final Comparable f11908a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11909b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b1 f11910c;

    public f1(b1 b1Var, Comparable comparable, Object obj) {
        this.f11910c = b1Var;
        this.f11908a = comparable;
        this.f11909b = obj;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f11908a.compareTo(((f1) obj).f11908a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Object key = entry.getKey();
        Comparable comparable = this.f11908a;
        if (comparable != null ? comparable.equals(key) : key == null) {
            Object obj2 = this.f11909b;
            Object value = entry.getValue();
            if (obj2 == null) {
                if (value == null) {
                    return true;
                }
            } else if (obj2.equals(value)) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f11908a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f11909b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        int hashCode;
        int i10 = 0;
        Comparable comparable = this.f11908a;
        if (comparable == null) {
            hashCode = 0;
        } else {
            hashCode = comparable.hashCode();
        }
        Object obj = this.f11909b;
        if (obj != null) {
            i10 = obj.hashCode();
        }
        return i10 ^ hashCode;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i10 = b1.f11890g;
        this.f11910c.b();
        Object obj2 = this.f11909b;
        this.f11909b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f11908a + "=" + this.f11909b;
    }
}
