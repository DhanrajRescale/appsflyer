package o6;

import java.util.ArrayDeque;
import z5.q;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f29687a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    public final ArrayDeque f29688b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final e f29689c = new e();

    /* renamed from: d, reason: collision with root package name */
    public t9.c f29690d;

    /* renamed from: e, reason: collision with root package name */
    public int f29691e;

    /* renamed from: f, reason: collision with root package name */
    public int f29692f;

    /* renamed from: g, reason: collision with root package name */
    public long f29693g;

    public final long a(q qVar, int i10) {
        qVar.readFully(this.f29687a, 0, i10);
        long j10 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j10 = (j10 << 8) | (r0[i11] & 255);
        }
        return j10;
    }
}
