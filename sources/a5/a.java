package a5;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import com.airbnb.deeplinkdispatch.UrlTreeKt;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final IntentFilter f169a;

    /* renamed from: b, reason: collision with root package name */
    public final BroadcastReceiver f170b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f171c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f172d;

    public a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.f169a = intentFilter;
        this.f170b = broadcastReceiver;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("Receiver{");
        sb2.append(this.f170b);
        sb2.append(" filter=");
        sb2.append(this.f169a);
        if (this.f172d) {
            sb2.append(" DEAD");
        }
        sb2.append(UrlTreeKt.componentParamSuffix);
        return sb2.toString();
    }
}
