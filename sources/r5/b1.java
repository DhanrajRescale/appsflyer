package r5;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class b1 implements v5.m {

    /* renamed from: a, reason: collision with root package name */
    public final g5.i f33090a;

    /* renamed from: b, reason: collision with root package name */
    public final g5.t f33091b;

    /* renamed from: c, reason: collision with root package name */
    public byte[] f33092c;

    public b1(g5.f fVar, g5.i iVar) {
        n.f33243a.getAndIncrement();
        this.f33090a = iVar;
        this.f33091b = new g5.t(fVar);
    }

    @Override // v5.m
    public final void e() {
        int i10;
        byte[] bArr;
        g5.t tVar = this.f33091b;
        tVar.f16626b = 0L;
        try {
            tVar.o(this.f33090a);
            do {
                i10 = (int) tVar.f16626b;
                byte[] bArr2 = this.f33092c;
                if (bArr2 == null) {
                    this.f33092c = new byte[UserMetadata.MAX_ATTRIBUTE_SIZE];
                } else if (i10 == bArr2.length) {
                    this.f33092c = Arrays.copyOf(bArr2, bArr2.length * 2);
                }
                bArr = this.f33092c;
            } while (tVar.read(bArr, i10, bArr.length - i10) != -1);
            vl.b.h(tVar);
        } catch (Throwable th2) {
            vl.b.h(tVar);
            throw th2;
        }
    }

    @Override // v5.m
    public final void f() {
    }
}
