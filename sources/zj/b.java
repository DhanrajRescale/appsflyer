package zj;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.provider.MediaStore;

/* loaded from: classes.dex */
public final class b implements d {

    /* renamed from: b, reason: collision with root package name */
    public static final String[] f42530b = {"_data"};

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f42531a;

    public b(ContentResolver contentResolver) {
        this.f42531a = contentResolver;
    }

    @Override // zj.d
    public final Cursor a(Uri uri) {
        return this.f42531a.query(MediaStore.Video.Thumbnails.EXTERNAL_CONTENT_URI, f42530b, "kind = 1 AND video_id = ?", new String[]{uri.getLastPathSegment()}, null);
    }
}
