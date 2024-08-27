package iu;

import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public class a implements g, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20529a;

    /* renamed from: b, reason: collision with root package name */
    public final Class f20530b;

    /* renamed from: c, reason: collision with root package name */
    public final String f20531c;

    /* renamed from: d, reason: collision with root package name */
    public final String f20532d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f20533e = false;

    /* renamed from: f, reason: collision with root package name */
    public final int f20534f = 2;

    /* renamed from: g, reason: collision with root package name */
    public final int f20535g = 2;

    public a(Object obj, Class cls, String str, String str2) {
        this.f20529a = obj;
        this.f20530b = cls;
        this.f20531c = str;
        this.f20532d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f20533e == aVar.f20533e && this.f20534f == aVar.f20534f && this.f20535g == aVar.f20535g && Intrinsics.a(this.f20529a, aVar.f20529a) && Intrinsics.a(this.f20530b, aVar.f20530b) && this.f20531c.equals(aVar.f20531c) && this.f20532d.equals(aVar.f20532d)) {
            return true;
        }
        return false;
    }

    @Override // iu.g
    public final int getArity() {
        return this.f20534f;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12 = 0;
        Object obj = this.f20529a;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        int i13 = i10 * 31;
        Class cls = this.f20530b;
        if (cls != null) {
            i12 = cls.hashCode();
        }
        int g10 = jr.h.g(this.f20532d, jr.h.g(this.f20531c, (i13 + i12) * 31, 31), 31);
        if (this.f20533e) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        return ((((g10 + i11) * 31) + this.f20534f) * 31) + this.f20535g;
    }

    public final String toString() {
        a0.f20536a.getClass();
        return b0.a(this);
    }
}
