package ek;

import android.content.res.AssetManager;
import android.net.Uri;

/* loaded from: classes.dex */
public final class b implements w {

    /* renamed from: a, reason: collision with root package name */
    public final AssetManager f15567a;

    /* renamed from: b, reason: collision with root package name */
    public final a f15568b;

    public b(AssetManager assetManager, a aVar) {
        this.f15567a = assetManager;
        this.f15568b = aVar;
    }

    @Override // ek.w
    public final boolean a(Object obj) {
        Uri uri = (Uri) obj;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    @Override // ek.w
    public final v b(Object obj, int i10, int i11, xj.k kVar) {
        Uri uri = (Uri) obj;
        return new v(new qk.b(uri), this.f15568b.y(this.f15567a, uri.toString().substring(22)));
    }
}
