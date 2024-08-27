package um;

import java.util.List;
import okhttp3.HttpUrl;

/* loaded from: classes2.dex */
public final class n extends h {
    public final float A;
    public final float B;
    public final float C;
    public final boolean D;

    /* renamed from: u, reason: collision with root package name */
    public float f37283u;

    /* renamed from: v, reason: collision with root package name */
    public float f37284v;

    /* renamed from: w, reason: collision with root package name */
    public final int f37285w;

    /* renamed from: x, reason: collision with root package name */
    public final int f37286x;

    /* renamed from: y, reason: collision with root package name */
    public final int f37287y;

    /* renamed from: z, reason: collision with root package name */
    public final float f37288z;

    public n(List list) {
        super(list, HttpUrl.FRAGMENT_ENCODE_SET);
        this.f37283u = s0.g.f34069a;
        this.f37284v = 18.0f;
        this.f37285w = 1;
        this.f37286x = 1;
        this.f37287y = -16777216;
        this.f37288z = 1.0f;
        this.A = 75.0f;
        this.B = 0.3f;
        this.C = 0.4f;
        this.D = true;
    }

    @Override // um.h
    public final void a(i iVar) {
        o oVar = (o) iVar;
        if (oVar != null) {
            d(oVar);
        }
    }
}
