package up;

import android.os.Bundle;
import com.google.android.gms.internal.measurement.zzjb;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.android.gms.measurement.internal.zzhb;

/* loaded from: classes2.dex */
public final class c implements AppMeasurementSdk.OnEventListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d f37325a;

    public c(d dVar) {
        this.f37325a = dVar;
    }

    @Override // com.google.android.gms.measurement.api.AppMeasurementSdk.OnEventListener, com.google.android.gms.measurement.internal.zzhf
    public final void onEvent(String str, String str2, Bundle bundle, long j10) {
        d dVar = this.f37325a;
        if (!dVar.f37326a.contains(str2)) {
            return;
        }
        Bundle bundle2 = new Bundle();
        zzjb zzjbVar = b.f37319a;
        String zza = zzhb.zza(str2);
        if (zza != null) {
            str2 = zza;
        }
        bundle2.putString("events", str2);
        dVar.f37327b.onMessageTriggered(2, bundle2);
    }
}
