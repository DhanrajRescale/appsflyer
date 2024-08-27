package nu;

import java.util.NoSuchElementException;
import vt.l0;

/* loaded from: classes2.dex */
public final class f extends l0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f29171a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29172b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f29173c;

    /* renamed from: d, reason: collision with root package name */
    public int f29174d;

    public f(int i10, int i11, int i12) {
        this.f29171a = i12;
        this.f29172b = i11;
        boolean z10 = true;
        if (i12 <= 0 ? i10 < i11 : i10 > i11) {
            z10 = false;
        }
        this.f29173c = z10;
        this.f29174d = z10 ? i10 : i11;
    }

    @Override // vt.l0
    public final int b() {
        int i10 = this.f29174d;
        if (i10 == this.f29172b) {
            if (this.f29173c) {
                this.f29173c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f29174d = this.f29171a + i10;
        }
        return i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29173c;
    }
}
