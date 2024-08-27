package d9;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.webkit.MimeTypeMap;
import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import vt.g0;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Bitmap.Config[] f14221a;

    /* renamed from: b, reason: collision with root package name */
    public static final Bitmap.Config f14222b;

    /* renamed from: c, reason: collision with root package name */
    public static final Headers f14223c;

    static {
        Bitmap.Config[] configArr;
        Bitmap.Config config;
        Bitmap.Config config2;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            config2 = Bitmap.Config.RGBA_F16;
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888, config2};
        } else {
            configArr = new Bitmap.Config[]{Bitmap.Config.ARGB_8888};
        }
        f14221a = configArr;
        if (i10 >= 26) {
            config = Bitmap.Config.HARDWARE;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        f14222b = config;
        f14223c = new Headers.Builder().build();
    }

    public static final void a(Closeable closeable) {
        try {
            closeable.close();
        } catch (RuntimeException e10) {
            throw e10;
        } catch (Exception unused) {
        }
    }

    public static final String b(MimeTypeMap mimeTypeMap, String str) {
        if (str != null && !w.C(str)) {
            String W = w.W(w.W(str, '#'), '?');
            return mimeTypeMap.getMimeTypeFromExtension(w.T('.', w.T('/', W, W), HttpUrl.FRAGMENT_ENCODE_SET));
        }
        return null;
    }

    public static final File c(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir != null) {
            cacheDir.mkdirs();
            return cacheDir;
        }
        throw new IllegalStateException("cacheDir == null".toString());
    }

    public static final boolean d(Uri uri) {
        if (Intrinsics.a(uri.getScheme(), "file") && Intrinsics.a((String) g0.w(uri.getPathSegments()), "android_asset")) {
            return true;
        }
        return false;
    }

    public static final int e(al.d dVar, z8.f fVar) {
        if (dVar instanceof z8.a) {
            return ((z8.a) dVar).f42175b;
        }
        int ordinal = fVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return Api.BaseClientBuilder.API_PRIORITY_OTHER;
            }
            throw new NoWhenBranchMatchedException();
        }
        return Integer.MIN_VALUE;
    }
}
