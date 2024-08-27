package mj;

import android.util.Log;
import ir.f;
import jr.d;
import jr.j;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;
import pp.g;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public long f27810a;

    public static String a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        ir.b a10 = ((f) g.d().b(f.class)).a("firebase");
        Intrinsics.checkNotNullExpressionValue(a10, "getInstance(...)");
        j jVar = a10.f20505h;
        d dVar = jVar.f21620c;
        String d10 = j.d(dVar, key);
        if (d10 != null) {
            jVar.a(j.b(dVar), key);
        } else {
            d10 = j.d(jVar.f21621d, key);
            if (d10 == null) {
                Log.w("FirebaseRemoteConfig", String.format("No value of type '%s' exists for parameter key '%s'.", "String", key));
                d10 = HttpUrl.FRAGMENT_ENCODE_SET;
            }
        }
        Intrinsics.checkNotNullExpressionValue(d10, "getString(...)");
        return d10;
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce A[Catch: IOException -> 0x0057, XmlPullParserException -> 0x005a, TryCatch #3 {IOException -> 0x0057, XmlPullParserException -> 0x005a, blocks: (B:5:0x004a, B:7:0x0050, B:17:0x005d, B:21:0x0070, B:23:0x00d2, B:26:0x0079, B:30:0x0089, B:32:0x008d, B:38:0x009b, B:46:0x00c3, B:48:0x00c9, B:50:0x00ce, B:52:0x00aa, B:55:0x00b4), top: B:4:0x004a }] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, mn.f] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void b() {
        /*
            Method dump skipped, instructions count: 301
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: mj.b.b():void");
    }
}
