package s8;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.io.File;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class a implements f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f34315a;

    public /* synthetic */ a(int i10) {
        this.f34315a = i10;
    }

    @Override // s8.f
    public final g a(Object obj, y8.m mVar, n8.i iVar) {
        switch (this.f34315a) {
            case 0:
                return b((Uri) obj, mVar);
            case 1:
                return new c((Bitmap) obj, mVar, 0);
            case 2:
                return new c((ByteBuffer) obj, mVar, 1);
            case 3:
                return b((Uri) obj, mVar);
            case 4:
                return new c((Drawable) obj, mVar, 2);
            case 5:
                return new h((File) obj);
            default:
                return b((Uri) obj, mVar);
        }
    }

    public final g b(Uri uri, y8.m mVar) {
        switch (this.f34315a) {
            case 0:
                if (!d9.e.d(uri)) {
                    return null;
                }
                return new b(uri, mVar, 0);
            case 3:
                if (!Intrinsics.a(uri.getScheme(), "content")) {
                    return null;
                }
                return new b(uri, mVar, 1);
            default:
                if (!Intrinsics.a(uri.getScheme(), "android.resource")) {
                    return null;
                }
                return new m(uri, mVar);
        }
    }
}
