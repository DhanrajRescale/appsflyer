package q;

import android.app.Notification;
import android.os.Build;
import android.os.Parcelable;
import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes.dex */
public final class b implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f31439a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f31440b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Parcelable f31441c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f31442d;

    public b(SystemForegroundService systemForegroundService, int i10, Notification notification, int i11) {
        this.f31442d = systemForegroundService;
        this.f31439a = i10;
        this.f31441c = notification;
        this.f31440b = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = Build.VERSION.SDK_INT;
        Object obj = this.f31442d;
        Parcelable parcelable = this.f31441c;
        int i11 = this.f31439a;
        if (i10 >= 29) {
            ((SystemForegroundService) obj).startForeground(i11, (Notification) parcelable, this.f31440b);
        } else {
            ((SystemForegroundService) obj).startForeground(i11, (Notification) parcelable);
        }
    }
}
