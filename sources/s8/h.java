package s8;

import android.webkit.MimeTypeMap;
import bv.b0;
import bv.q;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.w;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class h implements g {

    /* renamed from: a, reason: collision with root package name */
    public final File f34325a;

    public h(File file) {
        this.f34325a = file;
    }

    @Override // s8.g
    public final Object a(yt.a aVar) {
        String str = b0.f7323b;
        File file = this.f34325a;
        p8.n nVar = new p8.n(gt.d.g(file), q.f7389a, null, null);
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        Intrinsics.checkNotNullParameter(file, "<this>");
        String name = file.getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        return new n(nVar, singleton.getMimeTypeFromExtension(w.T('.', name, HttpUrl.FRAGMENT_ENCODE_SET)), p8.f.f30740c);
    }
}
