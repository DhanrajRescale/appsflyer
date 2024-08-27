package hk;

import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class e implements xj.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18526a;

    /* renamed from: b, reason: collision with root package name */
    public final n f18527b;

    public /* synthetic */ e(n nVar, int i10) {
        this.f18526a = i10;
        this.f18527b = nVar;
    }

    @Override // xj.m
    public final ak.e0 a(Object obj, int i10, int i11, xj.k kVar) {
        int i12 = this.f18526a;
        n nVar = this.f18527b;
        switch (i12) {
            case 0:
                int i13 = rk.a.f33931a;
                p8.j jVar = new p8.j((ByteBuffer) obj);
                return nVar.a(new x9.c(nVar.f18555c, jVar, nVar.f18556d), i10, i11, kVar, n.f18551j);
            default:
                return nVar.a(new x9.c((ParcelFileDescriptor) obj, nVar.f18556d, nVar.f18555c), i10, i11, kVar, n.f18551j);
        }
    }

    @Override // xj.m
    public final boolean b(Object obj, xj.k kVar) {
        int i10 = this.f18526a;
        n nVar = this.f18527b;
        switch (i10) {
            case 0:
                nVar.getClass();
                return true;
            default:
                nVar.getClass();
                return true;
        }
    }
}
