package t9;

import android.content.Context;
import j9.c0;
import j9.o;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.zip.ZipInputStream;
import mt.p;
import okhttp3.HttpUrl;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final c f35634a;

    /* renamed from: b, reason: collision with root package name */
    public final p f35635b;

    public d(c cVar, p pVar) {
        this.f35634a = cVar;
        this.f35635b = pVar;
    }

    public final c0 a(Context context, String str, InputStream inputStream, String str2, String str3) {
        c0 g10;
        c0 c0Var;
        b bVar;
        if (str2 == null) {
            str2 = "application/json";
        }
        boolean contains = str2.contains("application/zip");
        c cVar = this.f35634a;
        if (!contains && !str2.contains("application/x-zip") && !str2.contains("application/x-zip-compressed") && !str.split("\\?")[0].endsWith(".lottie")) {
            w9.b.a();
            bVar = b.JSON;
            if (str3 != null && cVar != null) {
                c0Var = o.c(new FileInputStream(cVar.D(str, inputStream, bVar).getAbsolutePath()), str);
            } else {
                c0Var = o.c(inputStream, null);
            }
        } else {
            w9.b.a();
            b bVar2 = b.ZIP;
            if (str3 != null && cVar != null) {
                g10 = o.g(context, new ZipInputStream(new FileInputStream(cVar.D(str, inputStream, bVar2))), str);
            } else {
                g10 = o.g(context, new ZipInputStream(inputStream), null);
            }
            c0Var = g10;
            bVar = bVar2;
        }
        if (str3 != null && c0Var.f21133a != null && cVar != null) {
            File file = new File(cVar.w(), c.s(str, bVar, true));
            File file2 = new File(file.getAbsolutePath().replace(".temp", HttpUrl.FRAGMENT_ENCODE_SET));
            boolean renameTo = file.renameTo(file2);
            file2.toString();
            w9.b.a();
            if (!renameTo) {
                w9.b.b("Unable to rename cache file " + file.getAbsolutePath() + " to " + file2.getAbsolutePath() + ".");
            }
        }
        return c0Var;
    }
}
