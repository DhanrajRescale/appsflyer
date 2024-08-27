package z6;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.airbnb.deeplinkdispatch.MetadataMasks;
import e5.m;
import e5.p;
import e5.x;
import java.nio.charset.Charset;
import java.util.List;
import kp.e;
import okhttp3.HttpUrl;
import s0.g;

/* loaded from: classes.dex */
public final class a extends s6.a {

    /* renamed from: m, reason: collision with root package name */
    public final p f42143m = new p();

    /* renamed from: n, reason: collision with root package name */
    public final boolean f42144n;

    /* renamed from: o, reason: collision with root package name */
    public final int f42145o;

    /* renamed from: p, reason: collision with root package name */
    public final int f42146p;

    /* renamed from: q, reason: collision with root package name */
    public final String f42147q;

    /* renamed from: r, reason: collision with root package name */
    public final float f42148r;

    /* renamed from: s, reason: collision with root package name */
    public final int f42149s;

    public a(List list) {
        if (list.size() == 1 && (((byte[]) list.get(0)).length == 48 || ((byte[]) list.get(0)).length == 53)) {
            byte[] bArr = (byte[]) list.get(0);
            this.f42145o = bArr[24];
            this.f42146p = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
            this.f42147q = "Serif".equals(new String(bArr, 43, bArr.length - 43, e.f23433c)) ? "serif" : "sans-serif";
            int i10 = bArr[25] * 20;
            this.f42149s = i10;
            boolean z10 = (bArr[0] & MetadataMasks.ConfigurablePathSegmentMask) != 0;
            this.f42144n = z10;
            if (z10) {
                this.f42148r = x.h(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i10, g.f34069a, 0.95f);
                return;
            } else {
                this.f42148r = 0.85f;
                return;
            }
        }
        this.f42145o = 0;
        this.f42146p = -1;
        this.f42147q = "sans-serif";
        this.f42144n = false;
        this.f42148r = 0.85f;
        this.f42149s = -1;
    }

    public static void h(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        if (i10 != i11) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i10 >>> 8) | ((i10 & 255) << 24)), i12, i13, i14 | 33);
        }
    }

    public static void i(SpannableStringBuilder spannableStringBuilder, int i10, int i11, int i12, int i13, int i14) {
        boolean z10;
        boolean z11;
        if (i10 != i11) {
            int i15 = i14 | 33;
            boolean z12 = true;
            if ((i10 & 1) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i10 & 2) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z10) {
                if (z11) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i12, i13, i15);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i12, i13, i15);
                }
            } else if (z11) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i12, i13, i15);
            }
            if ((i10 & 4) == 0) {
                z12 = false;
            }
            if (z12) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i12, i13, i15);
            }
            if (!z12 && !z10 && !z11) {
                spannableStringBuilder.setSpan(new StyleSpan(0), i12, i13, i15);
            }
        }
    }

    @Override // s6.a
    public final s6.b f(byte[] bArr, int i10, boolean z10) {
        String s7;
        int i11;
        int i12;
        int i13;
        p pVar = this.f42143m;
        pVar.D(i10, bArr);
        int i14 = 2;
        if (pVar.a() >= 2) {
            int z11 = pVar.z();
            if (z11 == 0) {
                s7 = HttpUrl.FRAGMENT_ENCODE_SET;
            } else {
                int i15 = pVar.f15037b;
                Charset B = pVar.B();
                int i16 = z11 - (pVar.f15037b - i15);
                if (B == null) {
                    B = e.f23433c;
                }
                s7 = pVar.s(i16, B);
            }
            if (s7.isEmpty()) {
                return b.f42150b;
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(s7);
            i(spannableStringBuilder, this.f42145o, 0, 0, spannableStringBuilder.length(), 16711680);
            h(spannableStringBuilder, this.f42146p, -1, 0, spannableStringBuilder.length(), 16711680);
            int length = spannableStringBuilder.length();
            int i17 = 0;
            String str = this.f42147q;
            if (str != "sans-serif") {
                spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
            }
            float f10 = this.f42148r;
            while (pVar.a() >= 8) {
                int i18 = pVar.f15037b;
                int g10 = pVar.g();
                int g11 = pVar.g();
                if (g11 == 1937013100) {
                    if (pVar.a() >= i14) {
                        int z12 = pVar.z();
                        int i19 = i17;
                        while (i19 < z12) {
                            if (pVar.a() >= 12) {
                                int z13 = pVar.z();
                                int z14 = pVar.z();
                                pVar.G(i14);
                                int u10 = pVar.u();
                                pVar.G(1);
                                int g12 = pVar.g();
                                if (z14 > spannableStringBuilder.length()) {
                                    StringBuilder n10 = a3.a.n("Truncating styl end (", z14, ") to cueText.length() (");
                                    n10.append(spannableStringBuilder.length());
                                    n10.append(").");
                                    m.f("Tx3gDecoder", n10.toString());
                                    i12 = spannableStringBuilder.length();
                                } else {
                                    i12 = z14;
                                }
                                if (z13 >= i12) {
                                    m.f("Tx3gDecoder", "Ignoring styl with start (" + z13 + ") >= end (" + i12 + ").");
                                    i13 = i19;
                                } else {
                                    int i20 = i12;
                                    i13 = i19;
                                    i(spannableStringBuilder, u10, this.f42145o, z13, i20, 0);
                                    h(spannableStringBuilder, g12, this.f42146p, z13, i20, 0);
                                }
                                i19 = i13 + 1;
                                i14 = 2;
                            } else {
                                throw new Exception("Unexpected subtitle format.");
                            }
                        }
                        i11 = i14;
                    } else {
                        throw new Exception("Unexpected subtitle format.");
                    }
                } else if (g11 == 1952608120 && this.f42144n) {
                    i11 = 2;
                    if (pVar.a() >= 2) {
                        f10 = x.h(pVar.z() / this.f42149s, g.f34069a, 0.95f);
                    } else {
                        throw new Exception("Unexpected subtitle format.");
                    }
                } else {
                    i11 = 2;
                }
                pVar.F(i18 + g10);
                i14 = i11;
                i17 = 0;
            }
            return new b(new d5.b(spannableStringBuilder, null, null, null, f10, 0, 0, -3.4028235E38f, Integer.MIN_VALUE, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, g.f34069a));
        }
        throw new Exception("Unexpected subtitle format.");
    }
}
