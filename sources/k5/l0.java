package k5;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class l0 extends c5.d {

    /* renamed from: i, reason: collision with root package name */
    public int f22152i;

    /* renamed from: j, reason: collision with root package name */
    public int f22153j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f22154k;

    /* renamed from: l, reason: collision with root package name */
    public int f22155l;

    /* renamed from: m, reason: collision with root package name */
    public byte[] f22156m;

    /* renamed from: n, reason: collision with root package name */
    public int f22157n;

    /* renamed from: o, reason: collision with root package name */
    public long f22158o;

    @Override // c5.d
    public final c5.b a(c5.b bVar) {
        if (bVar.f7954c == 2) {
            this.f22154k = true;
            if (this.f22152i == 0 && this.f22153j == 0) {
                return c5.b.f7951e;
            }
            return bVar;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(bVar);
    }

    @Override // c5.d, c5.c
    public final ByteBuffer c() {
        int i10;
        if (super.g() && (i10 = this.f22157n) > 0) {
            l(i10).put(this.f22156m, 0, this.f22157n).flip();
            this.f22157n = 0;
        }
        return super.c();
    }

    @Override // c5.c
    public final void d(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i10 = limit - position;
        if (i10 == 0) {
            return;
        }
        int min = Math.min(i10, this.f22155l);
        this.f22158o += min / this.f7957b.f7955d;
        this.f22155l -= min;
        byteBuffer.position(position + min);
        if (this.f22155l > 0) {
            return;
        }
        int i11 = i10 - min;
        int length = (this.f22157n + i11) - this.f22156m.length;
        ByteBuffer l10 = l(length);
        int i12 = e5.x.i(length, 0, this.f22157n);
        l10.put(this.f22156m, 0, i12);
        int i13 = e5.x.i(length - i12, 0, i11);
        byteBuffer.limit(byteBuffer.position() + i13);
        l10.put(byteBuffer);
        byteBuffer.limit(limit);
        int i14 = i11 - i13;
        int i15 = this.f22157n - i12;
        this.f22157n = i15;
        byte[] bArr = this.f22156m;
        System.arraycopy(bArr, i12, bArr, 0, i15);
        byteBuffer.get(this.f22156m, this.f22157n, i14);
        this.f22157n += i14;
        l10.flip();
    }

    @Override // c5.d, c5.c
    public final boolean g() {
        if (super.g() && this.f22157n == 0) {
            return true;
        }
        return false;
    }

    @Override // c5.d
    public final void i() {
        if (this.f22154k) {
            this.f22154k = false;
            int i10 = this.f22153j;
            int i11 = this.f7957b.f7955d;
            this.f22156m = new byte[i10 * i11];
            this.f22155l = this.f22152i * i11;
        }
        this.f22157n = 0;
    }

    @Override // c5.d
    public final void j() {
        if (this.f22154k) {
            if (this.f22157n > 0) {
                this.f22158o += r0 / this.f7957b.f7955d;
            }
            this.f22157n = 0;
        }
    }

    @Override // c5.d
    public final void k() {
        this.f22156m = e5.x.f15055f;
    }
}
