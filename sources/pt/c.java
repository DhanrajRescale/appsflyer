package pt;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final int f31343a;

    /* renamed from: b, reason: collision with root package name */
    public final d[] f31344b;

    /* renamed from: c, reason: collision with root package name */
    public long f31345c;

    /* JADX WARN: Multi-variable type inference failed */
    public c(ThreadFactory threadFactory, int i10) {
        this.f31343a = i10;
        this.f31344b = new d[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            this.f31344b[i11] = new r(threadFactory);
        }
    }

    public final d a() {
        int i10 = this.f31343a;
        if (i10 == 0) {
            return e.f31350f;
        }
        long j10 = this.f31345c;
        this.f31345c = 1 + j10;
        return this.f31344b[(int) (j10 % i10)];
    }
}
