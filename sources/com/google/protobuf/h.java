package com.google.protobuf;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public abstract class h implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final i f11917b = new i(z.f12004b);

    /* renamed from: a, reason: collision with root package name */
    public int f11918a;

    static {
        Class cls = d.f11898a;
    }

    public static int e(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) < 0) {
            if (i10 >= 0) {
                if (i11 < i10) {
                    throw new IndexOutOfBoundsException(da.e.m("Beginning index larger than ending index: ", i10, ", ", i11));
                }
                throw new IndexOutOfBoundsException(da.e.m("End index: ", i11, " >= ", i12));
            }
            throw new IndexOutOfBoundsException(jr.h.o("Beginning index: ", i10, " < 0"));
        }
        return i13;
    }

    public abstract byte b(int i10);

    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final int hashCode() {
        int i10 = this.f11918a;
        if (i10 == 0) {
            int size = size();
            i iVar = (i) this;
            int k10 = iVar.k();
            int i11 = size;
            for (int i12 = k10; i12 < k10 + size; i12++) {
                i11 = (i11 * 31) + iVar.f11920c[i12];
            }
            if (i11 == 0) {
                i10 = 1;
            } else {
                i10 = i11;
            }
            this.f11918a = i10;
        }
        return i10;
    }

    public abstract byte h(int i10);

    /* renamed from: i, reason: merged with bridge method [inline-methods] */
    public final String toString() {
        i gVar;
        String sb2;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(size());
        if (size() <= 50) {
            sb2 = e1.a(this);
        } else {
            StringBuilder sb3 = new StringBuilder();
            i iVar = (i) this;
            int e10 = e(0, 47, iVar.size());
            if (e10 == 0) {
                gVar = f11917b;
            } else {
                gVar = new g(iVar.f11920c, iVar.k(), e10);
            }
            sb3.append(e1.a(gVar));
            sb3.append("...");
            sb2 = sb3.toString();
        }
        objArr[2] = sb2;
        return String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new e(this);
    }

    public abstract int size();
}
