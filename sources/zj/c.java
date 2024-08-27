package zj;

import android.net.Uri;
import android.util.Log;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes.dex */
public final class c implements yj.e {

    /* renamed from: a, reason: collision with root package name */
    public final Uri f42532a;

    /* renamed from: b, reason: collision with root package name */
    public final e f42533b;

    /* renamed from: c, reason: collision with root package name */
    public InputStream f42534c;

    public c(Uri uri, e eVar) {
        this.f42532a = uri;
        this.f42533b = eVar;
    }

    @Override // yj.e
    public final Class a() {
        return InputStream.class;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x002a, code lost:
    
        if (r6 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x004b, code lost:
    
        if (r6 != null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x002c, code lost:
    
        r6.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002f, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 6, insn: 0x0025: MOVE (r5 I:??[OBJECT, ARRAY]) = (r6 I:??[OBJECT, ARRAY]) (LINE:38), block:B:68:0x0025 */
    /* JADX WARN: Removed duplicated region for block: B:13:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00e7  */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Throwable, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.io.InputStream b() {
        /*
            Method dump skipped, instructions count: 235
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: zj.c.b():java.io.InputStream");
    }

    @Override // yj.e
    public final void c() {
        InputStream inputStream = this.f42534c;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException unused) {
            }
        }
    }

    @Override // yj.e
    public final void cancel() {
    }

    @Override // yj.e
    public final void d(com.bumptech.glide.e eVar, yj.d dVar) {
        try {
            InputStream b10 = b();
            this.f42534c = b10;
            dVar.j(b10);
        } catch (FileNotFoundException e10) {
            if (Log.isLoggable("MediaStoreThumbFetcher", 3)) {
                Log.d("MediaStoreThumbFetcher", "Failed to find thumbnail file", e10);
            }
            dVar.e(e10);
        }
    }

    @Override // yj.e
    public final xj.a f() {
        return xj.a.f40286a;
    }
}
