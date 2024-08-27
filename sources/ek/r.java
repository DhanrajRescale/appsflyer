package ek;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.io.FileNotFoundException;

/* loaded from: classes.dex */
public final class r implements yj.e {

    /* renamed from: c, reason: collision with root package name */
    public static final String[] f15617c = {"_data"};

    /* renamed from: a, reason: collision with root package name */
    public final Context f15618a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f15619b;

    public r(Context context, Uri uri) {
        this.f15618a = context;
        this.f15619b = uri;
    }

    @Override // yj.e
    public final Class a() {
        return File.class;
    }

    @Override // yj.e
    public final void c() {
    }

    @Override // yj.e
    public final void cancel() {
    }

    @Override // yj.e
    public final void d(com.bumptech.glide.e eVar, yj.d dVar) {
        Cursor query = this.f15618a.getContentResolver().query(this.f15619b, f15617c, null, null, null);
        String str = null;
        if (query != null) {
            try {
                if (query.moveToFirst()) {
                    str = query.getString(query.getColumnIndexOrThrow("_data"));
                }
            } finally {
                query.close();
            }
        }
        if (TextUtils.isEmpty(str)) {
            dVar.e(new FileNotFoundException("Failed to find file path for: " + this.f15619b));
            return;
        }
        dVar.j(new File(str));
    }

    @Override // yj.e
    public final xj.a f() {
        return xj.a.f40286a;
    }
}
