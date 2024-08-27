package y8;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Headers;

/* loaded from: classes.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final Context f41389a;

    /* renamed from: b, reason: collision with root package name */
    public final Bitmap.Config f41390b;

    /* renamed from: c, reason: collision with root package name */
    public final ColorSpace f41391c;

    /* renamed from: d, reason: collision with root package name */
    public final z8.g f41392d;

    /* renamed from: e, reason: collision with root package name */
    public final z8.f f41393e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f41394f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f41395g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f41396h;

    /* renamed from: i, reason: collision with root package name */
    public final String f41397i;

    /* renamed from: j, reason: collision with root package name */
    public final Headers f41398j;

    /* renamed from: k, reason: collision with root package name */
    public final q f41399k;

    /* renamed from: l, reason: collision with root package name */
    public final n f41400l;

    /* renamed from: m, reason: collision with root package name */
    public final b f41401m;

    /* renamed from: n, reason: collision with root package name */
    public final b f41402n;

    /* renamed from: o, reason: collision with root package name */
    public final b f41403o;

    public m(Context context, Bitmap.Config config, ColorSpace colorSpace, z8.g gVar, z8.f fVar, boolean z10, boolean z11, boolean z12, String str, Headers headers, q qVar, n nVar, b bVar, b bVar2, b bVar3) {
        this.f41389a = context;
        this.f41390b = config;
        this.f41391c = colorSpace;
        this.f41392d = gVar;
        this.f41393e = fVar;
        this.f41394f = z10;
        this.f41395g = z11;
        this.f41396h = z12;
        this.f41397i = str;
        this.f41398j = headers;
        this.f41399k = qVar;
        this.f41400l = nVar;
        this.f41401m = bVar;
        this.f41402n = bVar2;
        this.f41403o = bVar3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (Intrinsics.a(this.f41389a, mVar.f41389a) && this.f41390b == mVar.f41390b && ((Build.VERSION.SDK_INT < 26 || Intrinsics.a(this.f41391c, mVar.f41391c)) && Intrinsics.a(this.f41392d, mVar.f41392d) && this.f41393e == mVar.f41393e && this.f41394f == mVar.f41394f && this.f41395g == mVar.f41395g && this.f41396h == mVar.f41396h && Intrinsics.a(this.f41397i, mVar.f41397i) && Intrinsics.a(this.f41398j, mVar.f41398j) && Intrinsics.a(this.f41399k, mVar.f41399k) && Intrinsics.a(this.f41400l, mVar.f41400l) && this.f41401m == mVar.f41401m && this.f41402n == mVar.f41402n && this.f41403o == mVar.f41403o)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f41390b.hashCode() + (this.f41389a.hashCode() * 31)) * 31;
        int i11 = 0;
        ColorSpace colorSpace = this.f41391c;
        if (colorSpace != null) {
            i10 = colorSpace.hashCode();
        } else {
            i10 = 0;
        }
        int d10 = v.e.d(this.f41396h, v.e.d(this.f41395g, v.e.d(this.f41394f, (this.f41393e.hashCode() + ((this.f41392d.hashCode() + ((hashCode + i10) * 31)) * 31)) * 31, 31), 31), 31);
        String str = this.f41397i;
        if (str != null) {
            i11 = str.hashCode();
        }
        return this.f41403o.hashCode() + ((this.f41402n.hashCode() + ((this.f41401m.hashCode() + ((this.f41400l.f41405a.hashCode() + ((this.f41399k.f41414a.hashCode() + ((this.f41398j.hashCode() + ((d10 + i11) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
