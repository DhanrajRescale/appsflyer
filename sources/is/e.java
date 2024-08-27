package is;

import com.airbnb.deeplinkdispatch.UrlTreeKt;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: classes2.dex */
public class e implements c {

    /* renamed from: d, reason: collision with root package name */
    public static final byte[] f20525d = new byte[0];

    /* renamed from: a, reason: collision with root package name */
    public boolean f20526a;

    /* renamed from: b, reason: collision with root package name */
    public int f20527b;

    /* renamed from: c, reason: collision with root package name */
    public ByteBuffer f20528c = ByteBuffer.wrap(f20525d);

    public e(int i10) {
        this.f20527b = i10;
    }

    @Override // is.d
    public ByteBuffer a() {
        return this.f20528c;
    }

    @Override // is.c
    public void b(ByteBuffer byteBuffer) {
        this.f20528c = byteBuffer;
    }

    public String toString() {
        return "Framedata{ optcode:" + da.e.D(this.f20527b) + ", fin:" + this.f20526a + ", payloadlength:[pos:" + this.f20528c.position() + ", len:" + this.f20528c.remaining() + "], payload:" + Arrays.toString(ks.b.b(new String(this.f20528c.array()))) + UrlTreeKt.componentParamSuffix;
    }
}
