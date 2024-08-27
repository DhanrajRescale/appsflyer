package d2;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import kotlin.Unit;

/* loaded from: classes.dex */
public final class d4 extends ContentObserver {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13405a = 1;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f13406b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(su.c cVar, Handler handler) {
        super(handler);
        this.f13406b = cVar;
    }

    @Override // android.database.ContentObserver
    public final boolean deliverSelfNotifications() {
        switch (this.f13405a) {
            case 1:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10, Uri uri) {
        switch (this.f13405a) {
            case 0:
                ((su.g) this.f13406b).o(Unit.f23355a);
                return;
            default:
                super.onChange(z10, uri);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d4(i4.a aVar) {
        super(new Handler());
        this.f13406b = aVar;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z10) {
        Cursor cursor;
        switch (this.f13405a) {
            case 1:
                i4.a aVar = (i4.a) this.f13406b;
                if (!aVar.f19335b || (cursor = aVar.f19336c) == null || cursor.isClosed()) {
                    return;
                }
                aVar.f19334a = aVar.f19336c.requery();
                return;
            default:
                super.onChange(z10);
                return;
        }
    }
}
