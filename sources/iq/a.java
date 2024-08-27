package iq;

import java.lang.annotation.Annotation;

/* loaded from: classes2.dex */
public final class a implements e {
    private final d intEncoding;
    private final int tag;

    public a(int i10, d dVar) {
        this.tag = i10;
        this.intEncoding = dVar;
    }

    @Override // java.lang.annotation.Annotation
    public Class<? extends Annotation> annotationType() {
        return e.class;
    }

    @Override // java.lang.annotation.Annotation
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        a aVar = (a) ((e) obj);
        if (this.tag == aVar.tag() && this.intEncoding.equals(aVar.intEncoding())) {
            return true;
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public int hashCode() {
        return (14552422 ^ this.tag) + (this.intEncoding.hashCode() ^ 2041407134);
    }

    @Override // iq.e
    public d intEncoding() {
        return this.intEncoding;
    }

    @Override // iq.e
    public int tag() {
        return this.tag;
    }

    @Override // java.lang.annotation.Annotation
    public String toString() {
        return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.tag + "intEncoding=" + this.intEncoding + ')';
    }
}
