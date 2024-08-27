package c5;

import androidx.media3.common.audio.AudioProcessor$UnhandledAudioFormatException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes.dex */
public final class f implements c {

    /* renamed from: b, reason: collision with root package name */
    public int f7986b;

    /* renamed from: c, reason: collision with root package name */
    public float f7987c;

    /* renamed from: d, reason: collision with root package name */
    public float f7988d;

    /* renamed from: e, reason: collision with root package name */
    public b f7989e;

    /* renamed from: f, reason: collision with root package name */
    public b f7990f;

    /* renamed from: g, reason: collision with root package name */
    public b f7991g;

    /* renamed from: h, reason: collision with root package name */
    public b f7992h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7993i;

    /* renamed from: j, reason: collision with root package name */
    public e f7994j;

    /* renamed from: k, reason: collision with root package name */
    public ByteBuffer f7995k;

    /* renamed from: l, reason: collision with root package name */
    public ShortBuffer f7996l;

    /* renamed from: m, reason: collision with root package name */
    public ByteBuffer f7997m;

    /* renamed from: n, reason: collision with root package name */
    public long f7998n;

    /* renamed from: o, reason: collision with root package name */
    public long f7999o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f8000p;

    @Override // c5.c
    public final boolean b() {
        if (this.f7990f.f7952a != -1 && (Math.abs(this.f7987c - 1.0f) >= 1.0E-4f || Math.abs(this.f7988d - 1.0f) >= 1.0E-4f || this.f7990f.f7952a != this.f7989e.f7952a)) {
            return true;
        }
        return false;
    }

    @Override // c5.c
    public final ByteBuffer c() {
        e eVar = this.f7994j;
        if (eVar != null) {
            int i10 = eVar.f7976m;
            int i11 = eVar.f7965b;
            int i12 = i10 * i11 * 2;
            if (i12 > 0) {
                if (this.f7995k.capacity() < i12) {
                    ByteBuffer order = ByteBuffer.allocateDirect(i12).order(ByteOrder.nativeOrder());
                    this.f7995k = order;
                    this.f7996l = order.asShortBuffer();
                } else {
                    this.f7995k.clear();
                    this.f7996l.clear();
                }
                ShortBuffer shortBuffer = this.f7996l;
                int min = Math.min(shortBuffer.remaining() / i11, eVar.f7976m);
                int i13 = min * i11;
                shortBuffer.put(eVar.f7975l, 0, i13);
                int i14 = eVar.f7976m - min;
                eVar.f7976m = i14;
                short[] sArr = eVar.f7975l;
                System.arraycopy(sArr, i13, sArr, 0, i14 * i11);
                this.f7999o += i12;
                this.f7995k.limit(i12);
                this.f7997m = this.f7995k;
            }
        }
        ByteBuffer byteBuffer = this.f7997m;
        this.f7997m = c.f7956a;
        return byteBuffer;
    }

    @Override // c5.c
    public final void d(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasRemaining()) {
            return;
        }
        e eVar = this.f7994j;
        eVar.getClass();
        ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
        int remaining = byteBuffer.remaining();
        this.f7998n += remaining;
        int remaining2 = asShortBuffer.remaining();
        int i10 = eVar.f7965b;
        int i11 = remaining2 / i10;
        short[] c10 = eVar.c(eVar.f7973j, eVar.f7974k, i11);
        eVar.f7973j = c10;
        asShortBuffer.get(c10, eVar.f7974k * i10, ((i11 * i10) * 2) / 2);
        eVar.f7974k += i11;
        eVar.f();
        byteBuffer.position(byteBuffer.position() + remaining);
    }

    @Override // c5.c
    public final b e(b bVar) {
        if (bVar.f7954c == 2) {
            int i10 = this.f7986b;
            if (i10 == -1) {
                i10 = bVar.f7952a;
            }
            this.f7989e = bVar;
            b bVar2 = new b(i10, bVar.f7953b, 2);
            this.f7990f = bVar2;
            this.f7993i = true;
            return bVar2;
        }
        throw new AudioProcessor$UnhandledAudioFormatException(bVar);
    }

    @Override // c5.c
    public final void f() {
        e eVar = this.f7994j;
        if (eVar != null) {
            int i10 = eVar.f7974k;
            float f10 = eVar.f7966c;
            float f11 = eVar.f7967d;
            int i11 = eVar.f7976m + ((int) ((((i10 / (f10 / f11)) + eVar.f7978o) / (eVar.f7968e * f11)) + 0.5f));
            short[] sArr = eVar.f7973j;
            int i12 = eVar.f7971h * 2;
            eVar.f7973j = eVar.c(sArr, i10, i12 + i10);
            int i13 = 0;
            while (true) {
                int i14 = eVar.f7965b;
                if (i13 >= i12 * i14) {
                    break;
                }
                eVar.f7973j[(i14 * i10) + i13] = 0;
                i13++;
            }
            eVar.f7974k = i12 + eVar.f7974k;
            eVar.f();
            if (eVar.f7976m > i11) {
                eVar.f7976m = i11;
            }
            eVar.f7974k = 0;
            eVar.f7981r = 0;
            eVar.f7978o = 0;
        }
        this.f8000p = true;
    }

    @Override // c5.c
    public final void flush() {
        if (b()) {
            b bVar = this.f7989e;
            this.f7991g = bVar;
            b bVar2 = this.f7990f;
            this.f7992h = bVar2;
            if (this.f7993i) {
                this.f7994j = new e(this.f7987c, this.f7988d, bVar.f7952a, bVar.f7953b, bVar2.f7952a);
            } else {
                e eVar = this.f7994j;
                if (eVar != null) {
                    eVar.f7974k = 0;
                    eVar.f7976m = 0;
                    eVar.f7978o = 0;
                    eVar.f7979p = 0;
                    eVar.f7980q = 0;
                    eVar.f7981r = 0;
                    eVar.f7982s = 0;
                    eVar.f7983t = 0;
                    eVar.f7984u = 0;
                    eVar.f7985v = 0;
                }
            }
        }
        this.f7997m = c.f7956a;
        this.f7998n = 0L;
        this.f7999o = 0L;
        this.f8000p = false;
    }

    @Override // c5.c
    public final boolean g() {
        e eVar;
        if (this.f8000p && ((eVar = this.f7994j) == null || eVar.f7976m * eVar.f7965b * 2 == 0)) {
            return true;
        }
        return false;
    }

    @Override // c5.c
    public final void h() {
        this.f7987c = 1.0f;
        this.f7988d = 1.0f;
        b bVar = b.f7951e;
        this.f7989e = bVar;
        this.f7990f = bVar;
        this.f7991g = bVar;
        this.f7992h = bVar;
        ByteBuffer byteBuffer = c.f7956a;
        this.f7995k = byteBuffer;
        this.f7996l = byteBuffer.asShortBuffer();
        this.f7997m = byteBuffer;
        this.f7986b = -1;
        this.f7993i = false;
        this.f7994j = null;
        this.f7998n = 0L;
        this.f7999o = 0L;
        this.f8000p = false;
    }
}
