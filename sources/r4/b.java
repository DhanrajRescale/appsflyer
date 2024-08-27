package r4;

import android.widget.EditText;
import b5.v;
import com.google.android.gms.common.api.Api;
import e5.m;
import e5.p;
import e5.x;
import java.lang.reflect.Array;

/* loaded from: classes.dex */
public final class b implements q6.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33055a;

    /* renamed from: b, reason: collision with root package name */
    public final int f33056b;

    /* renamed from: c, reason: collision with root package name */
    public final int f33057c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f33058d;

    public b(int i10, int i11) {
        this.f33055a = 3;
        this.f33058d = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i11, i10);
        this.f33056b = i10;
        this.f33057c = i11;
    }

    @Override // q6.e
    public final int a() {
        return this.f33056b;
    }

    @Override // q6.e
    public final int b() {
        return this.f33057c;
    }

    @Override // q6.e
    public final int c() {
        int i10 = this.f33056b;
        if (i10 == -1) {
            return ((p) this.f33058d).x();
        }
        return i10;
    }

    public final byte d(int i10, int i11) {
        return ((byte[][]) this.f33058d)[i11][i10];
    }

    public final void e(int i10, int i11, int i12) {
        ((byte[][]) this.f33058d)[i11][i10] = (byte) i12;
    }

    public final void f(int i10, int i11, boolean z10) {
        ((byte[][]) this.f33058d)[i11][i10] = z10 ? (byte) 1 : (byte) 0;
    }

    public final String toString() {
        switch (this.f33055a) {
            case 3:
                StringBuilder sb2 = new StringBuilder((this.f33056b * 2 * this.f33057c) + 2);
                for (int i10 = 0; i10 < this.f33057c; i10++) {
                    byte[] bArr = ((byte[][]) this.f33058d)[i10];
                    for (int i11 = 0; i11 < this.f33056b; i11++) {
                        byte b10 = bArr[i11];
                        if (b10 != 0) {
                            if (b10 != 1) {
                                sb2.append("  ");
                            } else {
                                sb2.append(" 1");
                            }
                        } else {
                            sb2.append(" 0");
                        }
                    }
                    sb2.append('\n');
                }
                return sb2.toString();
            default:
                return super.toString();
        }
    }

    public b(EditText editText) {
        this.f33055a = 0;
        this.f33056b = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        this.f33057c = 0;
        if (editText != null) {
            this.f33058d = new a(editText);
            return;
        }
        throw new NullPointerException("editText cannot be null");
    }

    public b(byte[] bArr, int i10, int i11) {
        this.f33055a = 2;
        this.f33058d = bArr;
        this.f33056b = i10;
        this.f33057c = i11;
    }

    public b(q6.b bVar, v vVar) {
        this.f33055a = 1;
        p pVar = bVar.f31664c;
        this.f33058d = pVar;
        pVar.F(12);
        int x10 = pVar.x();
        if ("audio/raw".equals(vVar.f3652l)) {
            int u10 = x.u(vVar.A, vVar.f3665y);
            if (x10 == 0 || x10 % u10 != 0) {
                m.f("AtomParsers", "Audio sample size mismatch. stsd sample size: " + u10 + ", stsz sample size: " + x10);
                x10 = u10;
            }
        }
        this.f33056b = x10 == 0 ? -1 : x10;
        this.f33057c = pVar.x();
    }
}
