package xj;

import com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader$EndOfFileException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes.dex */
public final class f implements hk.i, yj.g {

    /* renamed from: a, reason: collision with root package name */
    public final ByteBuffer f40297a;

    @Override // hk.i
    public final int a() {
        return (b() << 8) | b();
    }

    @Override // hk.i
    public final short b() {
        ByteBuffer byteBuffer = this.f40297a;
        if (byteBuffer.remaining() >= 1) {
            return (short) (byteBuffer.get() & 255);
        }
        throw new DefaultImageHeaderParser$Reader$EndOfFileException();
    }

    @Override // yj.g
    public final void c() {
    }

    @Override // yj.g
    public final Object l() {
        ByteBuffer byteBuffer = this.f40297a;
        byteBuffer.position(0);
        return byteBuffer;
    }

    @Override // hk.i
    public final long skip(long j10) {
        ByteBuffer byteBuffer = this.f40297a;
        int min = (int) Math.min(byteBuffer.remaining(), j10);
        byteBuffer.position(byteBuffer.position() + min);
        return min;
    }

    public f(ByteBuffer byteBuffer) {
        this.f40297a = byteBuffer;
        byteBuffer.order(ByteOrder.BIG_ENDIAN);
    }
}
