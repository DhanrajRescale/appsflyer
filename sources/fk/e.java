package fk;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import ek.v;
import ek.w;
import el.l;
import xj.k;

/* loaded from: classes.dex */
public final class e implements w {

    /* renamed from: a, reason: collision with root package name */
    public final Context f16158a;

    /* renamed from: b, reason: collision with root package name */
    public final w f16159b;

    /* renamed from: c, reason: collision with root package name */
    public final w f16160c;

    /* renamed from: d, reason: collision with root package name */
    public final Class f16161d;

    public e(Context context, w wVar, w wVar2, Class cls) {
        this.f16158a = context.getApplicationContext();
        this.f16159b = wVar;
        this.f16160c = wVar2;
        this.f16161d = cls;
    }

    @Override // ek.w
    public final boolean a(Object obj) {
        Uri uri = (Uri) obj;
        if (Build.VERSION.SDK_INT >= 29 && l.r0(uri)) {
            return true;
        }
        return false;
    }

    @Override // ek.w
    public final v b(Object obj, int i10, int i11, k kVar) {
        Uri uri = (Uri) obj;
        return new v(new qk.b(uri), new d(this.f16158a, this.f16159b, this.f16160c, uri, i10, i11, kVar, this.f16161d));
    }
}
