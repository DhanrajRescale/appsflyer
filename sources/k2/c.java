package k2;

import java.text.CharacterIterator;

/* loaded from: classes.dex */
public final class c implements CharacterIterator {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f21913a;

    /* renamed from: c, reason: collision with root package name */
    public final int f21915c;

    /* renamed from: b, reason: collision with root package name */
    public final int f21914b = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f21916d = 0;

    public c(CharSequence charSequence, int i10) {
        this.f21913a = charSequence;
        this.f21915c = i10;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i10 = this.f21916d;
        if (i10 == this.f21915c) {
            return (char) 65535;
        }
        return this.f21913a.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f21916d = this.f21914b;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return this.f21914b;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f21915c;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f21916d;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i10 = this.f21914b;
        int i11 = this.f21915c;
        if (i10 == i11) {
            this.f21916d = i11;
            return (char) 65535;
        }
        int i12 = i11 - 1;
        this.f21916d = i12;
        return this.f21913a.charAt(i12);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i10 = this.f21916d + 1;
        this.f21916d = i10;
        int i11 = this.f21915c;
        if (i10 >= i11) {
            this.f21916d = i11;
            return (char) 65535;
        }
        return this.f21913a.charAt(i10);
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i10 = this.f21916d;
        if (i10 <= this.f21914b) {
            return (char) 65535;
        }
        int i11 = i10 - 1;
        this.f21916d = i11;
        return this.f21913a.charAt(i11);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i10) {
        if (i10 <= this.f21915c && this.f21914b <= i10) {
            this.f21916d = i10;
            return current();
        }
        throw new IllegalArgumentException("invalid position");
    }
}
