package aq;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.internal.p002firebaseauthapi.zzaag;
import com.google.android.gms.tasks.TaskCompletionSource;
import h.r0;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class k extends BroadcastReceiver {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f2739a;

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f2740b;

    public k(Activity activity, TaskCompletionSource taskCompletionSource) {
        this.f2739a = new WeakReference(activity);
        this.f2740b = taskCompletionSource;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        Activity activity = (Activity) this.f2739a.get();
        TaskCompletionSource taskCompletionSource = this.f2740b;
        if (activity == null) {
            Log.e("FederatedAuthReceiver", "Failed to unregister BroadcastReceiver because the Activity that launched this flow has been garbage collected; please do not finish() your Activity while performing a FederatedAuthProvider operation.");
            taskCompletionSource.setException(zzaag.zza(new Status(17499, "Activity that started the web operation is no longer alive; see logcat for details")));
            r0.i(context);
            return;
        }
        if (intent.hasExtra("com.google.firebase.auth.internal.OPERATION")) {
            String stringExtra = intent.getStringExtra("com.google.firebase.auth.internal.OPERATION");
            if ("com.google.firebase.auth.internal.ACTION_SHOW_RECAPTCHA".equals(stringExtra)) {
                taskCompletionSource.setResult(intent.getStringExtra("com.google.firebase.auth.internal.RECAPTCHA_TOKEN"));
                r0.i(context);
                return;
            } else {
                taskCompletionSource.setException(zzaag.zza(lp.g0.p("WEB_CONTEXT_CANCELED:Unknown operation received (" + stringExtra + ")")));
                return;
            }
        }
        HashMap hashMap = u.f2757a;
        Preconditions.checkNotNull(intent);
        if (intent.hasExtra("com.google.firebase.auth.internal.STATUS")) {
            Preconditions.checkNotNull(intent);
            Preconditions.checkNotNull(intent);
            Preconditions.checkArgument(intent.hasExtra("com.google.firebase.auth.internal.STATUS"));
            taskCompletionSource.setException(zzaag.zza((Status) SafeParcelableSerializer.deserializeFromIntentExtra(intent, "com.google.firebase.auth.internal.STATUS", Status.CREATOR)));
            r0.i(context);
            return;
        }
        if (intent.hasExtra("com.google.firebase.auth.internal.EXTRA_CANCELED")) {
            taskCompletionSource.setException(zzaag.zza(lp.g0.p("WEB_CONTEXT_CANCELED")));
            r0.i(context);
        }
    }
}
