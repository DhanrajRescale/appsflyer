package bv;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f7343a;

    /* renamed from: b, reason: collision with root package name */
    public int f7344b;

    /* renamed from: c, reason: collision with root package name */
    public int f7345c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7346d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f7347e;

    /* renamed from: f, reason: collision with root package name */
    public f0 f7348f;

    /* renamed from: g, reason: collision with root package name */
    public f0 f7349g;

    public f0() {
        this.f7343a = new byte[UserMetadata.MAX_INTERNAL_KEY_SIZE];
        this.f7347e = true;
        this.f7346d = false;
    }

    public final f0 a() {
        f0 f0Var = this.f7348f;
        if (f0Var == this) {
            f0Var = null;
        }
        f0 f0Var2 = this.f7349g;
        Intrinsics.c(f0Var2);
        f0Var2.f7348f = this.f7348f;
        f0 f0Var3 = this.f7348f;
        Intrinsics.c(f0Var3);
        f0Var3.f7349g = this.f7349g;
        this.f7348f = null;
        this.f7349g = null;
        return f0Var;
    }

    public final void b(f0 segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        segment.f7349g = this;
        segment.f7348f = this.f7348f;
        f0 f0Var = this.f7348f;
        Intrinsics.c(f0Var);
        f0Var.f7349g = segment;
        this.f7348f = segment;
    }

    public final f0 c() {
        this.f7346d = true;
        return new f0(this.f7343a, this.f7344b, this.f7345c, true, false);
    }

    public final void d(f0 sink, int i10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (sink.f7347e) {
            int i11 = sink.f7345c;
            int i12 = i11 + i10;
            byte[] bArr = sink.f7343a;
            if (i12 > 8192) {
                if (!sink.f7346d) {
                    int i13 = sink.f7344b;
                    if (i12 - i13 <= 8192) {
                        vt.t.d(bArr, 0, bArr, i13, i11);
                        sink.f7345c -= sink.f7344b;
                        sink.f7344b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            int i14 = sink.f7345c;
            int i15 = this.f7344b;
            vt.t.d(this.f7343a, i14, bArr, i15, i15 + i10);
            sink.f7345c += i10;
            this.f7344b += i10;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public f0(byte[] data, int i10, int i11, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f7343a = data;
        this.f7344b = i10;
        this.f7345c = i11;
        this.f7346d = z10;
        this.f7347e = z11;
    }
}
