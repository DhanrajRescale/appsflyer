package g5;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class t implements f {

    /* renamed from: a, reason: collision with root package name */
    public final f f16625a;

    /* renamed from: b, reason: collision with root package name */
    public long f16626b;

    /* renamed from: c, reason: collision with root package name */
    public Uri f16627c;

    public t(f fVar) {
        fVar.getClass();
        this.f16625a = fVar;
        this.f16627c = Uri.EMPTY;
        Collections.emptyMap();
    }

    @Override // g5.f
    public final void close() {
        this.f16625a.close();
    }

    @Override // g5.f
    public final Map h() {
        return this.f16625a.h();
    }

    @Override // g5.f
    public final Uri l() {
        return this.f16625a.l();
    }

    @Override // g5.f
    public final void m(u uVar) {
        uVar.getClass();
        this.f16625a.m(uVar);
    }

    @Override // g5.f
    public final long o(i iVar) {
        this.f16627c = iVar.f16569a;
        Collections.emptyMap();
        f fVar = this.f16625a;
        long o10 = fVar.o(iVar);
        Uri l10 = fVar.l();
        l10.getClass();
        this.f16627c = l10;
        fVar.h();
        return o10;
    }

    @Override // b5.o
    public final int read(byte[] bArr, int i10, int i11) {
        int read = this.f16625a.read(bArr, i10, i11);
        if (read != -1) {
            this.f16626b += read;
        }
        return read;
    }
}
