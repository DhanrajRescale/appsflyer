package ek;

import android.content.Context;
import android.net.Uri;

/* loaded from: classes.dex */
public final class s implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15620a;

    /* renamed from: b, reason: collision with root package name */
    public final Context f15621b;

    public s(Context context, int i10) {
        this.f15620a = i10;
        if (i10 != 1) {
            if (i10 != 2) {
                this.f15621b = context;
                return;
            } else {
                this.f15621b = context.getApplicationContext();
                return;
            }
        }
        this.f15621b = context.getApplicationContext();
    }

    @Override // ek.w
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        switch (this.f15620a) {
            case 0:
                return d((Uri) obj);
            case 1:
                return d((Uri) obj);
            default:
                return d((Uri) obj);
        }
    }

    @Override // ek.w
    public final /* bridge */ /* synthetic */ v b(Object obj, int i10, int i11, xj.k kVar) {
        switch (this.f15620a) {
            case 0:
                return c((Uri) obj, i10, i11, kVar);
            case 1:
                return c((Uri) obj, i10, i11, kVar);
            default:
                return c((Uri) obj, i10, i11, kVar);
        }
    }

    public final v c(Uri uri, int i10, int i11, xj.k kVar) {
        Long l10;
        int i12 = this.f15620a;
        Context context = this.f15621b;
        switch (i12) {
            case 0:
                return new v(new qk.b(uri), new r(context, uri));
            case 1:
                if (i10 == Integer.MIN_VALUE || i11 == Integer.MIN_VALUE || i10 > 512 || i11 > 384) {
                    return null;
                }
                return new v(new qk.b(uri), new zj.c(uri, new zj.e(com.bumptech.glide.b.b(context).f10781d.i(), new zj.a(context.getContentResolver()), com.bumptech.glide.b.b(context).f10782e, context.getContentResolver())));
            default:
                if (i10 == Integer.MIN_VALUE || i11 == Integer.MIN_VALUE || i10 > 512 || i11 > 384 || (l10 = (Long) kVar.c(hk.e0.f18528d)) == null || l10.longValue() != -1) {
                    return null;
                }
                return new v(new qk.b(uri), new zj.c(uri, new zj.e(com.bumptech.glide.b.b(context).f10781d.i(), new zj.b(context.getContentResolver()), com.bumptech.glide.b.b(context).f10782e, context.getContentResolver())));
        }
    }

    public final boolean d(Uri uri) {
        switch (this.f15620a) {
            case 0:
                return el.l.r0(uri);
            case 1:
                if (!el.l.r0(uri) || uri.getPathSegments().contains("video")) {
                    return false;
                }
                return true;
            default:
                if (!el.l.r0(uri) || !uri.getPathSegments().contains("video")) {
                    return false;
                }
                return true;
        }
    }
}
