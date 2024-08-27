package k5;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* loaded from: classes.dex */
public final class f extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f22090a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f22091b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f22092c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.f22092c = gVar;
        this.f22090a = contentResolver;
        this.f22091b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        g gVar = this.f22092c;
        g.a(gVar, c.b(gVar.f22099a));
    }
}
