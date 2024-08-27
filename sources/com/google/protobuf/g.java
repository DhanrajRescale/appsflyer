package com.google.protobuf;

import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

/* loaded from: classes2.dex */
public final class g extends i {
    private static final long serialVersionUID = 1;

    /* renamed from: d, reason: collision with root package name */
    public final int f11911d;

    /* renamed from: e, reason: collision with root package name */
    public final int f11912e;

    public g(byte[] bArr, int i10, int i11) {
        super(bArr);
        h.e(i10, i10 + i11, bArr.length);
        this.f11911d = i10;
        this.f11912e = i11;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("BoundedByteStream instances are not to be serialized directly");
    }

    @Override // com.google.protobuf.i, com.google.protobuf.h
    public final byte b(int i10) {
        int i11 = this.f11912e;
        if (((i11 - (i10 + 1)) | i10) < 0) {
            if (i10 < 0) {
                throw new ArrayIndexOutOfBoundsException(jr.h.n("Index < 0: ", i10));
            }
            throw new ArrayIndexOutOfBoundsException(da.e.m("Index > length: ", i10, ", ", i11));
        }
        return this.f11920c[this.f11911d + i10];
    }

    @Override // com.google.protobuf.i, com.google.protobuf.h
    public final byte h(int i10) {
        return this.f11920c[this.f11911d + i10];
    }

    @Override // com.google.protobuf.i
    public final int k() {
        return this.f11911d;
    }

    public final void m(byte[] bArr, int i10) {
        System.arraycopy(this.f11920c, this.f11911d, bArr, 0, i10);
    }

    @Override // com.google.protobuf.i, com.google.protobuf.h
    public final int size() {
        return this.f11912e;
    }

    public Object writeReplace() {
        byte[] bArr;
        int i10 = this.f11912e;
        if (i10 == 0) {
            bArr = z.f12004b;
        } else {
            byte[] bArr2 = new byte[i10];
            m(bArr2, i10);
            bArr = bArr2;
        }
        return new i(bArr);
    }
}
