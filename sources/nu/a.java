package nu;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import vt.w;

/* loaded from: classes2.dex */
public final class a extends w {

    /* renamed from: a, reason: collision with root package name */
    public final int f29163a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29164b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f29165c;

    /* renamed from: d, reason: collision with root package name */
    public int f29166d;

    public a(char c10, char c11, int i10) {
        this.f29163a = i10;
        this.f29164b = c11;
        boolean z10 = true;
        if (i10 <= 0 ? Intrinsics.f(c10, c11) < 0 : Intrinsics.f(c10, c11) > 0) {
            z10 = false;
        }
        this.f29165c = z10;
        this.f29166d = z10 ? c10 : c11;
    }

    @Override // vt.w
    public final char b() {
        int i10 = this.f29166d;
        if (i10 == this.f29164b) {
            if (this.f29165c) {
                this.f29165c = false;
            } else {
                throw new NoSuchElementException();
            }
        } else {
            this.f29166d = this.f29163a + i10;
        }
        return (char) i10;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29165c;
    }
}
