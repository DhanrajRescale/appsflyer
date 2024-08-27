package g5;

import android.net.Uri;
import android.util.Base64;
import androidx.media3.common.ParserException;
import androidx.media3.datasource.DataSourceException;
import e5.x;
import java.net.URLDecoder;

/* loaded from: classes.dex */
public final class d extends b {

    /* renamed from: e, reason: collision with root package name */
    public i f16549e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f16550f;

    /* renamed from: g, reason: collision with root package name */
    public int f16551g;

    /* renamed from: h, reason: collision with root package name */
    public int f16552h;

    @Override // g5.f
    public final void close() {
        if (this.f16550f != null) {
            this.f16550f = null;
            q();
        }
        this.f16549e = null;
    }

    @Override // g5.f
    public final Uri l() {
        i iVar = this.f16549e;
        if (iVar != null) {
            return iVar.f16569a;
        }
        return null;
    }

    @Override // g5.f
    public final long o(i iVar) {
        r();
        this.f16549e = iVar;
        Uri normalizeScheme = iVar.f16569a.normalizeScheme();
        String scheme = normalizeScheme.getScheme();
        yk.j.F0("data".equals(scheme), "Unsupported scheme: " + scheme);
        String schemeSpecificPart = normalizeScheme.getSchemeSpecificPart();
        int i10 = x.f15050a;
        String[] split = schemeSpecificPart.split(",", -1);
        if (split.length == 2) {
            String str = split[1];
            if (split[0].contains(";base64")) {
                try {
                    this.f16550f = Base64.decode(str, 0);
                } catch (IllegalArgumentException e10) {
                    throw new ParserException(a3.a.f("Error while parsing Base64 encoded string: ", str), e10, true, 0);
                }
            } else {
                this.f16550f = URLDecoder.decode(str, kp.e.f23431a.name()).getBytes(kp.e.f23433c);
            }
            byte[] bArr = this.f16550f;
            long length = bArr.length;
            long j10 = iVar.f16574f;
            if (j10 <= length) {
                int i11 = (int) j10;
                this.f16551g = i11;
                int length2 = bArr.length - i11;
                this.f16552h = length2;
                long j11 = iVar.f16575g;
                if (j11 != -1) {
                    this.f16552h = (int) Math.min(length2, j11);
                }
                s(iVar);
                if (j11 == -1) {
                    return this.f16552h;
                }
                return j11;
            }
            this.f16550f = null;
            throw new DataSourceException(2008);
        }
        throw new ParserException(jr.h.p("Unexpected URI format: ", normalizeScheme), null, true, 0);
    }

    @Override // b5.o
    public final int read(byte[] bArr, int i10, int i11) {
        if (i11 == 0) {
            return 0;
        }
        int i12 = this.f16552h;
        if (i12 == 0) {
            return -1;
        }
        int min = Math.min(i11, i12);
        byte[] bArr2 = this.f16550f;
        int i13 = x.f15050a;
        System.arraycopy(bArr2, this.f16551g, bArr, i10, min);
        this.f16551g += min;
        this.f16552h -= min;
        p(min);
        return min;
    }
}
