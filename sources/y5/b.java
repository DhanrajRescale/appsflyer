package y5;

import b5.v;
import e5.p;
import e5.x;
import java.nio.ByteBuffer;

/* loaded from: classes.dex */
public final class b extends i5.f {

    /* renamed from: o, reason: collision with root package name */
    public final h5.f f41154o;

    /* renamed from: p, reason: collision with root package name */
    public final p f41155p;

    /* renamed from: q, reason: collision with root package name */
    public long f41156q;

    /* renamed from: r, reason: collision with root package name */
    public a f41157r;

    /* renamed from: s, reason: collision with root package name */
    public long f41158s;

    public b() {
        super(6);
        this.f41154o = new h5.f(1);
        this.f41155p = new p();
    }

    @Override // i5.f
    public final int B(v vVar) {
        if ("application/x-camera-motion".equals(vVar.f3652l)) {
            return i5.f.e(4, 0, 0);
        }
        return i5.f.e(0, 0, 0);
    }

    @Override // i5.f, i5.c1
    public final void c(int i10, Object obj) {
        if (i10 == 8) {
            this.f41157r = (a) obj;
        }
    }

    @Override // i5.f
    public final String k() {
        return "CameraMotionRenderer";
    }

    @Override // i5.f
    public final boolean m() {
        return l();
    }

    @Override // i5.f
    public final boolean n() {
        return true;
    }

    @Override // i5.f
    public final void o() {
        a aVar = this.f41157r;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // i5.f
    public final void q(long j10, boolean z10) {
        this.f41158s = Long.MIN_VALUE;
        a aVar = this.f41157r;
        if (aVar != null) {
            aVar.b();
        }
    }

    @Override // i5.f
    public final void v(v[] vVarArr, long j10, long j11) {
        this.f41156q = j11;
    }

    @Override // i5.f
    public final void x(long j10, long j11) {
        float[] fArr;
        while (!l() && this.f41158s < 100000 + j10) {
            h5.f fVar = this.f41154o;
            fVar.i();
            tr.e eVar = this.f19410c;
            eVar.m();
            if (w(eVar, fVar, 0) == -4 && !fVar.g(4)) {
                this.f41158s = fVar.f18004f;
                if (this.f41157r != null && !fVar.g(Integer.MIN_VALUE)) {
                    fVar.l();
                    ByteBuffer byteBuffer = fVar.f18002d;
                    int i10 = x.f15050a;
                    if (byteBuffer.remaining() != 16) {
                        fArr = null;
                    } else {
                        byte[] array = byteBuffer.array();
                        int limit = byteBuffer.limit();
                        p pVar = this.f41155p;
                        pVar.D(limit, array);
                        pVar.F(byteBuffer.arrayOffset() + 4);
                        float[] fArr2 = new float[3];
                        for (int i11 = 0; i11 < 3; i11++) {
                            fArr2[i11] = Float.intBitsToFloat(pVar.i());
                        }
                        fArr = fArr2;
                    }
                    if (fArr != null) {
                        this.f41157r.a(this.f41158s - this.f41156q, fArr);
                    }
                }
            } else {
                return;
            }
        }
    }
}
