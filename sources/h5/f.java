package h5;

import b5.l0;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public class f extends a {

    /* renamed from: d, reason: collision with root package name */
    public ByteBuffer f18002d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f18003e;

    /* renamed from: f, reason: collision with root package name */
    public long f18004f;

    /* renamed from: g, reason: collision with root package name */
    public ByteBuffer f18005g;

    /* renamed from: h, reason: collision with root package name */
    public final int f18006h;

    /* renamed from: c, reason: collision with root package name */
    public final d f18001c = new d();

    /* renamed from: i, reason: collision with root package name */
    public final int f18007i = 0;

    static {
        l0.a("media3.decoder");
    }

    public f(int i10) {
        this.f18006h = i10;
    }

    public void i() {
        this.f17988b = 0;
        ByteBuffer byteBuffer = this.f18002d;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        ByteBuffer byteBuffer2 = this.f18005g;
        if (byteBuffer2 != null) {
            byteBuffer2.clear();
        }
        this.f18003e = false;
    }

    public final ByteBuffer j(int i10) {
        int capacity;
        int i11 = this.f18006h;
        if (i11 == 1) {
            return ByteBuffer.allocate(i10);
        }
        if (i11 == 2) {
            return ByteBuffer.allocateDirect(i10);
        }
        ByteBuffer byteBuffer = this.f18002d;
        if (byteBuffer == null) {
            capacity = 0;
        } else {
            capacity = byteBuffer.capacity();
        }
        throw new IllegalStateException("Buffer too small (" + capacity + " < " + i10 + ")");
    }

    public final void k(int i10) {
        int i11 = i10 + this.f18007i;
        ByteBuffer byteBuffer = this.f18002d;
        if (byteBuffer == null) {
            this.f18002d = j(i11);
            return;
        }
        int capacity = byteBuffer.capacity();
        int position = byteBuffer.position();
        int i12 = i11 + position;
        if (capacity >= i12) {
            this.f18002d = byteBuffer;
            return;
        }
        ByteBuffer j10 = j(i12);
        j10.order(byteBuffer.order());
        if (position > 0) {
            byteBuffer.flip();
            j10.put(byteBuffer);
        }
        this.f18002d = j10;
    }

    public final void l() {
        ByteBuffer byteBuffer = this.f18002d;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        ByteBuffer byteBuffer2 = this.f18005g;
        if (byteBuffer2 != null) {
            byteBuffer2.flip();
        }
    }
}
