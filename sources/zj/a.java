package zj;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f42528b = {"_data"};

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f42529a;

    public a(ContentResolver contentResolver) {
        this.f42529a = contentResolver;
    }

    @Override // zj.d
    public final Cursor a(Uri uri) {
        return this.f42529a.query(MediaStore.Images.Thumbnails.EXTERNAL_CONTENT_URI, f42528b, "kind = 1 AND image_id = ?", new String[]{uri.getLastPathSegment()}, null);
    }
}
