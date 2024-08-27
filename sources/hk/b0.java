package hk;

import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class b0 implements xj.i {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18520a;

    /* renamed from: b, reason: collision with root package name */
    public final ByteBuffer f18521b;

    public b0(int i10) {
        this.f18520a = i10;
        if (i10 != 1) {
            this.f18521b = ByteBuffer.allocate(8);
        } else {
            this.f18521b = ByteBuffer.allocate(4);
        }
    }

    @Override // xj.i
    public final void d(byte[] bArr, Object obj, MessageDigest messageDigest) {
        switch (this.f18520a) {
            case 0:
                Long l10 = (Long) obj;
                messageDigest.update(bArr);
                synchronized (this.f18521b) {
                    this.f18521b.position(0);
                    messageDigest.update(this.f18521b.putLong(l10.longValue()).array());
                }
                return;
            default:
                Integer num = (Integer) obj;
                if (num != null) {
                    messageDigest.update(bArr);
                    synchronized (this.f18521b) {
                        this.f18521b.position(0);
                        messageDigest.update(this.f18521b.putInt(num.intValue()).array());
                    }
                    return;
                }
                return;
        }
    }
}
