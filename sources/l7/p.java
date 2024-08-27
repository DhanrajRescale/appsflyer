package l7;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;

/* loaded from: classes.dex */
public final class p extends RemoteCallbackList {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f24144a;

    public p(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f24144a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        this.f24144a.f2439b.remove(Integer.valueOf(((Integer) obj).intValue()));
    }
}
