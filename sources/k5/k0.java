package k5;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class k0 extends c5.d {

    /* renamed from: i, reason: collision with root package name */
    public static final int f22146i = Float.floatToIntBits(Float.NaN);

    @Override // c5.d
    public final c5.b a(c5.b bVar) {
        int i10 = bVar.f7954c;
        if (i10 != 536870912 && i10 != 805306368 && i10 != 4) {
            throw new AudioProcessor$UnhandledAudioFormatException(bVar);
        }
        if (i10 != 4) {
            return new c5.b(bVar.f7952a, bVar.f7953b, 4);
        }
        return c5.b.f7951e;
    }

    @Override // c5.c
    public final void d(ByteBuffer byteBuffer) {
        ByteBuffer l10;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        int i11 = this.f7957b.f7954c;
        int i12 = f22146i;
        if (i11 != 536870912) {
            if (i11 == 805306368) {
                l10 = l(i10);
                while (position < limit) {
                    int floatToIntBits = Float.floatToIntBits((float) (((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24)) * 4.656612875245797E-10d));
                    if (floatToIntBits == i12) {
                        floatToIntBits = Float.floatToIntBits(s0.g.f34069a);
                    }
                    l10.putInt(floatToIntBits);
                    position += 4;
                }
            } else {
                throw new IllegalStateException();
            }
        } else {
            l10 = l((i10 / 3) * 4);
            while (position < limit) {
                int floatToIntBits2 = Float.floatToIntBits((float) ((((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits2 == i12) {
                    floatToIntBits2 = Float.floatToIntBits(s0.g.f34069a);
                }
                l10.putInt(floatToIntBits2);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        l10.flip();
    }
}
