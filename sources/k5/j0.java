package k5;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class j0 extends c5.d {

    /* renamed from: i, reason: collision with root package name */
    public final long f22129i = 150000;

    /* renamed from: j, reason: collision with root package name */
    public final long f22130j = 20000;

    /* renamed from: k, reason: collision with root package name */
    public final short f22131k = 1024;

    /* renamed from: l, reason: collision with root package name */
    public int f22132l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f22133m;

    /* renamed from: n, reason: collision with root package name */
    public byte[] f22134n;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f22135o;

    /* renamed from: p, reason: collision with root package name */
    public int f22136p;

    /* renamed from: q, reason: collision with root package name */
    public int f22137q;

    /* renamed from: r, reason: collision with root package name */
    public int f22138r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f22139s;

    /* renamed from: t, reason: collision with root package name */
    public long f22140t;

    public j0() {
        byte[] bArr = e5.x.f15055f;
        this.f22134n = bArr;
        this.f22135o = bArr;
    }

    @Override // c5.d
    public final c5.b a(c5.b bVar) {
        if (bVar.f7954c == 2) {
            if (!this.f22133m) {
                return c5.b.f7951e;
            }
            return bVar;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(bVar);
    }

    @Override // c5.d, c5.c
    public final boolean b() {
        return this.f22133m;
    }

    @Override // c5.c
    public final void d(ByteBuffer byteBuffer) {
        int position;
        while (byteBuffer.hasRemaining() && !this.f7962g.hasRemaining()) {
            int i10 = this.f22136p;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        int limit = byteBuffer.limit();
                        int m10 = m(byteBuffer);
                        byteBuffer.limit(m10);
                        this.f22140t += byteBuffer.remaining() / this.f22132l;
                        o(byteBuffer, this.f22135o, this.f22138r);
                        if (m10 < limit) {
                            n(this.f22138r, this.f22135o);
                            this.f22136p = 0;
                            byteBuffer.limit(limit);
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    int limit2 = byteBuffer.limit();
                    int m11 = m(byteBuffer);
                    int position2 = m11 - byteBuffer.position();
                    byte[] bArr = this.f22134n;
                    int length = bArr.length;
                    int i11 = this.f22137q;
                    int i12 = length - i11;
                    if (m11 < limit2 && position2 < i12) {
                        n(i11, bArr);
                        this.f22137q = 0;
                        this.f22136p = 0;
                    } else {
                        int min = Math.min(position2, i12);
                        byteBuffer.limit(byteBuffer.position() + min);
                        byteBuffer.get(this.f22134n, this.f22137q, min);
                        int i13 = this.f22137q + min;
                        this.f22137q = i13;
                        byte[] bArr2 = this.f22134n;
                        if (i13 == bArr2.length) {
                            if (this.f22139s) {
                                n(this.f22138r, bArr2);
                                this.f22140t += (this.f22137q - (this.f22138r * 2)) / this.f22132l;
                            } else {
                                this.f22140t += (i13 - this.f22138r) / this.f22132l;
                            }
                            o(byteBuffer, this.f22134n, this.f22137q);
                            this.f22137q = 0;
                            this.f22136p = 2;
                        }
                        byteBuffer.limit(limit2);
                    }
                }
            } else {
                int limit3 = byteBuffer.limit();
                byteBuffer.limit(Math.min(limit3, byteBuffer.position() + this.f22134n.length));
                int limit4 = byteBuffer.limit() - 2;
                while (true) {
                    if (limit4 >= byteBuffer.position()) {
                        if (Math.abs((int) byteBuffer.getShort(limit4)) > this.f22131k) {
                            int i14 = this.f22132l;
                            position = ((limit4 / i14) * i14) + i14;
                            break;
                        }
                        limit4 -= 2;
                    } else {
                        position = byteBuffer.position();
                        break;
                    }
                }
                if (position == byteBuffer.position()) {
                    this.f22136p = 1;
                } else {
                    byteBuffer.limit(position);
                    int remaining = byteBuffer.remaining();
                    l(remaining).put(byteBuffer).flip();
                    if (remaining > 0) {
                        this.f22139s = true;
                    }
                }
                byteBuffer.limit(limit3);
            }
        }
    }

    @Override // c5.d
    public final void i() {
        if (this.f22133m) {
            c5.b bVar = this.f7957b;
            int i10 = bVar.f7955d;
            this.f22132l = i10;
            int i11 = bVar.f7952a;
            int i12 = ((int) ((this.f22129i * i11) / 1000000)) * i10;
            if (this.f22134n.length != i12) {
                this.f22134n = new byte[i12];
            }
            int i13 = ((int) ((this.f22130j * i11) / 1000000)) * i10;
            this.f22138r = i13;
            if (this.f22135o.length != i13) {
                this.f22135o = new byte[i13];
            }
        }
        this.f22136p = 0;
        this.f22140t = 0L;
        this.f22137q = 0;
        this.f22139s = false;
    }

    @Override // c5.d
    public final void j() {
        int i10 = this.f22137q;
        if (i10 > 0) {
            n(i10, this.f22134n);
        }
        if (!this.f22139s) {
            this.f22140t += this.f22138r / this.f22132l;
        }
    }

    @Override // c5.d
    public final void k() {
        this.f22133m = false;
        this.f22138r = 0;
        byte[] bArr = e5.x.f15055f;
        this.f22134n = bArr;
        this.f22135o = bArr;
    }

    public final int m(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f22131k) {
                int i10 = this.f22132l;
                return (position / i10) * i10;
            }
        }
        return byteBuffer.limit();
    }

    public final void n(int i10, byte[] bArr) {
        l(i10).put(bArr, 0, i10).flip();
        if (i10 > 0) {
            this.f22139s = true;
        }
    }

    public final void o(ByteBuffer byteBuffer, byte[] bArr, int i10) {
        int min = Math.min(byteBuffer.remaining(), this.f22138r);
        int i11 = this.f22138r - min;
        System.arraycopy(bArr, i10 - i11, this.f22135o, 0, i11);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f22135o, i11, min);
    }
}
