package k5;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class q extends c5.d {

    /* renamed from: i, reason: collision with root package name */
    public int[] f22196i;

    /* renamed from: j, reason: collision with root package name */
    public int[] f22197j;

    @Override // c5.d
    public final c5.b a(c5.b bVar) {
        boolean z10;
        boolean z11;
        int[] iArr = this.f22196i;
        if (iArr == null) {
            return c5.b.f7951e;
        }
        if (bVar.f7954c == 2) {
            int length = iArr.length;
            int i10 = bVar.f7953b;
            if (i10 != length) {
                z10 = true;
            } else {
                z10 = false;
            }
            for (int i11 = 0; i11 < iArr.length; i11++) {
                int i12 = iArr[i11];
                if (i12 < i10) {
                    if (i12 != i11) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z10 |= z11;
                } else {
                    throw new AudioProcessor$UnhandledAudioFormatException(bVar);
                }
            }
            if (z10) {
                return new c5.b(bVar.f7952a, iArr.length, 2);
            }
            return c5.b.f7951e;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(bVar);
    }

    @Override // c5.c
    public final void d(ByteBuffer byteBuffer) {
        int[] iArr = this.f22197j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer l10 = l(((limit - position) / this.f7957b.f7955d) * this.f7958c.f7955d);
        while (position < limit) {
            for (int i10 : iArr) {
                l10.putShort(byteBuffer.getShort((i10 * 2) + position));
            }
            position += this.f7957b.f7955d;
        }
        byteBuffer.position(limit);
        l10.flip();
    }

    @Override // c5.d
    public final void i() {
        this.f22197j = this.f22196i;
    }

    @Override // c5.d
    public final void k() {
        this.f22197j = null;
        this.f22196i = null;
    }
}
