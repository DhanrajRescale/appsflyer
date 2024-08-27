package jv;

import com.google.android.gms.auth.api.credentials.CredentialsApi;

/* loaded from: classes2.dex */
public final class l extends i {

    /* renamed from: i, reason: collision with root package name */
    public static final hv.f f21701i = hv.f.A(CredentialsApi.CREDENTIAL_PICKER_REQUEST_CODE, 1, 1);

    /* renamed from: g, reason: collision with root package name */
    public final int f21702g;

    /* renamed from: h, reason: collision with root package name */
    public final iv.a f21703h;

    public l(lv.m mVar, int i10, int i11, int i12, iv.a aVar, int i13) {
        super(mVar, i10, i11, 4, i13);
        this.f21702g = i12;
        this.f21703h = aVar;
    }

    @Override // jv.i
    public final long b(e5.o oVar, long j10) {
        int i10;
        long abs = Math.abs(j10);
        iv.a aVar = this.f21703h;
        if (aVar != null) {
            ((iv.f) iv.e.a((lv.k) oVar.f15030c)).getClass();
            i10 = hv.f.p(aVar).k(this.f21689a);
        } else {
            i10 = this.f21702g;
        }
        long j11 = i10;
        int[] iArr = i.f21688f;
        if (j10 >= j11) {
            int i11 = iArr[this.f21690b];
            if (j10 < i10 + i11) {
                return abs % i11;
            }
        }
        return abs % iArr[this.f21691c];
    }

    @Override // jv.i
    public final i c() {
        if (this.f21693e == -1) {
            return this;
        }
        return new l(this.f21689a, this.f21690b, this.f21691c, this.f21702g, this.f21703h, -1);
    }

    @Override // jv.i
    public final i d(int i10) {
        return new l(this.f21689a, this.f21690b, this.f21691c, this.f21702g, this.f21703h, this.f21693e + i10);
    }

    @Override // jv.i
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ReducedValue(");
        sb2.append(this.f21689a);
        sb2.append(",");
        sb2.append(this.f21690b);
        sb2.append(",");
        sb2.append(this.f21691c);
        sb2.append(",");
        Object obj = this.f21703h;
        if (obj == null) {
            obj = Integer.valueOf(this.f21702g);
        }
        sb2.append(obj);
        sb2.append(")");
        return sb2.toString();
    }

    public l(lv.m mVar, hv.f fVar) {
        super(mVar, 2, 2, 4);
        if (fVar == null) {
            long j10 = 0;
            if (!mVar.d().c(j10)) {
                throw new IllegalArgumentException("The base value must be within the range of the field");
            }
            if (j10 + i.f21688f[2] > 2147483647L) {
                throw new RuntimeException("Unable to add printer-parser as the range exceeds the capacity of an int");
            }
        }
        this.f21702g = 0;
        this.f21703h = fVar;
    }
}
