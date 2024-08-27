package fk;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.text.TextUtils;
import ek.v;
import ek.w;
import java.io.File;
import java.io.FileNotFoundException;
import xj.k;

/* loaded from: classes.dex */
public final class d implements yj.e {

    /* renamed from: k, reason: collision with root package name */
    public static final String[] f16147k = {"_data"};

    /* renamed from: a, reason: collision with root package name */
    public final Context f16148a;

    /* renamed from: b, reason: collision with root package name */
    public final w f16149b;

    /* renamed from: c, reason: collision with root package name */
    public final w f16150c;

    /* renamed from: d, reason: collision with root package name */
    public final Uri f16151d;

    /* renamed from: e, reason: collision with root package name */
    public final int f16152e;

    /* renamed from: f, reason: collision with root package name */
    public final int f16153f;

    /* renamed from: g, reason: collision with root package name */
    public final k f16154g;

    /* renamed from: h, reason: collision with root package name */
    public final Class f16155h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f16156i;

    /* renamed from: j, reason: collision with root package name */
    public volatile yj.e f16157j;

    public d(Context context, w wVar, w wVar2, Uri uri, int i10, int i11, k kVar, Class cls) {
        this.f16148a = context.getApplicationContext();
        this.f16149b = wVar;
        this.f16150c = wVar2;
        this.f16151d = uri;
        this.f16152e = i10;
        this.f16153f = i11;
        this.f16154g = kVar;
        this.f16155h = cls;
    }

    @Override // yj.e
    public final Class a() {
        return this.f16155h;
    }

    public final yj.e b() {
        boolean isExternalStorageLegacy;
        v b10;
        isExternalStorageLegacy = Environment.isExternalStorageLegacy();
        Cursor cursor = null;
        k kVar = this.f16154g;
        int i10 = this.f16153f;
        int i11 = this.f16152e;
        Context context = this.f16148a;
        if (isExternalStorageLegacy) {
            Uri uri = this.f16151d;
            try {
                Cursor query = context.getContentResolver().query(uri, f16147k, null, null, null);
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            String string = query.getString(query.getColumnIndexOrThrow("_data"));
                            if (!TextUtils.isEmpty(string)) {
                                File file = new File(string);
                                query.close();
                                b10 = this.f16149b.b(file, i11, i10, kVar);
                            } else {
                                throw new FileNotFoundException("File path was empty in media store for: " + uri);
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = query;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                }
                throw new FileNotFoundException("Failed to media store entry for: " + uri);
            } catch (Throwable th3) {
                th = th3;
            }
        } else {
            int checkSelfPermission = context.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION");
            Uri uri2 = this.f16151d;
            if (checkSelfPermission == 0) {
                uri2 = MediaStore.setRequireOriginal(uri2);
            }
            b10 = this.f16150c.b(uri2, i11, i10, kVar);
        }
        if (b10 == null) {
            return null;
        }
        return b10.f15630c;
    }

    @Override // yj.e
    public final void c() {
        yj.e eVar = this.f16157j;
        if (eVar != null) {
            eVar.c();
        }
    }

    @Override // yj.e
    public final void cancel() {
        this.f16156i = true;
        yj.e eVar = this.f16157j;
        if (eVar != null) {
            eVar.cancel();
        }
    }

    @Override // yj.e
    public final void d(com.bumptech.glide.e eVar, yj.d dVar) {
        try {
            yj.e b10 = b();
            if (b10 == null) {
                dVar.e(new IllegalArgumentException("Failed to build fetcher for: " + this.f16151d));
            } else {
                this.f16157j = b10;
                if (this.f16156i) {
                    cancel();
                } else {
                    b10.d(eVar, dVar);
                }
            }
        } catch (FileNotFoundException e10) {
            dVar.e(e10);
        }
    }

    @Override // yj.e
    public final xj.a f() {
        return xj.a.f40286a;
    }
}
