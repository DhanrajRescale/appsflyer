package l5;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
public final class m implements s5.m {

    /* renamed from: a, reason: collision with root package name */
    public final long f24054a;

    /* renamed from: b, reason: collision with root package name */
    public final long f24055b;

    /* renamed from: c, reason: collision with root package name */
    public long f24056c;

    /* renamed from: d, reason: collision with root package name */
    public final l f24057d;

    public m(l lVar, long j10, long j11) {
        this.f24054a = j10;
        this.f24055b = j11;
        this.f24056c = j10 - 1;
        this.f24057d = lVar;
    }

    @Override // s5.m
    public final long b() {
        long j10 = this.f24056c;
        if (j10 >= this.f24054a && j10 <= this.f24055b) {
            return this.f24057d.d(j10);
        }
        throw new NoSuchElementException();
    }

    @Override // s5.m
    public final long d() {
        long j10 = this.f24056c;
        if (j10 >= this.f24054a && j10 <= this.f24055b) {
            return this.f24057d.c(j10);
        }
        throw new NoSuchElementException();
    }

    @Override // s5.m
    public final boolean next() {
        long j10 = this.f24056c + 1;
        this.f24056c = j10;
        return !(j10 > this.f24055b);
    }
}
