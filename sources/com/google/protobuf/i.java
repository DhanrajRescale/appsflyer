package com.google.protobuf;

/* loaded from: classes2.dex */
public class i extends h {
    private static final long serialVersionUID = 1;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f11920c;

    public i(byte[] bArr) {
        this.f11918a = 0;
        bArr.getClass();
        this.f11920c = bArr;
    }

    @Override // com.google.protobuf.h
    public byte b(int i10) {
        return this.f11920c[i10];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof h) || size() != ((h) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            int i10 = this.f11918a;
            int i11 = iVar.f11918a;
            if (i10 != 0 && i11 != 0 && i10 != i11) {
                return false;
            }
            int size = size();
            if (size <= iVar.size()) {
                if (size <= iVar.size()) {
                    int k10 = k() + size;
                    int k11 = k();
                    int k12 = iVar.k();
                    while (k11 < k10) {
                        if (this.f11920c[k11] != iVar.f11920c[k12]) {
                            return false;
                        }
                        k11++;
                        k12++;
                    }
                    return true;
                }
                StringBuilder n10 = a3.a.n("Ran off end of other: 0, ", size, ", ");
                n10.append(iVar.size());
                throw new IllegalArgumentException(n10.toString());
            }
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        return obj.equals(this);
    }

    @Override // com.google.protobuf.h
    public byte h(int i10) {
        return this.f11920c[i10];
    }

    public int k() {
        return 0;
    }

    @Override // com.google.protobuf.h
    public int size() {
        return this.f11920c.length;
    }
}
