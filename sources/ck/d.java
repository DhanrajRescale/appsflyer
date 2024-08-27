package ck;

import android.content.Context;
import java.io.File;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f8192a = 262144000;

    /* renamed from: b, reason: collision with root package name */
    public final da.d f8193b;

    public d(da.d dVar) {
        this.f8193b = dVar;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, vj.d] */
    public final vj.d a() {
        da.d dVar = this.f8193b;
        File cacheDir = ((Context) dVar.f14276b).getCacheDir();
        if (cacheDir == null) {
            cacheDir = null;
        } else if (((String) dVar.f14277c) != null) {
            cacheDir = new File(cacheDir, (String) dVar.f14277c);
        }
        if (cacheDir == null) {
            return null;
        }
        if (!cacheDir.mkdirs() && (!cacheDir.exists() || !cacheDir.isDirectory())) {
            return null;
        }
        ?? obj = new Object();
        obj.f38121e = new da.d(10);
        obj.f38120d = cacheDir;
        obj.f38117a = this.f8192a;
        obj.f38119c = new da.d(12);
        return obj;
    }
}
