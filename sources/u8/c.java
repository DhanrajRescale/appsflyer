package u8;

import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import d9.e;
import kotlin.jvm.internal.Intrinsics;
import y8.m;

/* loaded from: classes.dex */
public final class c implements b {
    @Override // u8.b
    public final String a(Object obj, m mVar) {
        Uri uri = (Uri) obj;
        if (Intrinsics.a(uri.getScheme(), "android.resource")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(uri);
            sb2.append('-');
            Configuration configuration = mVar.f41389a.getResources().getConfiguration();
            Bitmap.Config[] configArr = e.f14221a;
            sb2.append(configuration.uiMode & 48);
            return sb2.toString();
        }
        return uri.toString();
    }
}
