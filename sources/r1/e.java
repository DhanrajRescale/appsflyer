package r1;

import java.util.ArrayList;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f32876a;

    /* renamed from: b, reason: collision with root package name */
    public final float f32877b;

    /* renamed from: c, reason: collision with root package name */
    public final float f32878c;

    /* renamed from: d, reason: collision with root package name */
    public final float f32879d;

    /* renamed from: e, reason: collision with root package name */
    public final float f32880e;

    /* renamed from: f, reason: collision with root package name */
    public final long f32881f;

    /* renamed from: g, reason: collision with root package name */
    public final int f32882g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f32883h;

    /* renamed from: i, reason: collision with root package name */
    public final ArrayList f32884i;

    /* renamed from: j, reason: collision with root package name */
    public final d f32885j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f32886k;

    public e(String str, float f10, float f11, float f12, float f13, long j10, int i10, boolean z10, int i11) {
        String str2;
        long j11;
        int i12;
        boolean z11;
        if ((i11 & 1) != 0) {
            str2 = HttpUrl.FRAGMENT_ENCODE_SET;
        } else {
            str2 = str;
        }
        if ((i11 & 32) != 0) {
            j11 = n1.t.f28177i;
        } else {
            j11 = j10;
        }
        if ((i11 & 64) != 0) {
            i12 = 5;
        } else {
            i12 = i10;
        }
        if ((i11 & 128) != 0) {
            z11 = false;
        } else {
            z11 = z10;
        }
        this.f32876a = str2;
        this.f32877b = f10;
        this.f32878c = f11;
        this.f32879d = f12;
        this.f32880e = f13;
        this.f32881f = j11;
        this.f32882g = i12;
        this.f32883h = z11;
        ArrayList arrayList = new ArrayList();
        this.f32884i = arrayList;
        d dVar = new d(null, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, s0.g.f34069a, null, 1023);
        this.f32885j = dVar;
        arrayList.add(dVar);
    }

    public final f a() {
        b();
        while (true) {
            ArrayList arrayList = this.f32884i;
            if (arrayList.size() > 1) {
                b();
                d dVar = (d) arrayList.remove(arrayList.size() - 1);
                ((d) jr.h.l(arrayList, 1)).f32873j.add(new g0(dVar.f32864a, dVar.f32865b, dVar.f32866c, dVar.f32867d, dVar.f32868e, dVar.f32869f, dVar.f32870g, dVar.f32871h, dVar.f32872i, dVar.f32873j));
            } else {
                String str = this.f32876a;
                float f10 = this.f32877b;
                float f11 = this.f32878c;
                float f12 = this.f32879d;
                float f13 = this.f32880e;
                d dVar2 = this.f32885j;
                f fVar = new f(str, f10, f11, f12, f13, new g0(dVar2.f32864a, dVar2.f32865b, dVar2.f32866c, dVar2.f32867d, dVar2.f32868e, dVar2.f32869f, dVar2.f32870g, dVar2.f32871h, dVar2.f32872i, dVar2.f32873j), this.f32881f, this.f32882g, this.f32883h);
                this.f32886k = true;
                return fVar;
            }
        }
    }

    public final void b() {
        if (!this.f32886k) {
            return;
        }
        t0.t.C0("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        throw null;
    }
}
