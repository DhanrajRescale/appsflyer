package wj;

import android.util.Log;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public ByteBuffer f39120b;

    /* renamed from: c, reason: collision with root package name */
    public c f39121c;

    /* renamed from: a, reason: collision with root package name */
    public final byte[] f39119a = new byte[256];

    /* renamed from: d, reason: collision with root package name */
    public int f39122d = 0;

    public final boolean a() {
        if (this.f39121c.f39109b != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r6v29, types: [wj.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v37, types: [wj.b, java.lang.Object] */
    public final c b() {
        boolean z10;
        boolean z11;
        boolean z12;
        byte[] bArr;
        boolean z13;
        if (this.f39120b != null) {
            if (a()) {
                return this.f39121c;
            }
            StringBuilder sb2 = new StringBuilder();
            for (int i10 = 0; i10 < 6; i10++) {
                sb2.append((char) c());
            }
            if (!sb2.toString().startsWith("GIF")) {
                this.f39121c.f39109b = 1;
            } else {
                this.f39121c.f39113f = this.f39120b.getShort();
                this.f39121c.f39114g = this.f39120b.getShort();
                int c10 = c();
                c cVar = this.f39121c;
                if ((c10 & 128) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cVar.f39115h = z10;
                cVar.f39116i = (int) Math.pow(2.0d, (c10 & 7) + 1);
                this.f39121c.f39117j = c();
                c cVar2 = this.f39121c;
                c();
                cVar2.getClass();
                if (this.f39121c.f39115h && !a()) {
                    c cVar3 = this.f39121c;
                    cVar3.f39108a = e(cVar3.f39116i);
                    c cVar4 = this.f39121c;
                    cVar4.f39118k = cVar4.f39108a[cVar4.f39117j];
                }
            }
            if (!a()) {
                boolean z14 = false;
                while (!z14 && !a() && this.f39121c.f39110c <= Integer.MAX_VALUE) {
                    int c11 = c();
                    if (c11 != 33) {
                        if (c11 != 44) {
                            if (c11 != 59) {
                                this.f39121c.f39109b = 1;
                            } else {
                                z14 = true;
                            }
                        } else {
                            c cVar5 = this.f39121c;
                            if (cVar5.f39111d == null) {
                                cVar5.f39111d = new Object();
                            }
                            cVar5.f39111d.f39097a = this.f39120b.getShort();
                            this.f39121c.f39111d.f39098b = this.f39120b.getShort();
                            this.f39121c.f39111d.f39099c = this.f39120b.getShort();
                            this.f39121c.f39111d.f39100d = this.f39120b.getShort();
                            int c12 = c();
                            if ((c12 & 128) != 0) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            int pow = (int) Math.pow(2.0d, (c12 & 7) + 1);
                            b bVar = this.f39121c.f39111d;
                            if ((c12 & 64) != 0) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            bVar.f39101e = z12;
                            if (z11) {
                                bVar.f39107k = e(pow);
                            } else {
                                bVar.f39107k = null;
                            }
                            this.f39121c.f39111d.f39106j = this.f39120b.position();
                            c();
                            f();
                            if (!a()) {
                                c cVar6 = this.f39121c;
                                cVar6.f39110c++;
                                cVar6.f39112e.add(cVar6.f39111d);
                            }
                        }
                    } else {
                        int c13 = c();
                        if (c13 != 1) {
                            if (c13 != 249) {
                                if (c13 != 254) {
                                    if (c13 != 255) {
                                        f();
                                    } else {
                                        d();
                                        StringBuilder sb3 = new StringBuilder();
                                        int i11 = 0;
                                        while (true) {
                                            bArr = this.f39119a;
                                            if (i11 >= 11) {
                                                break;
                                            }
                                            sb3.append((char) bArr[i11]);
                                            i11++;
                                        }
                                        if (sb3.toString().equals("NETSCAPE2.0")) {
                                            do {
                                                d();
                                                if (bArr[0] == 1) {
                                                    byte b10 = bArr[1];
                                                    byte b11 = bArr[2];
                                                    this.f39121c.getClass();
                                                }
                                                if (this.f39122d > 0) {
                                                }
                                            } while (!a());
                                        } else {
                                            f();
                                        }
                                    }
                                } else {
                                    f();
                                }
                            } else {
                                this.f39121c.f39111d = new Object();
                                c();
                                int c14 = c();
                                b bVar2 = this.f39121c.f39111d;
                                int i12 = (c14 & 28) >> 2;
                                bVar2.f39103g = i12;
                                if (i12 == 0) {
                                    bVar2.f39103g = 1;
                                }
                                if ((c14 & 1) != 0) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                bVar2.f39102f = z13;
                                short s7 = this.f39120b.getShort();
                                if (s7 < 2) {
                                    s7 = 10;
                                }
                                b bVar3 = this.f39121c.f39111d;
                                bVar3.f39105i = s7 * 10;
                                bVar3.f39104h = c();
                                c();
                            }
                        } else {
                            f();
                        }
                    }
                }
                c cVar7 = this.f39121c;
                if (cVar7.f39110c < 0) {
                    cVar7.f39109b = 1;
                }
            }
            return this.f39121c;
        }
        throw new IllegalStateException("You must call setData() before parseHeader()");
    }

    public final int c() {
        try {
            return this.f39120b.get() & 255;
        } catch (Exception unused) {
            this.f39121c.f39109b = 1;
            return 0;
        }
    }

    public final void d() {
        int c10 = c();
        this.f39122d = c10;
        if (c10 > 0) {
            int i10 = 0;
            int i11 = 0;
            while (true) {
                try {
                    i11 = this.f39122d;
                    if (i10 < i11) {
                        i11 -= i10;
                        this.f39120b.get(this.f39119a, i10, i11);
                        i10 += i11;
                    } else {
                        return;
                    }
                } catch (Exception e10) {
                    if (Log.isLoggable("GifHeaderParser", 3)) {
                        StringBuilder q10 = da.e.q("Error Reading Block n: ", i10, " count: ", i11, " blockSize: ");
                        q10.append(this.f39122d);
                        Log.d("GifHeaderParser", q10.toString(), e10);
                    }
                    this.f39121c.f39109b = 1;
                    return;
                }
            }
        }
    }

    public final int[] e(int i10) {
        byte[] bArr = new byte[i10 * 3];
        int[] iArr = null;
        try {
            this.f39120b.get(bArr);
            iArr = new int[256];
            int i11 = 0;
            int i12 = 0;
            while (i11 < i10) {
                int i13 = bArr[i12] & 255;
                int i14 = i12 + 2;
                int i15 = bArr[i12 + 1] & 255;
                i12 += 3;
                int i16 = i11 + 1;
                iArr[i11] = (i15 << 8) | (i13 << 16) | (-16777216) | (bArr[i14] & 255);
                i11 = i16;
            }
        } catch (BufferUnderflowException e10) {
            if (Log.isLoggable("GifHeaderParser", 3)) {
                Log.d("GifHeaderParser", "Format Error Reading Color Table", e10);
            }
            this.f39121c.f39109b = 1;
        }
        return iArr;
    }

    public final void f() {
        int c10;
        do {
            c10 = c();
            this.f39120b.position(Math.min(this.f39120b.position() + c10, this.f39120b.limit()));
        } while (c10 > 0);
    }
}
