package vq;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.perf.config.RemoteConfigManager;

/* loaded from: classes2.dex */
public final /* synthetic */ class x implements OnSuccessListener, OnFailureListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RemoteConfigManager f38278a;

    public /* synthetic */ x(RemoteConfigManager remoteConfigManager) {
        this.f38278a = remoteConfigManager;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        RemoteConfigManager.b(this.f38278a, exc);
    }

    @Override // com.google.android.gms.tasks.OnSuccessListener
    public final void onSuccess(Object obj) {
        RemoteConfigManager.a(this.f38278a, (Boolean) obj);
    }
}
