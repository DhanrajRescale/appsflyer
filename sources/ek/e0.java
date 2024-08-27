package ek;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* loaded from: classes.dex */
public final class e0 implements w {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f15583a;

    /* renamed from: b, reason: collision with root package name */
    public final w f15584b;

    public /* synthetic */ e0(w wVar, int i10) {
        this.f15583a = i10;
        this.f15584b = wVar;
    }

    @Override // ek.w
    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        switch (this.f15583a) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override // ek.w
    public final v b(Object obj, int i10, int i11, xj.k kVar) {
        Uri uri;
        int i12 = this.f15583a;
        w wVar = this.f15584b;
        switch (i12) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uri = null;
                } else if (str.charAt(0) == '/') {
                    uri = Uri.fromFile(new File(str));
                } else {
                    Uri parse = Uri.parse(str);
                    if (parse.getScheme() == null) {
                        uri = Uri.fromFile(new File(str));
                    } else {
                        uri = parse;
                    }
                }
                if (uri == null || !wVar.a(uri)) {
                    return null;
                }
                return wVar.b(uri, i10, i11, kVar);
            default:
                return wVar.b(new l((URL) obj), i10, i11, kVar);
        }
    }
}
